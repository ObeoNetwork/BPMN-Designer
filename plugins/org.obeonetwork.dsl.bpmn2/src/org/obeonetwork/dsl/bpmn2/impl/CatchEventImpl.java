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
import org.obeonetwork.dsl.bpmn2.CatchEvent;
import org.obeonetwork.dsl.bpmn2.DataOutput;
import org.obeonetwork.dsl.bpmn2.DataOutputAssociation;
import org.obeonetwork.dsl.bpmn2.EventDefinition;
import org.obeonetwork.dsl.bpmn2.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CatchEventImpl#isParallelMultiple <em>Parallel Multiple</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CatchEventImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CatchEventImpl#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CatchEventImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CatchEventImpl#getDataOutputs <em>Data Outputs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CatchEventImpl#getEventDefinitions <em>Event Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CatchEventImpl extends EventImpl implements CatchEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.CATCH_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParallelMultiple() {
		return (Boolean) eGet(
				Bpmn2Package.Literals.CATCH_EVENT__PARALLEL_MULTIPLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelMultiple(boolean newParallelMultiple) {
		eSet(Bpmn2Package.Literals.CATCH_EVENT__PARALLEL_MULTIPLE,
				newParallelMultiple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet getOutputSet() {
		return (OutputSet) eGet(Bpmn2Package.Literals.CATCH_EVENT__OUTPUT_SET,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputSet(OutputSet newOutputSet) {
		eSet(Bpmn2Package.Literals.CATCH_EVENT__OUTPUT_SET, newOutputSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventDefinition> getEventDefinitionRefs() {
		return (EList<EventDefinition>) eGet(
				Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITION_REFS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataOutputAssociation> getDataOutputAssociation() {
		return (EList<DataOutputAssociation>) eGet(
				Bpmn2Package.Literals.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataOutput> getDataOutputs() {
		return (EList<DataOutput>) eGet(
				Bpmn2Package.Literals.CATCH_EVENT__DATA_OUTPUTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventDefinition> getEventDefinitions() {
		return (EList<EventDefinition>) eGet(
				Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS, true);
	}

} //CatchEventImpl
