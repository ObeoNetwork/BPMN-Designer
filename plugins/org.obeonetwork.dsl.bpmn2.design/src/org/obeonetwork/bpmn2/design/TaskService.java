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

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.obeonetwork.dsl.bpmn2.Association;
import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.BusinessRuleTask;
import org.obeonetwork.dsl.bpmn2.CallActivity;
import org.obeonetwork.dsl.bpmn2.ChoreographyTask;
import org.obeonetwork.dsl.bpmn2.FlowElementsContainer;
import org.obeonetwork.dsl.bpmn2.GlobalBusinessRuleTask;
import org.obeonetwork.dsl.bpmn2.GlobalManualTask;
import org.obeonetwork.dsl.bpmn2.GlobalScriptTask;
import org.obeonetwork.dsl.bpmn2.GlobalUserTask;
import org.obeonetwork.dsl.bpmn2.ManualTask;
import org.obeonetwork.dsl.bpmn2.MessageFlow;
import org.obeonetwork.dsl.bpmn2.ReceiveTask;
import org.obeonetwork.dsl.bpmn2.ScriptTask;
import org.obeonetwork.dsl.bpmn2.SendTask;
import org.obeonetwork.dsl.bpmn2.ServiceTask;
import org.obeonetwork.dsl.bpmn2.Task;
import org.obeonetwork.dsl.bpmn2.UserTask;
import org.obeonetwork.dsl.bpmn2.impl.TaskImpl;

/**
 * Test and conversion services to operate on Task objects.
 * 
 * @author vrichard
 *
 */
public class TaskService {

	public String getLabel(Task task, boolean borderedNodes) {
		String result = " \n \n" + task.getName();
		// if (borderedNodes) {
		// result = " \n" + result;
		// }
		return result;
	}

	public String trimLabel(EObject eo, String newLabel) {
		if (eo instanceof Task) {
			return newLabel.trim();
		}
		return newLabel;
	}

	public boolean isLikeScriptTask(final EObject eObject) {
		boolean isLikeScriptTask = eObject instanceof ScriptTask;
		if (!isLikeScriptTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeScriptTask = callActivity.getCalledElementRef() instanceof GlobalScriptTask;
		}
		return isLikeScriptTask;
	}

	public boolean isLikeBusinessRuleTask(final EObject eObject) {
		boolean isLikeBusinessRuleTask = eObject instanceof BusinessRuleTask;
		if (!isLikeBusinessRuleTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeBusinessRuleTask = callActivity.getCalledElementRef() instanceof GlobalBusinessRuleTask;
		}
		return isLikeBusinessRuleTask;
	}

	public boolean isLikeUserTask(final EObject eObject) {
		boolean isLikeUserTask = eObject instanceof UserTask;
		if (!isLikeUserTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeUserTask = callActivity.getCalledElementRef() instanceof GlobalUserTask;
		}
		return isLikeUserTask;
	}

	public boolean isLikeManualTask(final EObject eObject) {
		boolean isLikeManualTask = eObject instanceof ManualTask;
		if (!isLikeManualTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeManualTask = callActivity.getCalledElementRef() instanceof GlobalManualTask;
		}
		return isLikeManualTask;
	}

	public boolean isLikeTask(final EObject eObject) {
		return eObject instanceof Task && eObject.getClass().isAssignableFrom(TaskImpl.class);
	}

	public boolean isLikeReceiveTask(final EObject eObject) {
		return eObject instanceof ReceiveTask;
	}

	public boolean isLikeSendTask(final EObject eObject) {
		return eObject instanceof SendTask;
	}

	public boolean isLikeServiceTask(final EObject eObject) {
		return eObject instanceof ServiceTask;
	}

	public boolean isLikeChoreographyTask(final EObject eObject) {
		return eObject instanceof ChoreographyTask;
	}

	public Task convertToTask(final DNodeContainer view) {
		Task eObject = (Task) view.getTarget();
		if (!eObject.getClass().isAssignableFrom(TaskImpl.class)) {
			return (Task) convertToSpecificTask((Task) view.getTarget(), Bpmn2Package.eINSTANCE.getTask());
		}
		return eObject;
	}

	public BusinessRuleTask convertToBusinessRuleTask(final DNodeContainer view) {
		return (BusinessRuleTask) convertToSpecificTask((Task) view.getTarget(),
				Bpmn2Package.eINSTANCE.getBusinessRuleTask());
	}

	public ManualTask convertToManualTask(final DNodeContainer view) {
		return (ManualTask) convertToSpecificTask((Task) view.getTarget(), Bpmn2Package.eINSTANCE.getManualTask());
	}

	public ReceiveTask convertToReceiveTask(final DNodeContainer view) {
		return (ReceiveTask) convertToSpecificTask((Task) view.getTarget(), Bpmn2Package.eINSTANCE.getReceiveTask());
	}

	public ScriptTask convertToScriptTask(final DNodeContainer view) {
		return (ScriptTask) convertToSpecificTask((Task) view.getTarget(), Bpmn2Package.eINSTANCE.getScriptTask(),
				view);
	}

	public SendTask convertToSendTask(final DNodeContainer view) {
		return (SendTask) convertToSpecificTask((Task) view.getTarget(), Bpmn2Package.eINSTANCE.getSendTask());
	}

	public ServiceTask convertToServiceTask(final DNodeContainer view) {
		return (ServiceTask) convertToSpecificTask((Task) view.getTarget(), Bpmn2Package.eINSTANCE.getServiceTask());
	}

	public UserTask convertToUserTask(final DNodeContainer view) {
		return (UserTask) convertToSpecificTask((Task) view.getTarget(), Bpmn2Package.eINSTANCE.getUserTask());
	}

	private Task convertToSpecificTask(Task task, EClass eClass) {
		if (eClass.equals(task.eClass())) {
			return task;
		} else {
			Task cloneTask = clone(task, (Task) Bpmn2Factory.eINSTANCE.create(eClass));
			return cloneTask;
		}
	}

	private Task convertToSpecificTask(Task task, EClass eClass, DNodeContainer container) {
		Task result = null;
		if (eClass.equals(task.eClass())) {
			result = task;
		} else {
			Task cloneTask = clone(task, (Task) Bpmn2Factory.eINSTANCE.create(eClass));
			result = cloneTask;
		}
		if (result != null) {
			container.setTarget(result);
		}
		return result;
	}

	private Task clone(Task task, Task cloneTask) {
		cloneTask.getBoundaryEventRefs().addAll(task.getBoundaryEventRefs());
		cloneTask.getCategoryValueRef().addAll(task.getCategoryValueRef());
		cloneTask.getDataInputAssociations().addAll(task.getDataInputAssociations());
		cloneTask.getDataOutputAssociations().addAll(task.getDataOutputAssociations());
		cloneTask.getDocumentation().addAll(task.getDocumentation());
		cloneTask.getExtensionDefinitions().addAll(task.getExtensionDefinitions());
		cloneTask.getExtensionValues().addAll(task.getExtensionValues());
		cloneTask.getIncoming().addAll(task.getIncoming());
		cloneTask.getIncomingConversationLinks().addAll(task.getIncomingConversationLinks());
		cloneTask.getLanes().addAll(task.getLanes());
		cloneTask.getOutgoing().addAll(task.getOutgoing());
		cloneTask.getOutgoingConversationLinks().addAll(task.getOutgoingConversationLinks());
		cloneTask.getProperties().addAll(task.getProperties());
		cloneTask.getResources().addAll(task.getResources());

		cloneTask.setAuditing(task.getAuditing());
		cloneTask.setCompletionQuantity(task.getCompletionQuantity());
		cloneTask.setDefault(task.getDefault());
		cloneTask.setId(task.getId());
		cloneTask.setIoSpecification(task.getIoSpecification());
		cloneTask.setIsForCompensation(task.isIsForCompensation());
		cloneTask.setLoopCharacteristics(task.getLoopCharacteristics());
		cloneTask.setMonitoring(task.getMonitoring());
		cloneTask.setName(task.getName());
		cloneTask.setStartQuantity(task.getStartQuantity());

		updateMessageFlowsAndAssociations(task, cloneTask);

		FlowElementsContainer container = (FlowElementsContainer) task.eContainer();
		container.getFlowElements().remove(task);
		container.getFlowElements().add(cloneTask);

		return cloneTask;
	}

	private void updateMessageFlowsAndAssociations(Task task, Task cloneTask) {
		ECrossReferenceAdapter eCrossReferenceAdapter = ServiceHelper.getCrossReferenceAdapter(task);
		if (eCrossReferenceAdapter != null) {
			Collection<Setting> inverseReferences = eCrossReferenceAdapter.getInverseReferences(task);
			for (Setting setting : inverseReferences) {
				EObject object = setting.getEObject();
				if (object instanceof MessageFlow) {
					updateMessageFlow(task, cloneTask, (MessageFlow) object);
				} else if (object instanceof Association) {
					updateAssociation(task, cloneTask, (Association) object);
				}
			}
		}
	}

	private void updateMessageFlow(Task task, Task cloneTask, MessageFlow messageFlow) {
		if (task.equals(messageFlow.getSourceRef())) {
			messageFlow.setSourceRef(cloneTask);
		}
		if (task.equals(messageFlow.getTargetRef())) {
			messageFlow.setTargetRef(cloneTask);
		}
	}

	private void updateAssociation(Task task, Task cloneTask, Association association) {
		if (task.equals(association.getSourceRef())) {
			association.setSourceRef(cloneTask);
		}
		if (task.equals(association.getTargetRef())) {
			association.setTargetRef(cloneTask);
		}
	}

	public void deleteSubProcess(EObject subProcess, DDiagramElementContainer subProcessView) {
		if (ExpandCollapseService.isCollapsed(subProcessView)) {
			ExpandCollapseService.unsetCollapsed(subProcessView);
			ExpandCollapseService.expand(subProcessView);
		}
		EcoreUtil.remove(subProcess);
	}
}
