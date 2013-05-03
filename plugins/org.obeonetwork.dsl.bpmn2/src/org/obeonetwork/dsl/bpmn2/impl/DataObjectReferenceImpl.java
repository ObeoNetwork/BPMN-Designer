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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectReferenceImpl#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectReferenceImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectReferenceImpl#getDataObjectRef <em>Data Object Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataObjectReferenceImpl extends FlowElementImpl implements
		DataObjectReference {
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
	public ItemDefinition getItemSubjectRef() {
		return (ItemDefinition) eGet(
				Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemSubjectRef(ItemDefinition newItemSubjectRef) {
		eSet(Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF,
				newItemSubjectRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState getDataState() {
		return (DataState) eGet(
				Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__DATA_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataState(DataState newDataState) {
		eSet(Bpmn2Package.Literals.ITEM_AWARE_ELEMENT__DATA_STATE, newDataState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject getDataObjectRef() {
		return (DataObject) eGet(
				Bpmn2Package.Literals.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataObjectRef(DataObject newDataObjectRef) {
		eSet(Bpmn2Package.Literals.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF,
				newDataObjectRef);
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
