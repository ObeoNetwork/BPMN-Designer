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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.FlowElement;
import org.obeonetwork.dsl.bpmn2.FlowElementsContainer;
import org.obeonetwork.dsl.bpmn2.LaneSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Elements Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementsContainerImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementsContainerImpl#getLaneSets <em>Lane Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowElementsContainerImpl extends BaseElementImpl
		implements FlowElementsContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowElementsContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FlowElement> getFlowElements() {
		return (EList<FlowElement>) eDynamicGet(
				Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
				Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LaneSet> getLaneSets() {
		return (EList<LaneSet>) eDynamicGet(
				Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS,
				Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__LANE_SETS, true,
				true);
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
		case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
			return ((InternalEList<?>) getFlowElements()).basicRemove(otherEnd,
					msgs);
		case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
			return ((InternalEList<?>) getLaneSets()).basicRemove(otherEnd,
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
		case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
			return getFlowElements();
		case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
			return getLaneSets();
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
		case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
			getFlowElements().clear();
			getFlowElements().addAll(
					(Collection<? extends FlowElement>) newValue);
			return;
		case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
			getLaneSets().clear();
			getLaneSets().addAll((Collection<? extends LaneSet>) newValue);
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
		case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
			getFlowElements().clear();
			return;
		case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
			getLaneSets().clear();
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
		case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
			return !getFlowElements().isEmpty();
		case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
			return !getLaneSets().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowElementsContainerImpl
