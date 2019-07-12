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
import org.obeonetwork.dsl.bpmn2.ComplexGateway;
import org.obeonetwork.dsl.bpmn2.Expression;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ComplexGatewayImpl#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ComplexGatewayImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexGatewayImpl extends GatewayImpl implements ComplexGateway {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComplexGatewayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.COMPLEX_GATEWAY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getActivationCondition() {
        return (Expression) eDynamicGet(Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION, Bpmn2Package.Literals.COMPLEX_GATEWAY__ACTIVATION_CONDITION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActivationCondition(Expression newActivationCondition, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newActivationCondition, Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActivationCondition(Expression newActivationCondition) {
        eDynamicSet(Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION, Bpmn2Package.Literals.COMPLEX_GATEWAY__ACTIVATION_CONDITION, newActivationCondition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SequenceFlow getDefault() {
        return (SequenceFlow) eDynamicGet(Bpmn2Package.COMPLEX_GATEWAY__DEFAULT, Bpmn2Package.Literals.COMPLEX_GATEWAY__DEFAULT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceFlow basicGetDefault() {
        return (SequenceFlow) eDynamicGet(Bpmn2Package.COMPLEX_GATEWAY__DEFAULT, Bpmn2Package.Literals.COMPLEX_GATEWAY__DEFAULT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDefault(SequenceFlow newDefault) {
        eDynamicSet(Bpmn2Package.COMPLEX_GATEWAY__DEFAULT, Bpmn2Package.Literals.COMPLEX_GATEWAY__DEFAULT, newDefault);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            return basicSetActivationCondition(null, msgs);
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
        case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            return getActivationCondition();
        case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT:
            if (resolve)
                return getDefault();
            return basicGetDefault();
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
        case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            setActivationCondition((Expression) newValue);
            return;
        case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT:
            setDefault((SequenceFlow) newValue);
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
        case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            setActivationCondition((Expression) null);
            return;
        case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT:
            setDefault((SequenceFlow) null);
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
        case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            return getActivationCondition() != null;
        case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT:
            return basicGetDefault() != null;
        }
        return super.eIsSet(featureID);
    }

} //ComplexGatewayImpl
