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

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ChoreographyActivity;
import org.obeonetwork.dsl.bpmn2.ChoreographyLoopType;
import org.obeonetwork.dsl.bpmn2.CorrelationKey;
import org.obeonetwork.dsl.bpmn2.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl#getLoopType <em>Loop Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChoreographyActivityImpl extends FlowNodeImpl implements
		ChoreographyActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Participant> getParticipantRefs() {
		return (EList<Participant>) eGet(
				Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getInitiatingParticipantRef() {
		return (Participant) eGet(
				Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatingParticipantRef(
			Participant newInitiatingParticipantRef) {
		eSet(Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF,
				newInitiatingParticipantRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CorrelationKey> getCorrelationKeys() {
		return (EList<CorrelationKey>) eGet(
				Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyLoopType getLoopType() {
		return (ChoreographyLoopType) eGet(
				Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopType(ChoreographyLoopType newLoopType) {
		eSet(Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE,
				newLoopType);
	}

} //ChoreographyActivityImpl
