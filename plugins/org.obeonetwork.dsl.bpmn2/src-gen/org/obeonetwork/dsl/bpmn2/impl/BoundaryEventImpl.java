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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.obeonetwork.dsl.bpmn2.Activity;
import org.obeonetwork.dsl.bpmn2.BoundaryEvent;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.BoundaryEventImpl#isCancelActivity <em>Cancel Activity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.BoundaryEventImpl#getAttachedToRef <em>Attached To Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundaryEventImpl extends CatchEventImpl implements BoundaryEvent {
    /**
     * The default value of the '{@link #isCancelActivity() <em>Cancel Activity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCancelActivity()
     * @generated
     * @ordered
     */
    protected static final boolean CANCEL_ACTIVITY_EDEFAULT = true;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BoundaryEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.BOUNDARY_EVENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isCancelActivity() {
        return (Boolean) eDynamicGet(Bpmn2Package.BOUNDARY_EVENT__CANCEL_ACTIVITY, Bpmn2Package.Literals.BOUNDARY_EVENT__CANCEL_ACTIVITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCancelActivity(boolean newCancelActivity) {
        eDynamicSet(Bpmn2Package.BOUNDARY_EVENT__CANCEL_ACTIVITY, Bpmn2Package.Literals.BOUNDARY_EVENT__CANCEL_ACTIVITY, newCancelActivity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Activity getAttachedToRef() {
        return (Activity) eDynamicGet(Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF, Bpmn2Package.Literals.BOUNDARY_EVENT__ATTACHED_TO_REF, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Activity basicGetAttachedToRef() {
        return (Activity) eDynamicGet(Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF, Bpmn2Package.Literals.BOUNDARY_EVENT__ATTACHED_TO_REF, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAttachedToRef(Activity newAttachedToRef, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject) newAttachedToRef, Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAttachedToRef(Activity newAttachedToRef) {
        eDynamicSet(Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF, Bpmn2Package.Literals.BOUNDARY_EVENT__ATTACHED_TO_REF, newAttachedToRef);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF:
            Activity attachedToRef = basicGetAttachedToRef();
            if (attachedToRef != null)
                msgs = ((InternalEObject) attachedToRef).eInverseRemove(this, Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS, Activity.class, msgs);
            return basicSetAttachedToRef((Activity) otherEnd, msgs);
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
        case Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF:
            return basicSetAttachedToRef(null, msgs);
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
        case Bpmn2Package.BOUNDARY_EVENT__CANCEL_ACTIVITY:
            return isCancelActivity();
        case Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF:
            if (resolve)
                return getAttachedToRef();
            return basicGetAttachedToRef();
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
        case Bpmn2Package.BOUNDARY_EVENT__CANCEL_ACTIVITY:
            setCancelActivity((Boolean) newValue);
            return;
        case Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF:
            setAttachedToRef((Activity) newValue);
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
        case Bpmn2Package.BOUNDARY_EVENT__CANCEL_ACTIVITY:
            setCancelActivity(CANCEL_ACTIVITY_EDEFAULT);
            return;
        case Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF:
            setAttachedToRef((Activity) null);
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
        case Bpmn2Package.BOUNDARY_EVENT__CANCEL_ACTIVITY:
            return isCancelActivity() != CANCEL_ACTIVITY_EDEFAULT;
        case Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF:
            return basicGetAttachedToRef() != null;
        }
        return super.eIsSet(featureID);
    }

} //BoundaryEventImpl
