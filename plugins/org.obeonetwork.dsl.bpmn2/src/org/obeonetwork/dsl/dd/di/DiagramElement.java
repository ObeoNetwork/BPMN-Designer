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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dd.di.DiagramElement#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.DiagramElement#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.DiagramElement#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.DiagramElement#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.DiagramElement#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Diagram</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.dd.di.Diagram#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Diagram</em>' reference.
	 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagramElement_OwningDiagram()
	 * @see org.obeonetwork.dsl.dd.di.Diagram#getRootElement
	 * @model opposite="rootElement" resolveProxies="false" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	Diagram getOwningDiagram();

	/**
	 * Returns the value of the '<em><b>Owning Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.dd.di.DiagramElement#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Element</em>' reference.
	 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagramElement_OwningElement()
	 * @see org.obeonetwork.dsl.dd.di.DiagramElement#getOwnedElement
	 * @model opposite="ownedElement" resolveProxies="false" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getOwningElement();

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.dd.di.DiagramElement}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.dd.di.DiagramElement#getOwningElement <em>Owning Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagramElement_OwnedElement()
	 * @see org.obeonetwork.dsl.dd.di.DiagramElement#getOwningElement
	 * @model opposite="owningElement" resolveProxies="false" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList<DiagramElement> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagramElement_ModelElement()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EObject getModelElement();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' reference.
	 * @see org.obeonetwork.dsl.dd.di.DiPackage#getDiagramElement_Style()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	Style getStyle();

} // DiagramElement
