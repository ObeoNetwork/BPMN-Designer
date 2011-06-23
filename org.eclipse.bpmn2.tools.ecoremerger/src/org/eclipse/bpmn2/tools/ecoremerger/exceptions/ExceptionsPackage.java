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
package org.eclipse.bpmn2.tools.ecoremerger.exceptions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExceptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exceptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.sap.glx.bpmn.ecorepatcher.exceptions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ex";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExceptionsPackage eINSTANCE = org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ExceptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ClassMappingExceptionImpl <em>Class Mapping Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ClassMappingExceptionImpl
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ExceptionsPackageImpl#getClassMappingException()
	 * @generated
	 */
	int CLASS_MAPPING_EXCEPTION = 0;

	/**
	 * The feature id for the '<em><b>Xsd Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_EXCEPTION__XSD_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Mof Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_EXCEPTION__MOF_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Attribute Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_EXCEPTION__ATTRIBUTE_EXCEPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Class Mapping Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_EXCEPTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.AttributeMappingExcpetionImpl <em>Attribute Mapping Excpetion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.AttributeMappingExcpetionImpl
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ExceptionsPackageImpl#getAttributeMappingExcpetion()
	 * @generated
	 */
	int ATTRIBUTE_MAPPING_EXCPETION = 1;

	/**
	 * The feature id for the '<em><b>Xsd Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING_EXCPETION__XSD_ATTRIBUTE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Mof Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING_EXCPETION__MOF_ATTRIBUTE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Attribute Mapping Excpetion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING_EXCPETION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException <em>Class Mapping Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Mapping Exception</em>'.
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException
	 * @generated
	 */
	EClass getClassMappingException();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException#getXsdClassName <em>Xsd Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xsd Class Name</em>'.
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException#getXsdClassName()
	 * @see #getClassMappingException()
	 * @generated
	 */
	EAttribute getClassMappingException_XsdClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException#getMofClassName <em>Mof Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mof Class Name</em>'.
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException#getMofClassName()
	 * @see #getClassMappingException()
	 * @generated
	 */
	EAttribute getClassMappingException_MofClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException#getAttributeExceptions <em>Attribute Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Exceptions</em>'.
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException#getAttributeExceptions()
	 * @see #getClassMappingException()
	 * @generated
	 */
	EReference getClassMappingException_AttributeExceptions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion <em>Attribute Mapping Excpetion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Mapping Excpetion</em>'.
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion
	 * @generated
	 */
	EClass getAttributeMappingExcpetion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion#getXsdAttributeName <em>Xsd Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xsd Attribute Name</em>'.
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion#getXsdAttributeName()
	 * @see #getAttributeMappingExcpetion()
	 * @generated
	 */
	EAttribute getAttributeMappingExcpetion_XsdAttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion#getMofAttributeName <em>Mof Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mof Attribute Name</em>'.
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion#getMofAttributeName()
	 * @see #getAttributeMappingExcpetion()
	 * @generated
	 */
	EAttribute getAttributeMappingExcpetion_MofAttributeName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExceptionsFactory getExceptionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ClassMappingExceptionImpl <em>Class Mapping Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ClassMappingExceptionImpl
		 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ExceptionsPackageImpl#getClassMappingException()
		 * @generated
		 */
		EClass CLASS_MAPPING_EXCEPTION = eINSTANCE.getClassMappingException();

		/**
		 * The meta object literal for the '<em><b>Xsd Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MAPPING_EXCEPTION__XSD_CLASS_NAME = eINSTANCE.getClassMappingException_XsdClassName();

		/**
		 * The meta object literal for the '<em><b>Mof Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MAPPING_EXCEPTION__MOF_CLASS_NAME = eINSTANCE.getClassMappingException_MofClassName();

		/**
		 * The meta object literal for the '<em><b>Attribute Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MAPPING_EXCEPTION__ATTRIBUTE_EXCEPTIONS = eINSTANCE.getClassMappingException_AttributeExceptions();

		/**
		 * The meta object literal for the '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.AttributeMappingExcpetionImpl <em>Attribute Mapping Excpetion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.AttributeMappingExcpetionImpl
		 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ExceptionsPackageImpl#getAttributeMappingExcpetion()
		 * @generated
		 */
		EClass ATTRIBUTE_MAPPING_EXCPETION = eINSTANCE.getAttributeMappingExcpetion();

		/**
		 * The meta object literal for the '<em><b>Xsd Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MAPPING_EXCPETION__XSD_ATTRIBUTE_NAME = eINSTANCE.getAttributeMappingExcpetion_XsdAttributeName();

		/**
		 * The meta object literal for the '<em><b>Mof Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MAPPING_EXCPETION__MOF_ATTRIBUTE_NAME = eINSTANCE.getAttributeMappingExcpetion_MofAttributeName();

	}

} //ExceptionsPackage
