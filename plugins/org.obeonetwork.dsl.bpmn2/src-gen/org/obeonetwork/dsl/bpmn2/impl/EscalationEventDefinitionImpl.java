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
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Escalation;
import org.obeonetwork.dsl.bpmn2.EscalationEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escalation Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.EscalationEventDefinitionImpl#getEscalationRef <em>Escalation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EscalationEventDefinitionImpl extends EventDefinitionImpl
		implements EscalationEventDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EscalationEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.ESCALATION_EVENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escalation getEscalationRef() {
		return (Escalation) eDynamicGet(
				Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF,
				Bpmn2Package.Literals.ESCALATION_EVENT_DEFINITION__ESCALATION_REF,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escalation basicGetEscalationRef() {
		return (Escalation) eDynamicGet(
				Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF,
				Bpmn2Package.Literals.ESCALATION_EVENT_DEFINITION__ESCALATION_REF,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscalationRef(Escalation newEscalationRef) {
		eDynamicSet(
				Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF,
				Bpmn2Package.Literals.ESCALATION_EVENT_DEFINITION__ESCALATION_REF,
				newEscalationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
			if (resolve)
				return getEscalationRef();
			return basicGetEscalationRef();
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
		case Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
			setEscalationRef((Escalation) newValue);
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
		case Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
			setEscalationRef((Escalation) null);
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
		case Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
			return basicGetEscalationRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //EscalationEventDefinitionImpl
