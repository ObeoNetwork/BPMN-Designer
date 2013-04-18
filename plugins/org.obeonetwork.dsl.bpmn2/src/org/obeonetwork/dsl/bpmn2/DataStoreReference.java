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
 * A representation of the model object '<em><b>Data Store Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getDataStoreReference()
 * @model
 * @generated
 */
public interface DataStoreReference extends FlowElement, ItemAwareElement {
	/**
	 * Returns the value of the '<em><b>Data Store Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Store Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Store Ref</em>' reference.
	 * @see #setDataStoreRef(DataStore)
	 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Package#getDataStoreReference_DataStoreRef()
	 * @model ordered="false"
	 * @generated
	 */
	DataStore getDataStoreRef();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.bpmn2.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Store Ref</em>' reference.
	 * @see #getDataStoreRef()
	 * @generated
	 */
	void setDataStoreRef(DataStore value);

} // DataStoreReference
