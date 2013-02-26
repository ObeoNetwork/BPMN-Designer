/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.bpmn2.impl;

import java.util.Collection;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.FlowNode;
import org.eclipse.bpmn2.Lane;
import org.eclipse.bpmn2.SequenceFlow;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.FlowNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.FlowNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.FlowNodeImpl#getLanes <em>Lanes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowNodeImpl extends FlowElementImpl implements FlowNode {
    /**
     * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoing()
     * @generated
     * @ordered
     */
    protected EList<SequenceFlow> outgoing;

    /**
     * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncoming()
     * @generated
     * @ordered
     */
    protected EList<SequenceFlow> incoming;

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
    public EList<SequenceFlow> getOutgoing() {
        if (outgoing == null) {
            outgoing = new EObjectWithInverseResolvingEList<SequenceFlow>(SequenceFlow.class, this,
                    Bpmn2Package.FLOW_NODE__OUTGOING, Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF);
        }
        return outgoing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SequenceFlow> getIncoming() {
        if (incoming == null) {
            incoming = new EObjectWithInverseResolvingEList<SequenceFlow>(SequenceFlow.class, this,
                    Bpmn2Package.FLOW_NODE__INCOMING, Bpmn2Package.SEQUENCE_FLOW__TARGET_REF);
        }
        return incoming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Lane> getLanes() {
        // TODO: implement this method to return the 'Lanes' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
            NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.FLOW_NODE__OUTGOING:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing()).basicAdd(
                    otherEnd, msgs);
        case Bpmn2Package.FLOW_NODE__INCOMING:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncoming()).basicAdd(
                    otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
            NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.FLOW_NODE__OUTGOING:
            return ((InternalEList<?>) getOutgoing()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.FLOW_NODE__INCOMING:
            return ((InternalEList<?>) getIncoming()).basicRemove(otherEnd, msgs);
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
            return outgoing != null && !outgoing.isEmpty();
        case Bpmn2Package.FLOW_NODE__INCOMING:
            return incoming != null && !incoming.isEmpty();
        case Bpmn2Package.FLOW_NODE__LANES:
            return !getLanes().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //FlowNodeImpl
