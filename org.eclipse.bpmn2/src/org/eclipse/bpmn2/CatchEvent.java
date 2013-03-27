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
package org.eclipse.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.CatchEvent#isParallelMultiple <em>Parallel Multiple</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.CatchEvent#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.CatchEvent#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.CatchEvent#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.CatchEvent#getDataOutputs <em>Data Outputs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.CatchEvent#getEventDefinitions <em>Event Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn2.Bpmn2Package#getCatchEvent()
 * @model abstract="true"
 * @generated
 */
public interface CatchEvent extends Event {
    /**
     * Returns the value of the '<em><b>Parallel Multiple</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parallel Multiple</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parallel Multiple</em>' attribute.
     * @see #setParallelMultiple(boolean)
     * @see org.eclipse.bpmn2.Bpmn2Package#getCatchEvent_ParallelMultiple()
     * @model required="true" ordered="false"
     * @generated
     */
    boolean isParallelMultiple();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn2.CatchEvent#isParallelMultiple <em>Parallel Multiple</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parallel Multiple</em>' attribute.
     * @see #isParallelMultiple()
     * @generated
     */
    void setParallelMultiple(boolean value);

    /**
     * Returns the value of the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Set</em>' containment reference.
     * @see #setOutputSet(OutputSet)
     * @see org.eclipse.bpmn2.Bpmn2Package#getCatchEvent_OutputSet()
     * @model containment="true" ordered="false"
     * @generated
     */
    OutputSet getOutputSet();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn2.CatchEvent#getOutputSet <em>Output Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Set</em>' containment reference.
     * @see #getOutputSet()
     * @generated
     */
    void setOutputSet(OutputSet value);

    /**
     * Returns the value of the '<em><b>Event Definition Refs</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.EventDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Definition Refs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Definition Refs</em>' reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCatchEvent_EventDefinitionRefs()
     * @model ordered="false"
     * @generated
     */
    EList<EventDefinition> getEventDefinitionRefs();

    /**
     * Returns the value of the '<em><b>Data Output Association</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.DataOutputAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Output Association</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Output Association</em>' containment reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCatchEvent_DataOutputAssociation()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<DataOutputAssociation> getDataOutputAssociation();

    /**
     * Returns the value of the '<em><b>Data Outputs</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.DataOutput}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Outputs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Outputs</em>' containment reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCatchEvent_DataOutputs()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<DataOutput> getDataOutputs();

    /**
     * Returns the value of the '<em><b>Event Definitions</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn2.EventDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Definitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Definitions</em>' containment reference list.
     * @see org.eclipse.bpmn2.Bpmn2Package#getCatchEvent_EventDefinitions()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<EventDefinition> getEventDefinitions();

} // CatchEvent
