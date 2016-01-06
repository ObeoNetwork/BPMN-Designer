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
 * </p>
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
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getDecomposedBy <em>Decomposed By</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl#getDecomposes <em>Decomposes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends CallableElementImpl implements org.obeonetwork.dsl.bpmn2.Process {
	/**
	 * The default value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessType PROCESS_TYPE_EDEFAULT = ProcessType.NONE;
	/**
	 * The default value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLOSED_EDEFAULT = false;
	/**
	 * The default value of the '{@link #isIsExecutable() <em>Is Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExecutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXECUTABLE_EDEFAULT = false;

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
		return (EList<FlowElement>) eDynamicGet(Bpmn2Package.PROCESS__FLOW_ELEMENTS,
				Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LaneSet> getLaneSets() {
		return (EList<LaneSet>) eDynamicGet(Bpmn2Package.PROCESS__LANE_SETS,
				Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__LANE_SETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType getProcessType() {
		return (ProcessType) eDynamicGet(Bpmn2Package.PROCESS__PROCESS_TYPE,
				Bpmn2Package.Literals.PROCESS__PROCESS_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessType(ProcessType newProcessType) {
		eDynamicSet(Bpmn2Package.PROCESS__PROCESS_TYPE, Bpmn2Package.Literals.PROCESS__PROCESS_TYPE, newProcessType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsClosed() {
		return (Boolean) eDynamicGet(Bpmn2Package.PROCESS__IS_CLOSED, Bpmn2Package.Literals.PROCESS__IS_CLOSED, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClosed(boolean newIsClosed) {
		eDynamicSet(Bpmn2Package.PROCESS__IS_CLOSED, Bpmn2Package.Literals.PROCESS__IS_CLOSED, newIsClosed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auditing getAuditing() {
		return (Auditing) eDynamicGet(Bpmn2Package.PROCESS__AUDITING, Bpmn2Package.Literals.PROCESS__AUDITING, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditing(Auditing newAuditing, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newAuditing, Bpmn2Package.PROCESS__AUDITING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditing(Auditing newAuditing) {
		eDynamicSet(Bpmn2Package.PROCESS__AUDITING, Bpmn2Package.Literals.PROCESS__AUDITING, newAuditing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring getMonitoring() {
		return (Monitoring) eDynamicGet(Bpmn2Package.PROCESS__MONITORING, Bpmn2Package.Literals.PROCESS__MONITORING,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoring(Monitoring newMonitoring, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newMonitoring, Bpmn2Package.PROCESS__MONITORING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoring(Monitoring newMonitoring) {
		eDynamicSet(Bpmn2Package.PROCESS__MONITORING, Bpmn2Package.Literals.PROCESS__MONITORING, newMonitoring);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getProperties() {
		return (EList<Property>) eDynamicGet(Bpmn2Package.PROCESS__PROPERTIES,
				Bpmn2Package.Literals.PROCESS__PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.bpmn2.Process> getSupports() {
		return (EList<org.obeonetwork.dsl.bpmn2.Process>) eDynamicGet(Bpmn2Package.PROCESS__SUPPORTS,
				Bpmn2Package.Literals.PROCESS__SUPPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getDefinitionalCollaborationRef() {
		return (Collaboration) eDynamicGet(Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF,
				Bpmn2Package.Literals.PROCESS__DEFINITIONAL_COLLABORATION_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration basicGetDefinitionalCollaborationRef() {
		return (Collaboration) eDynamicGet(Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF,
				Bpmn2Package.Literals.PROCESS__DEFINITIONAL_COLLABORATION_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionalCollaborationRef(Collaboration newDefinitionalCollaborationRef) {
		eDynamicSet(Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF,
				Bpmn2Package.Literals.PROCESS__DEFINITIONAL_COLLABORATION_REF, newDefinitionalCollaborationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExecutable() {
		return (Boolean) eDynamicGet(Bpmn2Package.PROCESS__IS_EXECUTABLE, Bpmn2Package.Literals.PROCESS__IS_EXECUTABLE,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExecutable(boolean newIsExecutable) {
		eDynamicSet(Bpmn2Package.PROCESS__IS_EXECUTABLE, Bpmn2Package.Literals.PROCESS__IS_EXECUTABLE, newIsExecutable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResourceRole> getResources() {
		return (EList<ResourceRole>) eDynamicGet(Bpmn2Package.PROCESS__RESOURCES,
				Bpmn2Package.Literals.PROCESS__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>) eDynamicGet(Bpmn2Package.PROCESS__ARTIFACTS, Bpmn2Package.Literals.PROCESS__ARTIFACTS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CorrelationSubscription> getCorrelationSubscriptions() {
		return (EList<CorrelationSubscription>) eDynamicGet(Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS,
				Bpmn2Package.Literals.PROCESS__CORRELATION_SUBSCRIPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.bpmn2.Process> getDecomposedBy() {
		return (EList<org.obeonetwork.dsl.bpmn2.Process>) eDynamicGet(Bpmn2Package.PROCESS__DECOMPOSED_BY,
				Bpmn2Package.Literals.PROCESS__DECOMPOSED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.bpmn2.Process getDecomposes() {
		return (org.obeonetwork.dsl.bpmn2.Process) eDynamicGet(Bpmn2Package.PROCESS__DECOMPOSES,
				Bpmn2Package.Literals.PROCESS__DECOMPOSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecomposes(org.obeonetwork.dsl.bpmn2.Process newDecomposes,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDecomposes, Bpmn2Package.PROCESS__DECOMPOSES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposes(org.obeonetwork.dsl.bpmn2.Process newDecomposes) {
		eDynamicSet(Bpmn2Package.PROCESS__DECOMPOSES, Bpmn2Package.Literals.PROCESS__DECOMPOSES, newDecomposes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.PROCESS__DECOMPOSED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDecomposedBy()).basicAdd(otherEnd, msgs);
		case Bpmn2Package.PROCESS__DECOMPOSES:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDecomposes((org.obeonetwork.dsl.bpmn2.Process) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
			return ((InternalEList<?>) getFlowElements()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.PROCESS__LANE_SETS:
			return ((InternalEList<?>) getLaneSets()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.PROCESS__AUDITING:
			return basicSetAuditing(null, msgs);
		case Bpmn2Package.PROCESS__MONITORING:
			return basicSetMonitoring(null, msgs);
		case Bpmn2Package.PROCESS__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.PROCESS__RESOURCES:
			return ((InternalEList<?>) getResources()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.PROCESS__ARTIFACTS:
			return ((InternalEList<?>) getArtifacts()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
			return ((InternalEList<?>) getCorrelationSubscriptions()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.PROCESS__DECOMPOSED_BY:
			return ((InternalEList<?>) getDecomposedBy()).basicRemove(otherEnd, msgs);
		case Bpmn2Package.PROCESS__DECOMPOSES:
			return basicSetDecomposes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case Bpmn2Package.PROCESS__DECOMPOSES:
			return eInternalContainer().eInverseRemove(this, Bpmn2Package.PROCESS__DECOMPOSED_BY,
					org.obeonetwork.dsl.bpmn2.Process.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
			return getFlowElements();
		case Bpmn2Package.PROCESS__LANE_SETS:
			return getLaneSets();
		case Bpmn2Package.PROCESS__PROCESS_TYPE:
			return getProcessType();
		case Bpmn2Package.PROCESS__IS_CLOSED:
			return isIsClosed();
		case Bpmn2Package.PROCESS__AUDITING:
			return getAuditing();
		case Bpmn2Package.PROCESS__MONITORING:
			return getMonitoring();
		case Bpmn2Package.PROCESS__PROPERTIES:
			return getProperties();
		case Bpmn2Package.PROCESS__SUPPORTS:
			return getSupports();
		case Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF:
			if (resolve)
				return getDefinitionalCollaborationRef();
			return basicGetDefinitionalCollaborationRef();
		case Bpmn2Package.PROCESS__IS_EXECUTABLE:
			return isIsExecutable();
		case Bpmn2Package.PROCESS__RESOURCES:
			return getResources();
		case Bpmn2Package.PROCESS__ARTIFACTS:
			return getArtifacts();
		case Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
			return getCorrelationSubscriptions();
		case Bpmn2Package.PROCESS__DECOMPOSED_BY:
			return getDecomposedBy();
		case Bpmn2Package.PROCESS__DECOMPOSES:
			return getDecomposes();
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
		case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
			getFlowElements().clear();
			getFlowElements().addAll((Collection<? extends FlowElement>) newValue);
			return;
		case Bpmn2Package.PROCESS__LANE_SETS:
			getLaneSets().clear();
			getLaneSets().addAll((Collection<? extends LaneSet>) newValue);
			return;
		case Bpmn2Package.PROCESS__PROCESS_TYPE:
			setProcessType((ProcessType) newValue);
			return;
		case Bpmn2Package.PROCESS__IS_CLOSED:
			setIsClosed((Boolean) newValue);
			return;
		case Bpmn2Package.PROCESS__AUDITING:
			setAuditing((Auditing) newValue);
			return;
		case Bpmn2Package.PROCESS__MONITORING:
			setMonitoring((Monitoring) newValue);
			return;
		case Bpmn2Package.PROCESS__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case Bpmn2Package.PROCESS__SUPPORTS:
			getSupports().clear();
			getSupports().addAll((Collection<? extends org.obeonetwork.dsl.bpmn2.Process>) newValue);
			return;
		case Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF:
			setDefinitionalCollaborationRef((Collaboration) newValue);
			return;
		case Bpmn2Package.PROCESS__IS_EXECUTABLE:
			setIsExecutable((Boolean) newValue);
			return;
		case Bpmn2Package.PROCESS__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection<? extends ResourceRole>) newValue);
			return;
		case Bpmn2Package.PROCESS__ARTIFACTS:
			getArtifacts().clear();
			getArtifacts().addAll((Collection<? extends Artifact>) newValue);
			return;
		case Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
			getCorrelationSubscriptions().clear();
			getCorrelationSubscriptions().addAll((Collection<? extends CorrelationSubscription>) newValue);
			return;
		case Bpmn2Package.PROCESS__DECOMPOSED_BY:
			getDecomposedBy().clear();
			getDecomposedBy().addAll((Collection<? extends org.obeonetwork.dsl.bpmn2.Process>) newValue);
			return;
		case Bpmn2Package.PROCESS__DECOMPOSES:
			setDecomposes((org.obeonetwork.dsl.bpmn2.Process) newValue);
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
		case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
			getFlowElements().clear();
			return;
		case Bpmn2Package.PROCESS__LANE_SETS:
			getLaneSets().clear();
			return;
		case Bpmn2Package.PROCESS__PROCESS_TYPE:
			setProcessType(PROCESS_TYPE_EDEFAULT);
			return;
		case Bpmn2Package.PROCESS__IS_CLOSED:
			setIsClosed(IS_CLOSED_EDEFAULT);
			return;
		case Bpmn2Package.PROCESS__AUDITING:
			setAuditing((Auditing) null);
			return;
		case Bpmn2Package.PROCESS__MONITORING:
			setMonitoring((Monitoring) null);
			return;
		case Bpmn2Package.PROCESS__PROPERTIES:
			getProperties().clear();
			return;
		case Bpmn2Package.PROCESS__SUPPORTS:
			getSupports().clear();
			return;
		case Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF:
			setDefinitionalCollaborationRef((Collaboration) null);
			return;
		case Bpmn2Package.PROCESS__IS_EXECUTABLE:
			setIsExecutable(IS_EXECUTABLE_EDEFAULT);
			return;
		case Bpmn2Package.PROCESS__RESOURCES:
			getResources().clear();
			return;
		case Bpmn2Package.PROCESS__ARTIFACTS:
			getArtifacts().clear();
			return;
		case Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
			getCorrelationSubscriptions().clear();
			return;
		case Bpmn2Package.PROCESS__DECOMPOSED_BY:
			getDecomposedBy().clear();
			return;
		case Bpmn2Package.PROCESS__DECOMPOSES:
			setDecomposes((org.obeonetwork.dsl.bpmn2.Process) null);
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
		case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
			return !getFlowElements().isEmpty();
		case Bpmn2Package.PROCESS__LANE_SETS:
			return !getLaneSets().isEmpty();
		case Bpmn2Package.PROCESS__PROCESS_TYPE:
			return getProcessType() != PROCESS_TYPE_EDEFAULT;
		case Bpmn2Package.PROCESS__IS_CLOSED:
			return isIsClosed() != IS_CLOSED_EDEFAULT;
		case Bpmn2Package.PROCESS__AUDITING:
			return getAuditing() != null;
		case Bpmn2Package.PROCESS__MONITORING:
			return getMonitoring() != null;
		case Bpmn2Package.PROCESS__PROPERTIES:
			return !getProperties().isEmpty();
		case Bpmn2Package.PROCESS__SUPPORTS:
			return !getSupports().isEmpty();
		case Bpmn2Package.PROCESS__DEFINITIONAL_COLLABORATION_REF:
			return basicGetDefinitionalCollaborationRef() != null;
		case Bpmn2Package.PROCESS__IS_EXECUTABLE:
			return isIsExecutable() != IS_EXECUTABLE_EDEFAULT;
		case Bpmn2Package.PROCESS__RESOURCES:
			return !getResources().isEmpty();
		case Bpmn2Package.PROCESS__ARTIFACTS:
			return !getArtifacts().isEmpty();
		case Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
			return !getCorrelationSubscriptions().isEmpty();
		case Bpmn2Package.PROCESS__DECOMPOSED_BY:
			return !getDecomposedBy().isEmpty();
		case Bpmn2Package.PROCESS__DECOMPOSES:
			return getDecomposes() != null;
		}
		return super.eIsSet(featureID);
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
