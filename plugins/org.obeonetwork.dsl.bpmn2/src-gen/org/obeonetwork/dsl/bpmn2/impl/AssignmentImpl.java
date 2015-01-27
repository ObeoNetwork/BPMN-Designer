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
import org.obeonetwork.dsl.bpmn2.Assignment;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AssignmentImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AssignmentImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends BaseElementImpl implements Assignment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFrom() {
		return (Expression) eDynamicGet(Bpmn2Package.ASSIGNMENT__FROM,
				Bpmn2Package.Literals.ASSIGNMENT__FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Expression newFrom,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newFrom,
				Bpmn2Package.ASSIGNMENT__FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Expression newFrom) {
		eDynamicSet(Bpmn2Package.ASSIGNMENT__FROM,
				Bpmn2Package.Literals.ASSIGNMENT__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTo() {
		return (Expression) eDynamicGet(Bpmn2Package.ASSIGNMENT__TO,
				Bpmn2Package.Literals.ASSIGNMENT__TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Expression newTo, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTo,
				Bpmn2Package.ASSIGNMENT__TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Expression newTo) {
		eDynamicSet(Bpmn2Package.ASSIGNMENT__TO,
				Bpmn2Package.Literals.ASSIGNMENT__TO, newTo);
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
		case Bpmn2Package.ASSIGNMENT__FROM:
			return basicSetFrom(null, msgs);
		case Bpmn2Package.ASSIGNMENT__TO:
			return basicSetTo(null, msgs);
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
		case Bpmn2Package.ASSIGNMENT__FROM:
			return getFrom();
		case Bpmn2Package.ASSIGNMENT__TO:
			return getTo();
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
		case Bpmn2Package.ASSIGNMENT__FROM:
			setFrom((Expression) newValue);
			return;
		case Bpmn2Package.ASSIGNMENT__TO:
			setTo((Expression) newValue);
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
		case Bpmn2Package.ASSIGNMENT__FROM:
			setFrom((Expression) null);
			return;
		case Bpmn2Package.ASSIGNMENT__TO:
			setTo((Expression) null);
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
		case Bpmn2Package.ASSIGNMENT__FROM:
			return getFrom() != null;
		case Bpmn2Package.ASSIGNMENT__TO:
			return getTo() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl
