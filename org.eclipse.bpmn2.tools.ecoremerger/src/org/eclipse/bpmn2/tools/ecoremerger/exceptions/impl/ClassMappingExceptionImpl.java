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

import java.util.Collection;

import org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion;
import org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException;
import org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Mapping Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ClassMappingExceptionImpl#getXsdClassName <em>Xsd Class Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ClassMappingExceptionImpl#getMofClassName <em>Mof Class Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ClassMappingExceptionImpl#getAttributeExceptions <em>Attribute Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassMappingExceptionImpl extends EObjectImpl implements ClassMappingException {
	/**
	 * The default value of the '{@link #getXsdClassName() <em>Xsd Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String XSD_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXsdClassName() <em>Xsd Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdClassName()
	 * @generated
	 * @ordered
	 */
	protected String xsdClassName = XSD_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMofClassName() <em>Mof Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMofClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String MOF_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMofClassName() <em>Mof Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMofClassName()
	 * @generated
	 * @ordered
	 */
	protected String mofClassName = MOF_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeExceptions() <em>Attribute Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeMappingExcpetion> attributeExceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassMappingExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.CLASS_MAPPING_EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXsdClassName() {
		return xsdClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXsdClassName(String newXsdClassName) {
		String oldXsdClassName = xsdClassName;
		xsdClassName = newXsdClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExceptionsPackage.CLASS_MAPPING_EXCEPTION__XSD_CLASS_NAME, oldXsdClassName, xsdClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMofClassName() {
		return mofClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMofClassName(String newMofClassName) {
		String oldMofClassName = mofClassName;
		mofClassName = newMofClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExceptionsPackage.CLASS_MAPPING_EXCEPTION__MOF_CLASS_NAME, oldMofClassName, mofClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeMappingExcpetion> getAttributeExceptions() {
		if (attributeExceptions == null) {
			attributeExceptions = new EObjectContainmentEList<AttributeMappingExcpetion>(AttributeMappingExcpetion.class, this, ExceptionsPackage.CLASS_MAPPING_EXCEPTION__ATTRIBUTE_EXCEPTIONS);
		}
		return attributeExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__ATTRIBUTE_EXCEPTIONS:
				return ((InternalEList<?>)getAttributeExceptions()).basicRemove(otherEnd, msgs);
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
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__XSD_CLASS_NAME:
				return getXsdClassName();
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__MOF_CLASS_NAME:
				return getMofClassName();
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__ATTRIBUTE_EXCEPTIONS:
				return getAttributeExceptions();
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
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__XSD_CLASS_NAME:
				setXsdClassName((String)newValue);
				return;
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__MOF_CLASS_NAME:
				setMofClassName((String)newValue);
				return;
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__ATTRIBUTE_EXCEPTIONS:
				getAttributeExceptions().clear();
				getAttributeExceptions().addAll((Collection<? extends AttributeMappingExcpetion>)newValue);
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
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__XSD_CLASS_NAME:
				setXsdClassName(XSD_CLASS_NAME_EDEFAULT);
				return;
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__MOF_CLASS_NAME:
				setMofClassName(MOF_CLASS_NAME_EDEFAULT);
				return;
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__ATTRIBUTE_EXCEPTIONS:
				getAttributeExceptions().clear();
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
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__XSD_CLASS_NAME:
				return XSD_CLASS_NAME_EDEFAULT == null ? xsdClassName != null : !XSD_CLASS_NAME_EDEFAULT.equals(xsdClassName);
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__MOF_CLASS_NAME:
				return MOF_CLASS_NAME_EDEFAULT == null ? mofClassName != null : !MOF_CLASS_NAME_EDEFAULT.equals(mofClassName);
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION__ATTRIBUTE_EXCEPTIONS:
				return attributeExceptions != null && !attributeExceptions.isEmpty();
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
		result.append(" (xsdClassName: ");
		result.append(xsdClassName);
		result.append(", mofClassName: ");
		result.append(mofClassName);
		result.append(')');
		return result.toString();
	}

} //ClassMappingExceptionImpl
