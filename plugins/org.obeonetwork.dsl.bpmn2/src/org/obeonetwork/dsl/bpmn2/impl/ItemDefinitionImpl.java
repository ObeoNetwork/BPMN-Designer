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
		return (ItemKind) eGet(
				Bpmn2Package.Literals.ITEM_DEFINITION__ITEM_KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemKind(ItemKind newItemKind) {
		eSet(Bpmn2Package.Literals.ITEM_DEFINITION__ITEM_KIND, newItemKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getStructureRef() {
		return (EObject) eGet(
				Bpmn2Package.Literals.ITEM_DEFINITION__STRUCTURE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureRef(EObject newStructureRef) {
		eSet(Bpmn2Package.Literals.ITEM_DEFINITION__STRUCTURE_REF,
				newStructureRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCollection() {
		return (Boolean) eGet(
				Bpmn2Package.Literals.ITEM_DEFINITION__IS_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(boolean newIsCollection) {
		eSet(Bpmn2Package.Literals.ITEM_DEFINITION__IS_COLLECTION,
				newIsCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import getImport() {
		return (Import) eGet(Bpmn2Package.Literals.ITEM_DEFINITION__IMPORT,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport(Import newImport) {
		eSet(Bpmn2Package.Literals.ITEM_DEFINITION__IMPORT, newImport);
	}

} //ItemDefinitionImpl
