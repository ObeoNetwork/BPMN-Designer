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

import java.util.Collection;

import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.diagram.FlatContainerStyle;
import org.eclipse.sirius.diagram.Square;
import org.eclipse.sirius.diagram.WorkspaceImage;

public class SiriusElementRefactorHelper {

	static boolean isGmfLabelNode(Object it) {
		if (!(it instanceof Node)) {
			return false;
		}
		Node node = (Node) it;
		return node.getPersistedChildren().isEmpty() && node.getType() != null;
	}

	static <T extends RepresentationLayout<?, ?>> T findLayout(Collection<T> layouts, DDiagramElement element) {
		return layouts.stream().filter(
				it -> it.target.getTarget() == element.getTarget() && it.mapping == element.getDiagramElementMapping())
				.findFirst().orElse(null);
	}

	static EdgeTarget getEnd(DEdge src, boolean out) {
		return out ? src.getTargetNode() : src.getSourceNode();
	}

	static void updateFontStyle(FontStyle oldStyle, FontStyle newStyle) {
		newStyle.setBold(oldStyle.isBold());
		newStyle.setFontColor(oldStyle.getFontColor());
		newStyle.setFontHeight(oldStyle.getFontHeight());
		newStyle.setFontName(oldStyle.getFontName());
		newStyle.setItalic(oldStyle.isItalic());
		newStyle.setStrikeThrough(oldStyle.isStrikeThrough());
		newStyle.setUnderline(oldStyle.isUnderline());
	}

	static void updateConnectorStyle(ConnectorStyle oldStyle, ConnectorStyle newStyle) {
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

	static void updateSiriusNodeContainerFlatContainerStyle(FlatContainerStyle oldContainerStyle,
			FlatContainerStyle containerStyle) {
		containerStyle.setDescription(oldContainerStyle.getDescription());
		containerStyle.setUid(oldContainerStyle.getUid());
		containerStyle.getCustomFeatures().clear();
		containerStyle.getCustomFeatures().addAll(oldContainerStyle.getCustomFeatures());
		containerStyle.setBackgroundColor(oldContainerStyle.getBackgroundColor());
		containerStyle.setBackgroundStyle(oldContainerStyle.getBackgroundStyle());
		containerStyle.setBorderColor(oldContainerStyle.getBorderColor());
		containerStyle.setBorderLineStyle(oldContainerStyle.getBorderLineStyle());
		containerStyle.setBorderSize(oldContainerStyle.getBorderSize());
		containerStyle.setBorderSizeComputationExpression(oldContainerStyle.getBorderSizeComputationExpression());
		containerStyle.setForegroundColor(oldContainerStyle.getForegroundColor());
		containerStyle.setHideLabelByDefault(oldContainerStyle.isHideLabelByDefault());
		containerStyle.setIconPath(oldContainerStyle.getIconPath());
		containerStyle.setLabelAlignment(oldContainerStyle.getLabelAlignment());
		containerStyle.setLabelColor(oldContainerStyle.getLabelColor());
		containerStyle.setLabelSize(oldContainerStyle.getLabelSize());
		containerStyle.getLabelFormat().addAll(oldContainerStyle.getLabelFormat());
		containerStyle.setShowIcon(oldContainerStyle.isShowIcon());
	}

	static void updateSiriusEdgeStyle(EdgeStyle siriusStyle, EdgeStyle newSiriusStyle) {
		newSiriusStyle.setBeginLabelStyle(siriusStyle.getBeginLabelStyle());
		newSiriusStyle.setCentered(siriusStyle.getCentered());
		newSiriusStyle.setCenterLabelStyle(siriusStyle.getCenterLabelStyle());
		newSiriusStyle.setDescription(siriusStyle.getDescription());
		newSiriusStyle.setEndLabelStyle(siriusStyle.getEndLabelStyle());
		newSiriusStyle.setFoldingStyle(siriusStyle.getFoldingStyle());
		newSiriusStyle.setLineStyle(siriusStyle.getLineStyle());
		newSiriusStyle.setRoutingStyle(siriusStyle.getRoutingStyle());
		newSiriusStyle.setSize(siriusStyle.getSize());
		newSiriusStyle.setSourceArrow(siriusStyle.getSourceArrow());
		newSiriusStyle.setStrokeColor(siriusStyle.getStrokeColor());
		newSiriusStyle.setTargetArrow(siriusStyle.getTargetArrow());
		newSiriusStyle.setUid(siriusStyle.getUid());
		newSiriusStyle.getCustomFeatures().clear();
		newSiriusStyle.getCustomFeatures().addAll(siriusStyle.getCustomFeatures());
	}

	public static void updateSiriusNodeContainerWorkspaceImageStyle(WorkspaceImage oldContainerStyle,
			WorkspaceImage containerStyle) {
		containerStyle.setDescription(oldContainerStyle.getDescription());
		containerStyle.setUid(oldContainerStyle.getUid());
		containerStyle.getCustomFeatures().clear();
		containerStyle.getCustomFeatures().addAll(oldContainerStyle.getCustomFeatures());
		containerStyle.setBorderColor(oldContainerStyle.getBorderColor());
		containerStyle.setBorderLineStyle(oldContainerStyle.getBorderLineStyle());
		containerStyle.setBorderSize(oldContainerStyle.getBorderSize());
		containerStyle.setBorderSizeComputationExpression(oldContainerStyle.getBorderSizeComputationExpression());
		containerStyle.setHideLabelByDefault(oldContainerStyle.isHideLabelByDefault());
		containerStyle.setIconPath(oldContainerStyle.getIconPath());
		containerStyle.setLabelAlignment(oldContainerStyle.getLabelAlignment());
		containerStyle.setLabelColor(oldContainerStyle.getLabelColor());
		containerStyle.setLabelSize(oldContainerStyle.getLabelSize());
		containerStyle.getLabelFormat().addAll(oldContainerStyle.getLabelFormat());
		containerStyle.setLabelPosition(oldContainerStyle.getLabelPosition());
		containerStyle.setShowIcon(oldContainerStyle.isShowIcon());
	}

	public static void updateSiriusNodeContainerSquareStyle(Square oldContainerStyle, Square containerStyle) {
		containerStyle.setDescription(oldContainerStyle.getDescription());
		containerStyle.setUid(oldContainerStyle.getUid());
		containerStyle.getCustomFeatures().clear();
		containerStyle.getCustomFeatures().addAll(oldContainerStyle.getCustomFeatures());
		containerStyle.setBorderColor(oldContainerStyle.getBorderColor());
		containerStyle.setBorderLineStyle(oldContainerStyle.getBorderLineStyle());
		containerStyle.setBorderSize(oldContainerStyle.getBorderSize());
		containerStyle.setBorderSizeComputationExpression(oldContainerStyle.getBorderSizeComputationExpression());
		containerStyle.setColor(oldContainerStyle.getColor());
		containerStyle.setHeight(oldContainerStyle.getHeight());
		containerStyle.setHideLabelByDefault(oldContainerStyle.isHideLabelByDefault());
		containerStyle.setIconPath(oldContainerStyle.getIconPath());
		containerStyle.setLabelAlignment(oldContainerStyle.getLabelAlignment());
		containerStyle.setLabelColor(oldContainerStyle.getLabelColor());
		containerStyle.setLabelSize(oldContainerStyle.getLabelSize());
		containerStyle.getLabelFormat().addAll(oldContainerStyle.getLabelFormat());
		containerStyle.setShowIcon(oldContainerStyle.isShowIcon());
		containerStyle.setWidth(oldContainerStyle.getWidth());
	}

}
