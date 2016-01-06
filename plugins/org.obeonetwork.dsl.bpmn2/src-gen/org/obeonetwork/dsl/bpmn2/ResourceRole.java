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
 * A representation of the model object '<em><b>Resource Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ResourceRole#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ResourceRole#getResourceParameterBindings <em>Resource Parameter Bindings</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ResourceRole#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.ResourceRole#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getResourceRole()
 * @model
 * @generated
 */
public interface ResourceRole extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' reference.
	 * @see #setResourceRef(Resource)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getResourceRole_ResourceRef()
	 * @model ordered="false"
	 * @generated
	 */
	Resource getResourceRef();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ResourceRole#getResourceRef <em>Resource Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Ref</em>' reference.
	 * @see #getResourceRef()
	 * @generated
	 */
	void setResourceRef(Resource value);

	/**
	 * Returns the value of the '<em><b>Resource Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.ResourceParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Parameter Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Parameter Bindings</em>' containment reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getResourceRole_ResourceParameterBindings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceParameterBinding> getResourceParameterBindings();

	/**
	 * Returns the value of the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Assignment Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Assignment Expression</em>' containment reference.
	 * @see #setResourceAssignmentExpression(ResourceAssignmentExpression)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getResourceRole_ResourceAssignmentExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ResourceAssignmentExpression getResourceAssignmentExpression();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ResourceRole#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Assignment Expression</em>' containment reference.
	 * @see #getResourceAssignmentExpression()
	 * @generated
	 */
	void setResourceAssignmentExpression(ResourceAssignmentExpression value);

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
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getResourceRole_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.ResourceRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ResourceRole
