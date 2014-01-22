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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_LANGUAGE_EDEFAULT = "http://www.w3.org/1999/XPath";
	/**
	 * The default value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_LANGUAGE_EDEFAULT = "http://www.w3.org/2001/XMLSchema";
	/**
	 * The default value of the '{@link #getExporter() <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporter()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTER_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getExporterVersion() <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTER_VERSION_EDEFAULT = null;

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
		return (String) eDynamicGet(Bpmn2Package.DEFINITIONS__NAME,
				Bpmn2Package.Literals.DEFINITIONS__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(Bpmn2Package.DEFINITIONS__NAME,
				Bpmn2Package.Literals.DEFINITIONS__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return (String) eDynamicGet(Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE,
				Bpmn2Package.Literals.DEFINITIONS__TARGET_NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		eDynamicSet(Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE,
				Bpmn2Package.Literals.DEFINITIONS__TARGET_NAMESPACE,
				newTargetNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionLanguage() {
		return (String) eDynamicGet(
				Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE,
				Bpmn2Package.Literals.DEFINITIONS__EXPRESSION_LANGUAGE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionLanguage(String newExpressionLanguage) {
		eDynamicSet(Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE,
				Bpmn2Package.Literals.DEFINITIONS__EXPRESSION_LANGUAGE,
				newExpressionLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeLanguage() {
		return (String) eDynamicGet(Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE,
				Bpmn2Package.Literals.DEFINITIONS__TYPE_LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLanguage(String newTypeLanguage) {
		eDynamicSet(Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE,
				Bpmn2Package.Literals.DEFINITIONS__TYPE_LANGUAGE,
				newTypeLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Import> getImports() {
		return (EList<Import>) eDynamicGet(Bpmn2Package.DEFINITIONS__IMPORTS,
				Bpmn2Package.Literals.DEFINITIONS__IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Extension> getExtensions() {
		return (EList<Extension>) eDynamicGet(
				Bpmn2Package.DEFINITIONS__EXTENSIONS,
				Bpmn2Package.Literals.DEFINITIONS__EXTENSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relationship> getRelationships() {
		return (EList<Relationship>) eDynamicGet(
				Bpmn2Package.DEFINITIONS__RELATIONSHIPS,
				Bpmn2Package.Literals.DEFINITIONS__RELATIONSHIPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RootElement> getRootElements() {
		return (EList<RootElement>) eDynamicGet(
				Bpmn2Package.DEFINITIONS__ROOT_ELEMENTS,
				Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BPMNDiagram> getDiagrams() {
		return (EList<BPMNDiagram>) eDynamicGet(
				Bpmn2Package.DEFINITIONS__DIAGRAMS,
				Bpmn2Package.Literals.DEFINITIONS__DIAGRAMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExporter() {
		return (String) eDynamicGet(Bpmn2Package.DEFINITIONS__EXPORTER,
				Bpmn2Package.Literals.DEFINITIONS__EXPORTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExporter(String newExporter) {
		eDynamicSet(Bpmn2Package.DEFINITIONS__EXPORTER,
				Bpmn2Package.Literals.DEFINITIONS__EXPORTER, newExporter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExporterVersion() {
		return (String) eDynamicGet(Bpmn2Package.DEFINITIONS__EXPORTER_VERSION,
				Bpmn2Package.Literals.DEFINITIONS__EXPORTER_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExporterVersion(String newExporterVersion) {
		eDynamicSet(Bpmn2Package.DEFINITIONS__EXPORTER_VERSION,
				Bpmn2Package.Literals.DEFINITIONS__EXPORTER_VERSION,
				newExporterVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.DEFINITIONS__IMPORTS:
			return ((InternalEList<?>) getImports())
					.basicRemove(otherEnd, msgs);
		case Bpmn2Package.DEFINITIONS__EXTENSIONS:
			return ((InternalEList<?>) getExtensions()).basicRemove(otherEnd,
					msgs);
		case Bpmn2Package.DEFINITIONS__RELATIONSHIPS:
			return ((InternalEList<?>) getRelationships()).basicRemove(
					otherEnd, msgs);
		case Bpmn2Package.DEFINITIONS__ROOT_ELEMENTS:
			return ((InternalEList<?>) getRootElements()).basicRemove(otherEnd,
					msgs);
		case Bpmn2Package.DEFINITIONS__DIAGRAMS:
			return ((InternalEList<?>) getDiagrams()).basicRemove(otherEnd,
					msgs);
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
		case Bpmn2Package.DEFINITIONS__NAME:
			return getName();
		case Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
			return getTargetNamespace();
		case Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
			return getExpressionLanguage();
		case Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
			return getTypeLanguage();
		case Bpmn2Package.DEFINITIONS__IMPORTS:
			return getImports();
		case Bpmn2Package.DEFINITIONS__EXTENSIONS:
			return getExtensions();
		case Bpmn2Package.DEFINITIONS__RELATIONSHIPS:
			return getRelationships();
		case Bpmn2Package.DEFINITIONS__ROOT_ELEMENTS:
			return getRootElements();
		case Bpmn2Package.DEFINITIONS__DIAGRAMS:
			return getDiagrams();
		case Bpmn2Package.DEFINITIONS__EXPORTER:
			return getExporter();
		case Bpmn2Package.DEFINITIONS__EXPORTER_VERSION:
			return getExporterVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.DEFINITIONS__NAME:
			setName((String) newValue);
			return;
		case Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
			setTargetNamespace((String) newValue);
			return;
		case Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
			setExpressionLanguage((String) newValue);
			return;
		case Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
			setTypeLanguage((String) newValue);
			return;
		case Bpmn2Package.DEFINITIONS__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
			return;
		case Bpmn2Package.DEFINITIONS__EXTENSIONS:
			getExtensions().clear();
			getExtensions().addAll((Collection<? extends Extension>) newValue);
			return;
		case Bpmn2Package.DEFINITIONS__RELATIONSHIPS:
			getRelationships().clear();
			getRelationships().addAll(
					(Collection<? extends Relationship>) newValue);
			return;
		case Bpmn2Package.DEFINITIONS__ROOT_ELEMENTS:
			getRootElements().clear();
			getRootElements().addAll(
					(Collection<? extends RootElement>) newValue);
			return;
		case Bpmn2Package.DEFINITIONS__DIAGRAMS:
			getDiagrams().clear();
			getDiagrams().addAll((Collection<? extends BPMNDiagram>) newValue);
			return;
		case Bpmn2Package.DEFINITIONS__EXPORTER:
			setExporter((String) newValue);
			return;
		case Bpmn2Package.DEFINITIONS__EXPORTER_VERSION:
			setExporterVersion((String) newValue);
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
		case Bpmn2Package.DEFINITIONS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
			setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
			return;
		case Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
			setExpressionLanguage(EXPRESSION_LANGUAGE_EDEFAULT);
			return;
		case Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
			setTypeLanguage(TYPE_LANGUAGE_EDEFAULT);
			return;
		case Bpmn2Package.DEFINITIONS__IMPORTS:
			getImports().clear();
			return;
		case Bpmn2Package.DEFINITIONS__EXTENSIONS:
			getExtensions().clear();
			return;
		case Bpmn2Package.DEFINITIONS__RELATIONSHIPS:
			getRelationships().clear();
			return;
		case Bpmn2Package.DEFINITIONS__ROOT_ELEMENTS:
			getRootElements().clear();
			return;
		case Bpmn2Package.DEFINITIONS__DIAGRAMS:
			getDiagrams().clear();
			return;
		case Bpmn2Package.DEFINITIONS__EXPORTER:
			setExporter(EXPORTER_EDEFAULT);
			return;
		case Bpmn2Package.DEFINITIONS__EXPORTER_VERSION:
			setExporterVersion(EXPORTER_VERSION_EDEFAULT);
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
		case Bpmn2Package.DEFINITIONS__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT
					.equals(getName());
		case Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
			return TARGET_NAMESPACE_EDEFAULT == null ? getTargetNamespace() != null
					: !TARGET_NAMESPACE_EDEFAULT.equals(getTargetNamespace());
		case Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
			return EXPRESSION_LANGUAGE_EDEFAULT == null ? getExpressionLanguage() != null
					: !EXPRESSION_LANGUAGE_EDEFAULT
							.equals(getExpressionLanguage());
		case Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
			return TYPE_LANGUAGE_EDEFAULT == null ? getTypeLanguage() != null
					: !TYPE_LANGUAGE_EDEFAULT.equals(getTypeLanguage());
		case Bpmn2Package.DEFINITIONS__IMPORTS:
			return !getImports().isEmpty();
		case Bpmn2Package.DEFINITIONS__EXTENSIONS:
			return !getExtensions().isEmpty();
		case Bpmn2Package.DEFINITIONS__RELATIONSHIPS:
			return !getRelationships().isEmpty();
		case Bpmn2Package.DEFINITIONS__ROOT_ELEMENTS:
			return !getRootElements().isEmpty();
		case Bpmn2Package.DEFINITIONS__DIAGRAMS:
			return !getDiagrams().isEmpty();
		case Bpmn2Package.DEFINITIONS__EXPORTER:
			return EXPORTER_EDEFAULT == null ? getExporter() != null
					: !EXPORTER_EDEFAULT.equals(getExporter());
		case Bpmn2Package.DEFINITIONS__EXPORTER_VERSION:
			return EXPORTER_VERSION_EDEFAULT == null ? getExporterVersion() != null
					: !EXPORTER_VERSION_EDEFAULT.equals(getExporterVersion());
		}
		return super.eIsSet(featureID);
	}

} //DefinitionsImpl
