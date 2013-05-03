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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.bpmn2.Activity;
import org.obeonetwork.dsl.bpmn2.BoundaryEvent;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.BoundaryEventImpl#isCancelActivity <em>Cancel Activity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.BoundaryEventImpl#getAttachedToRef <em>Attached To Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundaryEventImpl extends CatchEventImpl implements BoundaryEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundaryEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.BOUNDARY_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCancelActivity() {
		return (Boolean) eGet(
				Bpmn2Package.Literals.BOUNDARY_EVENT__CANCEL_ACTIVITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelActivity(boolean newCancelActivity) {
		eSet(Bpmn2Package.Literals.BOUNDARY_EVENT__CANCEL_ACTIVITY,
				newCancelActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getAttachedToRef() {
		return (Activity) eGet(
				Bpmn2Package.Literals.BOUNDARY_EVENT__ATTACHED_TO_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachedToRef(Activity newAttachedToRef) {
		eSet(Bpmn2Package.Literals.BOUNDARY_EVENT__ATTACHED_TO_REF,
				newAttachedToRef);
	}

} //BoundaryEventImpl
