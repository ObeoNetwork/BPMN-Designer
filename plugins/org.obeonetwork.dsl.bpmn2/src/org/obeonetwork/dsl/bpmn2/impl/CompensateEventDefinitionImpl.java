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

import org.obeonetwork.dsl.bpmn2.Activity;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.CompensateEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compensate Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CompensateEventDefinitionImpl#isWaitForCompletion <em>Wait For Completion</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CompensateEventDefinitionImpl#getActivityRef <em>Activity Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompensateEventDefinitionImpl extends EventDefinitionImpl
		implements CompensateEventDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompensateEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.COMPENSATE_EVENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWaitForCompletion() {
		return (Boolean) eGet(
				Bpmn2Package.Literals.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitForCompletion(boolean newWaitForCompletion) {
		eSet(Bpmn2Package.Literals.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION,
				newWaitForCompletion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityRef() {
		return (Activity) eGet(
				Bpmn2Package.Literals.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityRef(Activity newActivityRef) {
		eSet(Bpmn2Package.Literals.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF,
				newActivityRef);
	}

} //CompensateEventDefinitionImpl
