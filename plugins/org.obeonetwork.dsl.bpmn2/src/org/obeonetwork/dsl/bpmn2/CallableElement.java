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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.CallableElement#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.CallableElement#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.CallableElement#getSupportedInterfaceRefs <em>Supported Interface Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.CallableElement#getIoBinding <em>Io Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCallableElement()
 * @model abstract="true"
 * @generated
 */
public interface CallableElement extends RootElement {
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
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCallableElement_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.CallableElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Specification</em>' containment reference.
	 * @see #setIoSpecification(InputOutputSpecification)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCallableElement_IoSpecification()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InputOutputSpecification getIoSpecification();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.CallableElement#getIoSpecification <em>Io Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Specification</em>' containment reference.
	 * @see #getIoSpecification()
	 * @generated
	 */
	void setIoSpecification(InputOutputSpecification value);

	/**
	 * Returns the value of the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Interface Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Interface Refs</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCallableElement_SupportedInterfaceRefs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getSupportedInterfaceRefs();

	/**
	 * Returns the value of the '<em><b>Io Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.InputOutputBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Binding</em>' containment reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getCallableElement_IoBinding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InputOutputBinding> getIoBinding();

} // CallableElement
