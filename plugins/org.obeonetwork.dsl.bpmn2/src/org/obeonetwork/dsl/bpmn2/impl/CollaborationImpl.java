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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends RootElementImpl implements Collaboration {
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
		return (String) eGet(Bpmn2Package.Literals.COLLABORATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(Bpmn2Package.Literals.COLLABORATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsClosed() {
		return (Boolean) eGet(Bpmn2Package.Literals.COLLABORATION__IS_CLOSED,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClosed(boolean newIsClosed) {
		eSet(Bpmn2Package.Literals.COLLABORATION__IS_CLOSED, newIsClosed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Choreography> getChoreographyRef() {
		return (EList<Choreography>) eGet(
				Bpmn2Package.Literals.COLLABORATION__CHOREOGRAPHY_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>) eGet(
				Bpmn2Package.Literals.COLLABORATION__ARTIFACTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParticipantAssociation> getParticipantAssociations() {
		return (EList<ParticipantAssociation>) eGet(
				Bpmn2Package.Literals.COLLABORATION__PARTICIPANT_ASSOCIATIONS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageFlowAssociation> getMessageFlowAssociations() {
		return (EList<MessageFlowAssociation>) eGet(
				Bpmn2Package.Literals.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationAssociation getConversationAssociations() {
		return (ConversationAssociation) eGet(
				Bpmn2Package.Literals.COLLABORATION__CONVERSATION_ASSOCIATIONS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversationAssociations(
			ConversationAssociation newConversationAssociations) {
		eSet(Bpmn2Package.Literals.COLLABORATION__CONVERSATION_ASSOCIATIONS,
				newConversationAssociations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Participant> getParticipants() {
		return (EList<Participant>) eGet(
				Bpmn2Package.Literals.COLLABORATION__PARTICIPANTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageFlow> getMessageFlows() {
		return (EList<MessageFlow>) eGet(
				Bpmn2Package.Literals.COLLABORATION__MESSAGE_FLOWS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CorrelationKey> getCorrelationKeys() {
		return (EList<CorrelationKey>) eGet(
				Bpmn2Package.Literals.COLLABORATION__CORRELATION_KEYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConversationNode> getConversations() {
		return (EList<ConversationNode>) eGet(
				Bpmn2Package.Literals.COLLABORATION__CONVERSATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConversationLink> getConversationLinks() {
		return (EList<ConversationLink>) eGet(
				Bpmn2Package.Literals.COLLABORATION__CONVERSATION_LINKS, true);
	}

} //CollaborationImpl
