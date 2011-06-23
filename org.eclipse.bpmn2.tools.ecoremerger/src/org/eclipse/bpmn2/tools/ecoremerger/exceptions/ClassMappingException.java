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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Mapping Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException#getXsdClassName <em>Xsd Class Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException#getMofClassName <em>Mof Class Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException#getAttributeExceptions <em>Attribute Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsPackage#getClassMappingException()
 * @model
 * @generated
 */
public interface ClassMappingException extends EObject {
	/**
	 * Returns the value of the '<em><b>Xsd Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xsd Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsd Class Name</em>' attribute.
	 * @see #setXsdClassName(String)
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsPackage#getClassMappingException_XsdClassName()
	 * @model
	 * @generated
	 */
	String getXsdClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException#getXsdClassName <em>Xsd Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsd Class Name</em>' attribute.
	 * @see #getXsdClassName()
	 * @generated
	 */
	void setXsdClassName(String value);

	/**
	 * Returns the value of the '<em><b>Mof Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mof Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mof Class Name</em>' attribute.
	 * @see #setMofClassName(String)
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsPackage#getClassMappingException_MofClassName()
	 * @model
	 * @generated
	 */
	String getMofClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException#getMofClassName <em>Mof Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mof Class Name</em>' attribute.
	 * @see #getMofClassName()
	 * @generated
	 */
	void setMofClassName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Exceptions</em>' containment reference list.
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsPackage#getClassMappingException_AttributeExceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeMappingExcpetion> getAttributeExceptions();

} // ClassMappingException
