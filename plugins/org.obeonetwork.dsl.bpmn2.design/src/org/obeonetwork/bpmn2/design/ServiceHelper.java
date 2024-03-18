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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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

/**
 * Services for BPMN Viewpoints.
 * 
 * @author sdrapeau
 */
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

	/**
	 * Logs a message with called message.
	 * <p>
	 * This method should only be used will editing VSM. It must be used any
	 * released version.
	 * </p>
	 * 
	 * @param eObject
	 * @return
	 */
	@Deprecated
	public static EObject bpmnDebug(EObject it) {
		System.out.println("Sirius-Debug:" + it);
		return it;
	}

	/**
	 * Gets the Definition ancestor.
	 * 
	 * @param it element to get definitions from
	 * @return definition container or null
	 */
	public static Definitions getDefinitionsObject(EObject it) {
		return getAncestor(Definitions.class, it);
	}

	/**
	 * Gets the Process ancestor.
	 * 
	 * @param it element to get the process from
	 * @return definition container or null
	 */
	public static Process getProcess(EObject it) {
		return getAncestor(Process.class, it);
	}

	@SuppressWarnings("unchecked")
	private static <T extends EObject> T getAncestor(Class<T> type, EObject it) {
		return it == null || type.isInstance(it) ? (T) it : getAncestor(type, it.eContainer());
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
		if (dNode != null && ServiceHelper.IS_EXTERNAL_LABEL.equals(dNode.getTooltipText())) {
			//Crapy code used when the type of a Task or a Gateway is changed.
			if (dNode.getStyle() != null || dNode.getOwnedStyle().getCustomFeatures() != null) {
				setExternalLabel(dNode);
			} else {
				return true;
			}
		}
		if (dNode == null || dNode.getOwnedStyle() == null || dNode.getOwnedStyle().getCustomFeatures() == null) {
			return false;
		}
		return dNode.getOwnedStyle().getCustomFeatures().contains(ServiceHelper.IS_EXTERNAL_LABEL);
	}

	public static void setExternalLabelInTooltip(DNode dNode) {
		//Crapy code used when the type of a Task or a Gateway is changed.
		dNode.setTooltipText(IS_EXTERNAL_LABEL);
	}
	
	public static void setExternalLabel(DNode dNode) {
		dNode.getStyle().getCustomFeatures().add(IS_EXTERNAL_LABEL);
		//Crapy code used when the type of a Task or a Gateway is changed.
		setExternalLabelInTooltip(dNode);
	}

	public static void setInternalLabel(DNode dNode) {
		dNode.getStyle().getCustomFeatures().remove(IS_EXTERNAL_LABEL);
		//Crapy code used when the type of a Task or a Gateway is changed.
		dNode.setTooltipText("");
	}

	public static boolean isDefaultPath(DEdge dEdge) {
		boolean result = false;
		if (dEdge.getTarget() instanceof SequenceFlow && dEdge.getSourceNode() instanceof DNode) {
			DNode source = (DNode) dEdge.getSourceNode();
			if (source.getTarget() instanceof Gateway) {
				result = Objects.equals(dEdge.getTarget(), getGatewayDefault((Gateway) source.getTarget()));
			}
		}
		return result;
	}

	private static SequenceFlow getGatewayDefault(Gateway it) {
		SequenceFlow result = null;
		if (it instanceof InclusiveGateway) {
			result = ((InclusiveGateway) it).getDefault();
		} else if (it instanceof ExclusiveGateway) {
			result = ((ExclusiveGateway) it).getDefault();
		} else if (it instanceof ComplexGateway) {
			result = ((ComplexGateway) it).getDefault();
		}
		return result;
	}

	/**
	 * Moves a flow node from a container to another container.
	 * 
	 * @param element              to mode
	 * @param oldSemanticContainer old container
	 * @param newSemanticContainer new container
	 */
	public void dropFlowElement(FlowNode element, EObject oldSemanticContainer, EObject newSemanticContainer) {
		List<? super FlowNode> oldContainment = getFlowNodeContainment(oldSemanticContainer);
		List<? super FlowNode> newContainment = getFlowNodeContainment(newSemanticContainer);
		if (oldContainment != null && newContainment != null) {
			oldContainment.remove(element);
			newContainment.add(element);
		}
	}

	private List<? super FlowNode> getFlowNodeContainment(EObject container) {
		if (container instanceof Lane) {
			return ((Lane) container).getFlowNodeRefs();
		} else if (container instanceof SubProcess) {
			return ((SubProcess) container).getFlowElements();
		}
		// no empty list to indicate containment is not possible
		return null;
	}

	public List<FlowNode> getFlowNodeElements(EObject container, String className) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName("org.obeonetwork.dsl.bpmn2." + className);//$NON-NLS-1$
		} catch (ClassNotFoundException e) {
			Activator.log(IStatus.ERROR, e.getMessage(), e);
			return Collections.emptyList();
		}

		List<?> elements = getFlowNodeContainment(container);
		return elements == null ? Collections.emptyList()
				: elements.stream().filter(clazz::isInstance).map(FlowNode.class::cast).collect(Collectors.toList());
	}

	public List<DataInput> getDataInputs(EObject container) {
		InputOutputSpecification ioSpec = getIoSpecification(container);
		return ioSpec != null ? ioSpec.getDataInputs() : Collections.emptyList();
	}

	public List<DataOutput> getDataOutputs(EObject container) {
		InputOutputSpecification ioSpec = getIoSpecification(container);
		return ioSpec != null ? ioSpec.getDataOutputs() : Collections.emptyList();
	}

	private InputOutputSpecification getIoSpecification(EObject container) {
		if (container instanceof Lane && ((Lane) container).getPartitionElement() instanceof InputOutputSpecification) {
			return (InputOutputSpecification) ((Lane) container).getPartitionElement();
		} else if (container instanceof SubProcess) {
			return ((SubProcess) container).getIoSpecification();
		}
		return null;
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
