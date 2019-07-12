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
 * A representation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.SubProcess#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getSubProcess()
 * @model
 * @generated
 */
public interface SubProcess extends Activity, FlowElementsContainer {
    /**
     * Returns the value of the '<em><b>Triggered By Event</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Triggered By Event</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Triggered By Event</em>' attribute.
     * @see #setTriggeredByEvent(boolean)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getSubProcess_TriggeredByEvent()
     * @model default="false" required="true" ordered="false"
     * @generated
     */
    boolean isTriggeredByEvent();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Triggered By Event</em>' attribute.
     * @see #isTriggeredByEvent()
     * @generated
     */
    void setTriggeredByEvent(boolean value);

    /**
     * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
     * The list contents are of type {@link org.obeonetwork.dsl.bpmn2.Artifact}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifacts</em>' containment reference list.
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getSubProcess_Artifacts()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Artifact> getArtifacts();

} // SubProcess
