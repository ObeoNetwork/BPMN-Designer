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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.CorrelationProperty;
import org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding;
import org.obeonetwork.dsl.bpmn2.FormalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Property Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyBindingImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyBindingImpl#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationPropertyBindingImpl extends BaseElementImpl implements
		CorrelationPropertyBinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationPropertyBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.CORRELATION_PROPERTY_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression getDataPath() {
		return (FormalExpression) eGet(
				Bpmn2Package.Literals.CORRELATION_PROPERTY_BINDING__DATA_PATH,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPath(FormalExpression newDataPath) {
		eSet(Bpmn2Package.Literals.CORRELATION_PROPERTY_BINDING__DATA_PATH,
				newDataPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty getCorrelationPropertyRef() {
		return (CorrelationProperty) eGet(
				Bpmn2Package.Literals.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationPropertyRef(
			CorrelationProperty newCorrelationPropertyRef) {
		eSet(Bpmn2Package.Literals.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF,
				newCorrelationPropertyRef);
	}

} //CorrelationPropertyBindingImpl
