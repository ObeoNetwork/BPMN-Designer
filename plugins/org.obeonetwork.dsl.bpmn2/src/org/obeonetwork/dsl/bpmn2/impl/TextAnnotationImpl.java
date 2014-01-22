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
package org.obeonetwork.dsl.bpmn2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.TextAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.TextAnnotationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.TextAnnotationImpl#getTextFormat <em>Text Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextAnnotationImpl extends ArtifactImpl implements TextAnnotation {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTextFormat() <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_FORMAT_EDEFAULT = "text/plain";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.TEXT_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String) eDynamicGet(Bpmn2Package.TEXT_ANNOTATION__TEXT,
				Bpmn2Package.Literals.TEXT_ANNOTATION__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eDynamicSet(Bpmn2Package.TEXT_ANNOTATION__TEXT,
				Bpmn2Package.Literals.TEXT_ANNOTATION__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextFormat() {
		return (String) eDynamicGet(Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT,
				Bpmn2Package.Literals.TEXT_ANNOTATION__TEXT_FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextFormat(String newTextFormat) {
		eDynamicSet(Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT,
				Bpmn2Package.Literals.TEXT_ANNOTATION__TEXT_FORMAT,
				newTextFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.TEXT_ANNOTATION__TEXT:
			return getText();
		case Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT:
			return getTextFormat();
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
		case Bpmn2Package.TEXT_ANNOTATION__TEXT:
			setText((String) newValue);
			return;
		case Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT:
			setTextFormat((String) newValue);
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
		case Bpmn2Package.TEXT_ANNOTATION__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT:
			setTextFormat(TEXT_FORMAT_EDEFAULT);
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
		case Bpmn2Package.TEXT_ANNOTATION__TEXT:
			return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT
					.equals(getText());
		case Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT:
			return TEXT_FORMAT_EDEFAULT == null ? getTextFormat() != null
					: !TEXT_FORMAT_EDEFAULT.equals(getTextFormat());
		}
		return super.eIsSet(featureID);
	}

} //TextAnnotationImpl
