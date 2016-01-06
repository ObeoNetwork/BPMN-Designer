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
import org.obeonetwork.dsl.bpmn2.ResourceParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceParameterImpl extends BaseElementImpl implements ResourceParameter {
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
	 * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.RESOURCE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.RESOURCE_PARAMETER__NAME,
				Bpmn2Package.Literals.RESOURCE_PARAMETER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.RESOURCE_PARAMETER__NAME, Bpmn2Package.Literals.RESOURCE_PARAMETER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRequired() {
		return (Boolean) eDynamicGet(Bpmn2Package.RESOURCE_PARAMETER__IS_REQUIRED,
				Bpmn2Package.Literals.RESOURCE_PARAMETER__IS_REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRequired(boolean newIsRequired) {
		eDynamicSet(Bpmn2Package.RESOURCE_PARAMETER__IS_REQUIRED, Bpmn2Package.Literals.RESOURCE_PARAMETER__IS_REQUIRED,
				newIsRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getType() {
		return (ItemDefinition) eDynamicGet(Bpmn2Package.RESOURCE_PARAMETER__TYPE,
				Bpmn2Package.Literals.RESOURCE_PARAMETER__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetType() {
		return (ItemDefinition) eDynamicGet(Bpmn2Package.RESOURCE_PARAMETER__TYPE,
				Bpmn2Package.Literals.RESOURCE_PARAMETER__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ItemDefinition newType) {
		eDynamicSet(Bpmn2Package.RESOURCE_PARAMETER__TYPE, Bpmn2Package.Literals.RESOURCE_PARAMETER__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.RESOURCE_PARAMETER__NAME:
			return getName();
		case Bpmn2Package.RESOURCE_PARAMETER__IS_REQUIRED:
			return isIsRequired();
		case Bpmn2Package.RESOURCE_PARAMETER__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
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
		case Bpmn2Package.RESOURCE_PARAMETER__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.RESOURCE_PARAMETER__IS_REQUIRED:
			setIsRequired((Boolean) newValue);
			return;
		case Bpmn2Package.RESOURCE_PARAMETER__TYPE:
			setType((ItemDefinition) newValue);
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
		case Bpmn2Package.RESOURCE_PARAMETER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.RESOURCE_PARAMETER__IS_REQUIRED:
			setIsRequired(IS_REQUIRED_EDEFAULT);
			return;
		case Bpmn2Package.RESOURCE_PARAMETER__TYPE:
			setType((ItemDefinition) null);
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
		case Bpmn2Package.RESOURCE_PARAMETER__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case Bpmn2Package.RESOURCE_PARAMETER__IS_REQUIRED:
			return isIsRequired() != IS_REQUIRED_EDEFAULT;
		case Bpmn2Package.RESOURCE_PARAMETER__TYPE:
			return basicGetType() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceParameterImpl
