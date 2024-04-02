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

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.diagram.FlatContainerStyle;
import org.eclipse.sirius.diagram.Square;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.viewpoint.Style;
import org.obeonetwork.bpmn2.design.Activator;
import org.obeonetwork.bpmn2.design.ServiceHelper;
import org.obeonetwork.bpmn2.design.util.GMFStyleCopier;
import org.obeonetwork.bpmn2.design.util.SiriusHelper;
import org.obeonetwork.bpmn2.design.util.SiriusStyleCopier;

/**
 * 
 * @author nperansin
 */
class NodeLayout extends RepresentationLayout<AbstractNodeMapping, AbstractDNode> {

	final Bounds bounds;
	final Location labelLocation;
	final List<NodeLayout> borders;
	final List<EndLayout> outEdges;
	final List<EndLayout> inEdges;
	final boolean isExternalLabel;
	final Style siriusStyle;
	final EList<?> gmfStyles;

	protected NodeLayout(AbstractDNode src, Session session) {
		super(src, src.eContainer(), session);
		this.isExternalLabel = src instanceof DNode ? ServiceHelper.isExternalLabel((DNode) src) : false;

		Bounds bounds = null;
		Location labelLocation = null;
		EList<?> gmfStyles = null;
		View gmfView = SiriusGMFHelper.getGmfView(src, session);
		if (gmfView instanceof Node) {
			Node node = (Node) gmfView;
			if (node.getLayoutConstraint() instanceof Bounds) {
				bounds = (Bounds) node.getLayoutConstraint();
				for (Object o : node.getChildren()) {
					if (o instanceof Node) {
						Node subNode = (Node) o;
						if (SiriusHelper.LABEL_NODE_TYPE.equals(subNode.getType())
								&& subNode.getLayoutConstraint() instanceof Location) {
							labelLocation = (Location) subNode.getLayoutConstraint();
						}
					}
				}
			}
			gmfStyles = node.getStyles();
		}
		this.bounds = bounds;
		this.labelLocation = labelLocation;
		this.gmfStyles = gmfStyles;
		this.siriusStyle = src.getStyle();

		borders = src.getOwnedBorderedNodes().stream().map(it -> new NodeLayout(it, session))
				.collect(Collectors.toList());

		if (src instanceof EdgeTarget) {
			outEdges = ((EdgeTarget) src).getOutgoingEdges().stream().map(it -> new EndLayout(it, src, true, session))
					.collect(Collectors.toList());
			inEdges = ((EdgeTarget) src).getIncomingEdges().stream().map(it -> new EndLayout(it, src, false, session))
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
			Node node = (Node) gmfView;
			node.setLayoutConstraint(bounds);
			for (Object o : node.getChildren()) {
				if (o instanceof Node) {
					Node subNode = (Node) o;
					if (SiriusHelper.LABEL_NODE_TYPE.equals(subNode.getType())) {
						subNode.setLayoutConstraint(labelLocation);
					}
				}
			}
		}

		updateNodeContainerStyle(target, gmfView instanceof Node ? (Node) gmfView : null);

		if (target instanceof DNode && isExternalLabel) {
			// Crapy code to set that the DNode has an external label.
			ServiceHelper.setExternalLabelInTooltip((DNode) target);
		}

		// Update border
		newView.getOwnedBorderedNodes().forEach(it -> updateBorder(it));

		if (target instanceof EdgeTarget) {
			((EdgeTarget) target).getOutgoingEdges().stream().forEach(it -> updateEdge(it, outEdges, target));
			((EdgeTarget) target).getIncomingEdges().stream().forEach(it -> updateEdge(it, inEdges, target));
		}
	}

	@SuppressWarnings("unchecked")
	private void updateNodeContainerStyle(AbstractDNode target, Node gmfNode) {
		if (target != null && (target.getStyle() instanceof FlatContainerStyle)
				&& (siriusStyle instanceof FlatContainerStyle)) {
			SiriusStyleCopier.updateSiriusNodeContainerFlatContainerStyle((FlatContainerStyle) siriusStyle,
					(FlatContainerStyle) target.getStyle());
		} else if (target != null && (target.getStyle() instanceof WorkspaceImage)
				&& (siriusStyle instanceof WorkspaceImage)) {
			SiriusStyleCopier.updateSiriusNodeContainerWorkspaceImageStyle((WorkspaceImage) siriusStyle,
					(WorkspaceImage) target.getStyle());
		} else if (target != null && (target.getStyle() instanceof Square) && (siriusStyle instanceof Square)) {
			SiriusStyleCopier.updateSiriusNodeContainerSquareStyle((Square) siriusStyle, (Square) target.getStyle());
		} else {
			if (target == null || ((DNode) target).getStyle() == null) {
				Activator.log(IStatus.ERROR, "Target or style is null: " + target.getStyle().getClass().getName() + "/"
						+ siriusStyle.getClass().getName(), null);
			} else {
				Activator.log(IStatus.ERROR, "Unknown types: " + target.getStyle().getClass().getName() + "/"
						+ siriusStyle.getClass().getName(), null);
			}
		}

		if (gmfNode != null) {
			gmfNode.getStyles().forEach(newStyle -> {
				Optional<?> oldStyleOpt = gmfStyles.stream()
						.filter(oldStyle -> oldStyle.getClass().equals(newStyle.getClass())).findFirst();

				oldStyleOpt.ifPresent(oldStyle -> {
					if (oldStyle instanceof FontStyle && newStyle instanceof FontStyle) {
						GMFStyleCopier.updateFontStyle((FontStyle) oldStyle, (FontStyle) newStyle);
					}
				});
			});
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
			layout.updateBorderStyle(border);
		}
	}

	protected void updateBorderStyle(AbstractDNode target) {
		// Update bounds
		View gmfView = SiriusGMFHelper.getGmfView(target, session);
		if (gmfView instanceof Node) {
			((Node) gmfView).setLayoutConstraint(bounds);
		}

		updateNodeContainerStyle(target, gmfView instanceof Node ? (Node) gmfView : null);

		if (target instanceof EdgeTarget) {
			((EdgeTarget) target).getOutgoingEdges().stream().forEach(it -> updateEdge(it, outEdges, target));
			((EdgeTarget) target).getIncomingEdges().stream().forEach(it -> updateEdge(it, inEdges, target));
		}
	}

}
