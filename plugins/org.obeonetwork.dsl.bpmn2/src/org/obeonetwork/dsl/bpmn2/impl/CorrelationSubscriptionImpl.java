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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.CorrelationKey;
import org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding;
import org.obeonetwork.dsl.bpmn2.CorrelationSubscription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationSubscriptionImpl#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationSubscriptionImpl#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationSubscriptionImpl extends BaseElementImpl implements
		CorrelationSubscription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationSubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.CORRELATION_SUBSCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey getCorrelationKeyRef() {
		return (CorrelationKey) eDynamicGet(
				Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF,
				Bpmn2Package.Literals.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey basicGetCorrelationKeyRef() {
		return (CorrelationKey) eDynamicGet(
				Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF,
				Bpmn2Package.Literals.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationKeyRef(CorrelationKey newCorrelationKeyRef) {
		eDynamicSet(
				Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF,
				Bpmn2Package.Literals.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF,
				newCorrelationKeyRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CorrelationPropertyBinding> getCorrelationPropertyBinding() {
		return (EList<CorrelationPropertyBinding>) eDynamicGet(
				Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING,
				Bpmn2Package.Literals.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING,
				true, true);
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
		case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
			return ((InternalEList<?>) getCorrelationPropertyBinding())
					.basicRemove(otherEnd, msgs);
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
		case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
			if (resolve)
				return getCorrelationKeyRef();
			return basicGetCorrelationKeyRef();
		case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
			return getCorrelationPropertyBinding();
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
		case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
			setCorrelationKeyRef((CorrelationKey) newValue);
			return;
		case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
			getCorrelationPropertyBinding().clear();
			getCorrelationPropertyBinding()
					.addAll((Collection<? extends CorrelationPropertyBinding>) newValue);
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
		case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
			setCorrelationKeyRef((CorrelationKey) null);
			return;
		case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
			getCorrelationPropertyBinding().clear();
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
		case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
			return basicGetCorrelationKeyRef() != null;
		case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
			return !getCorrelationPropertyBinding().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CorrelationSubscriptionImpl
