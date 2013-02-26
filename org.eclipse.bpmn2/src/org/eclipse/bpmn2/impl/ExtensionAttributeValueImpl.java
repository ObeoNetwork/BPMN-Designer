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

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.ExtensionAttributeDefinition;
import org.eclipse.bpmn2.ExtensionAttributeValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionAttributeValueImpl#getValueRef <em>Value Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionAttributeValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionAttributeValueImpl#getExtensionAttributeDefinition <em>Extension Attribute Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionAttributeValueImpl extends EObjectImpl implements ExtensionAttributeValue {
    /**
     * The cached value of the '{@link #getValueRef() <em>Value Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueRef()
     * @generated
     * @ordered
     */
    protected EObject valueRef;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected EObject value;

    /**
     * The cached value of the '{@link #getExtensionAttributeDefinition() <em>Extension Attribute Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtensionAttributeDefinition()
     * @generated
     * @ordered
     */
    protected ExtensionAttributeDefinition extensionAttributeDefinition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtensionAttributeValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getValueRef() {
        if (valueRef != null && valueRef.eIsProxy()) {
            InternalEObject oldValueRef = (InternalEObject) valueRef;
            valueRef = eResolveProxy(oldValueRef);
            if (valueRef != oldValueRef) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF, oldValueRef,
                            valueRef));
            }
        }
        return valueRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetValueRef() {
        return valueRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValueRef(EObject newValueRef) {
        EObject oldValueRef = valueRef;
        valueRef = newValueRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF, oldValueRef, valueRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValue(EObject newValue, NotificationChain msgs) {
        EObject oldValue = value;
        value = newValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE, oldValue, newValue);
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
    public void setValue(EObject newValue) {
        if (newValue != value) {
            NotificationChain msgs = null;
            if (value != null)
                msgs = ((InternalEObject) value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject) newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE, newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionAttributeDefinition getExtensionAttributeDefinition() {
        if (extensionAttributeDefinition != null && extensionAttributeDefinition.eIsProxy()) {
            InternalEObject oldExtensionAttributeDefinition = (InternalEObject) extensionAttributeDefinition;
            extensionAttributeDefinition = (ExtensionAttributeDefinition) eResolveProxy(oldExtensionAttributeDefinition);
            if (extensionAttributeDefinition != oldExtensionAttributeDefinition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION,
                            oldExtensionAttributeDefinition, extensionAttributeDefinition));
            }
        }
        return extensionAttributeDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionAttributeDefinition basicGetExtensionAttributeDefinition() {
        return extensionAttributeDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtensionAttributeDefinition(
            ExtensionAttributeDefinition newExtensionAttributeDefinition) {
        ExtensionAttributeDefinition oldExtensionAttributeDefinition = extensionAttributeDefinition;
        extensionAttributeDefinition = newExtensionAttributeDefinition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION,
                    oldExtensionAttributeDefinition, extensionAttributeDefinition));
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
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
            return basicSetValue(null, msgs);
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
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
            if (resolve)
                return getValueRef();
            return basicGetValueRef();
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
            return getValue();
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
            if (resolve)
                return getExtensionAttributeDefinition();
            return basicGetExtensionAttributeDefinition();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
            setValueRef((EObject) newValue);
            return;
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
            setValue((EObject) newValue);
            return;
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
            setExtensionAttributeDefinition((ExtensionAttributeDefinition) newValue);
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
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
            setValueRef((EObject) null);
            return;
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
            setValue((EObject) null);
            return;
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
            setExtensionAttributeDefinition((ExtensionAttributeDefinition) null);
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
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
            return valueRef != null;
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
            return value != null;
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
            return extensionAttributeDefinition != null;
        }
        return super.eIsSet(featureID);
    }

} //ExtensionAttributeValueImpl
