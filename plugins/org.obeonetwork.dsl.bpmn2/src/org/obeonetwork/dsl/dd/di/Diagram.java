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

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dd.di.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.Diagram#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.Diagram#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.Diagram#getOwnedStyle <em>Owned Style</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.Diagram#getRootElement <em>Root Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagram()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Diagram extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagram_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dd.di.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagram_Documentation()
	 * @model ordered="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dd.di.Diagram#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(float)
	 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagram_Resolution()
	 * @model ordered="false"
	 * @generated
	 */
	float getResolution();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dd.di.Diagram#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(float value);

	/**
	 * Returns the value of the '<em><b>Owned Style</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.dd.di.Style}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Style</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Style</em>' reference list.
	 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagram_OwnedStyle()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList<Style> getOwnedStyle();

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.dd.di.DiagramElement#getOwningDiagram <em>Owning Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' reference.
	 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagram_RootElement()
	 * @see org.obeonetwork.dsl.dd.di.DiagramElement#getOwningDiagram
	 * @model opposite="owningDiagram" resolveProxies="false" required="true" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getRootElement();

} // Diagram
