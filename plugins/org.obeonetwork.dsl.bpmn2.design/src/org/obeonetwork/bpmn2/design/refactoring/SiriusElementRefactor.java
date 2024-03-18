/**
 * Copyright (c) 2024 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.bpmn2.design.refactoring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.CustomDataConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DNodeListElement;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.DragAndDropTarget;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.diagram.business.internal.sync.DEdgeCandidate;
import org.eclipse.sirius.diagram.business.internal.sync.DNodeCandidate;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.IEdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.ui.internal.refresh.diagram.DDiagramCanonicalSynchronizer;
import org.eclipse.sirius.diagram.ui.part.SiriusDiagramEditor;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.sirius.viewpoint.description.AnnotationEntry;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.bpmn2.design.Activator;

/**
 * Refactor an element into a Sirius Session.
 * <p>
 * This class is generic but only tested for nodes. (no case for edge in BPMN)
 * </p>
 * <p>
 * Simple approach (replacing a Representation target) does not work for
 * diagrams.
 * <ul>
 * <li>Editor contains a map from Semantic element to Representation that is not
 * refreshed on simple change.</li>
 * <li>Unedited diagrams may be impacted and positions are lost.</li>
 * <li>A specific mapping translation may be required.</li>
 * </ul>
 * However, if complex diagram refactoring is required, this class will fail.
 * </p>
 * 
 * @author nperansin
 *
 */
@SuppressWarnings("restriction") // DDiagramElementSynchronizer, DNodeCandidate
public class SiriusElementRefactor {

	private static final EReference DTARGET_FEATURE = ViewpointPackage.eINSTANCE.getDSemanticDecorator_Target();

	private final EObject origin;

	private final Session session;
	private final List<DDiagram> editedDiagrams;

	// Transformation content
	private List<EStructuralFeature.Setting> transferableRefs = new ArrayList<>();
	private List<NodeLayout> nodeLayouts = new ArrayList<>();
	private List<EdgeLayout> edgeLayouts = new ArrayList<>();
	private Map<DSemanticDiagram, DiagramModifier> synchs = new HashMap<>();

	public SiriusElementRefactor(DRepresentationElement context) {
		origin = Objects.requireNonNull(context.getTarget());
		session = Session.of(context).get();

		editedDiagrams = Stream.of(PlatformUI.getWorkbench().getWorkbenchWindows())
				.flatMap(it -> Stream.of(it.getPages())).flatMap(it -> Stream.of(it.getEditorReferences()))
				.map(it -> it.getEditor(false)).filter(this::isApplicableEditor).map(this::toDiagram)
				.filter(Objects::nonNull).collect(Collectors.toList());
	}

	private DDiagram toDiagram(IEditorPart editor) {
		URI repUri = ((SessionEditorInput) editor.getEditorInput()).getRepDescUri();
		EObject rep = session.getTransactionalEditingDomain().getResourceSet().getEObject(repUri, false);

		if (rep instanceof DRepresentationDescriptor) { // regular case
			rep = ((DRepresentationDescriptor) rep).getRepresentation();
		}
		return rep instanceof DDiagram ? (DDiagram) rep : null;
	}

	private boolean isApplicableEditor(IEditorPart it) {
		return session != null && it instanceof SiriusDiagramEditor && it.getEditorInput() instanceof SessionEditorInput
				&& ((SessionEditorInput) it.getEditorInput()).getSession() == session;
	}

	// Open diagram -> listeners requires a proper update
	public EObject transformInto(EClass targetType) {
		EFactory fct = targetType.getEPackage().getEFactoryInstance();
		return replaceWith(fct.create(targetType));
	}

	public <R extends EObject> EObject replaceWith(R target) {
		try {
			copyContent(target);

			EStructuralFeature.Setting containment = analyseReferences(target);

			// Change containment first for all listeners to be triggered.
			replaceReference(containment.getEObject(), containment.getEStructuralFeature(), target);
			for (EStructuralFeature.Setting ref : transferableRefs) {
				if (ref.getEStructuralFeature() == DTARGET_FEATURE && ref.getEObject() instanceof DDiagramElement) {
					replaceDElementTarget((DDiagramElement) ref.getEObject(), target);
				} else {
					replaceReference(ref.getEObject(), ref.getEStructuralFeature(), target);
				}
			}

			// Recreate Views (Do not use refresh to associate old and new representations).
			Set<DSemanticDiagram> toRefresh = new HashSet<>();
			nodeLayouts.forEach(it -> toRefresh.add(createNewNode(target, it)));
			edgeLayouts.forEach(it -> toRefresh.add(createNewEdge(target, it)));

			// Refresh Diagrams to create GMF notation
			toRefresh.forEach(it -> refresh(it));

			// Restore layout nodes
			nodeLayouts.forEach(it -> it.update());

			return target;
		} catch (Exception e) {
			// Capture the exception to add information to the log because the exception is
			// caught silently.
			Activator.log(IStatus.ERROR, "Error during refactoring", e);
			throw e;
		} finally {
			cleanCache();
		}
	}

	/**
	 * Replaces the element target and mapping.
	 * 
	 * @param dElement to update
	 * @param target   new target
	 */
	protected void replaceDElementTarget(DDiagramElement dElement, EObject target) {
		// Update mapping if possible.
		// Otherwise opening refresh will fix diagram but loose gmf node.
		// (There is only so much we can do)
		if (dElement instanceof DEdge) {
			DEdge edge = (DEdge) dElement;
			EdgeMapping newMapping = getApplicableEdgeMapping((IEdgeMapping) edge.getMapping(), target);
			if (newMapping != null) {
				edge.setActualMapping(newMapping);
			}
		} else if (dElement instanceof AbstractDNode) {
			AbstractDNode node = (AbstractDNode) dElement;
			AbstractNodeMapping newMapping = getApplicableNodeMapping((AbstractNodeMapping) node.getMapping(), target);
			updateNodeMapping(node, newMapping);
		}
		dElement.setTarget(target);
	}

	private static void updateNodeMapping(AbstractDNode node, AbstractNodeMapping newMapping) {
		if (node instanceof DNode) {
			if (newMapping instanceof NodeMapping) {
				((DNode) node).setActualMapping((NodeMapping) newMapping);
			}
		} else if (node instanceof DDiagramElementContainer) {
			if (newMapping instanceof ContainerMapping) {
				((DDiagramElementContainer) node).setActualMapping((ContainerMapping) newMapping);
			}
		} else if (node instanceof DNodeListElement) {
			if (newMapping instanceof NodeMapping) {
				((DNodeListElement) node).setActualMapping((NodeMapping) newMapping);
			}
		}
		// If the node keep a improper mapping, it will be flushed in next refresh.
		// (like for a VSM update)
	}

	private void refresh(DSemanticDiagram it) {
		Diagram gmfDiagram = getGMFDiagram(it);
		if (gmfDiagram == null) {
			return;
		}
		// Create proper location
		DDiagramCanonicalSynchronizer gmfSynch = new DDiagramCanonicalSynchronizer(gmfDiagram);
		gmfSynch.storeViewsToArrange(false);

		// Clean diagram and related edges
		DialectManager.INSTANCE.refresh(it, new NullProgressMonitor());

		// Create gmf nodes of new elements. This is performed in pre-commit.
		gmfSynch.synchronize();
	}

	private static Diagram getGMFDiagram(DDiagram it) {
		for (AnnotationEntry anno : it.getOwnedAnnotationEntries()) {
			if (Objects.equals(anno.getSource(), CustomDataConstants.GMF_DIAGRAMS)) {
				return (Diagram) anno.getData();
			}
		}
		return null;
	}

	private DSemanticDiagram createNewNode(EObject target, NodeLayout save) {
		DSemanticDiagram diagram = getAncestor(DSemanticDiagram.class, save.container);
		DiagramModifier sync = synchs.computeIfAbsent(diagram, d -> new DiagramModifier(d, session));

		AbstractNodeMapping targetMapping = getApplicableNodeMapping((AbstractNodeMapping) save.target.getMapping(),
				target);
		if (targetMapping == null) {
			return diagram;
		}
		DNodeCandidate candidate = new DNodeCandidate(targetMapping, target, (DragAndDropTarget) save.container,
				sync.idFactory);

		// Should we keep node order in container ? (Probably not).
		AbstractDNode newDNode = sync.dsync.createNewNode(sync.mmapping, candidate, false);
		postCreateNewNode(newDNode, save.isExternalLabel);
		save.bind(newDNode);
		return diagram;
	}

	protected void postCreateNewNode(AbstractDNode newDNode, boolean isExternalLabel) {
		// Nada
	}

	/**
	 * Returns the mapping expected for a transformed node.
	 * 
	 * @param previous mapping
	 * @param current  transformed target
	 * @return mapping or null if not displayed anymore
	 */
	protected AbstractNodeMapping getApplicableNodeMapping(AbstractNodeMapping previous, EObject current) {
		return previous;
	}

	private DSemanticDiagram createNewEdge(EObject target, EdgeLayout save) {
		DSemanticDiagram diagram = (DSemanticDiagram) save.container;
		DiagramModifier writer = synchs.computeIfAbsent(diagram, d -> new DiagramModifier(d, session));

		EdgeMapping targetMapping = getApplicableEdgeMapping((IEdgeMapping) save.target.getMapping(), target);
		DEdgeCandidate candidate = new DEdgeCandidate(targetMapping, target,
				getAccurateEgdeTarget(save.target.getSourceNode()), getAccurateEgdeTarget(save.target.getTargetNode()),
				writer.idFactory);

		// See
		// org.eclipse.sirius.diagram.business.internal.helper.task.operations.CreateViewTask
		// #createEdgeView(DSemanticDiagram, CreateEdgeView, Session)
		writer.prepareEdges();
		save.bind(writer.dsync.createNewEdge(writer.mmapping, candidate, writer.mappingsToEdgeTargets,
				writer.edgeToMappings, writer.edgeToSemantics));
		return diagram;
	}

	/**
	 * Returns the mapping expected for a transformed edge.
	 * 
	 * @param previous mapping
	 * @param current  transformed target
	 * @return mapping or null if not displayed anymore
	 */
	protected EdgeMapping getApplicableEdgeMapping(IEdgeMapping previous, EObject current) {
		return (EdgeMapping) previous;
	}

	private EdgeTarget getAccurateEgdeTarget(EdgeTarget previous) {
		for (NodeLayout node : nodeLayouts) {
			if (node.target == previous && node.newView != null) {
				return (EdgeTarget) node.newView;
			}
		}
		return previous;
	}

	private void cleanCache() {
		transferableRefs.clear();
		nodeLayouts.clear();
		edgeLayouts.clear();
		synchs.clear();
	}

	private EStructuralFeature.Setting analyseReferences(EObject target) {
		EStructuralFeature.Setting containment = null;

		for (EStructuralFeature.Setting ref : session.getSemanticCrossReferencer().getInverseReferences(origin)) {
			// Refactor
			// - split reference and get relationship
			EStructuralFeature feat = ref.getEStructuralFeature();
			if (feat instanceof EReference && ((EReference) feat).isContainment()) {
				containment = ref;
			} else if (isEditable(ref.getEStructuralFeature())) {
				if (isAssignable(ref.getEStructuralFeature(), target) && shouldRecreateView(ref)) {

					if (DTARGET_FEATURE == ref.getEStructuralFeature()) {
						DDiagramElement dElement = (DDiagramElement) ref.getEObject();
						saveLayoutRepresentation(dElement);
					} // else ignore other reference like 'semanticElements'
				} else {
					transferableRefs.add(ref);
				}
			}
		}
		return containment;
	}

	protected void saveLayoutRepresentation(DDiagramElement dElement) {
		if (dElement instanceof AbstractDNode) {
			nodeLayouts.add(new NodeLayout((AbstractDNode) dElement, session));
		} else if (dElement instanceof DEdge) {
			edgeLayouts.add(new EdgeLayout((DEdge) dElement, session));
		} // else no other cases for diagram
	}

	private boolean shouldRecreateView(EStructuralFeature.Setting ref) {
		if (!(ref.getEObject() instanceof DDiagramElement)) {
			return false;
		}
		DDiagram container = getAncestor(DDiagram.class, ref.getEObject());
		return container != null && editedDiagrams.contains(container);
	}

	private void replaceReference(EObject caller, EStructuralFeature feat, EObject target) {
		if (feat.isMany()) { // remove reference
			@SuppressWarnings("unchecked")
			List<Object> values = ((List<Object>) caller.eGet(feat));
			if (isAssignable(feat, target)) {
				int index = values.indexOf(origin);
				if (index != -1) {
					values.remove(index);
					values.add(index, target);
				}
			} else {
				values.remove(origin);
			}
		} else /* single */ if (isAssignable(feat, target)) {
			caller.eSet(feat, target);
		} else {
			caller.eUnset(feat);
		}
	}

	@SuppressWarnings("unchecked")
	private static <T extends EObject> T getAncestor(Class<T> type, EObject it) {
		return it == null || type.isInstance(it) ? (T) it : getAncestor(type, it.eContainer());
	}

	private void copyContent(EObject target) {
		for (EStructuralFeature feature : origin.eClass().getEAllStructuralFeatures()) {
			if (origin.eIsSet(feature) && isApplicable(feature, target.eClass())
					&& isTransferable(feature, target.eClass())) {
				if (feature.isMany()) {
					List<?> values = (List<?>) origin.eGet(feature);
					@SuppressWarnings("unchecked") // Dirty hack for genericity
					List<Object> targetValues = (List<Object>) target.eGet(feature);
					targetValues.addAll(values);
				} else {
					target.eSet(feature, origin.eGet(feature));
				}
			}
		}
	}

	private boolean isEditable(EStructuralFeature feature) {
		return !feature.isDerived() && !feature.isTransient() && feature.isChangeable();
	}

	private boolean isApplicable(EStructuralFeature feature, EClass targetType) {
		return isEditable(feature) && feature.getEContainingClass().isSuperTypeOf(targetType);
	}

	/**
	 * Evaluates if a feature should be copied to new element.
	 * <p>
	 * Dynamic Id should not be copied for EMF-compare to work.
	 * </p>
	 * 
	 * @param feature    to copy
	 * @param targetType type of element to write in
	 * @return true if transferable
	 */
	protected boolean isTransferable(EStructuralFeature feature, EClass targetType) {
		return true;
	}

	private boolean isAssignable(EStructuralFeature feature, EObject target) {
		return feature.getEType().isInstance(target);
	}

}
