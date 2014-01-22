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
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

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
		return (String) eDynamicGet(Bpmn2Package.FORMAL_EXPRESSION__LANGUAGE,
				Bpmn2Package.Literals.FORMAL_EXPRESSION__LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		eDynamicSet(Bpmn2Package.FORMAL_EXPRESSION__LANGUAGE,
				Bpmn2Package.Literals.FORMAL_EXPRESSION__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBody() {
		return (EObject) eDynamicGet(Bpmn2Package.FORMAL_EXPRESSION__BODY,
				Bpmn2Package.Literals.FORMAL_EXPRESSION__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetBody() {
		return (EObject) eDynamicGet(Bpmn2Package.FORMAL_EXPRESSION__BODY,
				Bpmn2Package.Literals.FORMAL_EXPRESSION__BODY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(EObject newBody) {
		eDynamicSet(Bpmn2Package.FORMAL_EXPRESSION__BODY,
				Bpmn2Package.Literals.FORMAL_EXPRESSION__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getEvaluatesToTypeRef() {
		return (ItemDefinition) eDynamicGet(
				Bpmn2Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF,
				Bpmn2Package.Literals.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetEvaluatesToTypeRef() {
		return (ItemDefinition) eDynamicGet(
				Bpmn2Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF,
				Bpmn2Package.Literals.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluatesToTypeRef(ItemDefinition newEvaluatesToTypeRef) {
		eDynamicSet(Bpmn2Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF,
				Bpmn2Package.Literals.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF,
				newEvaluatesToTypeRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.FORMAL_EXPRESSION__LANGUAGE:
			return getLanguage();
		case Bpmn2Package.FORMAL_EXPRESSION__BODY:
			if (resolve)
				return getBody();
			return basicGetBody();
		case Bpmn2Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
			if (resolve)
				return getEvaluatesToTypeRef();
			return basicGetEvaluatesToTypeRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.FORMAL_EXPRESSION__LANGUAGE:
			setLanguage((String) newValue);
			return;
		case Bpmn2Package.FORMAL_EXPRESSION__BODY:
			setBody((EObject) newValue);
			return;
		case Bpmn2Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
			setEvaluatesToTypeRef((ItemDefinition) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Bpmn2Package.FORMAL_EXPRESSION__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
			return;
		case Bpmn2Package.FORMAL_EXPRESSION__BODY:
			setBody((EObject) null);
			return;
		case Bpmn2Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
			setEvaluatesToTypeRef((ItemDefinition) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Bpmn2Package.FORMAL_EXPRESSION__LANGUAGE:
			return LANGUAGE_EDEFAULT == null ? getLanguage() != null
					: !LANGUAGE_EDEFAULT.equals(getLanguage());
		case Bpmn2Package.FORMAL_EXPRESSION__BODY:
			return basicGetBody() != null;
		case Bpmn2Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
			return basicGetEvaluatesToTypeRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //FormalExpressionImpl
