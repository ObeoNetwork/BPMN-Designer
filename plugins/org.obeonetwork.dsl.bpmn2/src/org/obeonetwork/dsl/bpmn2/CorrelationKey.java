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
 * A representation of the model object '<em><b>Correlation Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.CorrelationKey#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.CorrelationKey#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCorrelationKey()
 * @model
 * @generated
 */
public interface CorrelationKey extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Correlation Property Ref</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.CorrelationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Ref</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCorrelationKey_CorrelationPropertyRef()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CorrelationProperty> getCorrelationPropertyRef();

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
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCorrelationKey_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.CorrelationKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CorrelationKey
