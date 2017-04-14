package org.obeonetwork.bpmn2.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.obeonetwork.dsl.bpmn2.Collaboration;
import org.obeonetwork.dsl.bpmn2.Definitions;
import org.obeonetwork.dsl.bpmn2.InteractionNode;
import org.obeonetwork.dsl.bpmn2.MessageFlow;
import org.obeonetwork.dsl.bpmn2.Process;
import org.obeonetwork.dsl.bpmn2.RootElement;

public class ProcessService {

	public static EObject trace(EObject eObject) {
		System.out.println("Trace(" + eObject + ")");
		return eObject;
	}

	public static Definitions getDefinitionsObject(EObject eObject) {
		EObject cursor = eObject;
		while (!(cursor instanceof Definitions)) {
			cursor = cursor.eContainer();
		}
		return (Definitions) cursor;
	}

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
		Definitions defs = getDefinitionsObject(process);
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

}