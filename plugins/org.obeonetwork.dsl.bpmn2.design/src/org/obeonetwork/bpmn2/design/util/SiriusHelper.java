/**
 * Copyright (c) 2011-2024 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.bpmn2.design.util;

import java.util.Objects;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.CustomDataConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.diagram.ui.internal.refresh.diagram.DDiagramCanonicalSynchronizer;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.AnnotationEntry;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;

public class SiriusHelper {

	public static final String LABEL_NODE_TYPE = "5003";

	public static AbstractDNode getAbstractDNode(DDiagram diagram, String id) {
		AbstractDNode result = null;
		for (DDiagramElement de : diagram.getOwnedDiagramElements()) {
			if (de instanceof DNodeContainer) {
				result = getAbstractDNode((DNodeContainer) de, id);
				if (result != null) {
					return result;
				}
			}
		}
		return result;
	}

	public static AbstractDNode getAbstractDNode(DNodeContainer dNodeContainer, String id) {
		AbstractDNode result = null;
		for (DDiagramElement de : dNodeContainer.getOwnedDiagramElements()) {
			if (de.getTarget() != null && de instanceof AbstractDNode && id.equals(EcoreUtil.getID(de.getTarget()))) {
				return (AbstractDNode) de;
			} else if (result == null && de instanceof DNodeContainer) {
				result = getAbstractDNode((DNodeContainer) de, id);
				if (result != null) {
					return result;
				}
			}
		}
		for (DDiagramElement de : dNodeContainer.getOwnedBorderedNodes()) {
			if (de.getTarget() != null && de instanceof AbstractDNode && id.equals(EcoreUtil.getID(de.getTarget()))) {
				return (AbstractDNode) de;
			} else if (result == null && de instanceof DNodeContainer) {
				result = getAbstractDNode((DNodeContainer) de, id);
				if (result != null) {
					return result;
				}
			}
		}
		return result;
	}

	public static DEdge getDEdge(DDiagram diagram, String id) {
		DEdge result = null;
		try {
			for (DEdge de : diagram.getEdges()) {
				if (id.equals(EcoreUtil.getID(de.getTarget()))) {
					return de;
				}
			}
		} catch (Exception e) {
			// Nada
		}
		return result;
	}

	public static AbstractDNode getAbstractDNode(String id, IWorkbenchPage[] pages) {
		for (IWorkbenchPage page : pages) {
			IEditorReference[] editorReferences = page.getEditorReferences();
			for (IEditorReference editorRef : editorReferences) {
				try {
					IEditorPart editor = editorRef.getEditor(false);
					if (editor instanceof DDiagramEditor) {
						DDiagramEditor siriusEditor = (DDiagramEditor) editor;
						DRepresentation dRep = siriusEditor.getRepresentation();
						if (dRep instanceof DDiagram) {
							AbstractDNode result = SiriusHelper.getAbstractDNode((DDiagram) dRep, id);
							if (result != null) {
								return result;
							}
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public static DEdge getDEdge(String id, IWorkbenchPage[] pages) {
		for (IWorkbenchPage page : pages) {
			IEditorReference[] editorReferences = page.getEditorReferences();
			for (IEditorReference editorRef : editorReferences) {
				try {
					IEditorPart editor = editorRef.getEditor(false);
					if (editor instanceof DDiagramEditor) {
						DDiagramEditor siriusEditor = (DDiagramEditor) editor;
						DRepresentation dRep = siriusEditor.getRepresentation();
						if (dRep instanceof DDiagram) {
							DEdge result = SiriusHelper.getDEdge((DDiagram) dRep, id);
							if (result != null) {
								return result;
							}
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public static void refresh(DSemanticDiagram dSemanticDiagram) {
		Diagram gmfDiagram = getGMFDiagram(dSemanticDiagram);
		if (gmfDiagram == null) {
			return;
		}
		// Create proper location
		DDiagramCanonicalSynchronizer gmfSynch = new DDiagramCanonicalSynchronizer(gmfDiagram);
		gmfSynch.storeViewsToArrange(false);
		// Clean diagram and related edges
		DialectManager.INSTANCE.refresh(dSemanticDiagram, new NullProgressMonitor());
		// Create gmf nodes of new elements. This is performed in pre-commit.
		gmfSynch.synchronize();
	}

	public static Diagram getGMFDiagram(DDiagram dDiagram) {
		for (AnnotationEntry anno : dDiagram.getOwnedAnnotationEntries()) {
			if (Objects.equals(anno.getSource(), CustomDataConstants.GMF_DIAGRAMS)) {
				return (Diagram) anno.getData();
			}
		}
		return null;
	}

	public static View getGMFView(DDiagramElement dDiagramElement) {
		Session session = Session.of(dDiagramElement).get();
		View gmfView = SiriusGMFHelper.getGmfView(dDiagramElement, session);
		return gmfView;
	}

}
