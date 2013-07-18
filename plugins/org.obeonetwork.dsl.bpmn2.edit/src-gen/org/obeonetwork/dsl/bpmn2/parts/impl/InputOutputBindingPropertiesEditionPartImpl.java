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
import org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class InputOutputBindingPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InputOutputBindingPropertiesEditionPart {

	protected EObjectFlatComboViewer inputDataRef;
	protected EObjectFlatComboViewer outputDataRef;
	protected EObjectFlatComboViewer operationRef;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InputOutputBindingPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence inputOutputBindingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = inputOutputBindingStep.addStep(Bpmn2ViewsRepository.InputOutputBinding.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef);
		
		
		composer = new PartComposer(inputOutputBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.InputOutputBinding.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef) {
					return createInputDataRefFlatComboViewer(parent);
				}
				if (key == Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef) {
					return createOutputDataRefFlatComboViewer(parent);
				}
				if (key == Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef) {
					return createOperationRefFlatComboViewer(parent);
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
		propertiesGroup.setText(Bpmn2Messages.InputOutputBindingPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createInputDataRefFlatComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef, Bpmn2Messages.InputOutputBindingPropertiesEditionPart_InputDataRefLabel);
		inputDataRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef, Bpmn2ViewsRepository.SWT_KIND));
		inputDataRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		inputDataRef.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputOutputBindingPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getInputDataRef()));
			}

		});
		GridData inputDataRefData = new GridData(GridData.FILL_HORIZONTAL);
		inputDataRef.setLayoutData(inputDataRefData);
		inputDataRef.setID(Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOutputDataRefFlatComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef, Bpmn2Messages.InputOutputBindingPropertiesEditionPart_OutputDataRefLabel);
		outputDataRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef, Bpmn2ViewsRepository.SWT_KIND));
		outputDataRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		outputDataRef.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputOutputBindingPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOutputDataRef()));
			}

		});
		GridData outputDataRefData = new GridData(GridData.FILL_HORIZONTAL);
		outputDataRef.setLayoutData(outputDataRefData);
		outputDataRef.setID(Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOperationRefFlatComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef, Bpmn2Messages.InputOutputBindingPropertiesEditionPart_OperationRefLabel);
		operationRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef, Bpmn2ViewsRepository.SWT_KIND));
		operationRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		operationRef.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputOutputBindingPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOperationRef()));
			}

		});
		GridData operationRefData = new GridData(GridData.FILL_HORIZONTAL);
		operationRef.setLayoutData(operationRefData);
		operationRef.setID(Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
