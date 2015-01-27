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

import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.bpmn2.Association;
import org.obeonetwork.dsl.bpmn2.AssociationDirection;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AssociationImpl#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AssociationImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.AssociationImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ArtifactImpl implements Association {
	/**
	 * The default value of the '{@link #getAssociationDirection() <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationDirection()
	 * @generated
	 * @ordered
	 */
	protected static final AssociationDirection ASSOCIATION_DIRECTION_EDEFAULT = AssociationDirection.NONE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationDirection getAssociationDirection() {
		return (AssociationDirection) eDynamicGet(
				Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION,
				Bpmn2Package.Literals.ASSOCIATION__ASSOCIATION_DIRECTION, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationDirection(
			AssociationDirection newAssociationDirection) {
		eDynamicSet(Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION,
				Bpmn2Package.Literals.ASSOCIATION__ASSOCIATION_DIRECTION,
				newAssociationDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getSourceRef() {
		return (BaseElement) eDynamicGet(Bpmn2Package.ASSOCIATION__SOURCE_REF,
				Bpmn2Package.Literals.ASSOCIATION__SOURCE_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetSourceRef() {
		return (BaseElement) eDynamicGet(Bpmn2Package.ASSOCIATION__SOURCE_REF,
				Bpmn2Package.Literals.ASSOCIATION__SOURCE_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(BaseElement newSourceRef) {
		eDynamicSet(Bpmn2Package.ASSOCIATION__SOURCE_REF,
				Bpmn2Package.Literals.ASSOCIATION__SOURCE_REF, newSourceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getTargetRef() {
		return (BaseElement) eDynamicGet(Bpmn2Package.ASSOCIATION__TARGET_REF,
				Bpmn2Package.Literals.ASSOCIATION__TARGET_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetTargetRef() {
		return (BaseElement) eDynamicGet(Bpmn2Package.ASSOCIATION__TARGET_REF,
				Bpmn2Package.Literals.ASSOCIATION__TARGET_REF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(BaseElement newTargetRef) {
		eDynamicSet(Bpmn2Package.ASSOCIATION__TARGET_REF,
				Bpmn2Package.Literals.ASSOCIATION__TARGET_REF, newTargetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION:
			return getAssociationDirection();
		case Bpmn2Package.ASSOCIATION__SOURCE_REF:
			if (resolve)
				return getSourceRef();
			return basicGetSourceRef();
		case Bpmn2Package.ASSOCIATION__TARGET_REF:
			if (resolve)
				return getTargetRef();
			return basicGetTargetRef();
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
		case Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION:
			setAssociationDirection((AssociationDirection) newValue);
			return;
		case Bpmn2Package.ASSOCIATION__SOURCE_REF:
			setSourceRef((BaseElement) newValue);
			return;
		case Bpmn2Package.ASSOCIATION__TARGET_REF:
			setTargetRef((BaseElement) newValue);
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
		case Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION:
			setAssociationDirection(ASSOCIATION_DIRECTION_EDEFAULT);
			return;
		case Bpmn2Package.ASSOCIATION__SOURCE_REF:
			setSourceRef((BaseElement) null);
			return;
		case Bpmn2Package.ASSOCIATION__TARGET_REF:
			setTargetRef((BaseElement) null);
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
		case Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION:
			return getAssociationDirection() != ASSOCIATION_DIRECTION_EDEFAULT;
		case Bpmn2Package.ASSOCIATION__SOURCE_REF:
			return basicGetSourceRef() != null;
		case Bpmn2Package.ASSOCIATION__TARGET_REF:
			return basicGetTargetRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssociationImpl
