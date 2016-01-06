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
package org.obeonetwork.dsl.dd.di;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dd.di.LabeledEdge#getOwnedLabel <em>Owned Label</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.dd.di.DiPackage#getLabeledEdge()
 * @model abstract="true"
 * @generated
 */
public interface LabeledEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Owned Label</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.dd.di.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Label</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Label</em>' reference list.
	 * @see org.obeonetwork.dsl.dd.di.DiPackage#getLabeledEdge_OwnedLabel()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList<Label> getOwnedLabel();

} // LabeledEdge
