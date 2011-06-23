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
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.Process} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProvider extends CallableElementItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ProcessItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addSupportsPropertyDescriptor(object);
            addDefinitionalCollaborationRefPropertyDescriptor(object);
            addIsClosedPropertyDescriptor(object);
            addIsExecutablePropertyDescriptor(object);
            addProcessTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Supports feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addSupportsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Process_supports_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Process_supports_feature",
                        "_UI_Process_type"), Bpmn2Package.Literals.PROCESS__SUPPORTS, true, false,
                true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Definitional Collaboration Ref feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected void addDefinitionalCollaborationRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Process_definitionalCollaborationRef_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Process_definitionalCollaborationRef_feature", "_UI_Process_type"),
                Bpmn2Package.Literals.PROCESS__DEFINITIONAL_COLLABORATION_REF, true, false, true,
                null, null, null));
    }

    /**
     * This adds a property descriptor for the Is Closed feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addIsClosedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Process_isClosed_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Process_isClosed_feature",
                        "_UI_Process_type"), Bpmn2Package.Literals.PROCESS__IS_CLOSED, true, false,
                false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is Executable feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addIsExecutablePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Process_isExecutable_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Process_isExecutable_feature",
                        "_UI_Process_type"), Bpmn2Package.Literals.PROCESS__IS_EXECUTABLE, true,
                false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Process Type feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addProcessTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Process_processType_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Process_processType_feature",
                        "_UI_Process_type"), Bpmn2Package.Literals.PROCESS__PROCESS_TYPE, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__LANE_SETS);
            childrenFeatures.add(Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS);
            childrenFeatures.add(Bpmn2Package.Literals.PROCESS__AUDITING);
            childrenFeatures.add(Bpmn2Package.Literals.PROCESS__MONITORING);
            childrenFeatures.add(Bpmn2Package.Literals.PROCESS__PROPERTIES);
            childrenFeatures.add(Bpmn2Package.Literals.PROCESS__ARTIFACTS);
            childrenFeatures.add(Bpmn2Package.Literals.PROCESS__RESOURCES);
            childrenFeatures.add(Bpmn2Package.Literals.PROCESS__CORRELATION_SUBSCRIPTIONS);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns Process.png.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        try {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Process.png"));
        } catch (java.util.MissingResourceException e) {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Process.gif"));
        }
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((org.eclipse.bpmn2.Process) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Process_type")
                : getString("_UI_Process_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(org.eclipse.bpmn2.Process.class)) {
        case Bpmn2Package.PROCESS__IS_CLOSED:
        case Bpmn2Package.PROCESS__IS_EXECUTABLE:
        case Bpmn2Package.PROCESS__PROCESS_TYPE:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
            return;
        case Bpmn2Package.PROCESS__LANE_SETS:
        case Bpmn2Package.PROCESS__FLOW_ELEMENTS:
        case Bpmn2Package.PROCESS__AUDITING:
        case Bpmn2Package.PROCESS__MONITORING:
        case Bpmn2Package.PROCESS__PROPERTIES:
        case Bpmn2Package.PROCESS__ARTIFACTS:
        case Bpmn2Package.PROCESS__RESOURCES:
        case Bpmn2Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
     * describing the children that can be created under this object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__LANE_SETS,
                Bpmn2Factory.eINSTANCE.createLaneSet()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createSubProcess()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createCallActivity()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createCallChoreography()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createChoreographyTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createComplexGateway()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createDataObject()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createDataObjectReference()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createDataStoreReference()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createEndEvent()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createEventBasedGateway()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createExclusiveGateway()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createInclusiveGateway()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createManualTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createParallelGateway()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createReceiveTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createScriptTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createSendTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createSequenceFlow()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createServiceTask()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createStartEvent()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createSubChoreography()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createTransaction()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS,
                Bpmn2Factory.eINSTANCE.createUserTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.PROCESS__AUDITING,
                Bpmn2Factory.eINSTANCE.createAuditing()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.PROCESS__MONITORING,
                Bpmn2Factory.eINSTANCE.createMonitoring()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.PROCESS__PROPERTIES,
                Bpmn2Factory.eINSTANCE.createProperty()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.PROCESS__ARTIFACTS,
                Bpmn2Factory.eINSTANCE.createAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.PROCESS__ARTIFACTS,
                Bpmn2Factory.eINSTANCE.createGroup()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.PROCESS__ARTIFACTS,
                Bpmn2Factory.eINSTANCE.createTextAnnotation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.PROCESS__RESOURCES,
                Bpmn2Factory.eINSTANCE.createResourceRole()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.PROCESS__RESOURCES,
                Bpmn2Factory.eINSTANCE.createPerformer()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.PROCESS__RESOURCES,
                Bpmn2Factory.eINSTANCE.createHumanPerformer()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.PROCESS__RESOURCES,
                Bpmn2Factory.eINSTANCE.createPotentialOwner()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.PROCESS__CORRELATION_SUBSCRIPTIONS,
                Bpmn2Factory.eINSTANCE.createCorrelationSubscription()));
    }

}
