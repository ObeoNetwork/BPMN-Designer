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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Documentation;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.BaseElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.BaseElementImpl#getExtensionDefinitions <em>Extension Definitions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.BaseElementImpl#getExtensionValues <em>Extension Values</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.BaseElementImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BaseElementImpl extends CDOObjectImpl implements
		BaseElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BaseElementImpl() {
		super();
		setId(EcoreUtil.generateUUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.BASE_ELEMENT;
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
	public String getId() {
		return (String) eDynamicGet(Bpmn2Package.BASE_ELEMENT__ID,
				Bpmn2Package.Literals.BASE_ELEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(Bpmn2Package.BASE_ELEMENT__ID,
				Bpmn2Package.Literals.BASE_ELEMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtensionDefinition> getExtensionDefinitions() {
		return (EList<ExtensionDefinition>) eDynamicGet(
				Bpmn2Package.BASE_ELEMENT__EXTENSION_DEFINITIONS,
				Bpmn2Package.Literals.BASE_ELEMENT__EXTENSION_DEFINITIONS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtensionAttributeValue> getExtensionValues() {
		return (EList<ExtensionAttributeValue>) eDynamicGet(
				Bpmn2Package.BASE_ELEMENT__EXTENSION_VALUES,
				Bpmn2Package.Literals.BASE_ELEMENT__EXTENSION_VALUES, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Documentation> getDocumentation() {
		return (EList<Documentation>) eDynamicGet(
				Bpmn2Package.BASE_ELEMENT__DOCUMENTATION,
				Bpmn2Package.Literals.BASE_ELEMENT__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.BASE_ELEMENT__EXTENSION_VALUES:
			return ((InternalEList<?>) getExtensionValues()).basicRemove(
					otherEnd, msgs);
		case Bpmn2Package.BASE_ELEMENT__DOCUMENTATION:
			return ((InternalEList<?>) getDocumentation()).basicRemove(
					otherEnd, msgs);
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
		case Bpmn2Package.BASE_ELEMENT__ID:
			return getId();
		case Bpmn2Package.BASE_ELEMENT__EXTENSION_DEFINITIONS:
			return getExtensionDefinitions();
		case Bpmn2Package.BASE_ELEMENT__EXTENSION_VALUES:
			return getExtensionValues();
		case Bpmn2Package.BASE_ELEMENT__DOCUMENTATION:
			return getDocumentation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.BASE_ELEMENT__ID:
			setId((String) newValue);
			return;
		case Bpmn2Package.BASE_ELEMENT__EXTENSION_DEFINITIONS:
			getExtensionDefinitions().clear();
			getExtensionDefinitions().addAll(
					(Collection<? extends ExtensionDefinition>) newValue);
			return;
		case Bpmn2Package.BASE_ELEMENT__EXTENSION_VALUES:
			getExtensionValues().clear();
			getExtensionValues().addAll(
					(Collection<? extends ExtensionAttributeValue>) newValue);
			return;
		case Bpmn2Package.BASE_ELEMENT__DOCUMENTATION:
			getDocumentation().clear();
			getDocumentation().addAll(
					(Collection<? extends Documentation>) newValue);
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
		case Bpmn2Package.BASE_ELEMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case Bpmn2Package.BASE_ELEMENT__EXTENSION_DEFINITIONS:
			getExtensionDefinitions().clear();
			return;
		case Bpmn2Package.BASE_ELEMENT__EXTENSION_VALUES:
			getExtensionValues().clear();
			return;
		case Bpmn2Package.BASE_ELEMENT__DOCUMENTATION:
			getDocumentation().clear();
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
		case Bpmn2Package.BASE_ELEMENT__ID:
			return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT
					.equals(getId());
		case Bpmn2Package.BASE_ELEMENT__EXTENSION_DEFINITIONS:
			return !getExtensionDefinitions().isEmpty();
		case Bpmn2Package.BASE_ELEMENT__EXTENSION_VALUES:
			return !getExtensionValues().isEmpty();
		case Bpmn2Package.BASE_ELEMENT__DOCUMENTATION:
			return !getDocumentation().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BaseElementImpl
