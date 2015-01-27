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
package org.obeonetwork.dsl.bpmn2;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getExtensionDefinition <em>Extension Definition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getExtensionAttributeDefinition()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ExtensionAttributeDefinition extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getExtensionAttributeDefinition_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getExtensionAttributeDefinition_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Is Reference</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reference</em>' attribute.
	 * @see #setIsReference(boolean)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getExtensionAttributeDefinition_IsReference()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReference();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#isIsReference <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reference</em>' attribute.
	 * @see #isIsReference()
	 * @generated
	 */
	void setIsReference(boolean value);

	/**
	 * Returns the value of the '<em><b>Extension Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.ExtensionDefinition#getExtensionAttributeDefinitions <em>Extension Attribute Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Definition</em>' container reference.
	 * @see #setExtensionDefinition(ExtensionDefinition)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getExtensionAttributeDefinition_ExtensionDefinition()
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionDefinition#getExtensionAttributeDefinitions
	 * @model opposite="extensionAttributeDefinitions" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ExtensionDefinition getExtensionDefinition();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getExtensionDefinition <em>Extension Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Definition</em>' container reference.
	 * @see #getExtensionDefinition()
	 * @generated
	 */
	void setExtensionDefinition(ExtensionDefinition value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getExtensionAttributeDefinition_Id()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ExtensionAttributeDefinition
