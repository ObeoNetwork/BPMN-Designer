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

import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.bpmn2.BPMN2ObjectImpl;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.InputOutputBinding;
import org.obeonetwork.dsl.bpmn2.InputSet;
import org.obeonetwork.dsl.bpmn2.Operation;
import org.obeonetwork.dsl.bpmn2.OutputSet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Input Output Binding</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputBindingImpl#getInputDataRef <em>Input Data Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputBindingImpl#getOutputDataRef <em>Output Data Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputBindingImpl#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputBindingImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputOutputBindingImpl extends BPMN2ObjectImpl implements InputOutputBinding {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected InputOutputBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.INPUT_OUTPUT_BINDING;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InputSet getInputDataRef() {
        return (InputSet) eDynamicGet(Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF, Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__INPUT_DATA_REF, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InputSet basicGetInputDataRef() {
        return (InputSet) eDynamicGet(Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF, Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__INPUT_DATA_REF, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputDataRef(InputSet newInputDataRef) {
        eDynamicSet(Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF, Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__INPUT_DATA_REF, newInputDataRef);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OutputSet getOutputDataRef() {
        return (OutputSet) eDynamicGet(Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public OutputSet basicGetOutputDataRef() {
        return (OutputSet) eDynamicGet(Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutputDataRef(OutputSet newOutputDataRef) {
        eDynamicSet(Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, newOutputDataRef);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Operation getOperationRef() {
        return (Operation) eDynamicGet(Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF, Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__OPERATION_REF, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Operation basicGetOperationRef() {
        return (Operation) eDynamicGet(Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF, Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__OPERATION_REF, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperationRef(Operation newOperationRef) {
        eDynamicSet(Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF, Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__OPERATION_REF, newOperationRef);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getId() {
        return (String) eDynamicGet(Bpmn2Package.INPUT_OUTPUT_BINDING__ID, Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__ID, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId(String newId) {
        eDynamicSet(Bpmn2Package.INPUT_OUTPUT_BINDING__ID, Bpmn2Package.Literals.INPUT_OUTPUT_BINDING__ID, newId);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
            if (resolve)
                return getInputDataRef();
            return basicGetInputDataRef();
        case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
            if (resolve)
                return getOutputDataRef();
            return basicGetOutputDataRef();
        case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
            if (resolve)
                return getOperationRef();
            return basicGetOperationRef();
        case Bpmn2Package.INPUT_OUTPUT_BINDING__ID:
            return getId();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
            setInputDataRef((InputSet) newValue);
            return;
        case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
            setOutputDataRef((OutputSet) newValue);
            return;
        case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
            setOperationRef((Operation) newValue);
            return;
        case Bpmn2Package.INPUT_OUTPUT_BINDING__ID:
            setId((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
            setInputDataRef((InputSet) null);
            return;
        case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
            setOutputDataRef((OutputSet) null);
            return;
        case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
            setOperationRef((Operation) null);
            return;
        case Bpmn2Package.INPUT_OUTPUT_BINDING__ID:
            setId(ID_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
            return basicGetInputDataRef() != null;
        case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
            return basicGetOutputDataRef() != null;
        case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
            return basicGetOperationRef() != null;
        case Bpmn2Package.INPUT_OUTPUT_BINDING__ID:
            return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
        }
        return super.eIsSet(featureID);
    }

} // InputOutputBindingImpl
