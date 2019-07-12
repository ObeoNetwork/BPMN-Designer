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
package org.obeonetwork.dsl.bpmn2.bpmdi.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabelStyle;
import org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage;
import org.obeonetwork.dsl.dd.dc.Font;
import org.obeonetwork.dsl.dd.di.impl.StyleImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Label Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNLabelStyleImpl#getFont <em>Font</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMNLabelStyleImpl extends StyleImpl implements BPMNLabelStyle {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BPMNLabelStyleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnDiPackage.Literals.BPMN_LABEL_STYLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Font getFont() {
        return (Font) eDynamicGet(BpmnDiPackage.BPMN_LABEL_STYLE__FONT, BpmnDiPackage.Literals.BPMN_LABEL_STYLE__FONT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFont(Font newFont, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newFont, BpmnDiPackage.BPMN_LABEL_STYLE__FONT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFont(Font newFont) {
        eDynamicSet(BpmnDiPackage.BPMN_LABEL_STYLE__FONT, BpmnDiPackage.Literals.BPMN_LABEL_STYLE__FONT, newFont);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnDiPackage.BPMN_LABEL_STYLE__FONT:
            return basicSetFont(null, msgs);
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
        case BpmnDiPackage.BPMN_LABEL_STYLE__FONT:
            return getFont();
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
        case BpmnDiPackage.BPMN_LABEL_STYLE__FONT:
            setFont((Font) newValue);
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
        case BpmnDiPackage.BPMN_LABEL_STYLE__FONT:
            setFont((Font) null);
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
        case BpmnDiPackage.BPMN_LABEL_STYLE__FONT:
            return getFont() != null;
        }
        return super.eIsSet(featureID);
    }

} //BPMNLabelStyleImpl
