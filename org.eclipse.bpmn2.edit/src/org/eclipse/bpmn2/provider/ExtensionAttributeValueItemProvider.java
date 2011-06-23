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
import org.eclipse.bpmn2.ExtensionAttributeValue;
import org.eclipse.bpmn2.di.BpmnDiFactory;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.dd.dc.DcFactory;
import org.eclipse.dd.dc.DcPackage;
import org.eclipse.dd.di.DiPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.ExtensionAttributeValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionAttributeValueItemProvider extends ItemProviderAdapter implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionAttributeValueItemProvider(AdapterFactory adapterFactory) {
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

            addValueRefPropertyDescriptor(object);
            addExtensionAttributeDefinitionPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Value Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValueRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ExtensionAttributeValue_valueRef_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_ExtensionAttributeValue_valueRef_feature",
                        "_UI_ExtensionAttributeValue_type"),
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF, true, false, true,
                null, null, null));
    }

    /**
     * This adds a property descriptor for the Extension Attribute Definition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExtensionAttributeDefinitionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ExtensionAttributeValue_extensionAttributeDefinition_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_ExtensionAttributeValue_extensionAttributeDefinition_feature",
                        "_UI_ExtensionAttributeValue_type"),
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION,
                true, false, true, null, null, null));
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
            childrenFeatures.add(Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE);
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
     * This returns ExtensionAttributeValue.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        try {
            return overlayImage(object,
                    getResourceLocator().getImage("full/obj16/ExtensionAttributeValue.png"));
        } catch (java.util.MissingResourceException e) {
            return overlayImage(object,
                    getResourceLocator().getImage("full/obj16/ExtensionAttributeValue.gif"));
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
        return getString("_UI_ExtensionAttributeValue_type");
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

        switch (notification.getFeatureID(ExtensionAttributeValue.class)) {
        case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
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

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS,
                        Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCallChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataObjectReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSubChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ARTIFACT,
                        Bpmn2Factory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ARTIFACT,
                        Bpmn2Factory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ARTIFACT,
                        Bpmn2Factory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ASSIGNMENT,
                        Bpmn2Factory.eINSTANCE.createAssignment())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ASSOCIATION,
                        Bpmn2Factory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__AUDITING,
                        Bpmn2Factory.eINSTANCE.createAuditing())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createAssignment())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createAuditing())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCallChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCallConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCategoryValue())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createConversationAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createConversationLink())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCorrelationPropertyBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCorrelationPropertyRetrievalExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCorrelationSubscription())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createItemAwareElement())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataInput())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataObjectReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataOutput())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataState())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDefinitions())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDocumentation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createResourceRole())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createInputOutputBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createInputOutputSpecification())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createInputSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createLane())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createLaneSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createMessageFlowAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createMonitoring())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createOperation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createOutputSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createParticipantAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createParticipantMultiplicity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createProperty())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createRelationship())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createRendering())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createResourceAssignmentExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createResourceParameter())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createResourceParameterBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSubChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSubConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createAssignment())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createAuditing())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCallChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCallConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCategoryValue())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createConversationAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createConversationLink())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCorrelationPropertyBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCorrelationPropertyRetrievalExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createCorrelationSubscription())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDataAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createItemAwareElement())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDataInput())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDataObjectReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDataOutput())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDataState())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDefinitions())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createDocumentation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createGlobalConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createResourceRole())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createInputOutputBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createInputOutputSpecification())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createInputSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createLane())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createLaneSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createMessageFlowAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createMonitoring())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createOperation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createOutputSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createParticipantAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createParticipantMultiplicity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createProperty())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createRelationship())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createRendering())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createResourceAssignmentExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createResourceParameter())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createResourceParameterBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createSubChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createSubConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT,
                        Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BOUNDARY_EVENT,
                        Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__BUSINESS_RULE_TASK,
                        Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CALLABLE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CALLABLE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CALLABLE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CALLABLE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CALLABLE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CALLABLE_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CALL_ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CALL_CHOREOGRAPHY,
                        Bpmn2Factory.eINSTANCE.createCallChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CALL_CONVERSATION,
                        Bpmn2Factory.eINSTANCE.createCallConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CONVERSATION_NODE,
                        Bpmn2Factory.eINSTANCE.createCallConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CONVERSATION_NODE,
                        Bpmn2Factory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CONVERSATION_NODE,
                        Bpmn2Factory.eINSTANCE.createSubConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT,
                        Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CATCH_EVENT,
                        Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CATCH_EVENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CATCH_EVENT,
                        Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CATEGORY,
                        Bpmn2Factory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CATEGORY_VALUE,
                        Bpmn2Factory.eINSTANCE.createCategoryValue())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CHOREOGRAPHY,
                        Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CHOREOGRAPHY,
                        Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__COLLABORATION,
                        Bpmn2Factory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__COLLABORATION,
                        Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__COLLABORATION,
                        Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__COLLABORATION,
                        Bpmn2Factory.eINSTANCE.createGlobalConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createCallChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY,
                        Bpmn2Factory.eINSTANCE.createSubChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CHOREOGRAPHY_TASK,
                        Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__COMPLEX_GATEWAY,
                        Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CONVERSATION,
                        Bpmn2Factory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION,
                        Bpmn2Factory.eINSTANCE.createConversationAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CONVERSATION_LINK,
                        Bpmn2Factory.eINSTANCE.createConversationLink())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CORRELATION_KEY,
                        Bpmn2Factory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CORRELATION_PROPERTY,
                        Bpmn2Factory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING,
                        Bpmn2Factory.eINSTANCE.createCorrelationPropertyBinding())));

        newChildDescriptors
                .add(createChildParameter(
                        Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE,
                        FeatureMapUtil
                                .createEntry(
                                        Bpmn2Package.Literals.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION,
                                        Bpmn2Factory.eINSTANCE
                                                .createCorrelationPropertyRetrievalExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION,
                        Bpmn2Factory.eINSTANCE.createCorrelationSubscription())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_ASSOCIATION,
                        Bpmn2Factory.eINSTANCE.createDataAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_ASSOCIATION,
                        Bpmn2Factory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_ASSOCIATION,
                        Bpmn2Factory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_INPUT,
                        Bpmn2Factory.eINSTANCE.createDataInput())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION,
                        Bpmn2Factory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_OBJECT,
                        Bpmn2Factory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE,
                        Bpmn2Factory.eINSTANCE.createDataObjectReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_OUTPUT,
                        Bpmn2Factory.eINSTANCE.createDataOutput())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION,
                        Bpmn2Factory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_STATE,
                        Bpmn2Factory.eINSTANCE.createDataState())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_STORE,
                        Bpmn2Factory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_STORE_REFERENCE,
                        Bpmn2Factory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DEFINITIONS,
                        Bpmn2Factory.eINSTANCE.createDefinitions())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__DOCUMENTATION,
                        Bpmn2Factory.eINSTANCE.createDocumentation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__END_EVENT,
                        Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__END_POINT,
                        Bpmn2Factory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ERROR,
                        Bpmn2Factory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ESCALATION,
                        Bpmn2Factory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT,
                        Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT,
                        Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT,
                        Bpmn2Factory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT,
                        Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_BASED_GATEWAY,
                        Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY,
                        Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EXPRESSION,
                        Bpmn2Factory.eINSTANCE.createExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EXPRESSION,
                        Bpmn2Factory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EXTENSION,
                        Bpmn2Factory.eINSTANCE.createExtension())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__EXTENSION_ELEMENTS,
                        Bpmn2Factory.eINSTANCE.createExtensionAttributeValue())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createCallChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createSubChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE,
                        Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__FORMAL_EXPRESSION,
                        Bpmn2Factory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK,
                        Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK,
                        Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_CONVERSATION,
                        Bpmn2Factory.eINSTANCE.createGlobalConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK,
                        Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK,
                        Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_TASK,
                        Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_TASK,
                        Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_TASK,
                        Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_TASK,
                        Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_TASK,
                        Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_USER_TASK,
                        Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__GROUP,
                        Bpmn2Factory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__HUMAN_PERFORMER,
                        Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__HUMAN_PERFORMER,
                        Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__PERFORMER,
                        Bpmn2Factory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__PERFORMER,
                        Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__PERFORMER,
                        Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE_ROLE,
                        Bpmn2Factory.eINSTANCE.createResourceRole())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE_ROLE,
                        Bpmn2Factory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE_ROLE,
                        Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE_ROLE,
                        Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT,
                        Bpmn2Factory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__IMPORT,
                        Bpmn2Factory.eINSTANCE.createImport())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__INCLUSIVE_GATEWAY,
                        Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__INPUT_SET,
                        Bpmn2Factory.eINSTANCE.createInputSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__INTERFACE,
                        Bpmn2Factory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__IO_BINDING,
                        Bpmn2Factory.eINSTANCE.createInputOutputBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__IO_SPECIFICATION,
                        Bpmn2Factory.eINSTANCE.createInputOutputSpecification())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__ITEM_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__LANE,
                        Bpmn2Factory.eINSTANCE.createLane())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__LANE_SET,
                        Bpmn2Factory.eINSTANCE.createLaneSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__LINK_EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__LOOP_CHARACTERISTICS,
                        Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__LOOP_CHARACTERISTICS,
                        Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__MANUAL_TASK,
                        Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__MESSAGE,
                        Bpmn2Factory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__MESSAGE_FLOW,
                        Bpmn2Factory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION,
                        Bpmn2Factory.eINSTANCE.createMessageFlowAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__MONITORING,
                        Bpmn2Factory.eINSTANCE.createMonitoring())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS,
                        Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__OPERATION,
                        Bpmn2Factory.eINSTANCE.createOperation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__OUTPUT_SET,
                        Bpmn2Factory.eINSTANCE.createOutputSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__PARALLEL_GATEWAY,
                        Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__PARTICIPANT,
                        Bpmn2Factory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION,
                        Bpmn2Factory.eINSTANCE.createParticipantAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY,
                        Bpmn2Factory.eINSTANCE.createParticipantMultiplicity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__PARTNER_ENTITY,
                        Bpmn2Factory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__PARTNER_ROLE,
                        Bpmn2Factory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__POTENTIAL_OWNER,
                        Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__PROCESS,
                        Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__PROPERTY,
                        Bpmn2Factory.eINSTANCE.createProperty())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__RECEIVE_TASK,
                        Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__RELATIONSHIP,
                        Bpmn2Factory.eINSTANCE.createRelationship())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__RENDERING,
                        Bpmn2Factory.eINSTANCE.createRendering())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE,
                        Bpmn2Factory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION,
                        Bpmn2Factory.eINSTANCE.createResourceAssignmentExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE_PARAMETER,
                        Bpmn2Factory.eINSTANCE.createResourceParameter())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING,
                        Bpmn2Factory.eINSTANCE.createResourceParameterBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createAssignment())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createAuditing())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCallChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCallConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCategoryValue())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createConversationAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createConversationLink())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCorrelationPropertyBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCorrelationPropertyRetrievalExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createCorrelationSubscription())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDataAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createItemAwareElement())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDataInput())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDataObjectReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDataOutput())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDataState())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDefinitions())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createDocumentation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createExtension())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createExtensionAttributeDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createExtensionAttributeValue())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createExtensionDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createGlobalConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createResourceRole())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createImport())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createInputOutputBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createInputOutputSpecification())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createInputSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createLane())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createLaneSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createMessageFlowAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createMonitoring())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createOperation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createOutputSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createParticipantAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createParticipantMultiplicity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createProperty())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createRelationship())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createRendering())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createResourceAssignmentExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createResourceParameter())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createResourceParameterBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createSubChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createSubConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        BpmnDiFactory.eINSTANCE.createBPMNDiagram())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        BpmnDiFactory.eINSTANCE.createBPMNEdge())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        BpmnDiFactory.eINSTANCE.createBPMNLabel())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        BpmnDiFactory.eINSTANCE.createBPMNLabelStyle())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        BpmnDiFactory.eINSTANCE.createBPMNPlane())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        BpmnDiFactory.eINSTANCE.createBPMNShape())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        DcFactory.eINSTANCE.createBounds())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        DcFactory.eINSTANCE.createFont())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        DcFactory.eINSTANCE.createPoint())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT,
                        XMLTypeFactory.eINSTANCE.createAnyType())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT_TASK,
                        Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SEND_TASK,
                        Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SEQUENCE_FLOW,
                        Bpmn2Factory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SERVICE_TASK,
                        Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SIGNAL,
                        Bpmn2Factory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS,
                        Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__START_EVENT,
                        Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SUB_CHOREOGRAPHY,
                        Bpmn2Factory.eINSTANCE.createSubChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SUB_CONVERSATION,
                        Bpmn2Factory.eINSTANCE.createSubConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SUB_PROCESS,
                        Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SUB_PROCESS,
                        Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__SUB_PROCESS,
                        Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TASK,
                        Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TASK,
                        Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TASK,
                        Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TASK,
                        Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TASK,
                        Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TASK,
                        Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TASK,
                        Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TASK,
                        Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createAssignment())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createAuditing())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCallChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCallConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCategoryValue())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createConversationAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createConversationLink())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCorrelationPropertyBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCorrelationPropertyRetrievalExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createCorrelationSubscription())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDataAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createItemAwareElement())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDataInput())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDataObjectReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDataOutput())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDataState())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDefinitions())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createDocumentation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createExtension())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createExtensionAttributeDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createExtensionAttributeValue())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createExtensionDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createGlobalConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createResourceRole())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createImport())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createInputOutputBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createInputOutputSpecification())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createInputSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createLane())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createLaneSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createMessageFlowAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createMonitoring())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createOperation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createOutputSet())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createParticipantAssociation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createParticipantMultiplicity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createProperty())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createRelationship())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createRendering())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createResourceAssignmentExpression())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createResourceParameter())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createResourceParameterBinding())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createSubChoreography())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createSubConversation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        BpmnDiFactory.eINSTANCE.createBPMNDiagram())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        BpmnDiFactory.eINSTANCE.createBPMNEdge())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        BpmnDiFactory.eINSTANCE.createBPMNLabel())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        BpmnDiFactory.eINSTANCE.createBPMNLabelStyle())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        BpmnDiFactory.eINSTANCE.createBPMNPlane())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        BpmnDiFactory.eINSTANCE.createBPMNShape())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        DcFactory.eINSTANCE.createBounds())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE,
                FeatureMapUtil.createEntry(Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        DcFactory.eINSTANCE.createFont())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        DcFactory.eINSTANCE.createPoint())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT,
                        XMLTypeFactory.eINSTANCE.createAnyType())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT_ANNOTATION,
                        Bpmn2Factory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__THROW_EVENT,
                        Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__THROW_EVENT,
                        Bpmn2Factory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__THROW_EVENT,
                        Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__TRANSACTION,
                        Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        Bpmn2Package.Literals.DOCUMENT_ROOT__USER_TASK,
                        Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_DIAGRAM,
                        BpmnDiFactory.eINSTANCE.createBPMNDiagram())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_EDGE,
                        BpmnDiFactory.eINSTANCE.createBPMNEdge())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_LABEL,
                        BpmnDiFactory.eINSTANCE.createBPMNLabel())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_LABEL_STYLE,
                        BpmnDiFactory.eINSTANCE.createBPMNLabelStyle())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_PLANE,
                        BpmnDiFactory.eINSTANCE.createBPMNPlane())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_SHAPE,
                        BpmnDiFactory.eINSTANCE.createBPMNShape())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
                        BpmnDiFactory.eINSTANCE.createBPMNEdge())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
                        BpmnDiFactory.eINSTANCE.createBPMNLabel())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
                        BpmnDiFactory.eINSTANCE.createBPMNPlane())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
                        BpmnDiFactory.eINSTANCE.createBPMNShape())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM,
                        BpmnDiFactory.eINSTANCE.createBPMNDiagram())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__EDGE,
                        BpmnDiFactory.eINSTANCE.createBPMNEdge())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__LABEL,
                        BpmnDiFactory.eINSTANCE.createBPMNLabel())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE,
                        BpmnDiFactory.eINSTANCE.createBPMNEdge())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE,
                        BpmnDiFactory.eINSTANCE.createBPMNShape())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__NODE,
                        BpmnDiFactory.eINSTANCE.createBPMNLabel())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__NODE,
                        BpmnDiFactory.eINSTANCE.createBPMNPlane())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__NODE,
                        BpmnDiFactory.eINSTANCE.createBPMNShape())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__PLANE,
                        BpmnDiFactory.eINSTANCE.createBPMNPlane())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__SHAPE,
                        BpmnDiFactory.eINSTANCE.createBPMNShape())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DiPackage.Literals.DOCUMENT_ROOT__STYLE,
                        BpmnDiFactory.eINSTANCE.createBPMNLabelStyle())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DcPackage.Literals.DOCUMENT_ROOT__BOUNDS,
                        DcFactory.eINSTANCE.createBounds())));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE, FeatureMapUtil.createEntry(
                        DcPackage.Literals.DOCUMENT_ROOT__FONT, DcFactory.eINSTANCE.createFont())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE__VALUE,
                        FeatureMapUtil.createEntry(DcPackage.Literals.DOCUMENT_ROOT__POINT,
                                DcFactory.eINSTANCE.createPoint())));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child,
            Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        if (childFeature instanceof EStructuralFeature
                && FeatureMapUtil.isFeatureMap((EStructuralFeature) childFeature)) {
            FeatureMap.Entry entry = (FeatureMap.Entry) childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        boolean qualify = childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__ACTIVITY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_ELEMENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__FLOW_NODE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__SUB_PROCESS
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__BUSINESS_RULE_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CALL_ACTIVITY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__MANUAL_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__RECEIVE_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__SCRIPT_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__SEND_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__SERVICE_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__TRANSACTION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__USER_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__BOUNDARY_EVENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CATCH_EVENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CALL_CHOREOGRAPHY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CHOREOGRAPHY_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__COMPLEX_GATEWAY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_OBJECT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_STORE_REFERENCE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__END_EVENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__THROW_EVENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_BASED_GATEWAY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__INCLUSIVE_GATEWAY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__PARALLEL_GATEWAY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__SEQUENCE_FLOW
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__START_EVENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__SUB_CHOREOGRAPHY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__ARTIFACT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__ASSOCIATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__GROUP
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__TEXT_ANNOTATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__ASSIGNMENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__AUDITING
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CONVERSATION_NODE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CALL_CONVERSATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__ROOT_ELEMENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CALLABLE_ELEMENT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__EVENT_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CATEGORY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CATEGORY_VALUE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__COLLABORATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CHOREOGRAPHY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CONVERSATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CONVERSATION_LINK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CORRELATION_KEY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CORRELATION_PROPERTY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_ASSOCIATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_INPUT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_OUTPUT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_STATE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DATA_STORE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DEFINITIONS
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__DOCUMENTATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__END_POINT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__ERROR
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__ESCALATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__EXPRESSION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__FORMAL_EXPRESSION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_CONVERSATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__GLOBAL_USER_TASK
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE_ROLE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__PERFORMER
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__HUMAN_PERFORMER
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__IO_BINDING
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__IO_SPECIFICATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__INPUT_SET
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__INTERFACE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__ITEM_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__LANE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__LANE_SET
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__LINK_EVENT_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__MESSAGE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__MESSAGE_FLOW
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__MONITORING
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__LOOP_CHARACTERISTICS
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__OPERATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__OUTPUT_SET
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__PARTICIPANT
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__PARTNER_ENTITY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__PARTNER_ROLE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__POTENTIAL_OWNER
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__PROCESS
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__PROPERTY
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__RELATIONSHIP
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__RENDERING
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE_PARAMETER
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__SIGNAL
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__SUB_CONVERSATION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__EXTENSION
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__EXTENSION_ELEMENTS
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__IMPORT
                || childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_DIAGRAM
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM
                || childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_EDGE
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__EDGE
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE
                || childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_LABEL
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__LABEL
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__NODE
                || childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_LABEL_STYLE
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__STYLE
                || childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_PLANE
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__PLANE
                || childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__BPMN_SHAPE
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__SHAPE
                || childFeature == DcPackage.Literals.DOCUMENT_ROOT__BOUNDS
                || childFeature == DcPackage.Literals.DOCUMENT_ROOT__FONT
                || childFeature == DcPackage.Literals.DOCUMENT_ROOT__POINT;

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject),
                    getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Bpmn2EditPlugin.INSTANCE;
    }

}
