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
package org.obeonetwork.bpmn2.design.util;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.eclipse.sirius.diagram.FlatContainerStyle;
import org.eclipse.sirius.diagram.Square;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.impl.DiagramFactoryImpl;

public class SiriusStyleCopier {

	public static void updateSiriusNodeContainerFlatContainerStyle(FlatContainerStyle oldContainerStyle,
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

	public static void updateSiriusEdgeStyle(EdgeStyle siriusStyle, EdgeStyle newSiriusStyle) {
		//newSiriusStyle.setBeginLabelStyle(siriusStyle.getBeginLabelStyle());
		newSiriusStyle.setCentered(siriusStyle.getCentered());
		updateSiriusCenterLabelStyle(siriusStyle, newSiriusStyle);
		newSiriusStyle.setDescription(siriusStyle.getDescription());
		//newSiriusStyle.setEndLabelStyle(siriusStyle.getEndLabelStyle());
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

	private static void updateSiriusCenterLabelStyle(EdgeStyle siriusStyle, EdgeStyle newSiriusStyle) {
		if (newSiriusStyle.getCenterLabelStyle() == null && siriusStyle.getCenterLabelStyle() != null) {
			newSiriusStyle.setCenterLabelStyle(DiagramFactoryImpl.eINSTANCE.createCenterLabelStyle());
		}
		if (newSiriusStyle.getCenterLabelStyle() != null && siriusStyle.getCenterLabelStyle() != null) {
			newSiriusStyle.getCenterLabelStyle().setDescription(siriusStyle.getCenterLabelStyle().getDescription());
			newSiriusStyle.getCenterLabelStyle().setIconPath(siriusStyle.getCenterLabelStyle().getIconPath());
			newSiriusStyle.getCenterLabelStyle().setLabelColor(siriusStyle.getCenterLabelStyle().getLabelColor());
			newSiriusStyle.getCenterLabelStyle().setLabelSize(siriusStyle.getCenterLabelStyle().getLabelSize());
			newSiriusStyle.getCenterLabelStyle().setShowIcon(siriusStyle.getCenterLabelStyle().isShowIcon());
			newSiriusStyle.getCenterLabelStyle().getCustomFeatures()
					.addAll(siriusStyle.getCenterLabelStyle().getCustomFeatures());
		}
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
	
	@SuppressWarnings("unchecked")
	public static void updateEdgeStyle(DEdge targetSiriusEdge, Edge targetEdge, EdgeStyle oldSiriusStyle,
			EList<?> oldGMFStyles) {
		if (oldSiriusStyle != null) {
			SiriusStyleCopier.updateSiriusEdgeStyle(oldSiriusStyle, (EdgeStyle) targetSiriusEdge.getStyle());
		}

		targetEdge.getStyles().forEach(newStyle -> {
			Optional<?> oldStyleOpt = oldGMFStyles.stream()
					.filter(oldStyle -> oldStyle.getClass().equals(newStyle.getClass())).findFirst();

			oldStyleOpt.ifPresent(oldStyle -> {
				if (oldStyle instanceof FontStyle && newStyle instanceof FontStyle) {
					GMFStyleCopier.updateFontStyle((FontStyle) oldStyle, (FontStyle) newStyle);
				} else if (oldStyle instanceof ConnectorStyle && newStyle instanceof ConnectorStyle) {
					GMFStyleCopier.updateConnectorStyle((ConnectorStyle) oldStyle, (ConnectorStyle) newStyle);
				}
			});
		});
	}



}
