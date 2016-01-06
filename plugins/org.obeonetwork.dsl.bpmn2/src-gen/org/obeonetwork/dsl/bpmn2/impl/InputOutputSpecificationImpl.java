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
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl#getInputSets <em>Input Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl#getOutputSets <em>Output Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl#getDataInputs <em>Data Inputs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl#getDataOutputs <em>Data Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputOutputSpecificationImpl extends BaseElementImpl implements InputOutputSpecification {
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
		return (EList<InputSet>) eDynamicGet(Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS,
				Bpmn2Package.Literals.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OutputSet> getOutputSets() {
		return (EList<OutputSet>) eDynamicGet(Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS,
				Bpmn2Package.Literals.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataInput> getDataInputs() {
		return (EList<DataInput>) eDynamicGet(Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS,
				Bpmn2Package.Literals.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataOutput> getDataOutputs() {
		return (EList<DataOutput>) eDynamicGet(Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS,
				Bpmn2Package.Literals.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
			return ((InternalEList<?>) getInputSets()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
			return ((InternalEList<?>) getOutputSets()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
			return ((InternalEList<?>) getDataInputs()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
			return ((InternalEList<?>) getDataOutputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
			return getInputSets();
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
			return getOutputSets();
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
			return getDataInputs();
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
			return getDataOutputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
			getInputSets().clear();
			getInputSets().addAll((Collection<? extends InputSet>) newValue);
			return;
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
			getOutputSets().clear();
			getOutputSets().addAll((Collection<? extends OutputSet>) newValue);
			return;
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
			getDataInputs().clear();
			getDataInputs().addAll((Collection<? extends DataInput>) newValue);
			return;
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
			getDataOutputs().clear();
			getDataOutputs().addAll((Collection<? extends DataOutput>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
			getInputSets().clear();
			return;
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
			getOutputSets().clear();
			return;
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
			getDataInputs().clear();
			return;
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
			getDataOutputs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
			return !getInputSets().isEmpty();
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
			return !getOutputSets().isEmpty();
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
			return !getDataInputs().isEmpty();
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
			return !getDataOutputs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputOutputSpecificationImpl
