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
import org.eclipse.bpmn2.DocumentRoot;
import org.eclipse.bpmn2.di.BpmnDiFactory;
import org.eclipse.dd.dc.DcFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.DocumentRoot} object.
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
     * @generated not
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(Bpmn2Package.Literals.DOCUMENT_ROOT__DEFINITIONS);

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
     * @generated not
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(DocumentRoot.class)) {

        case Bpmn2Package.DOCUMENT_ROOT__DEFINITIONS:
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
     * @generated not
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(
                Bpmn2Package.Literals.DOCUMENT_ROOT__DEFINITIONS,
                Bpmn2Factory.eINSTANCE.createDefinitions()));

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
                || childFeature == Bpmn2Package.Literals.DOCUMENT_ROOT__IMPORT;

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
