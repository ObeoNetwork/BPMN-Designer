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

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getParticipantMultiplicity()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ParticipantMultiplicity extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(int)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getParticipantMultiplicity_Minimum()
	 * @model default="0" required="true" ordered="false"
	 * @generated
	 */
	int getMinimum();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(int value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(int)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getParticipantMultiplicity_Maximum()
	 * @model default="1" ordered="false"
	 * @generated
	 */
	int getMaximum();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(int value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getParticipantMultiplicity_Id()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ParticipantMultiplicity
