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
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AdHocSubProcessImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AdHocSubProcessImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AdHocSubProcessImpl#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdHocSubProcessImpl extends SubProcessImpl implements AdHocSubProcess {
    /**
     * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrdering()
     * @generated
     * @ordered
     */
    protected static final AdHocOrdering ORDERING_EDEFAULT = AdHocOrdering.PARALLEL;

    /**
     * The default value of the '{@link #isCancelRemainingInstances() <em>Cancel Remaining Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCancelRemainingInstances()
     * @generated
     * @ordered
     */
    protected static final boolean CANCEL_REMAINING_INSTANCES_EDEFAULT = true;

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
    @Override
    public Expression getCompletionCondition() {
        return (Expression) eDynamicGet(Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCompletionCondition(Expression newCompletionCondition, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newCompletionCondition, Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCompletionCondition(Expression newCompletionCondition) {
        eDynamicSet(Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, newCompletionCondition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AdHocOrdering getOrdering() {
        return (AdHocOrdering) eDynamicGet(Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING, Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__ORDERING, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOrdering(AdHocOrdering newOrdering) {
        eDynamicSet(Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING, Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__ORDERING, newOrdering);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isCancelRemainingInstances() {
        return (Boolean) eDynamicGet(Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES, Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCancelRemainingInstances(boolean newCancelRemainingInstances) {
        eDynamicSet(Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES, Bpmn2Package.Literals.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES, newCancelRemainingInstances);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
            return basicSetCompletionCondition(null, msgs);
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
        case Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
            return getCompletionCondition();
        case Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING:
            return getOrdering();
        case Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
            return isCancelRemainingInstances();
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
        case Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
            setCompletionCondition((Expression) newValue);
            return;
        case Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING:
            setOrdering((AdHocOrdering) newValue);
            return;
        case Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
            setCancelRemainingInstances((Boolean) newValue);
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
        case Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
            setCompletionCondition((Expression) null);
            return;
        case Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING:
            setOrdering(ORDERING_EDEFAULT);
            return;
        case Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
            setCancelRemainingInstances(CANCEL_REMAINING_INSTANCES_EDEFAULT);
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
        case Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
            return getCompletionCondition() != null;
        case Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING:
            return getOrdering() != ORDERING_EDEFAULT;
        case Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
            return isCancelRemainingInstances() != CANCEL_REMAINING_INSTANCES_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //AdHocSubProcessImpl
