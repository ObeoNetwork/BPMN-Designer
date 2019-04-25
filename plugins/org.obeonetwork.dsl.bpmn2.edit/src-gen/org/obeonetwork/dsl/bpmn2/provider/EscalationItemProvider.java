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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Escalation;

/**
 * This is the item provider adapter for a
 * {@link org.obeonetwork.dsl.bpmn2.Escalation} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EscalationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EscalationItemProvider(AdapterFactory adapterFactory) {
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

			addStructureRefPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addEscalationCodePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Structure Ref feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStructureRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Escalation_structureRef_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Escalation_structureRef_feature",
								"_UI_Escalation_type"),
						Bpmn2Package.Literals.ESCALATION__STRUCTURE_REF, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Escalation_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Escalation_name_feature",
								"_UI_Escalation_type"),
						Bpmn2Package.Literals.ESCALATION__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Escalation Code feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEscalationCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Escalation_escalationCode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Escalation_escalationCode_feature",
								"_UI_Escalation_type"),
						Bpmn2Package.Literals.ESCALATION__ESCALATION_CODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Escalation_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Escalation_id_feature",
								"_UI_Escalation_type"),
						Bpmn2Package.Literals.ESCALATION__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Escalation.png. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		try {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Escalation.png"));
		} catch (java.util.MissingResourceException e) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Escalation.gif"));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Escalation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Escalation_type") : label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update
	 * any cached children and by creating a viewer notification, which it passes to
	 * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Escalation.class)) {
		case Bpmn2Package.ESCALATION__NAME:
		case Bpmn2Package.ESCALATION__ESCALATION_CODE:
		case Bpmn2Package.ESCALATION__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing
	 * the children that can be created under this object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Bpmn2EditPlugin.INSTANCE;
	}

}
