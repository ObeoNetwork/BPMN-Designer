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
import org.obeonetwork.dsl.bpmn2.Artifact;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Choreography;
import org.obeonetwork.dsl.bpmn2.Collaboration;
import org.obeonetwork.dsl.bpmn2.ConversationAssociation;
import org.obeonetwork.dsl.bpmn2.ConversationLink;
import org.obeonetwork.dsl.bpmn2.ConversationNode;
import org.obeonetwork.dsl.bpmn2.CorrelationKey;
import org.obeonetwork.dsl.bpmn2.MessageFlow;
import org.obeonetwork.dsl.bpmn2.MessageFlowAssociation;
import org.obeonetwork.dsl.bpmn2.Participant;
import org.obeonetwork.dsl.bpmn2.ParticipantAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#getChoreographyRef <em>Choreography Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#getMessageFlowAssociations <em>Message Flow Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#getConversationAssociations <em>Conversation Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#getMessageFlows <em>Message Flows</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#getConversations <em>Conversations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl#getConversationLinks <em>Conversation Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborationImpl extends RootElementImpl implements Collaboration {
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
	 * The default value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLOSED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.COLLABORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.COLLABORATION__NAME, Bpmn2Package.Literals.COLLABORATION__NAME, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.COLLABORATION__NAME, Bpmn2Package.Literals.COLLABORATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsClosed() {
		return (Boolean) eDynamicGet(Bpmn2Package.COLLABORATION__IS_CLOSED,
				Bpmn2Package.Literals.COLLABORATION__IS_CLOSED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClosed(boolean newIsClosed) {
		eDynamicSet(Bpmn2Package.COLLABORATION__IS_CLOSED, Bpmn2Package.Literals.COLLABORATION__IS_CLOSED, newIsClosed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Choreography> getChoreographyRef() {
		return (EList<Choreography>) eDynamicGet(Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF,
				Bpmn2Package.Literals.COLLABORATION__CHOREOGRAPHY_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>) eDynamicGet(Bpmn2Package.COLLABORATION__ARTIFACTS,
				Bpmn2Package.Literals.COLLABORATION__ARTIFACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParticipantAssociation> getParticipantAssociations() {
		return (EList<ParticipantAssociation>) eDynamicGet(Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS,
				Bpmn2Package.Literals.COLLABORATION__PARTICIPANT_ASSOCIATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageFlowAssociation> getMessageFlowAssociations() {
		return (EList<MessageFlowAssociation>) eDynamicGet(Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS,
				Bpmn2Package.Literals.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationAssociation getConversationAssociations() {
		return (ConversationAssociation) eDynamicGet(Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS,
				Bpmn2Package.Literals.COLLABORATION__CONVERSATION_ASSOCIATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversationAssociations(ConversationAssociation newConversationAssociations,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newConversationAssociations,
				Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversationAssociations(ConversationAssociation newConversationAssociations) {
		eDynamicSet(Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS,
				Bpmn2Package.Literals.COLLABORATION__CONVERSATION_ASSOCIATIONS, newConversationAssociations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Participant> getParticipants() {
		return (EList<Participant>) eDynamicGet(Bpmn2Package.COLLABORATION__PARTICIPANTS,
				Bpmn2Package.Literals.COLLABORATION__PARTICIPANTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageFlow> getMessageFlows() {
		return (EList<MessageFlow>) eDynamicGet(Bpmn2Package.COLLABORATION__MESSAGE_FLOWS,
				Bpmn2Package.Literals.COLLABORATION__MESSAGE_FLOWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CorrelationKey> getCorrelationKeys() {
		return (EList<CorrelationKey>) eDynamicGet(Bpmn2Package.COLLABORATION__CORRELATION_KEYS,
				Bpmn2Package.Literals.COLLABORATION__CORRELATION_KEYS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConversationNode> getConversations() {
		return (EList<ConversationNode>) eDynamicGet(Bpmn2Package.COLLABORATION__CONVERSATIONS,
				Bpmn2Package.Literals.COLLABORATION__CONVERSATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConversationLink> getConversationLinks() {
		return (EList<ConversationLink>) eDynamicGet(Bpmn2Package.COLLABORATION__CONVERSATION_LINKS,
				Bpmn2Package.Literals.COLLABORATION__CONVERSATION_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.COLLABORATION__ARTIFACTS:
			return ((InternalEList<?>) getArtifacts()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
			return ((InternalEList<?>) getParticipantAssociations()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
			return ((InternalEList<?>) getMessageFlowAssociations()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
			return basicSetConversationAssociations(null, msgs);
		case Bpmn2Package.COLLABORATION__PARTICIPANTS:
			return ((InternalEList<?>) getParticipants()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.COLLABORATION__MESSAGE_FLOWS:
			return ((InternalEList<?>) getMessageFlows()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.COLLABORATION__CORRELATION_KEYS:
			return ((InternalEList<?>) getCorrelationKeys()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.COLLABORATION__CONVERSATIONS:
			return ((InternalEList<?>) getConversations()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.COLLABORATION__CONVERSATION_LINKS:
			return ((InternalEList<?>) getConversationLinks()).basicRemove(otherEnd, msgs);
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
		case Bpmn2Package.COLLABORATION__NAME:
			return getName();
		case Bpmn2Package.COLLABORATION__IS_CLOSED:
			return isIsClosed();
		case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF:
			return getChoreographyRef();
		case Bpmn2Package.COLLABORATION__ARTIFACTS:
			return getArtifacts();
		case Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
			return getParticipantAssociations();
		case Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
			return getMessageFlowAssociations();
		case Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
			return getConversationAssociations();
		case Bpmn2Package.COLLABORATION__PARTICIPANTS:
			return getParticipants();
		case Bpmn2Package.COLLABORATION__MESSAGE_FLOWS:
			return getMessageFlows();
		case Bpmn2Package.COLLABORATION__CORRELATION_KEYS:
			return getCorrelationKeys();
		case Bpmn2Package.COLLABORATION__CONVERSATIONS:
			return getConversations();
		case Bpmn2Package.COLLABORATION__CONVERSATION_LINKS:
			return getConversationLinks();
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
		case Bpmn2Package.COLLABORATION__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.COLLABORATION__IS_CLOSED:
			setIsClosed((Boolean) newValue);
			return;
		case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF:
			getChoreographyRef().clear();
			getChoreographyRef().addAll((Collection<? extends Choreography>) newValue);
			return;
		case Bpmn2Package.COLLABORATION__ARTIFACTS:
			getArtifacts().clear();
			getArtifacts().addAll((Collection<? extends Artifact>) newValue);
			return;
		case Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
			getParticipantAssociations().clear();
			getParticipantAssociations().addAll((Collection<? extends ParticipantAssociation>) newValue);
			return;
		case Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
			getMessageFlowAssociations().clear();
			getMessageFlowAssociations().addAll((Collection<? extends MessageFlowAssociation>) newValue);
			return;
		case Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
			setConversationAssociations((ConversationAssociation) newValue);
			return;
		case Bpmn2Package.COLLABORATION__PARTICIPANTS:
			getParticipants().clear();
			getParticipants().addAll((Collection<? extends Participant>) newValue);
			return;
		case Bpmn2Package.COLLABORATION__MESSAGE_FLOWS:
			getMessageFlows().clear();
			getMessageFlows().addAll((Collection<? extends MessageFlow>) newValue);
			return;
		case Bpmn2Package.COLLABORATION__CORRELATION_KEYS:
			getCorrelationKeys().clear();
			getCorrelationKeys().addAll((Collection<? extends CorrelationKey>) newValue);
			return;
		case Bpmn2Package.COLLABORATION__CONVERSATIONS:
			getConversations().clear();
			getConversations().addAll((Collection<? extends ConversationNode>) newValue);
			return;
		case Bpmn2Package.COLLABORATION__CONVERSATION_LINKS:
			getConversationLinks().clear();
			getConversationLinks().addAll((Collection<? extends ConversationLink>) newValue);
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
		case Bpmn2Package.COLLABORATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.COLLABORATION__IS_CLOSED:
			setIsClosed(IS_CLOSED_EDEFAULT);
			return;
		case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF:
			getChoreographyRef().clear();
			return;
		case Bpmn2Package.COLLABORATION__ARTIFACTS:
			getArtifacts().clear();
			return;
		case Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
			getParticipantAssociations().clear();
			return;
		case Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
			getMessageFlowAssociations().clear();
			return;
		case Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
			setConversationAssociations((ConversationAssociation) null);
			return;
		case Bpmn2Package.COLLABORATION__PARTICIPANTS:
			getParticipants().clear();
			return;
		case Bpmn2Package.COLLABORATION__MESSAGE_FLOWS:
			getMessageFlows().clear();
			return;
		case Bpmn2Package.COLLABORATION__CORRELATION_KEYS:
			getCorrelationKeys().clear();
			return;
		case Bpmn2Package.COLLABORATION__CONVERSATIONS:
			getConversations().clear();
			return;
		case Bpmn2Package.COLLABORATION__CONVERSATION_LINKS:
			getConversationLinks().clear();
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
		case Bpmn2Package.COLLABORATION__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case Bpmn2Package.COLLABORATION__IS_CLOSED:
			return isIsClosed() != IS_CLOSED_EDEFAULT;
		case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF:
			return !getChoreographyRef().isEmpty();
		case Bpmn2Package.COLLABORATION__ARTIFACTS:
			return !getArtifacts().isEmpty();
		case Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
			return !getParticipantAssociations().isEmpty();
		case Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
			return !getMessageFlowAssociations().isEmpty();
		case Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
			return getConversationAssociations() != null;
		case Bpmn2Package.COLLABORATION__PARTICIPANTS:
			return !getParticipants().isEmpty();
		case Bpmn2Package.COLLABORATION__MESSAGE_FLOWS:
			return !getMessageFlows().isEmpty();
		case Bpmn2Package.COLLABORATION__CORRELATION_KEYS:
			return !getCorrelationKeys().isEmpty();
		case Bpmn2Package.COLLABORATION__CONVERSATIONS:
			return !getConversations().isEmpty();
		case Bpmn2Package.COLLABORATION__CONVERSATION_LINKS:
			return !getConversationLinks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollaborationImpl
