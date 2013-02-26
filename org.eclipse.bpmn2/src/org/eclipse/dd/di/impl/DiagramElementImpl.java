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
package org.eclipse.dd.di.impl;

import org.eclipse.dd.di.DiPackage;
import org.eclipse.dd.di.Diagram;
import org.eclipse.dd.di.DiagramElement;
import org.eclipse.dd.di.Style;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends EObjectImpl implements DiagramElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DiPackage.Literals.DIAGRAM_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram getOwningDiagram() {
        Diagram owningDiagram = basicGetOwningDiagram();
        return owningDiagram != null && owningDiagram.eIsProxy() ? (Diagram) eResolveProxy((InternalEObject) owningDiagram)
                : owningDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram basicGetOwningDiagram() {
        // TODO: implement this method to return the 'Owning Diagram' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement getOwningElement() {
        DiagramElement owningElement = basicGetOwningElement();
        return owningElement != null && owningElement.eIsProxy() ? (DiagramElement) eResolveProxy((InternalEObject) owningElement)
                : owningElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement basicGetOwningElement() {
        // TODO: implement this method to return the 'Owning Element' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DiagramElement> getOwnedElement() {
        // TODO: implement this method to return the 'Owned Element' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getModelElement() {
        EObject modelElement = basicGetModelElement();
        return modelElement != null && modelElement.eIsProxy() ? eResolveProxy((InternalEObject) modelElement)
                : modelElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetModelElement() {
        // TODO: implement this method to return the 'Model Element' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Style getStyle() {
        Style style = basicGetStyle();
        return style != null && style.eIsProxy() ? (Style) eResolveProxy((InternalEObject) style)
                : style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Style basicGetStyle() {
        // TODO: implement this method to return the 'Style' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM:
            if (resolve)
                return getOwningDiagram();
            return basicGetOwningDiagram();
        case DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
            if (resolve)
                return getOwningElement();
            return basicGetOwningElement();
        case DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
            return getOwnedElement();
        case DiPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
            if (resolve)
                return getModelElement();
            return basicGetModelElement();
        case DiPackage.DIAGRAM_ELEMENT__STYLE:
            if (resolve)
                return getStyle();
            return basicGetStyle();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case DiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM:
            return basicGetOwningDiagram() != null;
        case DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
            return basicGetOwningElement() != null;
        case DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
            return !getOwnedElement().isEmpty();
        case DiPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
            return basicGetModelElement() != null;
        case DiPackage.DIAGRAM_ELEMENT__STYLE:
            return basicGetStyle() != null;
        }
        return super.eIsSet(featureID);
    }

} //DiagramElementImpl
