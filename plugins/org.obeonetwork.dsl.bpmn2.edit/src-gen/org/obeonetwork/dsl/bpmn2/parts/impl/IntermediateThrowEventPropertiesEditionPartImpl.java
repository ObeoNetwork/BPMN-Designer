/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class IntermediateThrowEventPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, IntermediateThrowEventPropertiesEditionPart {

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
	protected ReferencesTable properties;
	protected List<ViewerFilter> propertiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable eventDefinitionRefs;
	protected List<ViewerFilter> eventDefinitionRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> eventDefinitionRefsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable dataInputAssociation;
	protected List<ViewerFilter> dataInputAssociationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> dataInputAssociationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable eventDefinitions;
	protected List<ViewerFilter> eventDefinitionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> eventDefinitionsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IntermediateThrowEventPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence intermediateThrowEventStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = intermediateThrowEventStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.categoryValueRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.outgoing);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.incoming);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.properties_);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitionRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.dataInputAssociation);
		propertiesStep.addStep(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitions);
		
		
		composer = new PartComposer(intermediateThrowEventStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.id) {
					return createIdText(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionDefinitions) {
					return createExtensionDefinitionsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionValues) {
					return createExtensionValuesAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.documentation) {
					return createDocumentationAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.name) {
					return createNameText(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.categoryValueRef) {
					return createCategoryValueRefAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.outgoing) {
					return createOutgoingAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.incoming) {
					return createIncomingAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.properties_) {
					return createPropertiesAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitionRefs) {
					return createEventDefinitionRefsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.dataInputAssociation) {
					return createDataInputAssociationAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitions) {
					return createEventDefinitionsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.id, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_IdLabel);
		id = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}

		});
		id.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.id, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionDefinitions, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_ExtensionDefinitionsLabel);		 
		this.extensionDefinitions = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionDefinitions, Bpmn2ViewsRepository.SWT_KIND));
		this.extensionDefinitions.createControls(parent);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionDefinitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionDefinitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createExtensionValuesAdvancedTableComposition(Composite parent) {
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionValues, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionValues, Bpmn2ViewsRepository.SWT_KIND));
		this.extensionValues.createControls(parent);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationAdvancedTableComposition(Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.documentation, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.documentation, Bpmn2ViewsRepository.SWT_KIND));
		this.documentation.createControls(parent);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.name, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.name, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCategoryValueRefAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.categoryValueRef, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_CategoryValueRefLabel);		 
		this.categoryValueRef = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addCategoryValueRef(); }
			public void handleEdit(EObject element) { editCategoryValueRef(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategoryValueRef(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategoryValueRef(element); }
			public void navigateTo(EObject element) { }
		});
		this.categoryValueRef.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.categoryValueRef, Bpmn2ViewsRepository.SWT_KIND));
		this.categoryValueRef.createControls(parent);
		this.categoryValueRef.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.categoryValueRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryValueRefData = new GridData(GridData.FILL_HORIZONTAL);
		categoryValueRefData.horizontalSpan = 3;
		this.categoryValueRef.setLayoutData(categoryValueRefData);
		this.categoryValueRef.disableMove();
		categoryValueRef.setID(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.categoryValueRef);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.categoryValueRef,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.categoryValueRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		categoryValueRef.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategoryValueRef(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.categoryValueRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createOutgoingAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.outgoing, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_OutgoingLabel);		 
		this.outgoing = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOutgoing(); }
			public void handleEdit(EObject element) { editOutgoing(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoing(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoing(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoing.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.outgoing, Bpmn2ViewsRepository.SWT_KIND));
		this.outgoing.createControls(parent);
		this.outgoing.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.outgoing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingData.horizontalSpan = 3;
		this.outgoing.setLayoutData(outgoingData);
		this.outgoing.disableMove();
		outgoing.setID(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.outgoing);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.outgoing,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoing.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoing(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIncomingAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.incoming, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_IncomingLabel);		 
		this.incoming = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addIncoming(); }
			public void handleEdit(EObject element) { editIncoming(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncoming(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncoming(element); }
			public void navigateTo(EObject element) { }
		});
		this.incoming.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.incoming, Bpmn2ViewsRepository.SWT_KIND));
		this.incoming.createControls(parent);
		this.incoming.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.incoming, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingData = new GridData(GridData.FILL_HORIZONTAL);
		incomingData.horizontalSpan = 3;
		this.incoming.setLayoutData(incomingData);
		this.incoming.disableMove();
		incoming.setID(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.incoming);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.incoming,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incoming.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncoming(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	/**
	 * @param container
	 * 
	 */
	protected Composite createPropertiesAdvancedTableComposition(Composite parent) {
		this.properties = new ReferencesTable(getDescription(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.properties_, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_PropertiesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				properties.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				properties.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				properties.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				properties.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.propertiesFilters) {
			this.properties.addFilter(filter);
		}
		this.properties.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.properties_, Bpmn2ViewsRepository.SWT_KIND));
		this.properties.createControls(parent);
		this.properties.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.properties_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData propertiesData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesData.horizontalSpan = 3;
		this.properties.setLayoutData(propertiesData);
		this.properties.setLowerBound(0);
		this.properties.setUpperBound(-1);
		properties.setID(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.properties_);
		properties.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createEventDefinitionRefsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitionRefs, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_EventDefinitionRefsLabel);		 
		this.eventDefinitionRefs = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addEventDefinitionRefs(); }
			public void handleEdit(EObject element) { editEventDefinitionRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveEventDefinitionRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromEventDefinitionRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.eventDefinitionRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitionRefs, Bpmn2ViewsRepository.SWT_KIND));
		this.eventDefinitionRefs.createControls(parent);
		this.eventDefinitionRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitionRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData eventDefinitionRefsData = new GridData(GridData.FILL_HORIZONTAL);
		eventDefinitionRefsData.horizontalSpan = 3;
		this.eventDefinitionRefs.setLayoutData(eventDefinitionRefsData);
		this.eventDefinitionRefs.disableMove();
		eventDefinitionRefs.setID(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitionRefs);
		eventDefinitionRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addEventDefinitionRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(eventDefinitionRefs.getInput(), eventDefinitionRefsFilters, eventDefinitionRefsBusinessFilters,
		"eventDefinitionRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitionRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				eventDefinitionRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveEventDefinitionRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitionRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		eventDefinitionRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEventDefinitionRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitionRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		eventDefinitionRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editEventDefinitionRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				eventDefinitionRefs.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDataInputAssociationAdvancedTableComposition(Composite parent) {
		this.dataInputAssociation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.dataInputAssociation, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_DataInputAssociationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.dataInputAssociation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				dataInputAssociation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.dataInputAssociation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				dataInputAssociation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.dataInputAssociation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				dataInputAssociation.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.dataInputAssociation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				dataInputAssociation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.dataInputAssociationFilters) {
			this.dataInputAssociation.addFilter(filter);
		}
		this.dataInputAssociation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.dataInputAssociation, Bpmn2ViewsRepository.SWT_KIND));
		this.dataInputAssociation.createControls(parent);
		this.dataInputAssociation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.dataInputAssociation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData dataInputAssociationData = new GridData(GridData.FILL_HORIZONTAL);
		dataInputAssociationData.horizontalSpan = 3;
		this.dataInputAssociation.setLayoutData(dataInputAssociationData);
		this.dataInputAssociation.setLowerBound(0);
		this.dataInputAssociation.setUpperBound(-1);
		dataInputAssociation.setID(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.dataInputAssociation);
		dataInputAssociation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEventDefinitionsAdvancedTableComposition(Composite parent) {
		this.eventDefinitions = new ReferencesTable(getDescription(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitions, Bpmn2Messages.IntermediateThrowEventPropertiesEditionPart_EventDefinitionsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				eventDefinitions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				eventDefinitions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				eventDefinitions.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				eventDefinitions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.eventDefinitionsFilters) {
			this.eventDefinitions.addFilter(filter);
		}
		this.eventDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitions, Bpmn2ViewsRepository.SWT_KIND));
		this.eventDefinitions.createControls(parent);
		this.eventDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntermediateThrowEventPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData eventDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		eventDefinitionsData.horizontalSpan = 3;
		this.eventDefinitions.setLayoutData(eventDefinitionsData);
		this.eventDefinitions.setLowerBound(0);
		this.eventDefinitions.setUpperBound(-1);
		eventDefinitions.setID(Bpmn2ViewsRepository.IntermediateThrowEvent.Properties.eventDefinitions);
		eventDefinitions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#setId(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#initCategoryValueRef(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#updateCategoryValueRef()
	 * 
	 */
	public void updateCategoryValueRef() {
	categoryValueRef.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addFilterCategoryValueRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategoryValueRef(ViewerFilter filter) {
		categoryValueRefFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addBusinessFilterCategoryValueRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategoryValueRef(ViewerFilter filter) {
		categoryValueRefBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#isContainedInCategoryValueRefTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryValueRefTable(EObject element) {
		return ((ReferencesTableSettings)categoryValueRef.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#initOutgoing(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#updateOutgoing()
	 * 
	 */
	public void updateOutgoing() {
	outgoing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoing(ViewerFilter filter) {
		outgoingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addBusinessFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoing(ViewerFilter filter) {
		outgoingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#isContainedInOutgoingTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingTable(EObject element) {
		return ((ReferencesTableSettings)outgoing.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#initIncoming(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#updateIncoming()
	 * 
	 */
	public void updateIncoming() {
	incoming.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addFilterIncoming(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncoming(ViewerFilter filter) {
		incomingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addBusinessFilterIncoming(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncoming(ViewerFilter filter) {
		incomingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#isContainedInIncomingTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingTable(EObject element) {
		return ((ReferencesTableSettings)incoming.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#initProperties(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#updateProperties()
	 * 
	 */
	public void updateProperties() {
	properties.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addFilterProperties(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addBusinessFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter) {
		propertiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#isContainedInPropertiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element) {
		return ((ReferencesTableSettings)properties.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#initEventDefinitionRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initEventDefinitionRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		eventDefinitionRefs.setContentProvider(contentProvider);
		eventDefinitionRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#updateEventDefinitionRefs()
	 * 
	 */
	public void updateEventDefinitionRefs() {
	eventDefinitionRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addFilterEventDefinitionRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEventDefinitionRefs(ViewerFilter filter) {
		eventDefinitionRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addBusinessFilterEventDefinitionRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEventDefinitionRefs(ViewerFilter filter) {
		eventDefinitionRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#isContainedInEventDefinitionRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEventDefinitionRefsTable(EObject element) {
		return ((ReferencesTableSettings)eventDefinitionRefs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#initDataInputAssociation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDataInputAssociation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		dataInputAssociation.setContentProvider(contentProvider);
		dataInputAssociation.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#updateDataInputAssociation()
	 * 
	 */
	public void updateDataInputAssociation() {
	dataInputAssociation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addFilterDataInputAssociation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDataInputAssociation(ViewerFilter filter) {
		dataInputAssociationFilters.add(filter);
		if (this.dataInputAssociation != null) {
			this.dataInputAssociation.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addBusinessFilterDataInputAssociation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDataInputAssociation(ViewerFilter filter) {
		dataInputAssociationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#isContainedInDataInputAssociationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDataInputAssociationTable(EObject element) {
		return ((ReferencesTableSettings)dataInputAssociation.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#initEventDefinitions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEventDefinitions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		eventDefinitions.setContentProvider(contentProvider);
		eventDefinitions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#updateEventDefinitions()
	 * 
	 */
	public void updateEventDefinitions() {
	eventDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addFilterEventDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEventDefinitions(ViewerFilter filter) {
		eventDefinitionsFilters.add(filter);
		if (this.eventDefinitions != null) {
			this.eventDefinitions.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#addBusinessFilterEventDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEventDefinitions(ViewerFilter filter) {
		eventDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.IntermediateThrowEventPropertiesEditionPart#isContainedInEventDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEventDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)eventDefinitions.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.IntermediateThrowEvent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
