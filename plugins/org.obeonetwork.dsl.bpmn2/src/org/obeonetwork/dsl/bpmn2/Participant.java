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
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Participant#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Participant#getInterfaceRefs <em>Interface Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Participant#getEndPointRefs <em>End Point Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Participant#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends BaseElement, InteractionNode {
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
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getParticipant_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Participant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interface Refs</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Refs</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getParticipant_InterfaceRefs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getInterfaceRefs();

	/**
	 * Returns the value of the '<em><b>Participant Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Multiplicity</em>' containment reference.
	 * @see #setParticipantMultiplicity(ParticipantMultiplicity)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getParticipant_ParticipantMultiplicity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ParticipantMultiplicity getParticipantMultiplicity();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Multiplicity</em>' containment reference.
	 * @see #getParticipantMultiplicity()
	 * @generated
	 */
	void setParticipantMultiplicity(ParticipantMultiplicity value);

	/**
	 * Returns the value of the '<em><b>End Point Refs</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.EndPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point Refs</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getParticipant_EndPointRefs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EndPoint> getEndPointRefs();

	/**
	 * Returns the value of the '<em><b>Process Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Ref</em>' reference.
	 * @see #setProcessRef(org.obeonetwork.dsl.bpmn2.Process)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getParticipant_ProcessRef()
	 * @model ordered="false"
	 * @generated
	 */
	org.obeonetwork.dsl.bpmn2.Process getProcessRef();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Participant#getProcessRef <em>Process Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Ref</em>' reference.
	 * @see #getProcessRef()
	 * @generated
	 */
	void setProcessRef(org.obeonetwork.dsl.bpmn2.Process value);

} // Participant
