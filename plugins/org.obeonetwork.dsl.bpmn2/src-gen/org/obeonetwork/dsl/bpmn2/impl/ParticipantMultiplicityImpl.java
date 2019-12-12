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
import org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Participant Multiplicity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantMultiplicityImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantMultiplicityImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantMultiplicityImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantMultiplicityImpl extends BPMN2ObjectImpl implements ParticipantMultiplicity {
    /**
     * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMinimum()
     * @generated
     * @ordered
     */
    protected static final int MINIMUM_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMaximum()
     * @generated
     * @ordered
     */
    protected static final int MAXIMUM_EDEFAULT = 1;

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
    protected ParticipantMultiplicityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.PARTICIPANT_MULTIPLICITY;
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
    public int getMinimum() {
        return (Integer) eDynamicGet(Bpmn2Package.PARTICIPANT_MULTIPLICITY__MINIMUM, Bpmn2Package.Literals.PARTICIPANT_MULTIPLICITY__MINIMUM, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinimum(int newMinimum) {
        eDynamicSet(Bpmn2Package.PARTICIPANT_MULTIPLICITY__MINIMUM, Bpmn2Package.Literals.PARTICIPANT_MULTIPLICITY__MINIMUM, newMinimum);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getMaximum() {
        return (Integer) eDynamicGet(Bpmn2Package.PARTICIPANT_MULTIPLICITY__MAXIMUM, Bpmn2Package.Literals.PARTICIPANT_MULTIPLICITY__MAXIMUM, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaximum(int newMaximum) {
        eDynamicSet(Bpmn2Package.PARTICIPANT_MULTIPLICITY__MAXIMUM, Bpmn2Package.Literals.PARTICIPANT_MULTIPLICITY__MAXIMUM, newMaximum);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getId() {
        return (String) eDynamicGet(Bpmn2Package.PARTICIPANT_MULTIPLICITY__ID, Bpmn2Package.Literals.PARTICIPANT_MULTIPLICITY__ID, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId(String newId) {
        eDynamicSet(Bpmn2Package.PARTICIPANT_MULTIPLICITY__ID, Bpmn2Package.Literals.PARTICIPANT_MULTIPLICITY__ID, newId);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__MINIMUM:
            return getMinimum();
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__MAXIMUM:
            return getMaximum();
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__ID:
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
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__MINIMUM:
            setMinimum((Integer) newValue);
            return;
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__MAXIMUM:
            setMaximum((Integer) newValue);
            return;
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__ID:
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
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__MINIMUM:
            setMinimum(MINIMUM_EDEFAULT);
            return;
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__MAXIMUM:
            setMaximum(MAXIMUM_EDEFAULT);
            return;
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__ID:
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
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__MINIMUM:
            return getMinimum() != MINIMUM_EDEFAULT;
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__MAXIMUM:
            return getMaximum() != MAXIMUM_EDEFAULT;
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__ID:
            return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
        }
        return super.eIsSet(featureID);
    }

} // ParticipantMultiplicityImpl
