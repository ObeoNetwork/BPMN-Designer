package org.obeonetwork.bpmn2.design;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


import org.eclipse.bpmn2.impl.TaskImpl;

import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.edit.command.SetCommand;

import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;

import fr.obeo.dsl.viewpoint.DNode;
import fr.obeo.dsl.viewpoint.diagram.business.api.view.ViewpointGMFHelper;




public class LocationListenner extends ResourceSetListenerImpl{

	
	LocationListenner(){
		
		super(NotificationFilter.createNotifierTypeFilter(
				org.eclipse.bpmn2.impl.TaskImpl.class));
		
	}
	
	
	
	public org.eclipse.emf.common.command.Command transactionAboutToCommit(ResourceSetChangeEvent event)
	           throws RollbackException {
	           
	        List commands = new ArrayList();
	       
	       List notificationsList=event.getNotifications();
	        Iterator it=notificationsList.iterator();
	        
	        while (it.hasNext()) {
				NotificationImpl notification =(NotificationImpl) it.next();
				
				TaskImpl task=(TaskImpl) notification.getNotifier();
				
			
				DNode newDNode = (DNode)task;
				
				Node newNode=ViewpointGMFHelper.getGmfNode(newDNode);
				
				Bounds secondBounds= (Bounds)newNode.getLayoutConstraint();
						
					
						
				
				commands.add(SetCommand.create(event.getEditingDomain(),secondBounds ,secondBounds , value));
				
				
				
			}
	        
	        
	        
	     
	        return null;
	}
	
	
	
	
	
	
	
	
	
}
