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
import org.obeonetwork.dsl.bpmn2.Import;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Import</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ImportImpl#getImportType <em>Import Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ImportImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ImportImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ImportImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends BPMN2ObjectImpl implements Import {
	/**
	 * The default value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getImportType()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_TYPE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

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
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.IMPORT;
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
	public String getImportType() {
		return (String) eDynamicGet(Bpmn2Package.IMPORT__IMPORT_TYPE, Bpmn2Package.Literals.IMPORT__IMPORT_TYPE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportType(String newImportType) {
		eDynamicSet(Bpmn2Package.IMPORT__IMPORT_TYPE, Bpmn2Package.Literals.IMPORT__IMPORT_TYPE, newImportType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return (String) eDynamicGet(Bpmn2Package.IMPORT__LOCATION, Bpmn2Package.Literals.IMPORT__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		eDynamicSet(Bpmn2Package.IMPORT__LOCATION, Bpmn2Package.Literals.IMPORT__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespace() {
		return (String) eDynamicGet(Bpmn2Package.IMPORT__NAMESPACE, Bpmn2Package.Literals.IMPORT__NAMESPACE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(String newNamespace) {
		eDynamicSet(Bpmn2Package.IMPORT__NAMESPACE, Bpmn2Package.Literals.IMPORT__NAMESPACE, newNamespace);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String) eDynamicGet(Bpmn2Package.IMPORT__ID, Bpmn2Package.Literals.IMPORT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(Bpmn2Package.IMPORT__ID, Bpmn2Package.Literals.IMPORT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.IMPORT__IMPORT_TYPE:
			return getImportType();
		case Bpmn2Package.IMPORT__LOCATION:
			return getLocation();
		case Bpmn2Package.IMPORT__NAMESPACE:
			return getNamespace();
		case Bpmn2Package.IMPORT__ID:
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
		case Bpmn2Package.IMPORT__IMPORT_TYPE:
			setImportType((String) newValue);
			return;
		case Bpmn2Package.IMPORT__LOCATION:
			setLocation((String) newValue);
			return;
		case Bpmn2Package.IMPORT__NAMESPACE:
			setNamespace((String) newValue);
			return;
		case Bpmn2Package.IMPORT__ID:
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
		case Bpmn2Package.IMPORT__IMPORT_TYPE:
			setImportType(IMPORT_TYPE_EDEFAULT);
			return;
		case Bpmn2Package.IMPORT__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case Bpmn2Package.IMPORT__NAMESPACE:
			setNamespace(NAMESPACE_EDEFAULT);
			return;
		case Bpmn2Package.IMPORT__ID:
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
		case Bpmn2Package.IMPORT__IMPORT_TYPE:
			return IMPORT_TYPE_EDEFAULT == null ? getImportType() != null
					: !IMPORT_TYPE_EDEFAULT.equals(getImportType());
		case Bpmn2Package.IMPORT__LOCATION:
			return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
		case Bpmn2Package.IMPORT__NAMESPACE:
			return NAMESPACE_EDEFAULT == null ? getNamespace() != null : !NAMESPACE_EDEFAULT.equals(getNamespace());
		case Bpmn2Package.IMPORT__ID:
			return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
		}
		return super.eIsSet(featureID);
	}

} // ImportImpl
