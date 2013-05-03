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
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.bpmn2.Artifact;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.FlowElement;
import org.obeonetwork.dsl.bpmn2.FlowElementsContainer;
import org.obeonetwork.dsl.bpmn2.LaneSet;
import org.obeonetwork.dsl.bpmn2.SubProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl#isTriggeredByEvent <em>Triggered By Event</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubProcessImpl extends ActivityImpl implements SubProcess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.SUB_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FlowElement> getFlowElements() {
		return (EList<FlowElement>) eGet(
				Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LaneSet> getLaneSets() {
		return (EList<LaneSet>) eGet(
				Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__LANE_SETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTriggeredByEvent() {
		return (Boolean) eGet(
				Bpmn2Package.Literals.SUB_PROCESS__TRIGGERED_BY_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeredByEvent(boolean newTriggeredByEvent) {
		eSet(Bpmn2Package.Literals.SUB_PROCESS__TRIGGERED_BY_EVENT,
				newTriggeredByEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>) eGet(
				Bpmn2Package.Literals.SUB_PROCESS__ARTIFACTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (derivedFeatureID) {
			case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS:
				return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
			case Bpmn2Package.SUB_PROCESS__LANE_SETS:
				return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (baseFeatureID) {
			case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
				return Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS;
			case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
				return Bpmn2Package.SUB_PROCESS__LANE_SETS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubProcessImpl
