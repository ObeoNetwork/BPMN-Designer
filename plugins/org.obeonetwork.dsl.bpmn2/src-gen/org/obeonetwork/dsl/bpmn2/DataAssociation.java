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
 * A representation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.DataAssociation#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.DataAssociation#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.DataAssociation#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.DataAssociation#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getDataAssociation()
 * @model
 * @generated
 */
public interface DataAssociation extends BaseElement {
    /**
     * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformation</em>' containment reference.
     * @see #setTransformation(FormalExpression)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getDataAssociation_Transformation()
     * @model containment="true" ordered="false"
     * @generated
     */
    FormalExpression getTransformation();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.DataAssociation#getTransformation <em>Transformation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformation</em>' containment reference.
     * @see #getTransformation()
     * @generated
     */
    void setTransformation(FormalExpression value);

    /**
     * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
     * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.Assignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignment</em>' containment reference list.
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getDataAssociation_Assignment()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Assignment> getAssignment();

    /**
     * Returns the value of the '<em><b>Target Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Ref</em>' reference.
     * @see #setTargetRef(ItemAwareElement)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getDataAssociation_TargetRef()
     * @model required="true" ordered="false"
     * @generated
     */
    ItemAwareElement getTargetRef();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.DataAssociation#getTargetRef <em>Target Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Ref</em>' reference.
     * @see #getTargetRef()
     * @generated
     */
    void setTargetRef(ItemAwareElement value);

    /**
     * Returns the value of the '<em><b>Source Ref</b></em>' reference list.
     * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.ItemAwareElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Ref</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Ref</em>' reference list.
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getDataAssociation_SourceRef()
     * @model ordered="false"
     * @generated
     */
    EList<ItemAwareElement> getSourceRef();

} // DataAssociation
