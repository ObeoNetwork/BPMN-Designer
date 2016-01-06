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
import org.obeonetwork.dsl.bpmn2.GlobalScriptTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Script Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.GlobalScriptTaskImpl#getScriptLanguage <em>Script Language</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.GlobalScriptTaskImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalScriptTaskImpl extends GlobalTaskImpl implements GlobalScriptTask {
	/**
	 * The default value of the '{@link #getScriptLanguage() <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_LANGUAGE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalScriptTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.GLOBAL_SCRIPT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptLanguage() {
		return (String) eDynamicGet(Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE,
				Bpmn2Package.Literals.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptLanguage(String newScriptLanguage) {
		eDynamicSet(Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE,
				Bpmn2Package.Literals.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE, newScriptLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScript() {
		return (String) eDynamicGet(Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT,
				Bpmn2Package.Literals.GLOBAL_SCRIPT_TASK__SCRIPT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(String newScript) {
		eDynamicSet(Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT, Bpmn2Package.Literals.GLOBAL_SCRIPT_TASK__SCRIPT,
				newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE:
			return getScriptLanguage();
		case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT:
			return getScript();
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
		case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE:
			setScriptLanguage((String) newValue);
			return;
		case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT:
			setScript((String) newValue);
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
		case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE:
			setScriptLanguage(SCRIPT_LANGUAGE_EDEFAULT);
			return;
		case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT:
			setScript(SCRIPT_EDEFAULT);
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
		case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE:
			return SCRIPT_LANGUAGE_EDEFAULT == null ? getScriptLanguage() != null
					: !SCRIPT_LANGUAGE_EDEFAULT.equals(getScriptLanguage());
		case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT:
			return SCRIPT_EDEFAULT == null ? getScript() != null : !SCRIPT_EDEFAULT.equals(getScript());
		}
		return super.eIsSet(featureID);
	}

} //GlobalScriptTaskImpl
