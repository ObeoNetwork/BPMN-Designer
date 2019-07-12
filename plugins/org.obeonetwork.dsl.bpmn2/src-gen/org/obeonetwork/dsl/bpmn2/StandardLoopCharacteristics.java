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
 * A representation of the model object '<em><b>Standard Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#isTestBefore <em>Test Before</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#getLoopMaximum <em>Loop Maximum</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getStandardLoopCharacteristics()
 * @model
 * @generated
 */
public interface StandardLoopCharacteristics extends LoopCharacteristics {
    /**
     * Returns the value of the '<em><b>Test Before</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Before</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Before</em>' attribute.
     * @see #setTestBefore(boolean)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getStandardLoopCharacteristics_TestBefore()
     * @model default="false" required="true" ordered="false"
     * @generated
     */
    boolean isTestBefore();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#isTestBefore <em>Test Before</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Before</em>' attribute.
     * @see #isTestBefore()
     * @generated
     */
    void setTestBefore(boolean value);

    /**
     * Returns the value of the '<em><b>Loop Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loop Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop Condition</em>' containment reference.
     * @see #setLoopCondition(Expression)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getStandardLoopCharacteristics_LoopCondition()
     * @model containment="true" ordered="false"
     * @generated
     */
    Expression getLoopCondition();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#getLoopCondition <em>Loop Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop Condition</em>' containment reference.
     * @see #getLoopCondition()
     * @generated
     */
    void setLoopCondition(Expression value);

    /**
     * Returns the value of the '<em><b>Loop Maximum</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loop Maximum</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop Maximum</em>' containment reference.
     * @see #setLoopMaximum(Expression)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getStandardLoopCharacteristics_LoopMaximum()
     * @model containment="true" ordered="false"
     * @generated
     */
    Expression getLoopMaximum();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#getLoopMaximum <em>Loop Maximum</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop Maximum</em>' containment reference.
     * @see #getLoopMaximum()
     * @generated
     */
    void setLoopMaximum(Expression value);

} // StandardLoopCharacteristics
