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
package org.obeonetwork.dsl.bpmn2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Resource;
import org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression;
import org.obeonetwork.dsl.bpmn2.ResourceParameterBinding;
import org.obeonetwork.dsl.bpmn2.ResourceRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl#getResourceParameterBindings <em>Resource Parameter Bindings</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRoleImpl extends BaseElementImpl implements ResourceRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.RESOURCE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResourceRef() {
		return (Resource) eGet(
				Bpmn2Package.Literals.RESOURCE_ROLE__RESOURCE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRef(Resource newResourceRef) {
		eSet(Bpmn2Package.Literals.RESOURCE_ROLE__RESOURCE_REF, newResourceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResourceParameterBinding> getResourceParameterBindings() {
		return (EList<ResourceParameterBinding>) eGet(
				Bpmn2Package.Literals.RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAssignmentExpression getResourceAssignmentExpression() {
		return (ResourceAssignmentExpression) eGet(
				Bpmn2Package.Literals.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceAssignmentExpression(
			ResourceAssignmentExpression newResourceAssignmentExpression) {
		eSet(Bpmn2Package.Literals.RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION,
				newResourceAssignmentExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eGet(Bpmn2Package.Literals.RESOURCE_ROLE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(Bpmn2Package.Literals.RESOURCE_ROLE__NAME, newName);
	}

} //ResourceRoleImpl
