/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class CollaborationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, CollaborationPropertiesEditionPart {

	protected Text id;
	protected ReferencesTable extensionDefinitions;
	protected List<ViewerFilter> extensionDefinitionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> extensionDefinitionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable extensionValues;
	protected List<ViewerFilter> extensionValuesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> extensionValuesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable documentation;
	protected List<ViewerFilter> documentationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> documentationFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected Button isClosed;
	protected ReferencesTable choreographyRef;
	protected List<ViewerFilter> choreographyRefBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> choreographyRefFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable artifacts;
	protected List<ViewerFilter> artifactsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> artifactsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable participantAssociations;
	protected List<ViewerFilter> participantAssociationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> participantAssociationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable messageFlowAssociations;
	protected List<ViewerFilter> messageFlowAssociationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> messageFlowAssociationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable messageFlows;
	protected List<ViewerFilter> messageFlowsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> messageFlowsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable correlationKeys;
	protected List<ViewerFilter> correlationKeysBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> correlationKeysFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public CollaborationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CollaborationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence collaborationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = collaborationStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.isClosed);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.choreographyRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.artifacts);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.participantAssociations);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.messageFlowAssociations);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.messageFlows);
		propertiesStep.addStep(Bpmn2ViewsRepository.Collaboration.Properties.correlationKeys);
		
		
		composer = new PartComposer(collaborationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.extensionDefinitions) {
					return createExtensionDefinitionsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.extensionValues) {
					return createExtensionValuesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.documentation) {
					return createDocumentationTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.isClosed) {
					return createIsClosedCheckbox(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.choreographyRef) {
					return createChoreographyRefReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.artifacts) {
					return createArtifactsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.participantAssociations) {
					return createParticipantAssociationsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.messageFlowAssociations) {
					return createMessageFlowAssociationsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.messageFlows) {
					return createMessageFlowsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Collaboration.Properties.correlationKeys) {
					return createCorrelationKeysTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(Bpmn2Messages.CollaborationPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Collaboration.Properties.id, Bpmn2Messages.CollaborationPropertiesEditionPart_IdLabel);
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CollaborationPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Collaboration.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CollaborationPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Collaboration.Properties.id,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, id.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CollaborationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.Collaboration.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.id, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.extensionDefinitions = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Collaboration.Properties.extensionDefinitions, Bpmn2Messages.CollaborationPropertiesEditionPart_ExtensionDefinitionsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.extensionDefinitions, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionDefinitions.createControls(parent, widgetFactory);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.Collaboration.Properties.extensionDefinitions);
		extensionDefinitions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addExtensionDefinitions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(extensionDefinitions.getInput(), extensionDefinitionsFilters, extensionDefinitionsBusinessFilters,
		"extensionDefinitions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.extensionDefinitions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				extensionDefinitions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveExtensionDefinitions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void editExtensionDefinitions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				extensionDefinitions.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createExtensionValuesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Collaboration.Properties.extensionValues, Bpmn2Messages.CollaborationPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.extensionValues, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionValues.createControls(parent, widgetFactory);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.Collaboration.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Collaboration.Properties.documentation, Bpmn2Messages.CollaborationPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.documentation, Bpmn2ViewsRepository.FORM_KIND));
		this.documentation.createControls(parent, widgetFactory);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.Collaboration.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Collaboration.Properties.name, Bpmn2Messages.CollaborationPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CollaborationPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Collaboration.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CollaborationPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Collaboration.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CollaborationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.Collaboration.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.name, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsClosedCheckbox(FormToolkit widgetFactory, Composite parent) {
		isClosed = widgetFactory.createButton(parent, getDescription(Bpmn2ViewsRepository.Collaboration.Properties.isClosed, Bpmn2Messages.CollaborationPropertiesEditionPart_IsClosedLabel), SWT.CHECK);
		isClosed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.isClosed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isClosed.getSelection())));
			}

		});
		GridData isClosedData = new GridData(GridData.FILL_HORIZONTAL);
		isClosedData.horizontalSpan = 2;
		isClosed.setLayoutData(isClosedData);
		EditingUtils.setID(isClosed, Bpmn2ViewsRepository.Collaboration.Properties.isClosed);
		EditingUtils.setEEFtype(isClosed, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.isClosed, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createChoreographyRefReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.choreographyRef = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Collaboration.Properties.choreographyRef, Bpmn2Messages.CollaborationPropertiesEditionPart_ChoreographyRefLabel), new ReferencesTableListener	() {
			public void handleAdd() { addChoreographyRef(); }
			public void handleEdit(EObject element) { editChoreographyRef(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveChoreographyRef(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromChoreographyRef(element); }
			public void navigateTo(EObject element) { }
		});
		this.choreographyRef.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.choreographyRef, Bpmn2ViewsRepository.FORM_KIND));
		this.choreographyRef.createControls(parent, widgetFactory);
		this.choreographyRef.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.choreographyRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData choreographyRefData = new GridData(GridData.FILL_HORIZONTAL);
		choreographyRefData.horizontalSpan = 3;
		this.choreographyRef.setLayoutData(choreographyRefData);
		this.choreographyRef.disableMove();
		choreographyRef.setID(Bpmn2ViewsRepository.Collaboration.Properties.choreographyRef);
		choreographyRef.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addChoreographyRef() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(choreographyRef.getInput(), choreographyRefFilters, choreographyRefBusinessFilters,
		"choreographyRef", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.choreographyRef,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				choreographyRef.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveChoreographyRef(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.choreographyRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		choreographyRef.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromChoreographyRef(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.choreographyRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		choreographyRef.refresh();
	}

	/**
	 * 
	 */
	protected void editChoreographyRef(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				choreographyRef.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createArtifactsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.artifacts = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Collaboration.Properties.artifacts, Bpmn2Messages.CollaborationPropertiesEditionPart_ArtifactsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				artifacts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				artifacts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				artifacts.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				artifacts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.artifactsFilters) {
			this.artifacts.addFilter(filter);
		}
		this.artifacts.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.artifacts, Bpmn2ViewsRepository.FORM_KIND));
		this.artifacts.createControls(parent, widgetFactory);
		this.artifacts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.artifacts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData artifactsData = new GridData(GridData.FILL_HORIZONTAL);
		artifactsData.horizontalSpan = 3;
		this.artifacts.setLayoutData(artifactsData);
		this.artifacts.setLowerBound(0);
		this.artifacts.setUpperBound(-1);
		artifacts.setID(Bpmn2ViewsRepository.Collaboration.Properties.artifacts);
		artifacts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createParticipantAssociationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.participantAssociations = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Collaboration.Properties.participantAssociations, Bpmn2Messages.CollaborationPropertiesEditionPart_ParticipantAssociationsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.participantAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				participantAssociations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.participantAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				participantAssociations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.participantAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				participantAssociations.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.participantAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				participantAssociations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.participantAssociationsFilters) {
			this.participantAssociations.addFilter(filter);
		}
		this.participantAssociations.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.participantAssociations, Bpmn2ViewsRepository.FORM_KIND));
		this.participantAssociations.createControls(parent, widgetFactory);
		this.participantAssociations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.participantAssociations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData participantAssociationsData = new GridData(GridData.FILL_HORIZONTAL);
		participantAssociationsData.horizontalSpan = 3;
		this.participantAssociations.setLayoutData(participantAssociationsData);
		this.participantAssociations.setLowerBound(0);
		this.participantAssociations.setUpperBound(-1);
		participantAssociations.setID(Bpmn2ViewsRepository.Collaboration.Properties.participantAssociations);
		participantAssociations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMessageFlowAssociationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.messageFlowAssociations = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Collaboration.Properties.messageFlowAssociations, Bpmn2Messages.CollaborationPropertiesEditionPart_MessageFlowAssociationsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.messageFlowAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				messageFlowAssociations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.messageFlowAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				messageFlowAssociations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.messageFlowAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				messageFlowAssociations.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.messageFlowAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				messageFlowAssociations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.messageFlowAssociationsFilters) {
			this.messageFlowAssociations.addFilter(filter);
		}
		this.messageFlowAssociations.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.messageFlowAssociations, Bpmn2ViewsRepository.FORM_KIND));
		this.messageFlowAssociations.createControls(parent, widgetFactory);
		this.messageFlowAssociations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.messageFlowAssociations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData messageFlowAssociationsData = new GridData(GridData.FILL_HORIZONTAL);
		messageFlowAssociationsData.horizontalSpan = 3;
		this.messageFlowAssociations.setLayoutData(messageFlowAssociationsData);
		this.messageFlowAssociations.setLowerBound(0);
		this.messageFlowAssociations.setUpperBound(-1);
		messageFlowAssociations.setID(Bpmn2ViewsRepository.Collaboration.Properties.messageFlowAssociations);
		messageFlowAssociations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMessageFlowsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.messageFlows = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Collaboration.Properties.messageFlows, Bpmn2Messages.CollaborationPropertiesEditionPart_MessageFlowsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.messageFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				messageFlows.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.messageFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				messageFlows.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.messageFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				messageFlows.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.messageFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				messageFlows.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.messageFlowsFilters) {
			this.messageFlows.addFilter(filter);
		}
		this.messageFlows.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.messageFlows, Bpmn2ViewsRepository.FORM_KIND));
		this.messageFlows.createControls(parent, widgetFactory);
		this.messageFlows.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.messageFlows, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData messageFlowsData = new GridData(GridData.FILL_HORIZONTAL);
		messageFlowsData.horizontalSpan = 3;
		this.messageFlows.setLayoutData(messageFlowsData);
		this.messageFlows.setLowerBound(0);
		this.messageFlows.setUpperBound(-1);
		messageFlows.setID(Bpmn2ViewsRepository.Collaboration.Properties.messageFlows);
		messageFlows.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCorrelationKeysTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.correlationKeys = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Collaboration.Properties.correlationKeys, Bpmn2Messages.CollaborationPropertiesEditionPart_CorrelationKeysLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.correlationKeys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				correlationKeys.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.correlationKeys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				correlationKeys.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.correlationKeys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				correlationKeys.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.correlationKeys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				correlationKeys.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.correlationKeysFilters) {
			this.correlationKeys.addFilter(filter);
		}
		this.correlationKeys.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Collaboration.Properties.correlationKeys, Bpmn2ViewsRepository.FORM_KIND));
		this.correlationKeys.createControls(parent, widgetFactory);
		this.correlationKeys.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollaborationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Collaboration.Properties.correlationKeys, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData correlationKeysData = new GridData(GridData.FILL_HORIZONTAL);
		correlationKeysData.horizontalSpan = 3;
		this.correlationKeys.setLayoutData(correlationKeysData);
		this.correlationKeys.setLowerBound(0);
		this.correlationKeys.setUpperBound(-1);
		correlationKeys.setID(Bpmn2ViewsRepository.Collaboration.Properties.correlationKeys);
		correlationKeys.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initExtensionDefinitions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		extensionDefinitions.setContentProvider(contentProvider);
		extensionDefinitions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initExtensionValues(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		extensionValues.setContentProvider(contentProvider);
		extensionValues.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesFilters.add(filter);
		if (this.extensionValues != null) {
			this.extensionValues.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDocumentation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		documentation.setContentProvider(contentProvider);
		documentation.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDocumentation(ViewerFilter filter) {
		documentationFilters.add(filter);
		if (this.documentation != null) {
			this.documentation.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#getIsClosed()
	 * 
	 */
	public Boolean getIsClosed() {
		return Boolean.valueOf(isClosed.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#setIsClosed(Boolean newValue)
	 * 
	 */
	public void setIsClosed(Boolean newValue) {
		if (newValue != null) {
			isClosed.setSelection(newValue.booleanValue());
		} else {
			isClosed.setSelection(false);
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#initChoreographyRef(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initChoreographyRef(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		choreographyRef.setContentProvider(contentProvider);
		choreographyRef.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#updateChoreographyRef()
	 * 
	 */
	public void updateChoreographyRef() {
	choreographyRef.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addFilterChoreographyRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToChoreographyRef(ViewerFilter filter) {
		choreographyRefFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addBusinessFilterChoreographyRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToChoreographyRef(ViewerFilter filter) {
		choreographyRefBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#isContainedInChoreographyRefTable(EObject element)
	 * 
	 */
	public boolean isContainedInChoreographyRefTable(EObject element) {
		return ((ReferencesTableSettings)choreographyRef.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#initArtifacts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initArtifacts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		artifacts.setContentProvider(contentProvider);
		artifacts.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#updateArtifacts()
	 * 
	 */
	public void updateArtifacts() {
	artifacts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addFilterArtifacts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArtifacts(ViewerFilter filter) {
		artifactsFilters.add(filter);
		if (this.artifacts != null) {
			this.artifacts.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addBusinessFilterArtifacts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArtifacts(ViewerFilter filter) {
		artifactsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#isContainedInArtifactsTable(EObject element)
	 * 
	 */
	public boolean isContainedInArtifactsTable(EObject element) {
		return ((ReferencesTableSettings)artifacts.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#initParticipantAssociations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initParticipantAssociations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		participantAssociations.setContentProvider(contentProvider);
		participantAssociations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#updateParticipantAssociations()
	 * 
	 */
	public void updateParticipantAssociations() {
	participantAssociations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addFilterParticipantAssociations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParticipantAssociations(ViewerFilter filter) {
		participantAssociationsFilters.add(filter);
		if (this.participantAssociations != null) {
			this.participantAssociations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addBusinessFilterParticipantAssociations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParticipantAssociations(ViewerFilter filter) {
		participantAssociationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#isContainedInParticipantAssociationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInParticipantAssociationsTable(EObject element) {
		return ((ReferencesTableSettings)participantAssociations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#initMessageFlowAssociations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMessageFlowAssociations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		messageFlowAssociations.setContentProvider(contentProvider);
		messageFlowAssociations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#updateMessageFlowAssociations()
	 * 
	 */
	public void updateMessageFlowAssociations() {
	messageFlowAssociations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addFilterMessageFlowAssociations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMessageFlowAssociations(ViewerFilter filter) {
		messageFlowAssociationsFilters.add(filter);
		if (this.messageFlowAssociations != null) {
			this.messageFlowAssociations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addBusinessFilterMessageFlowAssociations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMessageFlowAssociations(ViewerFilter filter) {
		messageFlowAssociationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#isContainedInMessageFlowAssociationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMessageFlowAssociationsTable(EObject element) {
		return ((ReferencesTableSettings)messageFlowAssociations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#initMessageFlows(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMessageFlows(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		messageFlows.setContentProvider(contentProvider);
		messageFlows.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#updateMessageFlows()
	 * 
	 */
	public void updateMessageFlows() {
	messageFlows.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addFilterMessageFlows(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMessageFlows(ViewerFilter filter) {
		messageFlowsFilters.add(filter);
		if (this.messageFlows != null) {
			this.messageFlows.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addBusinessFilterMessageFlows(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMessageFlows(ViewerFilter filter) {
		messageFlowsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#isContainedInMessageFlowsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMessageFlowsTable(EObject element) {
		return ((ReferencesTableSettings)messageFlows.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#initCorrelationKeys(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCorrelationKeys(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		correlationKeys.setContentProvider(contentProvider);
		correlationKeys.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#updateCorrelationKeys()
	 * 
	 */
	public void updateCorrelationKeys() {
	correlationKeys.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addFilterCorrelationKeys(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCorrelationKeys(ViewerFilter filter) {
		correlationKeysFilters.add(filter);
		if (this.correlationKeys != null) {
			this.correlationKeys.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#addBusinessFilterCorrelationKeys(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCorrelationKeys(ViewerFilter filter) {
		correlationKeysBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CollaborationPropertiesEditionPart#isContainedInCorrelationKeysTable(EObject element)
	 * 
	 */
	public boolean isContainedInCorrelationKeysTable(EObject element) {
		return ((ReferencesTableSettings)correlationKeys.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.Collaboration_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
