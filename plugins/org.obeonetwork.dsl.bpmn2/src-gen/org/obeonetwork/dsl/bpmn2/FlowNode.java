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
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FlowNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FlowNode#getLanes <em>Lanes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowNode()
 * @model abstract="true"
 * @generated
 */
public interface FlowNode extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowNode_Outgoing()
	 * @see org.obeonetwork.dsl.bpmn2.SequenceFlow#getSourceRef
	 * @model opposite="sourceRef"
	 * @generated
	 */
	EList<SequenceFlow> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowNode_Incoming()
	 * @see org.obeonetwork.dsl.bpmn2.SequenceFlow#getTargetRef
	 * @model opposite="targetRef" ordered="false"
	 * @generated
	 */
	EList<SequenceFlow> getIncoming();

	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.Lane}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.bpmn2.Lane#getFlowNodeRefs <em>Flow Node Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lanes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes</em>' reference list.
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowNode_Lanes()
	 * @see org.obeonetwork.dsl.bpmn2.Lane#getFlowNodeRefs
	 * @model opposite="flowNodeRefs" transient="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Lane> getLanes();

} // FlowNode
