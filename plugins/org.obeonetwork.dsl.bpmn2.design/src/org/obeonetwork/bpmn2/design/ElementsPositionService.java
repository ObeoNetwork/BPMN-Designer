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


public class ElementsPositionService {
	
	
	public void positionRelativeToCurrent (EObject currentNode, EObject newNode) {
		System.out.println("hello");		
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
			secondBounds.setX(firstBounds.getX() + 100);
			secondBounds.setY(firstBounds.getY());
			
		}
	}
}
