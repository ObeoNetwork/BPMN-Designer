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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyBindingImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyBindingImpl#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorrelationPropertyBindingImpl extends BaseElementImpl implements CorrelationPropertyBinding {
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
		return (FormalExpression) eDynamicGet(Bpmn2Package.CORRELATION_PROPERTY_BINDING__DATA_PATH,
				Bpmn2Package.Literals.CORRELATION_PROPERTY_BINDING__DATA_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPath(FormalExpression newDataPath, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newDataPath, Bpmn2Package.CORRELATION_PROPERTY_BINDING__DATA_PATH,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPath(FormalExpression newDataPath) {
		eDynamicSet(Bpmn2Package.CORRELATION_PROPERTY_BINDING__DATA_PATH,
				Bpmn2Package.Literals.CORRELATION_PROPERTY_BINDING__DATA_PATH, newDataPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty getCorrelationPropertyRef() {
		return (CorrelationProperty) eDynamicGet(Bpmn2Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF,
				Bpmn2Package.Literals.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty basicGetCorrelationPropertyRef() {
		return (CorrelationProperty) eDynamicGet(Bpmn2Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF,
				Bpmn2Package.Literals.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationPropertyRef(CorrelationProperty newCorrelationPropertyRef) {
		eDynamicSet(Bpmn2Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF,
				Bpmn2Package.Literals.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF,
				newCorrelationPropertyRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.CORRELATION_PROPERTY_BINDING__DATA_PATH:
			return basicSetDataPath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.CORRELATION_PROPERTY_BINDING__DATA_PATH:
			return getDataPath();
		case Bpmn2Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
			if (resolve)
				return getCorrelationPropertyRef();
			return basicGetCorrelationPropertyRef();
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
		case Bpmn2Package.CORRELATION_PROPERTY_BINDING__DATA_PATH:
			setDataPath((FormalExpression) newValue);
			return;
		case Bpmn2Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
			setCorrelationPropertyRef((CorrelationProperty) newValue);
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
		case Bpmn2Package.CORRELATION_PROPERTY_BINDING__DATA_PATH:
			setDataPath((FormalExpression) null);
			return;
		case Bpmn2Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
			setCorrelationPropertyRef((CorrelationProperty) null);
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
		case Bpmn2Package.CORRELATION_PROPERTY_BINDING__DATA_PATH:
			return getDataPath() != null;
		case Bpmn2Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
			return basicGetCorrelationPropertyRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //CorrelationPropertyBindingImpl
