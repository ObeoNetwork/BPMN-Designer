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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeValueImpl#getValueRef <em>Value Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeValueImpl#getExtensionAttributeDefinition <em>Extension Attribute Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionAttributeValueImpl extends CDOObjectImpl implements
		ExtensionAttributeValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionAttributeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE;
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
	public EObject getValueRef() {
		return (EObject) eGet(
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRef(EObject newValueRef) {
		eSet(Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF,
				newValueRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValue() {
		return (EObject) eGet(
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(EObject newValue) {
		eSet(Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeDefinition getExtensionAttributeDefinition() {
		return (ExtensionAttributeDefinition) eGet(
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionAttributeDefinition(
			ExtensionAttributeDefinition newExtensionAttributeDefinition) {
		eSet(Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION,
				newExtensionAttributeDefinition);
	}

} //ExtensionAttributeValueImpl
