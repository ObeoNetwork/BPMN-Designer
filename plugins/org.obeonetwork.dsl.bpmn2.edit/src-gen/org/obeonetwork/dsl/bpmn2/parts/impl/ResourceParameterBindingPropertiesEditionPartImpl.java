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
import org.obeonetwork.dsl.bpmn2.parts.ResourceParameterBindingPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class ResourceParameterBindingPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ResourceParameterBindingPropertiesEditionPart {

	protected EObjectFlatComboViewer parameterRef;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ResourceParameterBindingPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence resourceParameterBindingStep = new BindingCompositionSequence(propertiesEditionComponent);
		resourceParameterBindingStep
			.addStep(Bpmn2ViewsRepository.ResourceParameterBinding.Properties.class)
			.addStep(Bpmn2ViewsRepository.ResourceParameterBinding.Properties.parameterRef);
		
		
		composer = new PartComposer(resourceParameterBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.ResourceParameterBinding.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Bpmn2ViewsRepository.ResourceParameterBinding.Properties.parameterRef) {
					return createParameterRefFlatComboViewer(parent);
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
		propertiesGroup.setText(Bpmn2Messages.ResourceParameterBindingPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createParameterRefFlatComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.ResourceParameterBinding.Properties.parameterRef, Bpmn2Messages.ResourceParameterBindingPropertiesEditionPart_ParameterRefLabel);
		parameterRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.ResourceParameterBinding.Properties.parameterRef, Bpmn2ViewsRepository.SWT_KIND));
		parameterRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parameterRef.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ResourceParameterBindingPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ResourceParameterBinding.Properties.parameterRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParameterRef()));
			}

		});
		GridData parameterRefData = new GridData(GridData.FILL_HORIZONTAL);
		parameterRef.setLayoutData(parameterRefData);
		parameterRef.setID(Bpmn2ViewsRepository.ResourceParameterBinding.Properties.parameterRef);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ResourceParameterBinding.Properties.parameterRef, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ResourceParameterBindingPropertiesEditionPart#getParameterRef()
	 * 
	 */
	public EObject getParameterRef() {
		if (parameterRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parameterRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ResourceParameterBindingPropertiesEditionPart#initParameterRef(EObjectFlatComboSettings)
	 */
	public void initParameterRef(EObjectFlatComboSettings settings) {
		parameterRef.setInput(settings);
		if (current != null) {
			parameterRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ResourceParameterBindingPropertiesEditionPart#setParameterRef(EObject newValue)
	 * 
	 */
	public void setParameterRef(EObject newValue) {
		if (newValue != null) {
			parameterRef.setSelection(new StructuredSelection(newValue));
		} else {
			parameterRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ResourceParameterBindingPropertiesEditionPart#setParameterRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParameterRefButtonMode(ButtonsModeEnum newValue) {
		parameterRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ResourceParameterBindingPropertiesEditionPart#addFilterParameterRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParameterRef(ViewerFilter filter) {
		parameterRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ResourceParameterBindingPropertiesEditionPart#addBusinessFilterParameterRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParameterRef(ViewerFilter filter) {
		parameterRef.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.ResourceParameterBinding_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
