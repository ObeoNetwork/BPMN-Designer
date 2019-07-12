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
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl#getDataInputs <em>Data Inputs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl#getEventDefinitions <em>Event Definitions</em>}</li>
 * </ul>
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
    @Override
    public InputSet getInputSet() {
        return (InputSet) eDynamicGet(Bpmn2Package.THROW_EVENT__INPUT_SET, Bpmn2Package.Literals.THROW_EVENT__INPUT_SET, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputSet(InputSet newInputSet, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newInputSet, Bpmn2Package.THROW_EVENT__INPUT_SET, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputSet(InputSet newInputSet) {
        eDynamicSet(Bpmn2Package.THROW_EVENT__INPUT_SET, Bpmn2Package.Literals.THROW_EVENT__INPUT_SET, newInputSet);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<EventDefinition> getEventDefinitionRefs() {
        return (EList<EventDefinition>) eDynamicGet(Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REFS, Bpmn2Package.Literals.THROW_EVENT__EVENT_DEFINITION_REFS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<DataInputAssociation> getDataInputAssociation() {
        return (EList<DataInputAssociation>) eDynamicGet(Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION, Bpmn2Package.Literals.THROW_EVENT__DATA_INPUT_ASSOCIATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<DataInput> getDataInputs() {
        return (EList<DataInput>) eDynamicGet(Bpmn2Package.THROW_EVENT__DATA_INPUTS, Bpmn2Package.Literals.THROW_EVENT__DATA_INPUTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<EventDefinition> getEventDefinitions() {
        return (EList<EventDefinition>) eDynamicGet(Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS, Bpmn2Package.Literals.THROW_EVENT__EVENT_DEFINITIONS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.THROW_EVENT__INPUT_SET:
            return basicSetInputSet(null, msgs);
        case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            return ((InternalEList<?>) getDataInputAssociation()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.THROW_EVENT__DATA_INPUTS:
            return ((InternalEList<?>) getDataInputs()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS:
            return ((InternalEList<?>) getEventDefinitions()).basicRemove(otherEnd, msgs);
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
        case Bpmn2Package.THROW_EVENT__INPUT_SET:
            return getInputSet();
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REFS:
            return getEventDefinitionRefs();
        case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            return getDataInputAssociation();
        case Bpmn2Package.THROW_EVENT__DATA_INPUTS:
            return getDataInputs();
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS:
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
        case Bpmn2Package.THROW_EVENT__INPUT_SET:
            setInputSet((InputSet) newValue);
            return;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REFS:
            getEventDefinitionRefs().clear();
            getEventDefinitionRefs().addAll((Collection<? extends EventDefinition>) newValue);
            return;
        case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            getDataInputAssociation().clear();
            getDataInputAssociation().addAll((Collection<? extends DataInputAssociation>) newValue);
            return;
        case Bpmn2Package.THROW_EVENT__DATA_INPUTS:
            getDataInputs().clear();
            getDataInputs().addAll((Collection<? extends DataInput>) newValue);
            return;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS:
            getEventDefinitions().clear();
            getEventDefinitions().addAll((Collection<? extends EventDefinition>) newValue);
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
        case Bpmn2Package.THROW_EVENT__INPUT_SET:
            setInputSet((InputSet) null);
            return;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REFS:
            getEventDefinitionRefs().clear();
            return;
        case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            getDataInputAssociation().clear();
            return;
        case Bpmn2Package.THROW_EVENT__DATA_INPUTS:
            getDataInputs().clear();
            return;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS:
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
        case Bpmn2Package.THROW_EVENT__INPUT_SET:
            return getInputSet() != null;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REFS:
            return !getEventDefinitionRefs().isEmpty();
        case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            return !getDataInputAssociation().isEmpty();
        case Bpmn2Package.THROW_EVENT__DATA_INPUTS:
            return !getDataInputs().isEmpty();
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS:
            return !getEventDefinitions().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ThrowEventImpl
