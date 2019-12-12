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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.DataObject;
import org.obeonetwork.dsl.bpmn2.DataObjectReference;
import org.obeonetwork.dsl.bpmn2.DataState;
import org.obeonetwork.dsl.bpmn2.ItemAwareElement;
import org.obeonetwork.dsl.bpmn2.ItemDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectReferenceImpl#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectReferenceImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectReferenceImpl#getDataObjectRef <em>Data Object Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataObjectReferenceImpl extends FlowElementImpl implements DataObjectReference {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataObjectReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.DATA_OBJECT_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ItemDefinition getItemSubjectRef() {
        return (ItemDefinition) eDynamicGet(Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF, Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemDefinition basicGetItemSubjectRef() {
        return (ItemDefinition) eDynamicGet(Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF, Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setItemSubjectRef(ItemDefinition newItemSubjectRef) {
        eDynamicSet(Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF, Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF, newItemSubjectRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataState getDataState() {
        return (DataState) eDynamicGet(Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE, Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__DATA_STATE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataState(DataState newDataState, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newDataState, Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataState(DataState newDataState) {
        eDynamicSet(Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE, Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__DATA_STATE, newDataState);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataObject getDataObjectRef() {
        return (DataObject) eDynamicGet(Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF, Bpmn2Package.Literals.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataObject basicGetDataObjectRef() {
        return (DataObject) eDynamicGet(Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF, Bpmn2Package.Literals.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataObjectRef(DataObject newDataObjectRef) {
        eDynamicSet(Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF, Bpmn2Package.Literals.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF, newDataObjectRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
            return basicSetDataState(null, msgs);
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
        case Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
            if (resolve)
                return getItemSubjectRef();
            return basicGetItemSubjectRef();
        case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
            return getDataState();
        case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
            if (resolve)
                return getDataObjectRef();
            return basicGetDataObjectRef();
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
        case Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
            setItemSubjectRef((ItemDefinition) newValue);
            return;
        case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
            setDataState((DataState) newValue);
            return;
        case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
            setDataObjectRef((DataObject) newValue);
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
        case Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
            setItemSubjectRef((ItemDefinition) null);
            return;
        case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
            setDataState((DataState) null);
            return;
        case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
            setDataObjectRef((DataObject) null);
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
        case Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
            return basicGetItemSubjectRef() != null;
        case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
            return getDataState() != null;
        case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
            return basicGetDataObjectRef() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == ItemAwareElement.class) {
            switch (derivedFeatureID) {
            case Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
                return Bpmn2Package.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;
            case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
                return Bpmn2Package.ITEM_AWARE_ELEMENT__DATA_STATE;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == ItemAwareElement.class) {
            switch (baseFeatureID) {
            case Bpmn2Package.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF:
                return Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF;
            case Bpmn2Package.ITEM_AWARE_ELEMENT__DATA_STATE:
                return Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //DataObjectReferenceImpl
