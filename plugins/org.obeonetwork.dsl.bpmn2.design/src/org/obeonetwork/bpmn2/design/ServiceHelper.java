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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.BoundaryEvent;
import org.obeonetwork.dsl.bpmn2.CallActivity;
import org.obeonetwork.dsl.bpmn2.Definitions;
import org.obeonetwork.dsl.bpmn2.Event;
import org.obeonetwork.dsl.bpmn2.Gateway;
import org.obeonetwork.dsl.bpmn2.ItemAwareElement;
import org.obeonetwork.dsl.bpmn2.Process;
import org.obeonetwork.dsl.bpmn2.SubProcess;
import org.obeonetwork.dsl.bpmn2.Task;

public class ServiceHelper {

	private static final String IS_EXTERNAL_LABEL = "isExternalLabel";

	/**
	 * Return the cross referencer attached to a particular EObject.
	 * 
	 * @param eo
	 *            EObject
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
		if(dNode==null || dNode.getOwnedStyle()==null || dNode.getOwnedStyle().getCustomFeatures()==null) {
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

}
