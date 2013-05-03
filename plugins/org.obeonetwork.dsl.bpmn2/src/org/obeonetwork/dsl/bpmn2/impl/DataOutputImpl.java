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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.DataOutput;
import org.obeonetwork.dsl.bpmn2.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl#getOutputSetWithOptional <em>Output Set With Optional</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl#getOutputSetWithWhileExecuting <em>Output Set With While Executing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl#getOutputSetRefs <em>Output Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataOutputImpl extends ItemAwareElementImpl implements DataOutput {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.DATA_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eGet(Bpmn2Package.Literals.DATA_OUTPUT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(Bpmn2Package.Literals.DATA_OUTPUT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCollection() {
		return (Boolean) eGet(Bpmn2Package.Literals.DATA_OUTPUT__IS_COLLECTION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(boolean newIsCollection) {
		eSet(Bpmn2Package.Literals.DATA_OUTPUT__IS_COLLECTION, newIsCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OutputSet> getOutputSetWithOptional() {
		return (EList<OutputSet>) eGet(
				Bpmn2Package.Literals.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OutputSet> getOutputSetWithWhileExecuting() {
		return (EList<OutputSet>) eGet(
				Bpmn2Package.Literals.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OutputSet> getOutputSetRefs() {
		return (EList<OutputSet>) eGet(
				Bpmn2Package.Literals.DATA_OUTPUT__OUTPUT_SET_REFS, true);
	}

} //DataOutputImpl
