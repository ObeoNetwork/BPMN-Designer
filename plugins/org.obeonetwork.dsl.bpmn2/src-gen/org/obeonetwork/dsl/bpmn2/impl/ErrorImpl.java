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
import org.obeonetwork.dsl.bpmn2.ItemDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ErrorImpl#getStructureRef <em>Structure Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ErrorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ErrorImpl#getErrorCode <em>Error Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorImpl extends RootElementImpl implements org.obeonetwork.dsl.bpmn2.Error {
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
	 * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_CODE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.ERROR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getStructureRef() {
		return (ItemDefinition) eDynamicGet(Bpmn2Package.ERROR__STRUCTURE_REF,
				Bpmn2Package.Literals.ERROR__STRUCTURE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetStructureRef() {
		return (ItemDefinition) eDynamicGet(Bpmn2Package.ERROR__STRUCTURE_REF,
				Bpmn2Package.Literals.ERROR__STRUCTURE_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureRef(ItemDefinition newStructureRef) {
		eDynamicSet(Bpmn2Package.ERROR__STRUCTURE_REF, Bpmn2Package.Literals.ERROR__STRUCTURE_REF, newStructureRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.ERROR__NAME, Bpmn2Package.Literals.ERROR__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.ERROR__NAME, Bpmn2Package.Literals.ERROR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorCode() {
		return (String) eDynamicGet(Bpmn2Package.ERROR__ERROR_CODE, Bpmn2Package.Literals.ERROR__ERROR_CODE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCode(String newErrorCode) {
		eDynamicSet(Bpmn2Package.ERROR__ERROR_CODE, Bpmn2Package.Literals.ERROR__ERROR_CODE, newErrorCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.ERROR__STRUCTURE_REF:
			if (resolve)
				return getStructureRef();
			return basicGetStructureRef();
		case Bpmn2Package.ERROR__NAME:
			return getName();
		case Bpmn2Package.ERROR__ERROR_CODE:
			return getErrorCode();
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
		case Bpmn2Package.ERROR__STRUCTURE_REF:
			setStructureRef((ItemDefinition) newValue);
			return;
		case Bpmn2Package.ERROR__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.ERROR__ERROR_CODE:
			setErrorCode((String) newValue);
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
		case Bpmn2Package.ERROR__STRUCTURE_REF:
			setStructureRef((ItemDefinition) null);
			return;
		case Bpmn2Package.ERROR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.ERROR__ERROR_CODE:
			setErrorCode(ERROR_CODE_EDEFAULT);
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
		case Bpmn2Package.ERROR__STRUCTURE_REF:
			return basicGetStructureRef() != null;
		case Bpmn2Package.ERROR__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case Bpmn2Package.ERROR__ERROR_CODE:
			return ERROR_CODE_EDEFAULT == null ? getErrorCode() != null : !ERROR_CODE_EDEFAULT.equals(getErrorCode());
		}
		return super.eIsSet(featureID);
	}

} //ErrorImpl
