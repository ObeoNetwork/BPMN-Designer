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
package org.obeonetwork.dsl.dd.di.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.dd.dc.Point;
import org.obeonetwork.dsl.dd.di.DiPackage;
import org.obeonetwork.dsl.dd.di.DiagramElement;
import org.obeonetwork.dsl.dd.di.Edge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.EdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.EdgeImpl#getWaypoint <em>Waypoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EdgeImpl extends DiagramElementImpl implements Edge {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EdgeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DiPackage.Literals.EDGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramElement getSource() {
        return (DiagramElement) eDynamicGet(DiPackage.EDGE__SOURCE, DiPackage.Literals.EDGE__SOURCE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement basicGetSource() {
        return (DiagramElement) eDynamicGet(DiPackage.EDGE__SOURCE, DiPackage.Literals.EDGE__SOURCE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramElement getTarget() {
        return (DiagramElement) eDynamicGet(DiPackage.EDGE__TARGET, DiPackage.Literals.EDGE__TARGET, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement basicGetTarget() {
        return (DiagramElement) eDynamicGet(DiPackage.EDGE__TARGET, DiPackage.Literals.EDGE__TARGET, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Point> getWaypoint() {
        return (EList<Point>) eDynamicGet(DiPackage.EDGE__WAYPOINT, DiPackage.Literals.EDGE__WAYPOINT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DiPackage.EDGE__WAYPOINT:
            return ((InternalEList<?>) getWaypoint()).basicRemove(otherEnd, msgs);
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
        case DiPackage.EDGE__SOURCE:
            if (resolve)
                return getSource();
            return basicGetSource();
        case DiPackage.EDGE__TARGET:
            if (resolve)
                return getTarget();
            return basicGetTarget();
        case DiPackage.EDGE__WAYPOINT:
            return getWaypoint();
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
        case DiPackage.EDGE__WAYPOINT:
            getWaypoint().clear();
            getWaypoint().addAll((Collection<? extends Point>) newValue);
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
        case DiPackage.EDGE__WAYPOINT:
            getWaypoint().clear();
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
        case DiPackage.EDGE__SOURCE:
            return basicGetSource() != null;
        case DiPackage.EDGE__TARGET:
            return basicGetTarget() != null;
        case DiPackage.EDGE__WAYPOINT:
            return !getWaypoint().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EdgeImpl
