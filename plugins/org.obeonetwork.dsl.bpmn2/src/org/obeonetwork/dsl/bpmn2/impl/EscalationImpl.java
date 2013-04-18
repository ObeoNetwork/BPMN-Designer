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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Escalation;
import org.obeonetwork.dsl.bpmn2.ItemDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escalation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.EscalationImpl#getStructureRef <em>Structure Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.EscalationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.EscalationImpl#getEscalationCode <em>Escalation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EscalationImpl extends EObjectImpl implements Escalation {
	/**
	 * The cached value of the '{@link #getStructureRef() <em>Structure Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureRef()
	 * @generated
	 * @ordered
	 */
	protected ItemDefinition structureRef;

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
	 * The default value of the '{@link #getEscalationCode() <em>Escalation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCALATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscalationCode() <em>Escalation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalationCode()
	 * @generated
	 * @ordered
	 */
	protected String escalationCode = ESCALATION_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EscalationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.ESCALATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getStructureRef() {
		if (structureRef != null && structureRef.eIsProxy()) {
			InternalEObject oldStructureRef = (InternalEObject) structureRef;
			structureRef = (ItemDefinition) eResolveProxy(oldStructureRef);
			if (structureRef != oldStructureRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Bpmn2Package.ESCALATION__STRUCTURE_REF,
							oldStructureRef, structureRef));
			}
		}
		return structureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetStructureRef() {
		return structureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureRef(ItemDefinition newStructureRef) {
		ItemDefinition oldStructureRef = structureRef;
		structureRef = newStructureRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.ESCALATION__STRUCTURE_REF, oldStructureRef,
					structureRef));
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
					Bpmn2Package.ESCALATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEscalationCode() {
		return escalationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscalationCode(String newEscalationCode) {
		String oldEscalationCode = escalationCode;
		escalationCode = newEscalationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.ESCALATION__ESCALATION_CODE,
					oldEscalationCode, escalationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.ESCALATION__STRUCTURE_REF:
			if (resolve)
				return getStructureRef();
			return basicGetStructureRef();
		case Bpmn2Package.ESCALATION__NAME:
			return getName();
		case Bpmn2Package.ESCALATION__ESCALATION_CODE:
			return getEscalationCode();
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
		case Bpmn2Package.ESCALATION__STRUCTURE_REF:
			setStructureRef((ItemDefinition) newValue);
			return;
		case Bpmn2Package.ESCALATION__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.ESCALATION__ESCALATION_CODE:
			setEscalationCode((String) newValue);
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
		case Bpmn2Package.ESCALATION__STRUCTURE_REF:
			setStructureRef((ItemDefinition) null);
			return;
		case Bpmn2Package.ESCALATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.ESCALATION__ESCALATION_CODE:
			setEscalationCode(ESCALATION_CODE_EDEFAULT);
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
		case Bpmn2Package.ESCALATION__STRUCTURE_REF:
			return structureRef != null;
		case Bpmn2Package.ESCALATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case Bpmn2Package.ESCALATION__ESCALATION_CODE:
			return ESCALATION_CODE_EDEFAULT == null ? escalationCode != null
					: !ESCALATION_CODE_EDEFAULT.equals(escalationCode);
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
		result.append(", escalationCode: ");
		result.append(escalationCode);
		result.append(')');
		return result.toString();
	}

} //EscalationImpl
