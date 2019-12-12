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
import org.obeonetwork.dsl.bpmn2.BPMN2ObjectImpl;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Expression;
import org.obeonetwork.dsl.bpmn2.ResourceParameter;
import org.obeonetwork.dsl.bpmn2.ResourceParameterBinding;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource Parameter Binding</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterBindingImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterBindingImpl#getParameterRef <em>Parameter Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterBindingImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceParameterBindingImpl extends BPMN2ObjectImpl implements ResourceParameterBinding {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ResourceParameterBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getExpression() {
        return (Expression) eDynamicGet(Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION, Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__EXPRESSION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newExpression, Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExpression(Expression newExpression) {
        eDynamicSet(Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION, Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__EXPRESSION, newExpression);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceParameter getParameterRef() {
        return (ResourceParameter) eDynamicGet(Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF, Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__PARAMETER_REF, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ResourceParameter basicGetParameterRef() {
        return (ResourceParameter) eDynamicGet(Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF, Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__PARAMETER_REF, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParameterRef(ResourceParameter newParameterRef) {
        eDynamicSet(Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF, Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__PARAMETER_REF, newParameterRef);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getId() {
        return (String) eDynamicGet(Bpmn2Package.RESOURCE_PARAMETER_BINDING__ID, Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__ID, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId(String newId) {
        eDynamicSet(Bpmn2Package.RESOURCE_PARAMETER_BINDING__ID, Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__ID, newId);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
            return basicSetExpression(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
            return getExpression();
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
            if (resolve)
                return getParameterRef();
            return basicGetParameterRef();
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__ID:
            return getId();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
            setExpression((Expression) newValue);
            return;
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
            setParameterRef((ResourceParameter) newValue);
            return;
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__ID:
            setId((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
            setExpression((Expression) null);
            return;
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
            setParameterRef((ResourceParameter) null);
            return;
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__ID:
            setId(ID_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
            return getExpression() != null;
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
            return basicGetParameterRef() != null;
        case Bpmn2Package.RESOURCE_PARAMETER_BINDING__ID:
            return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
        }
        return super.eIsSet(featureID);
    }

} // ResourceParameterBindingImpl
