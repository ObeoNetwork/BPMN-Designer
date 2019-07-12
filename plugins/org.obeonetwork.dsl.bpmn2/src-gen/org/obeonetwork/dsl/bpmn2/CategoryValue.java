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
 * A representation of the model object '<em><b>Category Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.CategoryValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.CategoryValue#getCategorizedFlowElements <em>Categorized Flow Elements</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCategoryValue()
 * @model
 * @generated
 */
public interface CategoryValue extends BaseElement {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCategoryValue_Value()
     * @model required="true" ordered="false"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.CategoryValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Categorized Flow Elements</b></em>' reference list.
     * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.FlowElement}.
     * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.FlowElement#getCategoryValueRef <em>Category Value Ref</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Categorized Flow Elements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Categorized Flow Elements</em>' reference list.
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCategoryValue_CategorizedFlowElements()
     * @see org.obeonetwork.dsl.bpmn2.FlowElement#getCategoryValueRef
     * @model opposite="categoryValueRef" resolveProxies="false" transient="true" changeable="false" derived="true" ordered="false"
     * @generated
     */
    EList<FlowElement> getCategorizedFlowElements();

} // CategoryValue
