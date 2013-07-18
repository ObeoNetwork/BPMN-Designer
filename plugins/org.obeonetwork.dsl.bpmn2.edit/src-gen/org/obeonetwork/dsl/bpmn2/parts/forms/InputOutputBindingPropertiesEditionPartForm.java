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
import org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class InputOutputBindingPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, InputOutputBindingPropertiesEditionPart {

	protected EObjectFlatComboViewer inputDataRef;
	protected EObjectFlatComboViewer outputDataRef;
	protected EObjectFlatComboViewer operationRef;



	/**
	 * For {@link ISection} use only.
	 */
	public InputOutputBindingPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InputOutputBindingPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence inputOutputBindingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = inputOutputBindingStep.addStep(Bpmn2ViewsRepository.InputOutputBinding.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef);
		
		
		composer = new PartComposer(inputOutputBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.InputOutputBinding.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef) {
					return createInputDataRefFlatComboViewer(parent, widgetFactory);
				}
				if (key == Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef) {
					return createOutputDataRefFlatComboViewer(parent, widgetFactory);
				}
				if (key == Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef) {
					return createOperationRefFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(Bpmn2Messages.InputOutputBindingPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createInputDataRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef, Bpmn2Messages.InputOutputBindingPropertiesEditionPart_InputDataRefLabel);
		inputDataRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(inputDataRef);
		inputDataRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData inputDataRefData = new GridData(GridData.FILL_HORIZONTAL);
		inputDataRef.setLayoutData(inputDataRefData);
		inputDataRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputOutputBindingPropertiesEditionPartForm.this, Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInputDataRef()));
			}

		});
		inputDataRef.setID(Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOutputDataRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef, Bpmn2Messages.InputOutputBindingPropertiesEditionPart_OutputDataRefLabel);
		outputDataRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(outputDataRef);
		outputDataRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData outputDataRefData = new GridData(GridData.FILL_HORIZONTAL);
		outputDataRef.setLayoutData(outputDataRefData);
		outputDataRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputOutputBindingPropertiesEditionPartForm.this, Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOutputDataRef()));
			}

		});
		outputDataRef.setID(Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOperationRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef, Bpmn2Messages.InputOutputBindingPropertiesEditionPart_OperationRefLabel);
		operationRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(operationRef);
		operationRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData operationRefData = new GridData(GridData.FILL_HORIZONTAL);
		operationRef.setLayoutData(operationRefData);
		operationRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputOutputBindingPropertiesEditionPartForm.this, Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOperationRef()));
			}

		});
		operationRef.setID(Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#getInputDataRef()
	 * 
	 */
	public EObject getInputDataRef() {
		if (inputDataRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) inputDataRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#initInputDataRef(EObjectFlatComboSettings)
	 */
	public void initInputDataRef(EObjectFlatComboSettings settings) {
		inputDataRef.setInput(settings);
		if (current != null) {
			inputDataRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#setInputDataRef(EObject newValue)
	 * 
	 */
	public void setInputDataRef(EObject newValue) {
		if (newValue != null) {
			inputDataRef.setSelection(new StructuredSelection(newValue));
		} else {
			inputDataRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#setInputDataRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInputDataRefButtonMode(ButtonsModeEnum newValue) {
		inputDataRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#addFilterInputDataRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInputDataRef(ViewerFilter filter) {
		inputDataRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#addBusinessFilterInputDataRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInputDataRef(ViewerFilter filter) {
		inputDataRef.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#getOutputDataRef()
	 * 
	 */
	public EObject getOutputDataRef() {
		if (outputDataRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) outputDataRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#initOutputDataRef(EObjectFlatComboSettings)
	 */
	public void initOutputDataRef(EObjectFlatComboSettings settings) {
		outputDataRef.setInput(settings);
		if (current != null) {
			outputDataRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#setOutputDataRef(EObject newValue)
	 * 
	 */
	public void setOutputDataRef(EObject newValue) {
		if (newValue != null) {
			outputDataRef.setSelection(new StructuredSelection(newValue));
		} else {
			outputDataRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#setOutputDataRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOutputDataRefButtonMode(ButtonsModeEnum newValue) {
		outputDataRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#addFilterOutputDataRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutputDataRef(ViewerFilter filter) {
		outputDataRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#addBusinessFilterOutputDataRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutputDataRef(ViewerFilter filter) {
		outputDataRef.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#getOperationRef()
	 * 
	 */
	public EObject getOperationRef() {
		if (operationRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) operationRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#initOperationRef(EObjectFlatComboSettings)
	 */
	public void initOperationRef(EObjectFlatComboSettings settings) {
		operationRef.setInput(settings);
		if (current != null) {
			operationRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#setOperationRef(EObject newValue)
	 * 
	 */
	public void setOperationRef(EObject newValue) {
		if (newValue != null) {
			operationRef.setSelection(new StructuredSelection(newValue));
		} else {
			operationRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#setOperationRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOperationRefButtonMode(ButtonsModeEnum newValue) {
		operationRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#addFilterOperationRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOperationRef(ViewerFilter filter) {
		operationRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart#addBusinessFilterOperationRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOperationRef(ViewerFilter filter) {
		operationRef.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.InputOutputBinding_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
