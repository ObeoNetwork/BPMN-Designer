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
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNShape;
import org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage;
import org.obeonetwork.dsl.bpmn2.bpmdi.ParticipantBandKind;
import org.obeonetwork.dsl.dd.di.impl.LabeledShapeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#isIsHorizontal <em>Is Horizontal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#isIsMarkerVisible <em>Is Marker Visible</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#isIsMessageVisible <em>Is Message Visible</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#getParticipantBandKind <em>Participant Band Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#getChoreographyActivityShape <em>Choreography Activity Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMNShapeImpl extends LabeledShapeImpl implements BPMNShape {
    /**
     * The default value of the '{@link #isIsHorizontal() <em>Is Horizontal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsHorizontal()
     * @generated
     * @ordered
     */
    protected static final boolean IS_HORIZONTAL_EDEFAULT = false;

    /**
     * The default value of the '{@link #isIsExpanded() <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExpanded()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXPANDED_EDEFAULT = false;

    /**
     * The default value of the '{@link #isIsMarkerVisible() <em>Is Marker Visible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsMarkerVisible()
     * @generated
     * @ordered
     */
    protected static final boolean IS_MARKER_VISIBLE_EDEFAULT = false;

    /**
     * The default value of the '{@link #isIsMessageVisible() <em>Is Message Visible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsMessageVisible()
     * @generated
     * @ordered
     */
    protected static final boolean IS_MESSAGE_VISIBLE_EDEFAULT = false;

    /**
     * The default value of the '{@link #getParticipantBandKind() <em>Participant Band Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantBandKind()
     * @generated
     * @ordered
     */
    protected static final ParticipantBandKind PARTICIPANT_BAND_KIND_EDEFAULT = ParticipantBandKind.TOP_INITIATING;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BPMNShapeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnDiPackage.Literals.BPMN_SHAPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseElement getBpmnElement() {
        return (BaseElement) eDynamicGet(BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT, BpmnDiPackage.Literals.BPMN_SHAPE__BPMN_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseElement basicGetBpmnElement() {
        return (BaseElement) eDynamicGet(BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT, BpmnDiPackage.Literals.BPMN_SHAPE__BPMN_ELEMENT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBpmnElement(BaseElement newBpmnElement) {
        eDynamicSet(BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT, BpmnDiPackage.Literals.BPMN_SHAPE__BPMN_ELEMENT, newBpmnElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsHorizontal() {
        return (Boolean) eDynamicGet(BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL, BpmnDiPackage.Literals.BPMN_SHAPE__IS_HORIZONTAL, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsHorizontal(boolean newIsHorizontal) {
        eDynamicSet(BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL, BpmnDiPackage.Literals.BPMN_SHAPE__IS_HORIZONTAL, newIsHorizontal);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsExpanded() {
        return (Boolean) eDynamicGet(BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED, BpmnDiPackage.Literals.BPMN_SHAPE__IS_EXPANDED, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsExpanded(boolean newIsExpanded) {
        eDynamicSet(BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED, BpmnDiPackage.Literals.BPMN_SHAPE__IS_EXPANDED, newIsExpanded);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsMarkerVisible() {
        return (Boolean) eDynamicGet(BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE, BpmnDiPackage.Literals.BPMN_SHAPE__IS_MARKER_VISIBLE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsMarkerVisible(boolean newIsMarkerVisible) {
        eDynamicSet(BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE, BpmnDiPackage.Literals.BPMN_SHAPE__IS_MARKER_VISIBLE, newIsMarkerVisible);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BPMNLabel getLabel() {
        return (BPMNLabel) eDynamicGet(BpmnDiPackage.BPMN_SHAPE__LABEL, BpmnDiPackage.Literals.BPMN_SHAPE__LABEL, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLabel(BPMNLabel newLabel, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newLabel, BpmnDiPackage.BPMN_SHAPE__LABEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLabel(BPMNLabel newLabel) {
        eDynamicSet(BpmnDiPackage.BPMN_SHAPE__LABEL, BpmnDiPackage.Literals.BPMN_SHAPE__LABEL, newLabel);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsMessageVisible() {
        return (Boolean) eDynamicGet(BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE, BpmnDiPackage.Literals.BPMN_SHAPE__IS_MESSAGE_VISIBLE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsMessageVisible(boolean newIsMessageVisible) {
        eDynamicSet(BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE, BpmnDiPackage.Literals.BPMN_SHAPE__IS_MESSAGE_VISIBLE, newIsMessageVisible);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ParticipantBandKind getParticipantBandKind() {
        return (ParticipantBandKind) eDynamicGet(BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND, BpmnDiPackage.Literals.BPMN_SHAPE__PARTICIPANT_BAND_KIND, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParticipantBandKind(ParticipantBandKind newParticipantBandKind) {
        eDynamicSet(BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND, BpmnDiPackage.Literals.BPMN_SHAPE__PARTICIPANT_BAND_KIND, newParticipantBandKind);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BPMNShape getChoreographyActivityShape() {
        return (BPMNShape) eDynamicGet(BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE, BpmnDiPackage.Literals.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BPMNShape basicGetChoreographyActivityShape() {
        return (BPMNShape) eDynamicGet(BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE, BpmnDiPackage.Literals.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setChoreographyActivityShape(BPMNShape newChoreographyActivityShape) {
        eDynamicSet(BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE, BpmnDiPackage.Literals.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE, newChoreographyActivityShape);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnDiPackage.BPMN_SHAPE__LABEL:
            return basicSetLabel(null, msgs);
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
        case BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT:
            if (resolve)
                return getBpmnElement();
            return basicGetBpmnElement();
        case BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL:
            return isIsHorizontal();
        case BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED:
            return isIsExpanded();
        case BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE:
            return isIsMarkerVisible();
        case BpmnDiPackage.BPMN_SHAPE__LABEL:
            return getLabel();
        case BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE:
            return isIsMessageVisible();
        case BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND:
            return getParticipantBandKind();
        case BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE:
            if (resolve)
                return getChoreographyActivityShape();
            return basicGetChoreographyActivityShape();
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
        case BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT:
            setBpmnElement((BaseElement) newValue);
            return;
        case BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL:
            setIsHorizontal((Boolean) newValue);
            return;
        case BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED:
            setIsExpanded((Boolean) newValue);
            return;
        case BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE:
            setIsMarkerVisible((Boolean) newValue);
            return;
        case BpmnDiPackage.BPMN_SHAPE__LABEL:
            setLabel((BPMNLabel) newValue);
            return;
        case BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE:
            setIsMessageVisible((Boolean) newValue);
            return;
        case BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND:
            setParticipantBandKind((ParticipantBandKind) newValue);
            return;
        case BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE:
            setChoreographyActivityShape((BPMNShape) newValue);
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
        case BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT:
            setBpmnElement((BaseElement) null);
            return;
        case BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL:
            setIsHorizontal(IS_HORIZONTAL_EDEFAULT);
            return;
        case BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED:
            setIsExpanded(IS_EXPANDED_EDEFAULT);
            return;
        case BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE:
            setIsMarkerVisible(IS_MARKER_VISIBLE_EDEFAULT);
            return;
        case BpmnDiPackage.BPMN_SHAPE__LABEL:
            setLabel((BPMNLabel) null);
            return;
        case BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE:
            setIsMessageVisible(IS_MESSAGE_VISIBLE_EDEFAULT);
            return;
        case BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND:
            setParticipantBandKind(PARTICIPANT_BAND_KIND_EDEFAULT);
            return;
        case BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE:
            setChoreographyActivityShape((BPMNShape) null);
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
        case BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT:
            return basicGetBpmnElement() != null;
        case BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL:
            return isIsHorizontal() != IS_HORIZONTAL_EDEFAULT;
        case BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED:
            return isIsExpanded() != IS_EXPANDED_EDEFAULT;
        case BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE:
            return isIsMarkerVisible() != IS_MARKER_VISIBLE_EDEFAULT;
        case BpmnDiPackage.BPMN_SHAPE__LABEL:
            return getLabel() != null;
        case BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE:
            return isIsMessageVisible() != IS_MESSAGE_VISIBLE_EDEFAULT;
        case BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND:
            return getParticipantBandKind() != PARTICIPANT_BAND_KIND_EDEFAULT;
        case BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE:
            return basicGetChoreographyActivityShape() != null;
        }
        return super.eIsSet(featureID);
    }

} //BPMNShapeImpl
