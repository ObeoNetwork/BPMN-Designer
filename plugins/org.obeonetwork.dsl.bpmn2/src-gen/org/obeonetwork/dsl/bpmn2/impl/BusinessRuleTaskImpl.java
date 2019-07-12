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
import org.obeonetwork.dsl.bpmn2.BusinessRuleTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Rule Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.BusinessRuleTaskImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessRuleTaskImpl extends TaskImpl implements BusinessRuleTask {
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
    protected BusinessRuleTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.BUSINESS_RULE_TASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getImplementation() {
        return (String) eDynamicGet(Bpmn2Package.BUSINESS_RULE_TASK__IMPLEMENTATION, Bpmn2Package.Literals.BUSINESS_RULE_TASK__IMPLEMENTATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImplementation(String newImplementation) {
        eDynamicSet(Bpmn2Package.BUSINESS_RULE_TASK__IMPLEMENTATION, Bpmn2Package.Literals.BUSINESS_RULE_TASK__IMPLEMENTATION, newImplementation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.BUSINESS_RULE_TASK__IMPLEMENTATION:
            return getImplementation();
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
        case Bpmn2Package.BUSINESS_RULE_TASK__IMPLEMENTATION:
            setImplementation((String) newValue);
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
        case Bpmn2Package.BUSINESS_RULE_TASK__IMPLEMENTATION:
            setImplementation(IMPLEMENTATION_EDEFAULT);
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
        case Bpmn2Package.BUSINESS_RULE_TASK__IMPLEMENTATION:
            return IMPLEMENTATION_EDEFAULT == null ? getImplementation() != null : !IMPLEMENTATION_EDEFAULT.equals(getImplementation());
        }
        return super.eIsSet(featureID);
    }

} //BusinessRuleTaskImpl
