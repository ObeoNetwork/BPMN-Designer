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

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.DataInput;
import org.obeonetwork.dsl.bpmn2.DataInputAssociation;
import org.obeonetwork.dsl.bpmn2.EventDefinition;
import org.obeonetwork.dsl.bpmn2.InputSet;
import org.obeonetwork.dsl.bpmn2.ThrowEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throw Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl#getDataInputs <em>Data Inputs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl#getEventDefinitions <em>Event Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ThrowEventImpl extends EventImpl implements ThrowEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrowEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.THROW_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet getInputSet() {
		return (InputSet) eGet(Bpmn2Package.Literals.THROW_EVENT__INPUT_SET,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputSet(InputSet newInputSet) {
		eSet(Bpmn2Package.Literals.THROW_EVENT__INPUT_SET, newInputSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventDefinition> getEventDefinitionRefs() {
		return (EList<EventDefinition>) eGet(
				Bpmn2Package.Literals.THROW_EVENT__EVENT_DEFINITION_REFS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataInputAssociation> getDataInputAssociation() {
		return (EList<DataInputAssociation>) eGet(
				Bpmn2Package.Literals.THROW_EVENT__DATA_INPUT_ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataInput> getDataInputs() {
		return (EList<DataInput>) eGet(
				Bpmn2Package.Literals.THROW_EVENT__DATA_INPUTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventDefinition> getEventDefinitions() {
		return (EList<EventDefinition>) eGet(
				Bpmn2Package.Literals.THROW_EVENT__EVENT_DEFINITIONS, true);
	}

} //ThrowEventImpl
