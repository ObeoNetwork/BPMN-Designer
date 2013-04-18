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
	 * The default value of the '{@link #isIsForCompensation() <em>Is For Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForCompensation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FOR_COMPENSATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForCompensation() <em>Is For Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForCompensation()
	 * @generated
	 * @ordered
	 */
	protected boolean isForCompensation = IS_FOR_COMPENSATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoopCharacteristics() <em>Loop Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected LoopCharacteristics loopCharacteristics;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRole> resources;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected SequenceFlow default_;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getIoSpecification() <em>Io Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoSpecification()
	 * @generated
	 * @ordered
	 */
	protected InputOutputSpecification ioSpecification;

	/**
	 * The cached value of the '{@link #getBoundaryEventRefs() <em>Boundary Event Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryEventRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundaryEvent> boundaryEventRefs;

	/**
	 * The cached value of the '{@link #getDataInputAssociations() <em>Data Input Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInputAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<DataInputAssociation> dataInputAssociations;

	/**
	 * The cached value of the '{@link #getDataOutputAssociations() <em>Data Output Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOutputAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<DataOutputAssociation> dataOutputAssociations;

	/**
	 * The default value of the '{@link #getStartQuantity() <em>Start Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int START_QUANTITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getStartQuantity() <em>Start Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartQuantity()
	 * @generated
	 * @ordered
	 */
	protected int startQuantity = START_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionQuantity() <em>Completion Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLETION_QUANTITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCompletionQuantity() <em>Completion Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionQuantity()
	 * @generated
	 * @ordered
	 */
	protected int completionQuantity = COMPLETION_QUANTITY_EDEFAULT;

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
		return isForCompensation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForCompensation(boolean newIsForCompensation) {
		boolean oldIsForCompensation = isForCompensation;
		isForCompensation = newIsForCompensation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION,
					oldIsForCompensation, isForCompensation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopCharacteristics getLoopCharacteristics() {
		return loopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCharacteristics(
			LoopCharacteristics newLoopCharacteristics, NotificationChain msgs) {
		LoopCharacteristics oldLoopCharacteristics = loopCharacteristics;
		loopCharacteristics = newLoopCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS,
					oldLoopCharacteristics, newLoopCharacteristics);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCharacteristics(
			LoopCharacteristics newLoopCharacteristics) {
		if (newLoopCharacteristics != loopCharacteristics) {
			NotificationChain msgs = null;
			if (loopCharacteristics != null)
				msgs = ((InternalEObject) loopCharacteristics).eInverseRemove(
						this, EOPPOSITE_FEATURE_BASE
								- Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS,
						null, msgs);
			if (newLoopCharacteristics != null)
				msgs = ((InternalEObject) newLoopCharacteristics).eInverseAdd(
						this, EOPPOSITE_FEATURE_BASE
								- Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS,
						null, msgs);
			msgs = basicSetLoopCharacteristics(newLoopCharacteristics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS,
					newLoopCharacteristics, newLoopCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRole> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<ResourceRole>(
					ResourceRole.class, this, Bpmn2Package.ACTIVITY__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject) default_;
			default_ = (SequenceFlow) eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Bpmn2Package.ACTIVITY__DEFAULT, oldDefault,
							default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow basicGetDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(SequenceFlow newDefault) {
		SequenceFlow oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.ACTIVITY__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class,
					this, Bpmn2Package.ACTIVITY__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecification getIoSpecification() {
		return ioSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoSpecification(
			InputOutputSpecification newIoSpecification, NotificationChain msgs) {
		InputOutputSpecification oldIoSpecification = ioSpecification;
		ioSpecification = newIoSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, Bpmn2Package.ACTIVITY__IO_SPECIFICATION,
					oldIoSpecification, newIoSpecification);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoSpecification(InputOutputSpecification newIoSpecification) {
		if (newIoSpecification != ioSpecification) {
			NotificationChain msgs = null;
			if (ioSpecification != null)
				msgs = ((InternalEObject) ioSpecification).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Bpmn2Package.ACTIVITY__IO_SPECIFICATION,
						null, msgs);
			if (newIoSpecification != null)
				msgs = ((InternalEObject) newIoSpecification).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Bpmn2Package.ACTIVITY__IO_SPECIFICATION,
						null, msgs);
			msgs = basicSetIoSpecification(newIoSpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.ACTIVITY__IO_SPECIFICATION,
					newIoSpecification, newIoSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundaryEvent> getBoundaryEventRefs() {
		if (boundaryEventRefs == null) {
			boundaryEventRefs = new EObjectWithInverseResolvingEList<BoundaryEvent>(
					BoundaryEvent.class, this,
					Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS,
					Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF);
		}
		return boundaryEventRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataInputAssociation> getDataInputAssociations() {
		if (dataInputAssociations == null) {
			dataInputAssociations = new EObjectContainmentEList<DataInputAssociation>(
					DataInputAssociation.class, this,
					Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS);
		}
		return dataInputAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataOutputAssociation> getDataOutputAssociations() {
		if (dataOutputAssociations == null) {
			dataOutputAssociations = new EObjectContainmentEList<DataOutputAssociation>(
					DataOutputAssociation.class, this,
					Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS);
		}
		return dataOutputAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartQuantity() {
		return startQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartQuantity(int newStartQuantity) {
		int oldStartQuantity = startQuantity;
		startQuantity = newStartQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.ACTIVITY__START_QUANTITY, oldStartQuantity,
					startQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCompletionQuantity() {
		return completionQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionQuantity(int newCompletionQuantity) {
		int oldCompletionQuantity = completionQuantity;
		completionQuantity = newCompletionQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.ACTIVITY__COMPLETION_QUANTITY,
					oldCompletionQuantity, completionQuantity));
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
		case Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBoundaryEventRefs())
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
		case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
			return basicSetLoopCharacteristics(null, msgs);
		case Bpmn2Package.ACTIVITY__RESOURCES:
			return ((InternalEList<?>) getResources()).basicRemove(otherEnd,
					msgs);
		case Bpmn2Package.ACTIVITY__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd,
					msgs);
		case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
			return basicSetIoSpecification(null, msgs);
		case Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS:
			return ((InternalEList<?>) getBoundaryEventRefs()).basicRemove(
					otherEnd, msgs);
		case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
			return ((InternalEList<?>) getDataInputAssociations()).basicRemove(
					otherEnd, msgs);
		case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
			return ((InternalEList<?>) getDataOutputAssociations())
					.basicRemove(otherEnd, msgs);
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
		case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION:
			return isIsForCompensation();
		case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
			return getLoopCharacteristics();
		case Bpmn2Package.ACTIVITY__RESOURCES:
			return getResources();
		case Bpmn2Package.ACTIVITY__DEFAULT:
			if (resolve)
				return getDefault();
			return basicGetDefault();
		case Bpmn2Package.ACTIVITY__PROPERTIES:
			return getProperties();
		case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
			return getIoSpecification();
		case Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS:
			return getBoundaryEventRefs();
		case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
			return getDataInputAssociations();
		case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
			return getDataOutputAssociations();
		case Bpmn2Package.ACTIVITY__START_QUANTITY:
			return getStartQuantity();
		case Bpmn2Package.ACTIVITY__COMPLETION_QUANTITY:
			return getCompletionQuantity();
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
		case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION:
			setIsForCompensation((Boolean) newValue);
			return;
		case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
			setLoopCharacteristics((LoopCharacteristics) newValue);
			return;
		case Bpmn2Package.ACTIVITY__RESOURCES:
			getResources().clear();
			getResources()
					.addAll((Collection<? extends ResourceRole>) newValue);
			return;
		case Bpmn2Package.ACTIVITY__DEFAULT:
			setDefault((SequenceFlow) newValue);
			return;
		case Bpmn2Package.ACTIVITY__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
			setIoSpecification((InputOutputSpecification) newValue);
			return;
		case Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS:
			getBoundaryEventRefs().clear();
			getBoundaryEventRefs().addAll(
					(Collection<? extends BoundaryEvent>) newValue);
			return;
		case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
			getDataInputAssociations().clear();
			getDataInputAssociations().addAll(
					(Collection<? extends DataInputAssociation>) newValue);
			return;
		case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
			getDataOutputAssociations().clear();
			getDataOutputAssociations().addAll(
					(Collection<? extends DataOutputAssociation>) newValue);
			return;
		case Bpmn2Package.ACTIVITY__START_QUANTITY:
			setStartQuantity((Integer) newValue);
			return;
		case Bpmn2Package.ACTIVITY__COMPLETION_QUANTITY:
			setCompletionQuantity((Integer) newValue);
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
		case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION:
			setIsForCompensation(IS_FOR_COMPENSATION_EDEFAULT);
			return;
		case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
			setLoopCharacteristics((LoopCharacteristics) null);
			return;
		case Bpmn2Package.ACTIVITY__RESOURCES:
			getResources().clear();
			return;
		case Bpmn2Package.ACTIVITY__DEFAULT:
			setDefault((SequenceFlow) null);
			return;
		case Bpmn2Package.ACTIVITY__PROPERTIES:
			getProperties().clear();
			return;
		case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
			setIoSpecification((InputOutputSpecification) null);
			return;
		case Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS:
			getBoundaryEventRefs().clear();
			return;
		case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
			getDataInputAssociations().clear();
			return;
		case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
			getDataOutputAssociations().clear();
			return;
		case Bpmn2Package.ACTIVITY__START_QUANTITY:
			setStartQuantity(START_QUANTITY_EDEFAULT);
			return;
		case Bpmn2Package.ACTIVITY__COMPLETION_QUANTITY:
			setCompletionQuantity(COMPLETION_QUANTITY_EDEFAULT);
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
		case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION:
			return isForCompensation != IS_FOR_COMPENSATION_EDEFAULT;
		case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
			return loopCharacteristics != null;
		case Bpmn2Package.ACTIVITY__RESOURCES:
			return resources != null && !resources.isEmpty();
		case Bpmn2Package.ACTIVITY__DEFAULT:
			return default_ != null;
		case Bpmn2Package.ACTIVITY__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
			return ioSpecification != null;
		case Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS:
			return boundaryEventRefs != null && !boundaryEventRefs.isEmpty();
		case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
			return dataInputAssociations != null
					&& !dataInputAssociations.isEmpty();
		case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
			return dataOutputAssociations != null
					&& !dataOutputAssociations.isEmpty();
		case Bpmn2Package.ACTIVITY__START_QUANTITY:
			return startQuantity != START_QUANTITY_EDEFAULT;
		case Bpmn2Package.ACTIVITY__COMPLETION_QUANTITY:
			return completionQuantity != COMPLETION_QUANTITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isForCompensation: ");
		result.append(isForCompensation);
		result.append(", startQuantity: ");
		result.append(startQuantity);
		result.append(", completionQuantity: ");
		result.append(completionQuantity);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
