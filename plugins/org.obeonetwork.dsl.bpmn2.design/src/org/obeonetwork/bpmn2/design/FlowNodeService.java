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
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.obeonetwork.bpmn2.design.ui.PopupChoiceSelector;
import org.obeonetwork.bpmn2.design.ui.UiConstants;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Gateway;


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

		return (Gateway) new SiriusElementRefactor(view) {
			@Override
			protected boolean isTransferable(EStructuralFeature feature, EClass targetType) {
				return Bpmn2Package.eINSTANCE.getBaseElement_Id() != feature;
			}
			
			@Override
			protected AbstractNodeMapping getApplicableNodeMapping(AbstractNodeMapping previous, EObject current) {
				// Gateways have several mappings. (For no good reason: only image)
				return current instanceof Gateway
						? getGatewayMapping(previous.eContainer(), current)
						: previous;
			}
		}.transformInto(eClass);
	}
	
	private static AbstractNodeMapping getGatewayMapping(EObject mappingOwner, EObject target) {
		List<NodeMapping> siblingMappings = Collections.emptyList();
		if (mappingOwner instanceof ContainerMapping) {
			siblingMappings = ((ContainerMapping) mappingOwner).getSubNodeMappings();
		} else if (mappingOwner instanceof Layer) {
			siblingMappings = ((Layer) mappingOwner).getNodeMappings();
		}
		String classname = "bpmn2." + target.eClass().getName(); // Notation used in ODesign
		for (NodeMapping mapping : siblingMappings) {
			if (Objects.equals(mapping.getDomainClass(), classname)) {
				return mapping;
			}
		}
		return null;
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
