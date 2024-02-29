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
package org.obeonetwork.bpmn2.design;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.obeonetwork.dsl.bpmn2.Association;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.FlowElementsContainer;
import org.obeonetwork.dsl.bpmn2.FlowNode;
import org.obeonetwork.dsl.bpmn2.Gateway;
import org.obeonetwork.dsl.bpmn2.InteractionNode;
import org.obeonetwork.dsl.bpmn2.MessageFlow;


/**
 * Test and conversion services to operate on FlowNode objects.
 * 
 * @author nperansin
 *
 */
public class FlowNodeService {

	public Gateway convertToSpecificGateway(AbstractDNode view, EClass eClass) {
		Gateway previous = (Gateway) view.getTarget();
		if (eClass.equals(previous.eClass())) {
			return previous;
		}
		
		// FIXME 
		// Node position is lost as refresh detect a new content.
		// Instead :
		// - Store gmf-node of node and edges.
		// - Create a view and restore gmf-nodes.
		
		Gateway result = replaceGateway(previous, (Gateway) Bpmn2Factory.eINSTANCE.create(eClass));			
		view.setTarget(result);
		
		return result;
	}
	
	public static Gateway replaceGateway(Gateway previous, Gateway next) {
		next.setGatewayDirection(previous.getGatewayDirection());
		return replaceNode(previous, next);
	}

	public static <N extends FlowNode> N replaceNode(FlowNode previous, N next) {

		next.getCategoryValueRef().addAll(previous.getCategoryValueRef());
		next.getDocumentation().addAll(previous.getDocumentation());
		next.getExtensionDefinitions().addAll(previous.getExtensionDefinitions());
		next.getExtensionValues().addAll(previous.getExtensionValues());
		next.getIncoming().addAll(previous.getIncoming());
		next.getLanes().addAll(previous.getLanes());
		next.getOutgoing().addAll(previous.getOutgoing());

		next.setAuditing(previous.getAuditing());
		next.setId(previous.getId());
		next.setMonitoring(previous.getMonitoring());
		next.setName(previous.getName());

		updateLinks(previous, next);

		FlowElementsContainer container = (FlowElementsContainer) previous.eContainer();
		int index = container.getFlowElements().indexOf(previous);
		container.getFlowElements().add(index, next);
		container.getFlowElements().remove(previous);
		
		return next;
	}

	private static void updateLinks(BaseElement previous, BaseElement next) {
		ECrossReferenceAdapter eCrossReferenceAdapter = ServiceHelper.getCrossReferenceAdapter(previous);
		if (eCrossReferenceAdapter != null) {
			Collection<Setting> inverseReferences = eCrossReferenceAdapter.getInverseReferences(previous);
			for (Setting setting : inverseReferences) {
				EObject object = setting.getEObject();
				if (object instanceof MessageFlow 
						&& previous instanceof InteractionNode
						&& next instanceof InteractionNode) {
					updateMessageFlow((InteractionNode) previous, 
							(InteractionNode) next, (MessageFlow) object);
				} else if (object instanceof Association) {
					updateAssociation(previous, next, (Association) object);
				}
			}
		}
	}

	private static void updateMessageFlow(InteractionNode previous, InteractionNode next, MessageFlow it) {
		if (previous.equals(it.getSourceRef())) {
			it.setSourceRef(next);
		}
		if (previous.equals(it.getTargetRef())) {
			it.setTargetRef(next);
		}
	}

	private static void updateAssociation(BaseElement previous, BaseElement target, Association it) {
		if (previous.equals(it.getSourceRef())) {
			it.setSourceRef(target);
		}
		if (previous.equals(it.getTargetRef())) {
			it.setTargetRef(target);
		}
	}


}
