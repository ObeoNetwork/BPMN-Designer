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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Group#getCategoryValueRef <em>Category Value Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getGroup()
 * @model
 * @generated
 */
public interface Group extends Artifact {
	/**
	 * Returns the value of the '<em><b>Category Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Value Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Value Ref</em>' reference.
	 * @see #setCategoryValueRef(CategoryValue)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getGroup_CategoryValueRef()
	 * @model ordered="false"
	 * @generated
	 */
	CategoryValue getCategoryValueRef();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Group#getCategoryValueRef <em>Category Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Value Ref</em>' reference.
	 * @see #getCategoryValueRef()
	 * @generated
	 */
	void setCategoryValueRef(CategoryValue value);

} // Group
