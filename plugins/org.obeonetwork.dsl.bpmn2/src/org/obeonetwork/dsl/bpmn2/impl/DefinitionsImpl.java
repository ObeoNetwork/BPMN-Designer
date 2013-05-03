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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Definitions;
import org.obeonetwork.dsl.bpmn2.Extension;
import org.obeonetwork.dsl.bpmn2.Import;
import org.obeonetwork.dsl.bpmn2.Relationship;
import org.obeonetwork.dsl.bpmn2.RootElement;

import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl#getTypeLanguage <em>Type Language</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl#getRootElements <em>Root Elements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl#getExporter <em>Exporter</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl#getExporterVersion <em>Exporter Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionsImpl extends BaseElementImpl implements Definitions {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eGet(Bpmn2Package.Literals.DEFINITIONS__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(Bpmn2Package.Literals.DEFINITIONS__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return (String) eGet(
				Bpmn2Package.Literals.DEFINITIONS__TARGET_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		eSet(Bpmn2Package.Literals.DEFINITIONS__TARGET_NAMESPACE,
				newTargetNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionLanguage() {
		return (String) eGet(
				Bpmn2Package.Literals.DEFINITIONS__EXPRESSION_LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionLanguage(String newExpressionLanguage) {
		eSet(Bpmn2Package.Literals.DEFINITIONS__EXPRESSION_LANGUAGE,
				newExpressionLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeLanguage() {
		return (String) eGet(Bpmn2Package.Literals.DEFINITIONS__TYPE_LANGUAGE,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLanguage(String newTypeLanguage) {
		eSet(Bpmn2Package.Literals.DEFINITIONS__TYPE_LANGUAGE, newTypeLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Import> getImports() {
		return (EList<Import>) eGet(Bpmn2Package.Literals.DEFINITIONS__IMPORTS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Extension> getExtensions() {
		return (EList<Extension>) eGet(
				Bpmn2Package.Literals.DEFINITIONS__EXTENSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relationship> getRelationships() {
		return (EList<Relationship>) eGet(
				Bpmn2Package.Literals.DEFINITIONS__RELATIONSHIPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RootElement> getRootElements() {
		return (EList<RootElement>) eGet(
				Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BPMNDiagram> getDiagrams() {
		return (EList<BPMNDiagram>) eGet(
				Bpmn2Package.Literals.DEFINITIONS__DIAGRAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExporter() {
		return (String) eGet(Bpmn2Package.Literals.DEFINITIONS__EXPORTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExporter(String newExporter) {
		eSet(Bpmn2Package.Literals.DEFINITIONS__EXPORTER, newExporter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExporterVersion() {
		return (String) eGet(
				Bpmn2Package.Literals.DEFINITIONS__EXPORTER_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExporterVersion(String newExporterVersion) {
		eSet(Bpmn2Package.Literals.DEFINITIONS__EXPORTER_VERSION,
				newExporterVersion);
	}

} //DefinitionsImpl
