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
package org.obeonetwork.dsl.bpmn2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeDuration <em>Time Duration</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getTimerEventDefinition()
 * @model
 * @generated
 */
public interface TimerEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Time Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Date</em>' containment reference.
	 * @see #setTimeDate(Expression)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getTimerEventDefinition_TimeDate()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTimeDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeDate <em>Time Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Date</em>' containment reference.
	 * @see #getTimeDate()
	 * @generated
	 */
	void setTimeDate(Expression value);

	/**
	 * Returns the value of the '<em><b>Time Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Cycle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Cycle</em>' containment reference.
	 * @see #setTimeCycle(Expression)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getTimerEventDefinition_TimeCycle()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTimeCycle();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Cycle</em>' containment reference.
	 * @see #getTimeCycle()
	 * @generated
	 */
	void setTimeCycle(Expression value);

	/**
	 * Returns the value of the '<em><b>Time Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Duration</em>' containment reference.
	 * @see #setTimeDuration(Expression)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getTimerEventDefinition_TimeDuration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTimeDuration();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeDuration <em>Time Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Duration</em>' containment reference.
	 * @see #getTimeDuration()
	 * @generated
	 */
	void setTimeDuration(Expression value);

} // TimerEventDefinition
