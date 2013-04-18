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
	 * The cached value of the '{@link #getIncomingConversationLinks() <em>Incoming Conversation Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConversationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ConversationLink> incomingConversationLinks;

	/**
	 * The cached value of the '{@link #getOutgoingConversationLinks() <em>Outgoing Conversation Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConversationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ConversationLink> outgoingConversationLinks;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaceRefs() <em>Interface Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaceRefs;

	/**
	 * The cached value of the '{@link #getParticipantMultiplicity() <em>Participant Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected ParticipantMultiplicity participantMultiplicity;

	/**
	 * The cached value of the '{@link #getEndPointRefs() <em>End Point Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPoint> endPointRefs;

	/**
	 * The cached value of the '{@link #getProcessRef() <em>Process Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessRef()
	 * @generated
	 * @ordered
	 */
	protected org.obeonetwork.dsl.bpmn2.Process processRef;

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
	public EList<ConversationLink> getIncomingConversationLinks() {
		if (incomingConversationLinks == null) {
			incomingConversationLinks = new EObjectWithInverseResolvingEList<ConversationLink>(
					ConversationLink.class, this,
					Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS,
					Bpmn2Package.CONVERSATION_LINK__TARGET_REF);
		}
		return incomingConversationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConversationLink> getOutgoingConversationLinks() {
		if (outgoingConversationLinks == null) {
			outgoingConversationLinks = new EObjectWithInverseResolvingEList<ConversationLink>(
					ConversationLink.class, this,
					Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS,
					Bpmn2Package.CONVERSATION_LINK__SOURCE_REF);
		}
		return outgoingConversationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.PARTICIPANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaceRefs() {
		if (interfaceRefs == null) {
			interfaceRefs = new EObjectResolvingEList<Interface>(
					Interface.class, this,
					Bpmn2Package.PARTICIPANT__INTERFACE_REFS);
		}
		return interfaceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantMultiplicity getParticipantMultiplicity() {
		return participantMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantMultiplicity(
			ParticipantMultiplicity newParticipantMultiplicity,
			NotificationChain msgs) {
		ParticipantMultiplicity oldParticipantMultiplicity = participantMultiplicity;
		participantMultiplicity = newParticipantMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
					oldParticipantMultiplicity, newParticipantMultiplicity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantMultiplicity(
			ParticipantMultiplicity newParticipantMultiplicity) {
		if (newParticipantMultiplicity != participantMultiplicity) {
			NotificationChain msgs = null;
			if (participantMultiplicity != null)
				msgs = ((InternalEObject) participantMultiplicity)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
								null, msgs);
			if (newParticipantMultiplicity != null)
				msgs = ((InternalEObject) newParticipantMultiplicity)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
								null, msgs);
			msgs = basicSetParticipantMultiplicity(newParticipantMultiplicity,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
					newParticipantMultiplicity, newParticipantMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPoint> getEndPointRefs() {
		if (endPointRefs == null) {
			endPointRefs = new EObjectResolvingEList<EndPoint>(EndPoint.class,
					this, Bpmn2Package.PARTICIPANT__END_POINT_REFS);
		}
		return endPointRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.bpmn2.Process getProcessRef() {
		if (processRef != null && processRef.eIsProxy()) {
			InternalEObject oldProcessRef = (InternalEObject) processRef;
			processRef = (org.obeonetwork.dsl.bpmn2.Process) eResolveProxy(oldProcessRef);
			if (processRef != oldProcessRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Bpmn2Package.PARTICIPANT__PROCESS_REF,
							oldProcessRef, processRef));
			}
		}
		return processRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.bpmn2.Process basicGetProcessRef() {
		return processRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessRef(org.obeonetwork.dsl.bpmn2.Process newProcessRef) {
		org.obeonetwork.dsl.bpmn2.Process oldProcessRef = processRef;
		processRef = newProcessRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.PARTICIPANT__PROCESS_REF, oldProcessRef,
					processRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
			return ((InternalEList<?>) getIncomingConversationLinks())
					.basicRemove(otherEnd, msgs);
		case Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
			return ((InternalEList<?>) getOutgoingConversationLinks())
					.basicRemove(otherEnd, msgs);
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
			getInterfaceRefs().addAll(
					(Collection<? extends Interface>) newValue);
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
			return incomingConversationLinks != null
					&& !incomingConversationLinks.isEmpty();
		case Bpmn2Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
			return outgoingConversationLinks != null
					&& !outgoingConversationLinks.isEmpty();
		case Bpmn2Package.PARTICIPANT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case Bpmn2Package.PARTICIPANT__INTERFACE_REFS:
			return interfaceRefs != null && !interfaceRefs.isEmpty();
		case Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
			return participantMultiplicity != null;
		case Bpmn2Package.PARTICIPANT__END_POINT_REFS:
			return endPointRefs != null && !endPointRefs.isEmpty();
		case Bpmn2Package.PARTICIPANT__PROCESS_REF:
			return processRef != null;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
