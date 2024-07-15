/**
 * Copyright (c) 2011-2019 Obeo.
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

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.obeonetwork.dsl.bpmn2.Lane;
import org.obeonetwork.dsl.bpmn2.LaneSet;

/**
 * Size and position utilities.
 * 
 */
public class ElementsPositionService {

	public void up(Lane lane) {
		LaneSet laneSet = (LaneSet) lane.eContainer();
		int pos = laneSet.getLanes().lastIndexOf(lane);
		if (pos > 0) {
			laneSet.getLanes().move(pos - 1, pos);
		}
	}

	public void down(Lane lane) {
		LaneSet laneSet = (LaneSet) lane.eContainer();
		int pos = laneSet.getLanes().lastIndexOf(lane);
		if (pos < (laneSet.getLanes().size() - 1)) {
			laneSet.getLanes().move(pos + 1, pos);
		}
	}

	public DDiagramElementContainer lanesAutoSize(final DDiagramElementContainer laneSetContainer) {
		Node laneSetNode = SiriusGMFHelper.getGmfNode(laneSetContainer);
		Bounds laneSetBounds = (Bounds) laneSetNode.getLayoutConstraint();
		int laneSetWidth = laneSetBounds.getWidth();
		if (laneSetWidth == -1) {
			return laneSetContainer;
		}

		for (DDiagramElement laneDiagramElement : laneSetContainer.getElements()) {
			if (laneDiagramElement.getTarget() instanceof Lane) {
				Node laneNode = SiriusGMFHelper.getGmfNode(laneDiagramElement);
				Bounds laneBounds = (Bounds) laneNode.getLayoutConstraint();
				laneBounds.setWidth(laneSetWidth - 5);
			}
		}

		DialectManager.INSTANCE.refresh(laneSetContainer.getParentDiagram(), new NullProgressMonitor());

		return laneSetContainer;
	}

	public EObject moveElement(EObject referenceOwner, String referenceName, final EObject element,
			final EObject relativeElement) {
		EStructuralFeature feature = referenceOwner.eClass().getEStructuralFeature(referenceName);
		@SuppressWarnings("unchecked")
		EList<EObject> list = (EList<EObject>) referenceOwner.eGet(feature);

		int relativeIndex = list.indexOf(relativeElement);

		list.move(relativeIndex + 1, element);

		return referenceOwner;
	}

	public EObject moveElementFirstPosition(EObject referenceOwner, String referenceName, final EObject element) {
		EStructuralFeature feature = referenceOwner.eClass().getEStructuralFeature(referenceName);
		@SuppressWarnings("unchecked")
		EList<EObject> list = (EList<EObject>) referenceOwner.eGet(feature);

		list.move(0, element);

		return referenceOwner;
	}

}
