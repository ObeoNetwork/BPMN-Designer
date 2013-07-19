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
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Lane#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Lane#getChildLaneSet <em>Child Lane Set</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Lane#getPartitionElementRef <em>Partition Element Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Lane#getFlowNodeRefs <em>Flow Node Refs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.Lane#getPartitionElement <em>Partition Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getLane()
 * @model
 * @generated
 */
public interface Lane extends BaseElement {
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
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getLane_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Lane#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Child Lane Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Lane Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Lane Set</em>' containment reference.
	 * @see #setChildLaneSet(LaneSet)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getLane_ChildLaneSet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	LaneSet getChildLaneSet();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Lane#getChildLaneSet <em>Child Lane Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Lane Set</em>' containment reference.
	 * @see #getChildLaneSet()
	 * @generated
	 */
	void setChildLaneSet(LaneSet value);

	/**
	 * Returns the value of the '<em><b>Partition Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Element Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Element Ref</em>' reference.
	 * @see #setPartitionElementRef(BaseElement)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getLane_PartitionElementRef()
	 * @model ordered="false"
	 * @generated
	 */
	BaseElement getPartitionElementRef();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Lane#getPartitionElementRef <em>Partition Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Element Ref</em>' reference.
	 * @see #getPartitionElementRef()
	 * @generated
	 */
	void setPartitionElementRef(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Flow Node Refs</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.FlowNode}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.FlowNode#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Node Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Node Refs</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getLane_FlowNodeRefs()
	 * @see org.obeonetwork.dsl.bpmn2.FlowNode#getLanes
	 * @model opposite="lanes" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList<FlowNode> getFlowNodeRefs();

	/**
	 * Returns the value of the '<em><b>Partition Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Element</em>' containment reference.
	 * @see #setPartitionElement(BaseElement)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getLane_PartitionElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	BaseElement getPartitionElement();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.Lane#getPartitionElement <em>Partition Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Element</em>' containment reference.
	 * @see #getPartitionElement()
	 * @generated
	 */
	void setPartitionElement(BaseElement value);

} // Lane
