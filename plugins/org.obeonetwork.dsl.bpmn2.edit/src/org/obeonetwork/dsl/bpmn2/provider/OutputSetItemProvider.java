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
package org.obeonetwork.dsl.bpmn2.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.OutputSet;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.bpmn2.OutputSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputSetItemProvider extends BaseElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSetItemProvider(AdapterFactory adapterFactory) {
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

			addDataOutputRefsPropertyDescriptor(object);
			addOptionalOutputRefsPropertyDescriptor(object);
			addWhileExecutingOutputRefsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addInputSetRefsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Output Refs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataOutputRefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_OutputSet_dataOutputRefs_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OutputSet_dataOutputRefs_feature",
						"_UI_OutputSet_type"),
				Bpmn2Package.Literals.OUTPUT_SET__DATA_OUTPUT_REFS, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Optional Output Refs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalOutputRefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_OutputSet_optionalOutputRefs_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OutputSet_optionalOutputRefs_feature",
						"_UI_OutputSet_type"),
				Bpmn2Package.Literals.OUTPUT_SET__OPTIONAL_OUTPUT_REFS, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the While Executing Output Refs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhileExecutingOutputRefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_OutputSet_whileExecutingOutputRefs_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OutputSet_whileExecutingOutputRefs_feature",
						"_UI_OutputSet_type"),
				Bpmn2Package.Literals.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS,
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_OutputSet_name_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OutputSet_name_feature", "_UI_OutputSet_type"),
				Bpmn2Package.Literals.OUTPUT_SET__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Input Set Refs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputSetRefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_OutputSet_inputSetRefs_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_OutputSet_inputSetRefs_feature",
						"_UI_OutputSet_type"),
				Bpmn2Package.Literals.OUTPUT_SET__INPUT_SET_REFS, true, false,
				true, null, null, null));
	}

	/**
	 * This returns OutputSet.png.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		try {
			return overlayImage(object,
					getResourceLocator().getImage("full/obj16/OutputSet.png"));
		} catch (java.util.MissingResourceException e) {
			return overlayImage(object,
					getResourceLocator().getImage("full/obj16/OutputSet.gif"));
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
		String label = ((OutputSet) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_OutputSet_type")
				: getString("_UI_OutputSet_type") + " " + label;
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

		switch (notification.getFeatureID(OutputSet.class)) {
		case Bpmn2Package.OUTPUT_SET__NAME:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
