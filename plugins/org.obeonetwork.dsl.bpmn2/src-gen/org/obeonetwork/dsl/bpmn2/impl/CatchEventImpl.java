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
	 * The default value of the '{@link #isParallelMultiple() <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallelMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARALLEL_MULTIPLE_EDEFAULT = false;

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
		return (Boolean) eDynamicGet(
				Bpmn2Package.CATCH_EVENT__PARALLEL_MULTIPLE,
				Bpmn2Package.Literals.CATCH_EVENT__PARALLEL_MULTIPLE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelMultiple(boolean newParallelMultiple) {
		eDynamicSet(Bpmn2Package.CATCH_EVENT__PARALLEL_MULTIPLE,
				Bpmn2Package.Literals.CATCH_EVENT__PARALLEL_MULTIPLE,
				newParallelMultiple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet getOutputSet() {
		return (OutputSet) eDynamicGet(Bpmn2Package.CATCH_EVENT__OUTPUT_SET,
				Bpmn2Package.Literals.CATCH_EVENT__OUTPUT_SET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputSet(OutputSet newOutputSet,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newOutputSet,
				Bpmn2Package.CATCH_EVENT__OUTPUT_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputSet(OutputSet newOutputSet) {
		eDynamicSet(Bpmn2Package.CATCH_EVENT__OUTPUT_SET,
				Bpmn2Package.Literals.CATCH_EVENT__OUTPUT_SET, newOutputSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventDefinition> getEventDefinitionRefs() {
		return (EList<EventDefinition>) eDynamicGet(
				Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REFS,
				Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITION_REFS, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataOutputAssociation> getDataOutputAssociation() {
		return (EList<DataOutputAssociation>) eDynamicGet(
				Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION,
				Bpmn2Package.Literals.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataOutput> getDataOutputs() {
		return (EList<DataOutput>) eDynamicGet(
				Bpmn2Package.CATCH_EVENT__DATA_OUTPUTS,
				Bpmn2Package.Literals.CATCH_EVENT__DATA_OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventDefinition> getEventDefinitions() {
		return (EList<EventDefinition>) eDynamicGet(
				Bpmn2Package.CATCH_EVENT__EVENT_DEFINITIONS,
				Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS, true,
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
		case Bpmn2Package.CATCH_EVENT__OUTPUT_SET:
			return basicSetOutputSet(null, msgs);
		case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
			return ((InternalEList<?>) getDataOutputAssociation()).basicRemove(
					otherEnd, msgs);
		case Bpmn2Package.CATCH_EVENT__DATA_OUTPUTS:
			return ((InternalEList<?>) getDataOutputs()).basicRemove(otherEnd,
					msgs);
		case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITIONS:
			return ((InternalEList<?>) getEventDefinitions()).basicRemove(
					otherEnd, msgs);
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
		case Bpmn2Package.CATCH_EVENT__PARALLEL_MULTIPLE:
			return isParallelMultiple();
		case Bpmn2Package.CATCH_EVENT__OUTPUT_SET:
			return getOutputSet();
		case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REFS:
			return getEventDefinitionRefs();
		case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
			return getDataOutputAssociation();
		case Bpmn2Package.CATCH_EVENT__DATA_OUTPUTS:
			return getDataOutputs();
		case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITIONS:
			return getEventDefinitions();
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
		case Bpmn2Package.CATCH_EVENT__PARALLEL_MULTIPLE:
			setParallelMultiple((Boolean) newValue);
			return;
		case Bpmn2Package.CATCH_EVENT__OUTPUT_SET:
			setOutputSet((OutputSet) newValue);
			return;
		case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REFS:
			getEventDefinitionRefs().clear();
			getEventDefinitionRefs().addAll(
					(Collection<? extends EventDefinition>) newValue);
			return;
		case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
			getDataOutputAssociation().clear();
			getDataOutputAssociation().addAll(
					(Collection<? extends DataOutputAssociation>) newValue);
			return;
		case Bpmn2Package.CATCH_EVENT__DATA_OUTPUTS:
			getDataOutputs().clear();
			getDataOutputs()
					.addAll((Collection<? extends DataOutput>) newValue);
			return;
		case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITIONS:
			getEventDefinitions().clear();
			getEventDefinitions().addAll(
					(Collection<? extends EventDefinition>) newValue);
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
		case Bpmn2Package.CATCH_EVENT__PARALLEL_MULTIPLE:
			setParallelMultiple(PARALLEL_MULTIPLE_EDEFAULT);
			return;
		case Bpmn2Package.CATCH_EVENT__OUTPUT_SET:
			setOutputSet((OutputSet) null);
			return;
		case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REFS:
			getEventDefinitionRefs().clear();
			return;
		case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
			getDataOutputAssociation().clear();
			return;
		case Bpmn2Package.CATCH_EVENT__DATA_OUTPUTS:
			getDataOutputs().clear();
			return;
		case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITIONS:
			getEventDefinitions().clear();
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
		case Bpmn2Package.CATCH_EVENT__PARALLEL_MULTIPLE:
			return isParallelMultiple() != PARALLEL_MULTIPLE_EDEFAULT;
		case Bpmn2Package.CATCH_EVENT__OUTPUT_SET:
			return getOutputSet() != null;
		case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REFS:
			return !getEventDefinitionRefs().isEmpty();
		case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
			return !getDataOutputAssociation().isEmpty();
		case Bpmn2Package.CATCH_EVENT__DATA_OUTPUTS:
			return !getDataOutputs().isEmpty();
		case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITIONS:
			return !getEventDefinitions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CatchEventImpl
