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
import org.obeonetwork.dsl.bpmn2.CorrelationProperty;
import org.obeonetwork.dsl.bpmn2.CorrelationPropertyRetrievalExpression;
import org.obeonetwork.dsl.bpmn2.ItemDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyImpl#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorrelationPropertyImpl extends RootElementImpl implements CorrelationProperty {
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
    protected CorrelationPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.CORRELATION_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<CorrelationPropertyRetrievalExpression> getCorrelationPropertyRetrievalExpression() {
        return (EList<CorrelationPropertyRetrievalExpression>) eDynamicGet(Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION,
                Bpmn2Package.Literals.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return (String) eDynamicGet(Bpmn2Package.CORRELATION_PROPERTY__NAME, Bpmn2Package.Literals.CORRELATION_PROPERTY__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        eDynamicSet(Bpmn2Package.CORRELATION_PROPERTY__NAME, Bpmn2Package.Literals.CORRELATION_PROPERTY__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ItemDefinition getType() {
        return (ItemDefinition) eDynamicGet(Bpmn2Package.CORRELATION_PROPERTY__TYPE, Bpmn2Package.Literals.CORRELATION_PROPERTY__TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemDefinition basicGetType() {
        return (ItemDefinition) eDynamicGet(Bpmn2Package.CORRELATION_PROPERTY__TYPE, Bpmn2Package.Literals.CORRELATION_PROPERTY__TYPE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType(ItemDefinition newType) {
        eDynamicSet(Bpmn2Package.CORRELATION_PROPERTY__TYPE, Bpmn2Package.Literals.CORRELATION_PROPERTY__TYPE, newType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            return ((InternalEList<?>) getCorrelationPropertyRetrievalExpression()).basicRemove(otherEnd, msgs);
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
        case Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            return getCorrelationPropertyRetrievalExpression();
        case Bpmn2Package.CORRELATION_PROPERTY__NAME:
            return getName();
        case Bpmn2Package.CORRELATION_PROPERTY__TYPE:
            if (resolve)
                return getType();
            return basicGetType();
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
        case Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            getCorrelationPropertyRetrievalExpression().clear();
            getCorrelationPropertyRetrievalExpression().addAll((Collection<? extends CorrelationPropertyRetrievalExpression>) newValue);
            return;
        case Bpmn2Package.CORRELATION_PROPERTY__NAME:
            setName((String) newValue);
            return;
        case Bpmn2Package.CORRELATION_PROPERTY__TYPE:
            setType((ItemDefinition) newValue);
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
        case Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            getCorrelationPropertyRetrievalExpression().clear();
            return;
        case Bpmn2Package.CORRELATION_PROPERTY__NAME:
            setName(NAME_EDEFAULT);
            return;
        case Bpmn2Package.CORRELATION_PROPERTY__TYPE:
            setType((ItemDefinition) null);
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
        case Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            return !getCorrelationPropertyRetrievalExpression().isEmpty();
        case Bpmn2Package.CORRELATION_PROPERTY__NAME:
            return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
        case Bpmn2Package.CORRELATION_PROPERTY__TYPE:
            return basicGetType() != null;
        }
        return super.eIsSet(featureID);
    }

} //CorrelationPropertyImpl
