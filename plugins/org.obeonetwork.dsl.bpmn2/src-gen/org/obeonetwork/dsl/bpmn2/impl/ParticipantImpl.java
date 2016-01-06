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
import org.obeonetwork.dsl.bpmn2.ConversationLink;
import org.obeonetwork.dsl.bpmn2.EndPoint;
import org.obeonetwork.dsl.bpmn2.InteractionNode;
import org.obeonetwork.dsl.bpmn2.Interface;
import org.obeonetwork.dsl.bpmn2.Participant;
import org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getInterfaceRefs <em>Interface Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getEndPointRefs <em>End Point Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends BaseElementImpl implements Participant {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConversationLink> getIncomingConversationLinks() {
		return (EList<ConversationLink>) eDynamicGet(Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS,
				Bpmn2Package.Literals.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConversationLink> getOutgoingConversationLinks() {
		return (EList<ConversationLink>) eDynamicGet(Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS,
				Bpmn2Package.Literals.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.PARTICIPANT__NAME, Bpmn2Package.Literals.PARTICIPANT__NAME, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.PARTICIPANT__NAME, Bpmn2Package.Literals.PARTICIPANT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> getInterfaceRefs() {
		return (EList<Interface>) eDynamicGet(Bpmn2Package.PARTICIPANT__INTERFACE_REFS,
				Bpmn2Package.Literals.PARTICIPANT__INTERFACE_REFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantMultiplicity getParticipantMultiplicity() {
		return (ParticipantMultiplicity) eDynamicGet(Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
				Bpmn2Package.Literals.PARTICIPANT__PARTICIPANT_MULTIPLICITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantMultiplicity(ParticipantMultiplicity newParticipantMultiplicity,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newParticipantMultiplicity,
				Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantMultiplicity(ParticipantMultiplicity newParticipantMultiplicity) {
		eDynamicSet(Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
				Bpmn2Package.Literals.PARTICIPANT__PARTICIPANT_MULTIPLICITY, newParticipantMultiplicity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EndPoint> getEndPointRefs() {
		return (EList<EndPoint>) eDynamicGet(Bpmn2Package.PARTICIPANT__END_POINT_REFS,
				Bpmn2Package.Literals.PARTICIPANT__END_POINT_REFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.bpmn2.Process getProcessRef() {
		return (org.obeonetwork.dsl.bpmn2.Process) eDynamicGet(Bpmn2Package.PARTICIPANT__PROCESS_REF,
				Bpmn2Package.Literals.PARTICIPANT__PROCESS_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.bpmn2.Process basicGetProcessRef() {
		return (org.obeonetwork.dsl.bpmn2.Process) eDynamicGet(Bpmn2Package.PARTICIPANT__PROCESS_REF,
				Bpmn2Package.Literals.PARTICIPANT__PROCESS_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessRef(org.obeonetwork.dsl.bpmn2.Process newProcessRef) {
		eDynamicSet(Bpmn2Package.PARTICIPANT__PROCESS_REF, Bpmn2Package.Literals.PARTICIPANT__PROCESS_REF,
				newProcessRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingConversationLinks())
					.basicAdd(otherEnd, msgs);
		case Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingConversationLinks())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
			return ((InternalEList<?>) getIncomingConversationLinks()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
			return ((InternalEList<?>) getOutgoingConversationLinks()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
			return basicSetParticipantMultiplicity(null, msgs);
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
		case Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
			return getIncomingConversationLinks();
		case Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
			return getOutgoingConversationLinks();
		case Bpmn2Package.PARTICIPANT__NAME:
			return getName();
		case Bpmn2Package.PARTICIPANT__INTERFACE_REFS:
			return getInterfaceRefs();
		case Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
			return getParticipantMultiplicity();
		case Bpmn2Package.PARTICIPANT__END_POINT_REFS:
			return getEndPointRefs();
		case Bpmn2Package.PARTICIPANT__PROCESS_REF:
			if (resolve)
				return getProcessRef();
			return basicGetProcessRef();
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
		case Bpmn2Package.PARTICIPANT__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.PARTICIPANT__INTERFACE_REFS:
			getInterfaceRefs().clear();
			getInterfaceRefs().addAll((Collection<? extends Interface>) newValue);
			return;
		case Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
			setParticipantMultiplicity((ParticipantMultiplicity) newValue);
			return;
		case Bpmn2Package.PARTICIPANT__END_POINT_REFS:
			getEndPointRefs().clear();
			getEndPointRefs().addAll((Collection<? extends EndPoint>) newValue);
			return;
		case Bpmn2Package.PARTICIPANT__PROCESS_REF:
			setProcessRef((org.obeonetwork.dsl.bpmn2.Process) newValue);
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
		case Bpmn2Package.PARTICIPANT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.PARTICIPANT__INTERFACE_REFS:
			getInterfaceRefs().clear();
			return;
		case Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
			setParticipantMultiplicity((ParticipantMultiplicity) null);
			return;
		case Bpmn2Package.PARTICIPANT__END_POINT_REFS:
			getEndPointRefs().clear();
			return;
		case Bpmn2Package.PARTICIPANT__PROCESS_REF:
			setProcessRef((org.obeonetwork.dsl.bpmn2.Process) null);
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
		case Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
			return !getIncomingConversationLinks().isEmpty();
		case Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
			return !getOutgoingConversationLinks().isEmpty();
		case Bpmn2Package.PARTICIPANT__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case Bpmn2Package.PARTICIPANT__INTERFACE_REFS:
			return !getInterfaceRefs().isEmpty();
		case Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
			return getParticipantMultiplicity() != null;
		case Bpmn2Package.PARTICIPANT__END_POINT_REFS:
			return !getEndPointRefs().isEmpty();
		case Bpmn2Package.PARTICIPANT__PROCESS_REF:
			return basicGetProcessRef() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionNode.class) {
			switch (derivedFeatureID) {
			case Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
				return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
			case Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
				return Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionNode.class) {
			switch (baseFeatureID) {
			case Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS:
				return Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS;
			case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS:
				return Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ParticipantImpl
