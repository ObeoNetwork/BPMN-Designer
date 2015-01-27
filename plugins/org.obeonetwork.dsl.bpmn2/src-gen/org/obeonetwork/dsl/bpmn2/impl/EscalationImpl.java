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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
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
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.EscalationImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EscalationImpl extends CDOObjectImpl implements Escalation {
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
	 * The default value of the '{@link #getEscalationCode() <em>Escalation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCALATION_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EscalationImpl() {
		super();
		setId(EcoreUtil.generateUUID());
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getStructureRef() {
		return (ItemDefinition) eDynamicGet(
				Bpmn2Package.ESCALATION__STRUCTURE_REF,
				Bpmn2Package.Literals.ESCALATION__STRUCTURE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetStructureRef() {
		return (ItemDefinition) eDynamicGet(
				Bpmn2Package.ESCALATION__STRUCTURE_REF,
				Bpmn2Package.Literals.ESCALATION__STRUCTURE_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureRef(ItemDefinition newStructureRef) {
		eDynamicSet(Bpmn2Package.ESCALATION__STRUCTURE_REF,
				Bpmn2Package.Literals.ESCALATION__STRUCTURE_REF,
				newStructureRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.ESCALATION__NAME,
				Bpmn2Package.Literals.ESCALATION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.ESCALATION__NAME,
				Bpmn2Package.Literals.ESCALATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEscalationCode() {
		return (String) eDynamicGet(Bpmn2Package.ESCALATION__ESCALATION_CODE,
				Bpmn2Package.Literals.ESCALATION__ESCALATION_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscalationCode(String newEscalationCode) {
		eDynamicSet(Bpmn2Package.ESCALATION__ESCALATION_CODE,
				Bpmn2Package.Literals.ESCALATION__ESCALATION_CODE,
				newEscalationCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String) eDynamicGet(Bpmn2Package.ESCALATION__ID,
				Bpmn2Package.Literals.ESCALATION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(Bpmn2Package.ESCALATION__ID,
				Bpmn2Package.Literals.ESCALATION__ID, newId);
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
		case Bpmn2Package.ESCALATION__ID:
			return getId();
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
		case Bpmn2Package.ESCALATION__ID:
			setId((String) newValue);
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
		case Bpmn2Package.ESCALATION__ID:
			setId(ID_EDEFAULT);
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
			return basicGetStructureRef() != null;
		case Bpmn2Package.ESCALATION__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT
					.equals(getName());
		case Bpmn2Package.ESCALATION__ESCALATION_CODE:
			return ESCALATION_CODE_EDEFAULT == null ? getEscalationCode() != null
					: !ESCALATION_CODE_EDEFAULT.equals(getEscalationCode());
		case Bpmn2Package.ESCALATION__ID:
			return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT
					.equals(getId());
		}
		return super.eIsSet(featureID);
	}

} //EscalationImpl
