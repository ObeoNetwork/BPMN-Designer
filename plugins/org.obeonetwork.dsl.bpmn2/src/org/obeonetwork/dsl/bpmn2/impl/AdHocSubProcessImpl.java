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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.bpmn2.AdHocOrdering;
import org.obeonetwork.dsl.bpmn2.AdHocSubProcess;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ad Hoc Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AdHocSubProcessImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AdHocSubProcessImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AdHocSubProcessImpl#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdHocSubProcessImpl extends SubProcessImpl implements
		AdHocSubProcess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdHocSubProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.AD_HOC_SUB_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCompletionCondition() {
		return (Expression) eGet(
				Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionCondition(Expression newCompletionCondition) {
		eSet(Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION,
				newCompletionCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocOrdering getOrdering() {
		return (AdHocOrdering) eGet(
				Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__ORDERING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(AdHocOrdering newOrdering) {
		eSet(Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__ORDERING, newOrdering);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCancelRemainingInstances() {
		return (Boolean) eGet(
				Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelRemainingInstances(boolean newCancelRemainingInstances) {
		eSet(Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES,
				newCancelRemainingInstances);
	}

} //AdHocSubProcessImpl
