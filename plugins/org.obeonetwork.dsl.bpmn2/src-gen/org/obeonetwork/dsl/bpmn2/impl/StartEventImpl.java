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
import org.obeonetwork.dsl.bpmn2.StartEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.StartEventImpl#isIsInterrupting <em>Is Interrupting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartEventImpl extends CatchEventImpl implements StartEvent {
	/**
	 * The default value of the '{@link #isIsInterrupting() <em>Is Interrupting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInterrupting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTERRUPTING_EDEFAULT = true;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.START_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInterrupting() {
		return (Boolean) eDynamicGet(Bpmn2Package.START_EVENT__IS_INTERRUPTING,
				Bpmn2Package.Literals.START_EVENT__IS_INTERRUPTING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInterrupting(boolean newIsInterrupting) {
		eDynamicSet(Bpmn2Package.START_EVENT__IS_INTERRUPTING, Bpmn2Package.Literals.START_EVENT__IS_INTERRUPTING,
				newIsInterrupting);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.START_EVENT__IS_INTERRUPTING:
			return isIsInterrupting();
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
		case Bpmn2Package.START_EVENT__IS_INTERRUPTING:
			setIsInterrupting((Boolean) newValue);
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
		case Bpmn2Package.START_EVENT__IS_INTERRUPTING:
			setIsInterrupting(IS_INTERRUPTING_EDEFAULT);
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
		case Bpmn2Package.START_EVENT__IS_INTERRUPTING:
			return isIsInterrupting() != IS_INTERRUPTING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //StartEventImpl
