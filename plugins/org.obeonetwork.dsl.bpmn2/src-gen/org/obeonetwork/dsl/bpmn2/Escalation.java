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
 * A representation of the model object '<em><b>Escalation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Escalation#getStructureRef <em>Structure Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Escalation#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Escalation#getEscalationCode <em>Escalation Code</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Escalation#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getEscalation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Escalation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Ref</em>' reference.
	 * @see #setStructureRef(ItemDefinition)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getEscalation_StructureRef()
	 * @model ordered="false"
	 * @generated
	 */
	ItemDefinition getStructureRef();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Escalation#getStructureRef <em>Structure Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Ref</em>' reference.
	 * @see #getStructureRef()
	 * @generated
	 */
	void setStructureRef(ItemDefinition value);

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
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getEscalation_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Escalation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Escalation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escalation Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escalation Code</em>' attribute.
	 * @see #setEscalationCode(String)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getEscalation_EscalationCode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEscalationCode();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Escalation#getEscalationCode <em>Escalation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escalation Code</em>' attribute.
	 * @see #getEscalationCode()
	 * @generated
	 */
	void setEscalationCode(String value);

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
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getEscalation_Id()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Escalation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Escalation
