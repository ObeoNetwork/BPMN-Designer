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
import org.obeonetwork.dsl.bpmn2.CorrelationKey;
import org.obeonetwork.dsl.bpmn2.CorrelationProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationKeyImpl#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationKeyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorrelationKeyImpl extends BaseElementImpl implements CorrelationKey {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CorrelationKeyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.CORRELATION_KEY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<CorrelationProperty> getCorrelationPropertyRef() {
        return (EList<CorrelationProperty>) eDynamicGet(Bpmn2Package.CORRELATION_KEY__CORRELATION_PROPERTY_REF, Bpmn2Package.Literals.CORRELATION_KEY__CORRELATION_PROPERTY_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return (String) eDynamicGet(Bpmn2Package.CORRELATION_KEY__NAME, Bpmn2Package.Literals.CORRELATION_KEY__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        eDynamicSet(Bpmn2Package.CORRELATION_KEY__NAME, Bpmn2Package.Literals.CORRELATION_KEY__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.CORRELATION_KEY__CORRELATION_PROPERTY_REF:
            return getCorrelationPropertyRef();
        case Bpmn2Package.CORRELATION_KEY__NAME:
            return getName();
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
        case Bpmn2Package.CORRELATION_KEY__CORRELATION_PROPERTY_REF:
            getCorrelationPropertyRef().clear();
            getCorrelationPropertyRef().addAll((Collection<? extends CorrelationProperty>) newValue);
            return;
        case Bpmn2Package.CORRELATION_KEY__NAME:
            setName((String) newValue);
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
        case Bpmn2Package.CORRELATION_KEY__CORRELATION_PROPERTY_REF:
            getCorrelationPropertyRef().clear();
            return;
        case Bpmn2Package.CORRELATION_KEY__NAME:
            setName(NAME_EDEFAULT);
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
        case Bpmn2Package.CORRELATION_KEY__CORRELATION_PROPERTY_REF:
            return !getCorrelationPropertyRef().isEmpty();
        case Bpmn2Package.CORRELATION_KEY__NAME:
            return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
        }
        return super.eIsSet(featureID);
    }

} //CorrelationKeyImpl
