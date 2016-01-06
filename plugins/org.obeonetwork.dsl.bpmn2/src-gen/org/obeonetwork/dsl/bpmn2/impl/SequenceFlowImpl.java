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
import org.obeonetwork.dsl.bpmn2.Expression;
import org.obeonetwork.dsl.bpmn2.FlowNode;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceFlowImpl extends FlowElementImpl implements SequenceFlow {
	/**
	 * The default value of the '{@link #isIsImmediate() <em>Is Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImmediate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMMEDIATE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.SEQUENCE_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsImmediate() {
		return (Boolean) eDynamicGet(Bpmn2Package.SEQUENCE_FLOW__IS_IMMEDIATE,
				Bpmn2Package.Literals.SEQUENCE_FLOW__IS_IMMEDIATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImmediate(boolean newIsImmediate) {
		eDynamicSet(Bpmn2Package.SEQUENCE_FLOW__IS_IMMEDIATE, Bpmn2Package.Literals.SEQUENCE_FLOW__IS_IMMEDIATE,
				newIsImmediate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getConditionExpression() {
		return (Expression) eDynamicGet(Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION,
				Bpmn2Package.Literals.SEQUENCE_FLOW__CONDITION_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionExpression(Expression newConditionExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newConditionExpression,
				Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionExpression(Expression newConditionExpression) {
		eDynamicSet(Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION,
				Bpmn2Package.Literals.SEQUENCE_FLOW__CONDITION_EXPRESSION, newConditionExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getTargetRef() {
		return (FlowNode) eDynamicGet(Bpmn2Package.SEQUENCE_FLOW__TARGET_REF,
				Bpmn2Package.Literals.SEQUENCE_FLOW__TARGET_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetTargetRef() {
		return (FlowNode) eDynamicGet(Bpmn2Package.SEQUENCE_FLOW__TARGET_REF,
				Bpmn2Package.Literals.SEQUENCE_FLOW__TARGET_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetRef(FlowNode newTargetRef, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTargetRef, Bpmn2Package.SEQUENCE_FLOW__TARGET_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(FlowNode newTargetRef) {
		eDynamicSet(Bpmn2Package.SEQUENCE_FLOW__TARGET_REF, Bpmn2Package.Literals.SEQUENCE_FLOW__TARGET_REF,
				newTargetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getSourceRef() {
		return (FlowNode) eDynamicGet(Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF,
				Bpmn2Package.Literals.SEQUENCE_FLOW__SOURCE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetSourceRef() {
		return (FlowNode) eDynamicGet(Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF,
				Bpmn2Package.Literals.SEQUENCE_FLOW__SOURCE_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRef(FlowNode newSourceRef, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newSourceRef, Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(FlowNode newSourceRef) {
		eDynamicSet(Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF, Bpmn2Package.Literals.SEQUENCE_FLOW__SOURCE_REF,
				newSourceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			FlowNode targetRef = basicGetTargetRef();
			if (targetRef != null)
				msgs = ((InternalEObject) targetRef).eInverseRemove(this, Bpmn2Package.FLOW_NODE__INCOMING,
						FlowNode.class, msgs);
			return basicSetTargetRef((FlowNode) otherEnd, msgs);
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			FlowNode sourceRef = basicGetSourceRef();
			if (sourceRef != null)
				msgs = ((InternalEObject) sourceRef).eInverseRemove(this, Bpmn2Package.FLOW_NODE__OUTGOING,
						FlowNode.class, msgs);
			return basicSetSourceRef((FlowNode) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			return basicSetConditionExpression(null, msgs);
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			return basicSetTargetRef(null, msgs);
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			return basicSetSourceRef(null, msgs);
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
		case Bpmn2Package.SEQUENCE_FLOW__IS_IMMEDIATE:
			return isIsImmediate();
		case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			return getConditionExpression();
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			if (resolve)
				return getTargetRef();
			return basicGetTargetRef();
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			if (resolve)
				return getSourceRef();
			return basicGetSourceRef();
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
		case Bpmn2Package.SEQUENCE_FLOW__IS_IMMEDIATE:
			setIsImmediate((Boolean) newValue);
			return;
		case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			setConditionExpression((Expression) newValue);
			return;
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			setTargetRef((FlowNode) newValue);
			return;
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			setSourceRef((FlowNode) newValue);
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
		case Bpmn2Package.SEQUENCE_FLOW__IS_IMMEDIATE:
			setIsImmediate(IS_IMMEDIATE_EDEFAULT);
			return;
		case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			setConditionExpression((Expression) null);
			return;
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			setTargetRef((FlowNode) null);
			return;
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			setSourceRef((FlowNode) null);
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
		case Bpmn2Package.SEQUENCE_FLOW__IS_IMMEDIATE:
			return isIsImmediate() != IS_IMMEDIATE_EDEFAULT;
		case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			return getConditionExpression() != null;
		case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
			return basicGetTargetRef() != null;
		case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
			return basicGetSourceRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceFlowImpl
