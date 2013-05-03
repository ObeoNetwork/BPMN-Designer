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

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.EventBasedGateway;
import org.obeonetwork.dsl.bpmn2.EventBasedGatewayType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Based Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.EventBasedGatewayImpl#isInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.EventBasedGatewayImpl#getEventGatewayType <em>Event Gateway Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventBasedGatewayImpl extends GatewayImpl implements
		EventBasedGateway {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBasedGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.EVENT_BASED_GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstantiate() {
		return (Boolean) eGet(
				Bpmn2Package.Literals.EVENT_BASED_GATEWAY__INSTANTIATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiate(boolean newInstantiate) {
		eSet(Bpmn2Package.Literals.EVENT_BASED_GATEWAY__INSTANTIATE,
				newInstantiate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGatewayType getEventGatewayType() {
		return (EventBasedGatewayType) eGet(
				Bpmn2Package.Literals.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventGatewayType(EventBasedGatewayType newEventGatewayType) {
		eSet(Bpmn2Package.Literals.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE,
				newEventGatewayType);
	}

} //EventBasedGatewayImpl
