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
import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Relationship;
import org.obeonetwork.dsl.bpmn2.RelationshipDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.RelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.RelationshipImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.RelationshipImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.RelationshipImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends BaseElementImpl implements Relationship {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final RelationshipDirection DIRECTION_EDEFAULT = RelationshipDirection.NONE;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.RELATIONSHIP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return (String) eDynamicGet(Bpmn2Package.RELATIONSHIP__TYPE, Bpmn2Package.Literals.RELATIONSHIP__TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType(String newType) {
        eDynamicSet(Bpmn2Package.RELATIONSHIP__TYPE, Bpmn2Package.Literals.RELATIONSHIP__TYPE, newType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RelationshipDirection getDirection() {
        return (RelationshipDirection) eDynamicGet(Bpmn2Package.RELATIONSHIP__DIRECTION, Bpmn2Package.Literals.RELATIONSHIP__DIRECTION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDirection(RelationshipDirection newDirection) {
        eDynamicSet(Bpmn2Package.RELATIONSHIP__DIRECTION, Bpmn2Package.Literals.RELATIONSHIP__DIRECTION, newDirection);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<EObject> getSources() {
        return (EList<EObject>) eDynamicGet(Bpmn2Package.RELATIONSHIP__SOURCES, Bpmn2Package.Literals.RELATIONSHIP__SOURCES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<EObject> getTargets() {
        return (EList<EObject>) eDynamicGet(Bpmn2Package.RELATIONSHIP__TARGETS, Bpmn2Package.Literals.RELATIONSHIP__TARGETS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.RELATIONSHIP__TYPE:
            return getType();
        case Bpmn2Package.RELATIONSHIP__DIRECTION:
            return getDirection();
        case Bpmn2Package.RELATIONSHIP__SOURCES:
            return getSources();
        case Bpmn2Package.RELATIONSHIP__TARGETS:
            return getTargets();
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
        case Bpmn2Package.RELATIONSHIP__TYPE:
            setType((String) newValue);
            return;
        case Bpmn2Package.RELATIONSHIP__DIRECTION:
            setDirection((RelationshipDirection) newValue);
            return;
        case Bpmn2Package.RELATIONSHIP__SOURCES:
            getSources().clear();
            getSources().addAll((Collection<? extends EObject>) newValue);
            return;
        case Bpmn2Package.RELATIONSHIP__TARGETS:
            getTargets().clear();
            getTargets().addAll((Collection<? extends EObject>) newValue);
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
        case Bpmn2Package.RELATIONSHIP__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case Bpmn2Package.RELATIONSHIP__DIRECTION:
            setDirection(DIRECTION_EDEFAULT);
            return;
        case Bpmn2Package.RELATIONSHIP__SOURCES:
            getSources().clear();
            return;
        case Bpmn2Package.RELATIONSHIP__TARGETS:
            getTargets().clear();
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
        case Bpmn2Package.RELATIONSHIP__TYPE:
            return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
        case Bpmn2Package.RELATIONSHIP__DIRECTION:
            return getDirection() != DIRECTION_EDEFAULT;
        case Bpmn2Package.RELATIONSHIP__SOURCES:
            return !getSources().isEmpty();
        case Bpmn2Package.RELATIONSHIP__TARGETS:
            return !getTargets().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RelationshipImpl
