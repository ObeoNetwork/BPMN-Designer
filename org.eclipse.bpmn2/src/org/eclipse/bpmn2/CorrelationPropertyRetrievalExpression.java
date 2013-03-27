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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn2.Bpmn2Package#getCorrelationPropertyRetrievalExpression()
 * @model
 * @generated
 */
public interface CorrelationPropertyRetrievalExpression extends BaseElement {
    /**
     * Returns the value of the '<em><b>Message Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Path</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Path</em>' containment reference.
     * @see #setMessagePath(FormalExpression)
     * @see org.eclipse.bpmn2.Bpmn2Package#getCorrelationPropertyRetrievalExpression_MessagePath()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    FormalExpression getMessagePath();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Path</em>' containment reference.
     * @see #getMessagePath()
     * @generated
     */
    void setMessagePath(FormalExpression value);

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
     * @see org.eclipse.bpmn2.Bpmn2Package#getCorrelationPropertyRetrievalExpression_MessageRef()
     * @model required="true" ordered="false"
     * @generated
     */
    Message getMessageRef();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Ref</em>' reference.
     * @see #getMessageRef()
     * @generated
     */
    void setMessageRef(Message value);

} // CorrelationPropertyRetrievalExpression
