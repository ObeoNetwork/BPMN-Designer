package org.obeonetwork.bpmn2.design;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;

import fr.obeo.dsl.viewpoint.DNode;
import fr.obeo.dsl.viewpoint.diagram.business.api.view.ViewpointGMFHelper;


public class DiagramServices {
	
	public void locateRelativeToCurrent(EObject currentNode, EObject newNode) {
		System.out.println("hello");
		if (currentNode instanceof DNode && newNode instanceof DNode) {
			DNode currentDNode = (DNode)currentNode;
			DNode newDNode = (DNode)newNode;
			
			
	
			
			// Retrieve GMF nodes associated with our graphical nodes
			Node firstNode = ViewpointGMFHelper.getGmfNode(currentDNode);
		
			Node secondNode = ViewpointGMFHelper.getGmfNode(newDNode);
			
			
			
			
			Bounds firstBounds= (Bounds)firstNode.getLayoutConstraint();
			Bounds secondBounds= (Bounds)secondNode.getLayoutConstraint();
						
		
			
			
			

			
			secondBounds.setX(firstBounds.getX() + 5);
			secondBounds.setY(firstBounds.getY() + 5);
		}

	}
}