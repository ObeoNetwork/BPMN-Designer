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
import org.eclipse.bpmn2.CatchEvent;
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
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.CatchEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CatchEventItemProvider extends EventItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CatchEventItemProvider(AdapterFactory adapterFactory) {
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

            addEventDefinitionRefsPropertyDescriptor(object);
            addParallelMultiplePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Event Definition Refs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEventDefinitionRefsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_CatchEvent_eventDefinitionRefs_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_CatchEvent_eventDefinitionRefs_feature", "_UI_CatchEvent_type"),
                Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITION_REFS, true, false, true, null,
                null, null));
    }

    /**
     * This adds a property descriptor for the Parallel Multiple feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParallelMultiplePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_CatchEvent_parallelMultiple_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_CatchEvent_parallelMultiple_feature", "_UI_CatchEvent_type"),
                Bpmn2Package.Literals.CATCH_EVENT__PARALLEL_MULTIPLE, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(Bpmn2Package.Literals.CATCH_EVENT__DATA_OUTPUTS);
            childrenFeatures.add(Bpmn2Package.Literals.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION);
            childrenFeatures.add(Bpmn2Package.Literals.CATCH_EVENT__OUTPUT_SET);
            childrenFeatures.add(Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS);
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
        String label = ((CatchEvent) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_CatchEvent_type")
                : getString("_UI_CatchEvent_type") + " " + label;
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

        switch (notification.getFeatureID(CatchEvent.class)) {
        case Bpmn2Package.CATCH_EVENT__PARALLEL_MULTIPLE:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
            return;
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUTS:
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
        case Bpmn2Package.CATCH_EVENT__OUTPUT_SET:
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITIONS:
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
                Bpmn2Package.Literals.CATCH_EVENT__DATA_OUTPUTS,
                Bpmn2Factory.eINSTANCE.createDataOutput()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION,
                Bpmn2Factory.eINSTANCE.createDataOutputAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.CATCH_EVENT__OUTPUT_SET,
                Bpmn2Factory.eINSTANCE.createOutputSet()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS,
                Bpmn2Factory.eINSTANCE.createCancelEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS,
                Bpmn2Factory.eINSTANCE.createCompensateEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS,
                Bpmn2Factory.eINSTANCE.createConditionalEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS,
                Bpmn2Factory.eINSTANCE.createErrorEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS,
                Bpmn2Factory.eINSTANCE.createEscalationEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS,
                Bpmn2Factory.eINSTANCE.createLinkEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS,
                Bpmn2Factory.eINSTANCE.createMessageEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS,
                Bpmn2Factory.eINSTANCE.createSignalEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS,
                Bpmn2Factory.eINSTANCE.createTerminateEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.CATCH_EVENT__EVENT_DEFINITIONS,
                Bpmn2Factory.eINSTANCE.createTimerEventDefinition()));
    }

}
