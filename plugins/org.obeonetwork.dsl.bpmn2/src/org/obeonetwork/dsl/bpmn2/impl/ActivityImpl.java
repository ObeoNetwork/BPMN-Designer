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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.bpmn2.Activity;
import org.obeonetwork.dsl.bpmn2.BoundaryEvent;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.DataInputAssociation;
import org.obeonetwork.dsl.bpmn2.DataOutputAssociation;
import org.obeonetwork.dsl.bpmn2.InputOutputSpecification;
import org.obeonetwork.dsl.bpmn2.LoopCharacteristics;
import org.obeonetwork.dsl.bpmn2.Property;
import org.obeonetwork.dsl.bpmn2.ResourceRole;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#isIsForCompensation <em>Is For Compensation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getBoundaryEventRefs <em>Boundary Event Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getDataInputAssociations <em>Data Input Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getDataOutputAssociations <em>Data Output Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getStartQuantity <em>Start Quantity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getCompletionQuantity <em>Completion Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityImpl extends FlowNodeImpl implements Activity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForCompensation() {
		return (Boolean) eGet(
				Bpmn2Package.Literals.ACTIVITY__IS_FOR_COMPENSATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForCompensation(boolean newIsForCompensation) {
		eSet(Bpmn2Package.Literals.ACTIVITY__IS_FOR_COMPENSATION,
				newIsForCompensation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopCharacteristics getLoopCharacteristics() {
		return (LoopCharacteristics) eGet(
				Bpmn2Package.Literals.ACTIVITY__LOOP_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCharacteristics(
			LoopCharacteristics newLoopCharacteristics) {
		eSet(Bpmn2Package.Literals.ACTIVITY__LOOP_CHARACTERISTICS,
				newLoopCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResourceRole> getResources() {
		return (EList<ResourceRole>) eGet(
				Bpmn2Package.Literals.ACTIVITY__RESOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow getDefault() {
		return (SequenceFlow) eGet(Bpmn2Package.Literals.ACTIVITY__DEFAULT,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(SequenceFlow newDefault) {
		eSet(Bpmn2Package.Literals.ACTIVITY__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getProperties() {
		return (EList<Property>) eGet(
				Bpmn2Package.Literals.ACTIVITY__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecification getIoSpecification() {
		return (InputOutputSpecification) eGet(
				Bpmn2Package.Literals.ACTIVITY__IO_SPECIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoSpecification(InputOutputSpecification newIoSpecification) {
		eSet(Bpmn2Package.Literals.ACTIVITY__IO_SPECIFICATION,
				newIoSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BoundaryEvent> getBoundaryEventRefs() {
		return (EList<BoundaryEvent>) eGet(
				Bpmn2Package.Literals.ACTIVITY__BOUNDARY_EVENT_REFS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataInputAssociation> getDataInputAssociations() {
		return (EList<DataInputAssociation>) eGet(
				Bpmn2Package.Literals.ACTIVITY__DATA_INPUT_ASSOCIATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataOutputAssociation> getDataOutputAssociations() {
		return (EList<DataOutputAssociation>) eGet(
				Bpmn2Package.Literals.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartQuantity() {
		return (Integer) eGet(Bpmn2Package.Literals.ACTIVITY__START_QUANTITY,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartQuantity(int newStartQuantity) {
		eSet(Bpmn2Package.Literals.ACTIVITY__START_QUANTITY, newStartQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCompletionQuantity() {
		return (Integer) eGet(
				Bpmn2Package.Literals.ACTIVITY__COMPLETION_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionQuantity(int newCompletionQuantity) {
		eSet(Bpmn2Package.Literals.ACTIVITY__COMPLETION_QUANTITY,
				newCompletionQuantity);
	}

} //ActivityImpl
