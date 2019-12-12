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
 * A representation of the model object '<em><b>Error Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getErrorEventDefinition()
 * @model
 * @generated
 */
public interface ErrorEventDefinition extends EventDefinition {
    /**
     * Returns the value of the '<em><b>Error Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error Ref</em>' reference.
     * @see #setErrorRef(org.obeonetwork.dsl.bpmn2.Error)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getErrorEventDefinition_ErrorRef()
     * @model ordered="false"
     * @generated
     */
    org.obeonetwork.dsl.bpmn2.Error getErrorRef();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error Ref</em>' reference.
     * @see #getErrorRef()
     * @generated
     */
    void setErrorRef(org.obeonetwork.dsl.bpmn2.Error value);

} // ErrorEventDefinition
