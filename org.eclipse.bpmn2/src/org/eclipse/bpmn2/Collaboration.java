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
package org.eclipse.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#getChoreographyRef <em>Choreography Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#getMessageFlowAssociations <em>Message Flow Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#getConversationAssociations <em>Conversation Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#getMessageFlows <em>Message Flows</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#getConversations <em>Conversations</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Collaboration#getConversationLinks <em>Conversation Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration extends RootElement {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_Name()
     * @model required="true" ordered="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn2.Collaboration#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Is Closed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Closed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Closed</em>' attribute.
     * @see #setIsClosed(boolean)
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_IsClosed()
     * @model required="true" ordered="false"
     * @generated
     */
    boolean isIsClosed();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn2.Collaboration#isIsClosed <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Closed</em>' attribute.
     * @see #isIsClosed()
     * @generated
     */
    void setIsClosed(boolean value);

    /**
     * Returns the value of the '<em><b>Choreography Ref</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.Choreography}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Choreography Ref</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Choreography Ref</em>' reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_ChoreographyRef()
     * @model ordered="false"
     * @generated
     */
    EList<Choreography> getChoreographyRef();

    /**
     * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.Artifact}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifacts</em>' containment reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_Artifacts()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Artifact> getArtifacts();

    /**
     * Returns the value of the '<em><b>Participant Associations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.ParticipantAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant Associations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant Associations</em>' containment reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_ParticipantAssociations()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ParticipantAssociation> getParticipantAssociations();

    /**
     * Returns the value of the '<em><b>Message Flow Associations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.MessageFlowAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Flow Associations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Flow Associations</em>' containment reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_MessageFlowAssociations()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<MessageFlowAssociation> getMessageFlowAssociations();

    /**
     * Returns the value of the '<em><b>Conversation Associations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Associations</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Associations</em>' containment reference.
     * @see #setConversationAssociations(ConversationAssociation)
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_ConversationAssociations()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    ConversationAssociation getConversationAssociations();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn2.Collaboration#getConversationAssociations <em>Conversation Associations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conversation Associations</em>' containment reference.
     * @see #getConversationAssociations()
     * @generated
     */
    void setConversationAssociations(ConversationAssociation value);

    /**
     * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.Participant}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participants</em>' containment reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_Participants()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Participant> getParticipants();

    /**
     * Returns the value of the '<em><b>Message Flows</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.MessageFlow}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Flows</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Flows</em>' containment reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_MessageFlows()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<MessageFlow> getMessageFlows();

    /**
     * Returns the value of the '<em><b>Correlation Keys</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.CorrelationKey}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Keys</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Keys</em>' containment reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_CorrelationKeys()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<CorrelationKey> getCorrelationKeys();

    /**
     * Returns the value of the '<em><b>Conversations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.ConversationNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversations</em>' containment reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_Conversations()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ConversationNode> getConversations();

    /**
     * Returns the value of the '<em><b>Conversation Links</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.ConversationLink}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Links</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Links</em>' containment reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCollaboration_ConversationLinks()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ConversationLink> getConversationLinks();

} // Collaboration
