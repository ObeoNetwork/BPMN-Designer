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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Message;
import org.obeonetwork.dsl.bpmn2.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl#getInMessageRef <em>In Message Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl#getOutMessageRef <em>Out Message Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl#getErrorRefs <em>Error Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl#getImplementationRef <em>Implementation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends BaseElementImpl implements Operation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eGet(Bpmn2Package.Literals.OPERATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(Bpmn2Package.Literals.OPERATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getInMessageRef() {
		return (Message) eGet(Bpmn2Package.Literals.OPERATION__IN_MESSAGE_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMessageRef(Message newInMessageRef) {
		eSet(Bpmn2Package.Literals.OPERATION__IN_MESSAGE_REF, newInMessageRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getOutMessageRef() {
		return (Message) eGet(Bpmn2Package.Literals.OPERATION__OUT_MESSAGE_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutMessageRef(Message newOutMessageRef) {
		eSet(Bpmn2Package.Literals.OPERATION__OUT_MESSAGE_REF, newOutMessageRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.bpmn2.Error> getErrorRefs() {
		return (EList<org.obeonetwork.dsl.bpmn2.Error>) eGet(
				Bpmn2Package.Literals.OPERATION__ERROR_REFS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getImplementationRef() {
		return (EObject) eGet(
				Bpmn2Package.Literals.OPERATION__IMPLEMENTATION_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationRef(EObject newImplementationRef) {
		eSet(Bpmn2Package.Literals.OPERATION__IMPLEMENTATION_REF,
				newImplementationRef);
	}

} //OperationImpl
