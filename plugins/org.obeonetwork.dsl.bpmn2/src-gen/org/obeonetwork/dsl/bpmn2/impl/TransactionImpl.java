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
import org.obeonetwork.dsl.bpmn2.Transaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.TransactionImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.TransactionImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends SubProcessImpl implements Transaction {
    /**
     * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtocol()
     * @generated
     * @ordered
     */
    protected static final String PROTOCOL_EDEFAULT = null;

    /**
     * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected static final String METHOD_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransactionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.TRANSACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getProtocol() {
        return (String) eDynamicGet(Bpmn2Package.TRANSACTION__PROTOCOL, Bpmn2Package.Literals.TRANSACTION__PROTOCOL, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProtocol(String newProtocol) {
        eDynamicSet(Bpmn2Package.TRANSACTION__PROTOCOL, Bpmn2Package.Literals.TRANSACTION__PROTOCOL, newProtocol);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMethod() {
        return (String) eDynamicGet(Bpmn2Package.TRANSACTION__METHOD, Bpmn2Package.Literals.TRANSACTION__METHOD, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMethod(String newMethod) {
        eDynamicSet(Bpmn2Package.TRANSACTION__METHOD, Bpmn2Package.Literals.TRANSACTION__METHOD, newMethod);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.TRANSACTION__PROTOCOL:
            return getProtocol();
        case Bpmn2Package.TRANSACTION__METHOD:
            return getMethod();
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
        case Bpmn2Package.TRANSACTION__PROTOCOL:
            setProtocol((String) newValue);
            return;
        case Bpmn2Package.TRANSACTION__METHOD:
            setMethod((String) newValue);
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
        case Bpmn2Package.TRANSACTION__PROTOCOL:
            setProtocol(PROTOCOL_EDEFAULT);
            return;
        case Bpmn2Package.TRANSACTION__METHOD:
            setMethod(METHOD_EDEFAULT);
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
        case Bpmn2Package.TRANSACTION__PROTOCOL:
            return PROTOCOL_EDEFAULT == null ? getProtocol() != null : !PROTOCOL_EDEFAULT.equals(getProtocol());
        case Bpmn2Package.TRANSACTION__METHOD:
            return METHOD_EDEFAULT == null ? getMethod() != null : !METHOD_EDEFAULT.equals(getMethod());
        }
        return super.eIsSet(featureID);
    }

} //TransactionImpl
