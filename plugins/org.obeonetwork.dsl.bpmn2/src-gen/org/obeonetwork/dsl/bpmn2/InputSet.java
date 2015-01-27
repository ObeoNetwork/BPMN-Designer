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
 * A representation of the model object '<em><b>Input Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.InputSet#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.InputSet#getDataInputRefs <em>Data Input Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.InputSet#getOptionalInputRefs <em>Optional Input Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.InputSet#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.InputSet#getOutputSetRefs <em>Output Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getInputSet()
 * @model
 * @generated
 */
public interface InputSet extends BaseElement {
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
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getInputSet_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.InputSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Input Refs</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.DataInput}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.DataInput#getInputSetRefs <em>Input Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Input Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input Refs</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getInputSet_DataInputRefs()
	 * @see org.obeonetwork.dsl.bpmn2.DataInput#getInputSetRefs
	 * @model opposite="inputSetRefs" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList<DataInput> getDataInputRefs();

	/**
	 * Returns the value of the '<em><b>Optional Input Refs</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.DataInput}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.DataInput#getInputSetWithOptional <em>Input Set With Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Input Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Input Refs</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getInputSet_OptionalInputRefs()
	 * @see org.obeonetwork.dsl.bpmn2.DataInput#getInputSetWithOptional
	 * @model opposite="inputSetWithOptional" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList<DataInput> getOptionalInputRefs();

	/**
	 * Returns the value of the '<em><b>While Executing Input Refs</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.DataInput}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.DataInput#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Executing Input Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Executing Input Refs</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getInputSet_WhileExecutingInputRefs()
	 * @see org.obeonetwork.dsl.bpmn2.DataInput#getInputSetWithWhileExecuting
	 * @model opposite="inputSetWithWhileExecuting" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList<DataInput> getWhileExecutingInputRefs();

	/**
	 * Returns the value of the '<em><b>Output Set Refs</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.OutputSet}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.OutputSet#getInputSetRefs <em>Input Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Set Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Set Refs</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getInputSet_OutputSetRefs()
	 * @see org.obeonetwork.dsl.bpmn2.OutputSet#getInputSetRefs
	 * @model opposite="inputSetRefs" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList<OutputSet> getOutputSetRefs();

} // InputSet
