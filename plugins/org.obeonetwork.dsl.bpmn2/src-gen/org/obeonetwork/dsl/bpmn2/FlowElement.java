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
 * A representation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FlowElement#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FlowElement#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FlowElement#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FlowElement#getCategoryValueRef <em>Category Value Ref</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface FlowElement extends BaseElement {
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
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowElement_Name()
     * @model ordered="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.FlowElement#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auditing</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auditing</em>' containment reference.
     * @see #setAuditing(Auditing)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowElement_Auditing()
     * @model containment="true" ordered="false"
     * @generated
     */
    Auditing getAuditing();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.FlowElement#getAuditing <em>Auditing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auditing</em>' containment reference.
     * @see #getAuditing()
     * @generated
     */
    void setAuditing(Auditing value);

    /**
     * Returns the value of the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitoring</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monitoring</em>' containment reference.
     * @see #setMonitoring(Monitoring)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowElement_Monitoring()
     * @model containment="true" ordered="false"
     * @generated
     */
    Monitoring getMonitoring();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.FlowElement#getMonitoring <em>Monitoring</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Monitoring</em>' containment reference.
     * @see #getMonitoring()
     * @generated
     */
    void setMonitoring(Monitoring value);

    /**
     * Returns the value of the '<em><b>Category Value Ref</b></em>' reference list.
     * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.CategoryValue}.
     * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.CategoryValue#getCategorizedFlowElements <em>Categorized Flow Elements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Value Ref</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Value Ref</em>' reference list.
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowElement_CategoryValueRef()
     * @see org.obeonetwork.dsl.bpmn2.CategoryValue#getCategorizedFlowElements
     * @model opposite="categorizedFlowElements" resolveProxies="false" transient="true" ordered="false"
     * @generated
     */
    EList<CategoryValue> getCategoryValueRef();

} // FlowElement
