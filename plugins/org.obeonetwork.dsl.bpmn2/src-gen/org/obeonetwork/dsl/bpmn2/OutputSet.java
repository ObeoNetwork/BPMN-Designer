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
 * A representation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.OutputSet#getOptionalOutputRefs <em>Optional Output Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.OutputSet#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.OutputSet#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.OutputSet#getInputSetRefs <em>Input Set Refs</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getOutputSet()
 * @model
 * @generated
 */
public interface OutputSet extends BaseElement {
    /**
     * Returns the value of the '<em><b>Data Output Refs</b></em>' reference list.
     * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.DataOutput}.
     * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetRefs <em>Output Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Output Refs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Output Refs</em>' reference list.
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getOutputSet_DataOutputRefs()
     * @see org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetRefs
     * @model opposite="outputSetRefs" resolveProxies="false" ordered="false"
     * @generated
     */
    EList<DataOutput> getDataOutputRefs();

    /**
     * Returns the value of the '<em><b>Optional Output Refs</b></em>' reference list.
     * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.DataOutput}.
     * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetWithOptional <em>Output Set With Optional</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Optional Output Refs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Optional Output Refs</em>' reference list.
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getOutputSet_OptionalOutputRefs()
     * @see org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetWithOptional
     * @model opposite="outputSetWithOptional" resolveProxies="false" ordered="false"
     * @generated
     */
    EList<DataOutput> getOptionalOutputRefs();

    /**
     * Returns the value of the '<em><b>While Executing Output Refs</b></em>' reference list.
     * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.DataOutput}.
     * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetWithWhileExecuting <em>Output Set With While Executing</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>While Executing Output Refs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>While Executing Output Refs</em>' reference list.
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getOutputSet_WhileExecutingOutputRefs()
     * @see org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetWithWhileExecuting
     * @model opposite="outputSetWithWhileExecuting" resolveProxies="false" derived="true" ordered="false"
     * @generated
     */
    EList<DataOutput> getWhileExecutingOutputRefs();

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
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getOutputSet_Name()
     * @model ordered="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.OutputSet#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Input Set Refs</b></em>' reference list.
     * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.InputSet}.
     * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.InputSet#getOutputSetRefs <em>Output Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Set Refs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Set Refs</em>' reference list.
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getOutputSet_InputSetRefs()
     * @see org.obeonetwork.dsl.bpmn2.InputSet#getOutputSetRefs
     * @model opposite="outputSetRefs" ordered="false"
     * @generated
     */
    EList<InputSet> getInputSetRefs();

} // OutputSet
