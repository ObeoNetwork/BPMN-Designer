package org.obeonetwork.bpmn2.design;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.BusinessRuleTask;
import org.obeonetwork.dsl.bpmn2.CallActivity;
import org.obeonetwork.dsl.bpmn2.ChoreographyTask;
import org.obeonetwork.dsl.bpmn2.FlowElementsContainer;
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

/**
 * Test and conversion services to operate on Task objects.
 * 
 * @author vrichard
 *
 */
public class TaskService {

	public boolean isLikeScriptTask(final EObject eObject) {

		boolean isLikeScriptTask = eObject instanceof ScriptTask;

		if(!isLikeScriptTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeScriptTask = callActivity.getCalledElementRef() instanceof GlobalScriptTask;
		}

		return isLikeScriptTask;

	}
	
	public boolean isLikeBusinessRuleTask(final EObject eObject) {

		boolean isLikeBusinessRuleTask = eObject instanceof BusinessRuleTask;

		if(!isLikeBusinessRuleTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeBusinessRuleTask = callActivity.getCalledElementRef() instanceof GlobalBusinessRuleTask;
		}

		return isLikeBusinessRuleTask;

	}
	
	public boolean isLikeUserTask(final EObject eObject) {

		boolean isLikeUserTask = eObject instanceof UserTask;

		if(!isLikeUserTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeUserTask = callActivity.getCalledElementRef() instanceof GlobalUserTask;
		}

		return isLikeUserTask;

	}

	public boolean isLikeManualTask(final EObject eObject) {

		boolean isLikeManualTask = eObject instanceof ManualTask;

		if(!isLikeManualTask && eObject instanceof CallActivity) {
			CallActivity callActivity = (CallActivity) eObject;
			isLikeManualTask = callActivity.getCalledElementRef() instanceof GlobalManualTask;
		}

		return isLikeManualTask;

	}

	//<%self.filter("Task")!=null && self.filter("UserTask")==null && self.filter("ServiceTask")==null && self.filter("SendTask")==null && self.filter("ScriptTask")==null && self.filter("ReceiveTask")==null && self.filter("ManualTask")==null && self.filter("BusinessRuleTask")==null && self.filter("CallActivity")==null%>
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
		
		FlowElementsContainer container = (FlowElementsContainer) task.eContainer();
		container.getFlowElements().remove(task);
		container.getFlowElements().add(cloneTask);
		
		return cloneTask;
	}
	
	public Task convertToTask(final EObject eObject) {
		Task cloneTask = null;
		
		if(eObject instanceof Task) {
			if(eObject.getClass().isAssignableFrom(TaskImpl.class)) {
				cloneTask = (Task) eObject;
			} else {
				cloneTask = Bpmn2Factory.eINSTANCE.createTask();
				clone((Task) eObject, cloneTask);
			}
		}				
		
		return cloneTask;
	}
	
	public BusinessRuleTask convertToBusinessRuleTask(final EObject eObject) {
		BusinessRuleTask cloneTask = null;
		
		if(eObject instanceof BusinessRuleTask) {
			cloneTask = (BusinessRuleTask) eObject;
		} else if(eObject instanceof Task) {
			cloneTask = Bpmn2Factory.eINSTANCE.createBusinessRuleTask();
			clone((Task) eObject, cloneTask);
		}
		
		return cloneTask;
	}
	
	public ManualTask convertToManualTask(final EObject eObject) {
		ManualTask cloneTask = null;
		
		if(eObject instanceof ManualTask) {
			cloneTask = (ManualTask) eObject;
		} else if(eObject instanceof Task) {
			cloneTask = Bpmn2Factory.eINSTANCE.createManualTask();
			clone((Task) eObject, cloneTask);
		}
		
		return cloneTask;
	}
	
	public ReceiveTask convertToReceiveTask(final EObject eObject) {
		ReceiveTask cloneTask = null;
		
		if(eObject instanceof ReceiveTask) {
			cloneTask = (ReceiveTask) eObject;
		} else if(eObject instanceof Task) {
			cloneTask = Bpmn2Factory.eINSTANCE.createReceiveTask();
			clone((Task) eObject, cloneTask);
		}
		
		return cloneTask;
	}
	
	public ScriptTask convertToScriptTask(final EObject eObject) {
		ScriptTask cloneTask = null;
		
		if(eObject instanceof ScriptTask) {
			cloneTask = (ScriptTask) eObject;
		} else if(eObject instanceof Task) {
			cloneTask = Bpmn2Factory.eINSTANCE.createScriptTask();
			clone((Task) eObject, cloneTask);
		}
		
		return cloneTask;
	}
	
	public SendTask convertToSendTask(final EObject eObject) {
		SendTask cloneTask = null;
		
		if(eObject instanceof SendTask) {
			cloneTask = (SendTask) eObject;
		} else if(eObject instanceof Task) {
			cloneTask = Bpmn2Factory.eINSTANCE.createSendTask();
			clone((Task) eObject, cloneTask);
		}
		
		return cloneTask;
	}
	
	public ServiceTask convertToServiceTask(final EObject eObject) {
		ServiceTask cloneTask = null;
		
		if(eObject instanceof ServiceTask) {
			cloneTask = (ServiceTask) eObject;
		} else if(eObject instanceof Task) {
			cloneTask = Bpmn2Factory.eINSTANCE.createServiceTask();
			clone((Task) eObject, cloneTask);
		}
		
		return cloneTask;
	}
	
	public UserTask convertToUserTask(final EObject eObject) {
		UserTask cloneTask = null;
		
		if(eObject instanceof UserTask) {
			cloneTask = (UserTask) eObject;
		} else if(eObject instanceof Task) {
			cloneTask = Bpmn2Factory.eINSTANCE.createUserTask();
			clone((Task) eObject, cloneTask);
		}
		
		return cloneTask;
	}
	
}
