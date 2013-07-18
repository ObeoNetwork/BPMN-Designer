/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
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
import org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class MultiInstanceLoopCharacteristicsPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, MultiInstanceLoopCharacteristicsPropertiesEditionPart {

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
	protected Button isSequential;
	protected EMFComboViewer behavior;
	protected EObjectFlatComboViewer loopDataInputRef;
	protected EObjectFlatComboViewer loopDataOutputRef;
	protected ReferencesTable complexBehaviorDefinition;
	protected List<ViewerFilter> complexBehaviorDefinitionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> complexBehaviorDefinitionFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer oneBehaviorEventRef;
	protected EObjectFlatComboViewer noneBehaviorEventRef;



	/**
	 * For {@link ISection} use only.
	 */
	public MultiInstanceLoopCharacteristicsPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MultiInstanceLoopCharacteristicsPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence multiInstanceLoopCharacteristicsStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = multiInstanceLoopCharacteristicsStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential);
		propertiesStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior);
		propertiesStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition);
		propertiesStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef);
		
		
		composer = new PartComposer(multiInstanceLoopCharacteristicsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions) {
					return createExtensionDefinitionsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues) {
					return createExtensionValuesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation) {
					return createDocumentationTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential) {
					return createIsSequentialCheckbox(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior) {
					return createBehaviorEMFComboViewer(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef) {
					return createLoopDataInputRefFlatComboViewer(parent, widgetFactory);
				}
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef) {
					return createLoopDataOutputRefFlatComboViewer(parent, widgetFactory);
				}
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition) {
					return createComplexBehaviorDefinitionTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef) {
					return createOneBehaviorEventRefFlatComboViewer(parent, widgetFactory);
				}
				if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef) {
					return createNoneBehaviorEventRefFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id, Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_IdLabel);
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
							MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id,
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
									MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.extensionDefinitions = new ReferencesTable(getDescription(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions, Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_ExtensionDefinitionsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionDefinitions.createControls(parent, widgetFactory);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues, Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionValues.createControls(parent, widgetFactory);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation, Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation, Bpmn2ViewsRepository.FORM_KIND));
		this.documentation.createControls(parent, widgetFactory);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsSequentialCheckbox(FormToolkit widgetFactory, Composite parent) {
		isSequential = widgetFactory.createButton(parent, getDescription(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential, Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_IsSequentialLabel), SWT.CHECK);
		isSequential.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isSequential.getSelection())));
			}

		});
		GridData isSequentialData = new GridData(GridData.FILL_HORIZONTAL);
		isSequentialData.horizontalSpan = 2;
		isSequential.setLayoutData(isSequentialData);
		EditingUtils.setID(isSequential, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential);
		EditingUtils.setEEFtype(isSequential, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBehaviorEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior, Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_BehaviorLabel);
		behavior = new EMFComboViewer(parent);
		behavior.setContentProvider(new ArrayContentProvider());
		behavior.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData behaviorData = new GridData(GridData.FILL_HORIZONTAL);
		behavior.getCombo().setLayoutData(behaviorData);
		behavior.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBehavior()));
			}

		});
		behavior.setID(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createLoopDataInputRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef, Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_LoopDataInputRefLabel);
		loopDataInputRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(loopDataInputRef);
		loopDataInputRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData loopDataInputRefData = new GridData(GridData.FILL_HORIZONTAL);
		loopDataInputRef.setLayoutData(loopDataInputRefData);
		loopDataInputRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLoopDataInputRef()));
			}

		});
		loopDataInputRef.setID(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createLoopDataOutputRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef, Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_LoopDataOutputRefLabel);
		loopDataOutputRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(loopDataOutputRef);
		loopDataOutputRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData loopDataOutputRefData = new GridData(GridData.FILL_HORIZONTAL);
		loopDataOutputRef.setLayoutData(loopDataOutputRefData);
		loopDataOutputRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLoopDataOutputRef()));
			}

		});
		loopDataOutputRef.setID(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createComplexBehaviorDefinitionTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.complexBehaviorDefinition = new ReferencesTable(getDescription(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition, Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_ComplexBehaviorDefinitionLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				complexBehaviorDefinition.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				complexBehaviorDefinition.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				complexBehaviorDefinition.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				complexBehaviorDefinition.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.complexBehaviorDefinitionFilters) {
			this.complexBehaviorDefinition.addFilter(filter);
		}
		this.complexBehaviorDefinition.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition, Bpmn2ViewsRepository.FORM_KIND));
		this.complexBehaviorDefinition.createControls(parent, widgetFactory);
		this.complexBehaviorDefinition.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData complexBehaviorDefinitionData = new GridData(GridData.FILL_HORIZONTAL);
		complexBehaviorDefinitionData.horizontalSpan = 3;
		this.complexBehaviorDefinition.setLayoutData(complexBehaviorDefinitionData);
		this.complexBehaviorDefinition.setLowerBound(0);
		this.complexBehaviorDefinition.setUpperBound(-1);
		complexBehaviorDefinition.setID(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition);
		complexBehaviorDefinition.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOneBehaviorEventRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef, Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_OneBehaviorEventRefLabel);
		oneBehaviorEventRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(oneBehaviorEventRef);
		oneBehaviorEventRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData oneBehaviorEventRefData = new GridData(GridData.FILL_HORIZONTAL);
		oneBehaviorEventRef.setLayoutData(oneBehaviorEventRefData);
		oneBehaviorEventRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOneBehaviorEventRef()));
			}

		});
		oneBehaviorEventRef.setID(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createNoneBehaviorEventRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef, Bpmn2Messages.MultiInstanceLoopCharacteristicsPropertiesEditionPart_NoneBehaviorEventRefLabel);
		noneBehaviorEventRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(noneBehaviorEventRef);
		noneBehaviorEventRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData noneBehaviorEventRefData = new GridData(GridData.FILL_HORIZONTAL);
		noneBehaviorEventRef.setLayoutData(noneBehaviorEventRefData);
		noneBehaviorEventRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MultiInstanceLoopCharacteristicsPropertiesEditionPartForm.this, Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getNoneBehaviorEventRef()));
			}

		});
		noneBehaviorEventRef.setID(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#setId(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#getIsSequential()
	 * 
	 */
	public Boolean getIsSequential() {
		return Boolean.valueOf(isSequential.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#setIsSequential(Boolean newValue)
	 * 
	 */
	public void setIsSequential(Boolean newValue) {
		if (newValue != null) {
			isSequential.setSelection(newValue.booleanValue());
		} else {
			isSequential.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#getBehavior()
	 * 
	 */
	public Enumerator getBehavior() {
		Enumerator selection = (Enumerator) ((StructuredSelection) behavior.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#initBehavior(Object input, Enumerator current)
	 */
	public void initBehavior(Object input, Enumerator current) {
		behavior.setInput(input);
		behavior.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#setBehavior(Enumerator newValue)
	 * 
	 */
	public void setBehavior(Enumerator newValue) {
		behavior.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#getLoopDataInputRef()
	 * 
	 */
	public EObject getLoopDataInputRef() {
		if (loopDataInputRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) loopDataInputRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#initLoopDataInputRef(EObjectFlatComboSettings)
	 */
	public void initLoopDataInputRef(EObjectFlatComboSettings settings) {
		loopDataInputRef.setInput(settings);
		if (current != null) {
			loopDataInputRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#setLoopDataInputRef(EObject newValue)
	 * 
	 */
	public void setLoopDataInputRef(EObject newValue) {
		if (newValue != null) {
			loopDataInputRef.setSelection(new StructuredSelection(newValue));
		} else {
			loopDataInputRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#setLoopDataInputRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLoopDataInputRefButtonMode(ButtonsModeEnum newValue) {
		loopDataInputRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addFilterLoopDataInputRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLoopDataInputRef(ViewerFilter filter) {
		loopDataInputRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addBusinessFilterLoopDataInputRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLoopDataInputRef(ViewerFilter filter) {
		loopDataInputRef.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#getLoopDataOutputRef()
	 * 
	 */
	public EObject getLoopDataOutputRef() {
		if (loopDataOutputRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) loopDataOutputRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#initLoopDataOutputRef(EObjectFlatComboSettings)
	 */
	public void initLoopDataOutputRef(EObjectFlatComboSettings settings) {
		loopDataOutputRef.setInput(settings);
		if (current != null) {
			loopDataOutputRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#setLoopDataOutputRef(EObject newValue)
	 * 
	 */
	public void setLoopDataOutputRef(EObject newValue) {
		if (newValue != null) {
			loopDataOutputRef.setSelection(new StructuredSelection(newValue));
		} else {
			loopDataOutputRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#setLoopDataOutputRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLoopDataOutputRefButtonMode(ButtonsModeEnum newValue) {
		loopDataOutputRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addFilterLoopDataOutputRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLoopDataOutputRef(ViewerFilter filter) {
		loopDataOutputRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addBusinessFilterLoopDataOutputRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLoopDataOutputRef(ViewerFilter filter) {
		loopDataOutputRef.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#initComplexBehaviorDefinition(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initComplexBehaviorDefinition(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		complexBehaviorDefinition.setContentProvider(contentProvider);
		complexBehaviorDefinition.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#updateComplexBehaviorDefinition()
	 * 
	 */
	public void updateComplexBehaviorDefinition() {
	complexBehaviorDefinition.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addFilterComplexBehaviorDefinition(ViewerFilter filter)
	 * 
	 */
	public void addFilterToComplexBehaviorDefinition(ViewerFilter filter) {
		complexBehaviorDefinitionFilters.add(filter);
		if (this.complexBehaviorDefinition != null) {
			this.complexBehaviorDefinition.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addBusinessFilterComplexBehaviorDefinition(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToComplexBehaviorDefinition(ViewerFilter filter) {
		complexBehaviorDefinitionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#isContainedInComplexBehaviorDefinitionTable(EObject element)
	 * 
	 */
	public boolean isContainedInComplexBehaviorDefinitionTable(EObject element) {
		return ((ReferencesTableSettings)complexBehaviorDefinition.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#getOneBehaviorEventRef()
	 * 
	 */
	public EObject getOneBehaviorEventRef() {
		if (oneBehaviorEventRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) oneBehaviorEventRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#initOneBehaviorEventRef(EObjectFlatComboSettings)
	 */
	public void initOneBehaviorEventRef(EObjectFlatComboSettings settings) {
		oneBehaviorEventRef.setInput(settings);
		if (current != null) {
			oneBehaviorEventRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#setOneBehaviorEventRef(EObject newValue)
	 * 
	 */
	public void setOneBehaviorEventRef(EObject newValue) {
		if (newValue != null) {
			oneBehaviorEventRef.setSelection(new StructuredSelection(newValue));
		} else {
			oneBehaviorEventRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#setOneBehaviorEventRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOneBehaviorEventRefButtonMode(ButtonsModeEnum newValue) {
		oneBehaviorEventRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addFilterOneBehaviorEventRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOneBehaviorEventRef(ViewerFilter filter) {
		oneBehaviorEventRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addBusinessFilterOneBehaviorEventRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOneBehaviorEventRef(ViewerFilter filter) {
		oneBehaviorEventRef.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#getNoneBehaviorEventRef()
	 * 
	 */
	public EObject getNoneBehaviorEventRef() {
		if (noneBehaviorEventRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) noneBehaviorEventRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#initNoneBehaviorEventRef(EObjectFlatComboSettings)
	 */
	public void initNoneBehaviorEventRef(EObjectFlatComboSettings settings) {
		noneBehaviorEventRef.setInput(settings);
		if (current != null) {
			noneBehaviorEventRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#setNoneBehaviorEventRef(EObject newValue)
	 * 
	 */
	public void setNoneBehaviorEventRef(EObject newValue) {
		if (newValue != null) {
			noneBehaviorEventRef.setSelection(new StructuredSelection(newValue));
		} else {
			noneBehaviorEventRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#setNoneBehaviorEventRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNoneBehaviorEventRefButtonMode(ButtonsModeEnum newValue) {
		noneBehaviorEventRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addFilterNoneBehaviorEventRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNoneBehaviorEventRef(ViewerFilter filter) {
		noneBehaviorEventRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart#addBusinessFilterNoneBehaviorEventRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNoneBehaviorEventRef(ViewerFilter filter) {
		noneBehaviorEventRef.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.MultiInstanceLoopCharacteristics_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
