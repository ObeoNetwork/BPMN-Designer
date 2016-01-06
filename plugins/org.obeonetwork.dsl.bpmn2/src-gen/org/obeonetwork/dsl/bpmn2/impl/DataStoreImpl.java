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

import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.DataStore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataStoreImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataStoreImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataStoreImpl#isIsUnlimited <em>Is Unlimited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataStoreImpl extends ItemAwareElementImpl implements DataStore {
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
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #isIsUnlimited() <em>Is Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnlimited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNLIMITED_EDEFAULT = true;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.DATA_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.DATA_STORE__NAME, Bpmn2Package.Literals.DATA_STORE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.DATA_STORE__NAME, Bpmn2Package.Literals.DATA_STORE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return (Integer) eDynamicGet(Bpmn2Package.DATA_STORE__CAPACITY, Bpmn2Package.Literals.DATA_STORE__CAPACITY,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		eDynamicSet(Bpmn2Package.DATA_STORE__CAPACITY, Bpmn2Package.Literals.DATA_STORE__CAPACITY, newCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnlimited() {
		return (Boolean) eDynamicGet(Bpmn2Package.DATA_STORE__IS_UNLIMITED,
				Bpmn2Package.Literals.DATA_STORE__IS_UNLIMITED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnlimited(boolean newIsUnlimited) {
		eDynamicSet(Bpmn2Package.DATA_STORE__IS_UNLIMITED, Bpmn2Package.Literals.DATA_STORE__IS_UNLIMITED,
				newIsUnlimited);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.DATA_STORE__NAME:
			return getName();
		case Bpmn2Package.DATA_STORE__CAPACITY:
			return getCapacity();
		case Bpmn2Package.DATA_STORE__IS_UNLIMITED:
			return isIsUnlimited();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.DATA_STORE__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.DATA_STORE__CAPACITY:
			setCapacity((Integer) newValue);
			return;
		case Bpmn2Package.DATA_STORE__IS_UNLIMITED:
			setIsUnlimited((Boolean) newValue);
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
		case Bpmn2Package.DATA_STORE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.DATA_STORE__CAPACITY:
			setCapacity(CAPACITY_EDEFAULT);
			return;
		case Bpmn2Package.DATA_STORE__IS_UNLIMITED:
			setIsUnlimited(IS_UNLIMITED_EDEFAULT);
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
		case Bpmn2Package.DATA_STORE__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case Bpmn2Package.DATA_STORE__CAPACITY:
			return getCapacity() != CAPACITY_EDEFAULT;
		case Bpmn2Package.DATA_STORE__IS_UNLIMITED:
			return isIsUnlimited() != IS_UNLIMITED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DataStoreImpl
