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
package org.eclipse.bpmn2.bpmdi.impl;

import org.eclipse.bpmn2.bpmdi.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnDiFactoryImpl extends EFactoryImpl implements BpmnDiFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BpmnDiFactory init() {
        try {
            BpmnDiFactory theBpmnDiFactory = (BpmnDiFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http://www.omg.org/spec/BPMN/20100524/DI-XMI");
            if (theBpmnDiFactory != null) {
                return theBpmnDiFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new BpmnDiFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BpmnDiFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case BpmnDiPackage.BPMN_PLANE:
            return createBPMNPlane();
        case BpmnDiPackage.BPMN_SHAPE:
            return createBPMNShape();
        case BpmnDiPackage.BPMN_LABEL:
            return createBPMNLabel();
        case BpmnDiPackage.BPMN_LABEL_STYLE:
            return createBPMNLabelStyle();
        case BpmnDiPackage.BPMN_EDGE:
            return createBPMNEdge();
        case BpmnDiPackage.BPMN_DIAGRAM:
            return createBPMNDiagram();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName()
                    + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case BpmnDiPackage.PARTICIPANT_BAND_KIND:
            return createParticipantBandKindFromString(eDataType, initialValue);
        case BpmnDiPackage.MESSAGE_VISIBLE_KIND:
            return createMessageVisibleKindFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName()
                    + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case BpmnDiPackage.PARTICIPANT_BAND_KIND:
            return convertParticipantBandKindToString(eDataType, instanceValue);
        case BpmnDiPackage.MESSAGE_VISIBLE_KIND:
            return convertMessageVisibleKindToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName()
                    + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BPMNPlane createBPMNPlane() {
        BPMNPlaneImpl bpmnPlane = new BPMNPlaneImpl();
        return bpmnPlane;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BPMNShape createBPMNShape() {
        BPMNShapeImpl bpmnShape = new BPMNShapeImpl();
        return bpmnShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BPMNLabel createBPMNLabel() {
        BPMNLabelImpl bpmnLabel = new BPMNLabelImpl();
        return bpmnLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BPMNLabelStyle createBPMNLabelStyle() {
        BPMNLabelStyleImpl bpmnLabelStyle = new BPMNLabelStyleImpl();
        return bpmnLabelStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BPMNEdge createBPMNEdge() {
        BPMNEdgeImpl bpmnEdge = new BPMNEdgeImpl();
        return bpmnEdge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BPMNDiagram createBPMNDiagram() {
        BPMNDiagramImpl bpmnDiagram = new BPMNDiagramImpl();
        return bpmnDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParticipantBandKind createParticipantBandKindFromString(EDataType eDataType,
            String initialValue) {
        ParticipantBandKind result = ParticipantBandKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertParticipantBandKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageVisibleKind createMessageVisibleKindFromString(EDataType eDataType,
            String initialValue) {
        MessageVisibleKind result = MessageVisibleKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMessageVisibleKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BpmnDiPackage getBpmnDiPackage() {
        return (BpmnDiPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static BpmnDiPackage getPackage() {
        return BpmnDiPackage.eINSTANCE;
    }

} //BpmnDiFactoryImpl
