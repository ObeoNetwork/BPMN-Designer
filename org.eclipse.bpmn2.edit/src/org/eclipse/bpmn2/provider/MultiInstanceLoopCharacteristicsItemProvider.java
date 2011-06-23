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
import org.eclipse.bpmn2.MultiInstanceLoopCharacteristics;
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
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.MultiInstanceLoopCharacteristics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiInstanceLoopCharacteristicsItemProvider extends LoopCharacteristicsItemProvider
        implements IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceLoopCharacteristicsItemProvider(AdapterFactory adapterFactory) {
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

            addLoopDataInputRefPropertyDescriptor(object);
            addLoopDataOutputRefPropertyDescriptor(object);
            addBehaviorPropertyDescriptor(object);
            addIsSequentialPropertyDescriptor(object);
            addNoneBehaviorEventRefPropertyDescriptor(object);
            addOneBehaviorEventRefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Loop Data Input Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoopDataInputRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_MultiInstanceLoopCharacteristics_loopDataInputRef_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_MultiInstanceLoopCharacteristics_loopDataInputRef_feature",
                        "_UI_MultiInstanceLoopCharacteristics_type"),
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Loop Data Output Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoopDataOutputRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_MultiInstanceLoopCharacteristics_loopDataOutputRef_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_MultiInstanceLoopCharacteristics_loopDataOutputRef_feature",
                        "_UI_MultiInstanceLoopCharacteristics_type"),
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Behavior feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBehaviorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_MultiInstanceLoopCharacteristics_behavior_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_MultiInstanceLoopCharacteristics_behavior_feature",
                        "_UI_MultiInstanceLoopCharacteristics_type"),
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is Sequential feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSequentialPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_MultiInstanceLoopCharacteristics_isSequential_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_MultiInstanceLoopCharacteristics_isSequential_feature",
                        "_UI_MultiInstanceLoopCharacteristics_type"),
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL, true,
                false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the None Behavior Event Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNoneBehaviorEventRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_MultiInstanceLoopCharacteristics_noneBehaviorEventRef_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_MultiInstanceLoopCharacteristics_noneBehaviorEventRef_feature",
                        "_UI_MultiInstanceLoopCharacteristics_type"),
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the One Behavior Event Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOneBehaviorEventRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_MultiInstanceLoopCharacteristics_oneBehaviorEventRef_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_MultiInstanceLoopCharacteristics_oneBehaviorEventRef_feature",
                        "_UI_MultiInstanceLoopCharacteristics_type"),
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF,
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
            childrenFeatures
                    .add(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY);
            childrenFeatures
                    .add(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM);
            childrenFeatures
                    .add(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM);
            childrenFeatures
                    .add(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION);
            childrenFeatures
                    .add(Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION);
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
     * This returns MultiInstanceLoopCharacteristics.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        try {
            return overlayImage(object,
                    getResourceLocator()
                            .getImage("full/obj16/MultiInstanceLoopCharacteristics.png"));
        } catch (java.util.MissingResourceException e) {
            return overlayImage(object,
                    getResourceLocator()
                            .getImage("full/obj16/MultiInstanceLoopCharacteristics.gif"));
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
        String label = ((MultiInstanceLoopCharacteristics) object).getId();
        return label == null || label.length() == 0 ? getString("_UI_MultiInstanceLoopCharacteristics_type")
                : getString("_UI_MultiInstanceLoopCharacteristics_type") + " " + label;
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

        switch (notification.getFeatureID(MultiInstanceLoopCharacteristics.class)) {
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
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
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY,
                Bpmn2Factory.eINSTANCE.createExpression()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY,
                Bpmn2Factory.eINSTANCE.createFormalExpression()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM,
                Bpmn2Factory.eINSTANCE.createDataInput()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM,
                Bpmn2Factory.eINSTANCE.createDataOutput()));

        newChildDescriptors
                .add(createChildParameter(
                        Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION,
                        Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION,
                Bpmn2Factory.eINSTANCE.createExpression()));

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION,
                Bpmn2Factory.eINSTANCE.createFormalExpression()));
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

        boolean qualify = childFeature == Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY
                || childFeature == Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION;

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject),
                    getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
