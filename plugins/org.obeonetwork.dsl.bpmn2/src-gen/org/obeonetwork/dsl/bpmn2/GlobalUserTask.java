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
 * A representation of the model object '<em><b>Global User Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.GlobalUserTask#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.GlobalUserTask#getRenderings <em>Renderings</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getGlobalUserTask()
 * @model
 * @generated
 */
public interface GlobalUserTask extends GlobalTask {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(String)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getGlobalUserTask_Implementation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getImplementation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.GlobalUserTask#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Renderings</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.Rendering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renderings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renderings</em>' containment reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getGlobalUserTask_Renderings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Rendering> getRenderings();

} // GlobalUserTask
