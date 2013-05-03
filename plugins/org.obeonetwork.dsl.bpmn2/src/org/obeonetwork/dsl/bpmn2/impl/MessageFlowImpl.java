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
		return (String) eGet(Bpmn2Package.Literals.MESSAGE_FLOW__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(Bpmn2Package.Literals.MESSAGE_FLOW__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode getSourceRef() {
		return (InteractionNode) eGet(
				Bpmn2Package.Literals.MESSAGE_FLOW__SOURCE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(InteractionNode newSourceRef) {
		eSet(Bpmn2Package.Literals.MESSAGE_FLOW__SOURCE_REF, newSourceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode getTargetRef() {
		return (InteractionNode) eGet(
				Bpmn2Package.Literals.MESSAGE_FLOW__TARGET_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(InteractionNode newTargetRef) {
		eSet(Bpmn2Package.Literals.MESSAGE_FLOW__TARGET_REF, newTargetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessageRef() {
		return (Message) eGet(Bpmn2Package.Literals.MESSAGE_FLOW__MESSAGE_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRef(Message newMessageRef) {
		eSet(Bpmn2Package.Literals.MESSAGE_FLOW__MESSAGE_REF, newMessageRef);
	}

} //MessageFlowImpl
