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

import org.eclipse.bpmn2.tools.ecoremerger.exceptions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExceptionsFactoryImpl extends EFactoryImpl implements ExceptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExceptionsFactory init() {
		try {
			ExceptionsFactory theExceptionsFactory = (ExceptionsFactory)EPackage.Registry.INSTANCE.getEFactory("com.sap.glx.bpmn.ecorepatcher.exceptions"); 
			if (theExceptionsFactory != null) {
				return theExceptionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExceptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExceptionsPackage.CLASS_MAPPING_EXCEPTION: return createClassMappingException();
			case ExceptionsPackage.ATTRIBUTE_MAPPING_EXCPETION: return createAttributeMappingExcpetion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMappingException createClassMappingException() {
		ClassMappingExceptionImpl classMappingException = new ClassMappingExceptionImpl();
		return classMappingException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMappingExcpetion createAttributeMappingExcpetion() {
		AttributeMappingExcpetionImpl attributeMappingExcpetion = new AttributeMappingExcpetionImpl();
		return attributeMappingExcpetion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionsPackage getExceptionsPackage() {
		return (ExceptionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExceptionsPackage getPackage() {
		return ExceptionsPackage.eINSTANCE;
	}

} //ExceptionsFactoryImpl
