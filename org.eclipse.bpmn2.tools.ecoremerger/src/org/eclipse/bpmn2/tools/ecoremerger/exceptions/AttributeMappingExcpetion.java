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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Mapping Excpetion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion#getXsdAttributeName <em>Xsd Attribute Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion#getMofAttributeName <em>Mof Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsPackage#getAttributeMappingExcpetion()
 * @model
 * @generated
 */
public interface AttributeMappingExcpetion extends EObject {
	/**
	 * Returns the value of the '<em><b>Xsd Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xsd Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsd Attribute Name</em>' attribute.
	 * @see #setXsdAttributeName(String)
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsPackage#getAttributeMappingExcpetion_XsdAttributeName()
	 * @model
	 * @generated
	 */
	String getXsdAttributeName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion#getXsdAttributeName <em>Xsd Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsd Attribute Name</em>' attribute.
	 * @see #getXsdAttributeName()
	 * @generated
	 */
	void setXsdAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Mof Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mof Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mof Attribute Name</em>' attribute.
	 * @see #setMofAttributeName(String)
	 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsPackage#getAttributeMappingExcpetion_MofAttributeName()
	 * @model
	 * @generated
	 */
	String getMofAttributeName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion#getMofAttributeName <em>Mof Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mof Attribute Name</em>' attribute.
	 * @see #getMofAttributeName()
	 * @generated
	 */
	void setMofAttributeName(String value);

} // AttributeMappingExcpetion
