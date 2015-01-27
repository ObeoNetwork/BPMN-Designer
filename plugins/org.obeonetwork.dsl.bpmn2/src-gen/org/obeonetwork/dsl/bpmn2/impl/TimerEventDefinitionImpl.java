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
import org.obeonetwork.dsl.bpmn2.TimerEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.TimerEventDefinitionImpl#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.TimerEventDefinitionImpl#getTimeCycle <em>Time Cycle</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.TimerEventDefinitionImpl#getTimeDuration <em>Time Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimerEventDefinitionImpl extends EventDefinitionImpl implements
		TimerEventDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.TIMER_EVENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTimeDate() {
		return (Expression) eDynamicGet(
				Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE,
				Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_DATE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeDate(Expression newTimeDate,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTimeDate,
				Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDate(Expression newTimeDate) {
		eDynamicSet(Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE,
				Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_DATE,
				newTimeDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTimeCycle() {
		return (Expression) eDynamicGet(
				Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE,
				Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_CYCLE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCycle(Expression newTimeCycle,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTimeCycle,
				Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCycle(Expression newTimeCycle) {
		eDynamicSet(Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE,
				Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_CYCLE,
				newTimeCycle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTimeDuration() {
		return (Expression) eDynamicGet(
				Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION,
				Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_DURATION,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeDuration(Expression newTimeDuration,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTimeDuration,
				Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDuration(Expression newTimeDuration) {
		eDynamicSet(Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION,
				Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_DURATION,
				newTimeDuration);
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
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE:
			return basicSetTimeDate(null, msgs);
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE:
			return basicSetTimeCycle(null, msgs);
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION:
			return basicSetTimeDuration(null, msgs);
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
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE:
			return getTimeDate();
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE:
			return getTimeCycle();
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION:
			return getTimeDuration();
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
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE:
			setTimeDate((Expression) newValue);
			return;
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE:
			setTimeCycle((Expression) newValue);
			return;
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION:
			setTimeDuration((Expression) newValue);
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
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE:
			setTimeDate((Expression) null);
			return;
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE:
			setTimeCycle((Expression) null);
			return;
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION:
			setTimeDuration((Expression) null);
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
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE:
			return getTimeDate() != null;
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE:
			return getTimeCycle() != null;
		case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION:
			return getTimeDuration() != null;
		}
		return super.eIsSet(featureID);
	}

} //TimerEventDefinitionImpl
