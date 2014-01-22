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
	 * The default value of the '{@link #isWaitForCompletion() <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWaitForCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WAIT_FOR_COMPLETION_EDEFAULT = false;

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
		return (Boolean) eDynamicGet(
				Bpmn2Package.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION,
				Bpmn2Package.Literals.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitForCompletion(boolean newWaitForCompletion) {
		eDynamicSet(
				Bpmn2Package.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION,
				Bpmn2Package.Literals.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION,
				newWaitForCompletion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityRef() {
		return (Activity) eDynamicGet(
				Bpmn2Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF,
				Bpmn2Package.Literals.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivityRef() {
		return (Activity) eDynamicGet(
				Bpmn2Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF,
				Bpmn2Package.Literals.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityRef(Activity newActivityRef) {
		eDynamicSet(
				Bpmn2Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF,
				Bpmn2Package.Literals.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF,
				newActivityRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
			return isWaitForCompletion();
		case Bpmn2Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
			if (resolve)
				return getActivityRef();
			return basicGetActivityRef();
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
		case Bpmn2Package.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
			setWaitForCompletion((Boolean) newValue);
			return;
		case Bpmn2Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
			setActivityRef((Activity) newValue);
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
		case Bpmn2Package.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
			setWaitForCompletion(WAIT_FOR_COMPLETION_EDEFAULT);
			return;
		case Bpmn2Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
			setActivityRef((Activity) null);
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
		case Bpmn2Package.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
			return isWaitForCompletion() != WAIT_FOR_COMPLETION_EDEFAULT;
		case Bpmn2Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
			return basicGetActivityRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //CompensateEventDefinitionImpl
