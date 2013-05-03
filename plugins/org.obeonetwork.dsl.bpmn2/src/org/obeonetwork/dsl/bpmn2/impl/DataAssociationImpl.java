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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.bpmn2.Assignment;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.DataAssociation;
import org.obeonetwork.dsl.bpmn2.FormalExpression;
import org.obeonetwork.dsl.bpmn2.ItemAwareElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAssociationImpl extends BaseElementImpl implements
		DataAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.DATA_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression getTransformation() {
		return (FormalExpression) eGet(
				Bpmn2Package.Literals.DATA_ASSOCIATION__TRANSFORMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(FormalExpression newTransformation) {
		eSet(Bpmn2Package.Literals.DATA_ASSOCIATION__TRANSFORMATION,
				newTransformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Assignment> getAssignment() {
		return (EList<Assignment>) eGet(
				Bpmn2Package.Literals.DATA_ASSOCIATION__ASSIGNMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement getTargetRef() {
		return (ItemAwareElement) eGet(
				Bpmn2Package.Literals.DATA_ASSOCIATION__TARGET_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(ItemAwareElement newTargetRef) {
		eSet(Bpmn2Package.Literals.DATA_ASSOCIATION__TARGET_REF, newTargetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ItemAwareElement> getSourceRef() {
		return (EList<ItemAwareElement>) eGet(
				Bpmn2Package.Literals.DATA_ASSOCIATION__SOURCE_REF, true);
	}

} //DataAssociationImpl
