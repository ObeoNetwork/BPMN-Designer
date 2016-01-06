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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl#getLoopType <em>Loop Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChoreographyActivityImpl extends FlowNodeImpl implements ChoreographyActivity {
	/**
	 * The default value of the '{@link #getLoopType() <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopType()
	 * @generated
	 * @ordered
	 */
	protected static final ChoreographyLoopType LOOP_TYPE_EDEFAULT = ChoreographyLoopType.NONE;

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
		return (EList<Participant>) eDynamicGet(Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS,
				Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getInitiatingParticipantRef() {
		return (Participant) eDynamicGet(Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF,
				Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetInitiatingParticipantRef() {
		return (Participant) eDynamicGet(Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF,
				Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatingParticipantRef(Participant newInitiatingParticipantRef) {
		eDynamicSet(Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF,
				Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF, newInitiatingParticipantRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CorrelationKey> getCorrelationKeys() {
		return (EList<CorrelationKey>) eDynamicGet(Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS,
				Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyLoopType getLoopType() {
		return (ChoreographyLoopType) eDynamicGet(Bpmn2Package.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE,
				Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopType(ChoreographyLoopType newLoopType) {
		eDynamicSet(Bpmn2Package.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE,
				Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE, newLoopType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS:
			return ((InternalEList<?>) getCorrelationKeys()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS:
			return getParticipantRefs();
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
			if (resolve)
				return getInitiatingParticipantRef();
			return basicGetInitiatingParticipantRef();
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS:
			return getCorrelationKeys();
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE:
			return getLoopType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS:
			getParticipantRefs().clear();
			getParticipantRefs().addAll((Collection<? extends Participant>) newValue);
			return;
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
			setInitiatingParticipantRef((Participant) newValue);
			return;
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS:
			getCorrelationKeys().clear();
			getCorrelationKeys().addAll((Collection<? extends CorrelationKey>) newValue);
			return;
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE:
			setLoopType((ChoreographyLoopType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS:
			getParticipantRefs().clear();
			return;
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
			setInitiatingParticipantRef((Participant) null);
			return;
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS:
			getCorrelationKeys().clear();
			return;
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE:
			setLoopType(LOOP_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS:
			return !getParticipantRefs().isEmpty();
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
			return basicGetInitiatingParticipantRef() != null;
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS:
			return !getCorrelationKeys().isEmpty();
		case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE:
			return getLoopType() != LOOP_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ChoreographyActivityImpl
