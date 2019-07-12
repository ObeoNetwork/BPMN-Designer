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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FormalExpression#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FormalExpression#getBody <em>Body</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFormalExpression()
 * @model
 * @generated
 */
public interface FormalExpression extends Expression {
    /**
     * Returns the value of the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Language</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Language</em>' attribute.
     * @see #setLanguage(String)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFormalExpression_Language()
     * @model required="true" ordered="false"
     * @generated
     */
    String getLanguage();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.FormalExpression#getLanguage <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' attribute.
     * @see #getLanguage()
     * @generated
     */
    void setLanguage(String value);

    /**
     * Returns the value of the '<em><b>Body</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Body</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' reference.
     * @see #setBody(EObject)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFormalExpression_Body()
     * @model required="true" ordered="false"
     * @generated
     */
    EObject getBody();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.FormalExpression#getBody <em>Body</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' reference.
     * @see #getBody()
     * @generated
     */
    void setBody(EObject value);

    /**
     * Returns the value of the '<em><b>Evaluates To Type Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Evaluates To Type Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Evaluates To Type Ref</em>' reference.
     * @see #setEvaluatesToTypeRef(ItemDefinition)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFormalExpression_EvaluatesToTypeRef()
     * @model required="true" ordered="false"
     * @generated
     */
    ItemDefinition getEvaluatesToTypeRef();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Evaluates To Type Ref</em>' reference.
     * @see #getEvaluatesToTypeRef()
     * @generated
     */
    void setEvaluatesToTypeRef(ItemDefinition value);

} // FormalExpression
