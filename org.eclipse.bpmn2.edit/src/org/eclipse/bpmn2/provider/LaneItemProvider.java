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
import org.eclipse.bpmn2.Lane;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
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
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.Lane} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LaneItemProvider extends BaseElementItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LaneItemProvider(AdapterFactory adapterFactory) {
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

            addFlowNodeRefsPropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addPartitionElementRefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Flow Node Refs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlowNodeRefsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Lane_flowNodeRefs_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Lane_flowNodeRefs_feature",
                        "_UI_Lane_type"), Bpmn2Package.Literals.LANE__FLOW_NODE_REFS, true, false,
                true, null, null, null));
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
                getString("_UI_Lane_name_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Lane_name_feature",
                        "_UI_Lane_type"), Bpmn2Package.Literals.LANE__NAME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Partition Element Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPartitionElementRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_Lane_partitionElementRef_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Lane_partitionElementRef_feature", "_UI_Lane_type"),
                Bpmn2Package.Literals.LANE__PARTITION_ELEMENT_REF, true, false, true, null, null,
                null));
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
            childrenFeatures.add(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT);
            childrenFeatures.add(Bpmn2Package.Literals.LANE__CHILD_LANE_SET);
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
     * This returns Lane.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        try {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Lane.png"));
        } catch (java.util.MissingResourceException e) {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Lane.gif"));
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
        String label = ((Lane) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Lane_type")
                : getString("_UI_Lane_type") + " " + label;
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

        switch (notification.getFeatureID(Lane.class)) {
        case Bpmn2Package.LANE__NAME:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
            return;
        case Bpmn2Package.LANE__PARTITION_ELEMENT:
        case Bpmn2Package.LANE__CHILD_LANE_SET:
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

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createSubProcess()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createAssignment()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createAuditing()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCallActivity()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCallChoreography()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCallConversation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCancelEventDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCategory()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCategoryValue()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCollaboration()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createChoreography()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createChoreographyTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCompensateEventDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createComplexGateway()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createConditionalEventDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createConversation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createConversationAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createConversationLink()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCorrelationKey()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCorrelationProperty()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCorrelationPropertyBinding()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createCorrelationSubscription()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDataAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createItemAwareElement()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDataInput()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDataInputAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDataObject()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDataObjectReference()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDataOutput()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDataOutputAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDataState()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDataStore()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDataStoreReference()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDefinitions()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createDocumentation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createEndEvent()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createEndPoint()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createError()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createErrorEventDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createEscalation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createEscalationEventDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createEventBasedGateway()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createExclusiveGateway()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createExpression()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createFormalExpression()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createGlobalTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createGlobalConversation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createGlobalManualTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createGlobalScriptTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createGlobalUserTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createGroup()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createResourceRole()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createPerformer()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createHumanPerformer()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createInclusiveGateway()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createInputOutputBinding()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createInputOutputSpecification()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createInputSet()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createInterface()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createItemDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createLane()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createLaneSet()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createLinkEventDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createManualTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createMessage()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createMessageEventDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createMessageFlow()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createMessageFlowAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createMonitoring()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createOperation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createOutputSet()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createParallelGateway()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createParticipant()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createParticipantAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createParticipantMultiplicity()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createPartnerEntity()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createPartnerRole()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createPotentialOwner()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createProcess()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createProperty()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createReceiveTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createRelationship()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createRendering()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createResource()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createResourceAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createResourceParameter()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createResourceParameterBinding()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createScriptTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createSendTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createSequenceFlow()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createServiceTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createSignal()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createSignalEventDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createStartEvent()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createSubChoreography()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createSubConversation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createTerminateEventDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createTextAnnotation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createTimerEventDefinition()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createTransaction()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__PARTITION_ELEMENT,
                Bpmn2Factory.eINSTANCE.createUserTask()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.Literals.LANE__CHILD_LANE_SET,
                Bpmn2Factory.eINSTANCE.createLaneSet()));
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

        boolean qualify = childFeature == Bpmn2Package.Literals.BASE_ELEMENT__DOCUMENTATION
                || childFeature == Bpmn2Package.Literals.LANE__PARTITION_ELEMENT
                || childFeature == Bpmn2Package.Literals.LANE__CHILD_LANE_SET;

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject),
                    getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
