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
package org.obeonetwork.dsl.dd.di.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.dd.di.DiPackage;
import org.obeonetwork.dsl.dd.di.Diagram;
import org.obeonetwork.dsl.dd.di.DiagramElement;
import org.obeonetwork.dsl.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramElementImpl#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramElementImpl#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramElementImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramElementImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends CDOObjectImpl implements
		DiagramElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getOwningDiagram() {
		return (Diagram) eGet(
				DiPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement getOwningElement() {
		return (DiagramElement) eGet(
				DiPackage.Literals.DIAGRAM_ELEMENT__OWNING_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DiagramElement> getOwnedElement() {
		return (EList<DiagramElement>) eGet(
				DiPackage.Literals.DIAGRAM_ELEMENT__OWNED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getModelElement() {
		return (EObject) eGet(
				DiPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Style getStyle() {
		return (Style) eGet(DiPackage.Literals.DIAGRAM_ELEMENT__STYLE, true);
	}

} //DiagramElementImpl
