/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class ExtensionAttributeValuePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ExtensionAttributeValuePropertiesEditionPart {

	protected EObjectFlatComboViewer valueRef;
	protected EObjectFlatComboViewer extensionAttributeDefinition;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ExtensionAttributeValuePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence extensionAttributeValueStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = extensionAttributeValueStep.addStep(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition);
		
		
		composer = new PartComposer(extensionAttributeValueStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef) {
					return createValueRefFlatComboViewer(parent);
				}
				if (key == Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition) {
					return createExtensionAttributeDefinitionFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(Bpmn2Messages.ExtensionAttributeValuePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createValueRefFlatComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef, Bpmn2Messages.ExtensionAttributeValuePropertiesEditionPart_ValueRefLabel);
		valueRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef, Bpmn2ViewsRepository.SWT_KIND));
		valueRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		valueRef.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionAttributeValuePropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getValueRef()));
			}

		});
		GridData valueRefData = new GridData(GridData.FILL_HORIZONTAL);
		valueRef.setLayoutData(valueRefData);
		valueRef.setID(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createExtensionAttributeDefinitionFlatComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition, Bpmn2Messages.ExtensionAttributeValuePropertiesEditionPart_ExtensionAttributeDefinitionLabel);
		extensionAttributeDefinition = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition, Bpmn2ViewsRepository.SWT_KIND));
		extensionAttributeDefinition.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		extensionAttributeDefinition.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionAttributeValuePropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getExtensionAttributeDefinition()));
			}

		});
		GridData extensionAttributeDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		extensionAttributeDefinition.setLayoutData(extensionAttributeDefinitionData);
		extensionAttributeDefinition.setID(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#getValueRef()
	 * 
	 */
	public EObject getValueRef() {
		if (valueRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) valueRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#initValueRef(EObjectFlatComboSettings)
	 */
	public void initValueRef(EObjectFlatComboSettings settings) {
		valueRef.setInput(settings);
		if (current != null) {
			valueRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#setValueRef(EObject newValue)
	 * 
	 */
	public void setValueRef(EObject newValue) {
		if (newValue != null) {
			valueRef.setSelection(new StructuredSelection(newValue));
		} else {
			valueRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#setValueRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setValueRefButtonMode(ButtonsModeEnum newValue) {
		valueRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#addFilterValueRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToValueRef(ViewerFilter filter) {
		valueRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#addBusinessFilterValueRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToValueRef(ViewerFilter filter) {
		valueRef.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#getExtensionAttributeDefinition()
	 * 
	 */
	public EObject getExtensionAttributeDefinition() {
		if (extensionAttributeDefinition.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) extensionAttributeDefinition.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#initExtensionAttributeDefinition(EObjectFlatComboSettings)
	 */
	public void initExtensionAttributeDefinition(EObjectFlatComboSettings settings) {
		extensionAttributeDefinition.setInput(settings);
		if (current != null) {
			extensionAttributeDefinition.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#setExtensionAttributeDefinition(EObject newValue)
	 * 
	 */
	public void setExtensionAttributeDefinition(EObject newValue) {
		if (newValue != null) {
			extensionAttributeDefinition.setSelection(new StructuredSelection(newValue));
		} else {
			extensionAttributeDefinition.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#setExtensionAttributeDefinitionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setExtensionAttributeDefinitionButtonMode(ButtonsModeEnum newValue) {
		extensionAttributeDefinition.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#addFilterExtensionAttributeDefinition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionAttributeDefinition(ViewerFilter filter) {
		extensionAttributeDefinition.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart#addBusinessFilterExtensionAttributeDefinition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionAttributeDefinition(ViewerFilter filter) {
		extensionAttributeDefinition.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.ExtensionAttributeValue_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
