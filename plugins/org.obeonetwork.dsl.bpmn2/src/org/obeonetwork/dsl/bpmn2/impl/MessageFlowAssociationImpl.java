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
package org.obeonetwork.dsl.bpmn2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.MessageFlow;
import org.obeonetwork.dsl.bpmn2.MessageFlowAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Flow Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MessageFlowAssociationImpl#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MessageFlowAssociationImpl#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageFlowAssociationImpl extends BaseElementImpl implements
		MessageFlowAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageFlowAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.MESSAGE_FLOW_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow getInnerMessageFlowRef() {
		return (MessageFlow) eDynamicGet(
				Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow basicGetInnerMessageFlowRef() {
		return (MessageFlow) eDynamicGet(
				Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerMessageFlowRef(MessageFlow newInnerMessageFlowRef) {
		eDynamicSet(
				Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF,
				newInnerMessageFlowRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow getOuterMessageFlowRef() {
		return (MessageFlow) eDynamicGet(
				Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow basicGetOuterMessageFlowRef() {
		return (MessageFlow) eDynamicGet(
				Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterMessageFlowRef(MessageFlow newOuterMessageFlowRef) {
		eDynamicSet(
				Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF,
				newOuterMessageFlowRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF:
			if (resolve)
				return getInnerMessageFlowRef();
			return basicGetInnerMessageFlowRef();
		case Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF:
			if (resolve)
				return getOuterMessageFlowRef();
			return basicGetOuterMessageFlowRef();
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
		case Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF:
			setInnerMessageFlowRef((MessageFlow) newValue);
			return;
		case Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF:
			setOuterMessageFlowRef((MessageFlow) newValue);
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
		case Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF:
			setInnerMessageFlowRef((MessageFlow) null);
			return;
		case Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF:
			setOuterMessageFlowRef((MessageFlow) null);
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
		case Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF:
			return basicGetInnerMessageFlowRef() != null;
		case Bpmn2Package.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF:
			return basicGetOuterMessageFlowRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageFlowAssociationImpl
