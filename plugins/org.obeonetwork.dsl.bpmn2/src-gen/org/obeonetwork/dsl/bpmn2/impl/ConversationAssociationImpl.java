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
		return (ConversationNode) eDynamicGet(
				Bpmn2Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF,
				Bpmn2Package.Literals.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNode basicGetInnerConversationNodeRef() {
		return (ConversationNode) eDynamicGet(
				Bpmn2Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF,
				Bpmn2Package.Literals.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerConversationNodeRef(
			ConversationNode newInnerConversationNodeRef) {
		eDynamicSet(
				Bpmn2Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF,
				Bpmn2Package.Literals.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF,
				newInnerConversationNodeRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNode getOuterConversationNodeRef() {
		return (ConversationNode) eDynamicGet(
				Bpmn2Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF,
				Bpmn2Package.Literals.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNode basicGetOuterConversationNodeRef() {
		return (ConversationNode) eDynamicGet(
				Bpmn2Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF,
				Bpmn2Package.Literals.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterConversationNodeRef(
			ConversationNode newOuterConversationNodeRef) {
		eDynamicSet(
				Bpmn2Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF,
				Bpmn2Package.Literals.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF,
				newOuterConversationNodeRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
			if (resolve)
				return getInnerConversationNodeRef();
			return basicGetInnerConversationNodeRef();
		case Bpmn2Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
			if (resolve)
				return getOuterConversationNodeRef();
			return basicGetOuterConversationNodeRef();
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
		case Bpmn2Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
			setInnerConversationNodeRef((ConversationNode) newValue);
			return;
		case Bpmn2Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
			setOuterConversationNodeRef((ConversationNode) newValue);
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
		case Bpmn2Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
			setInnerConversationNodeRef((ConversationNode) null);
			return;
		case Bpmn2Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
			setOuterConversationNodeRef((ConversationNode) null);
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
		case Bpmn2Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
			return basicGetInnerConversationNodeRef() != null;
		case Bpmn2Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
			return basicGetOuterConversationNodeRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConversationAssociationImpl
