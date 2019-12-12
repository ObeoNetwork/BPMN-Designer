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
import org.obeonetwork.dsl.bpmn2.Message;
import org.obeonetwork.dsl.bpmn2.Operation;
import org.obeonetwork.dsl.bpmn2.SendTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SendTaskImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SendTaskImpl#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SendTaskImpl#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendTaskImpl extends TaskImpl implements SendTask {
    /**
     * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementation()
     * @generated
     * @ordered
     */
    protected static final String IMPLEMENTATION_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SendTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.SEND_TASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getImplementation() {
        return (String) eDynamicGet(Bpmn2Package.SEND_TASK__IMPLEMENTATION, Bpmn2Package.Literals.SEND_TASK__IMPLEMENTATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImplementation(String newImplementation) {
        eDynamicSet(Bpmn2Package.SEND_TASK__IMPLEMENTATION, Bpmn2Package.Literals.SEND_TASK__IMPLEMENTATION, newImplementation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Operation getOperationRef() {
        return (Operation) eDynamicGet(Bpmn2Package.SEND_TASK__OPERATION_REF, Bpmn2Package.Literals.SEND_TASK__OPERATION_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation basicGetOperationRef() {
        return (Operation) eDynamicGet(Bpmn2Package.SEND_TASK__OPERATION_REF, Bpmn2Package.Literals.SEND_TASK__OPERATION_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperationRef(Operation newOperationRef) {
        eDynamicSet(Bpmn2Package.SEND_TASK__OPERATION_REF, Bpmn2Package.Literals.SEND_TASK__OPERATION_REF, newOperationRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Message getMessageRef() {
        return (Message) eDynamicGet(Bpmn2Package.SEND_TASK__MESSAGE_REF, Bpmn2Package.Literals.SEND_TASK__MESSAGE_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Message basicGetMessageRef() {
        return (Message) eDynamicGet(Bpmn2Package.SEND_TASK__MESSAGE_REF, Bpmn2Package.Literals.SEND_TASK__MESSAGE_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMessageRef(Message newMessageRef) {
        eDynamicSet(Bpmn2Package.SEND_TASK__MESSAGE_REF, Bpmn2Package.Literals.SEND_TASK__MESSAGE_REF, newMessageRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.SEND_TASK__IMPLEMENTATION:
            return getImplementation();
        case Bpmn2Package.SEND_TASK__OPERATION_REF:
            if (resolve)
                return getOperationRef();
            return basicGetOperationRef();
        case Bpmn2Package.SEND_TASK__MESSAGE_REF:
            if (resolve)
                return getMessageRef();
            return basicGetMessageRef();
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
        case Bpmn2Package.SEND_TASK__IMPLEMENTATION:
            setImplementation((String) newValue);
            return;
        case Bpmn2Package.SEND_TASK__OPERATION_REF:
            setOperationRef((Operation) newValue);
            return;
        case Bpmn2Package.SEND_TASK__MESSAGE_REF:
            setMessageRef((Message) newValue);
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
        case Bpmn2Package.SEND_TASK__IMPLEMENTATION:
            setImplementation(IMPLEMENTATION_EDEFAULT);
            return;
        case Bpmn2Package.SEND_TASK__OPERATION_REF:
            setOperationRef((Operation) null);
            return;
        case Bpmn2Package.SEND_TASK__MESSAGE_REF:
            setMessageRef((Message) null);
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
        case Bpmn2Package.SEND_TASK__IMPLEMENTATION:
            return IMPLEMENTATION_EDEFAULT == null ? getImplementation() != null : !IMPLEMENTATION_EDEFAULT.equals(getImplementation());
        case Bpmn2Package.SEND_TASK__OPERATION_REF:
            return basicGetOperationRef() != null;
        case Bpmn2Package.SEND_TASK__MESSAGE_REF:
            return basicGetMessageRef() != null;
        }
        return super.eIsSet(featureID);
    }

} //SendTaskImpl
