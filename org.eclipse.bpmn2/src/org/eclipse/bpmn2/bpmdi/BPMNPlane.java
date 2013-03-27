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
package org.eclipse.bpmn2.bpmdi;

import org.eclipse.bpmn2.BaseElement;

import org.eclipse.dd.di.Plane;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.bpmdi.BPMNPlane#getBpmnElement <em>Bpmn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn2.bpmdi.BpmnDiPackage#getBPMNPlane()
 * @model
 * @generated
 */
public interface BPMNPlane extends Plane {
    /**
     * Returns the value of the '<em><b>Bpmn Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bpmn Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bpmn Element</em>' reference.
     * @see #setBpmnElement(BaseElement)
     * @see org.eclipse.bpmn2.bpmdi.BpmnDiPackage#getBPMNPlane_BpmnElement()
     * @model ordered="false"
     * @generated
     */
    BaseElement getBpmnElement();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn2.bpmdi.BPMNPlane#getBpmnElement <em>Bpmn Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bpmn Element</em>' reference.
     * @see #getBpmnElement()
     * @generated
     */
    void setBpmnElement(BaseElement value);

} // BPMNPlane
