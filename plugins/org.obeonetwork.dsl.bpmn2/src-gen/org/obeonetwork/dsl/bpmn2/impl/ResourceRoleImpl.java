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
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Resource;
import org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression;
import org.obeonetwork.dsl.bpmn2.ResourceParameterBinding;
import org.obeonetwork.dsl.bpmn2.ResourceRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl#getResourceParameterBindings <em>Resource Parameter Bindings</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceRoleImpl extends BaseElementImpl implements ResourceRole {
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
    protected ResourceRoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.RESOURCE_ROLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Resource getResourceRef() {
        return (Resource) eDynamicGet(Bpmn2Package.RESOURCE_ROLE__RESOURCE_REF, Bpmn2Package.Literals.RESOURCE_ROLE__RESOURCE_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Resource basicGetResourceRef() {
        return (Resource) eDynamicGet(Bpmn2Package.RESOURCE_ROLE__RESOURCE_REF, Bpmn2Package.Literals.RESOURCE_ROLE__RESOURCE_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResourceRef(Resource newResourceRef) {
        eDynamicSet(Bpmn2Package.RESOURCE_ROLE__RESOURCE_REF, Bpmn2Package.Literals.RESOURCE_ROLE__RESOURCE_REF, newResourceRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ResourceParameterBinding> getResourceParameterBindings() {
        return (EList<ResourceParameterBinding>) eDynamicGet(Bpmn2Package.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS, Bpmn2Package.Literals.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceAssignmentExpression getResourceAssignmentExpression() {
        return (ResourceAssignmentExpression) eDynamicGet(Bpmn2Package.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION, Bpmn2Package.Literals.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResourceAssignmentExpression(ResourceAssignmentExpression newResourceAssignmentExpression, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newResourceAssignmentExpression, Bpmn2Package.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResourceAssignmentExpression(ResourceAssignmentExpression newResourceAssignmentExpression) {
        eDynamicSet(Bpmn2Package.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION, Bpmn2Package.Literals.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION, newResourceAssignmentExpression);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return (String) eDynamicGet(Bpmn2Package.RESOURCE_ROLE__NAME, Bpmn2Package.Literals.RESOURCE_ROLE__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        eDynamicSet(Bpmn2Package.RESOURCE_ROLE__NAME, Bpmn2Package.Literals.RESOURCE_ROLE__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS:
            return ((InternalEList<?>) getResourceParameterBindings()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION:
            return basicSetResourceAssignmentExpression(null, msgs);
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
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_REF:
            if (resolve)
                return getResourceRef();
            return basicGetResourceRef();
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS:
            return getResourceParameterBindings();
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION:
            return getResourceAssignmentExpression();
        case Bpmn2Package.RESOURCE_ROLE__NAME:
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
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_REF:
            setResourceRef((Resource) newValue);
            return;
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS:
            getResourceParameterBindings().clear();
            getResourceParameterBindings().addAll((Collection<? extends ResourceParameterBinding>) newValue);
            return;
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION:
            setResourceAssignmentExpression((ResourceAssignmentExpression) newValue);
            return;
        case Bpmn2Package.RESOURCE_ROLE__NAME:
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
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_REF:
            setResourceRef((Resource) null);
            return;
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS:
            getResourceParameterBindings().clear();
            return;
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION:
            setResourceAssignmentExpression((ResourceAssignmentExpression) null);
            return;
        case Bpmn2Package.RESOURCE_ROLE__NAME:
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
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_REF:
            return basicGetResourceRef() != null;
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS:
            return !getResourceParameterBindings().isEmpty();
        case Bpmn2Package.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION:
            return getResourceAssignmentExpression() != null;
        case Bpmn2Package.RESOURCE_ROLE__NAME:
            return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
        }
        return super.eIsSet(featureID);
    }

} //ResourceRoleImpl
