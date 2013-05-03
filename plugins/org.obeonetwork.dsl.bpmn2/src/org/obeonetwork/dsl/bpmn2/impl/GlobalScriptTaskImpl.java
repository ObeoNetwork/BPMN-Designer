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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.GlobalScriptTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Script Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.GlobalScriptTaskImpl#getScriptLanguage <em>Script Language</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.GlobalScriptTaskImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalScriptTaskImpl extends GlobalTaskImpl implements
		GlobalScriptTask {
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
		return (String) eGet(
				Bpmn2Package.Literals.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptLanguage(String newScriptLanguage) {
		eSet(Bpmn2Package.Literals.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE,
				newScriptLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScript() {
		return (String) eGet(Bpmn2Package.Literals.GLOBAL_SCRIPT_TASK__SCRIPT,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(String newScript) {
		eSet(Bpmn2Package.Literals.GLOBAL_SCRIPT_TASK__SCRIPT, newScript);
	}

} //GlobalScriptTaskImpl
