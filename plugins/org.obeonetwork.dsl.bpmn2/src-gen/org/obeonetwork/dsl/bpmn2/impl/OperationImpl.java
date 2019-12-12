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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Message;
import org.obeonetwork.dsl.bpmn2.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl#getInMessageRef <em>In Message Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl#getOutMessageRef <em>Out Message Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl#getErrorRefs <em>Error Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl#getImplementationRef <em>Implementation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends BaseElementImpl implements Operation {
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
    protected OperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.OPERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return (String) eDynamicGet(Bpmn2Package.OPERATION__NAME, Bpmn2Package.Literals.OPERATION__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        eDynamicSet(Bpmn2Package.OPERATION__NAME, Bpmn2Package.Literals.OPERATION__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Message getInMessageRef() {
        return (Message) eDynamicGet(Bpmn2Package.OPERATION__IN_MESSAGE_REF, Bpmn2Package.Literals.OPERATION__IN_MESSAGE_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Message basicGetInMessageRef() {
        return (Message) eDynamicGet(Bpmn2Package.OPERATION__IN_MESSAGE_REF, Bpmn2Package.Literals.OPERATION__IN_MESSAGE_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInMessageRef(Message newInMessageRef) {
        eDynamicSet(Bpmn2Package.OPERATION__IN_MESSAGE_REF, Bpmn2Package.Literals.OPERATION__IN_MESSAGE_REF, newInMessageRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Message getOutMessageRef() {
        return (Message) eDynamicGet(Bpmn2Package.OPERATION__OUT_MESSAGE_REF, Bpmn2Package.Literals.OPERATION__OUT_MESSAGE_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Message basicGetOutMessageRef() {
        return (Message) eDynamicGet(Bpmn2Package.OPERATION__OUT_MESSAGE_REF, Bpmn2Package.Literals.OPERATION__OUT_MESSAGE_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutMessageRef(Message newOutMessageRef) {
        eDynamicSet(Bpmn2Package.OPERATION__OUT_MESSAGE_REF, Bpmn2Package.Literals.OPERATION__OUT_MESSAGE_REF, newOutMessageRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<org.obeonetwork.dsl.bpmn2.Error> getErrorRefs() {
        return (EList<org.obeonetwork.dsl.bpmn2.Error>) eDynamicGet(Bpmn2Package.OPERATION__ERROR_REFS, Bpmn2Package.Literals.OPERATION__ERROR_REFS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject getImplementationRef() {
        return (EObject) eDynamicGet(Bpmn2Package.OPERATION__IMPLEMENTATION_REF, Bpmn2Package.Literals.OPERATION__IMPLEMENTATION_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetImplementationRef() {
        return (EObject) eDynamicGet(Bpmn2Package.OPERATION__IMPLEMENTATION_REF, Bpmn2Package.Literals.OPERATION__IMPLEMENTATION_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImplementationRef(EObject newImplementationRef) {
        eDynamicSet(Bpmn2Package.OPERATION__IMPLEMENTATION_REF, Bpmn2Package.Literals.OPERATION__IMPLEMENTATION_REF, newImplementationRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.OPERATION__NAME:
            return getName();
        case Bpmn2Package.OPERATION__IN_MESSAGE_REF:
            if (resolve)
                return getInMessageRef();
            return basicGetInMessageRef();
        case Bpmn2Package.OPERATION__OUT_MESSAGE_REF:
            if (resolve)
                return getOutMessageRef();
            return basicGetOutMessageRef();
        case Bpmn2Package.OPERATION__ERROR_REFS:
            return getErrorRefs();
        case Bpmn2Package.OPERATION__IMPLEMENTATION_REF:
            if (resolve)
                return getImplementationRef();
            return basicGetImplementationRef();
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
        case Bpmn2Package.OPERATION__NAME:
            setName((String) newValue);
            return;
        case Bpmn2Package.OPERATION__IN_MESSAGE_REF:
            setInMessageRef((Message) newValue);
            return;
        case Bpmn2Package.OPERATION__OUT_MESSAGE_REF:
            setOutMessageRef((Message) newValue);
            return;
        case Bpmn2Package.OPERATION__ERROR_REFS:
            getErrorRefs().clear();
            getErrorRefs().addAll((Collection<? extends org.obeonetwork.dsl.bpmn2.Error>) newValue);
            return;
        case Bpmn2Package.OPERATION__IMPLEMENTATION_REF:
            setImplementationRef((EObject) newValue);
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
        case Bpmn2Package.OPERATION__NAME:
            setName(NAME_EDEFAULT);
            return;
        case Bpmn2Package.OPERATION__IN_MESSAGE_REF:
            setInMessageRef((Message) null);
            return;
        case Bpmn2Package.OPERATION__OUT_MESSAGE_REF:
            setOutMessageRef((Message) null);
            return;
        case Bpmn2Package.OPERATION__ERROR_REFS:
            getErrorRefs().clear();
            return;
        case Bpmn2Package.OPERATION__IMPLEMENTATION_REF:
            setImplementationRef((EObject) null);
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
        case Bpmn2Package.OPERATION__NAME:
            return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
        case Bpmn2Package.OPERATION__IN_MESSAGE_REF:
            return basicGetInMessageRef() != null;
        case Bpmn2Package.OPERATION__OUT_MESSAGE_REF:
            return basicGetOutMessageRef() != null;
        case Bpmn2Package.OPERATION__ERROR_REFS:
            return !getErrorRefs().isEmpty();
        case Bpmn2Package.OPERATION__IMPLEMENTATION_REF:
            return basicGetImplementationRef() != null;
        }
        return super.eIsSet(featureID);
    }

} //OperationImpl
