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

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.bpmn2.Auditing;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.CategoryValue;
import org.obeonetwork.dsl.bpmn2.FlowElement;
import org.obeonetwork.dsl.bpmn2.Monitoring;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl#getCategoryValueRef <em>Category Value Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowElementImpl extends BaseElementImpl implements
		FlowElement {
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
	 * The cached value of the '{@link #getAuditing() <em>Auditing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditing()
	 * @generated
	 * @ordered
	 */
	protected Auditing auditing;

	/**
	 * The cached value of the '{@link #getMonitoring() <em>Monitoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoring()
	 * @generated
	 * @ordered
	 */
	protected Monitoring monitoring;

	/**
	 * The cached value of the '{@link #getCategoryValueRef() <em>Category Value Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryValueRef()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryValue> categoryValueRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.FLOW_ELEMENT;
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
					Bpmn2Package.FLOW_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auditing getAuditing() {
		return auditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditing(Auditing newAuditing,
			NotificationChain msgs) {
		Auditing oldAuditing = auditing;
		auditing = newAuditing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, Bpmn2Package.FLOW_ELEMENT__AUDITING,
					oldAuditing, newAuditing);
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
	public void setAuditing(Auditing newAuditing) {
		if (newAuditing != auditing) {
			NotificationChain msgs = null;
			if (auditing != null)
				msgs = ((InternalEObject) auditing).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Bpmn2Package.FLOW_ELEMENT__AUDITING, null,
						msgs);
			if (newAuditing != null)
				msgs = ((InternalEObject) newAuditing).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Bpmn2Package.FLOW_ELEMENT__AUDITING, null,
						msgs);
			msgs = basicSetAuditing(newAuditing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.FLOW_ELEMENT__AUDITING, newAuditing,
					newAuditing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring getMonitoring() {
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoring(Monitoring newMonitoring,
			NotificationChain msgs) {
		Monitoring oldMonitoring = monitoring;
		monitoring = newMonitoring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, Bpmn2Package.FLOW_ELEMENT__MONITORING,
					oldMonitoring, newMonitoring);
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
	public void setMonitoring(Monitoring newMonitoring) {
		if (newMonitoring != monitoring) {
			NotificationChain msgs = null;
			if (monitoring != null)
				msgs = ((InternalEObject) monitoring).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Bpmn2Package.FLOW_ELEMENT__MONITORING, null,
						msgs);
			if (newMonitoring != null)
				msgs = ((InternalEObject) newMonitoring).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Bpmn2Package.FLOW_ELEMENT__MONITORING, null,
						msgs);
			msgs = basicSetMonitoring(newMonitoring, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.FLOW_ELEMENT__MONITORING, newMonitoring,
					newMonitoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryValue> getCategoryValueRef() {
		if (categoryValueRef == null) {
			categoryValueRef = new EObjectWithInverseEList.ManyInverse<CategoryValue>(
					CategoryValue.class, this,
					Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF,
					Bpmn2Package.CATEGORY_VALUE__CATEGORIZED_FLOW_ELEMENTS);
		}
		return categoryValueRef;
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
		case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCategoryValueRef())
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
		case Bpmn2Package.FLOW_ELEMENT__AUDITING:
			return basicSetAuditing(null, msgs);
		case Bpmn2Package.FLOW_ELEMENT__MONITORING:
			return basicSetMonitoring(null, msgs);
		case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
			return ((InternalEList<?>) getCategoryValueRef()).basicRemove(
					otherEnd, msgs);
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
		case Bpmn2Package.FLOW_ELEMENT__NAME:
			return getName();
		case Bpmn2Package.FLOW_ELEMENT__AUDITING:
			return getAuditing();
		case Bpmn2Package.FLOW_ELEMENT__MONITORING:
			return getMonitoring();
		case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
			return getCategoryValueRef();
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
		case Bpmn2Package.FLOW_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.FLOW_ELEMENT__AUDITING:
			setAuditing((Auditing) newValue);
			return;
		case Bpmn2Package.FLOW_ELEMENT__MONITORING:
			setMonitoring((Monitoring) newValue);
			return;
		case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
			getCategoryValueRef().clear();
			getCategoryValueRef().addAll(
					(Collection<? extends CategoryValue>) newValue);
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
		case Bpmn2Package.FLOW_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.FLOW_ELEMENT__AUDITING:
			setAuditing((Auditing) null);
			return;
		case Bpmn2Package.FLOW_ELEMENT__MONITORING:
			setMonitoring((Monitoring) null);
			return;
		case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
			getCategoryValueRef().clear();
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
		case Bpmn2Package.FLOW_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case Bpmn2Package.FLOW_ELEMENT__AUDITING:
			return auditing != null;
		case Bpmn2Package.FLOW_ELEMENT__MONITORING:
			return monitoring != null;
		case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF:
			return categoryValueRef != null && !categoryValueRef.isEmpty();
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

} //FlowElementImpl
