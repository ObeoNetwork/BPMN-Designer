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
import org.obeonetwork.dsl.bpmn2.CorrelationPropertyRetrievalExpression;
import org.obeonetwork.dsl.bpmn2.FormalExpression;
import org.obeonetwork.dsl.bpmn2.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyRetrievalExpressionImpl#getMessagePath <em>Message Path</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyRetrievalExpressionImpl#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorrelationPropertyRetrievalExpressionImpl extends BaseElementImpl
		implements CorrelationPropertyRetrievalExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationPropertyRetrievalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression getMessagePath() {
		return (FormalExpression) eDynamicGet(Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH,
				Bpmn2Package.Literals.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagePath(FormalExpression newMessagePath, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newMessagePath,
				Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagePath(FormalExpression newMessagePath) {
		eDynamicSet(Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH,
				Bpmn2Package.Literals.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, newMessagePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessageRef() {
		return (Message) eDynamicGet(Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF,
				Bpmn2Package.Literals.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessageRef() {
		return (Message) eDynamicGet(Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF,
				Bpmn2Package.Literals.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRef(Message newMessageRef) {
		eDynamicSet(Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF,
				Bpmn2Package.Literals.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF, newMessageRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
			return basicSetMessagePath(null, msgs);
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
		case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
			return getMessagePath();
		case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
			if (resolve)
				return getMessageRef();
			return basicGetMessageRef();
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
		case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
			setMessagePath((FormalExpression) newValue);
			return;
		case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
			setMessageRef((Message) newValue);
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
		case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
			setMessagePath((FormalExpression) null);
			return;
		case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
			setMessageRef((Message) null);
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
		case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
			return getMessagePath() != null;
		case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
			return basicGetMessageRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //CorrelationPropertyRetrievalExpressionImpl
