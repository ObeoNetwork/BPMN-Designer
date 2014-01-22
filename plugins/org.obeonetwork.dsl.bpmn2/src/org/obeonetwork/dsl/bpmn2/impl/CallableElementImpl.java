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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.CallableElement;
import org.obeonetwork.dsl.bpmn2.InputOutputBinding;
import org.obeonetwork.dsl.bpmn2.InputOutputSpecification;
import org.obeonetwork.dsl.bpmn2.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CallableElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CallableElementImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CallableElementImpl#getSupportedInterfaceRefs <em>Supported Interface Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CallableElementImpl#getIoBinding <em>Io Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CallableElementImpl extends RootElementImpl implements
		CallableElement {
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
	protected CallableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.CALLABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.CALLABLE_ELEMENT__NAME,
				Bpmn2Package.Literals.CALLABLE_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.CALLABLE_ELEMENT__NAME,
				Bpmn2Package.Literals.CALLABLE_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecification getIoSpecification() {
		return (InputOutputSpecification) eDynamicGet(
				Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION,
				Bpmn2Package.Literals.CALLABLE_ELEMENT__IO_SPECIFICATION, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoSpecification(
			InputOutputSpecification newIoSpecification, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newIoSpecification,
				Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoSpecification(InputOutputSpecification newIoSpecification) {
		eDynamicSet(Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION,
				Bpmn2Package.Literals.CALLABLE_ELEMENT__IO_SPECIFICATION,
				newIoSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> getSupportedInterfaceRefs() {
		return (EList<Interface>) eDynamicGet(
				Bpmn2Package.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS,
				Bpmn2Package.Literals.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InputOutputBinding> getIoBinding() {
		return (EList<InputOutputBinding>) eDynamicGet(
				Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING,
				Bpmn2Package.Literals.CALLABLE_ELEMENT__IO_BINDING, true, true);
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
		case Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION:
			return basicSetIoSpecification(null, msgs);
		case Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING:
			return ((InternalEList<?>) getIoBinding()).basicRemove(otherEnd,
					msgs);
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
		case Bpmn2Package.CALLABLE_ELEMENT__NAME:
			return getName();
		case Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION:
			return getIoSpecification();
		case Bpmn2Package.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
			return getSupportedInterfaceRefs();
		case Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING:
			return getIoBinding();
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
		case Bpmn2Package.CALLABLE_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION:
			setIoSpecification((InputOutputSpecification) newValue);
			return;
		case Bpmn2Package.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
			getSupportedInterfaceRefs().clear();
			getSupportedInterfaceRefs().addAll(
					(Collection<? extends Interface>) newValue);
			return;
		case Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING:
			getIoBinding().clear();
			getIoBinding().addAll(
					(Collection<? extends InputOutputBinding>) newValue);
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
		case Bpmn2Package.CALLABLE_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION:
			setIoSpecification((InputOutputSpecification) null);
			return;
		case Bpmn2Package.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
			getSupportedInterfaceRefs().clear();
			return;
		case Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING:
			getIoBinding().clear();
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
		case Bpmn2Package.CALLABLE_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT
					.equals(getName());
		case Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION:
			return getIoSpecification() != null;
		case Bpmn2Package.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
			return !getSupportedInterfaceRefs().isEmpty();
		case Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING:
			return !getIoBinding().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallableElementImpl
