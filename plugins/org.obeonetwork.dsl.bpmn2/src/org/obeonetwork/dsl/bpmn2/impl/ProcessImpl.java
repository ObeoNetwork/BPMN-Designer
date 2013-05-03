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

import org.obeonetwork.dsl.bpmn2.Artifact;
import org.obeonetwork.dsl.bpmn2.Auditing;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Collaboration;
import org.obeonetwork.dsl.bpmn2.CorrelationSubscription;
import org.obeonetwork.dsl.bpmn2.FlowElement;
import org.obeonetwork.dsl.bpmn2.FlowElementsContainer;
import org.obeonetwork.dsl.bpmn2.LaneSet;
import org.obeonetwork.dsl.bpmn2.Monitoring;
import org.obeonetwork.dsl.bpmn2.ProcessType;
import org.obeonetwork.dsl.bpmn2.Property;
import org.obeonetwork.dsl.bpmn2.ResourceRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getProcessType <em>Process Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#isIsExecutable <em>Is Executable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getCorrelationSubscriptions <em>Correlation Subscriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends CallableElementImpl implements
		org.obeonetwork.dsl.bpmn2.Process {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.PROCESS;
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
	public ProcessType getProcessType() {
		return (ProcessType) eGet(Bpmn2Package.Literals.PROCESS__PROCESS_TYPE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessType(ProcessType newProcessType) {
		eSet(Bpmn2Package.Literals.PROCESS__PROCESS_TYPE, newProcessType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsClosed() {
		return (Boolean) eGet(Bpmn2Package.Literals.PROCESS__IS_CLOSED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClosed(boolean newIsClosed) {
		eSet(Bpmn2Package.Literals.PROCESS__IS_CLOSED, newIsClosed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auditing getAuditing() {
		return (Auditing) eGet(Bpmn2Package.Literals.PROCESS__AUDITING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditing(Auditing newAuditing) {
		eSet(Bpmn2Package.Literals.PROCESS__AUDITING, newAuditing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring getMonitoring() {
		return (Monitoring) eGet(Bpmn2Package.Literals.PROCESS__MONITORING,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoring(Monitoring newMonitoring) {
		eSet(Bpmn2Package.Literals.PROCESS__MONITORING, newMonitoring);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getProperties() {
		return (EList<Property>) eGet(
				Bpmn2Package.Literals.PROCESS__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.bpmn2.Process> getSupports() {
		return (EList<org.obeonetwork.dsl.bpmn2.Process>) eGet(
				Bpmn2Package.Literals.PROCESS__SUPPORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getDefinitionalCollaborationRef() {
		return (Collaboration) eGet(
				Bpmn2Package.Literals.PROCESS__DEFINITIONAL_COLLABORATION_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionalCollaborationRef(
			Collaboration newDefinitionalCollaborationRef) {
		eSet(Bpmn2Package.Literals.PROCESS__DEFINITIONAL_COLLABORATION_REF,
				newDefinitionalCollaborationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExecutable() {
		return (Boolean) eGet(Bpmn2Package.Literals.PROCESS__IS_EXECUTABLE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExecutable(boolean newIsExecutable) {
		eSet(Bpmn2Package.Literals.PROCESS__IS_EXECUTABLE, newIsExecutable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResourceRole> getResources() {
		return (EList<ResourceRole>) eGet(
				Bpmn2Package.Literals.PROCESS__RESOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>) eGet(Bpmn2Package.Literals.PROCESS__ARTIFACTS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CorrelationSubscription> getCorrelationSubscriptions() {
		return (EList<CorrelationSubscription>) eGet(
				Bpmn2Package.Literals.PROCESS__CORRELATION_SUBSCRIPTIONS, true);
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
			case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
				return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
			case Bpmn2Package.PROCESS__LANE_SETS:
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
				return Bpmn2Package.PROCESS__FLOW_ELEMENTS;
			case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
				return Bpmn2Package.PROCESS__LANE_SETS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProcessImpl
