package org.obeonetwork.bpmn2.design;

import org.eclipse.emf.ecore.EObject;
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
import org.obeonetwork.dsl.bpmn2.impl.TaskImpl;

public class TaskLikeService {

	public boolean isLikeScriptTask(EObject eObject) {

		boolean isLikeScriptTask = eObject instanceof ScriptTask;

		if(!isLikeScriptTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeScriptTask = callActivity.getCalledElementRef() instanceof GlobalScriptTask;
		}

		return isLikeScriptTask;

	}
	
	public boolean isLikeBusinessRuleTask(EObject eObject) {

		boolean isLikeBusinessRuleTask = eObject instanceof BusinessRuleTask;

		if(!isLikeBusinessRuleTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeBusinessRuleTask = callActivity.getCalledElementRef() instanceof GlobalBusinessRuleTask;
		}

		return isLikeBusinessRuleTask;

	}
	
	public boolean isLikeUserTask(EObject eObject) {

		boolean isLikeUserTask = eObject instanceof UserTask;

		if(!isLikeUserTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeUserTask = callActivity.getCalledElementRef() instanceof GlobalUserTask;
		}

		return isLikeUserTask;

	}

	public boolean isLikeManualTask(EObject eObject) {

		boolean isLikeManualTask = eObject instanceof ManualTask;

		if(!isLikeManualTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeManualTask = callActivity.getCalledElementRef() instanceof GlobalManualTask;
		}

		return isLikeManualTask;

	}

	//<%self.filter("Task")!=null && self.filter("UserTask")==null && self.filter("ServiceTask")==null && self.filter("SendTask")==null && self.filter("ScriptTask")==null && self.filter("ReceiveTask")==null && self.filter("ManualTask")==null && self.filter("BusinessRuleTask")==null && self.filter("CallActivity")==null%>
	public boolean isLikeTask(EObject eObject) {
		return eObject instanceof Task && eObject.getClass().isAssignableFrom(TaskImpl.class);
	}
	
	public boolean isLikeReceiveTask(EObject eObject) {
		return eObject instanceof ReceiveTask;
	}
	
	public boolean isLikeSendTask(EObject eObject) {
		return eObject instanceof SendTask;
	}
	
	public boolean isLikeServiceTask(EObject eObject) {
		return eObject instanceof ServiceTask;
	}
	
	public boolean isLikeChoreographyTask(EObject eObject) {
		return eObject instanceof ChoreographyTask;
	}
	
}
