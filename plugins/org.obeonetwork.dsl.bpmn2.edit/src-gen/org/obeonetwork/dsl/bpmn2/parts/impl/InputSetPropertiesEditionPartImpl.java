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
import org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class InputSetPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InputSetPropertiesEditionPart {

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
	protected ReferencesTable dataInputRefs;
	protected List<ViewerFilter> dataInputRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> dataInputRefsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable optionalInputRefs;
	protected List<ViewerFilter> optionalInputRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> optionalInputRefsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable whileExecutingInputRefs;
	protected List<ViewerFilter> whileExecutingInputRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> whileExecutingInputRefsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outputSetRefs;
	protected List<ViewerFilter> outputSetRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outputSetRefsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InputSetPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence inputSetStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = inputSetStep.addStep(Bpmn2ViewsRepository.InputSet.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputSet.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputSet.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputSet.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputSet.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputSet.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputSet.Properties.dataInputRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputSet.Properties.optionalInputRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputSet.Properties.whileExecutingInputRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.InputSet.Properties.outputSetRefs);
		
		
		composer = new PartComposer(inputSetStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.InputSet.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Bpmn2ViewsRepository.InputSet.Properties.id) {
					return createIdText(parent);
				}
				if (key == Bpmn2ViewsRepository.InputSet.Properties.extensionDefinitions) {
					return createExtensionDefinitionsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.InputSet.Properties.extensionValues) {
					return createExtensionValuesAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.InputSet.Properties.documentation) {
					return createDocumentationAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.InputSet.Properties.name) {
					return createNameText(parent);
				}
				if (key == Bpmn2ViewsRepository.InputSet.Properties.dataInputRefs) {
					return createDataInputRefsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.InputSet.Properties.optionalInputRefs) {
					return createOptionalInputRefsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.InputSet.Properties.whileExecutingInputRefs) {
					return createWhileExecutingInputRefsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.InputSet.Properties.outputSetRefs) {
					return createOutputSetRefsAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(Bpmn2Messages.InputSetPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.InputSet.Properties.id, Bpmn2Messages.InputSetPropertiesEditionPart_IdLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.InputSet.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputSet.Properties.id, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.InputSet.Properties.extensionDefinitions, Bpmn2Messages.InputSetPropertiesEditionPart_ExtensionDefinitionsLabel);		 
		this.extensionDefinitions = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputSet.Properties.extensionDefinitions, Bpmn2ViewsRepository.SWT_KIND));
		this.extensionDefinitions.createControls(parent);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.InputSet.Properties.extensionDefinitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.extensionDefinitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.InputSet.Properties.extensionValues, Bpmn2Messages.InputSetPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputSet.Properties.extensionValues, Bpmn2ViewsRepository.SWT_KIND));
		this.extensionValues.createControls(parent);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.InputSet.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationAdvancedTableComposition(Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.InputSet.Properties.documentation, Bpmn2Messages.InputSetPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputSet.Properties.documentation, Bpmn2ViewsRepository.SWT_KIND));
		this.documentation.createControls(parent);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.InputSet.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.InputSet.Properties.name, Bpmn2Messages.InputSetPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.InputSet.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputSet.Properties.name, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createDataInputRefsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.InputSet.Properties.dataInputRefs, Bpmn2Messages.InputSetPropertiesEditionPart_DataInputRefsLabel);		 
		this.dataInputRefs = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addDataInputRefs(); }
			public void handleEdit(EObject element) { editDataInputRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDataInputRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDataInputRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.dataInputRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputSet.Properties.dataInputRefs, Bpmn2ViewsRepository.SWT_KIND));
		this.dataInputRefs.createControls(parent);
		this.dataInputRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.dataInputRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData dataInputRefsData = new GridData(GridData.FILL_HORIZONTAL);
		dataInputRefsData.horizontalSpan = 3;
		this.dataInputRefs.setLayoutData(dataInputRefsData);
		this.dataInputRefs.disableMove();
		dataInputRefs.setID(Bpmn2ViewsRepository.InputSet.Properties.dataInputRefs);
		dataInputRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDataInputRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(dataInputRefs.getInput(), dataInputRefsFilters, dataInputRefsBusinessFilters,
		"dataInputRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.dataInputRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				dataInputRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDataInputRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.dataInputRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		dataInputRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDataInputRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.dataInputRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		dataInputRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editDataInputRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				dataInputRefs.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOptionalInputRefsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.InputSet.Properties.optionalInputRefs, Bpmn2Messages.InputSetPropertiesEditionPart_OptionalInputRefsLabel);		 
		this.optionalInputRefs = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOptionalInputRefs(); }
			public void handleEdit(EObject element) { editOptionalInputRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOptionalInputRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOptionalInputRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.optionalInputRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputSet.Properties.optionalInputRefs, Bpmn2ViewsRepository.SWT_KIND));
		this.optionalInputRefs.createControls(parent);
		this.optionalInputRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.optionalInputRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData optionalInputRefsData = new GridData(GridData.FILL_HORIZONTAL);
		optionalInputRefsData.horizontalSpan = 3;
		this.optionalInputRefs.setLayoutData(optionalInputRefsData);
		this.optionalInputRefs.disableMove();
		optionalInputRefs.setID(Bpmn2ViewsRepository.InputSet.Properties.optionalInputRefs);
		optionalInputRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOptionalInputRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(optionalInputRefs.getInput(), optionalInputRefsFilters, optionalInputRefsBusinessFilters,
		"optionalInputRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.optionalInputRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				optionalInputRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOptionalInputRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.optionalInputRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		optionalInputRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOptionalInputRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.optionalInputRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		optionalInputRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editOptionalInputRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				optionalInputRefs.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createWhileExecutingInputRefsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.InputSet.Properties.whileExecutingInputRefs, Bpmn2Messages.InputSetPropertiesEditionPart_WhileExecutingInputRefsLabel);		 
		this.whileExecutingInputRefs = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addWhileExecutingInputRefs(); }
			public void handleEdit(EObject element) { editWhileExecutingInputRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveWhileExecutingInputRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromWhileExecutingInputRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.whileExecutingInputRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputSet.Properties.whileExecutingInputRefs, Bpmn2ViewsRepository.SWT_KIND));
		this.whileExecutingInputRefs.createControls(parent);
		this.whileExecutingInputRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.whileExecutingInputRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData whileExecutingInputRefsData = new GridData(GridData.FILL_HORIZONTAL);
		whileExecutingInputRefsData.horizontalSpan = 3;
		this.whileExecutingInputRefs.setLayoutData(whileExecutingInputRefsData);
		this.whileExecutingInputRefs.disableMove();
		whileExecutingInputRefs.setID(Bpmn2ViewsRepository.InputSet.Properties.whileExecutingInputRefs);
		whileExecutingInputRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addWhileExecutingInputRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(whileExecutingInputRefs.getInput(), whileExecutingInputRefsFilters, whileExecutingInputRefsBusinessFilters,
		"whileExecutingInputRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.whileExecutingInputRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				whileExecutingInputRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveWhileExecutingInputRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.whileExecutingInputRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		whileExecutingInputRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromWhileExecutingInputRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.whileExecutingInputRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		whileExecutingInputRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editWhileExecutingInputRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				whileExecutingInputRefs.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutputSetRefsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.InputSet.Properties.outputSetRefs, Bpmn2Messages.InputSetPropertiesEditionPart_OutputSetRefsLabel);		 
		this.outputSetRefs = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOutputSetRefs(); }
			public void handleEdit(EObject element) { editOutputSetRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutputSetRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutputSetRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.outputSetRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.InputSet.Properties.outputSetRefs, Bpmn2ViewsRepository.SWT_KIND));
		this.outputSetRefs.createControls(parent);
		this.outputSetRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.outputSetRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputSetRefsData = new GridData(GridData.FILL_HORIZONTAL);
		outputSetRefsData.horizontalSpan = 3;
		this.outputSetRefs.setLayoutData(outputSetRefsData);
		this.outputSetRefs.disableMove();
		outputSetRefs.setID(Bpmn2ViewsRepository.InputSet.Properties.outputSetRefs);
		outputSetRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutputSetRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outputSetRefs.getInput(), outputSetRefsFilters, outputSetRefsBusinessFilters,
		"outputSetRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.outputSetRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outputSetRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutputSetRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.outputSetRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outputSetRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutputSetRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputSetPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.InputSet.Properties.outputSetRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outputSetRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editOutputSetRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outputSetRefs.refresh();
			}
		}
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#setId(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#initDataInputRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDataInputRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		dataInputRefs.setContentProvider(contentProvider);
		dataInputRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#updateDataInputRefs()
	 * 
	 */
	public void updateDataInputRefs() {
	dataInputRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addFilterDataInputRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDataInputRefs(ViewerFilter filter) {
		dataInputRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addBusinessFilterDataInputRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDataInputRefs(ViewerFilter filter) {
		dataInputRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#isContainedInDataInputRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDataInputRefsTable(EObject element) {
		return ((ReferencesTableSettings)dataInputRefs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#initOptionalInputRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOptionalInputRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		optionalInputRefs.setContentProvider(contentProvider);
		optionalInputRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#updateOptionalInputRefs()
	 * 
	 */
	public void updateOptionalInputRefs() {
	optionalInputRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addFilterOptionalInputRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOptionalInputRefs(ViewerFilter filter) {
		optionalInputRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addBusinessFilterOptionalInputRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOptionalInputRefs(ViewerFilter filter) {
		optionalInputRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#isContainedInOptionalInputRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOptionalInputRefsTable(EObject element) {
		return ((ReferencesTableSettings)optionalInputRefs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#initWhileExecutingInputRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initWhileExecutingInputRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		whileExecutingInputRefs.setContentProvider(contentProvider);
		whileExecutingInputRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#updateWhileExecutingInputRefs()
	 * 
	 */
	public void updateWhileExecutingInputRefs() {
	whileExecutingInputRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addFilterWhileExecutingInputRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToWhileExecutingInputRefs(ViewerFilter filter) {
		whileExecutingInputRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addBusinessFilterWhileExecutingInputRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToWhileExecutingInputRefs(ViewerFilter filter) {
		whileExecutingInputRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#isContainedInWhileExecutingInputRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInWhileExecutingInputRefsTable(EObject element) {
		return ((ReferencesTableSettings)whileExecutingInputRefs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#initOutputSetRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutputSetRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outputSetRefs.setContentProvider(contentProvider);
		outputSetRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#updateOutputSetRefs()
	 * 
	 */
	public void updateOutputSetRefs() {
	outputSetRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addFilterOutputSetRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutputSetRefs(ViewerFilter filter) {
		outputSetRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#addBusinessFilterOutputSetRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutputSetRefs(ViewerFilter filter) {
		outputSetRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.InputSetPropertiesEditionPart#isContainedInOutputSetRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutputSetRefsTable(EObject element) {
		return ((ReferencesTableSettings)outputSetRefs.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.InputSet_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
