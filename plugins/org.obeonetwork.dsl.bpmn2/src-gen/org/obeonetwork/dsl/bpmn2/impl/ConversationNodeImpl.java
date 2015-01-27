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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ConversationLink;
import org.obeonetwork.dsl.bpmn2.ConversationNode;
import org.obeonetwork.dsl.bpmn2.CorrelationKey;
import org.obeonetwork.dsl.bpmn2.InteractionNode;
import org.obeonetwork.dsl.bpmn2.MessageFlow;
import org.obeonetwork.dsl.bpmn2.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ConversationNodeImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ConversationNodeImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ConversationNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ConversationNodeImpl#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ConversationNodeImpl#getMessageFlowRefs <em>Message Flow Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ConversationNodeImpl#getCorrelationKeys <em>Correlation Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConversationNodeImpl extends BaseElementImpl implements
		ConversationNode {
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
	protected ConversationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.CONVERSATION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConversationLink> getIncomingConversationLinks() {
		return (EList<ConversationLink>) eDynamicGet(
				Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS,
				Bpmn2Package.Literals.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConversationLink> getOutgoingConversationLinks() {
		return (EList<ConversationLink>) eDynamicGet(
				Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS,
				Bpmn2Package.Literals.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.CONVERSATION_NODE__NAME,
				Bpmn2Package.Literals.CONVERSATION_NODE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.CONVERSATION_NODE__NAME,
				Bpmn2Package.Literals.CONVERSATION_NODE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Participant> getParticipantRefs() {
		return (EList<Participant>) eDynamicGet(
				Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS,
				Bpmn2Package.Literals.CONVERSATION_NODE__PARTICIPANT_REFS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageFlow> getMessageFlowRefs() {
		return (EList<MessageFlow>) eDynamicGet(
				Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS,
				Bpmn2Package.Literals.CONVERSATION_NODE__MESSAGE_FLOW_REFS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CorrelationKey> getCorrelationKeys() {
		return (EList<CorrelationKey>) eDynamicGet(
				Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS,
				Bpmn2Package.Literals.CONVERSATION_NODE__CORRELATION_KEYS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingConversationLinks())
					.basicAdd(otherEnd, msgs);
		case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingConversationLinks())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS:
			return ((InternalEList<?>) getIncomingConversationLinks())
					.basicRemove(otherEnd, msgs);
		case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS:
			return ((InternalEList<?>) getOutgoingConversationLinks())
					.basicRemove(otherEnd, msgs);
		case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS:
			return ((InternalEList<?>) getCorrelationKeys()).basicRemove(
					otherEnd, msgs);
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
		case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS:
			return getIncomingConversationLinks();
		case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS:
			return getOutgoingConversationLinks();
		case Bpmn2Package.CONVERSATION_NODE__NAME:
			return getName();
		case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS:
			return getParticipantRefs();
		case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS:
			return getMessageFlowRefs();
		case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS:
			return getCorrelationKeys();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.CONVERSATION_NODE__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS:
			getParticipantRefs().clear();
			getParticipantRefs().addAll(
					(Collection<? extends Participant>) newValue);
			return;
		case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS:
			getMessageFlowRefs().clear();
			getMessageFlowRefs().addAll(
					(Collection<? extends MessageFlow>) newValue);
			return;
		case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS:
			getCorrelationKeys().clear();
			getCorrelationKeys().addAll(
					(Collection<? extends CorrelationKey>) newValue);
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
		case Bpmn2Package.CONVERSATION_NODE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS:
			getParticipantRefs().clear();
			return;
		case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS:
			getMessageFlowRefs().clear();
			return;
		case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS:
			getCorrelationKeys().clear();
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
		case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS:
			return !getIncomingConversationLinks().isEmpty();
		case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS:
			return !getOutgoingConversationLinks().isEmpty();
		case Bpmn2Package.CONVERSATION_NODE__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT
					.equals(getName());
		case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS:
			return !getParticipantRefs().isEmpty();
		case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS:
			return !getMessageFlowRefs().isEmpty();
		case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS:
			return !getCorrelationKeys().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionNode.class) {
			switch (derivedFeatureID) {
			case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS:
				return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
			case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS:
				return Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionNode.class) {
			switch (baseFeatureID) {
			case Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS:
				return Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS;
			case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS:
				return Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConversationNodeImpl
