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
package org.obeonetwork.dsl.bpmn2.bpmdi;

import org.obeonetwork.dsl.dd.di.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage#getBPMNLabel()
 * @model
 * @generated
 */
public interface BPMNLabel extends Label {
	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style</em>' reference.
	 * @see #setLabelStyle(BPMNLabelStyle)
	 * @see org.obeonetwork.dsl.bpmn2.bpmdi.BpmnDiPackage#getBPMNLabel_LabelStyle()
	 * @model ordered="false"
	 * @generated
	 */
	BPMNLabelStyle getLabelStyle();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabel#getLabelStyle <em>Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Style</em>' reference.
	 * @see #getLabelStyle()
	 * @generated
	 */
	void setLabelStyle(BPMNLabelStyle value);

} // BPMNLabel
