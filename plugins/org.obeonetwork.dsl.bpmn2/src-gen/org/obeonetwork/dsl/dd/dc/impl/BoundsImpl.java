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
package org.obeonetwork.dsl.dd.dc.impl;

import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.bpmn2.BPMN2ObjectImpl;
import org.obeonetwork.dsl.dd.dc.Bounds;
import org.obeonetwork.dsl.dd.dc.DcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dd.dc.impl.BoundsImpl#getX <em>X</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.dc.impl.BoundsImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.dc.impl.BoundsImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.dc.impl.BoundsImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundsImpl extends BPMN2ObjectImpl implements Bounds {
    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final float X_EDEFAULT = 0.0F;

    /**
     * The default value of the '{@link #getY() <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY()
     * @generated
     * @ordered
     */
    protected static final float Y_EDEFAULT = 0.0F;

    /**
     * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected static final float WIDTH_EDEFAULT = 0.0F;

    /**
     * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeight()
     * @generated
     * @ordered
     */
    protected static final float HEIGHT_EDEFAULT = 0.0F;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BoundsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DcPackage.Literals.BOUNDS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getX() {
        return (Float) eDynamicGet(DcPackage.BOUNDS__X, DcPackage.Literals.BOUNDS__X, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX(float newX) {
        eDynamicSet(DcPackage.BOUNDS__X, DcPackage.Literals.BOUNDS__X, newX);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getY() {
        return (Float) eDynamicGet(DcPackage.BOUNDS__Y, DcPackage.Literals.BOUNDS__Y, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setY(float newY) {
        eDynamicSet(DcPackage.BOUNDS__Y, DcPackage.Literals.BOUNDS__Y, newY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getWidth() {
        return (Float) eDynamicGet(DcPackage.BOUNDS__WIDTH, DcPackage.Literals.BOUNDS__WIDTH, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWidth(float newWidth) {
        eDynamicSet(DcPackage.BOUNDS__WIDTH, DcPackage.Literals.BOUNDS__WIDTH, newWidth);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getHeight() {
        return (Float) eDynamicGet(DcPackage.BOUNDS__HEIGHT, DcPackage.Literals.BOUNDS__HEIGHT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeight(float newHeight) {
        eDynamicSet(DcPackage.BOUNDS__HEIGHT, DcPackage.Literals.BOUNDS__HEIGHT, newHeight);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DcPackage.BOUNDS__X:
            return getX();
        case DcPackage.BOUNDS__Y:
            return getY();
        case DcPackage.BOUNDS__WIDTH:
            return getWidth();
        case DcPackage.BOUNDS__HEIGHT:
            return getHeight();
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
        case DcPackage.BOUNDS__X:
            setX((Float) newValue);
            return;
        case DcPackage.BOUNDS__Y:
            setY((Float) newValue);
            return;
        case DcPackage.BOUNDS__WIDTH:
            setWidth((Float) newValue);
            return;
        case DcPackage.BOUNDS__HEIGHT:
            setHeight((Float) newValue);
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
        case DcPackage.BOUNDS__X:
            setX(X_EDEFAULT);
            return;
        case DcPackage.BOUNDS__Y:
            setY(Y_EDEFAULT);
            return;
        case DcPackage.BOUNDS__WIDTH:
            setWidth(WIDTH_EDEFAULT);
            return;
        case DcPackage.BOUNDS__HEIGHT:
            setHeight(HEIGHT_EDEFAULT);
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
        case DcPackage.BOUNDS__X:
            return getX() != X_EDEFAULT;
        case DcPackage.BOUNDS__Y:
            return getY() != Y_EDEFAULT;
        case DcPackage.BOUNDS__WIDTH:
            return getWidth() != WIDTH_EDEFAULT;
        case DcPackage.BOUNDS__HEIGHT:
            return getHeight() != HEIGHT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //BoundsImpl
