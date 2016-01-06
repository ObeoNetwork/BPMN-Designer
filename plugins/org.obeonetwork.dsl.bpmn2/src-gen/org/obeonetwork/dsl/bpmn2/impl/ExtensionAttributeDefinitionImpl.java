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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.obeonetwork.dsl.bpmn2.BPMN2ObjectImpl;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Extension Attribute Definition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl#getExtensionDefinition <em>Extension Definition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionAttributeDefinitionImpl extends BPMN2ObjectImpl implements ExtensionAttributeDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isIsReference() <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REFERENCE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionAttributeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String) eDynamicGet(Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsReference() {
		return (Boolean) eDynamicGet(Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsReference(boolean newIsReference) {
		eDynamicSet(Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE, newIsReference);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionDefinition getExtensionDefinition() {
		return (ExtensionDefinition) eDynamicGet(Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionDefinition(ExtensionDefinition newExtensionDefinition,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newExtensionDefinition,
				Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtensionDefinition(ExtensionDefinition newExtensionDefinition) {
		eDynamicSet(Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION, newExtensionDefinition);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String) eDynamicGet(Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__ID,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__ID,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetExtensionDefinition((ExtensionDefinition) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION:
			return basicSetExtensionDefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION:
			return eInternalContainer().eInverseRemove(this,
					Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS, ExtensionDefinition.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME:
			return getName();
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE:
			return getType();
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE:
			return isIsReference();
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION:
			return getExtensionDefinition();
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE:
			setType((String) newValue);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE:
			setIsReference((Boolean) newValue);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION:
			setExtensionDefinition((ExtensionDefinition) newValue);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__ID:
			setId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE:
			setIsReference(IS_REFERENCE_EDEFAULT);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION:
			setExtensionDefinition((ExtensionDefinition) null);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__ID:
			setId(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE:
			return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE:
			return isIsReference() != IS_REFERENCE_EDEFAULT;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION:
			return getExtensionDefinition() != null;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__ID:
			return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
		}
		return super.eIsSet(featureID);
	}

} // ExtensionAttributeDefinitionImpl
