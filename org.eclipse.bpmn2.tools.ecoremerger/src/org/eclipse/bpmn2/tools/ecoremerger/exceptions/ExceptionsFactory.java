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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsPackage
 * @generated
 */
public interface ExceptionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExceptionsFactory eINSTANCE = org.eclipse.bpmn2.tools.ecoremerger.exceptions.impl.ExceptionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class Mapping Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Mapping Exception</em>'.
	 * @generated
	 */
	ClassMappingException createClassMappingException();

	/**
	 * Returns a new object of class '<em>Attribute Mapping Excpetion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Mapping Excpetion</em>'.
	 * @generated
	 */
	AttributeMappingExcpetion createAttributeMappingExcpetion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExceptionsPackage getExceptionsPackage();

} //ExceptionsFactory
