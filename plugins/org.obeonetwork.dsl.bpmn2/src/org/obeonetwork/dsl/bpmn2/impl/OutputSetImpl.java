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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.DataOutput;
import org.obeonetwork.dsl.bpmn2.InputSet;
import org.obeonetwork.dsl.bpmn2.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OutputSetImpl#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OutputSetImpl#getOptionalOutputRefs <em>Optional Output Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OutputSetImpl#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OutputSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OutputSetImpl#getInputSetRefs <em>Input Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputSetImpl extends BaseElementImpl implements OutputSet {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.OUTPUT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataOutput> getDataOutputRefs() {
		return (EList<DataOutput>) eDynamicGet(
				Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS,
				Bpmn2Package.Literals.OUTPUT_SET__DATA_OUTPUT_REFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataOutput> getOptionalOutputRefs() {
		return (EList<DataOutput>) eDynamicGet(
				Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS,
				Bpmn2Package.Literals.OUTPUT_SET__OPTIONAL_OUTPUT_REFS, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataOutput> getWhileExecutingOutputRefs() {
		return (EList<DataOutput>) eDynamicGet(
				Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS,
				Bpmn2Package.Literals.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.OUTPUT_SET__NAME,
				Bpmn2Package.Literals.OUTPUT_SET__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.OUTPUT_SET__NAME,
				Bpmn2Package.Literals.OUTPUT_SET__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InputSet> getInputSetRefs() {
		return (EList<InputSet>) eDynamicGet(
				Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS,
				Bpmn2Package.Literals.OUTPUT_SET__INPUT_SET_REFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDataOutputRefs())
					.basicAdd(otherEnd, msgs);
		case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptionalOutputRefs())
					.basicAdd(otherEnd, msgs);
		case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getWhileExecutingOutputRefs())
					.basicAdd(otherEnd, msgs);
		case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputSetRefs())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS:
			return ((InternalEList<?>) getDataOutputRefs()).basicRemove(
					otherEnd, msgs);
		case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
			return ((InternalEList<?>) getOptionalOutputRefs()).basicRemove(
					otherEnd, msgs);
		case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
			return ((InternalEList<?>) getWhileExecutingOutputRefs())
					.basicRemove(otherEnd, msgs);
		case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS:
			return ((InternalEList<?>) getInputSetRefs()).basicRemove(otherEnd,
					msgs);
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
		case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS:
			return getDataOutputRefs();
		case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
			return getOptionalOutputRefs();
		case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
			return getWhileExecutingOutputRefs();
		case Bpmn2Package.OUTPUT_SET__NAME:
			return getName();
		case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS:
			return getInputSetRefs();
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
		case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS:
			getDataOutputRefs().clear();
			getDataOutputRefs().addAll(
					(Collection<? extends DataOutput>) newValue);
			return;
		case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
			getOptionalOutputRefs().clear();
			getOptionalOutputRefs().addAll(
					(Collection<? extends DataOutput>) newValue);
			return;
		case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
			getWhileExecutingOutputRefs().clear();
			getWhileExecutingOutputRefs().addAll(
					(Collection<? extends DataOutput>) newValue);
			return;
		case Bpmn2Package.OUTPUT_SET__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS:
			getInputSetRefs().clear();
			getInputSetRefs().addAll((Collection<? extends InputSet>) newValue);
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
		case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS:
			getDataOutputRefs().clear();
			return;
		case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
			getOptionalOutputRefs().clear();
			return;
		case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
			getWhileExecutingOutputRefs().clear();
			return;
		case Bpmn2Package.OUTPUT_SET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS:
			getInputSetRefs().clear();
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
		case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS:
			return !getDataOutputRefs().isEmpty();
		case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
			return !getOptionalOutputRefs().isEmpty();
		case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
			return !getWhileExecutingOutputRefs().isEmpty();
		case Bpmn2Package.OUTPUT_SET__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT
					.equals(getName());
		case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS:
			return !getInputSetRefs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputSetImpl
