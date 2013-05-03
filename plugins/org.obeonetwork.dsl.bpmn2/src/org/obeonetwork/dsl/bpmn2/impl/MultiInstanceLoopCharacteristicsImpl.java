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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ComplexBehaviorDefinition;
import org.obeonetwork.dsl.bpmn2.DataInput;
import org.obeonetwork.dsl.bpmn2.DataOutput;
import org.obeonetwork.dsl.bpmn2.EventDefinition;
import org.obeonetwork.dsl.bpmn2.Expression;
import org.obeonetwork.dsl.bpmn2.ItemAwareElement;
import org.obeonetwork.dsl.bpmn2.MultiInstanceBehavior;
import org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Instance Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#isIsSequential <em>Is Sequential</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getLoopCardinality <em>Loop Cardinality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataInputRef <em>Loop Data Input Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataOutputRef <em>Loop Data Output Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getInputDataItem <em>Input Data Item</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getOutputDataItem <em>Output Data Item</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiInstanceLoopCharacteristicsImpl extends
		LoopCharacteristicsImpl implements MultiInstanceLoopCharacteristics {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiInstanceLoopCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSequential() {
		return (Boolean) eGet(
				Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSequential(boolean newIsSequential) {
		eSet(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL,
				newIsSequential);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceBehavior getBehavior() {
		return (MultiInstanceBehavior) eGet(
				Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(MultiInstanceBehavior newBehavior) {
		eSet(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR,
				newBehavior);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLoopCardinality() {
		return (Expression) eGet(
				Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCardinality(Expression newLoopCardinality) {
		eSet(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY,
				newLoopCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement getLoopDataInputRef() {
		return (ItemAwareElement) eGet(
				Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopDataInputRef(ItemAwareElement newLoopDataInputRef) {
		eSet(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF,
				newLoopDataInputRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement getLoopDataOutputRef() {
		return (ItemAwareElement) eGet(
				Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopDataOutputRef(ItemAwareElement newLoopDataOutputRef) {
		eSet(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF,
				newLoopDataOutputRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput getInputDataItem() {
		return (DataInput) eGet(
				Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDataItem(DataInput newInputDataItem) {
		eSet(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM,
				newInputDataItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutput getOutputDataItem() {
		return (DataOutput) eGet(
				Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDataItem(DataOutput newOutputDataItem) {
		eSet(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM,
				newOutputDataItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCompletionCondition() {
		return (Expression) eGet(
				Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionCondition(Expression newCompletionCondition) {
		eSet(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION,
				newCompletionCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ComplexBehaviorDefinition> getComplexBehaviorDefinition() {
		return (EList<ComplexBehaviorDefinition>) eGet(
				Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition getOneBehaviorEventRef() {
		return (EventDefinition) eGet(
				Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneBehaviorEventRef(EventDefinition newOneBehaviorEventRef) {
		eSet(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF,
				newOneBehaviorEventRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition getNoneBehaviorEventRef() {
		return (EventDefinition) eGet(
				Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoneBehaviorEventRef(EventDefinition newNoneBehaviorEventRef) {
		eSet(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF,
				newNoneBehaviorEventRef);
	}

} //MultiInstanceLoopCharacteristicsImpl
