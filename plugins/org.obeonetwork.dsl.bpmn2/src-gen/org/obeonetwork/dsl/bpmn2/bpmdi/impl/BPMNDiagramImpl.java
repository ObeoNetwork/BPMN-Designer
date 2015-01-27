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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNDiagram;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabelStyle;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNPlane;
import org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage;
import org.obeonetwork.dsl.dd.di.impl.DiagramImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNDiagramImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNDiagramImpl#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNDiagramImpl extends DiagramImpl implements BPMNDiagram {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnDiPackage.Literals.BPMN_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNPlane getPlane() {
		return (BPMNPlane) eDynamicGet(BpmnDiPackage.BPMN_DIAGRAM__PLANE,
				BpmnDiPackage.Literals.BPMN_DIAGRAM__PLANE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlane(BPMNPlane newPlane,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newPlane,
				BpmnDiPackage.BPMN_DIAGRAM__PLANE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlane(BPMNPlane newPlane) {
		eDynamicSet(BpmnDiPackage.BPMN_DIAGRAM__PLANE,
				BpmnDiPackage.Literals.BPMN_DIAGRAM__PLANE, newPlane);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BPMNLabelStyle> getLabelStyle() {
		return (EList<BPMNLabelStyle>) eDynamicGet(
				BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE,
				BpmnDiPackage.Literals.BPMN_DIAGRAM__LABEL_STYLE, true, true);
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
		case BpmnDiPackage.BPMN_DIAGRAM__PLANE:
			return basicSetPlane(null, msgs);
		case BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE:
			return ((InternalEList<?>) getLabelStyle()).basicRemove(otherEnd,
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
		case BpmnDiPackage.BPMN_DIAGRAM__PLANE:
			return getPlane();
		case BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE:
			return getLabelStyle();
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
		case BpmnDiPackage.BPMN_DIAGRAM__PLANE:
			setPlane((BPMNPlane) newValue);
			return;
		case BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE:
			getLabelStyle().clear();
			getLabelStyle().addAll(
					(Collection<? extends BPMNLabelStyle>) newValue);
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
		case BpmnDiPackage.BPMN_DIAGRAM__PLANE:
			setPlane((BPMNPlane) null);
			return;
		case BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE:
			getLabelStyle().clear();
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
		case BpmnDiPackage.BPMN_DIAGRAM__PLANE:
			return getPlane() != null;
		case BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE:
			return !getLabelStyle().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BPMNDiagramImpl
