/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.dd.dc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.dd.dc.DcFactory
 * @model kind="package"
 * @generated
 */
public interface DcPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "dc";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/DD/20100524/DC-XMI";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dc";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DcPackage eINSTANCE = org.eclipse.dd.dc.impl.DcPackageImpl.init();

    /**
     * The meta object id for the '{@link org.eclipse.dd.dc.impl.FontImpl <em>Font</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dd.dc.impl.FontImpl
     * @see org.eclipse.dd.dc.impl.DcPackageImpl#getFont()
     * @generated
     */
    int FONT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__NAME = 0;

    /**
     * The feature id for the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__SIZE = 1;

    /**
     * The feature id for the '<em><b>Is Bold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__IS_BOLD = 2;

    /**
     * The feature id for the '<em><b>Is Italic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__IS_ITALIC = 3;

    /**
     * The feature id for the '<em><b>Is Underline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__IS_UNDERLINE = 4;

    /**
     * The feature id for the '<em><b>Is Strike Through</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__IS_STRIKE_THROUGH = 5;

    /**
     * The number of structural features of the '<em>Font</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.eclipse.dd.dc.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dd.dc.impl.PointImpl
     * @see org.eclipse.dd.dc.impl.DcPackageImpl#getPoint()
     * @generated
     */
    int POINT = 1;

    /**
     * The feature id for the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT__X = 0;

    /**
     * The feature id for the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT__Y = 1;

    /**
     * The number of structural features of the '<em>Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.dd.dc.impl.BoundsImpl <em>Bounds</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dd.dc.impl.BoundsImpl
     * @see org.eclipse.dd.dc.impl.DcPackageImpl#getBounds()
     * @generated
     */
    int BOUNDS = 2;

    /**
     * The feature id for the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__X = 0;

    /**
     * The feature id for the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__Y = 1;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__WIDTH = 2;

    /**
     * The feature id for the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__HEIGHT = 3;

    /**
     * The number of structural features of the '<em>Bounds</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS_FEATURE_COUNT = 4;

    /**
     * Returns the meta object for class '{@link org.eclipse.dd.dc.Font <em>Font</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Font</em>'.
     * @see org.eclipse.dd.dc.Font
     * @generated
     */
    EClass getFont();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Font#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.dd.dc.Font#getName()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Font#getSize <em>Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size</em>'.
     * @see org.eclipse.dd.dc.Font#getSize()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_Size();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Font#isIsBold <em>Is Bold</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Bold</em>'.
     * @see org.eclipse.dd.dc.Font#isIsBold()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_IsBold();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Font#isIsItalic <em>Is Italic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Italic</em>'.
     * @see org.eclipse.dd.dc.Font#isIsItalic()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_IsItalic();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Font#isIsUnderline <em>Is Underline</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Underline</em>'.
     * @see org.eclipse.dd.dc.Font#isIsUnderline()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_IsUnderline();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Font#isIsStrikeThrough <em>Is Strike Through</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Strike Through</em>'.
     * @see org.eclipse.dd.dc.Font#isIsStrikeThrough()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_IsStrikeThrough();

    /**
     * Returns the meta object for class '{@link org.eclipse.dd.dc.Point <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Point</em>'.
     * @see org.eclipse.dd.dc.Point
     * @generated
     */
    EClass getPoint();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Point#getX <em>X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>X</em>'.
     * @see org.eclipse.dd.dc.Point#getX()
     * @see #getPoint()
     * @generated
     */
    EAttribute getPoint_X();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Point#getY <em>Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Y</em>'.
     * @see org.eclipse.dd.dc.Point#getY()
     * @see #getPoint()
     * @generated
     */
    EAttribute getPoint_Y();

    /**
     * Returns the meta object for class '{@link org.eclipse.dd.dc.Bounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bounds</em>'.
     * @see org.eclipse.dd.dc.Bounds
     * @generated
     */
    EClass getBounds();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Bounds#getX <em>X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>X</em>'.
     * @see org.eclipse.dd.dc.Bounds#getX()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_X();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Bounds#getY <em>Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Y</em>'.
     * @see org.eclipse.dd.dc.Bounds#getY()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Y();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Bounds#getWidth <em>Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Width</em>'.
     * @see org.eclipse.dd.dc.Bounds#getWidth()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Width();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dd.dc.Bounds#getHeight <em>Height</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Height</em>'.
     * @see org.eclipse.dd.dc.Bounds#getHeight()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Height();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DcFactory getDcFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.eclipse.dd.dc.impl.FontImpl <em>Font</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dd.dc.impl.FontImpl
         * @see org.eclipse.dd.dc.impl.DcPackageImpl#getFont()
         * @generated
         */
        EClass FONT = eINSTANCE.getFont();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__NAME = eINSTANCE.getFont_Name();

        /**
         * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__SIZE = eINSTANCE.getFont_Size();

        /**
         * The meta object literal for the '<em><b>Is Bold</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__IS_BOLD = eINSTANCE.getFont_IsBold();

        /**
         * The meta object literal for the '<em><b>Is Italic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__IS_ITALIC = eINSTANCE.getFont_IsItalic();

        /**
         * The meta object literal for the '<em><b>Is Underline</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__IS_UNDERLINE = eINSTANCE.getFont_IsUnderline();

        /**
         * The meta object literal for the '<em><b>Is Strike Through</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__IS_STRIKE_THROUGH = eINSTANCE.getFont_IsStrikeThrough();

        /**
         * The meta object literal for the '{@link org.eclipse.dd.dc.impl.PointImpl <em>Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dd.dc.impl.PointImpl
         * @see org.eclipse.dd.dc.impl.DcPackageImpl#getPoint()
         * @generated
         */
        EClass POINT = eINSTANCE.getPoint();

        /**
         * The meta object literal for the '<em><b>X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POINT__X = eINSTANCE.getPoint_X();

        /**
         * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POINT__Y = eINSTANCE.getPoint_Y();

        /**
         * The meta object literal for the '{@link org.eclipse.dd.dc.impl.BoundsImpl <em>Bounds</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dd.dc.impl.BoundsImpl
         * @see org.eclipse.dd.dc.impl.DcPackageImpl#getBounds()
         * @generated
         */
        EClass BOUNDS = eINSTANCE.getBounds();

        /**
         * The meta object literal for the '<em><b>X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__X = eINSTANCE.getBounds_X();

        /**
         * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__Y = eINSTANCE.getBounds_Y();

        /**
         * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__WIDTH = eINSTANCE.getBounds_Width();

        /**
         * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__HEIGHT = eINSTANCE.getBounds_Height();

    }

} //DcPackage
