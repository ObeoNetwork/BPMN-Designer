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
import org.obeonetwork.dsl.bpmn2.Assignment;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.DataAssociation;
import org.obeonetwork.dsl.bpmn2.FormalExpression;
import org.obeonetwork.dsl.bpmn2.ItemAwareElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAssociationImpl extends BaseElementImpl implements
		DataAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.DATA_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression getTransformation() {
		return (FormalExpression) eDynamicGet(
				Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION,
				Bpmn2Package.Literals.DATA_ASSOCIATION__TRANSFORMATION, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(
			FormalExpression newTransformation, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTransformation,
				Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(FormalExpression newTransformation) {
		eDynamicSet(Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION,
				Bpmn2Package.Literals.DATA_ASSOCIATION__TRANSFORMATION,
				newTransformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Assignment> getAssignment() {
		return (EList<Assignment>) eDynamicGet(
				Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT,
				Bpmn2Package.Literals.DATA_ASSOCIATION__ASSIGNMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement getTargetRef() {
		return (ItemAwareElement) eDynamicGet(
				Bpmn2Package.DATA_ASSOCIATION__TARGET_REF,
				Bpmn2Package.Literals.DATA_ASSOCIATION__TARGET_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement basicGetTargetRef() {
		return (ItemAwareElement) eDynamicGet(
				Bpmn2Package.DATA_ASSOCIATION__TARGET_REF,
				Bpmn2Package.Literals.DATA_ASSOCIATION__TARGET_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(ItemAwareElement newTargetRef) {
		eDynamicSet(Bpmn2Package.DATA_ASSOCIATION__TARGET_REF,
				Bpmn2Package.Literals.DATA_ASSOCIATION__TARGET_REF,
				newTargetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ItemAwareElement> getSourceRef() {
		return (EList<ItemAwareElement>) eDynamicGet(
				Bpmn2Package.DATA_ASSOCIATION__SOURCE_REF,
				Bpmn2Package.Literals.DATA_ASSOCIATION__SOURCE_REF, true, true);
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
		case Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
		case Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT:
			return ((InternalEList<?>) getAssignment()).basicRemove(otherEnd,
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
		case Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION:
			return getTransformation();
		case Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT:
			return getAssignment();
		case Bpmn2Package.DATA_ASSOCIATION__TARGET_REF:
			if (resolve)
				return getTargetRef();
			return basicGetTargetRef();
		case Bpmn2Package.DATA_ASSOCIATION__SOURCE_REF:
			return getSourceRef();
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
		case Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION:
			setTransformation((FormalExpression) newValue);
			return;
		case Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT:
			getAssignment().clear();
			getAssignment().addAll((Collection<? extends Assignment>) newValue);
			return;
		case Bpmn2Package.DATA_ASSOCIATION__TARGET_REF:
			setTargetRef((ItemAwareElement) newValue);
			return;
		case Bpmn2Package.DATA_ASSOCIATION__SOURCE_REF:
			getSourceRef().clear();
			getSourceRef().addAll(
					(Collection<? extends ItemAwareElement>) newValue);
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
		case Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION:
			setTransformation((FormalExpression) null);
			return;
		case Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT:
			getAssignment().clear();
			return;
		case Bpmn2Package.DATA_ASSOCIATION__TARGET_REF:
			setTargetRef((ItemAwareElement) null);
			return;
		case Bpmn2Package.DATA_ASSOCIATION__SOURCE_REF:
			getSourceRef().clear();
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
		case Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION:
			return getTransformation() != null;
		case Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT:
			return !getAssignment().isEmpty();
		case Bpmn2Package.DATA_ASSOCIATION__TARGET_REF:
			return basicGetTargetRef() != null;
		case Bpmn2Package.DATA_ASSOCIATION__SOURCE_REF:
			return !getSourceRef().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataAssociationImpl
