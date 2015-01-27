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
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionDefinitionImpl#getExtensionAttributeDefinitions <em>Extension Attribute Definitions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionDefinitionImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionDefinitionImpl extends CDOObjectImpl implements
		ExtensionDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	protected ExtensionDefinitionImpl() {
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
		return Bpmn2Package.Literals.EXTENSION_DEFINITION;
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
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.EXTENSION_DEFINITION__NAME,
				Bpmn2Package.Literals.EXTENSION_DEFINITION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.EXTENSION_DEFINITION__NAME,
				Bpmn2Package.Literals.EXTENSION_DEFINITION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtensionAttributeDefinition> getExtensionAttributeDefinitions() {
		return (EList<ExtensionAttributeDefinition>) eDynamicGet(
				Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS,
				Bpmn2Package.Literals.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String) eDynamicGet(Bpmn2Package.EXTENSION_DEFINITION__ID,
				Bpmn2Package.Literals.EXTENSION_DEFINITION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(Bpmn2Package.EXTENSION_DEFINITION__ID,
				Bpmn2Package.Literals.EXTENSION_DEFINITION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getExtensionAttributeDefinitions())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS:
			return ((InternalEList<?>) getExtensionAttributeDefinitions())
					.basicRemove(otherEnd, msgs);
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
		case Bpmn2Package.EXTENSION_DEFINITION__NAME:
			return getName();
		case Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS:
			return getExtensionAttributeDefinitions();
		case Bpmn2Package.EXTENSION_DEFINITION__ID:
			return getId();
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
		case Bpmn2Package.EXTENSION_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS:
			getExtensionAttributeDefinitions().clear();
			getExtensionAttributeDefinitions()
					.addAll((Collection<? extends ExtensionAttributeDefinition>) newValue);
			return;
		case Bpmn2Package.EXTENSION_DEFINITION__ID:
			setId((String) newValue);
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
		case Bpmn2Package.EXTENSION_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS:
			getExtensionAttributeDefinitions().clear();
			return;
		case Bpmn2Package.EXTENSION_DEFINITION__ID:
			setId(ID_EDEFAULT);
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
		case Bpmn2Package.EXTENSION_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT
					.equals(getName());
		case Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS:
			return !getExtensionAttributeDefinitions().isEmpty();
		case Bpmn2Package.EXTENSION_DEFINITION__ID:
			return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT
					.equals(getId());
		}
		return super.eIsSet(featureID);
	}

} //ExtensionDefinitionImpl
