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
package org.obeonetwork.bpmn2.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.IdentityAnchor;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.eclipse.sirius.diagram.FlatContainerStyle;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.viewpoint.Style;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.bpmn2.design.util.GMFHelper;
import org.obeonetwork.bpmn2.design.util.GMFStyleCopier;
import org.obeonetwork.bpmn2.design.util.SiriusHelper;
import org.obeonetwork.bpmn2.design.util.SiriusStyleCopier;
import org.obeonetwork.dsl.bpmn2.BoundaryEvent;
import org.obeonetwork.dsl.bpmn2.FlowNode;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;

public class CopySiriusGMFStylesHelper {

	public static void copyStyles(EObject newElement, DDiagramElement containerView, String oldId, String newId) {
		if (newElement instanceof BoundaryEvent) {
			copyBoundaryEvent((BoundaryEvent) newElement, containerView, oldId, newId);
		} else if (newElement instanceof FlowNode) {
			copyFlowNode((FlowNode) newElement, containerView, oldId, newId);
		} else if (newElement instanceof SequenceFlow) {
			copySequenceFlow((SequenceFlow) newElement, containerView, oldId, newId);
		}
	}

	private static void copyBoundaryEvent(BoundaryEvent newElement, DDiagramElement containerView, String oldId,
			String newId) {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage[] pages = workbench.getActiveWorkbenchWindow().getPages();
		AbstractDNode oldAbstractDNode = SiriusHelper.getAbstractDNode(oldId, pages);
		if (oldAbstractDNode != null) {
			SiriusHelper.refresh((DSemanticDiagram) containerView.getParentDiagram());
			// Update boundary event asynchronously.
			Thread t = new Thread() {
				public void run() {
					int cpt = 0;
					while (cpt < 100) {
						AbstractDNode newAbstractDNode = SiriusHelper.getAbstractDNode(containerView.getParentDiagram(),
								newId);
						if (newAbstractDNode == null) {
							try {
								Thread.sleep(1000);
								cpt++;
							} catch (InterruptedException e) {
								Activator.log(IStatus.ERROR, e.getMessage(), e);
							}
						} else {
							TransactionalEditingDomain ted = (TransactionalEditingDomain) AdapterFactoryEditingDomain
									.getEditingDomainFor(newAbstractDNode);
							CommandStack commandStack = ted.getCommandStack();
							commandStack.execute(new RecordingCommand(ted) {
								@Override
								protected void doExecute() {
									updateStyles(oldAbstractDNode, newAbstractDNode);
								}
							});
							return;
						}
					}
				};
			};
			t.start();
		}
	}

	private static void copyFlowNode(FlowNode newElement, DDiagramElement containerView, String oldId, String newId) {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage[] pages = workbench.getActiveWorkbenchWindow().getPages();
		AbstractDNode oldAbstractDNode = SiriusHelper.getAbstractDNode(oldId, pages);

		if (oldAbstractDNode != null) {
			SiriusHelper.refresh((DSemanticDiagram) containerView.getParentDiagram());
			AbstractDNode newAbstractDNode = SiriusHelper.getAbstractDNode(containerView.getParentDiagram(), newId);

			if (newAbstractDNode != null) {
				updateStyles(oldAbstractDNode, newAbstractDNode);
			}
		}
	}

	private static void copySequenceFlow(SequenceFlow newElement, DDiagramElement containerView, String oldId,
			String newId) {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage[] pages = workbench.getActiveWorkbenchWindow().getPages();
		// Update edges asynchronously.
		Thread t = new Thread() {
			public void run() {
				int cpt = 0;
				DEdge oldDEdge = SiriusHelper.getDEdge(oldId, pages);
				if (oldDEdge != null) {
					while (cpt < 100) {
						DEdge newDEdge = SiriusHelper.getDEdge(containerView.getParentDiagram(), newId);
						if (newDEdge == null) {
							try {
								Thread.sleep(1000);
								cpt++;
							} catch (InterruptedException e) {
								Activator.log(IStatus.ERROR, e.getMessage(), e);
							}
						} else {
							Edge newGMFEdge = (Edge) SiriusHelper.getGMFView(newDEdge);
							if (newGMFEdge != null && newDEdge.getStyle() != null) {
								updateStyles(oldDEdge, newDEdge);
								return;
							}
						}
					}
				}
			};
		};
		t.start();
	}

	private static void updateStyles(DEdge oldAbstractDNode, DEdge newAbstractDNode) {
		Edge oldGMFView = (Edge) SiriusHelper.getGMFView(oldAbstractDNode);
		Edge newGMFView = (Edge) SiriusHelper.getGMFView(newAbstractDNode);

		RelativeBendpoints bendPoints = (RelativeBendpoints) oldGMFView.getBendpoints();
		IdentityAnchor sourceAnchor = (IdentityAnchor) oldGMFView.getSourceAnchor();
		IdentityAnchor targetAnchor = (IdentityAnchor) oldGMFView.getTargetAnchor();
		EdgeStyle oldSiriusStyle = (oldAbstractDNode instanceof DEdge) ? (EdgeStyle) oldAbstractDNode.getStyle() : null;
		EList<?> oldGMFStyles = oldGMFView.getStyles();

		List<Node> labels = ((List<?>) oldGMFView.getPersistedChildren()).stream()
				.filter(it -> GMFHelper.isGmfLabelNode(it)).map(Node.class::cast).collect(Collectors.toList());

		TransactionalEditingDomain ted = (TransactionalEditingDomain) AdapterFactoryEditingDomain
				.getEditingDomainFor(newAbstractDNode);
		CommandStack commandStack = ted.getCommandStack();
		commandStack.execute(new RecordingCommand(ted) {
			@Override
			protected void doExecute() {
				RelativeBendpoints newBendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
				List<RelativeBendpoint> list = new ArrayList<RelativeBendpoint>();
				for (Object o : bendPoints.getPoints()) {
					if (o instanceof RelativeBendpoint) {
						RelativeBendpoint point = (RelativeBendpoint) o;
						RelativeBendpoint newPoint = new RelativeBendpoint(point.getSourceX(), point.getSourceY(),
								point.getTargetX(), point.getTargetY());
						list.add(newPoint);
					}
				}
				newBendpoints.setPoints(list);
				newGMFView.setBendpoints(newBendpoints);

				IdentityAnchor newSourceAnchor = (IdentityAnchor) newGMFView.getSourceAnchor();
				IdentityAnchor newTargetAnchor = (IdentityAnchor) newGMFView.getTargetAnchor();
				if (sourceAnchor != null) {
					newSourceAnchor.setId(sourceAnchor.getId());
				}
				if (targetAnchor != null) {
					newTargetAnchor.setId(targetAnchor.getId());
				}
				SiriusStyleCopier.updateEdgeStyle(newAbstractDNode, newGMFView, oldSiriusStyle, oldGMFStyles);
				if (!labels.isEmpty()) {
					GMFStyleCopier.updateLabels(newGMFView, labels);
				}
			}
		});
	}

	private static void updateStyles(AbstractDNode oldAbstractDNode, AbstractDNode newAbstractDNode) {
		Style oldStyle = oldAbstractDNode.getStyle();
		Style newStyle = newAbstractDNode.getStyle();
		if (oldStyle instanceof FlatContainerStyle && newStyle instanceof FlatContainerStyle) {
			SiriusStyleCopier.updateSiriusNodeContainerFlatContainerStyle((FlatContainerStyle) oldStyle,
					(FlatContainerStyle) newStyle);
		} else if (oldStyle instanceof WorkspaceImage && newStyle instanceof WorkspaceImage) {
			SiriusStyleCopier.updateSiriusNodeContainerWorkspaceImageStyle((WorkspaceImage) oldStyle,
					(WorkspaceImage) newStyle);
		}

		View oldGMFView = SiriusHelper.getGMFView(oldAbstractDNode);
		View newGMFView = SiriusHelper.getGMFView(newAbstractDNode);
		updateGMFStyles(oldGMFView, newGMFView);
	}

	private static void updateGMFStyles(View oldGMFView, View newGMFView) {
		if (oldGMFView instanceof Node && newGMFView instanceof Node) {
			Node oldNode = (Node) oldGMFView;
			Node newNode = (Node) newGMFView;
			if (oldNode.getLayoutConstraint() instanceof Bounds) {
				Bounds oldBounds = (Bounds) oldNode.getLayoutConstraint();
				Bounds newBounds = NotationFactory.eINSTANCE.createBounds();
				newBounds.setHeight(oldBounds.getHeight());
				newBounds.setWidth(oldBounds.getWidth());
				newBounds.setX(oldBounds.getX());
				newBounds.setY(oldBounds.getY());
				newNode.setLayoutConstraint(newBounds);
			}
			newNode.getStyles().forEach(newStyle -> {
				Optional<?> oldStyleOpt = oldNode.getStyles().stream()
						.filter(oldStyle -> oldStyle.getClass().equals(newStyle.getClass())).findFirst();

				oldStyleOpt.ifPresent(oldStyle -> {
					if (oldStyle instanceof FontStyle && newStyle instanceof FontStyle) {
						GMFStyleCopier.updateFontStyle((FontStyle) oldStyle, (FontStyle) newStyle);
					}
				});
			});
			for (Object o : oldNode.getChildren()) {
				if (o instanceof Node) {
					Node subOldNode = (Node) o;
					if (SiriusHelper.LABEL_NODE_TYPE.equals(subOldNode.getType())
							&& subOldNode.getLayoutConstraint() instanceof Location) {
						Location oldBounds = (Location) subOldNode.getLayoutConstraint();
						Location newBounds = NotationFactory.eINSTANCE.createLocation();
						newBounds.setX(oldBounds.getX());
						newBounds.setY(oldBounds.getY());

						for (Object o2 : newNode.getChildren()) {
							if (o2 instanceof Node) {
								Node subNewNode = (Node) o2;
								if (SiriusHelper.LABEL_NODE_TYPE.equals(subNewNode.getType())
										&& subNewNode.getLayoutConstraint() instanceof Location) {
									subNewNode.setLayoutConstraint(newBounds);
								}
							}
						}
					}
				}
			}
		}
	}

}
