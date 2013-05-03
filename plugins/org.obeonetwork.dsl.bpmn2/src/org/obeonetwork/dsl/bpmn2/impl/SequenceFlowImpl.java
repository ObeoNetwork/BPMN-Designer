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
import org.obeonetwork.dsl.bpmn2.Expression;
import org.obeonetwork.dsl.bpmn2.FlowNode;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceFlowImpl extends FlowElementImpl implements SequenceFlow {
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
		return (Boolean) eGet(
				Bpmn2Package.Literals.SEQUENCE_FLOW__IS_IMMEDIATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImmediate(boolean newIsImmediate) {
		eSet(Bpmn2Package.Literals.SEQUENCE_FLOW__IS_IMMEDIATE, newIsImmediate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getConditionExpression() {
		return (Expression) eGet(
				Bpmn2Package.Literals.SEQUENCE_FLOW__CONDITION_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionExpression(Expression newConditionExpression) {
		eSet(Bpmn2Package.Literals.SEQUENCE_FLOW__CONDITION_EXPRESSION,
				newConditionExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getTargetRef() {
		return (FlowNode) eGet(Bpmn2Package.Literals.SEQUENCE_FLOW__TARGET_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(FlowNode newTargetRef) {
		eSet(Bpmn2Package.Literals.SEQUENCE_FLOW__TARGET_REF, newTargetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getSourceRef() {
		return (FlowNode) eGet(Bpmn2Package.Literals.SEQUENCE_FLOW__SOURCE_REF,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(FlowNode newSourceRef) {
		eSet(Bpmn2Package.Literals.SEQUENCE_FLOW__SOURCE_REF, newSourceRef);
	}

} //SequenceFlowImpl
