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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.FlowNode;
import org.obeonetwork.dsl.bpmn2.Lane;
import org.obeonetwork.dsl.bpmn2.LaneSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.LaneImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.LaneImpl#getChildLaneSet <em>Child Lane Set</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.LaneImpl#getPartitionElementRef <em>Partition Element Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.LaneImpl#getFlowNodeRefs <em>Flow Node Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.LaneImpl#getPartitionElement <em>Partition Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaneImpl extends BaseElementImpl implements Lane {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.LANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(Bpmn2Package.LANE__NAME,
				Bpmn2Package.Literals.LANE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.LANE__NAME, Bpmn2Package.Literals.LANE__NAME,
				newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet getChildLaneSet() {
		return (LaneSet) eDynamicGet(Bpmn2Package.LANE__CHILD_LANE_SET,
				Bpmn2Package.Literals.LANE__CHILD_LANE_SET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildLaneSet(LaneSet newChildLaneSet,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newChildLaneSet,
				Bpmn2Package.LANE__CHILD_LANE_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildLaneSet(LaneSet newChildLaneSet) {
		eDynamicSet(Bpmn2Package.LANE__CHILD_LANE_SET,
				Bpmn2Package.Literals.LANE__CHILD_LANE_SET, newChildLaneSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getPartitionElementRef() {
		return (BaseElement) eDynamicGet(
				Bpmn2Package.LANE__PARTITION_ELEMENT_REF,
				Bpmn2Package.Literals.LANE__PARTITION_ELEMENT_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetPartitionElementRef() {
		return (BaseElement) eDynamicGet(
				Bpmn2Package.LANE__PARTITION_ELEMENT_REF,
				Bpmn2Package.Literals.LANE__PARTITION_ELEMENT_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionElementRef(BaseElement newPartitionElementRef) {
		eDynamicSet(Bpmn2Package.LANE__PARTITION_ELEMENT_REF,
				Bpmn2Package.Literals.LANE__PARTITION_ELEMENT_REF,
				newPartitionElementRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FlowNode> getFlowNodeRefs() {
		return (EList<FlowNode>) eDynamicGet(Bpmn2Package.LANE__FLOW_NODE_REFS,
				Bpmn2Package.Literals.LANE__FLOW_NODE_REFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getPartitionElement() {
		return (BaseElement) eDynamicGet(Bpmn2Package.LANE__PARTITION_ELEMENT,
				Bpmn2Package.Literals.LANE__PARTITION_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionElement(
			BaseElement newPartitionElement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newPartitionElement,
				Bpmn2Package.LANE__PARTITION_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionElement(BaseElement newPartitionElement) {
		eDynamicSet(Bpmn2Package.LANE__PARTITION_ELEMENT,
				Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
				newPartitionElement);
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
		case Bpmn2Package.LANE__FLOW_NODE_REFS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFlowNodeRefs())
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
		case Bpmn2Package.LANE__CHILD_LANE_SET:
			return basicSetChildLaneSet(null, msgs);
		case Bpmn2Package.LANE__FLOW_NODE_REFS:
			return ((InternalEList<?>) getFlowNodeRefs()).basicRemove(otherEnd,
					msgs);
		case Bpmn2Package.LANE__PARTITION_ELEMENT:
			return basicSetPartitionElement(null, msgs);
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
		case Bpmn2Package.LANE__NAME:
			return getName();
		case Bpmn2Package.LANE__CHILD_LANE_SET:
			return getChildLaneSet();
		case Bpmn2Package.LANE__PARTITION_ELEMENT_REF:
			if (resolve)
				return getPartitionElementRef();
			return basicGetPartitionElementRef();
		case Bpmn2Package.LANE__FLOW_NODE_REFS:
			return getFlowNodeRefs();
		case Bpmn2Package.LANE__PARTITION_ELEMENT:
			return getPartitionElement();
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
		case Bpmn2Package.LANE__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.LANE__CHILD_LANE_SET:
			setChildLaneSet((LaneSet) newValue);
			return;
		case Bpmn2Package.LANE__PARTITION_ELEMENT_REF:
			setPartitionElementRef((BaseElement) newValue);
			return;
		case Bpmn2Package.LANE__FLOW_NODE_REFS:
			getFlowNodeRefs().clear();
			getFlowNodeRefs().addAll((Collection<? extends FlowNode>) newValue);
			return;
		case Bpmn2Package.LANE__PARTITION_ELEMENT:
			setPartitionElement((BaseElement) newValue);
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
		case Bpmn2Package.LANE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.LANE__CHILD_LANE_SET:
			setChildLaneSet((LaneSet) null);
			return;
		case Bpmn2Package.LANE__PARTITION_ELEMENT_REF:
			setPartitionElementRef((BaseElement) null);
			return;
		case Bpmn2Package.LANE__FLOW_NODE_REFS:
			getFlowNodeRefs().clear();
			return;
		case Bpmn2Package.LANE__PARTITION_ELEMENT:
			setPartitionElement((BaseElement) null);
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
		case Bpmn2Package.LANE__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT
					.equals(getName());
		case Bpmn2Package.LANE__CHILD_LANE_SET:
			return getChildLaneSet() != null;
		case Bpmn2Package.LANE__PARTITION_ELEMENT_REF:
			return basicGetPartitionElementRef() != null;
		case Bpmn2Package.LANE__FLOW_NODE_REFS:
			return !getFlowNodeRefs().isEmpty();
		case Bpmn2Package.LANE__PARTITION_ELEMENT:
			return getPartitionElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //LaneImpl
