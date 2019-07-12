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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 * </p>
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
 *
 * @generated
 */
public class MultiInstanceLoopCharacteristicsImpl extends LoopCharacteristicsImpl implements MultiInstanceLoopCharacteristics {
    /**
     * The default value of the '{@link #isIsSequential() <em>Is Sequential</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSequential()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SEQUENTIAL_EDEFAULT = false;

    /**
     * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehavior()
     * @generated
     * @ordered
     */
    protected static final MultiInstanceBehavior BEHAVIOR_EDEFAULT = MultiInstanceBehavior.ALL;

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
    @Override
    public boolean isIsSequential() {
        return (Boolean) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsSequential(boolean newIsSequential) {
        eDynamicSet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL, newIsSequential);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MultiInstanceBehavior getBehavior() {
        return (MultiInstanceBehavior) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBehavior(MultiInstanceBehavior newBehavior) {
        eDynamicSet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, newBehavior);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getLoopCardinality() {
        return (Expression) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopCardinality(Expression newLoopCardinality, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newLoopCardinality, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoopCardinality(Expression newLoopCardinality) {
        eDynamicSet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, newLoopCardinality);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ItemAwareElement getLoopDataInputRef() {
        return (ItemAwareElement) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF,
                true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemAwareElement basicGetLoopDataInputRef() {
        return (ItemAwareElement) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF,
                false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoopDataInputRef(ItemAwareElement newLoopDataInputRef) {
        eDynamicSet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF, newLoopDataInputRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ItemAwareElement getLoopDataOutputRef() {
        return (ItemAwareElement) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF,
                true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemAwareElement basicGetLoopDataOutputRef() {
        return (ItemAwareElement) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF,
                false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoopDataOutputRef(ItemAwareElement newLoopDataOutputRef) {
        eDynamicSet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF, newLoopDataOutputRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataInput getInputDataItem() {
        return (DataInput) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputDataItem(DataInput newInputDataItem, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newInputDataItem, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputDataItem(DataInput newInputDataItem) {
        eDynamicSet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, newInputDataItem);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataOutput getOutputDataItem() {
        return (DataOutput) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutputDataItem(DataOutput newOutputDataItem, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newOutputDataItem, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutputDataItem(DataOutput newOutputDataItem) {
        eDynamicSet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, newOutputDataItem);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getCompletionCondition() {
        return (Expression) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, true,
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCompletionCondition(Expression newCompletionCondition, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newCompletionCondition, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCompletionCondition(Expression newCompletionCondition) {
        eDynamicSet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, newCompletionCondition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ComplexBehaviorDefinition> getComplexBehaviorDefinition() {
        return (EList<ComplexBehaviorDefinition>) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION,
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EventDefinition getOneBehaviorEventRef() {
        return (EventDefinition) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF,
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventDefinition basicGetOneBehaviorEventRef() {
        return (EventDefinition) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF,
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOneBehaviorEventRef(EventDefinition newOneBehaviorEventRef) {
        eDynamicSet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF,
                newOneBehaviorEventRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EventDefinition getNoneBehaviorEventRef() {
        return (EventDefinition) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF,
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventDefinition basicGetNoneBehaviorEventRef() {
        return (EventDefinition) eDynamicGet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF,
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNoneBehaviorEventRef(EventDefinition newNoneBehaviorEventRef) {
        eDynamicSet(Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF, Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF,
                newNoneBehaviorEventRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            return basicSetLoopCardinality(null, msgs);
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            return basicSetInputDataItem(null, msgs);
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            return basicSetOutputDataItem(null, msgs);
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
            return basicSetCompletionCondition(null, msgs);
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
            return ((InternalEList<?>) getComplexBehaviorDefinition()).basicRemove(otherEnd, msgs);
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
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            return isIsSequential();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            return getBehavior();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            return getLoopCardinality();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
            if (resolve)
                return getLoopDataInputRef();
            return basicGetLoopDataInputRef();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
            if (resolve)
                return getLoopDataOutputRef();
            return basicGetLoopDataOutputRef();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            return getInputDataItem();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            return getOutputDataItem();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
            return getCompletionCondition();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
            return getComplexBehaviorDefinition();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
            if (resolve)
                return getOneBehaviorEventRef();
            return basicGetOneBehaviorEventRef();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
            if (resolve)
                return getNoneBehaviorEventRef();
            return basicGetNoneBehaviorEventRef();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            setIsSequential((Boolean) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            setBehavior((MultiInstanceBehavior) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            setLoopCardinality((Expression) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
            setLoopDataInputRef((ItemAwareElement) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
            setLoopDataOutputRef((ItemAwareElement) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            setInputDataItem((DataInput) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            setOutputDataItem((DataOutput) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
            setCompletionCondition((Expression) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
            getComplexBehaviorDefinition().clear();
            getComplexBehaviorDefinition().addAll((Collection<? extends ComplexBehaviorDefinition>) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
            setOneBehaviorEventRef((EventDefinition) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
            setNoneBehaviorEventRef((EventDefinition) newValue);
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
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            setIsSequential(IS_SEQUENTIAL_EDEFAULT);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            setBehavior(BEHAVIOR_EDEFAULT);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            setLoopCardinality((Expression) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
            setLoopDataInputRef((ItemAwareElement) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
            setLoopDataOutputRef((ItemAwareElement) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            setInputDataItem((DataInput) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            setOutputDataItem((DataOutput) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
            setCompletionCondition((Expression) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
            getComplexBehaviorDefinition().clear();
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
            setOneBehaviorEventRef((EventDefinition) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
            setNoneBehaviorEventRef((EventDefinition) null);
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
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            return isIsSequential() != IS_SEQUENTIAL_EDEFAULT;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            return getBehavior() != BEHAVIOR_EDEFAULT;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            return getLoopCardinality() != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
            return basicGetLoopDataInputRef() != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
            return basicGetLoopDataOutputRef() != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            return getInputDataItem() != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            return getOutputDataItem() != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
            return getCompletionCondition() != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
            return !getComplexBehaviorDefinition().isEmpty();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
            return basicGetOneBehaviorEventRef() != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
            return basicGetNoneBehaviorEventRef() != null;
        }
        return super.eIsSet(featureID);
    }

} //MultiInstanceLoopCharacteristicsImpl
