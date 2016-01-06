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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.obeonetwork.dsl.bpmn2.BPMN2ObjectImpl;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Extension Attribute Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeValueImpl#getValueRef <em>Value Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeValueImpl#getExtensionAttributeDefinition <em>Extension Attribute Definition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeValueImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionAttributeValueImpl extends BPMN2ObjectImpl implements ExtensionAttributeValue {
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
	protected ExtensionAttributeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE;
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
	public EObject getValueRef() {
		return (EObject) eDynamicGet(Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValueRef() {
		return (EObject) eDynamicGet(Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueRef(EObject newValueRef) {
		eDynamicSet(Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF, newValueRef);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getValue() {
		return (EObject) eDynamicGet(Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(EObject newValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newValue, Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(EObject newValue) {
		eDynamicSet(Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionAttributeDefinition getExtensionAttributeDefinition() {
		return (ExtensionAttributeDefinition) eDynamicGet(
				Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeDefinition basicGetExtensionAttributeDefinition() {
		return (ExtensionAttributeDefinition) eDynamicGet(
				Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtensionAttributeDefinition(ExtensionAttributeDefinition newExtensionAttributeDefinition) {
		eDynamicSet(Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION,
				newExtensionAttributeDefinition);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String) eDynamicGet(Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__ID,
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__ID, Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__ID,
				newId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
			return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
			if (resolve)
				return getValueRef();
			return basicGetValueRef();
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
			return getValue();
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
			if (resolve)
				return getExtensionAttributeDefinition();
			return basicGetExtensionAttributeDefinition();
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__ID:
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
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
			setValueRef((EObject) newValue);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
			setValue((EObject) newValue);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
			setExtensionAttributeDefinition((ExtensionAttributeDefinition) newValue);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__ID:
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
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
			setValueRef((EObject) null);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
			setValue((EObject) null);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
			setExtensionAttributeDefinition((ExtensionAttributeDefinition) null);
			return;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__ID:
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
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
			return basicGetValueRef() != null;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
			return getValue() != null;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
			return basicGetExtensionAttributeDefinition() != null;
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__ID:
			return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
		}
		return super.eIsSet(featureID);
	}

} // ExtensionAttributeValueImpl
