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
import org.obeonetwork.dsl.bpmn2.Message;
import org.obeonetwork.dsl.bpmn2.Operation;
import org.obeonetwork.dsl.bpmn2.ReceiveTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ReceiveTaskImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ReceiveTaskImpl#isInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ReceiveTaskImpl#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ReceiveTaskImpl#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveTaskImpl extends TaskImpl implements ReceiveTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.RECEIVE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementation() {
		return (String) eGet(
				Bpmn2Package.Literals.RECEIVE_TASK__IMPLEMENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(String newImplementation) {
		eSet(Bpmn2Package.Literals.RECEIVE_TASK__IMPLEMENTATION,
				newImplementation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstantiate() {
		return (Boolean) eGet(Bpmn2Package.Literals.RECEIVE_TASK__INSTANTIATE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiate(boolean newInstantiate) {
		eSet(Bpmn2Package.Literals.RECEIVE_TASK__INSTANTIATE, newInstantiate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperationRef() {
		return (Operation) eGet(
				Bpmn2Package.Literals.RECEIVE_TASK__OPERATION_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationRef(Operation newOperationRef) {
		eSet(Bpmn2Package.Literals.RECEIVE_TASK__OPERATION_REF, newOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessageRef() {
		return (Message) eGet(Bpmn2Package.Literals.RECEIVE_TASK__MESSAGE_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRef(Message newMessageRef) {
		eSet(Bpmn2Package.Literals.RECEIVE_TASK__MESSAGE_REF, newMessageRef);
	}

} //ReceiveTaskImpl
