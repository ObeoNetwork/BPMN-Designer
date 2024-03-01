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

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.obeonetwork.bpmn2.design.ui.PopupChoiceSelector;
import org.obeonetwork.bpmn2.design.ui.UiConstants;
import org.obeonetwork.dsl.bpmn2.Association;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.FlowElementsContainer;
import org.obeonetwork.dsl.bpmn2.FlowNode;
import org.obeonetwork.dsl.bpmn2.Gateway;
import org.obeonetwork.dsl.bpmn2.InteractionNode;
import org.obeonetwork.dsl.bpmn2.MessageFlow;


/**
 * Conversion services to operate on FlowNode objects.
 * 
 * @author nperansin
 *
 */
public class FlowNodeService {
	
	private static final Bpmn2Package PKG = Bpmn2Package.eINSTANCE;
	private static final List<EClass> GATEWAY_CLASSES = Arrays.asList(
			// Order is the same to Gateways Toolsection of VSM
		PKG.getParallelGateway(), PKG.getExclusiveGateway(),
		PKG.getInclusiveGateway(), PKG.getComplexGateway(),
		PKG.getEventBasedGateway()
	);

	/**
	 * Converts a Gateway into another kind.
	 * <p>
	 * Most of related data are restored.
	 * </p>
	 * 
	 * @param view of Gateway
	 * @param eClass class to convert in
	 * @return created Gateway
	 */
	public static Gateway convertToSpecificGateway(AbstractDNode view, EClass eClass) {
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
	
	private static Gateway replaceGateway(Gateway previous, Gateway next) {
		next.setGatewayDirection(previous.getGatewayDirection());
		return replaceNode(previous, next);
	}

	/**
	 * Replace a node by another node.
	 * 
	 * @param <N> type of new node
	 * @param previous node
	 * @param next node
	 * @return next node
	 */
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

	/**
	 * Applies a function with a type choosen by user.
	 * 
	 * @param it context
	 * @param types to choose from
	 * @param transform to apply
	 */
	public static <T> T applyToChoosableClass(EObject it, List<EClass> types, Function<EClass, T> transform) {
		PopupChoiceSelector<EClass> choice = new PopupChoiceSelector<>();
		types.forEach(eClass -> {
			String label = Activator.getI10n().getString(eClass.getName());
			String iconPath = UiConstants.getEditIconPath(eClass);
			choice.addItem(label, iconPath, eClass);
		});
		Optional<EClass> target = choice.perform();
		if (!target.isPresent()) {
			ServiceHelper.abortOperation(it);
		}
		return transform.apply(target.get());
	}
	
	/**
	 * Converts a gateway in a new type.
	 * <p>
	 * If no gateway is selected, whole operation is aborted.
	 * </p>
	 * 
	 * @param it gateway to convert
	 * @param view on which the task is triggered
	 * @return new gateway
	 */
	public static Gateway convertToChoosableGateway(Gateway it, AbstractDNode view) {
		return FlowNodeService.applyToChoosableClass(it, GATEWAY_CLASSES, 
				type -> convertToSpecificGateway(view, type));
	}

}
