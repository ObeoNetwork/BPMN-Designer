/**
 * Copyright (c) 2011-2013 Obeo.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import fr.obeo.dsl.viewpoint.DNode;
import fr.obeo.dsl.viewpoint.diagram.business.api.view.ViewPointLayoutDataManager;
import fr.obeo.dsl.viewpoint.diagram.business.api.view.ViewpointGMFHelper;
import fr.obeo.dsl.viewpoint.diagram.business.api.view.refresh.CanonicalSynchronizer;
import fr.obeo.dsl.viewpoint.diagram.business.api.view.refresh.CanonicalSynchronizerFactory;

/**
 * Fix the position of the elements created form a contextual menu.
 * @author atakarabt
 * */
public class ElementsPositionService {
	
	/**
	 * This method fix the position of a new element created from contextual menu.
	 * @param currentNode the node where the contextual menu displayed
	 * @param newNode the new element to create
	 * 
	 * */
	public void positionRelativeToCurrent (EObject currentNode, EObject newNode) {
		if (currentNode instanceof DNode && newNode instanceof DNode) {
			DNode currentDNode = (DNode)currentNode;
			DNode newDNode = (DNode)newNode;
			// Retrieve GMF nodes associated with our graphical nodes
			Node firstNode = ViewpointGMFHelper.getGmfNode(currentDNode);
			Bounds firstBounds= (Bounds)firstNode.getLayoutConstraint();
			// Launch refresh so that GMF view corresponding to the newDNode are created
			CanonicalSynchronizer canonicalSynchronizer = CanonicalSynchronizerFactory.INSTANCE.createCanonicalSynchronizer(firstNode.getDiagram());
			canonicalSynchronizer.synchronize();
			Node secondNode = ViewpointGMFHelper.getGmfNode(newDNode);
			Bounds secondBounds= (Bounds)secondNode.getLayoutConstraint();
			// Make sure that the created view will never be arranged
			Set<View> createdViewsToArrange = ViewPointLayoutDataManager.INSTANCE.getCreatedViewWithCenterLayout().get(secondNode.getDiagram());
			if (createdViewsToArrange != null) {
				createdViewsToArrange.remove(secondNode);
			}
			// Set bounds for this new node
			secondBounds.setX(firstBounds.getX() + 150);
			secondBounds.setY(firstBounds.getY());
			
		}
	}
}