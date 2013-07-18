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

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class SubProcessPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SubProcessPropertiesEditionPart {

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
	protected ReferencesTable categoryValueRef;
	protected List<ViewerFilter> categoryValueRefBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> categoryValueRefFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outgoing;
	protected List<ViewerFilter> outgoingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outgoingFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable incoming;
	protected List<ViewerFilter> incomingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> incomingFilters = new ArrayList<ViewerFilter>();
	protected Button isForCompensation;
	protected ReferencesTable resources;
	protected List<ViewerFilter> resourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourcesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer default_;
	protected ReferencesTable properties;
	protected List<ViewerFilter> propertiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable boundaryEventRefs;
	protected List<ViewerFilter> boundaryEventRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> boundaryEventRefsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable dataInputAssociations;
	protected List<ViewerFilter> dataInputAssociationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> dataInputAssociationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable dataOutputAssociations;
	protected List<ViewerFilter> dataOutputAssociationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> dataOutputAssociationsFilters = new ArrayList<ViewerFilter>();
	protected Text startQuantity;
	protected Text completionQuantity;
	protected ReferencesTable laneSets;
	protected List<ViewerFilter> laneSetsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> laneSetsFilters = new ArrayList<ViewerFilter>();
	protected Button triggeredByEvent;
	protected ReferencesTable artifacts;
	protected List<ViewerFilter> artifactsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> artifactsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public SubProcessPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SubProcessPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence subProcessStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = subProcessStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.categoryValueRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.outgoing);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.incoming);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.isForCompensation);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.resources);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.default_);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.properties_);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.boundaryEventRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.dataInputAssociations);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.dataOutputAssociations);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.startQuantity);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.completionQuantity);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.laneSets);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.triggeredByEvent);
		propertiesStep.addStep(Bpmn2ViewsRepository.SubProcess.Properties.artifacts);
		
		
		composer = new PartComposer(subProcessStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.extensionDefinitions) {
					return createExtensionDefinitionsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.extensionValues) {
					return createExtensionValuesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.documentation) {
					return createDocumentationTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.categoryValueRef) {
					return createCategoryValueRefReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.outgoing) {
					return createOutgoingReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.incoming) {
					return createIncomingReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.isForCompensation) {
					return createIsForCompensationCheckbox(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.resources) {
					return createResourcesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.default_) {
					return createDefault_FlatComboViewer(parent, widgetFactory);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.properties_) {
					return createPropertiesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.boundaryEventRefs) {
					return createBoundaryEventRefsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.dataInputAssociations) {
					return createDataInputAssociationsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.dataOutputAssociations) {
					return createDataOutputAssociationsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.startQuantity) {
					return createStartQuantityText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.completionQuantity) {
					return createCompletionQuantityText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.laneSets) {
					return createLaneSetsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.triggeredByEvent) {
					return createTriggeredByEventCheckbox(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.SubProcess.Properties.artifacts) {
					return createArtifactsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(Bpmn2Messages.SubProcessPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, Bpmn2ViewsRepository.SubProcess.Properties.id, Bpmn2Messages.SubProcessPropertiesEditionPart_IdLabel);
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
							SubProcessPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.SubProcess.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SubProcessPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.SubProcess.Properties.id,
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
									SubProcessPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.SubProcess.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.id, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.extensionDefinitions = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.extensionDefinitions, Bpmn2Messages.SubProcessPropertiesEditionPart_ExtensionDefinitionsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.extensionDefinitions, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionDefinitions.createControls(parent, widgetFactory);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.SubProcess.Properties.extensionDefinitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.extensionDefinitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.extensionValues, Bpmn2Messages.SubProcessPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.extensionValues, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionValues.createControls(parent, widgetFactory);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.SubProcess.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.documentation, Bpmn2Messages.SubProcessPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.documentation, Bpmn2ViewsRepository.FORM_KIND));
		this.documentation.createControls(parent, widgetFactory);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.SubProcess.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.SubProcess.Properties.name, Bpmn2Messages.SubProcessPropertiesEditionPart_NameLabel);
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
							SubProcessPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.SubProcess.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SubProcessPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.SubProcess.Properties.name,
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
									SubProcessPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.SubProcess.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.name, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCategoryValueRefReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.categoryValueRef = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.categoryValueRef, Bpmn2Messages.SubProcessPropertiesEditionPart_CategoryValueRefLabel), new ReferencesTableListener	() {
			public void handleAdd() { addCategoryValueRef(); }
			public void handleEdit(EObject element) { editCategoryValueRef(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategoryValueRef(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategoryValueRef(element); }
			public void navigateTo(EObject element) { }
		});
		this.categoryValueRef.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.categoryValueRef, Bpmn2ViewsRepository.FORM_KIND));
		this.categoryValueRef.createControls(parent, widgetFactory);
		this.categoryValueRef.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.categoryValueRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryValueRefData = new GridData(GridData.FILL_HORIZONTAL);
		categoryValueRefData.horizontalSpan = 3;
		this.categoryValueRef.setLayoutData(categoryValueRefData);
		this.categoryValueRef.disableMove();
		categoryValueRef.setID(Bpmn2ViewsRepository.SubProcess.Properties.categoryValueRef);
		categoryValueRef.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCategoryValueRef() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(categoryValueRef.getInput(), categoryValueRefFilters, categoryValueRefBusinessFilters,
		"categoryValueRef", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.categoryValueRef,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				categoryValueRef.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCategoryValueRef(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.categoryValueRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		categoryValueRef.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategoryValueRef(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.categoryValueRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		categoryValueRef.refresh();
	}

	/**
	 * 
	 */
	protected void editCategoryValueRef(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				categoryValueRef.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutgoingReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outgoing = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.outgoing, Bpmn2Messages.SubProcessPropertiesEditionPart_OutgoingLabel), new ReferencesTableListener	() {
			public void handleAdd() { addOutgoing(); }
			public void handleEdit(EObject element) { editOutgoing(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoing(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoing(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoing.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.outgoing, Bpmn2ViewsRepository.FORM_KIND));
		this.outgoing.createControls(parent, widgetFactory);
		this.outgoing.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.outgoing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingData.horizontalSpan = 3;
		this.outgoing.setLayoutData(outgoingData);
		this.outgoing.disableMove();
		outgoing.setID(Bpmn2ViewsRepository.SubProcess.Properties.outgoing);
		outgoing.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutgoing() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoing.getInput(), outgoingFilters, outgoingBusinessFilters,
		"outgoing", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.outgoing,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outgoing.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutgoing(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoing.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoing(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outgoing.refresh();
	}

	/**
	 * 
	 */
	protected void editOutgoing(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outgoing.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIncomingReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.incoming = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.incoming, Bpmn2Messages.SubProcessPropertiesEditionPart_IncomingLabel), new ReferencesTableListener	() {
			public void handleAdd() { addIncoming(); }
			public void handleEdit(EObject element) { editIncoming(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncoming(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncoming(element); }
			public void navigateTo(EObject element) { }
		});
		this.incoming.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.incoming, Bpmn2ViewsRepository.FORM_KIND));
		this.incoming.createControls(parent, widgetFactory);
		this.incoming.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.incoming, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingData = new GridData(GridData.FILL_HORIZONTAL);
		incomingData.horizontalSpan = 3;
		this.incoming.setLayoutData(incomingData);
		this.incoming.disableMove();
		incoming.setID(Bpmn2ViewsRepository.SubProcess.Properties.incoming);
		incoming.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncoming() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incoming.getInput(), incomingFilters, incomingBusinessFilters,
		"incoming", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.incoming,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incoming.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncoming(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incoming.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncoming(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incoming.refresh();
	}

	/**
	 * 
	 */
	protected void editIncoming(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incoming.refresh();
			}
		}
	}

	
	protected Composite createIsForCompensationCheckbox(FormToolkit widgetFactory, Composite parent) {
		isForCompensation = widgetFactory.createButton(parent, getDescription(Bpmn2ViewsRepository.SubProcess.Properties.isForCompensation, Bpmn2Messages.SubProcessPropertiesEditionPart_IsForCompensationLabel), SWT.CHECK);
		isForCompensation.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.isForCompensation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isForCompensation.getSelection())));
			}

		});
		GridData isForCompensationData = new GridData(GridData.FILL_HORIZONTAL);
		isForCompensationData.horizontalSpan = 2;
		isForCompensation.setLayoutData(isForCompensationData);
		EditingUtils.setID(isForCompensation, Bpmn2ViewsRepository.SubProcess.Properties.isForCompensation);
		EditingUtils.setEEFtype(isForCompensation, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.isForCompensation, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createResourcesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.resources = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.resources, Bpmn2Messages.SubProcessPropertiesEditionPart_ResourcesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resources.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resources.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resources.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resources.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourcesFilters) {
			this.resources.addFilter(filter);
		}
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.resources, Bpmn2ViewsRepository.FORM_KIND));
		this.resources.createControls(parent, widgetFactory);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourcesData = new GridData(GridData.FILL_HORIZONTAL);
		resourcesData.horizontalSpan = 3;
		this.resources.setLayoutData(resourcesData);
		this.resources.setLowerBound(0);
		this.resources.setUpperBound(-1);
		resources.setID(Bpmn2ViewsRepository.SubProcess.Properties.resources);
		resources.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createDefault_FlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.SubProcess.Properties.default_, Bpmn2Messages.SubProcessPropertiesEditionPart_Default_Label);
		default_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.SubProcess.Properties.default_, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(default_);
		default_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData default_Data = new GridData(GridData.FILL_HORIZONTAL);
		default_.setLayoutData(default_Data);
		default_.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.default_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDefault_()));
			}

		});
		default_.setID(Bpmn2ViewsRepository.SubProcess.Properties.default_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.default_, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPropertiesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.properties = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.properties_, Bpmn2Messages.SubProcessPropertiesEditionPart_PropertiesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				properties.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				properties.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				properties.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				properties.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.propertiesFilters) {
			this.properties.addFilter(filter);
		}
		this.properties.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.properties_, Bpmn2ViewsRepository.FORM_KIND));
		this.properties.createControls(parent, widgetFactory);
		this.properties.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.properties_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData propertiesData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesData.horizontalSpan = 3;
		this.properties.setLayoutData(propertiesData);
		this.properties.setLowerBound(0);
		this.properties.setUpperBound(-1);
		properties.setID(Bpmn2ViewsRepository.SubProcess.Properties.properties_);
		properties.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBoundaryEventRefsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.boundaryEventRefs = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.boundaryEventRefs, Bpmn2Messages.SubProcessPropertiesEditionPart_BoundaryEventRefsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addBoundaryEventRefs(); }
			public void handleEdit(EObject element) { editBoundaryEventRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveBoundaryEventRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromBoundaryEventRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.boundaryEventRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.boundaryEventRefs, Bpmn2ViewsRepository.FORM_KIND));
		this.boundaryEventRefs.createControls(parent, widgetFactory);
		this.boundaryEventRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.boundaryEventRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData boundaryEventRefsData = new GridData(GridData.FILL_HORIZONTAL);
		boundaryEventRefsData.horizontalSpan = 3;
		this.boundaryEventRefs.setLayoutData(boundaryEventRefsData);
		this.boundaryEventRefs.disableMove();
		boundaryEventRefs.setID(Bpmn2ViewsRepository.SubProcess.Properties.boundaryEventRefs);
		boundaryEventRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addBoundaryEventRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(boundaryEventRefs.getInput(), boundaryEventRefsFilters, boundaryEventRefsBusinessFilters,
		"boundaryEventRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.boundaryEventRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				boundaryEventRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveBoundaryEventRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.boundaryEventRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		boundaryEventRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromBoundaryEventRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.boundaryEventRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		boundaryEventRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editBoundaryEventRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				boundaryEventRefs.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDataInputAssociationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.dataInputAssociations = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.dataInputAssociations, Bpmn2Messages.SubProcessPropertiesEditionPart_DataInputAssociationsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				dataInputAssociations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				dataInputAssociations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				dataInputAssociations.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				dataInputAssociations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.dataInputAssociationsFilters) {
			this.dataInputAssociations.addFilter(filter);
		}
		this.dataInputAssociations.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.dataInputAssociations, Bpmn2ViewsRepository.FORM_KIND));
		this.dataInputAssociations.createControls(parent, widgetFactory);
		this.dataInputAssociations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.dataInputAssociations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData dataInputAssociationsData = new GridData(GridData.FILL_HORIZONTAL);
		dataInputAssociationsData.horizontalSpan = 3;
		this.dataInputAssociations.setLayoutData(dataInputAssociationsData);
		this.dataInputAssociations.setLowerBound(0);
		this.dataInputAssociations.setUpperBound(-1);
		dataInputAssociations.setID(Bpmn2ViewsRepository.SubProcess.Properties.dataInputAssociations);
		dataInputAssociations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDataOutputAssociationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.dataOutputAssociations = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.dataOutputAssociations, Bpmn2Messages.SubProcessPropertiesEditionPart_DataOutputAssociationsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				dataOutputAssociations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				dataOutputAssociations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				dataOutputAssociations.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				dataOutputAssociations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.dataOutputAssociationsFilters) {
			this.dataOutputAssociations.addFilter(filter);
		}
		this.dataOutputAssociations.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.dataOutputAssociations, Bpmn2ViewsRepository.FORM_KIND));
		this.dataOutputAssociations.createControls(parent, widgetFactory);
		this.dataOutputAssociations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.dataOutputAssociations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData dataOutputAssociationsData = new GridData(GridData.FILL_HORIZONTAL);
		dataOutputAssociationsData.horizontalSpan = 3;
		this.dataOutputAssociations.setLayoutData(dataOutputAssociationsData);
		this.dataOutputAssociations.setLowerBound(0);
		this.dataOutputAssociations.setUpperBound(-1);
		dataOutputAssociations.setID(Bpmn2ViewsRepository.SubProcess.Properties.dataOutputAssociations);
		dataOutputAssociations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStartQuantityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.SubProcess.Properties.startQuantity, Bpmn2Messages.SubProcessPropertiesEditionPart_StartQuantityLabel);
		startQuantity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		startQuantity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData startQuantityData = new GridData(GridData.FILL_HORIZONTAL);
		startQuantity.setLayoutData(startQuantityData);
		startQuantity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							SubProcessPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.SubProcess.Properties.startQuantity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, startQuantity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SubProcessPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.SubProcess.Properties.startQuantity,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, startQuantity.getText()));
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
									SubProcessPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		startQuantity.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.startQuantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, startQuantity.getText()));
				}
			}
		});
		EditingUtils.setID(startQuantity, Bpmn2ViewsRepository.SubProcess.Properties.startQuantity);
		EditingUtils.setEEFtype(startQuantity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.startQuantity, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCompletionQuantityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.SubProcess.Properties.completionQuantity, Bpmn2Messages.SubProcessPropertiesEditionPart_CompletionQuantityLabel);
		completionQuantity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		completionQuantity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData completionQuantityData = new GridData(GridData.FILL_HORIZONTAL);
		completionQuantity.setLayoutData(completionQuantityData);
		completionQuantity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							SubProcessPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.SubProcess.Properties.completionQuantity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, completionQuantity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SubProcessPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.SubProcess.Properties.completionQuantity,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, completionQuantity.getText()));
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
									SubProcessPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		completionQuantity.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.completionQuantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, completionQuantity.getText()));
				}
			}
		});
		EditingUtils.setID(completionQuantity, Bpmn2ViewsRepository.SubProcess.Properties.completionQuantity);
		EditingUtils.setEEFtype(completionQuantity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.completionQuantity, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createLaneSetsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.laneSets = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.laneSets, Bpmn2Messages.SubProcessPropertiesEditionPart_LaneSetsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.laneSets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				laneSets.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.laneSets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				laneSets.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.laneSets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				laneSets.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.laneSets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				laneSets.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.laneSetsFilters) {
			this.laneSets.addFilter(filter);
		}
		this.laneSets.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.laneSets, Bpmn2ViewsRepository.FORM_KIND));
		this.laneSets.createControls(parent, widgetFactory);
		this.laneSets.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.laneSets, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData laneSetsData = new GridData(GridData.FILL_HORIZONTAL);
		laneSetsData.horizontalSpan = 3;
		this.laneSets.setLayoutData(laneSetsData);
		this.laneSets.setLowerBound(0);
		this.laneSets.setUpperBound(-1);
		laneSets.setID(Bpmn2ViewsRepository.SubProcess.Properties.laneSets);
		laneSets.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTriggeredByEventCheckbox(FormToolkit widgetFactory, Composite parent) {
		triggeredByEvent = widgetFactory.createButton(parent, getDescription(Bpmn2ViewsRepository.SubProcess.Properties.triggeredByEvent, Bpmn2Messages.SubProcessPropertiesEditionPart_TriggeredByEventLabel), SWT.CHECK);
		triggeredByEvent.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.triggeredByEvent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(triggeredByEvent.getSelection())));
			}

		});
		GridData triggeredByEventData = new GridData(GridData.FILL_HORIZONTAL);
		triggeredByEventData.horizontalSpan = 2;
		triggeredByEvent.setLayoutData(triggeredByEventData);
		EditingUtils.setID(triggeredByEvent, Bpmn2ViewsRepository.SubProcess.Properties.triggeredByEvent);
		EditingUtils.setEEFtype(triggeredByEvent, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.triggeredByEvent, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createArtifactsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.artifacts = new ReferencesTable(getDescription(Bpmn2ViewsRepository.SubProcess.Properties.artifacts, Bpmn2Messages.SubProcessPropertiesEditionPart_ArtifactsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				artifacts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				artifacts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				artifacts.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				artifacts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.artifactsFilters) {
			this.artifacts.addFilter(filter);
		}
		this.artifacts.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.SubProcess.Properties.artifacts, Bpmn2ViewsRepository.FORM_KIND));
		this.artifacts.createControls(parent, widgetFactory);
		this.artifacts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubProcessPropertiesEditionPartForm.this, Bpmn2ViewsRepository.SubProcess.Properties.artifacts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData artifactsData = new GridData(GridData.FILL_HORIZONTAL);
		artifactsData.horizontalSpan = 3;
		this.artifacts.setLayoutData(artifactsData);
		this.artifacts.setLowerBound(0);
		this.artifacts.setUpperBound(-1);
		artifacts.setID(Bpmn2ViewsRepository.SubProcess.Properties.artifacts);
		artifacts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#setId(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initCategoryValueRef(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCategoryValueRef(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		categoryValueRef.setContentProvider(contentProvider);
		categoryValueRef.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateCategoryValueRef()
	 * 
	 */
	public void updateCategoryValueRef() {
	categoryValueRef.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterCategoryValueRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategoryValueRef(ViewerFilter filter) {
		categoryValueRefFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterCategoryValueRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategoryValueRef(ViewerFilter filter) {
		categoryValueRefBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInCategoryValueRefTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryValueRefTable(EObject element) {
		return ((ReferencesTableSettings)categoryValueRef.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initOutgoing(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoing(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoing.setContentProvider(contentProvider);
		outgoing.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateOutgoing()
	 * 
	 */
	public void updateOutgoing() {
	outgoing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoing(ViewerFilter filter) {
		outgoingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoing(ViewerFilter filter) {
		outgoingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInOutgoingTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingTable(EObject element) {
		return ((ReferencesTableSettings)outgoing.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initIncoming(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncoming(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incoming.setContentProvider(contentProvider);
		incoming.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateIncoming()
	 * 
	 */
	public void updateIncoming() {
	incoming.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterIncoming(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncoming(ViewerFilter filter) {
		incomingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterIncoming(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncoming(ViewerFilter filter) {
		incomingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInIncomingTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingTable(EObject element) {
		return ((ReferencesTableSettings)incoming.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#getIsForCompensation()
	 * 
	 */
	public Boolean getIsForCompensation() {
		return Boolean.valueOf(isForCompensation.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#setIsForCompensation(Boolean newValue)
	 * 
	 */
	public void setIsForCompensation(Boolean newValue) {
		if (newValue != null) {
			isForCompensation.setSelection(newValue.booleanValue());
		} else {
			isForCompensation.setSelection(false);
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initResources(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resources.setContentProvider(contentProvider);
		resources.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateResources()
	 * 
	 */
	public void updateResources() {
	resources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter) {
		resourcesFilters.add(filter);
		if (this.resources != null) {
			this.resources.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter) {
		resourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element) {
		return ((ReferencesTableSettings)resources.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#getDefault_()
	 * 
	 */
	public EObject getDefault_() {
		if (default_.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) default_.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initDefault_(EObjectFlatComboSettings)
	 */
	public void initDefault_(EObjectFlatComboSettings settings) {
		default_.setInput(settings);
		if (current != null) {
			default_.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#setDefault_(EObject newValue)
	 * 
	 */
	public void setDefault_(EObject newValue) {
		if (newValue != null) {
			default_.setSelection(new StructuredSelection(newValue));
		} else {
			default_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#setDefault_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDefault_ButtonMode(ButtonsModeEnum newValue) {
		default_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterDefault_(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDefault_(ViewerFilter filter) {
		default_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterDefault_(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDefault_(ViewerFilter filter) {
		default_.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initProperties(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProperties(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		properties.setContentProvider(contentProvider);
		properties.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateProperties()
	 * 
	 */
	public void updateProperties() {
	properties.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProperties(ViewerFilter filter) {
		propertiesFilters.add(filter);
		if (this.properties != null) {
			this.properties.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter) {
		propertiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInPropertiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element) {
		return ((ReferencesTableSettings)properties.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initBoundaryEventRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initBoundaryEventRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		boundaryEventRefs.setContentProvider(contentProvider);
		boundaryEventRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateBoundaryEventRefs()
	 * 
	 */
	public void updateBoundaryEventRefs() {
	boundaryEventRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterBoundaryEventRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBoundaryEventRefs(ViewerFilter filter) {
		boundaryEventRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterBoundaryEventRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBoundaryEventRefs(ViewerFilter filter) {
		boundaryEventRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInBoundaryEventRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInBoundaryEventRefsTable(EObject element) {
		return ((ReferencesTableSettings)boundaryEventRefs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initDataInputAssociations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDataInputAssociations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		dataInputAssociations.setContentProvider(contentProvider);
		dataInputAssociations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateDataInputAssociations()
	 * 
	 */
	public void updateDataInputAssociations() {
	dataInputAssociations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterDataInputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDataInputAssociations(ViewerFilter filter) {
		dataInputAssociationsFilters.add(filter);
		if (this.dataInputAssociations != null) {
			this.dataInputAssociations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterDataInputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDataInputAssociations(ViewerFilter filter) {
		dataInputAssociationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInDataInputAssociationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDataInputAssociationsTable(EObject element) {
		return ((ReferencesTableSettings)dataInputAssociations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initDataOutputAssociations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDataOutputAssociations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		dataOutputAssociations.setContentProvider(contentProvider);
		dataOutputAssociations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateDataOutputAssociations()
	 * 
	 */
	public void updateDataOutputAssociations() {
	dataOutputAssociations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterDataOutputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDataOutputAssociations(ViewerFilter filter) {
		dataOutputAssociationsFilters.add(filter);
		if (this.dataOutputAssociations != null) {
			this.dataOutputAssociations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterDataOutputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDataOutputAssociations(ViewerFilter filter) {
		dataOutputAssociationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInDataOutputAssociationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDataOutputAssociationsTable(EObject element) {
		return ((ReferencesTableSettings)dataOutputAssociations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#getStartQuantity()
	 * 
	 */
	public String getStartQuantity() {
		return startQuantity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#setStartQuantity(String newValue)
	 * 
	 */
	public void setStartQuantity(String newValue) {
		if (newValue != null) {
			startQuantity.setText(newValue);
		} else {
			startQuantity.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#getCompletionQuantity()
	 * 
	 */
	public String getCompletionQuantity() {
		return completionQuantity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#setCompletionQuantity(String newValue)
	 * 
	 */
	public void setCompletionQuantity(String newValue) {
		if (newValue != null) {
			completionQuantity.setText(newValue);
		} else {
			completionQuantity.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initLaneSets(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initLaneSets(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		laneSets.setContentProvider(contentProvider);
		laneSets.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateLaneSets()
	 * 
	 */
	public void updateLaneSets() {
	laneSets.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterLaneSets(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLaneSets(ViewerFilter filter) {
		laneSetsFilters.add(filter);
		if (this.laneSets != null) {
			this.laneSets.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterLaneSets(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLaneSets(ViewerFilter filter) {
		laneSetsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInLaneSetsTable(EObject element)
	 * 
	 */
	public boolean isContainedInLaneSetsTable(EObject element) {
		return ((ReferencesTableSettings)laneSets.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#getTriggeredByEvent()
	 * 
	 */
	public Boolean getTriggeredByEvent() {
		return Boolean.valueOf(triggeredByEvent.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#setTriggeredByEvent(Boolean newValue)
	 * 
	 */
	public void setTriggeredByEvent(Boolean newValue) {
		if (newValue != null) {
			triggeredByEvent.setSelection(newValue.booleanValue());
		} else {
			triggeredByEvent.setSelection(false);
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#initArtifacts(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#updateArtifacts()
	 * 
	 */
	public void updateArtifacts() {
	artifacts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addFilterArtifacts(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#addBusinessFilterArtifacts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArtifacts(ViewerFilter filter) {
		artifactsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.SubProcessPropertiesEditionPart#isContainedInArtifactsTable(EObject element)
	 * 
	 */
	public boolean isContainedInArtifactsTable(EObject element) {
		return ((ReferencesTableSettings)artifacts.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.SubProcess_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
