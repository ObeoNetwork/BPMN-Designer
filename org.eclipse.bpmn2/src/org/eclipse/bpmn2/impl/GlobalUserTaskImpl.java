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
package org.eclipse.bpmn2.impl;

import java.util.Collection;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.GlobalUserTask;
import org.eclipse.bpmn2.Rendering;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global User Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.GlobalUserTaskImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.GlobalUserTaskImpl#getRenderings <em>Renderings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalUserTaskImpl extends GlobalTaskImpl implements GlobalUserTask {
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
     * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementation()
     * @generated
     * @ordered
     */
    protected String implementation = IMPLEMENTATION_EDEFAULT;

    /**
     * The cached value of the '{@link #getRenderings() <em>Renderings</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRenderings()
     * @generated
     * @ordered
     */
    protected EList<Rendering> renderings;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GlobalUserTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.GLOBAL_USER_TASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImplementation() {
        return implementation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImplementation(String newImplementation) {
        String oldImplementation = implementation;
        implementation = newImplementation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.GLOBAL_USER_TASK__IMPLEMENTATION, oldImplementation,
                    implementation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Rendering> getRenderings() {
        if (renderings == null) {
            renderings = new EObjectContainmentEList<Rendering>(Rendering.class, this,
                    Bpmn2Package.GLOBAL_USER_TASK__RENDERINGS);
        }
        return renderings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
            NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.GLOBAL_USER_TASK__RENDERINGS:
            return ((InternalEList<?>) getRenderings()).basicRemove(otherEnd, msgs);
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
        case Bpmn2Package.GLOBAL_USER_TASK__IMPLEMENTATION:
            return getImplementation();
        case Bpmn2Package.GLOBAL_USER_TASK__RENDERINGS:
            return getRenderings();
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
        case Bpmn2Package.GLOBAL_USER_TASK__IMPLEMENTATION:
            setImplementation((String) newValue);
            return;
        case Bpmn2Package.GLOBAL_USER_TASK__RENDERINGS:
            getRenderings().clear();
            getRenderings().addAll((Collection<? extends Rendering>) newValue);
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
        case Bpmn2Package.GLOBAL_USER_TASK__IMPLEMENTATION:
            setImplementation(IMPLEMENTATION_EDEFAULT);
            return;
        case Bpmn2Package.GLOBAL_USER_TASK__RENDERINGS:
            getRenderings().clear();
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
        case Bpmn2Package.GLOBAL_USER_TASK__IMPLEMENTATION:
            return IMPLEMENTATION_EDEFAULT == null ? implementation != null
                    : !IMPLEMENTATION_EDEFAULT.equals(implementation);
        case Bpmn2Package.GLOBAL_USER_TASK__RENDERINGS:
            return renderings != null && !renderings.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (implementation: ");
        result.append(implementation);
        result.append(')');
        return result.toString();
    }

} //GlobalUserTaskImpl
