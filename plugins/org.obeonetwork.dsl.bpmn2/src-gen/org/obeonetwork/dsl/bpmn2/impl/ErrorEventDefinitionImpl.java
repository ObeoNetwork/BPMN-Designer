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
import org.obeonetwork.dsl.bpmn2.ErrorEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ErrorEventDefinitionImpl#getErrorRef <em>Error Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorEventDefinitionImpl extends EventDefinitionImpl implements
		ErrorEventDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.ERROR_EVENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.bpmn2.Error getErrorRef() {
		return (org.obeonetwork.dsl.bpmn2.Error) eDynamicGet(
				Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF,
				Bpmn2Package.Literals.ERROR_EVENT_DEFINITION__ERROR_REF, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.bpmn2.Error basicGetErrorRef() {
		return (org.obeonetwork.dsl.bpmn2.Error) eDynamicGet(
				Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF,
				Bpmn2Package.Literals.ERROR_EVENT_DEFINITION__ERROR_REF, false,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorRef(org.obeonetwork.dsl.bpmn2.Error newErrorRef) {
		eDynamicSet(Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF,
				Bpmn2Package.Literals.ERROR_EVENT_DEFINITION__ERROR_REF,
				newErrorRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF:
			if (resolve)
				return getErrorRef();
			return basicGetErrorRef();
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
		case Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF:
			setErrorRef((org.obeonetwork.dsl.bpmn2.Error) newValue);
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
		case Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF:
			setErrorRef((org.obeonetwork.dsl.bpmn2.Error) null);
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
		case Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF:
			return basicGetErrorRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorEventDefinitionImpl
