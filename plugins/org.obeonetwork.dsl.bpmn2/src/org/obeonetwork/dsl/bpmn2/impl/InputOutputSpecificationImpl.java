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
package org.obeonetwork.dsl.bpmn2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.DataInput;
import org.obeonetwork.dsl.bpmn2.DataOutput;
import org.obeonetwork.dsl.bpmn2.InputOutputSpecification;
import org.obeonetwork.dsl.bpmn2.InputSet;
import org.obeonetwork.dsl.bpmn2.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Output Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl#getInputSets <em>Input Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl#getOutputSets <em>Output Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl#getDataInputs <em>Data Inputs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl#getDataOutputs <em>Data Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputOutputSpecificationImpl extends BaseElementImpl implements
		InputOutputSpecification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputOutputSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.INPUT_OUTPUT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InputSet> getInputSets() {
		return (EList<InputSet>) eGet(
				Bpmn2Package.Literals.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OutputSet> getOutputSets() {
		return (EList<OutputSet>) eGet(
				Bpmn2Package.Literals.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataInput> getDataInputs() {
		return (EList<DataInput>) eGet(
				Bpmn2Package.Literals.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataOutput> getDataOutputs() {
		return (EList<DataOutput>) eGet(
				Bpmn2Package.Literals.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS,
				true);
	}

} //InputOutputSpecificationImpl
