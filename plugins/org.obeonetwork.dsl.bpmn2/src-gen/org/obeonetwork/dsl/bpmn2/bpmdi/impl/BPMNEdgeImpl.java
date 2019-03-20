/**
 * <copyright>
 * 
 * Copyright (c) 2011-2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Obeo - initial API and implementation
 * 
 * </copyright>
 */
package org.obeonetwork.dsl.bpmn2.bpmdi.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNEdge;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel;
import org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage;
import org.obeonetwork.dsl.bpmn2.bpmdi.MessageVisibleKind;
import org.obeonetwork.dsl.dd.di.DiagramElement;
import org.obeonetwork.dsl.dd.di.impl.LabeledEdgeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNEdgeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNEdgeImpl#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNEdgeImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNEdgeImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNEdgeImpl#getMessageVisibleKind <em>Message Visible Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMNEdgeImpl extends LabeledEdgeImpl implements BPMNEdge {
	/**
	 * The default value of the '{@link #getMessageVisibleKind() <em>Message Visible Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageVisibleKind()
	 * @generated
	 * @ordered
	 */
	protected static final MessageVisibleKind MESSAGE_VISIBLE_KIND_EDEFAULT = MessageVisibleKind.INITIATING;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnDiPackage.Literals.BPMN_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabel getLabel() {
		return (BPMNLabel) eDynamicGet(BpmnDiPackage.BPMN_EDGE__LABEL, BpmnDiPackage.Literals.BPMN_EDGE__LABEL, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(BPMNLabel newLabel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newLabel, BpmnDiPackage.BPMN_EDGE__LABEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(BPMNLabel newLabel) {
		eDynamicSet(BpmnDiPackage.BPMN_EDGE__LABEL, BpmnDiPackage.Literals.BPMN_EDGE__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getBpmnElement() {
		return (BaseElement) eDynamicGet(BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT,
				BpmnDiPackage.Literals.BPMN_EDGE__BPMN_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetBpmnElement() {
		return (BaseElement) eDynamicGet(BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT,
				BpmnDiPackage.Literals.BPMN_EDGE__BPMN_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmnElement(BaseElement newBpmnElement) {
		eDynamicSet(BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT, BpmnDiPackage.Literals.BPMN_EDGE__BPMN_ELEMENT,
				newBpmnElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement getSourceElement() {
		return (DiagramElement) eDynamicGet(BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT,
				BpmnDiPackage.Literals.BPMN_EDGE__SOURCE_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement basicGetSourceElement() {
		return (DiagramElement) eDynamicGet(BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT,
				BpmnDiPackage.Literals.BPMN_EDGE__SOURCE_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElement(DiagramElement newSourceElement) {
		eDynamicSet(BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT, BpmnDiPackage.Literals.BPMN_EDGE__SOURCE_ELEMENT,
				newSourceElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement getTargetElement() {
		return (DiagramElement) eDynamicGet(BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT,
				BpmnDiPackage.Literals.BPMN_EDGE__TARGET_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement basicGetTargetElement() {
		return (DiagramElement) eDynamicGet(BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT,
				BpmnDiPackage.Literals.BPMN_EDGE__TARGET_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetElement(DiagramElement newTargetElement) {
		eDynamicSet(BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT, BpmnDiPackage.Literals.BPMN_EDGE__TARGET_ELEMENT,
				newTargetElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageVisibleKind getMessageVisibleKind() {
		return (MessageVisibleKind) eDynamicGet(BpmnDiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND,
				BpmnDiPackage.Literals.BPMN_EDGE__MESSAGE_VISIBLE_KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageVisibleKind(MessageVisibleKind newMessageVisibleKind) {
		eDynamicSet(BpmnDiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND,
				BpmnDiPackage.Literals.BPMN_EDGE__MESSAGE_VISIBLE_KIND, newMessageVisibleKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BpmnDiPackage.BPMN_EDGE__LABEL:
			return basicSetLabel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BpmnDiPackage.BPMN_EDGE__LABEL:
			return getLabel();
		case BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT:
			if (resolve)
				return getBpmnElement();
			return basicGetBpmnElement();
		case BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT:
			if (resolve)
				return getSourceElement();
			return basicGetSourceElement();
		case BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT:
			if (resolve)
				return getTargetElement();
			return basicGetTargetElement();
		case BpmnDiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND:
			return getMessageVisibleKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BpmnDiPackage.BPMN_EDGE__LABEL:
			setLabel((BPMNLabel) newValue);
			return;
		case BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT:
			setBpmnElement((BaseElement) newValue);
			return;
		case BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT:
			setSourceElement((DiagramElement) newValue);
			return;
		case BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT:
			setTargetElement((DiagramElement) newValue);
			return;
		case BpmnDiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND:
			setMessageVisibleKind((MessageVisibleKind) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BpmnDiPackage.BPMN_EDGE__LABEL:
			setLabel((BPMNLabel) null);
			return;
		case BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT:
			setBpmnElement((BaseElement) null);
			return;
		case BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT:
			setSourceElement((DiagramElement) null);
			return;
		case BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT:
			setTargetElement((DiagramElement) null);
			return;
		case BpmnDiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND:
			setMessageVisibleKind(MESSAGE_VISIBLE_KIND_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BpmnDiPackage.BPMN_EDGE__LABEL:
			return getLabel() != null;
		case BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT:
			return basicGetBpmnElement() != null;
		case BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT:
			return basicGetSourceElement() != null;
		case BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT:
			return basicGetTargetElement() != null;
		case BpmnDiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND:
			return getMessageVisibleKind() != MESSAGE_VISIBLE_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //BPMNEdgeImpl
