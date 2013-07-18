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

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class ExtensionAttributeDefinitionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ExtensionAttributeDefinitionPropertiesEditionPart {

	protected Text name;
	protected Text type;
	protected Button isReference;
	protected EObjectFlatComboViewer extensionDefinition;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ExtensionAttributeDefinitionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence extensionAttributeDefinitionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = extensionAttributeDefinitionStep.addStep(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type);
		propertiesStep.addStep(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference);
		propertiesStep.addStep(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition);
		
		
		composer = new PartComposer(extensionAttributeDefinitionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name) {
					return createNameText(parent);
				}
				if (key == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type) {
					return createTypeText(parent);
				}
				if (key == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference) {
					return createIsReferenceCheckbox(parent);
				}
				if (key == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition) {
					return createExtensionDefinitionFlatComboViewer(parent);
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
		propertiesGroup.setText(Bpmn2Messages.ExtensionAttributeDefinitionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name, Bpmn2Messages.ExtensionAttributeDefinitionPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionAttributeDefinitionPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionAttributeDefinitionPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type, Bpmn2Messages.ExtensionAttributeDefinitionPropertiesEditionPart_TypeLabel);
		type = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionAttributeDefinitionPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
			}

		});
		type.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionAttributeDefinitionPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}

		});
		EditingUtils.setID(type, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsReferenceCheckbox(Composite parent) {
		isReference = new Button(parent, SWT.CHECK);
		isReference.setText(getDescription(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference, Bpmn2Messages.ExtensionAttributeDefinitionPropertiesEditionPart_IsReferenceLabel));
		isReference.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionAttributeDefinitionPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isReference.getSelection())));
			}

		});
		GridData isReferenceData = new GridData(GridData.FILL_HORIZONTAL);
		isReferenceData.horizontalSpan = 2;
		isReference.setLayoutData(isReferenceData);
		EditingUtils.setID(isReference, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference);
		EditingUtils.setEEFtype(isReference, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createExtensionDefinitionFlatComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition, Bpmn2Messages.ExtensionAttributeDefinitionPropertiesEditionPart_ExtensionDefinitionLabel);
		extensionDefinition = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition, Bpmn2ViewsRepository.SWT_KIND));
		extensionDefinition.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		extensionDefinition.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionAttributeDefinitionPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getExtensionDefinition()));
			}

		});
		GridData extensionDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinition.setLayoutData(extensionDefinitionData);
		extensionDefinition.setID(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#setType(String newValue)
	 * 
	 */
	public void setType(String newValue) {
		if (newValue != null) {
			type.setText(newValue);
		} else {
			type.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#getIsReference()
	 * 
	 */
	public Boolean getIsReference() {
		return Boolean.valueOf(isReference.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#setIsReference(Boolean newValue)
	 * 
	 */
	public void setIsReference(Boolean newValue) {
		if (newValue != null) {
			isReference.setSelection(newValue.booleanValue());
		} else {
			isReference.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#getExtensionDefinition()
	 * 
	 */
	public EObject getExtensionDefinition() {
		if (extensionDefinition.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) extensionDefinition.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#initExtensionDefinition(EObjectFlatComboSettings)
	 */
	public void initExtensionDefinition(EObjectFlatComboSettings settings) {
		extensionDefinition.setInput(settings);
		if (current != null) {
			extensionDefinition.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#setExtensionDefinition(EObject newValue)
	 * 
	 */
	public void setExtensionDefinition(EObject newValue) {
		if (newValue != null) {
			extensionDefinition.setSelection(new StructuredSelection(newValue));
		} else {
			extensionDefinition.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#setExtensionDefinitionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setExtensionDefinitionButtonMode(ButtonsModeEnum newValue) {
		extensionDefinition.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#addFilterExtensionDefinition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinition(ViewerFilter filter) {
		extensionDefinition.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart#addBusinessFilterExtensionDefinition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinition(ViewerFilter filter) {
		extensionDefinition.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.ExtensionAttributeDefinition_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
