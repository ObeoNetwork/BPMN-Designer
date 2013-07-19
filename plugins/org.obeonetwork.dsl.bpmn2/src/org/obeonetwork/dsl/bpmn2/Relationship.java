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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Relationship#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Relationship#getSources <em>Sources</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Relationship#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getRelationship_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.bpmn2.RelationshipDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.obeonetwork.dsl.bpmn2.RelationshipDirection
	 * @see #setDirection(RelationshipDirection)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getRelationship_Direction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RelationshipDirection getDirection();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Relationship#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.obeonetwork.dsl.bpmn2.RelationshipDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(RelationshipDirection value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getRelationship_Sources()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<EObject> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getRelationship_Targets()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<EObject> getTargets();

} // Relationship
