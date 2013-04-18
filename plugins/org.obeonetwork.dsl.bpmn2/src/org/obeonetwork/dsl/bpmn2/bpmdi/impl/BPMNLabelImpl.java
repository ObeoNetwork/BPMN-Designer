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

import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabelStyle;
import org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage;

import org.obeonetwork.dsl.dd.di.impl.LabelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNLabelImpl#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNLabelImpl extends LabelImpl implements BPMNLabel {
	/**
	 * The cached value of the '{@link #getLabelStyle() <em>Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStyle()
	 * @generated
	 * @ordered
	 */
	protected BPMNLabelStyle labelStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnDiPackage.Literals.BPMN_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabelStyle getLabelStyle() {
		if (labelStyle != null && labelStyle.eIsProxy()) {
			InternalEObject oldLabelStyle = (InternalEObject) labelStyle;
			labelStyle = (BPMNLabelStyle) eResolveProxy(oldLabelStyle);
			if (labelStyle != oldLabelStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BpmnDiPackage.BPMN_LABEL__LABEL_STYLE,
							oldLabelStyle, labelStyle));
			}
		}
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabelStyle basicGetLabelStyle() {
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelStyle(BPMNLabelStyle newLabelStyle) {
		BPMNLabelStyle oldLabelStyle = labelStyle;
		labelStyle = newLabelStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BpmnDiPackage.BPMN_LABEL__LABEL_STYLE, oldLabelStyle,
					labelStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BpmnDiPackage.BPMN_LABEL__LABEL_STYLE:
			if (resolve)
				return getLabelStyle();
			return basicGetLabelStyle();
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
		case BpmnDiPackage.BPMN_LABEL__LABEL_STYLE:
			setLabelStyle((BPMNLabelStyle) newValue);
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
		case BpmnDiPackage.BPMN_LABEL__LABEL_STYLE:
			setLabelStyle((BPMNLabelStyle) null);
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
		case BpmnDiPackage.BPMN_LABEL__LABEL_STYLE:
			return labelStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //BPMNLabelImpl
