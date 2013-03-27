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

import org.eclipse.dd.di.Diagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.bpmdi.BPMNDiagram#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.bpmdi.BPMNDiagram#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn2.bpmdi.BpmnDiPackage#getBPMNDiagram()
 * @model
 * @generated
 */
public interface BPMNDiagram extends Diagram {
    /**
     * Returns the value of the '<em><b>Plane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plane</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plane</em>' containment reference.
     * @see #setPlane(BPMNPlane)
     * @see org.eclipse.bpmn2.bpmdi.BpmnDiPackage#getBPMNDiagram_Plane()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    BPMNPlane getPlane();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn2.bpmdi.BPMNDiagram#getPlane <em>Plane</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plane</em>' containment reference.
     * @see #getPlane()
     * @generated
     */
    void setPlane(BPMNPlane value);

    /**
     * Returns the value of the '<em><b>Label Style</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.bpmdi.BPMNLabelStyle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label Style</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label Style</em>' containment reference list.
     * @see org.eclipse.bpmn2.bpmdi.BpmnDiPackage#getBPMNDiagram_LabelStyle()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<BPMNLabelStyle> getLabelStyle();

} // BPMNDiagram
