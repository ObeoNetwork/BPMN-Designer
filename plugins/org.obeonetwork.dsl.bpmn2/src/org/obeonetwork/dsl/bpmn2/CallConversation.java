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
package org.obeonetwork.dsl.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.CallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.CallConversation#getParticipantAssociations <em>Participant Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCallConversation()
 * @model
 * @generated
 */
public interface CallConversation extends ConversationNode {
	/**
	 * Returns the value of the '<em><b>Called Collaboration Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Collaboration Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Collaboration Ref</em>' reference.
	 * @see #setCalledCollaborationRef(Collaboration)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCallConversation_CalledCollaborationRef()
	 * @model ordered="false"
	 * @generated
	 */
	Collaboration getCalledCollaborationRef();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.CallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Collaboration Ref</em>' reference.
	 * @see #getCalledCollaborationRef()
	 * @generated
	 */
	void setCalledCollaborationRef(Collaboration value);

	/**
	 * Returns the value of the '<em><b>Participant Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.ParticipantAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Associations</em>' containment reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCallConversation_ParticipantAssociations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParticipantAssociation> getParticipantAssociations();

} // CallConversation
