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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn2.Bpmn2Package#getBoundaryEvent()
 * @model
 * @generated
 */
public interface BoundaryEvent extends CatchEvent {
    /**
     * Returns the value of the '<em><b>Cancel Activity</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cancel Activity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cancel Activity</em>' attribute.
     * @see #setCancelActivity(boolean)
     * @see org.eclipse.bpmn2.Bpmn2Package#getBoundaryEvent_CancelActivity()
     * @model default="true" required="true" ordered="false"
     * @generated
     */
    boolean isCancelActivity();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn2.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cancel Activity</em>' attribute.
     * @see #isCancelActivity()
     * @generated
     */
    void setCancelActivity(boolean value);

    /**
     * Returns the value of the '<em><b>Attached To Ref</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.eclipse.bpmn2.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attached To Ref</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attached To Ref</em>' reference.
     * @see #setAttachedToRef(Activity)
     * @see org.eclipse.bpmn2.Bpmn2Package#getBoundaryEvent_AttachedToRef()
     * @see org.eclipse.bpmn2.Activity#getBoundaryEventRefs
     * @model opposite="boundaryEventRefs" required="true" ordered="false"
     * @generated
     */
    Activity getAttachedToRef();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn2.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attached To Ref</em>' reference.
     * @see #getAttachedToRef()
     * @generated
     */
    void setAttachedToRef(Activity value);

} // BoundaryEvent
