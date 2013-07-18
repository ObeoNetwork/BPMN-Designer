/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class ProcessPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ProcessPropertiesEditionPart {

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
	protected ReferencesTable supportedInterfaceRefs;
	protected List<ViewerFilter> supportedInterfaceRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> supportedInterfaceRefsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ioBinding;
	protected List<ViewerFilter> ioBindingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ioBindingFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable laneSets;
	protected List<ViewerFilter> laneSetsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> laneSetsFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer processType;
	protected Button isClosed;
	protected ReferencesTable properties;
	protected List<ViewerFilter> propertiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable supports;
	protected List<ViewerFilter> supportsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> supportsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer definitionalCollaborationRef;
	protected Button isExecutable;
	protected ReferencesTable resources;
	protected List<ViewerFilter> resourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable artifacts;
	protected List<ViewerFilter> artifactsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> artifactsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable correlationSubscriptions;
	protected List<ViewerFilter> correlationSubscriptionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> correlationSubscriptionsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ProcessPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence processStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = processStep.addStep(Bpmn2ViewsRepository.Process.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.ioBinding);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.laneSets);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.processType);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.isClosed);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.properties_);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.supports);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.isExecutable);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.resources);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.artifacts);
		propertiesStep.addStep(Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions);
		
		
		composer = new PartComposer(processStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.Process.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.id) {
					return createIdText(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.extensionDefinitions) {
					return createExtensionDefinitionsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.extensionValues) {
					return createExtensionValuesAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.documentation) {
					return createDocumentationAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.name) {
					return createNameText(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs) {
					return createSupportedInterfaceRefsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.ioBinding) {
					return createIoBindingAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.laneSets) {
					return createLaneSetsAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.processType) {
					return createProcessTypeEMFComboViewer(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.isClosed) {
					return createIsClosedCheckbox(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.properties_) {
					return createPropertiesAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.supports) {
					return createSupportsAdvancedReferencesTable(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef) {
					return createDefinitionalCollaborationRefFlatComboViewer(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.isExecutable) {
					return createIsExecutableCheckbox(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.resources) {
					return createResourcesAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.artifacts) {
					return createArtifactsAdvancedTableComposition(parent);
				}
				if (key == Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions) {
					return createCorrelationSubscriptionsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(Bpmn2Messages.ProcessPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Process.Properties.id, Bpmn2Messages.ProcessPropertiesEditionPart_IdLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.Process.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.id, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.Process.Properties.extensionDefinitions, Bpmn2Messages.ProcessPropertiesEditionPart_ExtensionDefinitionsLabel);		 
		this.extensionDefinitions = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.extensionDefinitions, Bpmn2ViewsRepository.SWT_KIND));
		this.extensionDefinitions.createControls(parent);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.Process.Properties.extensionDefinitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.extensionDefinitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Process.Properties.extensionValues, Bpmn2Messages.ProcessPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.extensionValues, Bpmn2ViewsRepository.SWT_KIND));
		this.extensionValues.createControls(parent);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.Process.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationAdvancedTableComposition(Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Process.Properties.documentation, Bpmn2Messages.ProcessPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.documentation, Bpmn2ViewsRepository.SWT_KIND));
		this.documentation.createControls(parent);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.Process.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Process.Properties.name, Bpmn2Messages.ProcessPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.Process.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.name, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSupportedInterfaceRefsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs, Bpmn2Messages.ProcessPropertiesEditionPart_SupportedInterfaceRefsLabel);		 
		this.supportedInterfaceRefs = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSupportedInterfaceRefs(); }
			public void handleEdit(EObject element) { editSupportedInterfaceRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSupportedInterfaceRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSupportedInterfaceRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.supportedInterfaceRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs, Bpmn2ViewsRepository.SWT_KIND));
		this.supportedInterfaceRefs.createControls(parent);
		this.supportedInterfaceRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData supportedInterfaceRefsData = new GridData(GridData.FILL_HORIZONTAL);
		supportedInterfaceRefsData.horizontalSpan = 3;
		this.supportedInterfaceRefs.setLayoutData(supportedInterfaceRefsData);
		this.supportedInterfaceRefs.disableMove();
		supportedInterfaceRefs.setID(Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs);
		supportedInterfaceRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSupportedInterfaceRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(supportedInterfaceRefs.getInput(), supportedInterfaceRefsFilters, supportedInterfaceRefsBusinessFilters,
		"supportedInterfaceRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				supportedInterfaceRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSupportedInterfaceRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		supportedInterfaceRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSupportedInterfaceRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		supportedInterfaceRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editSupportedInterfaceRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				supportedInterfaceRefs.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIoBindingAdvancedTableComposition(Composite parent) {
		this.ioBinding = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Process.Properties.ioBinding, Bpmn2Messages.ProcessPropertiesEditionPart_IoBindingLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.ioBinding, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ioBinding.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.ioBinding, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ioBinding.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.ioBinding, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ioBinding.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.ioBinding, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ioBinding.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ioBindingFilters) {
			this.ioBinding.addFilter(filter);
		}
		this.ioBinding.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.ioBinding, Bpmn2ViewsRepository.SWT_KIND));
		this.ioBinding.createControls(parent);
		this.ioBinding.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.ioBinding, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ioBindingData = new GridData(GridData.FILL_HORIZONTAL);
		ioBindingData.horizontalSpan = 3;
		this.ioBinding.setLayoutData(ioBindingData);
		this.ioBinding.setLowerBound(0);
		this.ioBinding.setUpperBound(-1);
		ioBinding.setID(Bpmn2ViewsRepository.Process.Properties.ioBinding);
		ioBinding.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createLaneSetsAdvancedTableComposition(Composite parent) {
		this.laneSets = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Process.Properties.laneSets, Bpmn2Messages.ProcessPropertiesEditionPart_LaneSetsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.laneSets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				laneSets.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.laneSets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				laneSets.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.laneSets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				laneSets.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.laneSets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				laneSets.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.laneSetsFilters) {
			this.laneSets.addFilter(filter);
		}
		this.laneSets.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.laneSets, Bpmn2ViewsRepository.SWT_KIND));
		this.laneSets.createControls(parent);
		this.laneSets.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.laneSets, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData laneSetsData = new GridData(GridData.FILL_HORIZONTAL);
		laneSetsData.horizontalSpan = 3;
		this.laneSets.setLayoutData(laneSetsData);
		this.laneSets.setLowerBound(0);
		this.laneSets.setUpperBound(-1);
		laneSets.setID(Bpmn2ViewsRepository.Process.Properties.laneSets);
		laneSets.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createProcessTypeEMFComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Process.Properties.processType, Bpmn2Messages.ProcessPropertiesEditionPart_ProcessTypeLabel);
		processType = new EMFComboViewer(parent);
		processType.setContentProvider(new ArrayContentProvider());
		processType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData processTypeData = new GridData(GridData.FILL_HORIZONTAL);
		processType.getCombo().setLayoutData(processTypeData);
		processType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.processType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getProcessType()));
			}

		});
		processType.setID(Bpmn2ViewsRepository.Process.Properties.processType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.processType, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsClosedCheckbox(Composite parent) {
		isClosed = new Button(parent, SWT.CHECK);
		isClosed.setText(getDescription(Bpmn2ViewsRepository.Process.Properties.isClosed, Bpmn2Messages.ProcessPropertiesEditionPart_IsClosedLabel));
		isClosed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.isClosed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isClosed.getSelection())));
			}

		});
		GridData isClosedData = new GridData(GridData.FILL_HORIZONTAL);
		isClosedData.horizontalSpan = 2;
		isClosed.setLayoutData(isClosedData);
		EditingUtils.setID(isClosed, Bpmn2ViewsRepository.Process.Properties.isClosed);
		EditingUtils.setEEFtype(isClosed, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.isClosed, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPropertiesAdvancedTableComposition(Composite parent) {
		this.properties = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Process.Properties.properties_, Bpmn2Messages.ProcessPropertiesEditionPart_PropertiesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				properties.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				properties.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				properties.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				properties.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.propertiesFilters) {
			this.properties.addFilter(filter);
		}
		this.properties.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.properties_, Bpmn2ViewsRepository.SWT_KIND));
		this.properties.createControls(parent);
		this.properties.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.properties_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData propertiesData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesData.horizontalSpan = 3;
		this.properties.setLayoutData(propertiesData);
		this.properties.setLowerBound(0);
		this.properties.setUpperBound(-1);
		properties.setID(Bpmn2ViewsRepository.Process.Properties.properties_);
		properties.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSupportsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(Bpmn2ViewsRepository.Process.Properties.supports, Bpmn2Messages.ProcessPropertiesEditionPart_SupportsLabel);		 
		this.supports = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSupports(); }
			public void handleEdit(EObject element) { editSupports(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSupports(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSupports(element); }
			public void navigateTo(EObject element) { }
		});
		this.supports.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.supports, Bpmn2ViewsRepository.SWT_KIND));
		this.supports.createControls(parent);
		this.supports.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.supports, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData supportsData = new GridData(GridData.FILL_HORIZONTAL);
		supportsData.horizontalSpan = 3;
		this.supports.setLayoutData(supportsData);
		this.supports.disableMove();
		supports.setID(Bpmn2ViewsRepository.Process.Properties.supports);
		supports.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSupports() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(supports.getInput(), supportsFilters, supportsBusinessFilters,
		"supports", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.supports,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				supports.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSupports(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.supports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		supports.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSupports(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.supports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		supports.refresh();
	}

	/**
	 * 
	 */
	protected void editSupports(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				supports.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createDefinitionalCollaborationRefFlatComboViewer(Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef, Bpmn2Messages.ProcessPropertiesEditionPart_DefinitionalCollaborationRefLabel);
		definitionalCollaborationRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef, Bpmn2ViewsRepository.SWT_KIND));
		definitionalCollaborationRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		definitionalCollaborationRef.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDefinitionalCollaborationRef()));
			}

		});
		GridData definitionalCollaborationRefData = new GridData(GridData.FILL_HORIZONTAL);
		definitionalCollaborationRef.setLayoutData(definitionalCollaborationRefData);
		definitionalCollaborationRef.setID(Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsExecutableCheckbox(Composite parent) {
		isExecutable = new Button(parent, SWT.CHECK);
		isExecutable.setText(getDescription(Bpmn2ViewsRepository.Process.Properties.isExecutable, Bpmn2Messages.ProcessPropertiesEditionPart_IsExecutableLabel));
		isExecutable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.isExecutable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isExecutable.getSelection())));
			}

		});
		GridData isExecutableData = new GridData(GridData.FILL_HORIZONTAL);
		isExecutableData.horizontalSpan = 2;
		isExecutable.setLayoutData(isExecutableData);
		EditingUtils.setID(isExecutable, Bpmn2ViewsRepository.Process.Properties.isExecutable);
		EditingUtils.setEEFtype(isExecutable, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.isExecutable, Bpmn2ViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createResourcesAdvancedTableComposition(Composite parent) {
		this.resources = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Process.Properties.resources, Bpmn2Messages.ProcessPropertiesEditionPart_ResourcesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resources.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resources.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resources.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resources.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourcesFilters) {
			this.resources.addFilter(filter);
		}
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.resources, Bpmn2ViewsRepository.SWT_KIND));
		this.resources.createControls(parent);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourcesData = new GridData(GridData.FILL_HORIZONTAL);
		resourcesData.horizontalSpan = 3;
		this.resources.setLayoutData(resourcesData);
		this.resources.setLowerBound(0);
		this.resources.setUpperBound(-1);
		resources.setID(Bpmn2ViewsRepository.Process.Properties.resources);
		resources.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createArtifactsAdvancedTableComposition(Composite parent) {
		this.artifacts = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Process.Properties.artifacts, Bpmn2Messages.ProcessPropertiesEditionPart_ArtifactsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				artifacts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				artifacts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				artifacts.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.artifacts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				artifacts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.artifactsFilters) {
			this.artifacts.addFilter(filter);
		}
		this.artifacts.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.artifacts, Bpmn2ViewsRepository.SWT_KIND));
		this.artifacts.createControls(parent);
		this.artifacts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.artifacts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData artifactsData = new GridData(GridData.FILL_HORIZONTAL);
		artifactsData.horizontalSpan = 3;
		this.artifacts.setLayoutData(artifactsData);
		this.artifacts.setLowerBound(0);
		this.artifacts.setUpperBound(-1);
		artifacts.setID(Bpmn2ViewsRepository.Process.Properties.artifacts);
		artifacts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCorrelationSubscriptionsAdvancedTableComposition(Composite parent) {
		this.correlationSubscriptions = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions, Bpmn2Messages.ProcessPropertiesEditionPart_CorrelationSubscriptionsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				correlationSubscriptions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				correlationSubscriptions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				correlationSubscriptions.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				correlationSubscriptions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.correlationSubscriptionsFilters) {
			this.correlationSubscriptions.addFilter(filter);
		}
		this.correlationSubscriptions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions, Bpmn2ViewsRepository.SWT_KIND));
		this.correlationSubscriptions.createControls(parent);
		this.correlationSubscriptions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData correlationSubscriptionsData = new GridData(GridData.FILL_HORIZONTAL);
		correlationSubscriptionsData.horizontalSpan = 3;
		this.correlationSubscriptions.setLayoutData(correlationSubscriptionsData);
		this.correlationSubscriptions.setLowerBound(0);
		this.correlationSubscriptions.setUpperBound(-1);
		correlationSubscriptions.setID(Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions);
		correlationSubscriptions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#setId(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initSupportedInterfaceRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSupportedInterfaceRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		supportedInterfaceRefs.setContentProvider(contentProvider);
		supportedInterfaceRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#updateSupportedInterfaceRefs()
	 * 
	 */
	public void updateSupportedInterfaceRefs() {
	supportedInterfaceRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterSupportedInterfaceRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSupportedInterfaceRefs(ViewerFilter filter) {
		supportedInterfaceRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterSupportedInterfaceRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSupportedInterfaceRefs(ViewerFilter filter) {
		supportedInterfaceRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#isContainedInSupportedInterfaceRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInSupportedInterfaceRefsTable(EObject element) {
		return ((ReferencesTableSettings)supportedInterfaceRefs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initIoBinding(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIoBinding(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ioBinding.setContentProvider(contentProvider);
		ioBinding.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#updateIoBinding()
	 * 
	 */
	public void updateIoBinding() {
	ioBinding.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterIoBinding(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIoBinding(ViewerFilter filter) {
		ioBindingFilters.add(filter);
		if (this.ioBinding != null) {
			this.ioBinding.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterIoBinding(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIoBinding(ViewerFilter filter) {
		ioBindingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#isContainedInIoBindingTable(EObject element)
	 * 
	 */
	public boolean isContainedInIoBindingTable(EObject element) {
		return ((ReferencesTableSettings)ioBinding.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initLaneSets(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#updateLaneSets()
	 * 
	 */
	public void updateLaneSets() {
	laneSets.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterLaneSets(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterLaneSets(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLaneSets(ViewerFilter filter) {
		laneSetsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#isContainedInLaneSetsTable(EObject element)
	 * 
	 */
	public boolean isContainedInLaneSetsTable(EObject element) {
		return ((ReferencesTableSettings)laneSets.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#getProcessType()
	 * 
	 */
	public Enumerator getProcessType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) processType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initProcessType(Object input, Enumerator current)
	 */
	public void initProcessType(Object input, Enumerator current) {
		processType.setInput(input);
		processType.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#setProcessType(Enumerator newValue)
	 * 
	 */
	public void setProcessType(Enumerator newValue) {
		processType.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#getIsClosed()
	 * 
	 */
	public Boolean getIsClosed() {
		return Boolean.valueOf(isClosed.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#setIsClosed(Boolean newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initProperties(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#updateProperties()
	 * 
	 */
	public void updateProperties() {
	properties.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterProperties(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter) {
		propertiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#isContainedInPropertiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element) {
		return ((ReferencesTableSettings)properties.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initSupports(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSupports(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		supports.setContentProvider(contentProvider);
		supports.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#updateSupports()
	 * 
	 */
	public void updateSupports() {
	supports.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterSupports(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSupports(ViewerFilter filter) {
		supportsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterSupports(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSupports(ViewerFilter filter) {
		supportsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#isContainedInSupportsTable(EObject element)
	 * 
	 */
	public boolean isContainedInSupportsTable(EObject element) {
		return ((ReferencesTableSettings)supports.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#getDefinitionalCollaborationRef()
	 * 
	 */
	public EObject getDefinitionalCollaborationRef() {
		if (definitionalCollaborationRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) definitionalCollaborationRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initDefinitionalCollaborationRef(EObjectFlatComboSettings)
	 */
	public void initDefinitionalCollaborationRef(EObjectFlatComboSettings settings) {
		definitionalCollaborationRef.setInput(settings);
		if (current != null) {
			definitionalCollaborationRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#setDefinitionalCollaborationRef(EObject newValue)
	 * 
	 */
	public void setDefinitionalCollaborationRef(EObject newValue) {
		if (newValue != null) {
			definitionalCollaborationRef.setSelection(new StructuredSelection(newValue));
		} else {
			definitionalCollaborationRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#setDefinitionalCollaborationRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDefinitionalCollaborationRefButtonMode(ButtonsModeEnum newValue) {
		definitionalCollaborationRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterDefinitionalCollaborationRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDefinitionalCollaborationRef(ViewerFilter filter) {
		definitionalCollaborationRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterDefinitionalCollaborationRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDefinitionalCollaborationRef(ViewerFilter filter) {
		definitionalCollaborationRef.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#getIsExecutable()
	 * 
	 */
	public Boolean getIsExecutable() {
		return Boolean.valueOf(isExecutable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#setIsExecutable(Boolean newValue)
	 * 
	 */
	public void setIsExecutable(Boolean newValue) {
		if (newValue != null) {
			isExecutable.setSelection(newValue.booleanValue());
		} else {
			isExecutable.setSelection(false);
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initResources(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#updateResources()
	 * 
	 */
	public void updateResources() {
	resources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterResources(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter) {
		resourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#isContainedInResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element) {
		return ((ReferencesTableSettings)resources.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initArtifacts(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#updateArtifacts()
	 * 
	 */
	public void updateArtifacts() {
	artifacts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterArtifacts(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterArtifacts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArtifacts(ViewerFilter filter) {
		artifactsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#isContainedInArtifactsTable(EObject element)
	 * 
	 */
	public boolean isContainedInArtifactsTable(EObject element) {
		return ((ReferencesTableSettings)artifacts.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#initCorrelationSubscriptions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCorrelationSubscriptions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		correlationSubscriptions.setContentProvider(contentProvider);
		correlationSubscriptions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#updateCorrelationSubscriptions()
	 * 
	 */
	public void updateCorrelationSubscriptions() {
	correlationSubscriptions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addFilterCorrelationSubscriptions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCorrelationSubscriptions(ViewerFilter filter) {
		correlationSubscriptionsFilters.add(filter);
		if (this.correlationSubscriptions != null) {
			this.correlationSubscriptions.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#addBusinessFilterCorrelationSubscriptions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCorrelationSubscriptions(ViewerFilter filter) {
		correlationSubscriptionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart#isContainedInCorrelationSubscriptionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCorrelationSubscriptionsTable(EObject element) {
		return ((ReferencesTableSettings)correlationSubscriptions.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.Process_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
