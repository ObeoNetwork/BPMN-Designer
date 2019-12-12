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
import org.obeonetwork.dsl.bpmn2.Activity;
import org.obeonetwork.dsl.bpmn2.BoundaryEvent;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ConversationLink;
import org.obeonetwork.dsl.bpmn2.DataInputAssociation;
import org.obeonetwork.dsl.bpmn2.DataOutputAssociation;
import org.obeonetwork.dsl.bpmn2.InputOutputSpecification;
import org.obeonetwork.dsl.bpmn2.InteractionNode;
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
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
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
     * The default value of the '{@link #getStartQuantity() <em>Start Quantity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartQuantity()
     * @generated
     * @ordered
     */
    protected static final int START_QUANTITY_EDEFAULT = 1;

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
    @SuppressWarnings("unchecked")
    @Override
    public EList<ConversationLink> getIncomingConversationLinks() {
        return (EList<ConversationLink>) eDynamicGet(Bpmn2Package.ACTIVITY__INCOMING_CONVERSATION_LINKS, Bpmn2Package.Literals.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ConversationLink> getOutgoingConversationLinks() {
        return (EList<ConversationLink>) eDynamicGet(Bpmn2Package.ACTIVITY__OUTGOING_CONVERSATION_LINKS, Bpmn2Package.Literals.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsForCompensation() {
        return (Boolean) eDynamicGet(Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION, Bpmn2Package.Literals.ACTIVITY__IS_FOR_COMPENSATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsForCompensation(boolean newIsForCompensation) {
        eDynamicSet(Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION, Bpmn2Package.Literals.ACTIVITY__IS_FOR_COMPENSATION, newIsForCompensation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoopCharacteristics getLoopCharacteristics() {
        return (LoopCharacteristics) eDynamicGet(Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS, Bpmn2Package.Literals.ACTIVITY__LOOP_CHARACTERISTICS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopCharacteristics(LoopCharacteristics newLoopCharacteristics, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newLoopCharacteristics, Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoopCharacteristics(LoopCharacteristics newLoopCharacteristics) {
        eDynamicSet(Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS, Bpmn2Package.Literals.ACTIVITY__LOOP_CHARACTERISTICS, newLoopCharacteristics);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ResourceRole> getResources() {
        return (EList<ResourceRole>) eDynamicGet(Bpmn2Package.ACTIVITY__RESOURCES, Bpmn2Package.Literals.ACTIVITY__RESOURCES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SequenceFlow getDefault() {
        return (SequenceFlow) eDynamicGet(Bpmn2Package.ACTIVITY__DEFAULT, Bpmn2Package.Literals.ACTIVITY__DEFAULT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceFlow basicGetDefault() {
        return (SequenceFlow) eDynamicGet(Bpmn2Package.ACTIVITY__DEFAULT, Bpmn2Package.Literals.ACTIVITY__DEFAULT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDefault(SequenceFlow newDefault) {
        eDynamicSet(Bpmn2Package.ACTIVITY__DEFAULT, Bpmn2Package.Literals.ACTIVITY__DEFAULT, newDefault);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Property> getProperties() {
        return (EList<Property>) eDynamicGet(Bpmn2Package.ACTIVITY__PROPERTIES, Bpmn2Package.Literals.ACTIVITY__PROPERTIES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InputOutputSpecification getIoSpecification() {
        return (InputOutputSpecification) eDynamicGet(Bpmn2Package.ACTIVITY__IO_SPECIFICATION, Bpmn2Package.Literals.ACTIVITY__IO_SPECIFICATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIoSpecification(InputOutputSpecification newIoSpecification, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newIoSpecification, Bpmn2Package.ACTIVITY__IO_SPECIFICATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIoSpecification(InputOutputSpecification newIoSpecification) {
        eDynamicSet(Bpmn2Package.ACTIVITY__IO_SPECIFICATION, Bpmn2Package.Literals.ACTIVITY__IO_SPECIFICATION, newIoSpecification);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<BoundaryEvent> getBoundaryEventRefs() {
        return (EList<BoundaryEvent>) eDynamicGet(Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS, Bpmn2Package.Literals.ACTIVITY__BOUNDARY_EVENT_REFS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<DataInputAssociation> getDataInputAssociations() {
        return (EList<DataInputAssociation>) eDynamicGet(Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS, Bpmn2Package.Literals.ACTIVITY__DATA_INPUT_ASSOCIATIONS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<DataOutputAssociation> getDataOutputAssociations() {
        return (EList<DataOutputAssociation>) eDynamicGet(Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS, Bpmn2Package.Literals.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getStartQuantity() {
        return (Integer) eDynamicGet(Bpmn2Package.ACTIVITY__START_QUANTITY, Bpmn2Package.Literals.ACTIVITY__START_QUANTITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartQuantity(int newStartQuantity) {
        eDynamicSet(Bpmn2Package.ACTIVITY__START_QUANTITY, Bpmn2Package.Literals.ACTIVITY__START_QUANTITY, newStartQuantity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getCompletionQuantity() {
        return (Integer) eDynamicGet(Bpmn2Package.ACTIVITY__COMPLETION_QUANTITY, Bpmn2Package.Literals.ACTIVITY__COMPLETION_QUANTITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCompletionQuantity(int newCompletionQuantity) {
        eDynamicSet(Bpmn2Package.ACTIVITY__COMPLETION_QUANTITY, Bpmn2Package.Literals.ACTIVITY__COMPLETION_QUANTITY, newCompletionQuantity);
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
        case Bpmn2Package.ACTIVITY__INCOMING_CONVERSATION_LINKS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingConversationLinks()).basicAdd(otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__OUTGOING_CONVERSATION_LINKS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingConversationLinks()).basicAdd(otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getBoundaryEventRefs()).basicAdd(otherEnd, msgs);
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
        case Bpmn2Package.ACTIVITY__INCOMING_CONVERSATION_LINKS:
            return ((InternalEList<?>) getIncomingConversationLinks()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__OUTGOING_CONVERSATION_LINKS:
            return ((InternalEList<?>) getOutgoingConversationLinks()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
            return basicSetLoopCharacteristics(null, msgs);
        case Bpmn2Package.ACTIVITY__RESOURCES:
            return ((InternalEList<?>) getResources()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__PROPERTIES:
            return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
            return basicSetIoSpecification(null, msgs);
        case Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS:
            return ((InternalEList<?>) getBoundaryEventRefs()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
            return ((InternalEList<?>) getDataInputAssociations()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
            return ((InternalEList<?>) getDataOutputAssociations()).basicRemove(otherEnd, msgs);
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
        case Bpmn2Package.ACTIVITY__INCOMING_CONVERSATION_LINKS:
            return getIncomingConversationLinks();
        case Bpmn2Package.ACTIVITY__OUTGOING_CONVERSATION_LINKS:
            return getOutgoingConversationLinks();
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
            getResources().addAll((Collection<? extends ResourceRole>) newValue);
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
            getBoundaryEventRefs().addAll((Collection<? extends BoundaryEvent>) newValue);
            return;
        case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
            getDataInputAssociations().clear();
            getDataInputAssociations().addAll((Collection<? extends DataInputAssociation>) newValue);
            return;
        case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
            getDataOutputAssociations().clear();
            getDataOutputAssociations().addAll((Collection<? extends DataOutputAssociation>) newValue);
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
        case Bpmn2Package.ACTIVITY__INCOMING_CONVERSATION_LINKS:
            return !getIncomingConversationLinks().isEmpty();
        case Bpmn2Package.ACTIVITY__OUTGOING_CONVERSATION_LINKS:
            return !getOutgoingConversationLinks().isEmpty();
        case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION:
            return isIsForCompensation() != IS_FOR_COMPENSATION_EDEFAULT;
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
            return getLoopCharacteristics() != null;
        case Bpmn2Package.ACTIVITY__RESOURCES:
            return !getResources().isEmpty();
        case Bpmn2Package.ACTIVITY__DEFAULT:
            return basicGetDefault() != null;
        case Bpmn2Package.ACTIVITY__PROPERTIES:
            return !getProperties().isEmpty();
        case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
            return getIoSpecification() != null;
        case Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS:
            return !getBoundaryEventRefs().isEmpty();
        case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
            return !getDataInputAssociations().isEmpty();
        case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
            return !getDataOutputAssociations().isEmpty();
        case Bpmn2Package.ACTIVITY__START_QUANTITY:
            return getStartQuantity() != START_QUANTITY_EDEFAULT;
        case Bpmn2Package.ACTIVITY__COMPLETION_QUANTITY:
            return getCompletionQuantity() != COMPLETION_QUANTITY_EDEFAULT;
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
        if (baseClass == InteractionNode.class) {
            switch (derivedFeatureID) {
            case Bpmn2Package.ACTIVITY__INCOMING_CONVERSATION_LINKS:
                return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
            case Bpmn2Package.ACTIVITY__OUTGOING_CONVERSATION_LINKS:
                return Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
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
        if (baseClass == InteractionNode.class) {
            switch (baseFeatureID) {
            case Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS:
                return Bpmn2Package.ACTIVITY__INCOMING_CONVERSATION_LINKS;
            case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS:
                return Bpmn2Package.ACTIVITY__OUTGOING_CONVERSATION_LINKS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ActivityImpl
