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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ConversationLink;
import org.obeonetwork.dsl.bpmn2.InteractionNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ConversationLinkImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ConversationLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ConversationLinkImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversationLinkImpl extends BaseElementImpl implements ConversationLink {
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
		return (InteractionNode) eDynamicGet(Bpmn2Package.CONVERSATION_LINK__SOURCE_REF,
				Bpmn2Package.Literals.CONVERSATION_LINK__SOURCE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode basicGetSourceRef() {
		return (InteractionNode) eDynamicGet(Bpmn2Package.CONVERSATION_LINK__SOURCE_REF,
				Bpmn2Package.Literals.CONVERSATION_LINK__SOURCE_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRef(InteractionNode newSourceRef, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newSourceRef, Bpmn2Package.CONVERSATION_LINK__SOURCE_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(InteractionNode newSourceRef) {
		eDynamicSet(Bpmn2Package.CONVERSATION_LINK__SOURCE_REF, Bpmn2Package.Literals.CONVERSATION_LINK__SOURCE_REF,
				newSourceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.CONVERSATION_LINK__NAME, Bpmn2Package.Literals.CONVERSATION_LINK__NAME,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.CONVERSATION_LINK__NAME, Bpmn2Package.Literals.CONVERSATION_LINK__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode getTargetRef() {
		return (InteractionNode) eDynamicGet(Bpmn2Package.CONVERSATION_LINK__TARGET_REF,
				Bpmn2Package.Literals.CONVERSATION_LINK__TARGET_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode basicGetTargetRef() {
		return (InteractionNode) eDynamicGet(Bpmn2Package.CONVERSATION_LINK__TARGET_REF,
				Bpmn2Package.Literals.CONVERSATION_LINK__TARGET_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetRef(InteractionNode newTargetRef, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTargetRef, Bpmn2Package.CONVERSATION_LINK__TARGET_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(InteractionNode newTargetRef) {
		eDynamicSet(Bpmn2Package.CONVERSATION_LINK__TARGET_REF, Bpmn2Package.Literals.CONVERSATION_LINK__TARGET_REF,
				newTargetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.CONVERSATION_LINK__SOURCE_REF:
			InteractionNode sourceRef = basicGetSourceRef();
			if (sourceRef != null)
				msgs = ((InternalEObject) sourceRef).eInverseRemove(this,
						Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS, InteractionNode.class, msgs);
			return basicSetSourceRef((InteractionNode) otherEnd, msgs);
		case Bpmn2Package.CONVERSATION_LINK__TARGET_REF:
			InteractionNode targetRef = basicGetTargetRef();
			if (targetRef != null)
				msgs = ((InternalEObject) targetRef).eInverseRemove(this,
						Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS, InteractionNode.class, msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
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
			return basicGetSourceRef() != null;
		case Bpmn2Package.CONVERSATION_LINK__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case Bpmn2Package.CONVERSATION_LINK__TARGET_REF:
			return basicGetTargetRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConversationLinkImpl
