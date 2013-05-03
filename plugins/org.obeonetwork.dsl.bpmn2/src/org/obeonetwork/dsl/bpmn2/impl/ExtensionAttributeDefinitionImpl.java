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
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl#getExtensionDefinition <em>Extension Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionAttributeDefinitionImpl extends CDOObjectImpl implements
		ExtensionAttributeDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionAttributeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION;
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
		return (String) eGet(
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__NAME,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__NAME,
				newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String) eGet(
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__TYPE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eSet(Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__TYPE,
				newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReference() {
		return (Boolean) eGet(
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReference(boolean newIsReference) {
		eSet(Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE,
				newIsReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinition getExtensionDefinition() {
		return (ExtensionDefinition) eGet(
				Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionDefinition(
			ExtensionDefinition newExtensionDefinition) {
		eSet(Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION,
				newExtensionDefinition);
	}

} //ExtensionAttributeDefinitionImpl
