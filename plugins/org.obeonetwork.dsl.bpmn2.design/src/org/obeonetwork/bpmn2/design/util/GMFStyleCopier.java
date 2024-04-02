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

import java.util.List;
import java.util.Objects;

import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;

public class GMFStyleCopier {

	public static void updateFontStyle(FontStyle oldStyle, FontStyle newStyle) {
		newStyle.setBold(oldStyle.isBold());
		newStyle.setFontColor(oldStyle.getFontColor());
		newStyle.setFontHeight(oldStyle.getFontHeight());
		newStyle.setFontName(oldStyle.getFontName());
		newStyle.setItalic(oldStyle.isItalic());
		newStyle.setStrikeThrough(oldStyle.isStrikeThrough());
		newStyle.setUnderline(oldStyle.isUnderline());
	}

	public static void updateConnectorStyle(ConnectorStyle oldStyle, ConnectorStyle newStyle) {
		newStyle.setAvoidObstructions(oldStyle.isAvoidObstructions());
		newStyle.setClosestDistance(oldStyle.isClosestDistance());
		newStyle.setJumpLinksReverse(oldStyle.isJumpLinksReverse());
		newStyle.setJumpLinkStatus(oldStyle.getJumpLinkStatus());
		newStyle.setJumpLinkType(oldStyle.getJumpLinkType());
		newStyle.setLineColor(oldStyle.getLineColor());
		newStyle.setLineWidth(oldStyle.getLineWidth());
		newStyle.setRoundedBendpointsRadius(oldStyle.getRoundedBendpointsRadius());
		newStyle.setRouting(oldStyle.getRouting());
		newStyle.setSmoothness(oldStyle.getSmoothness());
	}
	
	public static void updateLabels(Edge edge, List<Node> labels) {
		((List<?>) edge.getPersistedChildren()).stream().filter(it -> GMFHelper.isGmfLabelNode(it))
				.map(Node.class::cast).forEach(it -> updateLabel(it, labels));

	}

	private static void updateLabel(Node it, List<Node> labels) {
		Node old = findLabel(it.getType(), labels);
		if (old != null) {
			if (old.getLayoutConstraint() instanceof Bounds) {
				Bounds oldBounds = (Bounds) old.getLayoutConstraint();
				Bounds newBounds = NotationFactory.eINSTANCE.createBounds();
				newBounds.setHeight(oldBounds.getHeight());
				newBounds.setWidth(oldBounds.getWidth());
				newBounds.setX(oldBounds.getX());
				newBounds.setY(oldBounds.getY());
				it.setLayoutConstraint(newBounds);
			}
		}
	}

	private static Node findLabel(String type, List<Node> labels) {
		return labels.stream().filter(it -> Objects.equals(it.getType(), type)).findFirst().orElse(null);
	}

}
