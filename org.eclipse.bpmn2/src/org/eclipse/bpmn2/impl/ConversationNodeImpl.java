/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.bpmn2.impl;

import java.util.Collection;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.ConversationLink;
import org.eclipse.bpmn2.ConversationNode;
import org.eclipse.bpmn2.CorrelationKey;
import org.eclipse.bpmn2.InteractionNode;
import org.eclipse.bpmn2.MessageFlow;
import org.eclipse.bpmn2.Participant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getMessageFlowRefs <em>Message Flow Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getCorrelationKeys <em>Correlation Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConversationNodeImpl extends BaseElementImpl implements ConversationNode {
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
     * The cached value of the '{@link #getParticipantRefs() <em>Participant Refs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantRefs()
     * @generated
     * @ordered
     */
    protected EList<Participant> participantRefs;

    /**
     * The cached value of the '{@link #getMessageFlowRefs() <em>Message Flow Refs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageFlowRefs()
     * @generated
     * @ordered
     */
    protected EList<MessageFlow> messageFlowRefs;

    /**
     * The cached value of the '{@link #getCorrelationKeys() <em>Correlation Keys</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationKeys()
     * @generated
     * @ordered
     */
    protected EList<CorrelationKey> correlationKeys;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConversationNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.CONVERSATION_NODE;
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
                    Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS,
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
                    Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS,
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
                    Bpmn2Package.CONVERSATION_NODE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Participant> getParticipantRefs() {
        if (participantRefs == null) {
            participantRefs = new EObjectResolvingEList<Participant>(Participant.class, this,
                    Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS);
        }
        return participantRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MessageFlow> getMessageFlowRefs() {
        if (messageFlowRefs == null) {
            messageFlowRefs = new EObjectResolvingEList<MessageFlow>(MessageFlow.class, this,
                    Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS);
        }
        return messageFlowRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CorrelationKey> getCorrelationKeys() {
        if (correlationKeys == null) {
            correlationKeys = new EObjectContainmentEList<CorrelationKey>(CorrelationKey.class,
                    this, Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS);
        }
        return correlationKeys;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
            NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingConversationLinks())
                    .basicAdd(otherEnd, msgs);
        case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS:
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
            NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS:
            return ((InternalEList<?>) getIncomingConversationLinks()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS:
            return ((InternalEList<?>) getOutgoingConversationLinks()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS:
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
        case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS:
            return getIncomingConversationLinks();
        case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS:
            return getOutgoingConversationLinks();
        case Bpmn2Package.CONVERSATION_NODE__NAME:
            return getName();
        case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS:
            return getParticipantRefs();
        case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS:
            return getMessageFlowRefs();
        case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS:
            return getCorrelationKeys();
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
        case Bpmn2Package.CONVERSATION_NODE__NAME:
            setName((String) newValue);
            return;
        case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS:
            getParticipantRefs().clear();
            getParticipantRefs().addAll((Collection<? extends Participant>) newValue);
            return;
        case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS:
            getMessageFlowRefs().clear();
            getMessageFlowRefs().addAll((Collection<? extends MessageFlow>) newValue);
            return;
        case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS:
            getCorrelationKeys().clear();
            getCorrelationKeys().addAll((Collection<? extends CorrelationKey>) newValue);
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
        case Bpmn2Package.CONVERSATION_NODE__NAME:
            setName(NAME_EDEFAULT);
            return;
        case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS:
            getParticipantRefs().clear();
            return;
        case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS:
            getMessageFlowRefs().clear();
            return;
        case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS:
            getCorrelationKeys().clear();
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
        case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS:
            return incomingConversationLinks != null && !incomingConversationLinks.isEmpty();
        case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS:
            return outgoingConversationLinks != null && !outgoingConversationLinks.isEmpty();
        case Bpmn2Package.CONVERSATION_NODE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS:
            return participantRefs != null && !participantRefs.isEmpty();
        case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS:
            return messageFlowRefs != null && !messageFlowRefs.isEmpty();
        case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS:
            return correlationKeys != null && !correlationKeys.isEmpty();
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
            case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS:
                return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
            case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS:
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
                return Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS;
            case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS:
                return Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS;
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

} //ConversationNodeImpl
