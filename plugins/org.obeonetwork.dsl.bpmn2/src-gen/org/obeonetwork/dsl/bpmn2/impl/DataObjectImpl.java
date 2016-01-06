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
import org.obeonetwork.dsl.bpmn2.DataState;
import org.obeonetwork.dsl.bpmn2.ItemAwareElement;
import org.obeonetwork.dsl.bpmn2.ItemDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectImpl#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectImpl#isIsCollection <em>Is Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataObjectImpl extends FlowElementImpl implements DataObject {
	/**
	 * The default value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLLECTION_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.DATA_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getItemSubjectRef() {
		return (ItemDefinition) eDynamicGet(Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF,
				Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetItemSubjectRef() {
		return (ItemDefinition) eDynamicGet(Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF,
				Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemSubjectRef(ItemDefinition newItemSubjectRef) {
		eDynamicSet(Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF,
				Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF, newItemSubjectRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState getDataState() {
		return (DataState) eDynamicGet(Bpmn2Package.DATA_OBJECT__DATA_STATE,
				Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__DATA_STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataState(DataState newDataState, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newDataState, Bpmn2Package.DATA_OBJECT__DATA_STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataState(DataState newDataState) {
		eDynamicSet(Bpmn2Package.DATA_OBJECT__DATA_STATE, Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__DATA_STATE,
				newDataState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCollection() {
		return (Boolean) eDynamicGet(Bpmn2Package.DATA_OBJECT__IS_COLLECTION,
				Bpmn2Package.Literals.DATA_OBJECT__IS_COLLECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(boolean newIsCollection) {
		eDynamicSet(Bpmn2Package.DATA_OBJECT__IS_COLLECTION, Bpmn2Package.Literals.DATA_OBJECT__IS_COLLECTION,
				newIsCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.DATA_OBJECT__DATA_STATE:
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
		case Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF:
			if (resolve)
				return getItemSubjectRef();
			return basicGetItemSubjectRef();
		case Bpmn2Package.DATA_OBJECT__DATA_STATE:
			return getDataState();
		case Bpmn2Package.DATA_OBJECT__IS_COLLECTION:
			return isIsCollection();
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
		case Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF:
			setItemSubjectRef((ItemDefinition) newValue);
			return;
		case Bpmn2Package.DATA_OBJECT__DATA_STATE:
			setDataState((DataState) newValue);
			return;
		case Bpmn2Package.DATA_OBJECT__IS_COLLECTION:
			setIsCollection((Boolean) newValue);
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
		case Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF:
			setItemSubjectRef((ItemDefinition) null);
			return;
		case Bpmn2Package.DATA_OBJECT__DATA_STATE:
			setDataState((DataState) null);
			return;
		case Bpmn2Package.DATA_OBJECT__IS_COLLECTION:
			setIsCollection(IS_COLLECTION_EDEFAULT);
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
		case Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF:
			return basicGetItemSubjectRef() != null;
		case Bpmn2Package.DATA_OBJECT__DATA_STATE:
			return getDataState() != null;
		case Bpmn2Package.DATA_OBJECT__IS_COLLECTION:
			return isIsCollection() != IS_COLLECTION_EDEFAULT;
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
			case Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF:
				return Bpmn2Package.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;
			case Bpmn2Package.DATA_OBJECT__DATA_STATE:
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
				return Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF;
			case Bpmn2Package.ITEM_AWARE_ELEMENT__DATA_STATE:
				return Bpmn2Package.DATA_OBJECT__DATA_STATE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DataObjectImpl
