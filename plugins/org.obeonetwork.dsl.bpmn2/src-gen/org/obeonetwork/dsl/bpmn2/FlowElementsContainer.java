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
 * A representation of the model object '<em><b>Flow Elements Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.FlowElementsContainer#getLaneSets <em>Lane Sets</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowElementsContainer()
 * @model abstract="true"
 * @generated
 */
public interface FlowElementsContainer extends BaseElement {
    /**
     * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.FlowElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Elements</em>' containment reference list.
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowElementsContainer_FlowElements()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<FlowElement> getFlowElements();

    /**
     * Returns the value of the '<em><b>Lane Sets</b></em>' containment reference list.
     * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.LaneSet}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lane Sets</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lane Sets</em>' containment reference list.
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getFlowElementsContainer_LaneSets()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<LaneSet> getLaneSets();

} // FlowElementsContainer
