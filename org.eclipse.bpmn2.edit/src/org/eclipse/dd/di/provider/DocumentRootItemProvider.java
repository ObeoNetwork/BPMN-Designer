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
package org.eclipse.dd.di.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn2.di.BpmnDiFactory;
import org.eclipse.bpmn2.provider.Bpmn2EditPlugin;
import org.eclipse.dd.di.DiPackage;
import org.eclipse.dd.di.DocumentRoot;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.dd.di.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider extends ItemProviderAdapter implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add(DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT);
            childrenFeatures.add(DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM);
            childrenFeatures.add(DiPackage.Literals.DOCUMENT_ROOT__EDGE);
            childrenFeatures.add(DiPackage.Literals.DOCUMENT_ROOT__LABEL);
            childrenFeatures.add(DiPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE);
            childrenFeatures.add(DiPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE);
            childrenFeatures.add(DiPackage.Literals.DOCUMENT_ROOT__NODE);
            childrenFeatures.add(DiPackage.Literals.DOCUMENT_ROOT__PLANE);
            childrenFeatures.add(DiPackage.Literals.DOCUMENT_ROOT__SHAPE);
            childrenFeatures.add(DiPackage.Literals.DOCUMENT_ROOT__STYLE);
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
     * This returns DocumentRoot.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        try {
            return overlayImage(object, getResourceLocator()
                    .getImage("full/obj16/DocumentRoot.png"));
        } catch (java.util.MissingResourceException e) {
            return overlayImage(object, getResourceLocator()
                    .getImage("full/obj16/DocumentRoot.gif"));
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
        return getString("_UI_DocumentRoot_type");
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

        switch (notification.getFeatureID(DocumentRoot.class)) {
        case DiPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT:
        case DiPackage.DOCUMENT_ROOT__DIAGRAM:
        case DiPackage.DOCUMENT_ROOT__EDGE:
        case DiPackage.DOCUMENT_ROOT__LABEL:
        case DiPackage.DOCUMENT_ROOT__LABELED_EDGE:
        case DiPackage.DOCUMENT_ROOT__LABELED_SHAPE:
        case DiPackage.DOCUMENT_ROOT__NODE:
        case DiPackage.DOCUMENT_ROOT__PLANE:
        case DiPackage.DOCUMENT_ROOT__SHAPE:
        case DiPackage.DOCUMENT_ROOT__STYLE:
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
                DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
                BpmnDiFactory.eINSTANCE.createBPMNEdge()));

        newChildDescriptors.add(createChildParameter(
                DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
                BpmnDiFactory.eINSTANCE.createBPMNLabel()));

        newChildDescriptors.add(createChildParameter(
                DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
                BpmnDiFactory.eINSTANCE.createBPMNPlane()));

        newChildDescriptors.add(createChildParameter(
                DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
                BpmnDiFactory.eINSTANCE.createBPMNShape()));

        newChildDescriptors.add(createChildParameter(DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM,
                BpmnDiFactory.eINSTANCE.createBPMNDiagram()));

        newChildDescriptors.add(createChildParameter(DiPackage.Literals.DOCUMENT_ROOT__EDGE,
                BpmnDiFactory.eINSTANCE.createBPMNEdge()));

        newChildDescriptors.add(createChildParameter(DiPackage.Literals.DOCUMENT_ROOT__LABEL,
                BpmnDiFactory.eINSTANCE.createBPMNLabel()));

        newChildDescriptors.add(createChildParameter(
                DiPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE,
                BpmnDiFactory.eINSTANCE.createBPMNEdge()));

        newChildDescriptors.add(createChildParameter(
                DiPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE,
                BpmnDiFactory.eINSTANCE.createBPMNShape()));

        newChildDescriptors.add(createChildParameter(DiPackage.Literals.DOCUMENT_ROOT__NODE,
                BpmnDiFactory.eINSTANCE.createBPMNLabel()));

        newChildDescriptors.add(createChildParameter(DiPackage.Literals.DOCUMENT_ROOT__NODE,
                BpmnDiFactory.eINSTANCE.createBPMNPlane()));

        newChildDescriptors.add(createChildParameter(DiPackage.Literals.DOCUMENT_ROOT__NODE,
                BpmnDiFactory.eINSTANCE.createBPMNShape()));

        newChildDescriptors.add(createChildParameter(DiPackage.Literals.DOCUMENT_ROOT__PLANE,
                BpmnDiFactory.eINSTANCE.createBPMNPlane()));

        newChildDescriptors.add(createChildParameter(DiPackage.Literals.DOCUMENT_ROOT__SHAPE,
                BpmnDiFactory.eINSTANCE.createBPMNShape()));

        newChildDescriptors.add(createChildParameter(DiPackage.Literals.DOCUMENT_ROOT__STYLE,
                BpmnDiFactory.eINSTANCE.createBPMNLabelStyle()));
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

        boolean qualify = childFeature == DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__EDGE
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__LABEL
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__NODE
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__PLANE
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE
                || childFeature == DiPackage.Literals.DOCUMENT_ROOT__SHAPE;

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
