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
import org.obeonetwork.dsl.bpmn2.InputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataInputImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataInputImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataInputImpl#getInputSetWithOptional <em>Input Set With Optional</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataInputImpl#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataInputImpl#getInputSetRefs <em>Input Set Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataInputImpl extends ItemAwareElementImpl implements DataInput {
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
	 * The default value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLLECTION_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.DATA_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.DATA_INPUT__NAME, Bpmn2Package.Literals.DATA_INPUT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.DATA_INPUT__NAME, Bpmn2Package.Literals.DATA_INPUT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCollection() {
		return (Boolean) eDynamicGet(Bpmn2Package.DATA_INPUT__IS_COLLECTION,
				Bpmn2Package.Literals.DATA_INPUT__IS_COLLECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(boolean newIsCollection) {
		eDynamicSet(Bpmn2Package.DATA_INPUT__IS_COLLECTION, Bpmn2Package.Literals.DATA_INPUT__IS_COLLECTION,
				newIsCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InputSet> getInputSetWithOptional() {
		return (EList<InputSet>) eDynamicGet(Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL,
				Bpmn2Package.Literals.DATA_INPUT__INPUT_SET_WITH_OPTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InputSet> getInputSetWithWhileExecuting() {
		return (EList<InputSet>) eDynamicGet(Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING,
				Bpmn2Package.Literals.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InputSet> getInputSetRefs() {
		return (EList<InputSet>) eDynamicGet(Bpmn2Package.DATA_INPUT__INPUT_SET_REFS,
				Bpmn2Package.Literals.DATA_INPUT__INPUT_SET_REFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputSetWithOptional()).basicAdd(otherEnd,
					msgs);
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputSetWithWhileExecuting())
					.basicAdd(otherEnd, msgs);
		case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputSetRefs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
			return ((InternalEList<?>) getInputSetWithOptional()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
			return ((InternalEList<?>) getInputSetWithWhileExecuting()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS:
			return ((InternalEList<?>) getInputSetRefs()).basicRemove(otherEnd, msgs);
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
		case Bpmn2Package.DATA_INPUT__NAME:
			return getName();
		case Bpmn2Package.DATA_INPUT__IS_COLLECTION:
			return isIsCollection();
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
			return getInputSetWithOptional();
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
			return getInputSetWithWhileExecuting();
		case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS:
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
		case Bpmn2Package.DATA_INPUT__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.DATA_INPUT__IS_COLLECTION:
			setIsCollection((Boolean) newValue);
			return;
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
			getInputSetWithOptional().clear();
			getInputSetWithOptional().addAll((Collection<? extends InputSet>) newValue);
			return;
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
			getInputSetWithWhileExecuting().clear();
			getInputSetWithWhileExecuting().addAll((Collection<? extends InputSet>) newValue);
			return;
		case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS:
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
		case Bpmn2Package.DATA_INPUT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.DATA_INPUT__IS_COLLECTION:
			setIsCollection(IS_COLLECTION_EDEFAULT);
			return;
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
			getInputSetWithOptional().clear();
			return;
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
			getInputSetWithWhileExecuting().clear();
			return;
		case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS:
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
		case Bpmn2Package.DATA_INPUT__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case Bpmn2Package.DATA_INPUT__IS_COLLECTION:
			return isIsCollection() != IS_COLLECTION_EDEFAULT;
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
			return !getInputSetWithOptional().isEmpty();
		case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
			return !getInputSetWithWhileExecuting().isEmpty();
		case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS:
			return !getInputSetRefs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataInputImpl
