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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
	 * The default value of the '{@link #isTestBefore() <em>Test Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBefore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BEFORE_EDEFAULT = false;

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
		return (Boolean) eDynamicGet(
				Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE,
				Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestBefore(boolean newTestBefore) {
		eDynamicSet(
				Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE,
				Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE,
				newTestBefore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLoopCondition() {
		return (Expression) eDynamicGet(
				Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION,
				Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCondition(Expression newLoopCondition,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newLoopCondition,
				Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCondition(Expression newLoopCondition) {
		eDynamicSet(
				Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION,
				Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION,
				newLoopCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLoopMaximum() {
		return (Expression) eDynamicGet(
				Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM,
				Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopMaximum(Expression newLoopMaximum,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newLoopMaximum,
				Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopMaximum(Expression newLoopMaximum) {
		eDynamicSet(
				Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM,
				Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM,
				newLoopMaximum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
			return basicSetLoopCondition(null, msgs);
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
			return basicSetLoopMaximum(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
			return isTestBefore();
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
			return getLoopCondition();
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
			return getLoopMaximum();
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
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
			setTestBefore((Boolean) newValue);
			return;
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
			setLoopCondition((Expression) newValue);
			return;
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
			setLoopMaximum((Expression) newValue);
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
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
			setTestBefore(TEST_BEFORE_EDEFAULT);
			return;
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
			setLoopCondition((Expression) null);
			return;
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
			setLoopMaximum((Expression) null);
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
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
			return isTestBefore() != TEST_BEFORE_EDEFAULT;
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
			return getLoopCondition() != null;
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
			return getLoopMaximum() != null;
		}
		return super.eIsSet(featureID);
	}

} //StandardLoopCharacteristicsImpl
