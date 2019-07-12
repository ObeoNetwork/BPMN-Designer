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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ChoreographyTask;
import org.obeonetwork.dsl.bpmn2.MessageFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyTaskImpl#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoreographyTaskImpl extends ChoreographyActivityImpl implements ChoreographyTask {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChoreographyTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.CHOREOGRAPHY_TASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<MessageFlow> getMessageFlowRef() {
        return (EList<MessageFlow>) eDynamicGet(Bpmn2Package.CHOREOGRAPHY_TASK__MESSAGE_FLOW_REF, Bpmn2Package.Literals.CHOREOGRAPHY_TASK__MESSAGE_FLOW_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.CHOREOGRAPHY_TASK__MESSAGE_FLOW_REF:
            return getMessageFlowRef();
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
        case Bpmn2Package.CHOREOGRAPHY_TASK__MESSAGE_FLOW_REF:
            getMessageFlowRef().clear();
            getMessageFlowRef().addAll((Collection<? extends MessageFlow>) newValue);
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
        case Bpmn2Package.CHOREOGRAPHY_TASK__MESSAGE_FLOW_REF:
            getMessageFlowRef().clear();
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
        case Bpmn2Package.CHOREOGRAPHY_TASK__MESSAGE_FLOW_REF:
            return !getMessageFlowRef().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ChoreographyTaskImpl
