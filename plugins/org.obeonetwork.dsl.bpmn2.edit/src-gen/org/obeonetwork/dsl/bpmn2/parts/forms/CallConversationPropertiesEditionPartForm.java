/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
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

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class CallConversationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, CallConversationPropertiesEditionPart {

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
	protected ReferencesTable participantRefs;
	protected List<ViewerFilter> participantRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> participantRefsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable messageFlowRefs;
	protected List<ViewerFilter> messageFlowRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> messageFlowRefsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable correlationKeys;
	protected List<ViewerFilter> correlationKeysBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> correlationKeysFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer calledCollaborationRef;
	protected ReferencesTable participantAssociations;
	protected List<ViewerFilter> participantAssociationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> participantAssociationsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public CallConversationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CallConversationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence callConversationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = callConversationStep.addStep(Bpmn2ViewsRepository.CallConversation.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallConversation.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallConversation.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallConversation.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallConversation.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallConversation.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallConversation.Properties.participantRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallConversation.Properties.messageFlowRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallConversation.Properties.correlationKeys);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallConversation.Properties.calledCollaborationRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallConversation.Properties.participantAssociations);
		
		
		composer = new PartComposer(callConversationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.CallConversation.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallConversation.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallConversation.Properties.extensionDefinitions) {
					return createExtensionDefinitionsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallConversation.Properties.extensionValues) {
					return createExtensionValuesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallConversation.Properties.documentation) {
					return createDocumentationTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallConversation.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallConversation.Properties.participantRefs) {
					return createParticipantRefsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallConversation.Properties.messageFlowRefs) {
					return createMessageFlowRefsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallConversation.Properties.correlationKeys) {
					return createCorrelationKeysTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallConversation.Properties.calledCollaborationRef) {
					return createCalledCollaborationRefFlatComboViewer(parent, widgetFactory);
				}
				if (key == Bpmn2ViewsRepository.CallConversation.Properties.participantAssociations) {
					return createParticipantAssociationsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(Bpmn2Messages.CallConversationPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, Bpmn2ViewsRepository.CallConversation.Properties.id, Bpmn2Messages.CallConversationPropertiesEditionPart_IdLabel);
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
							CallConversationPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.CallConversation.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CallConversationPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.CallConversation.Properties.id,
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
									CallConversationPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.CallConversation.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallConversation.Properties.id, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.extensionDefinitions = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallConversation.Properties.extensionDefinitions, Bpmn2Messages.CallConversationPropertiesEditionPart_ExtensionDefinitionsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallConversation.Properties.extensionDefinitions, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionDefinitions.createControls(parent, widgetFactory);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.CallConversation.Properties.extensionDefinitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.extensionDefinitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallConversation.Properties.extensionValues, Bpmn2Messages.CallConversationPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallConversation.Properties.extensionValues, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionValues.createControls(parent, widgetFactory);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.CallConversation.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallConversation.Properties.documentation, Bpmn2Messages.CallConversationPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallConversation.Properties.documentation, Bpmn2ViewsRepository.FORM_KIND));
		this.documentation.createControls(parent, widgetFactory);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.CallConversation.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.CallConversation.Properties.name, Bpmn2Messages.CallConversationPropertiesEditionPart_NameLabel);
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
							CallConversationPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.CallConversation.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CallConversationPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.CallConversation.Properties.name,
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
									CallConversationPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.CallConversation.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallConversation.Properties.name, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createParticipantRefsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.participantRefs = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallConversation.Properties.participantRefs, Bpmn2Messages.CallConversationPropertiesEditionPart_ParticipantRefsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addParticipantRefs(); }
			public void handleEdit(EObject element) { editParticipantRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveParticipantRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromParticipantRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.participantRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallConversation.Properties.participantRefs, Bpmn2ViewsRepository.FORM_KIND));
		this.participantRefs.createControls(parent, widgetFactory);
		this.participantRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.participantRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData participantRefsData = new GridData(GridData.FILL_HORIZONTAL);
		participantRefsData.horizontalSpan = 3;
		this.participantRefs.setLayoutData(participantRefsData);
		this.participantRefs.disableMove();
		participantRefs.setID(Bpmn2ViewsRepository.CallConversation.Properties.participantRefs);
		participantRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addParticipantRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(participantRefs.getInput(), participantRefsFilters, participantRefsBusinessFilters,
		"participantRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.participantRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				participantRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveParticipantRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.participantRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		participantRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromParticipantRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.participantRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		participantRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editParticipantRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				participantRefs.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createMessageFlowRefsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.messageFlowRefs = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallConversation.Properties.messageFlowRefs, Bpmn2Messages.CallConversationPropertiesEditionPart_MessageFlowRefsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addMessageFlowRefs(); }
			public void handleEdit(EObject element) { editMessageFlowRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMessageFlowRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMessageFlowRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.messageFlowRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallConversation.Properties.messageFlowRefs, Bpmn2ViewsRepository.FORM_KIND));
		this.messageFlowRefs.createControls(parent, widgetFactory);
		this.messageFlowRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.messageFlowRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData messageFlowRefsData = new GridData(GridData.FILL_HORIZONTAL);
		messageFlowRefsData.horizontalSpan = 3;
		this.messageFlowRefs.setLayoutData(messageFlowRefsData);
		this.messageFlowRefs.disableMove();
		messageFlowRefs.setID(Bpmn2ViewsRepository.CallConversation.Properties.messageFlowRefs);
		messageFlowRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addMessageFlowRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(messageFlowRefs.getInput(), messageFlowRefsFilters, messageFlowRefsBusinessFilters,
		"messageFlowRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.messageFlowRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				messageFlowRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMessageFlowRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.messageFlowRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		messageFlowRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMessageFlowRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.messageFlowRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		messageFlowRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editMessageFlowRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				messageFlowRefs.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCorrelationKeysTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.correlationKeys = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallConversation.Properties.correlationKeys, Bpmn2Messages.CallConversationPropertiesEditionPart_CorrelationKeysLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.correlationKeys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				correlationKeys.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.correlationKeys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				correlationKeys.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.correlationKeys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				correlationKeys.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.correlationKeys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				correlationKeys.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.correlationKeysFilters) {
			this.correlationKeys.addFilter(filter);
		}
		this.correlationKeys.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallConversation.Properties.correlationKeys, Bpmn2ViewsRepository.FORM_KIND));
		this.correlationKeys.createControls(parent, widgetFactory);
		this.correlationKeys.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.correlationKeys, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData correlationKeysData = new GridData(GridData.FILL_HORIZONTAL);
		correlationKeysData.horizontalSpan = 3;
		this.correlationKeys.setLayoutData(correlationKeysData);
		this.correlationKeys.setLowerBound(0);
		this.correlationKeys.setUpperBound(-1);
		correlationKeys.setID(Bpmn2ViewsRepository.CallConversation.Properties.correlationKeys);
		correlationKeys.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createCalledCollaborationRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.CallConversation.Properties.calledCollaborationRef, Bpmn2Messages.CallConversationPropertiesEditionPart_CalledCollaborationRefLabel);
		calledCollaborationRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.CallConversation.Properties.calledCollaborationRef, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(calledCollaborationRef);
		calledCollaborationRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData calledCollaborationRefData = new GridData(GridData.FILL_HORIZONTAL);
		calledCollaborationRef.setLayoutData(calledCollaborationRefData);
		calledCollaborationRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.calledCollaborationRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCalledCollaborationRef()));
			}

		});
		calledCollaborationRef.setID(Bpmn2ViewsRepository.CallConversation.Properties.calledCollaborationRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallConversation.Properties.calledCollaborationRef, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createParticipantAssociationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.participantAssociations = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallConversation.Properties.participantAssociations, Bpmn2Messages.CallConversationPropertiesEditionPart_ParticipantAssociationsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.participantAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				participantAssociations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.participantAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				participantAssociations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.participantAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				participantAssociations.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.participantAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				participantAssociations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.participantAssociationsFilters) {
			this.participantAssociations.addFilter(filter);
		}
		this.participantAssociations.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallConversation.Properties.participantAssociations, Bpmn2ViewsRepository.FORM_KIND));
		this.participantAssociations.createControls(parent, widgetFactory);
		this.participantAssociations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallConversationPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallConversation.Properties.participantAssociations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData participantAssociationsData = new GridData(GridData.FILL_HORIZONTAL);
		participantAssociationsData.horizontalSpan = 3;
		this.participantAssociations.setLayoutData(participantAssociationsData);
		this.participantAssociations.setLowerBound(0);
		this.participantAssociations.setUpperBound(-1);
		participantAssociations.setID(Bpmn2ViewsRepository.CallConversation.Properties.participantAssociations);
		participantAssociations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#setId(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#initParticipantRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initParticipantRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		participantRefs.setContentProvider(contentProvider);
		participantRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#updateParticipantRefs()
	 * 
	 */
	public void updateParticipantRefs() {
	participantRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addFilterParticipantRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParticipantRefs(ViewerFilter filter) {
		participantRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addBusinessFilterParticipantRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParticipantRefs(ViewerFilter filter) {
		participantRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#isContainedInParticipantRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInParticipantRefsTable(EObject element) {
		return ((ReferencesTableSettings)participantRefs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#initMessageFlowRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMessageFlowRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		messageFlowRefs.setContentProvider(contentProvider);
		messageFlowRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#updateMessageFlowRefs()
	 * 
	 */
	public void updateMessageFlowRefs() {
	messageFlowRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addFilterMessageFlowRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMessageFlowRefs(ViewerFilter filter) {
		messageFlowRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addBusinessFilterMessageFlowRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMessageFlowRefs(ViewerFilter filter) {
		messageFlowRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#isContainedInMessageFlowRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMessageFlowRefsTable(EObject element) {
		return ((ReferencesTableSettings)messageFlowRefs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#initCorrelationKeys(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#updateCorrelationKeys()
	 * 
	 */
	public void updateCorrelationKeys() {
	correlationKeys.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addFilterCorrelationKeys(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addBusinessFilterCorrelationKeys(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCorrelationKeys(ViewerFilter filter) {
		correlationKeysBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#isContainedInCorrelationKeysTable(EObject element)
	 * 
	 */
	public boolean isContainedInCorrelationKeysTable(EObject element) {
		return ((ReferencesTableSettings)correlationKeys.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#getCalledCollaborationRef()
	 * 
	 */
	public EObject getCalledCollaborationRef() {
		if (calledCollaborationRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) calledCollaborationRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#initCalledCollaborationRef(EObjectFlatComboSettings)
	 */
	public void initCalledCollaborationRef(EObjectFlatComboSettings settings) {
		calledCollaborationRef.setInput(settings);
		if (current != null) {
			calledCollaborationRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#setCalledCollaborationRef(EObject newValue)
	 * 
	 */
	public void setCalledCollaborationRef(EObject newValue) {
		if (newValue != null) {
			calledCollaborationRef.setSelection(new StructuredSelection(newValue));
		} else {
			calledCollaborationRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#setCalledCollaborationRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCalledCollaborationRefButtonMode(ButtonsModeEnum newValue) {
		calledCollaborationRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addFilterCalledCollaborationRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCalledCollaborationRef(ViewerFilter filter) {
		calledCollaborationRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addBusinessFilterCalledCollaborationRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCalledCollaborationRef(ViewerFilter filter) {
		calledCollaborationRef.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#initParticipantAssociations(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#updateParticipantAssociations()
	 * 
	 */
	public void updateParticipantAssociations() {
	participantAssociations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addFilterParticipantAssociations(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#addBusinessFilterParticipantAssociations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParticipantAssociations(ViewerFilter filter) {
		participantAssociationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallConversationPropertiesEditionPart#isContainedInParticipantAssociationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInParticipantAssociationsTable(EObject element) {
		return ((ReferencesTableSettings)participantAssociations.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.CallConversation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
