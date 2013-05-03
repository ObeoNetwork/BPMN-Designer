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
package org.obeonetwork.dsl.dd.dc.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.obeonetwork.dsl.dd.dc.DcPackage;
import org.obeonetwork.dsl.dd.dc.Font;

import org.obeonetwork.dsl.dd.dc.util.DcValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dd.dc.impl.FontImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.dc.impl.FontImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.dc.impl.FontImpl#isIsBold <em>Is Bold</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.dc.impl.FontImpl#isIsItalic <em>Is Italic</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.dc.impl.FontImpl#isIsUnderline <em>Is Underline</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dd.dc.impl.FontImpl#isIsStrikeThrough <em>Is Strike Through</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontImpl extends CDOObjectImpl implements Font {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcPackage.Literals.FONT;
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
		return (String) eGet(DcPackage.Literals.FONT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(DcPackage.Literals.FONT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSize() {
		return (Float) eGet(DcPackage.Literals.FONT__SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(float newSize) {
		eSet(DcPackage.Literals.FONT__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBold() {
		return (Boolean) eGet(DcPackage.Literals.FONT__IS_BOLD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBold(boolean newIsBold) {
		eSet(DcPackage.Literals.FONT__IS_BOLD, newIsBold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsItalic() {
		return (Boolean) eGet(DcPackage.Literals.FONT__IS_ITALIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsItalic(boolean newIsItalic) {
		eSet(DcPackage.Literals.FONT__IS_ITALIC, newIsItalic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnderline() {
		return (Boolean) eGet(DcPackage.Literals.FONT__IS_UNDERLINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnderline(boolean newIsUnderline) {
		eSet(DcPackage.Literals.FONT__IS_UNDERLINE, newIsUnderline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStrikeThrough() {
		return (Boolean) eGet(DcPackage.Literals.FONT__IS_STRIKE_THROUGH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStrikeThrough(boolean newIsStrikeThrough) {
		eSet(DcPackage.Literals.FONT__IS_STRIKE_THROUGH, newIsStrikeThrough);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean non_negative_size(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
						DcValidator.DIAGNOSTIC_SOURCE,
						DcValidator.FONT__NON_NEGATIVE_SIZE,
						EcorePlugin.INSTANCE.getString(
								"_UI_GenericInvariant_diagnostic",
								new Object[] {
										"non_negative_size",
										EObjectValidator.getObjectLabel(this,
												context) }),
						new Object[] { this }));
			}
			return false;
		}
		return true;
	}

} //FontImpl
