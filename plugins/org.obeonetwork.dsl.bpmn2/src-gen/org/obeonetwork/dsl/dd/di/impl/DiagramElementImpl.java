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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.bpmn2.BPMN2ObjectImpl;
import org.obeonetwork.dsl.dd.di.DiPackage;
import org.obeonetwork.dsl.dd.di.Diagram;
import org.obeonetwork.dsl.dd.di.DiagramElement;
import org.obeonetwork.dsl.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramElementImpl#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramElementImpl#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramElementImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramElementImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends BPMN2ObjectImpl implements DiagramElement {
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
    public Diagram getOwningDiagram() {
        return (Diagram) eDynamicGet(DiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM, DiPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningDiagram(Diagram newOwningDiagram, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newOwningDiagram, DiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramElement getOwningElement() {
        return (DiagramElement) eDynamicGet(DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT, DiPackage.Literals.DIAGRAM_ELEMENT__OWNING_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningElement(DiagramElement newOwningElement, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newOwningElement, DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<DiagramElement> getOwnedElement() {
        return (EList<DiagramElement>) eDynamicGet(DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT, DiPackage.Literals.DIAGRAM_ELEMENT__OWNED_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject getModelElement() {
        return (EObject) eDynamicGet(DiPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT, DiPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetModelElement() {
        return (EObject) eDynamicGet(DiPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT, DiPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Style getStyle() {
        return (Style) eDynamicGet(DiPackage.DIAGRAM_ELEMENT__STYLE, DiPackage.Literals.DIAGRAM_ELEMENT__STYLE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Style basicGetStyle() {
        return (Style) eDynamicGet(DiPackage.DIAGRAM_ELEMENT__STYLE, DiPackage.Literals.DIAGRAM_ELEMENT__STYLE, false, true);
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
        case DiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM:
            Diagram owningDiagram = getOwningDiagram();
            if (owningDiagram != null)
                msgs = ((InternalEObject) owningDiagram).eInverseRemove(this, DiPackage.DIAGRAM__ROOT_ELEMENT, Diagram.class, msgs);
            return basicSetOwningDiagram((Diagram) otherEnd, msgs);
        case DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
            DiagramElement owningElement = getOwningElement();
            if (owningElement != null)
                msgs = ((InternalEObject) owningElement).eInverseRemove(this, DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT, DiagramElement.class, msgs);
            return basicSetOwningElement((DiagramElement) otherEnd, msgs);
        case DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedElement()).basicAdd(otherEnd, msgs);
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
        case DiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM:
            return basicSetOwningDiagram(null, msgs);
        case DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
            return basicSetOwningElement(null, msgs);
        case DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
            return ((InternalEList<?>) getOwnedElement()).basicRemove(otherEnd, msgs);
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
        case DiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM:
            return getOwningDiagram();
        case DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
            return getOwningElement();
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
            return getOwningDiagram() != null;
        case DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
            return getOwningElement() != null;
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
