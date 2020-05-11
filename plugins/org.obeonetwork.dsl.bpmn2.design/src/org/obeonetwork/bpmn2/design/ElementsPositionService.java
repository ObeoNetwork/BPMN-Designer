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

import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizer;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizerFactory;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusLayoutDataManager;
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

	/**
	 * This method fix the position of a new element created from contextual menu.
	 * 
	 * @param currentNode the node where the contextual menu displayed
	 * @param newNode     the new element to create
	 * 
	 * @author atakarabt
	 */
	public void positionRelativeToCurrent(EObject currentNode, EObject newNode) {
		if (currentNode instanceof DNode && newNode instanceof DNode) {
			DNode currentDNode = (DNode) currentNode;
			DNode newDNode = (DNode) newNode;
			// Retrieve GMF nodes associated with our graphical nodes
			Node firstNode = SiriusGMFHelper.getGmfNode(currentDNode);
			Bounds firstBounds = (Bounds) firstNode.getLayoutConstraint();
			// Launch refresh so that GMF view corresponding to the newDNode are created
			CanonicalSynchronizer canonicalSynchronizer = CanonicalSynchronizerFactory.INSTANCE
					.createCanonicalSynchronizer(firstNode.getDiagram());
			canonicalSynchronizer.synchronize();
			Node secondNode = SiriusGMFHelper.getGmfNode(newDNode);
			Bounds secondBounds = (Bounds) secondNode.getLayoutConstraint();
			// Make sure that the created view will never be arranged
			Set<View> createdViewsToArrange = SiriusLayoutDataManager.INSTANCE.getCreatedViewWithCenterLayout()
					.get(secondNode.getDiagram());
			if (createdViewsToArrange != null) {
				createdViewsToArrange.remove(secondNode);
			}
			// Set bounds for this new node
			secondBounds.setX(firstBounds.getX() + 150);
			secondBounds.setY(firstBounds.getY());

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

		list.move(relativeIndex+1, element);

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
