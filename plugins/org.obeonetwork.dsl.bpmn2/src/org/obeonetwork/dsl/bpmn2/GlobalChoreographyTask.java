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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.GlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getGlobalChoreographyTask()
 * @model
 * @generated
 */
public interface GlobalChoreographyTask extends Choreography {
	/**
	 * Returns the value of the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiating Participant Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiating Participant Ref</em>' reference.
	 * @see #setInitiatingParticipantRef(Participant)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getGlobalChoreographyTask_InitiatingParticipantRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getInitiatingParticipantRef();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.GlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiating Participant Ref</em>' reference.
	 * @see #getInitiatingParticipantRef()
	 * @generated
	 */
	void setInitiatingParticipantRef(Participant value);

} // GlobalChoreographyTask
