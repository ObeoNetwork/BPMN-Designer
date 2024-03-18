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

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.obeonetwork.bpmn2.design.refactoring.SiriusElementRefactor;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.BusinessRuleTask;
import org.obeonetwork.dsl.bpmn2.CallActivity;
import org.obeonetwork.dsl.bpmn2.ChoreographyTask;
import org.obeonetwork.dsl.bpmn2.GlobalBusinessRuleTask;
import org.obeonetwork.dsl.bpmn2.GlobalManualTask;
import org.obeonetwork.dsl.bpmn2.GlobalScriptTask;
import org.obeonetwork.dsl.bpmn2.GlobalTask;
import org.obeonetwork.dsl.bpmn2.GlobalUserTask;
import org.obeonetwork.dsl.bpmn2.ManualTask;
import org.obeonetwork.dsl.bpmn2.ReceiveTask;
import org.obeonetwork.dsl.bpmn2.ScriptTask;
import org.obeonetwork.dsl.bpmn2.SendTask;
import org.obeonetwork.dsl.bpmn2.ServiceTask;
import org.obeonetwork.dsl.bpmn2.Task;
import org.obeonetwork.dsl.bpmn2.UserTask;


/**
 * Evaluation and conversion services to operate on Task objects.
 * 
 * @author vrichard
 */
public class TaskService {

	private static final Bpmn2Package PKG = Bpmn2Package.eINSTANCE;
	private static final List<EClass> TASK_CLASSES = Arrays.asList(
			// Order is the same to Gateways Toolsection of VSM
		PKG.getTask(), PKG.getBusinessRuleTask(),
		PKG.getManualTask(), PKG.getReceiveTask(),
		PKG.getScriptTask(), PKG.getSendTask(),
		PKG.getServiceTask(), PKG.getUserTask()
	);
	
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

	private boolean isLikeTask(EObject it, Class<? extends Task> type, Class<? extends GlobalTask> global) {
		return type.isInstance(it)
			|| (it instanceof CallActivity 
					&& global.isInstance(((CallActivity) it).getCalledElementRef()));
	}
	
	public boolean isLikeScriptTask(final EObject eObject) {
		return isLikeTask(eObject, ScriptTask.class, GlobalScriptTask.class);
	}

	public boolean isLikeBusinessRuleTask(final EObject eObject) {
		return isLikeTask(eObject, BusinessRuleTask.class, GlobalBusinessRuleTask.class);
	}

	public boolean isLikeUserTask(final EObject eObject) {
		return isLikeTask(eObject, UserTask.class, GlobalUserTask.class);
	}

	public boolean isLikeManualTask(final EObject eObject) {
		return isLikeTask(eObject, ManualTask.class, GlobalManualTask.class);
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

	/**
	 * Converts a task into another kind.
	 * <p>
	 * Most of related data are restored.
	 * </p>
	 * 
	 * @param view of task
	 * @param eClass class to convert in
	 * @return created task
	 */
	public static Task convertToSpecificTask(DNodeContainer view, EClass eClass) {
		Task previous = (Task) view.getTarget();
		if (eClass.equals(previous.eClass())) {
			return previous;
		}
		
		return (Task) new SiriusElementRefactor(view) {
			@Override
			protected boolean isTransferable(EStructuralFeature feature, EClass targetType) {
				return Bpmn2Package.eINSTANCE.getBaseElement_Id() != feature;
			}
		}.transformInto(eClass);
	}
	



	public void deleteSubProcess(EObject subProcess, DDiagramElementContainer subProcessView) {
		if (ExpandCollapseService.isCollapsed(subProcessView)) {
			ExpandCollapseService.unsetCollapsed(subProcessView);
			ExpandCollapseService.expand(subProcessView);
		}
		EcoreUtil.remove(subProcess);
	}
	
	
	/**
	 * Converts a task in a new type.
	 * <p>
	 * If no task is selected, whole operation is aborted.
	 * </p>
	 * 
	 * @param it task to convert
	 * @param view on which the task is triggered
	 * @return new task
	 */
	public static Task convertToChoosableTask(Task it, DNodeContainer view) {
		return FlowNodeService.applyToChoosableClass(it, TASK_CLASSES, 
				type -> convertToSpecificTask(view, type));
	}
}
