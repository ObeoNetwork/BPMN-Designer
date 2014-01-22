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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Import;
import org.obeonetwork.dsl.bpmn2.ItemDefinition;
import org.obeonetwork.dsl.bpmn2.ItemKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ItemDefinitionImpl#getItemKind <em>Item Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ItemDefinitionImpl#getStructureRef <em>Structure Ref</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ItemDefinitionImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ItemDefinitionImpl#getImport <em>Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemDefinitionImpl extends RootElementImpl implements
		ItemDefinition {
	/**
	 * The default value of the '{@link #getItemKind() <em>Item Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemKind()
	 * @generated
	 * @ordered
	 */
	protected static final ItemKind ITEM_KIND_EDEFAULT = ItemKind.PHYSICAL;
	/**
	 * The default value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLLECTION_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.ITEM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemKind getItemKind() {
		return (ItemKind) eDynamicGet(Bpmn2Package.ITEM_DEFINITION__ITEM_KIND,
				Bpmn2Package.Literals.ITEM_DEFINITION__ITEM_KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemKind(ItemKind newItemKind) {
		eDynamicSet(Bpmn2Package.ITEM_DEFINITION__ITEM_KIND,
				Bpmn2Package.Literals.ITEM_DEFINITION__ITEM_KIND, newItemKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getStructureRef() {
		return (EObject) eDynamicGet(
				Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF,
				Bpmn2Package.Literals.ITEM_DEFINITION__STRUCTURE_REF, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetStructureRef() {
		return (EObject) eDynamicGet(
				Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF,
				Bpmn2Package.Literals.ITEM_DEFINITION__STRUCTURE_REF, false,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureRef(EObject newStructureRef) {
		eDynamicSet(Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF,
				Bpmn2Package.Literals.ITEM_DEFINITION__STRUCTURE_REF,
				newStructureRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCollection() {
		return (Boolean) eDynamicGet(
				Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION,
				Bpmn2Package.Literals.ITEM_DEFINITION__IS_COLLECTION, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(boolean newIsCollection) {
		eDynamicSet(Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION,
				Bpmn2Package.Literals.ITEM_DEFINITION__IS_COLLECTION,
				newIsCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import getImport() {
		return (Import) eDynamicGet(Bpmn2Package.ITEM_DEFINITION__IMPORT,
				Bpmn2Package.Literals.ITEM_DEFINITION__IMPORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import basicGetImport() {
		return (Import) eDynamicGet(Bpmn2Package.ITEM_DEFINITION__IMPORT,
				Bpmn2Package.Literals.ITEM_DEFINITION__IMPORT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport(Import newImport) {
		eDynamicSet(Bpmn2Package.ITEM_DEFINITION__IMPORT,
				Bpmn2Package.Literals.ITEM_DEFINITION__IMPORT, newImport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.ITEM_DEFINITION__ITEM_KIND:
			return getItemKind();
		case Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF:
			if (resolve)
				return getStructureRef();
			return basicGetStructureRef();
		case Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION:
			return isIsCollection();
		case Bpmn2Package.ITEM_DEFINITION__IMPORT:
			if (resolve)
				return getImport();
			return basicGetImport();
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
		case Bpmn2Package.ITEM_DEFINITION__ITEM_KIND:
			setItemKind((ItemKind) newValue);
			return;
		case Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF:
			setStructureRef((EObject) newValue);
			return;
		case Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION:
			setIsCollection((Boolean) newValue);
			return;
		case Bpmn2Package.ITEM_DEFINITION__IMPORT:
			setImport((Import) newValue);
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
		case Bpmn2Package.ITEM_DEFINITION__ITEM_KIND:
			setItemKind(ITEM_KIND_EDEFAULT);
			return;
		case Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF:
			setStructureRef((EObject) null);
			return;
		case Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION:
			setIsCollection(IS_COLLECTION_EDEFAULT);
			return;
		case Bpmn2Package.ITEM_DEFINITION__IMPORT:
			setImport((Import) null);
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
		case Bpmn2Package.ITEM_DEFINITION__ITEM_KIND:
			return getItemKind() != ITEM_KIND_EDEFAULT;
		case Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF:
			return basicGetStructureRef() != null;
		case Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION:
			return isIsCollection() != IS_COLLECTION_EDEFAULT;
		case Bpmn2Package.ITEM_DEFINITION__IMPORT:
			return basicGetImport() != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemDefinitionImpl
