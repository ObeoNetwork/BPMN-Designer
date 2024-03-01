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
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.BoundaryEvent;
import org.obeonetwork.dsl.bpmn2.CallActivity;
import org.obeonetwork.dsl.bpmn2.ComplexGateway;
import org.obeonetwork.dsl.bpmn2.DataInput;
import org.obeonetwork.dsl.bpmn2.DataOutput;
import org.obeonetwork.dsl.bpmn2.Definitions;
import org.obeonetwork.dsl.bpmn2.Event;
import org.obeonetwork.dsl.bpmn2.ExclusiveGateway;
import org.obeonetwork.dsl.bpmn2.FlowNode;
import org.obeonetwork.dsl.bpmn2.Gateway;
import org.obeonetwork.dsl.bpmn2.InclusiveGateway;
import org.obeonetwork.dsl.bpmn2.InputOutputSpecification;
import org.obeonetwork.dsl.bpmn2.ItemAwareElement;
import org.obeonetwork.dsl.bpmn2.Lane;
import org.obeonetwork.dsl.bpmn2.Process;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;
import org.obeonetwork.dsl.bpmn2.SubProcess;
import org.obeonetwork.dsl.bpmn2.Task;

public class ServiceHelper {

	private static final String IS_EXTERNAL_LABEL = "isExternalLabel";

	/**
	 * Return the cross referencer attached to a particular EObject.
	 * 
	 * @param eo EObject
	 * @return the cross referencer if it exists.
	 */
	public static ECrossReferenceAdapter getCrossReferenceAdapter(EObject eo) {
		ECrossReferenceAdapter eCrossReferenceAdapter = null;
		Iterator<Adapter> it = eo.eAdapters().iterator();
		while (eCrossReferenceAdapter == null && it.hasNext()) {
			Adapter adapter = it.next();
			if (adapter instanceof ECrossReferenceAdapter) {
				eCrossReferenceAdapter = (ECrossReferenceAdapter) adapter;
			}
		}
		return eCrossReferenceAdapter;
	}

	public static EObject trace(EObject eObject) {
		System.out.println("Trace(" + eObject + ")");
		return eObject;
	}

	public static Definitions getDefinitionsObject(EObject eObject) {
		if (eObject == null) {
			return null;
		}
		if (eObject instanceof Definitions) {
			return (Definitions) eObject;
		}
		return getDefinitionsObject(eObject.eContainer());
	}

	public static Process getProcess(EObject eObject) {
		if (eObject == null) {
			return null;
		}
		if (eObject instanceof Process) {
			return (Process) eObject;
		}
		return getProcess(eObject.eContainer());
	}

	public static List<BaseElement> getElementsWithExternalLabel(DNodeContainer dNodeContainer) {
		List<BaseElement> result = new ArrayList<BaseElement>();

		Iterator<DDiagramElement> it = dNodeContainer.getElements().iterator();
		while (it.hasNext()) {
			DDiagramElement dde = it.next();
			Object bpmnElement = dde.getTarget();
			if ((bpmnElement instanceof Event) || (bpmnElement instanceof Gateway)
					|| (bpmnElement instanceof ItemAwareElement)) {
				if (!(bpmnElement instanceof BoundaryEvent) && isExternalLabel((DNode) dde)) {
					result.add((BaseElement) bpmnElement);
				}
			} else if ((bpmnElement instanceof Task) || (bpmnElement instanceof SubProcess)
					|| (bpmnElement instanceof CallActivity)) {
				DNodeContainer dNodeTask = (DNodeContainer) dde;
				for (DDiagramElement subDDE : dNodeTask.getElements()) {
					if (subDDE.getTarget() instanceof BoundaryEvent) {
						if (isExternalLabel((DNode) subDDE)) {
							result.add((BaseElement) subDDE.getTarget());
						}
					}
				}
			}
		}

		return result;
	}

	public static boolean isExternalLabel(DNode dNode) {
		if (dNode == null || dNode.getOwnedStyle() == null || dNode.getOwnedStyle().getCustomFeatures() == null) {
			return false;
		}
		return dNode.getOwnedStyle().getCustomFeatures().contains(ServiceHelper.IS_EXTERNAL_LABEL);
	}

	public static void setExternalLabel(DNode dNode) {
		dNode.getStyle().getCustomFeatures().add(IS_EXTERNAL_LABEL);
	}

	public static void setInternalLabel(DNode dNode) {
		dNode.getStyle().getCustomFeatures().remove(IS_EXTERNAL_LABEL);
	}

	public static boolean isDefaultPath(DEdge dEdge) {
		boolean result = false;
		if (dEdge.getTarget() instanceof SequenceFlow) {
			EdgeTarget edgeTarget = dEdge.getSourceNode();
			if (edgeTarget instanceof DNode) {
				DNode dNode = (DNode) edgeTarget;
				if ((dNode.getTarget() instanceof InclusiveGateway)) {
					result = dEdge.getTarget().equals(((InclusiveGateway) dNode.getTarget()).getDefault());
				} else if ((dNode.getTarget() instanceof ExclusiveGateway)) {
					result = dEdge.getTarget().equals(((ExclusiveGateway) dNode.getTarget()).getDefault());
				} else if ((dNode.getTarget() instanceof ComplexGateway)) {
					result = dEdge.getTarget().equals(((ComplexGateway) dNode.getTarget()).getDefault());
				}
			}
		}
		return result;
	}

	public void dropFlowElement(FlowNode element, EObject oldSemanticContainer, EObject newSemanticContainer) {
		if (((oldSemanticContainer instanceof Lane) || (oldSemanticContainer instanceof SubProcess))
				&& ((newSemanticContainer instanceof Lane) || (newSemanticContainer instanceof SubProcess))) {

			if (oldSemanticContainer instanceof Lane) {
				((Lane) oldSemanticContainer).getFlowNodeRefs().remove(element);
			} else if (oldSemanticContainer instanceof SubProcess) {
				((SubProcess) oldSemanticContainer).getFlowElements().remove(element);
			}

			if (newSemanticContainer instanceof Lane) {
				((Lane) newSemanticContainer).getFlowNodeRefs().add(element);
			} else if (newSemanticContainer instanceof SubProcess) {
				((SubProcess) newSemanticContainer).getFlowElements().add(element);
			}
		}
	}

	public List<FlowNode> getFlowNodeElements(EObject container, String className) {
		List<FlowNode> result;
		Class<?> clazz = null;
		try {
			clazz = Class.forName("org.obeonetwork.dsl.bpmn2." + className);//$NON-NLS-1$
		} catch (ClassNotFoundException e) {
			Activator.log(IStatus.ERROR, e.getMessage(), e);
		}
		if (clazz != null) {
			if (container instanceof Lane) {
				result = ((Lane) container).getFlowNodeRefs().stream().filter(clazz::isInstance)
						.map(FlowNode.class::cast).collect(Collectors.toList());
			} else if (container instanceof SubProcess) {
				result = ((SubProcess) container).getFlowElements().stream().filter(clazz::isInstance)
						.map(FlowNode.class::cast).collect(Collectors.toList());
			} else {
				result = List.of();
			}
		} else {
			result = List.of();
		}
		return result;
	}

	public List<DataInput> getDataInputs(EObject container) {
		List<DataInput> result = List.of();
		if (container instanceof Lane && ((Lane) container).getPartitionElement() instanceof InputOutputSpecification) {
			InputOutputSpecification ioSpec = (InputOutputSpecification) ((Lane) container).getPartitionElement();
			if (ioSpec != null) {
				result = ioSpec.getDataInputs();
			}
		} else if (container instanceof SubProcess) {
			InputOutputSpecification ioSpec = ((SubProcess) container).getIoSpecification();
			if (ioSpec != null) {
				result = ioSpec.getDataInputs();
			}
		}
		return result;
	}

	public List<DataOutput> getDataOutputs(EObject container) {
		List<DataOutput> result = List.of();
		if (container instanceof Lane && ((Lane) container).getPartitionElement() instanceof InputOutputSpecification) {
			InputOutputSpecification ioSpec = (InputOutputSpecification) ((Lane) container).getPartitionElement();
			if (ioSpec != null) {
				result = ioSpec.getDataOutputs();
			}
		} else if (container instanceof SubProcess) {
			InputOutputSpecification ioSpec = ((SubProcess) container).getIoSpecification();
			if (ioSpec != null) {
				result = ioSpec.getDataOutputs();
			}
		}
		return result;
	}
	
	/**
	 * Aborts a Sirius operation.
	 * 
	 * @param context of operation
	 * @throws OperationCanceledException always
	 */
	public static void abortOperation(EObject context) throws OperationCanceledException {
		TransactionalEditingDomain edt = Session.of(context).get().getTransactionalEditingDomain();
		// Cancel Operation does not cancel !! 
		// ChangeContext catches them all !!
		// What a trainer ...
		((InternalTransactionalEditingDomain) edt).getActiveTransaction().abort(Status.CANCEL_STATUS);
		// This hacks prevent history pollution.
		throw new OperationCanceledException();
	}

}
