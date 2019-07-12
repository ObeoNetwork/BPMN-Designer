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

import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Signal;
import org.obeonetwork.dsl.bpmn2.SignalEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SignalEventDefinitionImpl#getSignalRef <em>Signal Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalEventDefinitionImpl extends EventDefinitionImpl implements SignalEventDefinition {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SignalEventDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.SIGNAL_EVENT_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Signal getSignalRef() {
        return (Signal) eDynamicGet(Bpmn2Package.SIGNAL_EVENT_DEFINITION__SIGNAL_REF, Bpmn2Package.Literals.SIGNAL_EVENT_DEFINITION__SIGNAL_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Signal basicGetSignalRef() {
        return (Signal) eDynamicGet(Bpmn2Package.SIGNAL_EVENT_DEFINITION__SIGNAL_REF, Bpmn2Package.Literals.SIGNAL_EVENT_DEFINITION__SIGNAL_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSignalRef(Signal newSignalRef) {
        eDynamicSet(Bpmn2Package.SIGNAL_EVENT_DEFINITION__SIGNAL_REF, Bpmn2Package.Literals.SIGNAL_EVENT_DEFINITION__SIGNAL_REF, newSignalRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
            if (resolve)
                return getSignalRef();
            return basicGetSignalRef();
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
        case Bpmn2Package.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
            setSignalRef((Signal) newValue);
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
        case Bpmn2Package.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
            setSignalRef((Signal) null);
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
        case Bpmn2Package.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
            return basicGetSignalRef() != null;
        }
        return super.eIsSet(featureID);
    }

} //SignalEventDefinitionImpl
