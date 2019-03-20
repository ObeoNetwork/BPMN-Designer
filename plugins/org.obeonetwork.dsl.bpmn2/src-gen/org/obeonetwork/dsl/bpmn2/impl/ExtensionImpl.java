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
import org.obeonetwork.dsl.bpmn2.BPMN2ObjectImpl;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Extension;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionImpl#isMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionImpl extends BPMN2ObjectImpl implements Extension {
	/**
	 * The default value of the '{@link #isMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_UNDERSTAND_EDEFAULT = false;

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
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.EXTENSION;
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
	public boolean isMustUnderstand() {
		return (Boolean) eDynamicGet(Bpmn2Package.EXTENSION__MUST_UNDERSTAND,
				Bpmn2Package.Literals.EXTENSION__MUST_UNDERSTAND, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMustUnderstand(boolean newMustUnderstand) {
		eDynamicSet(Bpmn2Package.EXTENSION__MUST_UNDERSTAND, Bpmn2Package.Literals.EXTENSION__MUST_UNDERSTAND,
				newMustUnderstand);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionDefinition getDefinition() {
		return (ExtensionDefinition) eDynamicGet(Bpmn2Package.EXTENSION__DEFINITION,
				Bpmn2Package.Literals.EXTENSION__DEFINITION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(ExtensionDefinition newDefinition, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newDefinition, Bpmn2Package.EXTENSION__DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(ExtensionDefinition newDefinition) {
		eDynamicSet(Bpmn2Package.EXTENSION__DEFINITION, Bpmn2Package.Literals.EXTENSION__DEFINITION, newDefinition);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String) eDynamicGet(Bpmn2Package.EXTENSION__ID, Bpmn2Package.Literals.EXTENSION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(Bpmn2Package.EXTENSION__ID, Bpmn2Package.Literals.EXTENSION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.EXTENSION__DEFINITION:
			return basicSetDefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.EXTENSION__MUST_UNDERSTAND:
			return isMustUnderstand();
		case Bpmn2Package.EXTENSION__DEFINITION:
			return getDefinition();
		case Bpmn2Package.EXTENSION__ID:
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
		case Bpmn2Package.EXTENSION__MUST_UNDERSTAND:
			setMustUnderstand((Boolean) newValue);
			return;
		case Bpmn2Package.EXTENSION__DEFINITION:
			setDefinition((ExtensionDefinition) newValue);
			return;
		case Bpmn2Package.EXTENSION__ID:
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
		case Bpmn2Package.EXTENSION__MUST_UNDERSTAND:
			setMustUnderstand(MUST_UNDERSTAND_EDEFAULT);
			return;
		case Bpmn2Package.EXTENSION__DEFINITION:
			setDefinition((ExtensionDefinition) null);
			return;
		case Bpmn2Package.EXTENSION__ID:
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
		case Bpmn2Package.EXTENSION__MUST_UNDERSTAND:
			return isMustUnderstand() != MUST_UNDERSTAND_EDEFAULT;
		case Bpmn2Package.EXTENSION__DEFINITION:
			return getDefinition() != null;
		case Bpmn2Package.EXTENSION__ID:
			return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
		}
		return super.eIsSet(featureID);
	}

} // ExtensionImpl
