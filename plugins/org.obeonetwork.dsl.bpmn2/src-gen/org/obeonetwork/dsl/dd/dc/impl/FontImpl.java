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

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_EDEFAULT = 0.0F;
	/**
	 * The default value of the '{@link #isIsBold() <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BOLD_EDEFAULT = false;
	/**
	 * The default value of the '{@link #isIsItalic() <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ITALIC_EDEFAULT = false;
	/**
	 * The default value of the '{@link #isIsUnderline() <em>Is Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNDERLINE_EDEFAULT = false;
	/**
	 * The default value of the '{@link #isIsStrikeThrough() <em>Is Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrikeThrough()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRIKE_THROUGH_EDEFAULT = false;

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
		return (String) eDynamicGet(DcPackage.FONT__NAME,
				DcPackage.Literals.FONT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(DcPackage.FONT__NAME, DcPackage.Literals.FONT__NAME,
				newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSize() {
		return (Float) eDynamicGet(DcPackage.FONT__SIZE,
				DcPackage.Literals.FONT__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(float newSize) {
		eDynamicSet(DcPackage.FONT__SIZE, DcPackage.Literals.FONT__SIZE,
				newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBold() {
		return (Boolean) eDynamicGet(DcPackage.FONT__IS_BOLD,
				DcPackage.Literals.FONT__IS_BOLD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBold(boolean newIsBold) {
		eDynamicSet(DcPackage.FONT__IS_BOLD, DcPackage.Literals.FONT__IS_BOLD,
				newIsBold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsItalic() {
		return (Boolean) eDynamicGet(DcPackage.FONT__IS_ITALIC,
				DcPackage.Literals.FONT__IS_ITALIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsItalic(boolean newIsItalic) {
		eDynamicSet(DcPackage.FONT__IS_ITALIC,
				DcPackage.Literals.FONT__IS_ITALIC, newIsItalic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnderline() {
		return (Boolean) eDynamicGet(DcPackage.FONT__IS_UNDERLINE,
				DcPackage.Literals.FONT__IS_UNDERLINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnderline(boolean newIsUnderline) {
		eDynamicSet(DcPackage.FONT__IS_UNDERLINE,
				DcPackage.Literals.FONT__IS_UNDERLINE, newIsUnderline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStrikeThrough() {
		return (Boolean) eDynamicGet(DcPackage.FONT__IS_STRIKE_THROUGH,
				DcPackage.Literals.FONT__IS_STRIKE_THROUGH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStrikeThrough(boolean newIsStrikeThrough) {
		eDynamicSet(DcPackage.FONT__IS_STRIKE_THROUGH,
				DcPackage.Literals.FONT__IS_STRIKE_THROUGH, newIsStrikeThrough);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DcPackage.FONT__NAME:
			return getName();
		case DcPackage.FONT__SIZE:
			return getSize();
		case DcPackage.FONT__IS_BOLD:
			return isIsBold();
		case DcPackage.FONT__IS_ITALIC:
			return isIsItalic();
		case DcPackage.FONT__IS_UNDERLINE:
			return isIsUnderline();
		case DcPackage.FONT__IS_STRIKE_THROUGH:
			return isIsStrikeThrough();
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
		case DcPackage.FONT__NAME:
			setName((String) newValue);
			return;
		case DcPackage.FONT__SIZE:
			setSize((Float) newValue);
			return;
		case DcPackage.FONT__IS_BOLD:
			setIsBold((Boolean) newValue);
			return;
		case DcPackage.FONT__IS_ITALIC:
			setIsItalic((Boolean) newValue);
			return;
		case DcPackage.FONT__IS_UNDERLINE:
			setIsUnderline((Boolean) newValue);
			return;
		case DcPackage.FONT__IS_STRIKE_THROUGH:
			setIsStrikeThrough((Boolean) newValue);
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
		case DcPackage.FONT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DcPackage.FONT__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case DcPackage.FONT__IS_BOLD:
			setIsBold(IS_BOLD_EDEFAULT);
			return;
		case DcPackage.FONT__IS_ITALIC:
			setIsItalic(IS_ITALIC_EDEFAULT);
			return;
		case DcPackage.FONT__IS_UNDERLINE:
			setIsUnderline(IS_UNDERLINE_EDEFAULT);
			return;
		case DcPackage.FONT__IS_STRIKE_THROUGH:
			setIsStrikeThrough(IS_STRIKE_THROUGH_EDEFAULT);
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
		case DcPackage.FONT__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT
					.equals(getName());
		case DcPackage.FONT__SIZE:
			return getSize() != SIZE_EDEFAULT;
		case DcPackage.FONT__IS_BOLD:
			return isIsBold() != IS_BOLD_EDEFAULT;
		case DcPackage.FONT__IS_ITALIC:
			return isIsItalic() != IS_ITALIC_EDEFAULT;
		case DcPackage.FONT__IS_UNDERLINE:
			return isIsUnderline() != IS_UNDERLINE_EDEFAULT;
		case DcPackage.FONT__IS_STRIKE_THROUGH:
			return isIsStrikeThrough() != IS_STRIKE_THROUGH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //FontImpl
