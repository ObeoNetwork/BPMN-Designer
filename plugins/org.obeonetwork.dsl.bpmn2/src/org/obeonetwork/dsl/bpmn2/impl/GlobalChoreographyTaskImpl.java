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

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.GlobalChoreographyTask;
import org.obeonetwork.dsl.bpmn2.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.GlobalChoreographyTaskImpl#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalChoreographyTaskImpl extends ChoreographyImpl implements
		GlobalChoreographyTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalChoreographyTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.GLOBAL_CHOREOGRAPHY_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getInitiatingParticipantRef() {
		return (Participant) eGet(
				Bpmn2Package.Literals.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatingParticipantRef(
			Participant newInitiatingParticipantRef) {
		eSet(Bpmn2Package.Literals.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF,
				newInitiatingParticipantRef);
	}

} //GlobalChoreographyTaskImpl
