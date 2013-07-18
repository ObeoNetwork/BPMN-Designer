/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class ExtensionAttributeValuePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ExtensionAttributeValuePropertiesEditionPart {

	protected EObjectFlatComboViewer valueRef;
	protected EObjectFlatComboViewer extensionAttributeDefinition;



	/**
	 * For {@link ISection} use only.
	 */
	public ExtensionAttributeValuePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ExtensionAttributeValuePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence extensionAttributeValueStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = extensionAttributeValueStep.addStep(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition);
		
		
		composer = new PartComposer(extensionAttributeValueStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef) {
					return createValueRefFlatComboViewer(parent, widgetFactory);
				}
				if (key == Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition) {
					return createExtensionAttributeDefinitionFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(Bpmn2Messages.ExtensionAttributeValuePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createValueRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef, Bpmn2Messages.ExtensionAttributeValuePropertiesEditionPart_ValueRefLabel);
		valueRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(valueRef);
		valueRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData valueRefData = new GridData(GridData.FILL_HORIZONTAL);
		valueRef.setLayoutData(valueRefData);
		valueRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionAttributeValuePropertiesEditionPartForm.this, Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getValueRef()));
			}

		});
		valueRef.setID(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createExtensionAttributeDefinitionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition, Bpmn2Messages.ExtensionAttributeValuePropertiesEditionPart_ExtensionAttributeDefinitionLabel);
		extensionAttributeDefinition = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(extensionAttributeDefinition);
		extensionAttributeDefinition.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData extensionAttributeDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		extensionAttributeDefinition.setLayoutData(extensionAttributeDefinitionData);
		extensionAttributeDefinition.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionAttributeValuePropertiesEditionPartForm.this, Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getExtensionAttributeDefinition()));
			}

		});
		extensionAttributeDefinition.setID(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
