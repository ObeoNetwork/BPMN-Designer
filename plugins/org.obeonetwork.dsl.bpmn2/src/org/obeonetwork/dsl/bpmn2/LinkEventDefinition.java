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
 * A representation of the model object '<em><b>Link Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getLinkEventDefinition()
 * @model
 * @generated
 */
public interface LinkEventDefinition extends EventDefinition {
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
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getLinkEventDefinition_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(LinkEventDefinition)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getLinkEventDefinition_Target()
	 * @see org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	LinkEventDefinition getTarget();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(LinkEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getLinkEventDefinition_Source()
	 * @see org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<LinkEventDefinition> getSource();

} // LinkEventDefinition
