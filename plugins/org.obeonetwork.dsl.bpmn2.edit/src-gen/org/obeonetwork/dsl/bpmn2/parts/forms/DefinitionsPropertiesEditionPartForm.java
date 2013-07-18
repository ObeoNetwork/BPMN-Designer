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

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class DefinitionsPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, DefinitionsPropertiesEditionPart {

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
	protected Text targetNamespace;
	protected Text expressionLanguage;
	protected Text typeLanguage;
	protected ReferencesTable imports;
	protected List<ViewerFilter> importsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> importsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable extensions;
	protected List<ViewerFilter> extensionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> extensionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable relationships;
	protected List<ViewerFilter> relationshipsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> relationshipsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable rootElements;
	protected List<ViewerFilter> rootElementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> rootElementsFilters = new ArrayList<ViewerFilter>();
	protected Text exporter;
	protected Text exporterVersion;



	/**
	 * For {@link ISection} use only.
	 */
	public DefinitionsPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DefinitionsPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence definitionsStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = definitionsStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.targetNamespace);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.typeLanguage);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.imports);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.extensions);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.relationships);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.rootElements);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.exporter);
		propertiesStep.addStep(Bpmn2ViewsRepository.Definitions.Properties.exporterVersion);
		
		
		composer = new PartComposer(definitionsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.Definitions.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions) {
					return createExtensionDefinitionsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.extensionValues) {
					return createExtensionValuesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.documentation) {
					return createDocumentationTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.targetNamespace) {
					return createTargetNamespaceText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage) {
					return createExpressionLanguageText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.typeLanguage) {
					return createTypeLanguageText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.imports) {
					return createImportsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.extensions) {
					return createExtensionsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.relationships) {
					return createRelationshipsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.rootElements) {
					return createRootElementsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.exporter) {
					return createExporterText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Definitions.Properties.exporterVersion) {
					return createExporterVersionText(widgetFactory, parent);
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
		propertiesSection.setText(Bpmn2Messages.DefinitionsPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, Bpmn2ViewsRepository.Definitions.Properties.id, Bpmn2Messages.DefinitionsPropertiesEditionPart_IdLabel);
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
							DefinitionsPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Definitions.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DefinitionsPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Definitions.Properties.id,
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
									DefinitionsPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.Definitions.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.id, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.extensionDefinitions = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions, Bpmn2Messages.DefinitionsPropertiesEditionPart_ExtensionDefinitionsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionDefinitions.createControls(parent, widgetFactory);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Definitions.Properties.extensionValues, Bpmn2Messages.DefinitionsPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.extensionValues, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionValues.createControls(parent, widgetFactory);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.Definitions.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Definitions.Properties.documentation, Bpmn2Messages.DefinitionsPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.documentation, Bpmn2ViewsRepository.FORM_KIND));
		this.documentation.createControls(parent, widgetFactory);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.Definitions.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Definitions.Properties.name, Bpmn2Messages.DefinitionsPropertiesEditionPart_NameLabel);
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
							DefinitionsPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Definitions.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DefinitionsPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Definitions.Properties.name,
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
									DefinitionsPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.Definitions.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.name, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTargetNamespaceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Definitions.Properties.targetNamespace, Bpmn2Messages.DefinitionsPropertiesEditionPart_TargetNamespaceLabel);
		targetNamespace = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		targetNamespace.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData targetNamespaceData = new GridData(GridData.FILL_HORIZONTAL);
		targetNamespace.setLayoutData(targetNamespaceData);
		targetNamespace.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DefinitionsPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Definitions.Properties.targetNamespace,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, targetNamespace.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DefinitionsPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Definitions.Properties.targetNamespace,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, targetNamespace.getText()));
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
									DefinitionsPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		targetNamespace.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.targetNamespace, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, targetNamespace.getText()));
				}
			}
		});
		EditingUtils.setID(targetNamespace, Bpmn2ViewsRepository.Definitions.Properties.targetNamespace);
		EditingUtils.setEEFtype(targetNamespace, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.targetNamespace, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createExpressionLanguageText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage, Bpmn2Messages.DefinitionsPropertiesEditionPart_ExpressionLanguageLabel);
		expressionLanguage = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		expressionLanguage.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData expressionLanguageData = new GridData(GridData.FILL_HORIZONTAL);
		expressionLanguage.setLayoutData(expressionLanguageData);
		expressionLanguage.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DefinitionsPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expressionLanguage.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DefinitionsPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, expressionLanguage.getText()));
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
									DefinitionsPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		expressionLanguage.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expressionLanguage.getText()));
				}
			}
		});
		EditingUtils.setID(expressionLanguage, Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage);
		EditingUtils.setEEFtype(expressionLanguage, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeLanguageText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Definitions.Properties.typeLanguage, Bpmn2Messages.DefinitionsPropertiesEditionPart_TypeLanguageLabel);
		typeLanguage = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		typeLanguage.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData typeLanguageData = new GridData(GridData.FILL_HORIZONTAL);
		typeLanguage.setLayoutData(typeLanguageData);
		typeLanguage.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DefinitionsPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Definitions.Properties.typeLanguage,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, typeLanguage.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DefinitionsPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Definitions.Properties.typeLanguage,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, typeLanguage.getText()));
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
									DefinitionsPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		typeLanguage.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.typeLanguage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, typeLanguage.getText()));
				}
			}
		});
		EditingUtils.setID(typeLanguage, Bpmn2ViewsRepository.Definitions.Properties.typeLanguage);
		EditingUtils.setEEFtype(typeLanguage, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.typeLanguage, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createImportsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.imports = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Definitions.Properties.imports, Bpmn2Messages.DefinitionsPropertiesEditionPart_ImportsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.imports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				imports.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.imports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				imports.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.imports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				imports.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.imports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				imports.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.importsFilters) {
			this.imports.addFilter(filter);
		}
		this.imports.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.imports, Bpmn2ViewsRepository.FORM_KIND));
		this.imports.createControls(parent, widgetFactory);
		this.imports.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.imports, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData importsData = new GridData(GridData.FILL_HORIZONTAL);
		importsData.horizontalSpan = 3;
		this.imports.setLayoutData(importsData);
		this.imports.setLowerBound(0);
		this.imports.setUpperBound(-1);
		imports.setID(Bpmn2ViewsRepository.Definitions.Properties.imports);
		imports.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createExtensionsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.extensions = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Definitions.Properties.extensions, Bpmn2Messages.DefinitionsPropertiesEditionPart_ExtensionsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensions.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionsFilters) {
			this.extensions.addFilter(filter);
		}
		this.extensions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.extensions, Bpmn2ViewsRepository.FORM_KIND));
		this.extensions.createControls(parent, widgetFactory);
		this.extensions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.extensions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionsData.horizontalSpan = 3;
		this.extensions.setLayoutData(extensionsData);
		this.extensions.setLowerBound(0);
		this.extensions.setUpperBound(-1);
		extensions.setID(Bpmn2ViewsRepository.Definitions.Properties.extensions);
		extensions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createRelationshipsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.relationships = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Definitions.Properties.relationships, Bpmn2Messages.DefinitionsPropertiesEditionPart_RelationshipsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.relationships, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				relationships.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.relationships, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				relationships.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.relationships, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				relationships.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.relationships, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				relationships.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.relationshipsFilters) {
			this.relationships.addFilter(filter);
		}
		this.relationships.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.relationships, Bpmn2ViewsRepository.FORM_KIND));
		this.relationships.createControls(parent, widgetFactory);
		this.relationships.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.relationships, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData relationshipsData = new GridData(GridData.FILL_HORIZONTAL);
		relationshipsData.horizontalSpan = 3;
		this.relationships.setLayoutData(relationshipsData);
		this.relationships.setLowerBound(0);
		this.relationships.setUpperBound(-1);
		relationships.setID(Bpmn2ViewsRepository.Definitions.Properties.relationships);
		relationships.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createRootElementsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.rootElements = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Definitions.Properties.rootElements, Bpmn2Messages.DefinitionsPropertiesEditionPart_RootElementsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.rootElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				rootElements.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.rootElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				rootElements.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.rootElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				rootElements.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.rootElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				rootElements.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.rootElementsFilters) {
			this.rootElements.addFilter(filter);
		}
		this.rootElements.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.rootElements, Bpmn2ViewsRepository.FORM_KIND));
		this.rootElements.createControls(parent, widgetFactory);
		this.rootElements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.rootElements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData rootElementsData = new GridData(GridData.FILL_HORIZONTAL);
		rootElementsData.horizontalSpan = 3;
		this.rootElements.setLayoutData(rootElementsData);
		this.rootElements.setLowerBound(0);
		this.rootElements.setUpperBound(-1);
		rootElements.setID(Bpmn2ViewsRepository.Definitions.Properties.rootElements);
		rootElements.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createExporterText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Definitions.Properties.exporter, Bpmn2Messages.DefinitionsPropertiesEditionPart_ExporterLabel);
		exporter = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		exporter.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData exporterData = new GridData(GridData.FILL_HORIZONTAL);
		exporter.setLayoutData(exporterData);
		exporter.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DefinitionsPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Definitions.Properties.exporter,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, exporter.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DefinitionsPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Definitions.Properties.exporter,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, exporter.getText()));
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
									DefinitionsPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		exporter.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.exporter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, exporter.getText()));
				}
			}
		});
		EditingUtils.setID(exporter, Bpmn2ViewsRepository.Definitions.Properties.exporter);
		EditingUtils.setEEFtype(exporter, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.exporter, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createExporterVersionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Definitions.Properties.exporterVersion, Bpmn2Messages.DefinitionsPropertiesEditionPart_ExporterVersionLabel);
		exporterVersion = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		exporterVersion.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData exporterVersionData = new GridData(GridData.FILL_HORIZONTAL);
		exporterVersion.setLayoutData(exporterVersionData);
		exporterVersion.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DefinitionsPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Definitions.Properties.exporterVersion,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, exporterVersion.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DefinitionsPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Definitions.Properties.exporterVersion,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, exporterVersion.getText()));
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
									DefinitionsPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		exporterVersion.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DefinitionsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Definitions.Properties.exporterVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, exporterVersion.getText()));
				}
			}
		});
		EditingUtils.setID(exporterVersion, Bpmn2ViewsRepository.Definitions.Properties.exporterVersion);
		EditingUtils.setEEFtype(exporterVersion, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Definitions.Properties.exporterVersion, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#setId(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#getTargetNamespace()
	 * 
	 */
	public String getTargetNamespace() {
		return targetNamespace.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#setTargetNamespace(String newValue)
	 * 
	 */
	public void setTargetNamespace(String newValue) {
		if (newValue != null) {
			targetNamespace.setText(newValue);
		} else {
			targetNamespace.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#getExpressionLanguage()
	 * 
	 */
	public String getExpressionLanguage() {
		return expressionLanguage.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#setExpressionLanguage(String newValue)
	 * 
	 */
	public void setExpressionLanguage(String newValue) {
		if (newValue != null) {
			expressionLanguage.setText(newValue);
		} else {
			expressionLanguage.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#getTypeLanguage()
	 * 
	 */
	public String getTypeLanguage() {
		return typeLanguage.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#setTypeLanguage(String newValue)
	 * 
	 */
	public void setTypeLanguage(String newValue) {
		if (newValue != null) {
			typeLanguage.setText(newValue);
		} else {
			typeLanguage.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#initImports(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initImports(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		imports.setContentProvider(contentProvider);
		imports.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#updateImports()
	 * 
	 */
	public void updateImports() {
	imports.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addFilterImports(ViewerFilter filter)
	 * 
	 */
	public void addFilterToImports(ViewerFilter filter) {
		importsFilters.add(filter);
		if (this.imports != null) {
			this.imports.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addBusinessFilterImports(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToImports(ViewerFilter filter) {
		importsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#isContainedInImportsTable(EObject element)
	 * 
	 */
	public boolean isContainedInImportsTable(EObject element) {
		return ((ReferencesTableSettings)imports.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#initExtensions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initExtensions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		extensions.setContentProvider(contentProvider);
		extensions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#updateExtensions()
	 * 
	 */
	public void updateExtensions() {
	extensions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addFilterExtensions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensions(ViewerFilter filter) {
		extensionsFilters.add(filter);
		if (this.extensions != null) {
			this.extensions.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addBusinessFilterExtensions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensions(ViewerFilter filter) {
		extensionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#isContainedInExtensionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionsTable(EObject element) {
		return ((ReferencesTableSettings)extensions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#initRelationships(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRelationships(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		relationships.setContentProvider(contentProvider);
		relationships.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#updateRelationships()
	 * 
	 */
	public void updateRelationships() {
	relationships.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addFilterRelationships(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRelationships(ViewerFilter filter) {
		relationshipsFilters.add(filter);
		if (this.relationships != null) {
			this.relationships.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addBusinessFilterRelationships(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRelationships(ViewerFilter filter) {
		relationshipsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#isContainedInRelationshipsTable(EObject element)
	 * 
	 */
	public boolean isContainedInRelationshipsTable(EObject element) {
		return ((ReferencesTableSettings)relationships.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#initRootElements(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRootElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rootElements.setContentProvider(contentProvider);
		rootElements.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#updateRootElements()
	 * 
	 */
	public void updateRootElements() {
	rootElements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addFilterRootElements(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRootElements(ViewerFilter filter) {
		rootElementsFilters.add(filter);
		if (this.rootElements != null) {
			this.rootElements.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#addBusinessFilterRootElements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRootElements(ViewerFilter filter) {
		rootElementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#isContainedInRootElementsTable(EObject element)
	 * 
	 */
	public boolean isContainedInRootElementsTable(EObject element) {
		return ((ReferencesTableSettings)rootElements.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#getExporter()
	 * 
	 */
	public String getExporter() {
		return exporter.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#setExporter(String newValue)
	 * 
	 */
	public void setExporter(String newValue) {
		if (newValue != null) {
			exporter.setText(newValue);
		} else {
			exporter.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#getExporterVersion()
	 * 
	 */
	public String getExporterVersion() {
		return exporterVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart#setExporterVersion(String newValue)
	 * 
	 */
	public void setExporterVersion(String newValue) {
		if (newValue != null) {
			exporterVersion.setText(newValue);
		} else {
			exporterVersion.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.Definitions_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
