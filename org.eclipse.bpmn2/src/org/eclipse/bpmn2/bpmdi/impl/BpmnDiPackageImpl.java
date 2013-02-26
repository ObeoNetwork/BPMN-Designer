/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.bpmn2.bpmdi.impl;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.bpmn2.bpmdi.BPMNDiagram;
import org.eclipse.bpmn2.bpmdi.BPMNEdge;
import org.eclipse.bpmn2.bpmdi.BPMNLabel;
import org.eclipse.bpmn2.bpmdi.BPMNLabelStyle;
import org.eclipse.bpmn2.bpmdi.BPMNPlane;
import org.eclipse.bpmn2.bpmdi.BPMNShape;
import org.eclipse.bpmn2.bpmdi.BpmnDiFactory;
import org.eclipse.bpmn2.bpmdi.BpmnDiPackage;
import org.eclipse.bpmn2.bpmdi.MessageVisibleKind;
import org.eclipse.bpmn2.bpmdi.ParticipantBandKind;

import org.eclipse.bpmn2.impl.Bpmn2PackageImpl;

import org.eclipse.dd.dc.DcPackage;

import org.eclipse.dd.dc.impl.DcPackageImpl;

import org.eclipse.dd.di.DiPackage;

import org.eclipse.dd.di.impl.DiPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnDiPackageImpl extends EPackageImpl implements BpmnDiPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bpmnPlaneEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bpmnShapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bpmnLabelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bpmnLabelStyleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bpmnEdgeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bpmnDiagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum participantBandKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum messageVisibleKindEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.eclipse.bpmn2.bpmdi.BpmnDiPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private BpmnDiPackageImpl() {
        super(eNS_URI, BpmnDiFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link BpmnDiPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static BpmnDiPackage init() {
        if (isInited)
            return (BpmnDiPackage) EPackage.Registry.INSTANCE.getEPackage(BpmnDiPackage.eNS_URI);

        // Obtain or create and register package
        BpmnDiPackageImpl theBpmnDiPackage = (BpmnDiPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof BpmnDiPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new BpmnDiPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        Bpmn2PackageImpl theBpmn2Package = (Bpmn2PackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(Bpmn2Package.eNS_URI) instanceof Bpmn2PackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(Bpmn2Package.eNS_URI) : Bpmn2Package.eINSTANCE);
        DiPackageImpl theDiPackage = (DiPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(DiPackage.eNS_URI) instanceof DiPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(DiPackage.eNS_URI) : DiPackage.eINSTANCE);
        DcPackageImpl theDcPackage = (DcPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(DcPackage.eNS_URI) instanceof DcPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(DcPackage.eNS_URI) : DcPackage.eINSTANCE);

        // Load packages
        theBpmn2Package.loadPackage();

        // Create package meta-data objects
        theBpmnDiPackage.createPackageContents();
        theDiPackage.createPackageContents();
        theDcPackage.createPackageContents();

        // Initialize created meta-data
        theBpmnDiPackage.initializePackageContents();
        theDiPackage.initializePackageContents();
        theDcPackage.initializePackageContents();

        // Fix loaded packages
        theBpmn2Package.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theBpmnDiPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(BpmnDiPackage.eNS_URI, theBpmnDiPackage);
        return theBpmnDiPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBPMNPlane() {
        return bpmnPlaneEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNPlane_BpmnElement() {
        return (EReference) bpmnPlaneEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBPMNShape() {
        return bpmnShapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNShape_BpmnElement() {
        return (EReference) bpmnShapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMNShape_IsHorizontal() {
        return (EAttribute) bpmnShapeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMNShape_IsExpanded() {
        return (EAttribute) bpmnShapeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMNShape_IsMarkerVisible() {
        return (EAttribute) bpmnShapeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNShape_Label() {
        return (EReference) bpmnShapeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMNShape_IsMessageVisible() {
        return (EAttribute) bpmnShapeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMNShape_ParticipantBandKind() {
        return (EAttribute) bpmnShapeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNShape_ChoreographyActivityShape() {
        return (EReference) bpmnShapeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBPMNLabel() {
        return bpmnLabelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNLabel_LabelStyle() {
        return (EReference) bpmnLabelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBPMNLabelStyle() {
        return bpmnLabelStyleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNLabelStyle_Font() {
        return (EReference) bpmnLabelStyleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBPMNEdge() {
        return bpmnEdgeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNEdge_Label() {
        return (EReference) bpmnEdgeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNEdge_BpmnElement() {
        return (EReference) bpmnEdgeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNEdge_SourceElement() {
        return (EReference) bpmnEdgeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNEdge_TargetElement() {
        return (EReference) bpmnEdgeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBPMNEdge_MessageVisibleKind() {
        return (EAttribute) bpmnEdgeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBPMNDiagram() {
        return bpmnDiagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNDiagram_Plane() {
        return (EReference) bpmnDiagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBPMNDiagram_LabelStyle() {
        return (EReference) bpmnDiagramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getParticipantBandKind() {
        return participantBandKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMessageVisibleKind() {
        return messageVisibleKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BpmnDiFactory getBpmnDiFactory() {
        return (BpmnDiFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        bpmnPlaneEClass = createEClass(BPMN_PLANE);
        createEReference(bpmnPlaneEClass, BPMN_PLANE__BPMN_ELEMENT);

        bpmnShapeEClass = createEClass(BPMN_SHAPE);
        createEReference(bpmnShapeEClass, BPMN_SHAPE__BPMN_ELEMENT);
        createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_HORIZONTAL);
        createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_EXPANDED);
        createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_MARKER_VISIBLE);
        createEReference(bpmnShapeEClass, BPMN_SHAPE__LABEL);
        createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_MESSAGE_VISIBLE);
        createEAttribute(bpmnShapeEClass, BPMN_SHAPE__PARTICIPANT_BAND_KIND);
        createEReference(bpmnShapeEClass, BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE);

        bpmnLabelEClass = createEClass(BPMN_LABEL);
        createEReference(bpmnLabelEClass, BPMN_LABEL__LABEL_STYLE);

        bpmnLabelStyleEClass = createEClass(BPMN_LABEL_STYLE);
        createEReference(bpmnLabelStyleEClass, BPMN_LABEL_STYLE__FONT);

        bpmnEdgeEClass = createEClass(BPMN_EDGE);
        createEReference(bpmnEdgeEClass, BPMN_EDGE__LABEL);
        createEReference(bpmnEdgeEClass, BPMN_EDGE__BPMN_ELEMENT);
        createEReference(bpmnEdgeEClass, BPMN_EDGE__SOURCE_ELEMENT);
        createEReference(bpmnEdgeEClass, BPMN_EDGE__TARGET_ELEMENT);
        createEAttribute(bpmnEdgeEClass, BPMN_EDGE__MESSAGE_VISIBLE_KIND);

        bpmnDiagramEClass = createEClass(BPMN_DIAGRAM);
        createEReference(bpmnDiagramEClass, BPMN_DIAGRAM__PLANE);
        createEReference(bpmnDiagramEClass, BPMN_DIAGRAM__LABEL_STYLE);

        // Create enums
        participantBandKindEEnum = createEEnum(PARTICIPANT_BAND_KIND);
        messageVisibleKindEEnum = createEEnum(MESSAGE_VISIBLE_KIND);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        DiPackage theDiPackage = (DiPackage) EPackage.Registry.INSTANCE
                .getEPackage(DiPackage.eNS_URI);
        Bpmn2Package theBpmn2Package = (Bpmn2Package) EPackage.Registry.INSTANCE
                .getEPackage(Bpmn2Package.eNS_URI);
        DcPackage theDcPackage = (DcPackage) EPackage.Registry.INSTANCE
                .getEPackage(DcPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        bpmnPlaneEClass.getESuperTypes().add(theDiPackage.getPlane());
        bpmnShapeEClass.getESuperTypes().add(theDiPackage.getLabeledShape());
        bpmnLabelEClass.getESuperTypes().add(theDiPackage.getLabel());
        bpmnLabelStyleEClass.getESuperTypes().add(theDiPackage.getStyle());
        bpmnEdgeEClass.getESuperTypes().add(theDiPackage.getLabeledEdge());
        bpmnDiagramEClass.getESuperTypes().add(theDiPackage.getDiagram());

        // Initialize classes and features; add operations and parameters
        initEClass(bpmnPlaneEClass, BPMNPlane.class, "BPMNPlane", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBPMNPlane_BpmnElement(), theBpmn2Package.getBaseElement(), null,
                "bpmnElement", null, 0, 1, BPMNPlane.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        initEClass(bpmnShapeEClass, BPMNShape.class, "BPMNShape", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBPMNShape_BpmnElement(), theBpmn2Package.getBaseElement(), null,
                "bpmnElement", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBPMNShape_IsHorizontal(), ecorePackage.getEBoolean(), "isHorizontal",
                null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBPMNShape_IsExpanded(), ecorePackage.getEBoolean(), "isExpanded", null,
                0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBPMNShape_IsMarkerVisible(), ecorePackage.getEBoolean(),
                "isMarkerVisible", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getBPMNShape_Label(), this.getBPMNLabel(), null, "label", null, 0, 1,
                BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBPMNShape_IsMessageVisible(), ecorePackage.getEBoolean(),
                "isMessageVisible", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBPMNShape_ParticipantBandKind(), this.getParticipantBandKind(),
                "participantBandKind", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getBPMNShape_ChoreographyActivityShape(), this.getBPMNShape(), null,
                "choreographyActivityShape", null, 0, 1, BPMNShape.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(bpmnLabelEClass, BPMNLabel.class, "BPMNLabel", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBPMNLabel_LabelStyle(), this.getBPMNLabelStyle(), null, "labelStyle",
                null, 0, 1, BPMNLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);

        initEClass(bpmnLabelStyleEClass, BPMNLabelStyle.class, "BPMNLabelStyle", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBPMNLabelStyle_Font(), theDcPackage.getFont(), null, "font", null, 1, 1,
                BPMNLabelStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(bpmnEdgeEClass, BPMNEdge.class, "BPMNEdge", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBPMNEdge_Label(), this.getBPMNLabel(), null, "label", null, 0, 1,
                BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getBPMNEdge_BpmnElement(), theBpmn2Package.getBaseElement(), null,
                "bpmnElement", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEReference(getBPMNEdge_SourceElement(), theDiPackage.getDiagramElement(), null,
                "sourceElement", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEReference(getBPMNEdge_TargetElement(), theDiPackage.getDiagramElement(), null,
                "targetElement", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBPMNEdge_MessageVisibleKind(), this.getMessageVisibleKind(),
                "messageVisibleKind", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(bpmnDiagramEClass, BPMNDiagram.class, "BPMNDiagram", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBPMNDiagram_Plane(), this.getBPMNPlane(), null, "plane", null, 1, 1,
                BPMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getBPMNDiagram_LabelStyle(), this.getBPMNLabelStyle(), null, "labelStyle",
                null, 0, -1, BPMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(participantBandKindEEnum, ParticipantBandKind.class, "ParticipantBandKind");
        addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.TOP_INITIATING);
        addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.MIDDLE_INITIATING);
        addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.BOTTOM_INITIATING);
        addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.TOP_NON_INITIATING);
        addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.MIDDLE_NON_INITIATING);
        addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.BOTTOM_NON_INITIATING);

        initEEnum(messageVisibleKindEEnum, MessageVisibleKind.class, "MessageVisibleKind");
        addEEnumLiteral(messageVisibleKindEEnum, MessageVisibleKind.INITIATING);
        addEEnumLiteral(messageVisibleKindEEnum, MessageVisibleKind.NON_INITIATING);

        // Create resource
        createResource(eNS_URI);
    }

} //BpmnDiPackageImpl
