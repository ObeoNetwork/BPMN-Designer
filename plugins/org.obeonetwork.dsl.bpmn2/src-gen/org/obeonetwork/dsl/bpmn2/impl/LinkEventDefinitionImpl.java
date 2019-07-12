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
import org.obeonetwork.dsl.bpmn2.LinkEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.LinkEventDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.LinkEventDefinitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.LinkEventDefinitionImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkEventDefinitionImpl extends EventDefinitionImpl implements LinkEventDefinition {
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
    protected LinkEventDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.LINK_EVENT_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return (String) eDynamicGet(Bpmn2Package.LINK_EVENT_DEFINITION__NAME, Bpmn2Package.Literals.LINK_EVENT_DEFINITION__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        eDynamicSet(Bpmn2Package.LINK_EVENT_DEFINITION__NAME, Bpmn2Package.Literals.LINK_EVENT_DEFINITION__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LinkEventDefinition getTarget() {
        return (LinkEventDefinition) eDynamicGet(Bpmn2Package.LINK_EVENT_DEFINITION__TARGET, Bpmn2Package.Literals.LINK_EVENT_DEFINITION__TARGET, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkEventDefinition basicGetTarget() {
        return (LinkEventDefinition) eDynamicGet(Bpmn2Package.LINK_EVENT_DEFINITION__TARGET, Bpmn2Package.Literals.LINK_EVENT_DEFINITION__TARGET, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTarget(LinkEventDefinition newTarget, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newTarget, Bpmn2Package.LINK_EVENT_DEFINITION__TARGET, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTarget(LinkEventDefinition newTarget) {
        eDynamicSet(Bpmn2Package.LINK_EVENT_DEFINITION__TARGET, Bpmn2Package.Literals.LINK_EVENT_DEFINITION__TARGET, newTarget);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<LinkEventDefinition> getSource() {
        return (EList<LinkEventDefinition>) eDynamicGet(Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE, Bpmn2Package.Literals.LINK_EVENT_DEFINITION__SOURCE, true, true);
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
        case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET:
            LinkEventDefinition target = basicGetTarget();
            if (target != null)
                msgs = ((InternalEObject) target).eInverseRemove(this, Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE, LinkEventDefinition.class, msgs);
            return basicSetTarget((LinkEventDefinition) otherEnd, msgs);
        case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSource()).basicAdd(otherEnd, msgs);
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
        case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET:
            return basicSetTarget(null, msgs);
        case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE:
            return ((InternalEList<?>) getSource()).basicRemove(otherEnd, msgs);
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
        case Bpmn2Package.LINK_EVENT_DEFINITION__NAME:
            return getName();
        case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET:
            if (resolve)
                return getTarget();
            return basicGetTarget();
        case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE:
            return getSource();
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
        case Bpmn2Package.LINK_EVENT_DEFINITION__NAME:
            setName((String) newValue);
            return;
        case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET:
            setTarget((LinkEventDefinition) newValue);
            return;
        case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE:
            getSource().clear();
            getSource().addAll((Collection<? extends LinkEventDefinition>) newValue);
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
        case Bpmn2Package.LINK_EVENT_DEFINITION__NAME:
            setName(NAME_EDEFAULT);
            return;
        case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET:
            setTarget((LinkEventDefinition) null);
            return;
        case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE:
            getSource().clear();
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
        case Bpmn2Package.LINK_EVENT_DEFINITION__NAME:
            return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
        case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET:
            return basicGetTarget() != null;
        case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE:
            return !getSource().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //LinkEventDefinitionImpl
