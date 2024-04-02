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
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.notation.Anchor;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.obeonetwork.bpmn2.design.util.GMFHelper;
import org.obeonetwork.bpmn2.design.util.GMFStyleCopier;
import org.obeonetwork.bpmn2.design.util.SiriusStyleCopier;

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

		labels = ((List<?>) src.getPersistedChildren()).stream().filter(it -> GMFHelper.isGmfLabelNode(it))
				.map(Node.class::cast).collect(Collectors.toList());
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
		SiriusStyleCopier.updateEdgeStyle(targetSiriusEdge, edge, oldSiriusStyle, oldGMFStyles);
		if (!labels.isEmpty()) {
			GMFStyleCopier.updateLabels(edge, labels);
		}
	}

}
