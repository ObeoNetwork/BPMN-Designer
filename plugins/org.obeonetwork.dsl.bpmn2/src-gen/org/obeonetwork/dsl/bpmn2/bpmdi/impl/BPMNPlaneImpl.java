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
package org.obeonetwork.dsl.bpmn2.bpmdi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNPlane;
import org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage;
import org.obeonetwork.dsl.dd.di.impl.PlaneImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNPlaneImpl#getBpmnElement <em>Bpmn Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMNPlaneImpl extends PlaneImpl implements BPMNPlane {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNPlaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnDiPackage.Literals.BPMN_PLANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getBpmnElement() {
		return (BaseElement) eDynamicGet(BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT,
				BpmnDiPackage.Literals.BPMN_PLANE__BPMN_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetBpmnElement() {
		return (BaseElement) eDynamicGet(BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT,
				BpmnDiPackage.Literals.BPMN_PLANE__BPMN_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmnElement(BaseElement newBpmnElement) {
		eDynamicSet(BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT, BpmnDiPackage.Literals.BPMN_PLANE__BPMN_ELEMENT,
				newBpmnElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT:
			if (resolve)
				return getBpmnElement();
			return basicGetBpmnElement();
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
		case BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT:
			setBpmnElement((BaseElement) newValue);
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
		case BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT:
			setBpmnElement((BaseElement) null);
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
		case BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT:
			return basicGetBpmnElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //BPMNPlaneImpl
