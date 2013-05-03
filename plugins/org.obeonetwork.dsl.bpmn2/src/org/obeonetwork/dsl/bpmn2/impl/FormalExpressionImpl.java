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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.FormalExpression;
import org.obeonetwork.dsl.bpmn2.ItemDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FormalExpressionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FormalExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.FormalExpressionImpl#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalExpressionImpl extends ExpressionImpl implements
		FormalExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.FORMAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return (String) eGet(Bpmn2Package.Literals.FORMAL_EXPRESSION__LANGUAGE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		eSet(Bpmn2Package.Literals.FORMAL_EXPRESSION__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBody() {
		return (EObject) eGet(Bpmn2Package.Literals.FORMAL_EXPRESSION__BODY,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(EObject newBody) {
		eSet(Bpmn2Package.Literals.FORMAL_EXPRESSION__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getEvaluatesToTypeRef() {
		return (ItemDefinition) eGet(
				Bpmn2Package.Literals.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluatesToTypeRef(ItemDefinition newEvaluatesToTypeRef) {
		eSet(Bpmn2Package.Literals.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF,
				newEvaluatesToTypeRef);
	}

} //FormalExpressionImpl
