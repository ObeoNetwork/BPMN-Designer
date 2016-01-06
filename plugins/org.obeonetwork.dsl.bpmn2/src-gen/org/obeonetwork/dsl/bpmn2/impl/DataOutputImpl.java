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
import org.obeonetwork.dsl.bpmn2.DataOutput;
import org.obeonetwork.dsl.bpmn2.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl#getOutputSetWithOptional <em>Output Set With Optional</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl#getOutputSetWithWhileExecuting <em>Output Set With While Executing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl#getOutputSetRefs <em>Output Set Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataOutputImpl extends ItemAwareElementImpl implements DataOutput {
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
	protected DataOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.DATA_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.DATA_OUTPUT__NAME, Bpmn2Package.Literals.DATA_OUTPUT__NAME, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.DATA_OUTPUT__NAME, Bpmn2Package.Literals.DATA_OUTPUT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCollection() {
		return (Boolean) eDynamicGet(Bpmn2Package.DATA_OUTPUT__IS_COLLECTION,
				Bpmn2Package.Literals.DATA_OUTPUT__IS_COLLECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(boolean newIsCollection) {
		eDynamicSet(Bpmn2Package.DATA_OUTPUT__IS_COLLECTION, Bpmn2Package.Literals.DATA_OUTPUT__IS_COLLECTION,
				newIsCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OutputSet> getOutputSetWithOptional() {
		return (EList<OutputSet>) eDynamicGet(Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL,
				Bpmn2Package.Literals.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OutputSet> getOutputSetWithWhileExecuting() {
		return (EList<OutputSet>) eDynamicGet(Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING,
				Bpmn2Package.Literals.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OutputSet> getOutputSetRefs() {
		return (EList<OutputSet>) eDynamicGet(Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS,
				Bpmn2Package.Literals.DATA_OUTPUT__OUTPUT_SET_REFS, true, true);
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
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutputSetWithOptional()).basicAdd(otherEnd,
					msgs);
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutputSetWithWhileExecuting())
					.basicAdd(otherEnd, msgs);
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutputSetRefs()).basicAdd(otherEnd, msgs);
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
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
			return ((InternalEList<?>) getOutputSetWithOptional()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
			return ((InternalEList<?>) getOutputSetWithWhileExecuting()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS:
			return ((InternalEList<?>) getOutputSetRefs()).basicRemove(otherEnd, msgs);
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
		case Bpmn2Package.DATA_OUTPUT__NAME:
			return getName();
		case Bpmn2Package.DATA_OUTPUT__IS_COLLECTION:
			return isIsCollection();
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
			return getOutputSetWithOptional();
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
			return getOutputSetWithWhileExecuting();
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS:
			return getOutputSetRefs();
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
		case Bpmn2Package.DATA_OUTPUT__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.DATA_OUTPUT__IS_COLLECTION:
			setIsCollection((Boolean) newValue);
			return;
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
			getOutputSetWithOptional().clear();
			getOutputSetWithOptional().addAll((Collection<? extends OutputSet>) newValue);
			return;
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
			getOutputSetWithWhileExecuting().clear();
			getOutputSetWithWhileExecuting().addAll((Collection<? extends OutputSet>) newValue);
			return;
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS:
			getOutputSetRefs().clear();
			getOutputSetRefs().addAll((Collection<? extends OutputSet>) newValue);
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
		case Bpmn2Package.DATA_OUTPUT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.DATA_OUTPUT__IS_COLLECTION:
			setIsCollection(IS_COLLECTION_EDEFAULT);
			return;
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
			getOutputSetWithOptional().clear();
			return;
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
			getOutputSetWithWhileExecuting().clear();
			return;
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS:
			getOutputSetRefs().clear();
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
		case Bpmn2Package.DATA_OUTPUT__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case Bpmn2Package.DATA_OUTPUT__IS_COLLECTION:
			return isIsCollection() != IS_COLLECTION_EDEFAULT;
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
			return !getOutputSetWithOptional().isEmpty();
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
			return !getOutputSetWithWhileExecuting().isEmpty();
		case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS:
			return !getOutputSetRefs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataOutputImpl
