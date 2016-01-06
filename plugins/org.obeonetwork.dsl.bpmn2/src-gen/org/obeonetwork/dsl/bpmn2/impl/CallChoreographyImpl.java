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
import org.obeonetwork.dsl.bpmn2.CallChoreography;
import org.obeonetwork.dsl.bpmn2.Choreography;
import org.obeonetwork.dsl.bpmn2.ParticipantAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CallChoreographyImpl#getCalledChoreographyRef <em>Called Choreography Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CallChoreographyImpl#getParticipantAssociations <em>Participant Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallChoreographyImpl extends ChoreographyActivityImpl implements CallChoreography {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallChoreographyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.CALL_CHOREOGRAPHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography getCalledChoreographyRef() {
		return (Choreography) eDynamicGet(Bpmn2Package.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF,
				Bpmn2Package.Literals.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography basicGetCalledChoreographyRef() {
		return (Choreography) eDynamicGet(Bpmn2Package.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF,
				Bpmn2Package.Literals.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledChoreographyRef(Choreography newCalledChoreographyRef) {
		eDynamicSet(Bpmn2Package.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF,
				Bpmn2Package.Literals.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF, newCalledChoreographyRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParticipantAssociation> getParticipantAssociations() {
		return (EList<ParticipantAssociation>) eDynamicGet(Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS,
				Bpmn2Package.Literals.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
			return ((InternalEList<?>) getParticipantAssociations()).basicRemove(otherEnd, msgs);
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
		case Bpmn2Package.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF:
			if (resolve)
				return getCalledChoreographyRef();
			return basicGetCalledChoreographyRef();
		case Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
			return getParticipantAssociations();
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
		case Bpmn2Package.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF:
			setCalledChoreographyRef((Choreography) newValue);
			return;
		case Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
			getParticipantAssociations().clear();
			getParticipantAssociations().addAll((Collection<? extends ParticipantAssociation>) newValue);
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
		case Bpmn2Package.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF:
			setCalledChoreographyRef((Choreography) null);
			return;
		case Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
			getParticipantAssociations().clear();
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
		case Bpmn2Package.CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF:
			return basicGetCalledChoreographyRef() != null;
		case Bpmn2Package.CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
			return !getParticipantAssociations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallChoreographyImpl
