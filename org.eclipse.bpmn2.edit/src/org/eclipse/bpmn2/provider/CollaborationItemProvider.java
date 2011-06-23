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
import org.eclipse.bpmn2.Collaboration;
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
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.Collaboration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborationItemProvider extends RootElementItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollaborationItemProvider(AdapterFactory adapterFactory) {
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

            addChoreographyRefPropertyDescriptor(object);
            addIsClosedPropertyDescriptor(object);
            addNamePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Choreography Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChoreographyRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Collaboration_choreographyRef_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Collaboration_choreographyRef_feature", "_UI_Collaboration_type"),
                Bpmn2Package.Literals.COLLABORATION__CHOREOGRAPHY_REF, true, false, true, null,
                null, null));
    }

    /**
     * This adds a property descriptor for the Is Closed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsClosedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Collaboration_isClosed_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Collaboration_isClosed_feature", "_UI_Collaboration_type"),
                Bpmn2Package.Literals.COLLABORATION__IS_CLOSED, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
                getString("_UI_Collaboration_name_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_name_feature",
                        "_UI_Collaboration_type"), Bpmn2Package.Literals.COLLABORATION__NAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(Bpmn2Package.Literals.COLLABORATION__PARTICIPANTS);
            childrenFeatures.add(Bpmn2Package.Literals.COLLABORATION__MESSAGE_FLOWS);
            childrenFeatures.add(Bpmn2Package.Literals.COLLABORATION__ARTIFACTS);
            childrenFeatures.add(Bpmn2Package.Literals.COLLABORATION__CONVERSATIONS);
            childrenFeatures.add(Bpmn2Package.Literals.COLLABORATION__CONVERSATION_ASSOCIATIONS);
            childrenFeatures.add(Bpmn2Package.Literals.COLLABORATION__PARTICIPANT_ASSOCIATIONS);
            childrenFeatures.add(Bpmn2Package.Literals.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS);
            childrenFeatures.add(Bpmn2Package.Literals.COLLABORATION__CORRELATION_KEYS);
            childrenFeatures.add(Bpmn2Package.Literals.COLLABORATION__CONVERSATION_LINKS);
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
     * This returns Collaboration.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        try {
            return overlayImage(object,
                    getResourceLocator().getImage("full/obj16/Collaboration.png"));
        } catch (java.util.MissingResourceException e) {
            return overlayImage(object,
                    getResourceLocator().getImage("full/obj16/Collaboration.gif"));
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
        String label = ((Collaboration) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Collaboration_type")
                : getString("_UI_Collaboration_type") + " " + label;
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

        switch (notification.getFeatureID(Collaboration.class)) {
        case Bpmn2Package.COLLABORATION__IS_CLOSED:
        case Bpmn2Package.COLLABORATION__NAME:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
            return;
        case Bpmn2Package.COLLABORATION__PARTICIPANTS:
        case Bpmn2Package.COLLABORATION__MESSAGE_FLOWS:
        case Bpmn2Package.COLLABORATION__ARTIFACTS:
        case Bpmn2Package.COLLABORATION__CONVERSATIONS:
        case Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
        case Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
        case Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
        case Bpmn2Package.COLLABORATION__CORRELATION_KEYS:
        case Bpmn2Package.COLLABORATION__CONVERSATION_LINKS:
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
                Bpmn2Package.Literals.COLLABORATION__PARTICIPANTS,
                Bpmn2Factory.eINSTANCE.createParticipant()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__MESSAGE_FLOWS,
                Bpmn2Factory.eINSTANCE.createMessageFlow()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__ARTIFACTS,
                Bpmn2Factory.eINSTANCE.createAssociation()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__ARTIFACTS,
                Bpmn2Factory.eINSTANCE.createGroup()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__ARTIFACTS,
                Bpmn2Factory.eINSTANCE.createTextAnnotation()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__CONVERSATIONS,
                Bpmn2Factory.eINSTANCE.createCallConversation()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__CONVERSATIONS,
                Bpmn2Factory.eINSTANCE.createConversation()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__CONVERSATIONS,
                Bpmn2Factory.eINSTANCE.createSubConversation()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__CONVERSATION_ASSOCIATIONS,
                Bpmn2Factory.eINSTANCE.createConversationAssociation()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__PARTICIPANT_ASSOCIATIONS,
                Bpmn2Factory.eINSTANCE.createParticipantAssociation()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS,
                Bpmn2Factory.eINSTANCE.createMessageFlowAssociation()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__CORRELATION_KEYS,
                Bpmn2Factory.eINSTANCE.createCorrelationKey()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.COLLABORATION__CONVERSATION_LINKS,
                Bpmn2Factory.eINSTANCE.createConversationLink()));
    }

}
