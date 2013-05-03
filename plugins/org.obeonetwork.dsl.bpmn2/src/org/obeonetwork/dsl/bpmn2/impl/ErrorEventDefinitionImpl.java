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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
		return (org.obeonetwork.dsl.bpmn2.Error) eGet(
				Bpmn2Package.Literals.ERROR_EVENT_DEFINITION__ERROR_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorRef(org.obeonetwork.dsl.bpmn2.Error newErrorRef) {
		eSet(Bpmn2Package.Literals.ERROR_EVENT_DEFINITION__ERROR_REF,
				newErrorRef);
	}

} //ErrorEventDefinitionImpl
