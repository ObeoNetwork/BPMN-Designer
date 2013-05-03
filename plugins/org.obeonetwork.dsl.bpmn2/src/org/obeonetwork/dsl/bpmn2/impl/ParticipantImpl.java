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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getInterfaceRefs <em>Interface Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getEndPointRefs <em>End Point Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantImpl extends BaseElementImpl implements Participant {
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
		return (EList<ConversationLink>) eGet(
				Bpmn2Package.Literals.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConversationLink> getOutgoingConversationLinks() {
		return (EList<ConversationLink>) eGet(
				Bpmn2Package.Literals.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eGet(Bpmn2Package.Literals.PARTICIPANT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(Bpmn2Package.Literals.PARTICIPANT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> getInterfaceRefs() {
		return (EList<Interface>) eGet(
				Bpmn2Package.Literals.PARTICIPANT__INTERFACE_REFS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantMultiplicity getParticipantMultiplicity() {
		return (ParticipantMultiplicity) eGet(
				Bpmn2Package.Literals.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantMultiplicity(
			ParticipantMultiplicity newParticipantMultiplicity) {
		eSet(Bpmn2Package.Literals.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
				newParticipantMultiplicity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EndPoint> getEndPointRefs() {
		return (EList<EndPoint>) eGet(
				Bpmn2Package.Literals.PARTICIPANT__END_POINT_REFS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.bpmn2.Process getProcessRef() {
		return (org.obeonetwork.dsl.bpmn2.Process) eGet(
				Bpmn2Package.Literals.PARTICIPANT__PROCESS_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessRef(org.obeonetwork.dsl.bpmn2.Process newProcessRef) {
		eSet(Bpmn2Package.Literals.PARTICIPANT__PROCESS_REF, newProcessRef);
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
