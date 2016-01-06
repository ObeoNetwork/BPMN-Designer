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

import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Participant;
import org.obeonetwork.dsl.bpmn2.ParticipantAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantAssociationImpl#getInnerParticipantRef <em>Inner Participant Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantAssociationImpl#getOuterParticipantRef <em>Outer Participant Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantAssociationImpl extends BaseElementImpl implements ParticipantAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.PARTICIPANT_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getInnerParticipantRef() {
		return (Participant) eDynamicGet(Bpmn2Package.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF,
				Bpmn2Package.Literals.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetInnerParticipantRef() {
		return (Participant) eDynamicGet(Bpmn2Package.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF,
				Bpmn2Package.Literals.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerParticipantRef(Participant newInnerParticipantRef) {
		eDynamicSet(Bpmn2Package.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF,
				Bpmn2Package.Literals.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF, newInnerParticipantRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getOuterParticipantRef() {
		return (Participant) eDynamicGet(Bpmn2Package.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF,
				Bpmn2Package.Literals.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetOuterParticipantRef() {
		return (Participant) eDynamicGet(Bpmn2Package.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF,
				Bpmn2Package.Literals.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterParticipantRef(Participant newOuterParticipantRef) {
		eDynamicSet(Bpmn2Package.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF,
				Bpmn2Package.Literals.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF, newOuterParticipantRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
			if (resolve)
				return getInnerParticipantRef();
			return basicGetInnerParticipantRef();
		case Bpmn2Package.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
			if (resolve)
				return getOuterParticipantRef();
			return basicGetOuterParticipantRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
			setInnerParticipantRef((Participant) newValue);
			return;
		case Bpmn2Package.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
			setOuterParticipantRef((Participant) newValue);
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
		case Bpmn2Package.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
			setInnerParticipantRef((Participant) null);
			return;
		case Bpmn2Package.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
			setOuterParticipantRef((Participant) null);
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
		case Bpmn2Package.PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF:
			return basicGetInnerParticipantRef() != null;
		case Bpmn2Package.PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF:
			return basicGetOuterParticipantRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //ParticipantAssociationImpl
