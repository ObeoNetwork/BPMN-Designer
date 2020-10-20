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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.obeonetwork.dsl.bpmn2.BoundaryEvent;
import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.ChoreographyTask;
import org.obeonetwork.dsl.bpmn2.Collaboration;
import org.obeonetwork.dsl.bpmn2.ComplexGateway;
import org.obeonetwork.dsl.bpmn2.Definitions;
import org.obeonetwork.dsl.bpmn2.EndEvent;
import org.obeonetwork.dsl.bpmn2.EventBasedGateway;
import org.obeonetwork.dsl.bpmn2.ExclusiveGateway;
import org.obeonetwork.dsl.bpmn2.FlowElement;
import org.obeonetwork.dsl.bpmn2.FlowElementsContainer;
import org.obeonetwork.dsl.bpmn2.FlowNode;
import org.obeonetwork.dsl.bpmn2.ImplicitThrowEvent;
import org.obeonetwork.dsl.bpmn2.InclusiveGateway;
import org.obeonetwork.dsl.bpmn2.InteractionNode;
import org.obeonetwork.dsl.bpmn2.IntermediateCatchEvent;
import org.obeonetwork.dsl.bpmn2.Lane;
import org.obeonetwork.dsl.bpmn2.MessageFlow;
import org.obeonetwork.dsl.bpmn2.ParallelGateway;
import org.obeonetwork.dsl.bpmn2.Process;
import org.obeonetwork.dsl.bpmn2.RootElement;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;
import org.obeonetwork.dsl.bpmn2.StartEvent;
import org.obeonetwork.dsl.bpmn2.SubProcess;
import org.obeonetwork.dsl.bpmn2.Task;

public class ProcessService {

	public static void duplicate(Process process) {

		// Clone the process
		@SuppressWarnings("serial")
		Copier copier = new Copier() {
			@Override
			protected void copyAttribute(EAttribute eAttribute, EObject eObject, EObject copyEObject) {
				if (!eAttribute.isID()) {
					super.copyAttribute(eAttribute, eObject, copyEObject);
				}
			}
		};
		Process clone = (Process) copier.copy(process);
		clone.setName(clone.getName() + " (copy)");
		copier.copyReferences();

		// Clone message flows
		Definitions defs = ServiceHelper.getDefinitionsObject(process);
		for (RootElement root : defs.getRootElements()) {
			if (root instanceof Collaboration) {
				Collaboration collaboration = (Collaboration) root;
				Collection<MessageFlow> newMFs = new ArrayList<MessageFlow>();
				for (MessageFlow mf : collaboration.getMessageFlows()) {
					InteractionNode sourceRef = mf.getSourceRef();
					InteractionNode targetRef = mf.getTargetRef();
					if (copier.containsKey(sourceRef) && copier.containsKey(targetRef)) {
						MessageFlow messageFlowClone = (MessageFlow) copier.copy(mf);
						mf.setSourceRef((InteractionNode) copier.get(sourceRef));
						mf.setTargetRef((InteractionNode) copier.get(targetRef));
						newMFs.add(messageFlowClone);
					}
				}
				collaboration.getMessageFlows().addAll(newMFs);
			}
		}

		// Save process clone
		EObject container = process.eContainer();
		if (container instanceof Definitions) {
			((Definitions) container).getRootElements().add(clone);
		} else {
			((Process) container).getDecomposedBy().add(clone);
		}
	}

	public static void paste(EObject container, EObject containerView, EObject copiedView, EObject copiedElement) {
		// change IDs
		EcoreUtil.setID(copiedElement, EcoreUtil.generateUUID());
		for (Iterator<EObject> iterator = copiedElement.eAllContents(); iterator.hasNext();) {
			EcoreUtil.setID(iterator.next(), EcoreUtil.generateUUID());
		}

		// change Name
		EStructuralFeature nameFeature = copiedElement.eClass().getEStructuralFeature("name"); //$NON-NLS-1$
		if (nameFeature != null) {
			Object name = copiedElement.eGet(nameFeature);
			if (name == null) {
				name = "";
			}
			copiedElement.eSet(nameFeature, name + " (copy)"); // $NON-NLS-1$
		}

		// add to container
		for (EReference containment : container.eClass().getEAllContainments()) {
			if (containment.getEType().equals(copiedElement.eClass())
					|| copiedElement.eClass().getEAllSuperTypes().contains(containment.getEType())) {
				if (containment.isMany()) {
					((EList<EObject>) container.eGet(containment)).add(copiedElement);
				} else {
					container.eSet(containment, copiedElement);
				}
			}
		}
	}

	public EList<FlowElement> getSubElements(EObject eo) {
		if (eo instanceof SubProcess) {
			return ((SubProcess) eo).getFlowElements();
		}
		return null;
	}

	public boolean isApplicableType(EObject element) {
		return isEventTaskOrGateway(element) || isLaneChoregraphyTaskOrSubProcess(element);
	}

	private boolean isEventTaskOrGateway(EObject element) {
		return element instanceof BoundaryEvent || element instanceof ImplicitThrowEvent
				|| element instanceof IntermediateCatchEvent || element instanceof EndEvent
				|| element instanceof StartEvent || element instanceof Task || element instanceof ParallelGateway
				|| element instanceof ExclusiveGateway || element instanceof InclusiveGateway
				|| element instanceof ComplexGateway || element instanceof EventBasedGateway;
	}

	private boolean isLaneChoregraphyTaskOrSubProcess(EObject element) {
		return element instanceof Lane || element instanceof ChoreographyTask || element instanceof SubProcess;
	}

	public EObject createFlowElement(EObject container, String typeToCreate) {
		FlowNode newElement = null;
		if (isEventTaskOrGateway(container)) {
			FlowElementsContainer flowElementsContainer = getFlowElementsContainer(container);
			newElement = createElement(typeToCreate);
			flowElementsContainer.getFlowElements().add(newElement);
			List<Lane> lanes = ((FlowNode) container).getLanes();
			newElement.getLanes().addAll(lanes);
			SequenceFlow sequence = Bpmn2Factory.eINSTANCE.createSequenceFlow();
			flowElementsContainer.getFlowElements().add(sequence);
			sequence.setSourceRef((FlowNode) container);
			sequence.setTargetRef(newElement);
		} else if (isLaneChoregraphyTaskOrSubProcess(container)) {
			if (container instanceof Lane) {
				FlowElementsContainer flowElementsContainer = getFlowElementsContainer(container);
				newElement = createElement(typeToCreate);
				flowElementsContainer.getFlowElements().add(newElement);
				newElement.getLanes().add((Lane) container);
			} else if (container instanceof ChoreographyTask) {
				// TODO Nothing in the odesign migrated
			} else if (container instanceof SubProcess) {
				// TODO Nothing in the odesign migrated
			}
		}
		return newElement;
	}

	private FlowElementsContainer getFlowElementsContainer(EObject eo) {
		FlowElementsContainer result = null;
		if (eo instanceof FlowElementsContainer) {
			result = (FlowElementsContainer) eo;
		} else if (eo.eContainer() != null && !(eo.eContainer() instanceof Resource)) {
			result = getFlowElementsContainer(eo.eContainer());
		}
		return result;
	}

	private FlowNode createElement(String typeToCreate) {
		FlowNode result = null;
		if ("StartEvent".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createStartEvent();
		} else if ("EndEvent".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createEndEvent();
		} else if ("IntermediateCatchEvent".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent();
		} else if ("IntermediateThrowEvent".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent();
		} else if ("Task".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createTask();
			result.setName("Task");
		} else if ("BusinessRuleTask".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createBusinessRuleTask();
			result.setName("Business Rule Task");
		} else if ("ManualTask".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createManualTask();
			result.setName("Manual Task");
		} else if ("ReceiveTask".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createReceiveTask();
			result.setName("Receive Task");
		} else if ("ScriptTask".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createScriptTask();
			result.setName("Script Task");
		} else if ("SendTask".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createSendTask();
			result.setName("Send Task");
		} else if ("ServiceTask".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createServiceTask();
			result.setName("Service Task");
		} else if ("UserTask".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createUserTask();
			result.setName("User Task");
		} else if ("ParallelGateway".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createParallelGateway();
		} else if ("ExclusiveGateway".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createExclusiveGateway();
		} else if ("InclusiveGateway".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createInclusiveGateway();
		} else if ("ComplexGateway".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createComplexGateway();
		} else if ("EventBasedGateway".equals(typeToCreate)) {
			result = Bpmn2Factory.eINSTANCE.createEventBasedGateway();
		}
		return result;
	}

	public void createBoundaryEvent(EObject eObject) {
		if (!(eObject instanceof Task)) {
			return;
		}
		Task task = (Task) eObject;
		if (task.eContainer() instanceof Process) {
			Process process = (Process) task.eContainer();
			BoundaryEvent boundaryEvent = Bpmn2Factory.eINSTANCE.createBoundaryEvent();
			process.getFlowElements().add(boundaryEvent);
			boundaryEvent.setAttachedToRef(task);
			boundaryEvent.getLanes().addAll(task.getLanes());
		} else if (task.eContainer() instanceof SubProcess) {
			SubProcess process = (SubProcess) task.eContainer();
			BoundaryEvent boundaryEvent = Bpmn2Factory.eINSTANCE.createBoundaryEvent();
			process.getFlowElements().add(boundaryEvent);
			boundaryEvent.setAttachedToRef(task);
			boundaryEvent.getLanes().addAll(task.getLanes());
		}
	}

}
