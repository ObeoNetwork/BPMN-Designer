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
import org.obeonetwork.dsl.bpmn2.ComplexBehaviorDefinition;
import org.obeonetwork.dsl.bpmn2.FormalExpression;
import org.obeonetwork.dsl.bpmn2.ImplicitThrowEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Behavior Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ComplexBehaviorDefinitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ComplexBehaviorDefinitionImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexBehaviorDefinitionImpl extends BaseElementImpl implements
		ComplexBehaviorDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexBehaviorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.COMPLEX_BEHAVIOR_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression getCondition() {
		return (FormalExpression) eDynamicGet(
				Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__CONDITION,
				Bpmn2Package.Literals.COMPLEX_BEHAVIOR_DEFINITION__CONDITION,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(FormalExpression newCondition,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newCondition,
				Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(FormalExpression newCondition) {
		eDynamicSet(Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__CONDITION,
				Bpmn2Package.Literals.COMPLEX_BEHAVIOR_DEFINITION__CONDITION,
				newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitThrowEvent getEvent() {
		return (ImplicitThrowEvent) eDynamicGet(
				Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__EVENT,
				Bpmn2Package.Literals.COMPLEX_BEHAVIOR_DEFINITION__EVENT, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(ImplicitThrowEvent newEvent,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newEvent,
				Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__EVENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(ImplicitThrowEvent newEvent) {
		eDynamicSet(Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__EVENT,
				Bpmn2Package.Literals.COMPLEX_BEHAVIOR_DEFINITION__EVENT,
				newEvent);
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
		case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
			return basicSetCondition(null, msgs);
		case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
			return basicSetEvent(null, msgs);
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
		case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
			return getCondition();
		case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
			return getEvent();
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
		case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
			setCondition((FormalExpression) newValue);
			return;
		case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
			setEvent((ImplicitThrowEvent) newValue);
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
		case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
			setCondition((FormalExpression) null);
			return;
		case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
			setEvent((ImplicitThrowEvent) null);
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
		case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
			return getCondition() != null;
		case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
			return getEvent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexBehaviorDefinitionImpl
