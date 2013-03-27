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
package org.eclipse.bpmn2.impl;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.ConversationLink;
import org.eclipse.bpmn2.InteractionNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationLinkImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationLinkImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversationLinkImpl extends BaseElementImpl implements ConversationLink {
    /**
     * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRef()
     * @generated
     * @ordered
     */
    protected InteractionNode sourceRef;

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
     * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetRef()
     * @generated
     * @ordered
     */
    protected InteractionNode targetRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConversationLinkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.CONVERSATION_LINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionNode getSourceRef() {
        if (sourceRef != null && sourceRef.eIsProxy()) {
            InternalEObject oldSourceRef = (InternalEObject) sourceRef;
            sourceRef = (InteractionNode) eResolveProxy(oldSourceRef);
            if (sourceRef != oldSourceRef) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            Bpmn2Package.CONVERSATION_LINK__SOURCE_REF, oldSourceRef, sourceRef));
            }
        }
        return sourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionNode basicGetSourceRef() {
        return sourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSourceRef(InteractionNode newSourceRef, NotificationChain msgs) {
        InteractionNode oldSourceRef = sourceRef;
        sourceRef = newSourceRef;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.CONVERSATION_LINK__SOURCE_REF, oldSourceRef, newSourceRef);
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
    public void setSourceRef(InteractionNode newSourceRef) {
        if (newSourceRef != sourceRef) {
            NotificationChain msgs = null;
            if (sourceRef != null)
                msgs = ((InternalEObject) sourceRef).eInverseRemove(this,
                        Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS,
                        InteractionNode.class, msgs);
            if (newSourceRef != null)
                msgs = ((InternalEObject) newSourceRef).eInverseAdd(this,
                        Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS,
                        InteractionNode.class, msgs);
            msgs = basicSetSourceRef(newSourceRef, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.CONVERSATION_LINK__SOURCE_REF, newSourceRef, newSourceRef));
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
                    Bpmn2Package.CONVERSATION_LINK__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionNode getTargetRef() {
        if (targetRef != null && targetRef.eIsProxy()) {
            InternalEObject oldTargetRef = (InternalEObject) targetRef;
            targetRef = (InteractionNode) eResolveProxy(oldTargetRef);
            if (targetRef != oldTargetRef) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            Bpmn2Package.CONVERSATION_LINK__TARGET_REF, oldTargetRef, targetRef));
            }
        }
        return targetRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionNode basicGetTargetRef() {
        return targetRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTargetRef(InteractionNode newTargetRef, NotificationChain msgs) {
        InteractionNode oldTargetRef = targetRef;
        targetRef = newTargetRef;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.CONVERSATION_LINK__TARGET_REF, oldTargetRef, newTargetRef);
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
    public void setTargetRef(InteractionNode newTargetRef) {
        if (newTargetRef != targetRef) {
            NotificationChain msgs = null;
            if (targetRef != null)
                msgs = ((InternalEObject) targetRef).eInverseRemove(this,
                        Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS,
                        InteractionNode.class, msgs);
            if (newTargetRef != null)
                msgs = ((InternalEObject) newTargetRef).eInverseAdd(this,
                        Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS,
                        InteractionNode.class, msgs);
            msgs = basicSetTargetRef(newTargetRef, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.CONVERSATION_LINK__TARGET_REF, newTargetRef, newTargetRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
            NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.CONVERSATION_LINK__SOURCE_REF:
            if (sourceRef != null)
                msgs = ((InternalEObject) sourceRef).eInverseRemove(this,
                        Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS,
                        InteractionNode.class, msgs);
            return basicSetSourceRef((InteractionNode) otherEnd, msgs);
        case Bpmn2Package.CONVERSATION_LINK__TARGET_REF:
            if (targetRef != null)
                msgs = ((InternalEObject) targetRef).eInverseRemove(this,
                        Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS,
                        InteractionNode.class, msgs);
            return basicSetTargetRef((InteractionNode) otherEnd, msgs);
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
        case Bpmn2Package.CONVERSATION_LINK__SOURCE_REF:
            return basicSetSourceRef(null, msgs);
        case Bpmn2Package.CONVERSATION_LINK__TARGET_REF:
            return basicSetTargetRef(null, msgs);
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
        case Bpmn2Package.CONVERSATION_LINK__SOURCE_REF:
            if (resolve)
                return getSourceRef();
            return basicGetSourceRef();
        case Bpmn2Package.CONVERSATION_LINK__NAME:
            return getName();
        case Bpmn2Package.CONVERSATION_LINK__TARGET_REF:
            if (resolve)
                return getTargetRef();
            return basicGetTargetRef();
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
        case Bpmn2Package.CONVERSATION_LINK__SOURCE_REF:
            setSourceRef((InteractionNode) newValue);
            return;
        case Bpmn2Package.CONVERSATION_LINK__NAME:
            setName((String) newValue);
            return;
        case Bpmn2Package.CONVERSATION_LINK__TARGET_REF:
            setTargetRef((InteractionNode) newValue);
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
        case Bpmn2Package.CONVERSATION_LINK__SOURCE_REF:
            setSourceRef((InteractionNode) null);
            return;
        case Bpmn2Package.CONVERSATION_LINK__NAME:
            setName(NAME_EDEFAULT);
            return;
        case Bpmn2Package.CONVERSATION_LINK__TARGET_REF:
            setTargetRef((InteractionNode) null);
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
        case Bpmn2Package.CONVERSATION_LINK__SOURCE_REF:
            return sourceRef != null;
        case Bpmn2Package.CONVERSATION_LINK__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case Bpmn2Package.CONVERSATION_LINK__TARGET_REF:
            return targetRef != null;
        }
        return super.eIsSet(featureID);
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

} //ConversationLinkImpl
