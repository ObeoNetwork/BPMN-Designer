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
		return (Expression) eGet(
				Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDate(Expression newTimeDate) {
		eSet(Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_DATE,
				newTimeDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTimeCycle() {
		return (Expression) eGet(
				Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_CYCLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCycle(Expression newTimeCycle) {
		eSet(Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_CYCLE,
				newTimeCycle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTimeDuration() {
		return (Expression) eGet(
				Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_DURATION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDuration(Expression newTimeDuration) {
		eSet(Bpmn2Package.Literals.TIMER_EVENT_DEFINITION__TIME_DURATION,
				newTimeDuration);
	}

} //TimerEventDefinitionImpl
