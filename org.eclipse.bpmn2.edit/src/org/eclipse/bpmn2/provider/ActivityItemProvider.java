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

import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Bpmn2Package;
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
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends FlowNodeItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityItemProvider(AdapterFactory adapterFactory) {
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

            addBoundaryEventRefsPropertyDescriptor(object);
            addCompletionQuantityPropertyDescriptor(object);
            addDefaultPropertyDescriptor(object);
            addIsForCompensationPropertyDescriptor(object);
            addStartQuantityPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Boundary Event Refs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBoundaryEventRefsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Activity_boundaryEventRefs_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Activity_boundaryEventRefs_feature", "_UI_Activity_type"),
                Bpmn2Package.Literals.ACTIVITY__BOUNDARY_EVENT_REFS, true, false, true, null, null,
                null));
    }

    /**
     * This adds a property descriptor for the Completion Quantity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCompletionQuantityPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Activity_completionQuantity_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Activity_completionQuantity_feature", "_UI_Activity_type"),
                Bpmn2Package.Literals.ACTIVITY__COMPLETION_QUANTITY, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Default feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefaultPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Activity_default_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Activity_default_feature",
                        "_UI_Activity_type"), Bpmn2Package.Literals.ACTIVITY__DEFAULT, true, false,
                true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Is For Compensation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsForCompensationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Activity_isForCompensation_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Activity_isForCompensation_feature", "_UI_Activity_type"),
                Bpmn2Package.Literals.ACTIVITY__IS_FOR_COMPENSATION, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Start Quantity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartQuantityPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Activity_startQuantity_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Activity_startQuantity_feature", "_UI_Activity_type"),
                Bpmn2Package.Literals.ACTIVITY__START_QUANTITY, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(Bpmn2Package.Literals.ACTIVITY__IO_SPECIFICATION);
            childrenFeatures.add(Bpmn2Package.Literals.ACTIVITY__PROPERTIES);
            childrenFeatures.add(Bpmn2Package.Literals.ACTIVITY__DATA_INPUT_ASSOCIATIONS);
            childrenFeatures.add(Bpmn2Package.Literals.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS);
            childrenFeatures.add(Bpmn2Package.Literals.ACTIVITY__RESOURCES);
            childrenFeatures.add(Bpmn2Package.Literals.ACTIVITY__LOOP_CHARACTERISTICS);
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
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Activity) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Activity_type")
                : getString("_UI_Activity_type") + " " + label;
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

        switch (notification.getFeatureID(Activity.class)) {
        case Bpmn2Package.ACTIVITY__COMPLETION_QUANTITY:
        case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION:
        case Bpmn2Package.ACTIVITY__START_QUANTITY:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
            return;
        case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
        case Bpmn2Package.ACTIVITY__PROPERTIES:
        case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
        case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
        case Bpmn2Package.ACTIVITY__RESOURCES:
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
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
                Bpmn2Package.Literals.ACTIVITY__IO_SPECIFICATION,
                Bpmn2Factory.eINSTANCE.createInputOutputSpecification()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.ACTIVITY__PROPERTIES,
                Bpmn2Factory.eINSTANCE.createProperty()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.ACTIVITY__DATA_INPUT_ASSOCIATIONS,
                Bpmn2Factory.eINSTANCE.createDataInputAssociation()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS,
                Bpmn2Factory.eINSTANCE.createDataOutputAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.ACTIVITY__RESOURCES,
                Bpmn2Factory.eINSTANCE.createResourceRole()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.ACTIVITY__RESOURCES,
                Bpmn2Factory.eINSTANCE.createPerformer()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.ACTIVITY__RESOURCES,
                Bpmn2Factory.eINSTANCE.createHumanPerformer()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.ACTIVITY__RESOURCES,
                Bpmn2Factory.eINSTANCE.createPotentialOwner()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.ACTIVITY__LOOP_CHARACTERISTICS,
                Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.ACTIVITY__LOOP_CHARACTERISTICS,
                Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics()));
    }

}
