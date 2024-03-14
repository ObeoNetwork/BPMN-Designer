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
package org.obeonetwork.bpmn2.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.Anchor;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.CustomDataConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.util.RefreshIdsHolder;
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
import org.eclipse.sirius.diagram.business.api.componentization.DiagramMappingsManager;
import org.eclipse.sirius.diagram.business.api.componentization.DiagramMappingsManagerRegistry;
import org.eclipse.sirius.diagram.business.internal.helper.decoration.DecorationHelperInternal;
import org.eclipse.sirius.diagram.business.internal.sync.DDiagramElementSynchronizer;
import org.eclipse.sirius.diagram.business.internal.sync.DEdgeCandidate;
import org.eclipse.sirius.diagram.business.internal.sync.DNodeCandidate;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.IEdgeMapping;
import org.eclipse.sirius.diagram.description.MappingBasedDecoration;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.diagram.ui.internal.refresh.diagram.DDiagramCanonicalSynchronizer;
import org.eclipse.sirius.diagram.ui.part.SiriusDiagramEditor;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.eclipse.sirius.tools.api.SiriusPlugin;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.sirius.viewpoint.description.AnnotationEntry;
import org.eclipse.sirius.viewpoint.description.SemanticBasedDecoration;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

/**
 * Refactor an element into a Sirius Session.
 * <p>
 * This class is generic but only tested for nodes. (no case for edge in BPMN)
 * </p>
 * <p>
 * Simple approach (replacing a Representation target) does not work for diagrams.
 * <ul>
 * <li>Editor contains a map from Semantic element to Representation that is not refreshed on simple change.</li>
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
	
	protected abstract class RepresentationLayout<M extends DiagramElementMapping, D extends DDiagramElement> {
		final D target;
		final EObject container; // DDiagram, AbstractDNode{border}, DNodeContainer, DNodeList
		final M mapping;
		D newView;
		
		@SuppressWarnings("unchecked")
		protected RepresentationLayout(D src, EObject parent) {
			target = src;
			this.container = parent;
			mapping = (M) src.getDiagramElementMapping();
		}
		
		protected void bind(D view) {
			newView = view;
		}
		
		protected void update() {
			if (newView != null) {
				update(newView);
			}
		}
		protected abstract void update(D newView);
	}
	
	private static <T extends RepresentationLayout<?, ?>> T findLayout(Collection<T> layouts, DDiagramElement element) {
		return layouts.stream()
			.filter(it -> it.target == element.getTarget()
				&& it.mapping == element.getDiagramElementMapping())
			.findFirst()
			.orElse(null);
	}

	protected class NodeLayout extends RepresentationLayout<AbstractNodeMapping, AbstractDNode> {
		final Bounds bounds;
		final List<NodeLayout> borders;
		final List<EndLayout> outEdges;
		final List<EndLayout> inEdges;
		
		protected NodeLayout(AbstractDNode src) {
			super(src, src.eContainer());
			
			Bounds bounds = null;
			View gmfView = SiriusGMFHelper.getGmfView(src, session);
			if (gmfView instanceof Node) {
				Node node = (Node) gmfView; // gmfNode.get();
				if (node.getLayoutConstraint() instanceof Bounds) {
					bounds = (Bounds) node.getLayoutConstraint();
				}
			}
			this.bounds = bounds;
			// TODO copy style ?

			borders = src.getOwnedBorderedNodes()
				.stream()
				.map(it -> new NodeLayout(it))
				.collect(Collectors.toList());
			
			if (src instanceof EdgeTarget) {
				outEdges = ((EdgeTarget) src).getOutgoingEdges()
						.stream()
						.map(it -> new EndLayout(it, src, true))
						.collect(Collectors.toList());
				inEdges = ((EdgeTarget) src).getIncomingEdges()
						.stream()
						.map(it -> new EndLayout(it, src, false))
						.collect(Collectors.toList());
			} else {
				outEdges = Collections.emptyList();
				inEdges = Collections.emptyList();
			}
		}
		
		@Override
		protected void update(AbstractDNode target) {
			// Update bounds
			View gmfView = SiriusGMFHelper.getGmfView(target, session);
			if (gmfView instanceof Node) {
				((Node) gmfView).setLayoutConstraint(bounds);
			}
			// Update border
			newView.getOwnedBorderedNodes().forEach(it -> updateBorder(it));
			
			if (target instanceof EdgeTarget) {
				((EdgeTarget) target).getOutgoingEdges()
					.stream()
					.forEach(it -> updateEdge(it, outEdges, target));
				((EdgeTarget) target).getIncomingEdges()
					.stream()
					.forEach(it -> updateEdge(it, inEdges, target));
			}
		}
		
		protected void updateEdge(DEdge current, List<EndLayout> layouts, AbstractDNode newNode) {
			EndLayout layout = findEdgeLayout(current, layouts, newNode);
			if (layout != null) {
				layout.update(current);
			}
		}

		protected EndLayout findEdgeLayout(DEdge current, List<EndLayout> layouts, AbstractDNode newNode) {
			for (EndLayout layout : layouts) {
				if (layout.match(current, target, newNode)) {
					return layout;
				}
			}
			return null;
		}
		
		protected void updateBorder(DNode border) {
			NodeLayout layout = findLayout(borders, border);
			if (layout != null) {
				layout.update(border);
			}
		}
		
	}
	
	protected class EdgeLayout extends RepresentationLayout<EdgeMapping, DEdge> {
		final EdgeLayoutData data;
		
		protected EdgeLayout(DEdge src) {
			super(src, src.getParentDiagram());
			View view = SiriusGMFHelper.getGmfView(src, session);
			data = view instanceof Edge 
				? new EdgeLayoutData((Edge) view)
				: null;
		}
		
		@Override
		protected void update(DEdge target) {
			View gmfView = SiriusGMFHelper.getGmfView(target, session);
			if (gmfView instanceof Edge) {
				data.update((Edge) gmfView);
			}
		}

	}

	protected static EdgeTarget getEnd(DEdge src, boolean out) {
		return out ? src.getTargetNode() : src.getSourceNode();
	}

	protected class EndLayout extends EdgeLayout {
		final boolean targetChange;
		final EdgeTarget end;
		final boolean outEnd;
		final boolean endChange;
		
		protected EndLayout(DEdge src, AbstractDNode targeting, boolean out) {
			super(src);
			targetChange = src.getTarget() == targeting.getTarget();
			outEnd = out;
			end = getEnd(src, out);
			endChange = end == targeting;
		}
		
		protected boolean match(DEdge it, AbstractDNode previous, AbstractDNode current) {
			EObject expectedTarget = targetChange
					? current.getTarget()
					: target.getTarget();
			EdgeTarget actualEnd = getEnd(it, outEnd);
			EdgeTarget expectedEnd = endChange 
					? (EdgeTarget) current 
					: end;
			
			return it.getTarget() == expectedTarget // proper target 
					&& actualEnd == expectedEnd // proper end
					&& it.getMapping() == mapping; // proper mapping
		}
		
	}
	
	
	private static boolean isGmfLabelNode(Object it) {
		if (!(it instanceof Node)) {
			return false;
		}
		Node node = (Node) it;
		return node.getPersistedChildren().isEmpty() && node.getType() != null;
	}
	
	protected class EdgeLayoutData {

		final Bendpoints bendPoints;
		final Anchor sourceAnchor;
		final Anchor targetAnchor;
		final List<Node> labels;

		protected EdgeLayoutData(Edge src) {
			bendPoints = src.getBendpoints();
			sourceAnchor = src.getSourceAnchor();
			targetAnchor = src.getTargetAnchor();

			labels = ((List<?>) src.getPersistedChildren())
				.stream()
				.filter(it -> isGmfLabelNode(it))
				.map(Node.class::cast)
				.collect(Collectors.toList());
		}

		/**
		 * Updates edge with layout
		 *
		 * @param edge
		 *     to update
		 */
		private void update(Edge edge) {
			edge.setBendpoints(bendPoints);
			edge.setSourceAnchor(sourceAnchor);
			edge.setTargetAnchor(targetAnchor);
			if (!labels.isEmpty()) {
				updateLabels(edge);
			}
		}

		private void updateLabels(Edge edge) {
			((List<?>) edge.getPersistedChildren())
				.stream()
				.filter(it -> isGmfLabelNode(it))
				.map(Node.class::cast)
				.forEach(it -> updateLabel(it));

		}

		private void updateLabel(Node it) {
			Node old = findLabel(it.getType());
			if (old != null) {
				it.setLayoutConstraint(old.getLayoutConstraint());
			}
		}
		
		private Node findLabel(String type) {
			return labels.stream()
				.filter(it -> Objects.equals(it.getType(), type))
				.findFirst().orElse(null);
		}

	}
	
	class DiagramModifier {
		final DSemanticDiagram parent;
		final ModelAccessor accessor;
		final IInterpreter interpreter;
		final DDiagramElementSynchronizer dsync;
		final DiagramMappingsManager mmapping;
		final RefreshIdsHolder idFactory;
		
		Map<DiagramElementMapping, Collection<EdgeTarget>> mappingsToEdgeTargets = null;
		final Map<EdgeMapping, Collection<MappingBasedDecoration>> edgeToMappings = new HashMap<>();
		final Map<String, Collection<SemanticBasedDecoration>> edgeToSemantics = new HashMap<>();
		
		private DiagramModifier(DSemanticDiagram diagram) {
			parent = diagram;
			accessor = SiriusPlugin.getDefault()
					.getModelAccessorRegistry()
					.getModelAccessor(diagram);
			mmapping = DiagramMappingsManagerRegistry.INSTANCE.getDiagramMappingsManager(session, diagram);
			interpreter = InterpreterUtil.getInterpreter(diagram);
			dsync = new DDiagramElementSynchronizer(diagram, interpreter, accessor)
			/* Should we skip a PermissionAuthority ?
			{

				@Override
				public void refresh(final DDiagramElement newNode) {
					if (newNode instanceof DNode) {
						refresh((DNode) newNode);
					} else if (newNode instanceof DNodeListElement) {
						refresh((DNodeListElement) newNode);
					} else if (newNode instanceof DDiagramElementContainer) {
						refresh((DDiagramElementContainer) newNode);
					} else if (newNode instanceof DEdge) {
						refresh((DEdge) newNode);
					}
				}

			}*/;
			idFactory = RefreshIdsHolder.getOrCreateHolder(diagram);
		}
		
		private void prepareEdges() {
			if (mappingsToEdgeTargets != null) {
				return;
			}
			mappingsToEdgeTargets = dsync.computeMappingsToEdgeTargets(session.getSelectedViewpoints(false));
			// Initialize cache
			new DecorationHelperInternal(parent, interpreter, accessor)
				.computeDecorations(mappingsToEdgeTargets, edgeToSemantics, edgeToMappings);
			// TODO update with new nodes ?
		}
		
	}
	
	// Transformation content
	private List<EStructuralFeature.Setting> transferableRefs = new ArrayList<>();
	private List<NodeLayout> nodeLayouts = new ArrayList<>();
	private List<EdgeLayout> edgeLayouts = new ArrayList<>();
	private Map<DSemanticDiagram, DiagramModifier> synchs = new HashMap<>();
	
	public SiriusElementRefactor(DRepresentationElement context) {
		origin = Objects.requireNonNull(context.getTarget());
		session = Session.of(context).get();
		
		editedDiagrams = Stream.of(PlatformUI.getWorkbench().getWorkbenchWindows())
			.flatMap(it -> Stream.of(it.getPages()))
			.flatMap(it -> Stream.of(it.getEditorReferences()))
			.map(it -> it.getEditor(false))
			.filter(this::isApplicableEditor)
			.map(this::toDiagram)
			.filter(Objects::nonNull)
			.collect(Collectors.toList());
	}
	
	private DDiagram toDiagram(IEditorPart editor) {
		URI repUri = ((SessionEditorInput) editor.getEditorInput()).getRepDescUri();
		EObject rep = session.getTransactionalEditingDomain().getResourceSet().getEObject(repUri, false);

		if (rep instanceof DRepresentationDescriptor) { // regular case
			rep = ((DRepresentationDescriptor) rep).getRepresentation();
		}
		return rep instanceof DDiagram 
				? (DDiagram) rep
				: null;
	}
	
	private boolean isApplicableEditor(IEditorPart it) {
		return session != null
				&& it instanceof SiriusDiagramEditor
				&& it.getEditorInput() instanceof SessionEditorInput
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
				if (ref.getEStructuralFeature() == DTARGET_FEATURE 
						&& ref.getEObject() instanceof DDiagramElement) {
					replaceDElementTarget((DDiagramElement) ref.getEObject(), target);
				} else {
					replaceReference(ref.getEObject(), ref.getEStructuralFeature(), target);
				};
			}
			
			// Recreate Views (Do not use refresh to associate old and new representations).
			Set<DSemanticDiagram> toRefresh = new HashSet<>();
			nodeLayouts.forEach(it -> toRefresh.add(createNewNode(target, it)));
			edgeLayouts.forEach(it -> toRefresh.add(createNewEdge(target, it)));
			
			// Refresh Diagrams to create GMF notation
			toRefresh.forEach(it -> refresh(it));
			
			// Restore layout nodes
			nodeLayouts.forEach(it -> it.update());
			// TODO restore
			//  - edges
			
			return target;
		} finally {
			cleanCache();
		}
	}
	
	/**
	 * Replaces the element target and mapping.
	 * 
	 * @param dElement to update
	 * @param target new target
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
		DDiagramCanonicalSynchronizer gmfSynch =
			new DDiagramCanonicalSynchronizer(gmfDiagram);
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
		DiagramModifier sync = synchs.computeIfAbsent(diagram, DiagramModifier::new);

		AbstractNodeMapping targetMapping = getApplicableNodeMapping(
				(AbstractNodeMapping) save.target.getMapping(), target);
		if (targetMapping == null) {
			return diagram;
		}
		DNodeCandidate candidate = new DNodeCandidate(
				targetMapping, 
				target,
				(DragAndDropTarget) save.container, 
				sync.idFactory);
		
		// Should we keep node order in container ? (Probably not).
		save.bind(sync.dsync.createNewNode(sync.mmapping, candidate, false));
		return diagram;
	}

	/**
	 * Returns the mapping expected for a transformed node.
	 * 
	 * @param previous mapping
	 * @param current transformed target
	 * @return mapping or null if not displayed anymore
	 */
	protected AbstractNodeMapping getApplicableNodeMapping(AbstractNodeMapping previous, EObject current) {
		return previous;
	}
	
	private DSemanticDiagram createNewEdge(EObject target, EdgeLayout save) {
		DSemanticDiagram diagram = (DSemanticDiagram) save.container;
		DiagramModifier writer = synchs.computeIfAbsent(diagram, DiagramModifier::new);

		EdgeMapping targetMapping = getApplicableEdgeMapping(
				(IEdgeMapping) save.target.getMapping(), target);
		DEdgeCandidate candidate = new DEdgeCandidate(
				targetMapping, 
				target,
				getAccurateEgdeTarget(save.target.getSourceNode()),
				getAccurateEgdeTarget(save.target.getTargetNode()),
				writer.idFactory);
		
		// See org.eclipse.sirius.diagram.business.internal.helper.task.operations.CreateViewTask
		// #createEdgeView(DSemanticDiagram, CreateEdgeView, Session)
		writer.prepareEdges();
		save.bind(writer.dsync.createNewEdge(writer.mmapping, candidate, 
				writer.mappingsToEdgeTargets,
				writer.edgeToMappings,
				writer.edgeToSemantics));
		return diagram;
	}
	
	/**
	 * Returns the mapping expected for a transformed edge.
	 * 
	 * @param previous mapping
	 * @param current transformed target
	 * @return mapping or null if not displayed anymore
	 */
	protected EdgeMapping getApplicableEdgeMapping(IEdgeMapping previous, EObject current) {
		return (EdgeMapping) previous;
	}
	
	
	private EdgeTarget getAccurateEgdeTarget(EdgeTarget previous) {
		for(NodeLayout node : nodeLayouts) {
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
				if (isAssignable(ref.getEStructuralFeature(), target) 
						&& shouldRecreateView(ref)) {
					
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
			nodeLayouts.add(new NodeLayout((AbstractDNode) dElement));							
		} else if (dElement instanceof DEdge) {
			edgeLayouts.add(new EdgeLayout((DEdge) dElement));							
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
		} else /*single*/ if (isAssignable(feat, target)) {
			caller.eSet(feat, target);
		} else {
			caller.eUnset(feat);
		}		
	}
	
	@SuppressWarnings("unchecked")
	private static <T extends EObject> T getAncestor(Class<T> type, EObject it) {
		return it == null || type.isInstance(it)
			? (T) it
			: getAncestor(type, it.eContainer());
	}
	
	private void copyContent(EObject target) {
		for (EStructuralFeature feature : origin.eClass().getEAllStructuralFeatures()) {
			if (origin.eIsSet(feature) 
					&& isApplicable(feature, target.eClass())
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
		return !feature.isDerived() 
			&& !feature.isTransient()
			&& feature.isChangeable();
	}
	
	private boolean isApplicable(EStructuralFeature feature, EClass targetType) {
		return isEditable(feature)
			&& feature.getEContainingClass().isSuperTypeOf(targetType);
	}
	
	/**
	 * Evaluates if a feature should be copied to new element.
	 * <p>
	 * Dynamic Id should not be copied for EMF-compare to work.
	 * </p>
	 * 
	 * @param feature to copy
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
