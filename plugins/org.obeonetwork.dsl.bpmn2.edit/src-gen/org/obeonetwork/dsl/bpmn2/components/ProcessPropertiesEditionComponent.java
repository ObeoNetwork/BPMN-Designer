/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.obeonetwork.dsl.bpmn2.Artifact;
import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Collaboration;
import org.obeonetwork.dsl.bpmn2.CorrelationSubscription;
import org.obeonetwork.dsl.bpmn2.Documentation;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;
import org.obeonetwork.dsl.bpmn2.InputOutputBinding;
import org.obeonetwork.dsl.bpmn2.Interface;
import org.obeonetwork.dsl.bpmn2.LaneSet;
import org.obeonetwork.dsl.bpmn2.ProcessType;
import org.obeonetwork.dsl.bpmn2.Property;
import org.obeonetwork.dsl.bpmn2.ResourceRole;
import org.obeonetwork.dsl.bpmn2.Process;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.ProcessPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ProcessPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for extensionDefinitions ReferencesTable
	 */
	private ReferencesTableSettings extensionDefinitionsSettings;
	
	/**
	 * Settings for extensionValues ReferencesTable
	 */
	protected ReferencesTableSettings extensionValuesSettings;
	
	/**
	 * Settings for documentation ReferencesTable
	 */
	protected ReferencesTableSettings documentationSettings;
	
	/**
	 * Settings for supportedInterfaceRefs ReferencesTable
	 */
	private ReferencesTableSettings supportedInterfaceRefsSettings;
	
	/**
	 * Settings for ioBinding ReferencesTable
	 */
	protected ReferencesTableSettings ioBindingSettings;
	
	/**
	 * Settings for laneSets ReferencesTable
	 */
	protected ReferencesTableSettings laneSetsSettings;
	
	/**
	 * Settings for properties ReferencesTable
	 */
	protected ReferencesTableSettings propertiesSettings;
	
	/**
	 * Settings for supports ReferencesTable
	 */
	private ReferencesTableSettings supportsSettings;
	
	/**
	 * Settings for definitionalCollaborationRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings definitionalCollaborationRefSettings;
	
	/**
	 * Settings for resources ReferencesTable
	 */
	protected ReferencesTableSettings resourcesSettings;
	
	/**
	 * Settings for artifacts ReferencesTable
	 */
	protected ReferencesTableSettings artifactsSettings;
	
	/**
	 * Settings for correlationSubscriptions ReferencesTable
	 */
	protected ReferencesTableSettings correlationSubscriptionsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ProcessPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject process, String editing_mode) {
		super(editingContext, process, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.Process.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final Process process = (Process)elt;
			final ProcessPropertiesEditionPart basePart = (ProcessPropertiesEditionPart)editingPart;
			// init values
			if (process.getId() != null && isAccessible(Bpmn2ViewsRepository.Process.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, process.getId()));
			
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.extensionDefinitions)) {
				extensionDefinitionsSettings = new ReferencesTableSettings(process, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions());
				basePart.initExtensionDefinitions(extensionDefinitionsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.extensionValues)) {
				extensionValuesSettings = new ReferencesTableSettings(process, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues());
				basePart.initExtensionValues(extensionValuesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.documentation)) {
				documentationSettings = new ReferencesTableSettings(process, Bpmn2Package.eINSTANCE.getBaseElement_Documentation());
				basePart.initDocumentation(documentationSettings);
			}
			if (process.getName() != null && isAccessible(Bpmn2ViewsRepository.Process.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, process.getName()));
			
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs)) {
				supportedInterfaceRefsSettings = new ReferencesTableSettings(process, Bpmn2Package.eINSTANCE.getCallableElement_SupportedInterfaceRefs());
				basePart.initSupportedInterfaceRefs(supportedInterfaceRefsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.ioBinding)) {
				ioBindingSettings = new ReferencesTableSettings(process, Bpmn2Package.eINSTANCE.getCallableElement_IoBinding());
				basePart.initIoBinding(ioBindingSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.laneSets)) {
				laneSetsSettings = new ReferencesTableSettings(process, Bpmn2Package.eINSTANCE.getFlowElementsContainer_LaneSets());
				basePart.initLaneSets(laneSetsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.processType)) {
				basePart.initProcessType(EEFUtils.choiceOfValues(process, Bpmn2Package.eINSTANCE.getProcess_ProcessType()), process.getProcessType());
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.isClosed)) {
				basePart.setIsClosed(process.isIsClosed());
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.properties_)) {
				propertiesSettings = new ReferencesTableSettings(process, Bpmn2Package.eINSTANCE.getProcess_Properties());
				basePart.initProperties(propertiesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.supports)) {
				supportsSettings = new ReferencesTableSettings(process, Bpmn2Package.eINSTANCE.getProcess_Supports());
				basePart.initSupports(supportsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef)) {
				// init part
				definitionalCollaborationRefSettings = new EObjectFlatComboSettings(process, Bpmn2Package.eINSTANCE.getProcess_DefinitionalCollaborationRef());
				basePart.initDefinitionalCollaborationRef(definitionalCollaborationRefSettings);
				// set the button mode
				basePart.setDefinitionalCollaborationRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.isExecutable)) {
				basePart.setIsExecutable(process.isIsExecutable());
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.resources)) {
				resourcesSettings = new ReferencesTableSettings(process, Bpmn2Package.eINSTANCE.getProcess_Resources());
				basePart.initResources(resourcesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.artifacts)) {
				artifactsSettings = new ReferencesTableSettings(process, Bpmn2Package.eINSTANCE.getProcess_Artifacts());
				basePart.initArtifacts(artifactsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions)) {
				correlationSubscriptionsSettings = new ReferencesTableSettings(process, Bpmn2Package.eINSTANCE.getProcess_CorrelationSubscriptions());
				basePart.initCorrelationSubscriptions(correlationSubscriptionsSettings);
			}
			// init filters
			
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.extensionDefinitions)) {
				basePart.addFilterToExtensionDefinitions(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInExtensionDefinitionsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToExtensionDefinitions(new EObjectFilter(Bpmn2Package.Literals.EXTENSION_DEFINITION));
				// Start of user code for additional businessfilters for extensionDefinitions
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.extensionValues)) {
				basePart.addFilterToExtensionValues(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ExtensionAttributeValue); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for extensionValues
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.documentation)) {
				basePart.addFilterToDocumentation(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Documentation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for documentation
				// End of user code
			}
			
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs)) {
				basePart.addFilterToSupportedInterfaceRefs(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSupportedInterfaceRefsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToSupportedInterfaceRefs(new EObjectFilter(Bpmn2Package.Literals.INTERFACE));
				// Start of user code for additional businessfilters for supportedInterfaceRefs
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.ioBinding)) {
				basePart.addFilterToIoBinding(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof InputOutputBinding); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for ioBinding
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.laneSets)) {
				basePart.addFilterToLaneSets(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof LaneSet); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for laneSets
				// End of user code
			}
			
			
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.properties_)) {
				basePart.addFilterToProperties(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Property); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for properties
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.supports)) {
				basePart.addFilterToSupports(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSupportsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToSupports(new EObjectFilter(Bpmn2Package.Literals.PROCESS));
				// Start of user code for additional businessfilters for supports
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef)) {
				basePart.addFilterToDefinitionalCollaborationRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Collaboration); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for definitionalCollaborationRef
				// End of user code
			}
			
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.resources)) {
				basePart.addFilterToResources(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ResourceRole); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for resources
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.artifacts)) {
				basePart.addFilterToArtifacts(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Artifact); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for artifacts
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions)) {
				basePart.addFilterToCorrelationSubscriptions(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof CorrelationSubscription); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for correlationSubscriptions
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}




















	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.id) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Id();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.extensionDefinitions) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.extensionValues) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.documentation) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Documentation();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.name) {
			return Bpmn2Package.eINSTANCE.getCallableElement_Name();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs) {
			return Bpmn2Package.eINSTANCE.getCallableElement_SupportedInterfaceRefs();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.ioBinding) {
			return Bpmn2Package.eINSTANCE.getCallableElement_IoBinding();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.laneSets) {
			return Bpmn2Package.eINSTANCE.getFlowElementsContainer_LaneSets();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.processType) {
			return Bpmn2Package.eINSTANCE.getProcess_ProcessType();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.isClosed) {
			return Bpmn2Package.eINSTANCE.getProcess_IsClosed();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.properties_) {
			return Bpmn2Package.eINSTANCE.getProcess_Properties();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.supports) {
			return Bpmn2Package.eINSTANCE.getProcess_Supports();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef) {
			return Bpmn2Package.eINSTANCE.getProcess_DefinitionalCollaborationRef();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.isExecutable) {
			return Bpmn2Package.eINSTANCE.getProcess_IsExecutable();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.resources) {
			return Bpmn2Package.eINSTANCE.getProcess_Resources();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.artifacts) {
			return Bpmn2Package.eINSTANCE.getProcess_Artifacts();
		}
		if (editorKey == Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions) {
			return Bpmn2Package.eINSTANCE.getProcess_CorrelationSubscriptions();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Process process = (Process)semanticObject;
		if (Bpmn2ViewsRepository.Process.Properties.id == event.getAffectedEditor()) {
			process.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Process.Properties.extensionDefinitions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ExtensionDefinition) {
					extensionDefinitionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				extensionDefinitionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				extensionDefinitionsSettings.move(event.getNewIndex(), (ExtensionDefinition) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Process.Properties.extensionValues == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, extensionValuesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				extensionValuesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				extensionValuesSettings.move(event.getNewIndex(), (ExtensionAttributeValue) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Process.Properties.documentation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, documentationSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				documentationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				documentationSettings.move(event.getNewIndex(), (Documentation) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Process.Properties.name == event.getAffectedEditor()) {
			process.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Interface) {
					supportedInterfaceRefsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				supportedInterfaceRefsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				supportedInterfaceRefsSettings.move(event.getNewIndex(), (Interface) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Process.Properties.ioBinding == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ioBindingSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ioBindingSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ioBindingSettings.move(event.getNewIndex(), (InputOutputBinding) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Process.Properties.laneSets == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, laneSetsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				laneSetsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				laneSetsSettings.move(event.getNewIndex(), (LaneSet) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Process.Properties.processType == event.getAffectedEditor()) {
			process.setProcessType((ProcessType)event.getNewValue());
		}
		if (Bpmn2ViewsRepository.Process.Properties.isClosed == event.getAffectedEditor()) {
			process.setIsClosed((Boolean)event.getNewValue());
		}
		if (Bpmn2ViewsRepository.Process.Properties.properties_ == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, propertiesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				propertiesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				propertiesSettings.move(event.getNewIndex(), (Property) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Process.Properties.supports == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Process) {
					supportsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				supportsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				supportsSettings.move(event.getNewIndex(), (Process) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				definitionalCollaborationRefSettings.setToReference((Collaboration)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Collaboration eObject = Bpmn2Factory.eINSTANCE.createCollaboration();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				definitionalCollaborationRefSettings.setToReference(eObject);
			}
		}
		if (Bpmn2ViewsRepository.Process.Properties.isExecutable == event.getAffectedEditor()) {
			process.setIsExecutable((Boolean)event.getNewValue());
		}
		if (Bpmn2ViewsRepository.Process.Properties.resources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resourcesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				resourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resourcesSettings.move(event.getNewIndex(), (ResourceRole) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Process.Properties.artifacts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, artifactsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				artifactsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				artifactsSettings.move(event.getNewIndex(), (Artifact) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, correlationSubscriptionsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				correlationSubscriptionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				correlationSubscriptionsSettings.move(event.getNewIndex(), (CorrelationSubscription) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ProcessPropertiesEditionPart basePart = (ProcessPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getBaseElement_Id().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Process.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.Process.Properties.extensionDefinitions))
				basePart.updateExtensionDefinitions();
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Process.Properties.extensionValues))
				basePart.updateExtensionValues();
			if (Bpmn2Package.eINSTANCE.getBaseElement_Documentation().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Process.Properties.documentation))
				basePart.updateDocumentation();
			if (Bpmn2Package.eINSTANCE.getCallableElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Process.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getCallableElement_SupportedInterfaceRefs().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.Process.Properties.supportedInterfaceRefs))
				basePart.updateSupportedInterfaceRefs();
			if (Bpmn2Package.eINSTANCE.getCallableElement_IoBinding().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Process.Properties.ioBinding))
				basePart.updateIoBinding();
			if (Bpmn2Package.eINSTANCE.getFlowElementsContainer_LaneSets().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Process.Properties.laneSets))
				basePart.updateLaneSets();
			if (Bpmn2Package.eINSTANCE.getProcess_ProcessType().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Process.Properties.processType))
				basePart.setProcessType((ProcessType)msg.getNewValue());
			
			if (Bpmn2Package.eINSTANCE.getProcess_IsClosed().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Process.Properties.isClosed))
				basePart.setIsClosed((Boolean)msg.getNewValue());
			
			if (Bpmn2Package.eINSTANCE.getProcess_Properties().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Process.Properties.properties_))
				basePart.updateProperties();
			if (Bpmn2Package.eINSTANCE.getProcess_Supports().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.Process.Properties.supports))
				basePart.updateSupports();
			if (Bpmn2Package.eINSTANCE.getProcess_DefinitionalCollaborationRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Process.Properties.definitionalCollaborationRef))
				basePart.setDefinitionalCollaborationRef((EObject)msg.getNewValue());
			if (Bpmn2Package.eINSTANCE.getProcess_IsExecutable().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Process.Properties.isExecutable))
				basePart.setIsExecutable((Boolean)msg.getNewValue());
			
			if (Bpmn2Package.eINSTANCE.getProcess_Resources().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Process.Properties.resources))
				basePart.updateResources();
			if (Bpmn2Package.eINSTANCE.getProcess_Artifacts().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Process.Properties.artifacts))
				basePart.updateArtifacts();
			if (Bpmn2Package.eINSTANCE.getProcess_CorrelationSubscriptions().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Process.Properties.correlationSubscriptions))
				basePart.updateCorrelationSubscriptions();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Bpmn2ViewsRepository.Process.Properties.id || key == Bpmn2ViewsRepository.Process.Properties.processType || key == Bpmn2ViewsRepository.Process.Properties.isClosed || key == Bpmn2ViewsRepository.Process.Properties.isExecutable;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (Bpmn2ViewsRepository.Process.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Process.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getCallableElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getCallableElement_Name().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Process.Properties.processType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getProcess_ProcessType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getProcess_ProcessType().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Process.Properties.isClosed == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getProcess_IsClosed().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getProcess_IsClosed().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Process.Properties.isExecutable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getProcess_IsExecutable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getProcess_IsExecutable().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
