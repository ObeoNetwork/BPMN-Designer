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
import org.obeonetwork.dsl.bpmn2.FlowNode;
import org.obeonetwork.dsl.bpmn2.Lane;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FlowNodeImpl#getLanes <em>Lanes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowNodeImpl extends FlowElementImpl implements FlowNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.FLOW_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SequenceFlow> getOutgoing() {
		return (EList<SequenceFlow>) eDynamicGet(
				Bpmn2Package.FLOW_NODE__OUTGOING,
				Bpmn2Package.Literals.FLOW_NODE__OUTGOING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SequenceFlow> getIncoming() {
		return (EList<SequenceFlow>) eDynamicGet(
				Bpmn2Package.FLOW_NODE__INCOMING,
				Bpmn2Package.Literals.FLOW_NODE__INCOMING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Lane> getLanes() {
		return (EList<Lane>) eDynamicGet(Bpmn2Package.FLOW_NODE__LANES,
				Bpmn2Package.Literals.FLOW_NODE__LANES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.FLOW_NODE__OUTGOING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing())
					.basicAdd(otherEnd, msgs);
		case Bpmn2Package.FLOW_NODE__INCOMING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncoming())
					.basicAdd(otherEnd, msgs);
		case Bpmn2Package.FLOW_NODE__LANES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLanes())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case Bpmn2Package.FLOW_NODE__OUTGOING:
			return ((InternalEList<?>) getOutgoing()).basicRemove(otherEnd,
					msgs);
		case Bpmn2Package.FLOW_NODE__INCOMING:
			return ((InternalEList<?>) getIncoming()).basicRemove(otherEnd,
					msgs);
		case Bpmn2Package.FLOW_NODE__LANES:
			return ((InternalEList<?>) getLanes()).basicRemove(otherEnd, msgs);
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
		case Bpmn2Package.FLOW_NODE__OUTGOING:
			return getOutgoing();
		case Bpmn2Package.FLOW_NODE__INCOMING:
			return getIncoming();
		case Bpmn2Package.FLOW_NODE__LANES:
			return getLanes();
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
		case Bpmn2Package.FLOW_NODE__OUTGOING:
			getOutgoing().clear();
			getOutgoing().addAll((Collection<? extends SequenceFlow>) newValue);
			return;
		case Bpmn2Package.FLOW_NODE__INCOMING:
			getIncoming().clear();
			getIncoming().addAll((Collection<? extends SequenceFlow>) newValue);
			return;
		case Bpmn2Package.FLOW_NODE__LANES:
			getLanes().clear();
			getLanes().addAll((Collection<? extends Lane>) newValue);
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
		case Bpmn2Package.FLOW_NODE__OUTGOING:
			getOutgoing().clear();
			return;
		case Bpmn2Package.FLOW_NODE__INCOMING:
			getIncoming().clear();
			return;
		case Bpmn2Package.FLOW_NODE__LANES:
			getLanes().clear();
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
		case Bpmn2Package.FLOW_NODE__OUTGOING:
			return !getOutgoing().isEmpty();
		case Bpmn2Package.FLOW_NODE__INCOMING:
			return !getIncoming().isEmpty();
		case Bpmn2Package.FLOW_NODE__LANES:
			return !getLanes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowNodeImpl
