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

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Expression;
import org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.StandardLoopCharacteristicsImpl#isTestBefore <em>Test Before</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.StandardLoopCharacteristicsImpl#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.StandardLoopCharacteristicsImpl#getLoopMaximum <em>Loop Maximum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardLoopCharacteristicsImpl extends LoopCharacteristicsImpl
		implements StandardLoopCharacteristics {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardLoopCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTestBefore() {
		return (Boolean) eGet(
				Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestBefore(boolean newTestBefore) {
		eSet(Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE,
				newTestBefore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLoopCondition() {
		return (Expression) eGet(
				Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCondition(Expression newLoopCondition) {
		eSet(Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION,
				newLoopCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLoopMaximum() {
		return (Expression) eGet(
				Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopMaximum(Expression newLoopMaximum) {
		eSet(Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM,
				newLoopMaximum);
	}

} //StandardLoopCharacteristicsImpl
