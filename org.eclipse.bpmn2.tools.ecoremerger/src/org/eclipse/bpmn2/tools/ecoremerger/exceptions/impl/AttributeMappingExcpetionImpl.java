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
package org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl;

import org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion;
import org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Mapping Excpetion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.AttributeMappingExcpetionImpl#getXsdAttributeName <em>Xsd Attribute Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.AttributeMappingExcpetionImpl#getMofAttributeName <em>Mof Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeMappingExcpetionImpl extends EObjectImpl implements AttributeMappingExcpetion {
	/**
	 * The default value of the '{@link #getXsdAttributeName() <em>Xsd Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String XSD_ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXsdAttributeName() <em>Xsd Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String xsdAttributeName = XSD_ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMofAttributeName() <em>Mof Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMofAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String MOF_ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMofAttributeName() <em>Mof Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMofAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String mofAttributeName = MOF_ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeMappingExcpetionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.ATTRIBUTE_MAPPING_EXCPETION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXsdAttributeName() {
		return xsdAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXsdAttributeName(String newXsdAttributeName) {
		String oldXsdAttributeName = xsdAttributeName;
		xsdAttributeName = newXsdAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExceptionsPackage.ATTRIBUTE_MAPPING_EXCPETION__XSD_ATTRIBUTE_NAME, oldXsdAttributeName, xsdAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMofAttributeName() {
		return mofAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMofAttributeName(String newMofAttributeName) {
		String oldMofAttributeName = mofAttributeName;
		mofAttributeName = newMofAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExceptionsPackage.ATTRIBUTE_MAPPING_EXCPETION__MOF_ATTRIBUTE_NAME, oldMofAttributeName, mofAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExceptionsPackage.ATTRIBUTE_MAPPING_EXCPETION__XSD_ATTRIBUTE_NAME:
				return getXsdAttributeName();
			case ExceptionsPackage.ATTRIBUTE_MAPPING_EXCPETION__MOF_ATTRIBUTE_NAME:
				return getMofAttributeName();
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
			case ExceptionsPackage.ATTRIBUTE_MAPPING_EXCPETION__XSD_ATTRIBUTE_NAME:
				setXsdAttributeName((String)newValue);
				return;
			case ExceptionsPackage.ATTRIBUTE_MAPPING_EXCPETION__MOF_ATTRIBUTE_NAME:
				setMofAttributeName((String)newValue);
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
			case ExceptionsPackage.ATTRIBUTE_MAPPING_EXCPETION__XSD_ATTRIBUTE_NAME:
				setXsdAttributeName(XSD_ATTRIBUTE_NAME_EDEFAULT);
				return;
			case ExceptionsPackage.ATTRIBUTE_MAPPING_EXCPETION__MOF_ATTRIBUTE_NAME:
				setMofAttributeName(MOF_ATTRIBUTE_NAME_EDEFAULT);
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
			case ExceptionsPackage.ATTRIBUTE_MAPPING_EXCPETION__XSD_ATTRIBUTE_NAME:
				return XSD_ATTRIBUTE_NAME_EDEFAULT == null ? xsdAttributeName != null : !XSD_ATTRIBUTE_NAME_EDEFAULT.equals(xsdAttributeName);
			case ExceptionsPackage.ATTRIBUTE_MAPPING_EXCPETION__MOF_ATTRIBUTE_NAME:
				return MOF_ATTRIBUTE_NAME_EDEFAULT == null ? mofAttributeName != null : !MOF_ATTRIBUTE_NAME_EDEFAULT.equals(mofAttributeName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xsdAttributeName: ");
		result.append(xsdAttributeName);
		result.append(", mofAttributeName: ");
		result.append(mofAttributeName);
		result.append(')');
		return result.toString();
	}

} //AttributeMappingExcpetionImpl
