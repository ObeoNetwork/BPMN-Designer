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

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.notation.Anchor;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.EdgeStyle;

/**
 * 
 * @author nperansin
 */
class EdgeLayoutData {

	final Bendpoints bendPoints;
	final Anchor sourceAnchor;
	final Anchor targetAnchor;
	final List<Node> labels;
	final EdgeStyle oldSiriusStyle;
	final EList<?> oldGMFStyles;

	protected EdgeLayoutData(DEdge siriusSrc, Edge src) {
		bendPoints = src.getBendpoints();
		sourceAnchor = src.getSourceAnchor();
		targetAnchor = src.getTargetAnchor();
		this.oldSiriusStyle = (siriusSrc instanceof DEdge) ? (EdgeStyle) siriusSrc.getStyle() : null;
		this.oldGMFStyles = src.getStyles();

		labels = ((List<?>) src.getPersistedChildren()).stream()
				.filter(it -> SiriusElementRefactorHelper.isGmfLabelNode(it)).map(Node.class::cast)
				.collect(Collectors.toList());
	}

	/**
	 * Updates edge with layout
	 *
	 * @param edge to update
	 */
	protected void update(DEdge targetSiriusEdge, Edge edge) {
		edge.setBendpoints(bendPoints);
		edge.setSourceAnchor(sourceAnchor);
		edge.setTargetAnchor(targetAnchor);
		updateEdgeStyle(targetSiriusEdge, edge);
		if (!labels.isEmpty()) {
			updateLabels(edge);
		}
	}

	@SuppressWarnings("unchecked")
	private void updateEdgeStyle(DEdge targetSiriusEdge, Edge targetEdge) {
		if (oldSiriusStyle != null) {
			SiriusElementRefactorHelper.updateSiriusEdgeStyle(oldSiriusStyle, (EdgeStyle) targetSiriusEdge.getStyle());
		}

		targetEdge.getStyles().forEach(newStyle -> {
			Optional<?> oldStyleOpt = oldGMFStyles.stream()
					.filter(oldStyle -> oldStyle.getClass().equals(newStyle.getClass())).findFirst();

			oldStyleOpt.ifPresent(oldStyle -> {
				if (oldStyle instanceof FontStyle && newStyle instanceof FontStyle) {
					SiriusElementRefactorHelper.updateFontStyle((FontStyle) oldStyle, (FontStyle) newStyle);
				} else if (oldStyle instanceof ConnectorStyle && newStyle instanceof ConnectorStyle) {
					SiriusElementRefactorHelper.updateConnectorStyle((ConnectorStyle) oldStyle,
							(ConnectorStyle) newStyle);
				}
			});
		});
	}

	private void updateLabels(Edge edge) {
		((List<?>) edge.getPersistedChildren()).stream().filter(it -> SiriusElementRefactorHelper.isGmfLabelNode(it))
				.map(Node.class::cast).forEach(it -> updateLabel(it));

	}

	private void updateLabel(Node it) {
		Node old = findLabel(it.getType());
		if (old != null) {
			it.setLayoutConstraint(old.getLayoutConstraint());
		}
	}

	private Node findLabel(String type) {
		return labels.stream().filter(it -> Objects.equals(it.getType(), type)).findFirst().orElse(null);
	}

}
