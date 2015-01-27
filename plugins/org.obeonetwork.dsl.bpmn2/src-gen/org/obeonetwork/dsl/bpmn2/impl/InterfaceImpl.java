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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Interface;
import org.obeonetwork.dsl.bpmn2.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InterfaceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InterfaceImpl#getImplementationRef <em>Implementation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends RootElementImpl implements Interface {
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
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.INTERFACE__NAME,
				Bpmn2Package.Literals.INTERFACE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.INTERFACE__NAME,
				Bpmn2Package.Literals.INTERFACE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Operation> getOperations() {
		return (EList<Operation>) eDynamicGet(
				Bpmn2Package.INTERFACE__OPERATIONS,
				Bpmn2Package.Literals.INTERFACE__OPERATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getImplementationRef() {
		return (EObject) eDynamicGet(
				Bpmn2Package.INTERFACE__IMPLEMENTATION_REF,
				Bpmn2Package.Literals.INTERFACE__IMPLEMENTATION_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetImplementationRef() {
		return (EObject) eDynamicGet(
				Bpmn2Package.INTERFACE__IMPLEMENTATION_REF,
				Bpmn2Package.Literals.INTERFACE__IMPLEMENTATION_REF, false,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationRef(EObject newImplementationRef) {
		eDynamicSet(Bpmn2Package.INTERFACE__IMPLEMENTATION_REF,
				Bpmn2Package.Literals.INTERFACE__IMPLEMENTATION_REF,
				newImplementationRef);
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
		case Bpmn2Package.INTERFACE__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd,
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
		case Bpmn2Package.INTERFACE__NAME:
			return getName();
		case Bpmn2Package.INTERFACE__OPERATIONS:
			return getOperations();
		case Bpmn2Package.INTERFACE__IMPLEMENTATION_REF:
			if (resolve)
				return getImplementationRef();
			return basicGetImplementationRef();
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
		case Bpmn2Package.INTERFACE__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.INTERFACE__OPERATIONS:
			getOperations().clear();
			getOperations().addAll((Collection<? extends Operation>) newValue);
			return;
		case Bpmn2Package.INTERFACE__IMPLEMENTATION_REF:
			setImplementationRef((EObject) newValue);
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
		case Bpmn2Package.INTERFACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.INTERFACE__OPERATIONS:
			getOperations().clear();
			return;
		case Bpmn2Package.INTERFACE__IMPLEMENTATION_REF:
			setImplementationRef((EObject) null);
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
		case Bpmn2Package.INTERFACE__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT
					.equals(getName());
		case Bpmn2Package.INTERFACE__OPERATIONS:
			return !getOperations().isEmpty();
		case Bpmn2Package.INTERFACE__IMPLEMENTATION_REF:
			return basicGetImplementationRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
