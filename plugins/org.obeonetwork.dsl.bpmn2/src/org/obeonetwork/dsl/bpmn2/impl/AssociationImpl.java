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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.bpmn2.Association;
import org.obeonetwork.dsl.bpmn2.AssociationDirection;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AssociationImpl#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AssociationImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AssociationImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ArtifactImpl implements Association {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationDirection getAssociationDirection() {
		return (AssociationDirection) eGet(
				Bpmn2Package.Literals.ASSOCIATION__ASSOCIATION_DIRECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationDirection(
			AssociationDirection newAssociationDirection) {
		eSet(Bpmn2Package.Literals.ASSOCIATION__ASSOCIATION_DIRECTION,
				newAssociationDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getSourceRef() {
		return (BaseElement) eGet(
				Bpmn2Package.Literals.ASSOCIATION__SOURCE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(BaseElement newSourceRef) {
		eSet(Bpmn2Package.Literals.ASSOCIATION__SOURCE_REF, newSourceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getTargetRef() {
		return (BaseElement) eGet(
				Bpmn2Package.Literals.ASSOCIATION__TARGET_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(BaseElement newTargetRef) {
		eSet(Bpmn2Package.Literals.ASSOCIATION__TARGET_REF, newTargetRef);
	}

} //AssociationImpl
