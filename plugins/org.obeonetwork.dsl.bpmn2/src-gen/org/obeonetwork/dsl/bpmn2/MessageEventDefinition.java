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
 * A representation of the model object '<em><b>Message Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.MessageEventDefinition#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.MessageEventDefinition#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getMessageEventDefinition()
 * @model
 * @generated
 */
public interface MessageEventDefinition extends EventDefinition {
    /**
     * Returns the value of the '<em><b>Message Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Ref</em>' reference.
     * @see #setMessageRef(Message)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getMessageEventDefinition_MessageRef()
     * @model ordered="false"
     * @generated
     */
    Message getMessageRef();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.MessageEventDefinition#getMessageRef <em>Message Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Ref</em>' reference.
     * @see #getMessageRef()
     * @generated
     */
    void setMessageRef(Message value);

    /**
     * Returns the value of the '<em><b>Operation Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation Ref</em>' reference.
     * @see #setOperationRef(Operation)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getMessageEventDefinition_OperationRef()
     * @model ordered="false"
     * @generated
     */
    Operation getOperationRef();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.MessageEventDefinition#getOperationRef <em>Operation Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation Ref</em>' reference.
     * @see #getOperationRef()
     * @generated
     */
    void setOperationRef(Operation value);

} // MessageEventDefinition
