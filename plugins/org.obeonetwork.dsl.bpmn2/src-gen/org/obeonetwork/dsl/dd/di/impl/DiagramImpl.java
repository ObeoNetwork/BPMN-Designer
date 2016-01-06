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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.obeonetwork.dsl.bpmn2.BPMN2ObjectImpl;
import org.obeonetwork.dsl.dd.di.DiPackage;
import org.obeonetwork.dsl.dd.di.Diagram;
import org.obeonetwork.dsl.dd.di.DiagramElement;
import org.obeonetwork.dsl.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramImpl#getOwnedStyle <em>Owned Style</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.di.impl.DiagramImpl#getRootElement <em>Root Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramImpl extends BPMN2ObjectImpl implements Diagram {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final float RESOLUTION_EDEFAULT = 0.0F;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiPackage.Literals.DIAGRAM;
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
	public String getName() {
		return (String) eDynamicGet(DiPackage.DIAGRAM__NAME, DiPackage.Literals.DIAGRAM__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(DiPackage.DIAGRAM__NAME, DiPackage.Literals.DIAGRAM__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return (String) eDynamicGet(DiPackage.DIAGRAM__DOCUMENTATION, DiPackage.Literals.DIAGRAM__DOCUMENTATION, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		eDynamicSet(DiPackage.DIAGRAM__DOCUMENTATION, DiPackage.Literals.DIAGRAM__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getResolution() {
		return (Float) eDynamicGet(DiPackage.DIAGRAM__RESOLUTION, DiPackage.Literals.DIAGRAM__RESOLUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(float newResolution) {
		eDynamicSet(DiPackage.DIAGRAM__RESOLUTION, DiPackage.Literals.DIAGRAM__RESOLUTION, newResolution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Style> getOwnedStyle() {
		return (EList<Style>) eDynamicGet(DiPackage.DIAGRAM__OWNED_STYLE, DiPackage.Literals.DIAGRAM__OWNED_STYLE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement getRootElement() {
		return (DiagramElement) eDynamicGet(DiPackage.DIAGRAM__ROOT_ELEMENT, DiPackage.Literals.DIAGRAM__ROOT_ELEMENT,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootElement(DiagramElement newRootElement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newRootElement, DiPackage.DIAGRAM__ROOT_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.DIAGRAM__ROOT_ELEMENT:
			DiagramElement rootElement = getRootElement();
			if (rootElement != null)
				msgs = ((InternalEObject) rootElement).eInverseRemove(this, DiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM,
						DiagramElement.class, msgs);
			return basicSetRootElement((DiagramElement) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiPackage.DIAGRAM__ROOT_ELEMENT:
			return basicSetRootElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiPackage.DIAGRAM__NAME:
			return getName();
		case DiPackage.DIAGRAM__DOCUMENTATION:
			return getDocumentation();
		case DiPackage.DIAGRAM__RESOLUTION:
			return getResolution();
		case DiPackage.DIAGRAM__OWNED_STYLE:
			return getOwnedStyle();
		case DiPackage.DIAGRAM__ROOT_ELEMENT:
			return getRootElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DiPackage.DIAGRAM__NAME:
			setName((String) newValue);
			return;
		case DiPackage.DIAGRAM__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
		case DiPackage.DIAGRAM__RESOLUTION:
			setResolution((Float) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DiPackage.DIAGRAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DiPackage.DIAGRAM__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case DiPackage.DIAGRAM__RESOLUTION:
			setResolution(RESOLUTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DiPackage.DIAGRAM__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case DiPackage.DIAGRAM__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null
					: !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
		case DiPackage.DIAGRAM__RESOLUTION:
			return getResolution() != RESOLUTION_EDEFAULT;
		case DiPackage.DIAGRAM__OWNED_STYLE:
			return !getOwnedStyle().isEmpty();
		case DiPackage.DIAGRAM__ROOT_ELEMENT:
			return getRootElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramImpl
