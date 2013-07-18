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

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class EscalationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EscalationPropertiesEditionPart {

	protected EObjectFlatComboViewer structureRef;
	protected Text name;
	protected Text escalationCode;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EscalationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence escalationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = escalationStep.addStep(Bpmn2ViewsRepository.Escalation.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.Escalation.Properties.structureRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.Escalation.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.Escalation.Properties.escalationCode);
		
		
		composer = new PartComposer(escalationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.Escalation.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Bpmn2ViewsRepository.Escalation.Properties.structureRef) {
					return createStructureRefFlatComboViewer(parent);
				}
				if (key == Bpmn2ViewsRepository.Escalation.Properties.name) {
					return createNameText(parent);
				}
				if (key == Bpmn2ViewsRepository.Escalation.Properties.escalationCode) {
					return createEscalationCodeText(parent);
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
		propertiesGroup.setText(Bpmn2Messages.EscalationPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createStructureRefFlatComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Escalation.Properties.structureRef, Bpmn2Messages.EscalationPropertiesEditionPart_StructureRefLabel);
		structureRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.Escalation.Properties.structureRef, Bpmn2ViewsRepository.SWT_KIND));
		structureRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		structureRef.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EscalationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Escalation.Properties.structureRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getStructureRef()));
			}

		});
		GridData structureRefData = new GridData(GridData.FILL_HORIZONTAL);
		structureRef.setLayoutData(structureRefData);
		structureRef.setID(Bpmn2ViewsRepository.Escalation.Properties.structureRef);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Escalation.Properties.structureRef, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Escalation.Properties.name, Bpmn2Messages.EscalationPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EscalationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Escalation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EscalationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Escalation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.Escalation.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Escalation.Properties.name, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createEscalationCodeText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Escalation.Properties.escalationCode, Bpmn2Messages.EscalationPropertiesEditionPart_EscalationCodeLabel);
		escalationCode = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData escalationCodeData = new GridData(GridData.FILL_HORIZONTAL);
		escalationCode.setLayoutData(escalationCodeData);
		escalationCode.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EscalationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Escalation.Properties.escalationCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, escalationCode.getText()));
			}

		});
		escalationCode.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EscalationPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Escalation.Properties.escalationCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, escalationCode.getText()));
				}
			}

		});
		EditingUtils.setID(escalationCode, Bpmn2ViewsRepository.Escalation.Properties.escalationCode);
		EditingUtils.setEEFtype(escalationCode, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Escalation.Properties.escalationCode, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart#getStructureRef()
	 * 
	 */
	public EObject getStructureRef() {
		if (structureRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) structureRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart#initStructureRef(EObjectFlatComboSettings)
	 */
	public void initStructureRef(EObjectFlatComboSettings settings) {
		structureRef.setInput(settings);
		if (current != null) {
			structureRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart#setStructureRef(EObject newValue)
	 * 
	 */
	public void setStructureRef(EObject newValue) {
		if (newValue != null) {
			structureRef.setSelection(new StructuredSelection(newValue));
		} else {
			structureRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart#setStructureRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setStructureRefButtonMode(ButtonsModeEnum newValue) {
		structureRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart#addFilterStructureRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStructureRef(ViewerFilter filter) {
		structureRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart#addBusinessFilterStructureRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStructureRef(ViewerFilter filter) {
		structureRef.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart#getEscalationCode()
	 * 
	 */
	public String getEscalationCode() {
		return escalationCode.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart#setEscalationCode(String newValue)
	 * 
	 */
	public void setEscalationCode(String newValue) {
		if (newValue != null) {
			escalationCode.setText(newValue);
		} else {
			escalationCode.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.Escalation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
