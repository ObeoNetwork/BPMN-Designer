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
 *
 */
package org.eclipse.bpmn2.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.di.BpmnDiFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.Definitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionsItemProvider extends BaseElementItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefinitionsItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addExporterPropertyDescriptor(object);
            addExporterVersionPropertyDescriptor(object);
            addExpressionLanguagePropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addTargetNamespacePropertyDescriptor(object);
            addTypeLanguagePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Exporter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExporterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Definitions_exporter_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Definitions_exporter_feature",
                        "_UI_Definitions_type"), Bpmn2Package.Literals.DEFINITIONS__EXPORTER, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Exporter Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExporterVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Definitions_exporterVersion_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Definitions_exporterVersion_feature", "_UI_Definitions_type"),
                Bpmn2Package.Literals.DEFINITIONS__EXPORTER_VERSION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Expression Language feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExpressionLanguagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Definitions_expressionLanguage_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Definitions_expressionLanguage_feature", "_UI_Definitions_type"),
                Bpmn2Package.Literals.DEFINITIONS__EXPRESSION_LANGUAGE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Definitions_name_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Definitions_name_feature",
                        "_UI_Definitions_type"), Bpmn2Package.Literals.DEFINITIONS__NAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Target Namespace feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetNamespacePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Definitions_targetNamespace_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Definitions_targetNamespace_feature", "_UI_Definitions_type"),
                Bpmn2Package.Literals.DEFINITIONS__TARGET_NAMESPACE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Type Language feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypeLanguagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Definitions_typeLanguage_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Definitions_typeLanguage_feature", "_UI_Definitions_type"),
                Bpmn2Package.Literals.DEFINITIONS__TYPE_LANGUAGE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(Bpmn2Package.Literals.DEFINITIONS__IMPORTS);
            childrenFeatures.add(Bpmn2Package.Literals.DEFINITIONS__EXTENSIONS);
            childrenFeatures.add(Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS);
            childrenFeatures.add(Bpmn2Package.Literals.DEFINITIONS__DIAGRAMS);
            childrenFeatures.add(Bpmn2Package.Literals.DEFINITIONS__RELATIONSHIPS);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns Definitions.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        try {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Definitions.png"));
        } catch (java.util.MissingResourceException e) {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Definitions.gif"));
        }
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Definitions) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Definitions_type")
                : getString("_UI_Definitions_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Definitions.class)) {
        case Bpmn2Package.DEFINITIONS__EXPORTER:
        case Bpmn2Package.DEFINITIONS__EXPORTER_VERSION:
        case Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
        case Bpmn2Package.DEFINITIONS__NAME:
        case Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
        case Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
            return;
        case Bpmn2Package.DEFINITIONS__IMPORTS:
        case Bpmn2Package.DEFINITIONS__EXTENSIONS:
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENTS:
        case Bpmn2Package.DEFINITIONS__DIAGRAMS:
        case Bpmn2Package.DEFINITIONS__RELATIONSHIPS:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.DEFINITIONS__IMPORTS,
                Bpmn2Factory.eINSTANCE.createImport()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.DEFINITIONS__EXTENSIONS,
                Bpmn2Factory.eINSTANCE.createExtension()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createCancelEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createCategory()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createCollaboration()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createChoreography()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createCompensateEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createConditionalEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createCorrelationProperty()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createDataStore()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createEndPoint()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createError()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createErrorEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createEscalation()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createEscalationEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createGlobalTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createGlobalConversation()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createGlobalManualTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createGlobalScriptTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createGlobalUserTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createInterface()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createItemDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createLinkEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createMessage()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createMessageEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createPartnerEntity()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createPartnerRole()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createProcess()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createResource()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createSignal()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createSignalEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createTerminateEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__ROOT_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createTimerEventDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.DEFINITIONS__DIAGRAMS,
                BpmnDiFactory.eINSTANCE.createBPMNDiagram()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DEFINITIONS__RELATIONSHIPS,
                Bpmn2Factory.eINSTANCE.createRelationship()));
    }

}
