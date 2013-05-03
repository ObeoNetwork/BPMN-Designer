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
package org.obeonetwork.dsl.bpmn2.bpmdi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.bpmn2.BaseElement;

import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNEdge;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel;
import org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage;
import org.obeonetwork.dsl.bpmn2.bpmdi.MessageVisibleKind;

import org.obeonetwork.dsl.dd.di.DiagramElement;

import org.obeonetwork.dsl.dd.di.impl.LabeledEdgeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNEdgeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNEdgeImpl#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNEdgeImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNEdgeImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNEdgeImpl#getMessageVisibleKind <em>Message Visible Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNEdgeImpl extends LabeledEdgeImpl implements BPMNEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnDiPackage.Literals.BPMN_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabel getLabel() {
		return (BPMNLabel) eGet(BpmnDiPackage.Literals.BPMN_EDGE__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(BPMNLabel newLabel) {
		eSet(BpmnDiPackage.Literals.BPMN_EDGE__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getBpmnElement() {
		return (BaseElement) eGet(
				BpmnDiPackage.Literals.BPMN_EDGE__BPMN_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmnElement(BaseElement newBpmnElement) {
		eSet(BpmnDiPackage.Literals.BPMN_EDGE__BPMN_ELEMENT, newBpmnElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement getSourceElement() {
		return (DiagramElement) eGet(
				BpmnDiPackage.Literals.BPMN_EDGE__SOURCE_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElement(DiagramElement newSourceElement) {
		eSet(BpmnDiPackage.Literals.BPMN_EDGE__SOURCE_ELEMENT, newSourceElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement getTargetElement() {
		return (DiagramElement) eGet(
				BpmnDiPackage.Literals.BPMN_EDGE__TARGET_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetElement(DiagramElement newTargetElement) {
		eSet(BpmnDiPackage.Literals.BPMN_EDGE__TARGET_ELEMENT, newTargetElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageVisibleKind getMessageVisibleKind() {
		return (MessageVisibleKind) eGet(
				BpmnDiPackage.Literals.BPMN_EDGE__MESSAGE_VISIBLE_KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageVisibleKind(MessageVisibleKind newMessageVisibleKind) {
		eSet(BpmnDiPackage.Literals.BPMN_EDGE__MESSAGE_VISIBLE_KIND,
				newMessageVisibleKind);
	}

} //BPMNEdgeImpl
