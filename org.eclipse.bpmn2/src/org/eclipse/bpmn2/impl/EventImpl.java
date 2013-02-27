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
import org.eclipse.bpmn2.Event;
import org.eclipse.bpmn2.InteractionNode;
import org.eclipse.bpmn2.Property;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.EventImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.EventImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.EventImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EventImpl extends FlowNodeImpl implements Event {
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
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<Property> properties;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.EVENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConversationLink> getIncomingConversationLinks() {
        if (incomingConversationLinks == null) {
            incomingConversationLinks = new EObjectWithInverseResolvingEList<ConversationLink>(
                    ConversationLink.class, this, Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS,
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
                    ConversationLink.class, this, Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS,
                    Bpmn2Package.CONVERSATION_LINK__SOURCE_REF);
        }
        return outgoingConversationLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this,
                    Bpmn2Package.EVENT__PROPERTIES);
        }
        return properties;
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
        case Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingConversationLinks())
                    .basicAdd(otherEnd, msgs);
        case Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS:
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
        case Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS:
            return ((InternalEList<?>) getIncomingConversationLinks()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS:
            return ((InternalEList<?>) getOutgoingConversationLinks()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.EVENT__PROPERTIES:
            return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
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
        case Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS:
            return getIncomingConversationLinks();
        case Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS:
            return getOutgoingConversationLinks();
        case Bpmn2Package.EVENT__PROPERTIES:
            return getProperties();
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
        case Bpmn2Package.EVENT__PROPERTIES:
            getProperties().clear();
            getProperties().addAll((Collection<? extends Property>) newValue);
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
        case Bpmn2Package.EVENT__PROPERTIES:
            getProperties().clear();
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
        case Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS:
            return incomingConversationLinks != null && !incomingConversationLinks.isEmpty();
        case Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS:
            return outgoingConversationLinks != null && !outgoingConversationLinks.isEmpty();
        case Bpmn2Package.EVENT__PROPERTIES:
            return properties != null && !properties.isEmpty();
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
            case Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS:
                return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
            case Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS:
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
                return Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS;
            case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS:
                return Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //EventImpl
