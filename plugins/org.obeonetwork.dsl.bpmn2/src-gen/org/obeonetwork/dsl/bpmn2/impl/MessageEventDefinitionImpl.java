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

import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Message;
import org.obeonetwork.dsl.bpmn2.MessageEventDefinition;
import org.obeonetwork.dsl.bpmn2.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MessageEventDefinitionImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MessageEventDefinitionImpl#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageEventDefinitionImpl extends EventDefinitionImpl implements
		MessageEventDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.MESSAGE_EVENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessageRef() {
		return (Message) eDynamicGet(
				Bpmn2Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF,
				Bpmn2Package.Literals.MESSAGE_EVENT_DEFINITION__MESSAGE_REF,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessageRef() {
		return (Message) eDynamicGet(
				Bpmn2Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF,
				Bpmn2Package.Literals.MESSAGE_EVENT_DEFINITION__MESSAGE_REF,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRef(Message newMessageRef) {
		eDynamicSet(Bpmn2Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF,
				Bpmn2Package.Literals.MESSAGE_EVENT_DEFINITION__MESSAGE_REF,
				newMessageRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperationRef() {
		return (Operation) eDynamicGet(
				Bpmn2Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF,
				Bpmn2Package.Literals.MESSAGE_EVENT_DEFINITION__OPERATION_REF,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperationRef() {
		return (Operation) eDynamicGet(
				Bpmn2Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF,
				Bpmn2Package.Literals.MESSAGE_EVENT_DEFINITION__OPERATION_REF,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationRef(Operation newOperationRef) {
		eDynamicSet(Bpmn2Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF,
				Bpmn2Package.Literals.MESSAGE_EVENT_DEFINITION__OPERATION_REF,
				newOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF:
			if (resolve)
				return getMessageRef();
			return basicGetMessageRef();
		case Bpmn2Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF:
			if (resolve)
				return getOperationRef();
			return basicGetOperationRef();
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
		case Bpmn2Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF:
			setMessageRef((Message) newValue);
			return;
		case Bpmn2Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF:
			setOperationRef((Operation) newValue);
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
		case Bpmn2Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF:
			setMessageRef((Message) null);
			return;
		case Bpmn2Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF:
			setOperationRef((Operation) null);
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
		case Bpmn2Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF:
			return basicGetMessageRef() != null;
		case Bpmn2Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF:
			return basicGetOperationRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageEventDefinitionImpl
