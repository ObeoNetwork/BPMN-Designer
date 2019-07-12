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
import org.obeonetwork.dsl.bpmn2.Auditing;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.CategoryValue;
import org.obeonetwork.dsl.bpmn2.FlowElement;
import org.obeonetwork.dsl.bpmn2.Monitoring;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl#getCategoryValueRef <em>Category Value Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowElementImpl extends BaseElementImpl implements FlowElement {
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
    protected FlowElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.FLOW_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return (String) eDynamicGet(Bpmn2Package.FLOW_ELEMENT__NAME, Bpmn2Package.Literals.FLOW_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        eDynamicSet(Bpmn2Package.FLOW_ELEMENT__NAME, Bpmn2Package.Literals.FLOW_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Auditing getAuditing() {
        return (Auditing) eDynamicGet(Bpmn2Package.FLOW_ELEMENT__AUDITING, Bpmn2Package.Literals.FLOW_ELEMENT__AUDITING, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAuditing(Auditing newAuditing, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newAuditing, Bpmn2Package.FLOW_ELEMENT__AUDITING, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAuditing(Auditing newAuditing) {
        eDynamicSet(Bpmn2Package.FLOW_ELEMENT__AUDITING, Bpmn2Package.Literals.FLOW_ELEMENT__AUDITING, newAuditing);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Monitoring getMonitoring() {
        return (Monitoring) eDynamicGet(Bpmn2Package.FLOW_ELEMENT__MONITORING, Bpmn2Package.Literals.FLOW_ELEMENT__MONITORING, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMonitoring(Monitoring newMonitoring, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newMonitoring, Bpmn2Package.FLOW_ELEMENT__MONITORING, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMonitoring(Monitoring newMonitoring) {
        eDynamicSet(Bpmn2Package.FLOW_ELEMENT__MONITORING, Bpmn2Package.Literals.FLOW_ELEMENT__MONITORING, newMonitoring);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<CategoryValue> getCategoryValueRef() {
        return (EList<CategoryValue>) eDynamicGet(Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF, Bpmn2Package.Literals.FLOW_ELEMENT__CATEGORY_VALUE_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getCategoryValueRef()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.FLOW_ELEMENT__AUDITING:
            return basicSetAuditing(null, msgs);
        case Bpmn2Package.FLOW_ELEMENT__MONITORING:
            return basicSetMonitoring(null, msgs);
        case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
            return ((InternalEList<?>) getCategoryValueRef()).basicRemove(otherEnd, msgs);
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
        case Bpmn2Package.FLOW_ELEMENT__NAME:
            return getName();
        case Bpmn2Package.FLOW_ELEMENT__AUDITING:
            return getAuditing();
        case Bpmn2Package.FLOW_ELEMENT__MONITORING:
            return getMonitoring();
        case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
            return getCategoryValueRef();
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
        case Bpmn2Package.FLOW_ELEMENT__NAME:
            setName((String) newValue);
            return;
        case Bpmn2Package.FLOW_ELEMENT__AUDITING:
            setAuditing((Auditing) newValue);
            return;
        case Bpmn2Package.FLOW_ELEMENT__MONITORING:
            setMonitoring((Monitoring) newValue);
            return;
        case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
            getCategoryValueRef().clear();
            getCategoryValueRef().addAll((Collection<? extends CategoryValue>) newValue);
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
        case Bpmn2Package.FLOW_ELEMENT__NAME:
            setName(NAME_EDEFAULT);
            return;
        case Bpmn2Package.FLOW_ELEMENT__AUDITING:
            setAuditing((Auditing) null);
            return;
        case Bpmn2Package.FLOW_ELEMENT__MONITORING:
            setMonitoring((Monitoring) null);
            return;
        case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
            getCategoryValueRef().clear();
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
        case Bpmn2Package.FLOW_ELEMENT__NAME:
            return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
        case Bpmn2Package.FLOW_ELEMENT__AUDITING:
            return getAuditing() != null;
        case Bpmn2Package.FLOW_ELEMENT__MONITORING:
            return getMonitoring() != null;
        case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
            return !getCategoryValueRef().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //FlowElementImpl
