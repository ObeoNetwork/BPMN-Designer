/**
 * Copyright (c) 2011-2024 Obeo.
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.BusinessRuleTask;
import org.obeonetwork.dsl.bpmn2.CallActivity;
import org.obeonetwork.dsl.bpmn2.ChoreographyTask;
import org.obeonetwork.dsl.bpmn2.GlobalBusinessRuleTask;
import org.obeonetwork.dsl.bpmn2.GlobalManualTask;
import org.obeonetwork.dsl.bpmn2.GlobalScriptTask;
import org.obeonetwork.dsl.bpmn2.GlobalUserTask;
import org.obeonetwork.dsl.bpmn2.ManualTask;
import org.obeonetwork.dsl.bpmn2.ReceiveTask;
import org.obeonetwork.dsl.bpmn2.ScriptTask;
import org.obeonetwork.dsl.bpmn2.SendTask;
import org.obeonetwork.dsl.bpmn2.ServiceTask;
import org.obeonetwork.dsl.bpmn2.Task;
import org.obeonetwork.dsl.bpmn2.UserTask;


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

	public Task convertToSpecificTask(DNodeContainer view, EClass eClass) {
		Task previous = (Task) view.getTarget();
		if (eClass.equals(previous.eClass())) {
			return previous;
		}
		
		Task result = replaceTask(previous, (Task) Bpmn2Factory.eINSTANCE.create(eClass));			
		
		// FIXME 
		// This breaks EditPart cache and edition state.
		// Instead :
		// - Store gmf-node of node and edges.
		// - Create a view and restore gmf-nodes.
		view.setTarget(result);
		
		// DialectManager.INSTANCE.refresh(container.getParentDiagram(), new NullProgressMonitor()); // No effect
		
		return result;
	}
	
	private Task replaceTask(Task task, Task cloneTask) {
		cloneTask.getBoundaryEventRefs().addAll(task.getBoundaryEventRefs());
		cloneTask.getDataInputAssociations().addAll(task.getDataInputAssociations());
		cloneTask.getDataOutputAssociations().addAll(task.getDataOutputAssociations());
		cloneTask.getIncomingConversationLinks().addAll(task.getIncomingConversationLinks());
		cloneTask.getOutgoingConversationLinks().addAll(task.getOutgoingConversationLinks());
		cloneTask.getProperties().addAll(task.getProperties());
		cloneTask.getResources().addAll(task.getResources());
		cloneTask.setCompletionQuantity(task.getCompletionQuantity());
		cloneTask.setDefault(task.getDefault());
		cloneTask.setIoSpecification(task.getIoSpecification());
		cloneTask.setIsForCompensation(task.isIsForCompensation());
		cloneTask.setLoopCharacteristics(task.getLoopCharacteristics());
		cloneTask.setStartQuantity(task.getStartQuantity());
		
		return FlowNodeService.replaceNode(task, cloneTask);
	}



	public void deleteSubProcess(EObject subProcess, DDiagramElementContainer subProcessView) {
		if (ExpandCollapseService.isCollapsed(subProcessView)) {
			ExpandCollapseService.unsetCollapsed(subProcessView);
			ExpandCollapseService.expand(subProcessView);
		}
		EcoreUtil.remove(subProcess);
	}
}
