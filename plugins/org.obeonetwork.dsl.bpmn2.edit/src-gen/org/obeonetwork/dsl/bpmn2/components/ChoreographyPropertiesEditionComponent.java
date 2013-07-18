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

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.obeonetwork.dsl.bpmn2.Artifact;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Choreography;
import org.obeonetwork.dsl.bpmn2.CorrelationKey;
import org.obeonetwork.dsl.bpmn2.Documentation;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;
import org.obeonetwork.dsl.bpmn2.LaneSet;
import org.obeonetwork.dsl.bpmn2.MessageFlow;
import org.obeonetwork.dsl.bpmn2.MessageFlowAssociation;
import org.obeonetwork.dsl.bpmn2.ParticipantAssociation;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.ChoreographyPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ChoreographyPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for choreographyRef ReferencesTable
	 */
	private ReferencesTableSettings choreographyRefSettings;
	
	/**
	 * Settings for artifacts ReferencesTable
	 */
	protected ReferencesTableSettings artifactsSettings;
	
	/**
	 * Settings for participantAssociations ReferencesTable
	 */
	protected ReferencesTableSettings participantAssociationsSettings;
	
	/**
	 * Settings for messageFlowAssociations ReferencesTable
	 */
	protected ReferencesTableSettings messageFlowAssociationsSettings;
	
	/**
	 * Settings for messageFlows ReferencesTable
	 */
	protected ReferencesTableSettings messageFlowsSettings;
	
	/**
	 * Settings for correlationKeys ReferencesTable
	 */
	protected ReferencesTableSettings correlationKeysSettings;
	
	/**
	 * Settings for laneSets ReferencesTable
	 */
	protected ReferencesTableSettings laneSetsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ChoreographyPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject choreography, String editing_mode) {
		super(editingContext, choreography, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.Choreography.class;
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
			final Choreography choreography = (Choreography)elt;
			final ChoreographyPropertiesEditionPart basePart = (ChoreographyPropertiesEditionPart)editingPart;
			// init values
			if (choreography.getId() != null && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, choreography.getId()));
			
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.extensionDefinitions)) {
				extensionDefinitionsSettings = new ReferencesTableSettings(choreography, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions());
				basePart.initExtensionDefinitions(extensionDefinitionsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.extensionValues)) {
				extensionValuesSettings = new ReferencesTableSettings(choreography, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues());
				basePart.initExtensionValues(extensionValuesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.documentation)) {
				documentationSettings = new ReferencesTableSettings(choreography, Bpmn2Package.eINSTANCE.getBaseElement_Documentation());
				basePart.initDocumentation(documentationSettings);
			}
			if (choreography.getName() != null && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, choreography.getName()));
			
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.isClosed)) {
				basePart.setIsClosed(choreography.isIsClosed());
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.choreographyRef)) {
				choreographyRefSettings = new ReferencesTableSettings(choreography, Bpmn2Package.eINSTANCE.getCollaboration_ChoreographyRef());
				basePart.initChoreographyRef(choreographyRefSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.artifacts)) {
				artifactsSettings = new ReferencesTableSettings(choreography, Bpmn2Package.eINSTANCE.getCollaboration_Artifacts());
				basePart.initArtifacts(artifactsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.participantAssociations)) {
				participantAssociationsSettings = new ReferencesTableSettings(choreography, Bpmn2Package.eINSTANCE.getCollaboration_ParticipantAssociations());
				basePart.initParticipantAssociations(participantAssociationsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.messageFlowAssociations)) {
				messageFlowAssociationsSettings = new ReferencesTableSettings(choreography, Bpmn2Package.eINSTANCE.getCollaboration_MessageFlowAssociations());
				basePart.initMessageFlowAssociations(messageFlowAssociationsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.messageFlows)) {
				messageFlowsSettings = new ReferencesTableSettings(choreography, Bpmn2Package.eINSTANCE.getCollaboration_MessageFlows());
				basePart.initMessageFlows(messageFlowsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.correlationKeys)) {
				correlationKeysSettings = new ReferencesTableSettings(choreography, Bpmn2Package.eINSTANCE.getCollaboration_CorrelationKeys());
				basePart.initCorrelationKeys(correlationKeysSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.laneSets)) {
				laneSetsSettings = new ReferencesTableSettings(choreography, Bpmn2Package.eINSTANCE.getFlowElementsContainer_LaneSets());
				basePart.initLaneSets(laneSetsSettings);
			}
			// init filters
			
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.extensionDefinitions)) {
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
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.extensionValues)) {
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
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.documentation)) {
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
			
			
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.choreographyRef)) {
				basePart.addFilterToChoreographyRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInChoreographyRefTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToChoreographyRef(new EObjectFilter(Bpmn2Package.Literals.CHOREOGRAPHY));
				// Start of user code for additional businessfilters for choreographyRef
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.artifacts)) {
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
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.participantAssociations)) {
				basePart.addFilterToParticipantAssociations(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ParticipantAssociation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for participantAssociations
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.messageFlowAssociations)) {
				basePart.addFilterToMessageFlowAssociations(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MessageFlowAssociation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for messageFlowAssociations
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.messageFlows)) {
				basePart.addFilterToMessageFlows(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MessageFlow); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for messageFlows
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.correlationKeys)) {
				basePart.addFilterToCorrelationKeys(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof CorrelationKey); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for correlationKeys
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Choreography.Properties.laneSets)) {
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
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.id) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Id();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.extensionDefinitions) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.extensionValues) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.documentation) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Documentation();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.name) {
			return Bpmn2Package.eINSTANCE.getCollaboration_Name();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.isClosed) {
			return Bpmn2Package.eINSTANCE.getCollaboration_IsClosed();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.choreographyRef) {
			return Bpmn2Package.eINSTANCE.getCollaboration_ChoreographyRef();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.artifacts) {
			return Bpmn2Package.eINSTANCE.getCollaboration_Artifacts();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.participantAssociations) {
			return Bpmn2Package.eINSTANCE.getCollaboration_ParticipantAssociations();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.messageFlowAssociations) {
			return Bpmn2Package.eINSTANCE.getCollaboration_MessageFlowAssociations();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.messageFlows) {
			return Bpmn2Package.eINSTANCE.getCollaboration_MessageFlows();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.correlationKeys) {
			return Bpmn2Package.eINSTANCE.getCollaboration_CorrelationKeys();
		}
		if (editorKey == Bpmn2ViewsRepository.Choreography.Properties.laneSets) {
			return Bpmn2Package.eINSTANCE.getFlowElementsContainer_LaneSets();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Choreography choreography = (Choreography)semanticObject;
		if (Bpmn2ViewsRepository.Choreography.Properties.id == event.getAffectedEditor()) {
			choreography.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Choreography.Properties.extensionDefinitions == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.Choreography.Properties.extensionValues == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.Choreography.Properties.documentation == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.Choreography.Properties.name == event.getAffectedEditor()) {
			choreography.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Choreography.Properties.isClosed == event.getAffectedEditor()) {
			choreography.setIsClosed((Boolean)event.getNewValue());
		}
		if (Bpmn2ViewsRepository.Choreography.Properties.choreographyRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Choreography) {
					choreographyRefSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				choreographyRefSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				choreographyRefSettings.move(event.getNewIndex(), (Choreography) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Choreography.Properties.artifacts == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.Choreography.Properties.participantAssociations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, participantAssociationsSettings, editingContext.getAdapterFactory());
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
				participantAssociationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				participantAssociationsSettings.move(event.getNewIndex(), (ParticipantAssociation) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Choreography.Properties.messageFlowAssociations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, messageFlowAssociationsSettings, editingContext.getAdapterFactory());
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
				messageFlowAssociationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				messageFlowAssociationsSettings.move(event.getNewIndex(), (MessageFlowAssociation) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Choreography.Properties.messageFlows == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, messageFlowsSettings, editingContext.getAdapterFactory());
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
				messageFlowsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				messageFlowsSettings.move(event.getNewIndex(), (MessageFlow) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Choreography.Properties.correlationKeys == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, correlationKeysSettings, editingContext.getAdapterFactory());
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
				correlationKeysSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				correlationKeysSettings.move(event.getNewIndex(), (CorrelationKey) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Choreography.Properties.laneSets == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ChoreographyPropertiesEditionPart basePart = (ChoreographyPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getBaseElement_Id().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.extensionDefinitions))
				basePart.updateExtensionDefinitions();
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.extensionValues))
				basePart.updateExtensionValues();
			if (Bpmn2Package.eINSTANCE.getBaseElement_Documentation().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.documentation))
				basePart.updateDocumentation();
			if (Bpmn2Package.eINSTANCE.getCollaboration_Name().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getCollaboration_IsClosed().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.isClosed))
				basePart.setIsClosed((Boolean)msg.getNewValue());
			
			if (Bpmn2Package.eINSTANCE.getCollaboration_ChoreographyRef().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.choreographyRef))
				basePart.updateChoreographyRef();
			if (Bpmn2Package.eINSTANCE.getCollaboration_Artifacts().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.artifacts))
				basePart.updateArtifacts();
			if (Bpmn2Package.eINSTANCE.getCollaboration_ParticipantAssociations().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.participantAssociations))
				basePart.updateParticipantAssociations();
			if (Bpmn2Package.eINSTANCE.getCollaboration_MessageFlowAssociations().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.messageFlowAssociations))
				basePart.updateMessageFlowAssociations();
			if (Bpmn2Package.eINSTANCE.getCollaboration_MessageFlows().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.messageFlows))
				basePart.updateMessageFlows();
			if (Bpmn2Package.eINSTANCE.getCollaboration_CorrelationKeys().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.correlationKeys))
				basePart.updateCorrelationKeys();
			if (Bpmn2Package.eINSTANCE.getFlowElementsContainer_LaneSets().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Choreography.Properties.laneSets))
				basePart.updateLaneSets();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Bpmn2ViewsRepository.Choreography.Properties.id || key == Bpmn2ViewsRepository.Choreography.Properties.isClosed;
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
				if (Bpmn2ViewsRepository.Choreography.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Choreography.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getCollaboration_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getCollaboration_Name().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Choreography.Properties.isClosed == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getCollaboration_IsClosed().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getCollaboration_IsClosed().getEAttributeType(), newValue);
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
