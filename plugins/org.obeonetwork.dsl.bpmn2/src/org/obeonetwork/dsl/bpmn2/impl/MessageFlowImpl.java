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
import org.obeonetwork.dsl.bpmn2.InteractionNode;
import org.obeonetwork.dsl.bpmn2.Message;
import org.obeonetwork.dsl.bpmn2.MessageFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MessageFlowImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MessageFlowImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MessageFlowImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MessageFlowImpl#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageFlowImpl extends BaseElementImpl implements MessageFlow {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.MESSAGE_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.MESSAGE_FLOW__NAME,
				Bpmn2Package.Literals.MESSAGE_FLOW__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.MESSAGE_FLOW__NAME,
				Bpmn2Package.Literals.MESSAGE_FLOW__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode getSourceRef() {
		return (InteractionNode) eDynamicGet(
				Bpmn2Package.MESSAGE_FLOW__SOURCE_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW__SOURCE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode basicGetSourceRef() {
		return (InteractionNode) eDynamicGet(
				Bpmn2Package.MESSAGE_FLOW__SOURCE_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW__SOURCE_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(InteractionNode newSourceRef) {
		eDynamicSet(Bpmn2Package.MESSAGE_FLOW__SOURCE_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW__SOURCE_REF, newSourceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode getTargetRef() {
		return (InteractionNode) eDynamicGet(
				Bpmn2Package.MESSAGE_FLOW__TARGET_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW__TARGET_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode basicGetTargetRef() {
		return (InteractionNode) eDynamicGet(
				Bpmn2Package.MESSAGE_FLOW__TARGET_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW__TARGET_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(InteractionNode newTargetRef) {
		eDynamicSet(Bpmn2Package.MESSAGE_FLOW__TARGET_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW__TARGET_REF, newTargetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessageRef() {
		return (Message) eDynamicGet(Bpmn2Package.MESSAGE_FLOW__MESSAGE_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW__MESSAGE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessageRef() {
		return (Message) eDynamicGet(Bpmn2Package.MESSAGE_FLOW__MESSAGE_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW__MESSAGE_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRef(Message newMessageRef) {
		eDynamicSet(Bpmn2Package.MESSAGE_FLOW__MESSAGE_REF,
				Bpmn2Package.Literals.MESSAGE_FLOW__MESSAGE_REF, newMessageRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.MESSAGE_FLOW__NAME:
			return getName();
		case Bpmn2Package.MESSAGE_FLOW__SOURCE_REF:
			if (resolve)
				return getSourceRef();
			return basicGetSourceRef();
		case Bpmn2Package.MESSAGE_FLOW__TARGET_REF:
			if (resolve)
				return getTargetRef();
			return basicGetTargetRef();
		case Bpmn2Package.MESSAGE_FLOW__MESSAGE_REF:
			if (resolve)
				return getMessageRef();
			return basicGetMessageRef();
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
		case Bpmn2Package.MESSAGE_FLOW__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.MESSAGE_FLOW__SOURCE_REF:
			setSourceRef((InteractionNode) newValue);
			return;
		case Bpmn2Package.MESSAGE_FLOW__TARGET_REF:
			setTargetRef((InteractionNode) newValue);
			return;
		case Bpmn2Package.MESSAGE_FLOW__MESSAGE_REF:
			setMessageRef((Message) newValue);
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
		case Bpmn2Package.MESSAGE_FLOW__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.MESSAGE_FLOW__SOURCE_REF:
			setSourceRef((InteractionNode) null);
			return;
		case Bpmn2Package.MESSAGE_FLOW__TARGET_REF:
			setTargetRef((InteractionNode) null);
			return;
		case Bpmn2Package.MESSAGE_FLOW__MESSAGE_REF:
			setMessageRef((Message) null);
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
		case Bpmn2Package.MESSAGE_FLOW__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT
					.equals(getName());
		case Bpmn2Package.MESSAGE_FLOW__SOURCE_REF:
			return basicGetSourceRef() != null;
		case Bpmn2Package.MESSAGE_FLOW__TARGET_REF:
			return basicGetTargetRef() != null;
		case Bpmn2Package.MESSAGE_FLOW__MESSAGE_REF:
			return basicGetMessageRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageFlowImpl
