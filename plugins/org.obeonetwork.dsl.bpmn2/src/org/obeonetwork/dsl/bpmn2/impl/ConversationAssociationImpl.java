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
import org.obeonetwork.dsl.bpmn2.ConversationAssociation;
import org.obeonetwork.dsl.bpmn2.ConversationNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ConversationAssociationImpl#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ConversationAssociationImpl#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversationAssociationImpl extends BaseElementImpl implements
		ConversationAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversationAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.CONVERSATION_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNode getInnerConversationNodeRef() {
		return (ConversationNode) eGet(
				Bpmn2Package.Literals.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerConversationNodeRef(
			ConversationNode newInnerConversationNodeRef) {
		eSet(Bpmn2Package.Literals.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF,
				newInnerConversationNodeRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNode getOuterConversationNodeRef() {
		return (ConversationNode) eGet(
				Bpmn2Package.Literals.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterConversationNodeRef(
			ConversationNode newOuterConversationNodeRef) {
		eSet(Bpmn2Package.Literals.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF,
				newOuterConversationNodeRef);
	}

} //ConversationAssociationImpl
