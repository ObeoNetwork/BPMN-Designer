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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.InputOutputBinding;
import org.obeonetwork.dsl.bpmn2.InputSet;
import org.obeonetwork.dsl.bpmn2.Operation;
import org.obeonetwork.dsl.bpmn2.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Output Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputBindingImpl#getInputDataRef <em>Input Data Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputBindingImpl#getOutputDataRef <em>Output Data Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputBindingImpl#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputOutputBindingImpl extends CDOObjectImpl implements
		InputOutputBinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputOutputBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.INPUT_OUTPUT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet getInputDataRef() {
		return (InputSet) eGet(
				Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__INPUT_DATA_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDataRef(InputSet newInputDataRef) {
		eSet(Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__INPUT_DATA_REF,
				newInputDataRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet getOutputDataRef() {
		return (OutputSet) eGet(
				Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDataRef(OutputSet newOutputDataRef) {
		eSet(Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF,
				newOutputDataRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperationRef() {
		return (Operation) eGet(
				Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__OPERATION_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationRef(Operation newOperationRef) {
		eSet(Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__OPERATION_REF,
				newOperationRef);
	}

} //InputOutputBindingImpl
