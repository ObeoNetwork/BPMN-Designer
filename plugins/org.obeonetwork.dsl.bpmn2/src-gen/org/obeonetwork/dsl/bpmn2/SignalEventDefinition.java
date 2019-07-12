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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getSignalEventDefinition()
 * @model
 * @generated
 */
public interface SignalEventDefinition extends EventDefinition {
    /**
     * Returns the value of the '<em><b>Signal Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signal Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Signal Ref</em>' reference.
     * @see #setSignalRef(Signal)
     * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getSignalEventDefinition_SignalRef()
     * @model ordered="false"
     * @generated
     */
    Signal getSignalRef();

    /**
     * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signal Ref</em>' reference.
     * @see #getSignalRef()
     * @generated
     */
    void setSignalRef(Signal value);

} // SignalEventDefinition
