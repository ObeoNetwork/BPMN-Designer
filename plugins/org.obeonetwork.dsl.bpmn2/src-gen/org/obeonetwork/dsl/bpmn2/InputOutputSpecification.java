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
 * A representation of the model object '<em><b>Input Output Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getInputSets <em>Input Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getOutputSets <em>Output Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getDataInputs <em>Data Inputs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getDataOutputs <em>Data Outputs</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getInputOutputSpecification()
 * @model
 * @generated
 */
public interface InputOutputSpecification extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Input Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.InputSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Sets</em>' containment reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getInputOutputSpecification_InputSets()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSets();

	/**
	 * Returns the value of the '<em><b>Output Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.OutputSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Sets</em>' containment reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getInputOutputSpecification_OutputSets()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OutputSet> getOutputSets();

	/**
	 * Returns the value of the '<em><b>Data Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.DataInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Inputs</em>' containment reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getInputOutputSpecification_DataInputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataInput> getDataInputs();

	/**
	 * Returns the value of the '<em><b>Data Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.DataOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Outputs</em>' containment reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getInputOutputSpecification_DataOutputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataOutput> getDataOutputs();

} // InputOutputSpecification
