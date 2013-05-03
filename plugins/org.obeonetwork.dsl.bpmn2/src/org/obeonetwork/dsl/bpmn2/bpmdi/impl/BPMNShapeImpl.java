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

import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNShape;
import org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage;
import org.obeonetwork.dsl.bpmn2.bpmdi.ParticipantBandKind;

import org.obeonetwork.dsl.dd.di.impl.LabeledShapeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#isIsHorizontal <em>Is Horizontal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#isIsMarkerVisible <em>Is Marker Visible</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#isIsMessageVisible <em>Is Message Visible</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#getParticipantBandKind <em>Participant Band Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.impl.BPMNShapeImpl#getChoreographyActivityShape <em>Choreography Activity Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNShapeImpl extends LabeledShapeImpl implements BPMNShape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnDiPackage.Literals.BPMN_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getBpmnElement() {
		return (BaseElement) eGet(
				BpmnDiPackage.Literals.BPMN_SHAPE__BPMN_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmnElement(BaseElement newBpmnElement) {
		eSet(BpmnDiPackage.Literals.BPMN_SHAPE__BPMN_ELEMENT, newBpmnElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHorizontal() {
		return (Boolean) eGet(BpmnDiPackage.Literals.BPMN_SHAPE__IS_HORIZONTAL,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHorizontal(boolean newIsHorizontal) {
		eSet(BpmnDiPackage.Literals.BPMN_SHAPE__IS_HORIZONTAL, newIsHorizontal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExpanded() {
		return (Boolean) eGet(BpmnDiPackage.Literals.BPMN_SHAPE__IS_EXPANDED,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExpanded(boolean newIsExpanded) {
		eSet(BpmnDiPackage.Literals.BPMN_SHAPE__IS_EXPANDED, newIsExpanded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMarkerVisible() {
		return (Boolean) eGet(
				BpmnDiPackage.Literals.BPMN_SHAPE__IS_MARKER_VISIBLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMarkerVisible(boolean newIsMarkerVisible) {
		eSet(BpmnDiPackage.Literals.BPMN_SHAPE__IS_MARKER_VISIBLE,
				newIsMarkerVisible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabel getLabel() {
		return (BPMNLabel) eGet(BpmnDiPackage.Literals.BPMN_SHAPE__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(BPMNLabel newLabel) {
		eSet(BpmnDiPackage.Literals.BPMN_SHAPE__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMessageVisible() {
		return (Boolean) eGet(
				BpmnDiPackage.Literals.BPMN_SHAPE__IS_MESSAGE_VISIBLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMessageVisible(boolean newIsMessageVisible) {
		eSet(BpmnDiPackage.Literals.BPMN_SHAPE__IS_MESSAGE_VISIBLE,
				newIsMessageVisible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantBandKind getParticipantBandKind() {
		return (ParticipantBandKind) eGet(
				BpmnDiPackage.Literals.BPMN_SHAPE__PARTICIPANT_BAND_KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantBandKind(
			ParticipantBandKind newParticipantBandKind) {
		eSet(BpmnDiPackage.Literals.BPMN_SHAPE__PARTICIPANT_BAND_KIND,
				newParticipantBandKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNShape getChoreographyActivityShape() {
		return (BPMNShape) eGet(
				BpmnDiPackage.Literals.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoreographyActivityShape(
			BPMNShape newChoreographyActivityShape) {
		eSet(BpmnDiPackage.Literals.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE,
				newChoreographyActivityShape);
	}

} //BPMNShapeImpl
