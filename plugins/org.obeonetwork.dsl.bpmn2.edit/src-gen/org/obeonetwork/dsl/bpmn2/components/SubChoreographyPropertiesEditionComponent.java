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
import org.obeonetwork.dsl.bpmn2.CategoryValue;
import org.obeonetwork.dsl.bpmn2.ChoreographyLoopType;
import org.obeonetwork.dsl.bpmn2.CorrelationKey;
import org.obeonetwork.dsl.bpmn2.Documentation;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;
import org.obeonetwork.dsl.bpmn2.LaneSet;
import org.obeonetwork.dsl.bpmn2.Participant;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;
import org.obeonetwork.dsl.bpmn2.SubChoreography;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.SubChoreographyPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class SubChoreographyPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for categoryValueRef ReferencesTable
	 */
	private ReferencesTableSettings categoryValueRefSettings;
	
	/**
	 * Settings for outgoing ReferencesTable
	 */
	private ReferencesTableSettings outgoingSettings;
	
	/**
	 * Settings for incoming ReferencesTable
	 */
	private ReferencesTableSettings incomingSettings;
	
	/**
	 * Settings for participantRefs ReferencesTable
	 */
	private ReferencesTableSettings participantRefsSettings;
	
	/**
	 * Settings for initiatingParticipantRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings initiatingParticipantRefSettings;
	
	/**
	 * Settings for correlationKeys ReferencesTable
	 */
	protected ReferencesTableSettings correlationKeysSettings;
	
	/**
	 * Settings for laneSets ReferencesTable
	 */
	protected ReferencesTableSettings laneSetsSettings;
	
	/**
	 * Settings for artifacts ReferencesTable
	 */
	protected ReferencesTableSettings artifactsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SubChoreographyPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject subChoreography, String editing_mode) {
		super(editingContext, subChoreography, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.SubChoreography.class;
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
			final SubChoreography subChoreography = (SubChoreography)elt;
			final SubChoreographyPropertiesEditionPart basePart = (SubChoreographyPropertiesEditionPart)editingPart;
			// init values
			if (subChoreography.getId() != null && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, subChoreography.getId()));
			
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.extensionDefinitions)) {
				extensionDefinitionsSettings = new ReferencesTableSettings(subChoreography, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions());
				basePart.initExtensionDefinitions(extensionDefinitionsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.extensionValues)) {
				extensionValuesSettings = new ReferencesTableSettings(subChoreography, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues());
				basePart.initExtensionValues(extensionValuesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.documentation)) {
				documentationSettings = new ReferencesTableSettings(subChoreography, Bpmn2Package.eINSTANCE.getBaseElement_Documentation());
				basePart.initDocumentation(documentationSettings);
			}
			if (subChoreography.getName() != null && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, subChoreography.getName()));
			
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.categoryValueRef)) {
				categoryValueRefSettings = new ReferencesTableSettings(subChoreography, Bpmn2Package.eINSTANCE.getFlowElement_CategoryValueRef());
				basePart.initCategoryValueRef(categoryValueRefSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.outgoing)) {
				outgoingSettings = new ReferencesTableSettings(subChoreography, Bpmn2Package.eINSTANCE.getFlowNode_Outgoing());
				basePart.initOutgoing(outgoingSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.incoming)) {
				incomingSettings = new ReferencesTableSettings(subChoreography, Bpmn2Package.eINSTANCE.getFlowNode_Incoming());
				basePart.initIncoming(incomingSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.participantRefs)) {
				participantRefsSettings = new ReferencesTableSettings(subChoreography, Bpmn2Package.eINSTANCE.getChoreographyActivity_ParticipantRefs());
				basePart.initParticipantRefs(participantRefsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.initiatingParticipantRef)) {
				// init part
				initiatingParticipantRefSettings = new EObjectFlatComboSettings(subChoreography, Bpmn2Package.eINSTANCE.getChoreographyActivity_InitiatingParticipantRef());
				basePart.initInitiatingParticipantRef(initiatingParticipantRefSettings);
				// set the button mode
				basePart.setInitiatingParticipantRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.correlationKeys)) {
				correlationKeysSettings = new ReferencesTableSettings(subChoreography, Bpmn2Package.eINSTANCE.getChoreographyActivity_CorrelationKeys());
				basePart.initCorrelationKeys(correlationKeysSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.loopType)) {
				basePart.initLoopType(EEFUtils.choiceOfValues(subChoreography, Bpmn2Package.eINSTANCE.getChoreographyActivity_LoopType()), subChoreography.getLoopType());
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.laneSets)) {
				laneSetsSettings = new ReferencesTableSettings(subChoreography, Bpmn2Package.eINSTANCE.getFlowElementsContainer_LaneSets());
				basePart.initLaneSets(laneSetsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.artifacts)) {
				artifactsSettings = new ReferencesTableSettings(subChoreography, Bpmn2Package.eINSTANCE.getSubChoreography_Artifacts());
				basePart.initArtifacts(artifactsSettings);
			}
			// init filters
			
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.extensionDefinitions)) {
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
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.extensionValues)) {
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
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.documentation)) {
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
			
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.categoryValueRef)) {
				basePart.addFilterToCategoryValueRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInCategoryValueRefTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToCategoryValueRef(new EObjectFilter(Bpmn2Package.Literals.CATEGORY_VALUE));
				// Start of user code for additional businessfilters for categoryValueRef
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.outgoing)) {
				basePart.addFilterToOutgoing(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInOutgoingTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToOutgoing(new EObjectFilter(Bpmn2Package.Literals.SEQUENCE_FLOW));
				// Start of user code for additional businessfilters for outgoing
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.incoming)) {
				basePart.addFilterToIncoming(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInIncomingTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToIncoming(new EObjectFilter(Bpmn2Package.Literals.SEQUENCE_FLOW));
				// Start of user code for additional businessfilters for incoming
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.participantRefs)) {
				basePart.addFilterToParticipantRefs(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInParticipantRefsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToParticipantRefs(new EObjectFilter(Bpmn2Package.Literals.PARTICIPANT));
				// Start of user code for additional businessfilters for participantRefs
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.initiatingParticipantRef)) {
				basePart.addFilterToInitiatingParticipantRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Participant); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for initiatingParticipantRef
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.correlationKeys)) {
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
			
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.laneSets)) {
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
			if (isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.artifacts)) {
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
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.id) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Id();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.extensionDefinitions) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.extensionValues) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.documentation) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Documentation();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.name) {
			return Bpmn2Package.eINSTANCE.getFlowElement_Name();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.categoryValueRef) {
			return Bpmn2Package.eINSTANCE.getFlowElement_CategoryValueRef();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.outgoing) {
			return Bpmn2Package.eINSTANCE.getFlowNode_Outgoing();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.incoming) {
			return Bpmn2Package.eINSTANCE.getFlowNode_Incoming();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.participantRefs) {
			return Bpmn2Package.eINSTANCE.getChoreographyActivity_ParticipantRefs();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.initiatingParticipantRef) {
			return Bpmn2Package.eINSTANCE.getChoreographyActivity_InitiatingParticipantRef();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.correlationKeys) {
			return Bpmn2Package.eINSTANCE.getChoreographyActivity_CorrelationKeys();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.loopType) {
			return Bpmn2Package.eINSTANCE.getChoreographyActivity_LoopType();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.laneSets) {
			return Bpmn2Package.eINSTANCE.getFlowElementsContainer_LaneSets();
		}
		if (editorKey == Bpmn2ViewsRepository.SubChoreography.Properties.artifacts) {
			return Bpmn2Package.eINSTANCE.getSubChoreography_Artifacts();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SubChoreography subChoreography = (SubChoreography)semanticObject;
		if (Bpmn2ViewsRepository.SubChoreography.Properties.id == event.getAffectedEditor()) {
			subChoreography.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.SubChoreography.Properties.extensionDefinitions == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.SubChoreography.Properties.extensionValues == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.SubChoreography.Properties.documentation == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.SubChoreography.Properties.name == event.getAffectedEditor()) {
			subChoreography.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.SubChoreography.Properties.categoryValueRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof CategoryValue) {
					categoryValueRefSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				categoryValueRefSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				categoryValueRefSettings.move(event.getNewIndex(), (CategoryValue) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.SubChoreography.Properties.outgoing == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SequenceFlow) {
					outgoingSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outgoingSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outgoingSettings.move(event.getNewIndex(), (SequenceFlow) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.SubChoreography.Properties.incoming == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SequenceFlow) {
					incomingSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				incomingSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				incomingSettings.move(event.getNewIndex(), (SequenceFlow) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.SubChoreography.Properties.participantRefs == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Participant) {
					participantRefsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				participantRefsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				participantRefsSettings.move(event.getNewIndex(), (Participant) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.SubChoreography.Properties.initiatingParticipantRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				initiatingParticipantRefSettings.setToReference((Participant)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Participant eObject = Bpmn2Factory.eINSTANCE.createParticipant();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				initiatingParticipantRefSettings.setToReference(eObject);
			}
		}
		if (Bpmn2ViewsRepository.SubChoreography.Properties.correlationKeys == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.SubChoreography.Properties.loopType == event.getAffectedEditor()) {
			subChoreography.setLoopType((ChoreographyLoopType)event.getNewValue());
		}
		if (Bpmn2ViewsRepository.SubChoreography.Properties.laneSets == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.SubChoreography.Properties.artifacts == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			SubChoreographyPropertiesEditionPart basePart = (SubChoreographyPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getBaseElement_Id().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.extensionDefinitions))
				basePart.updateExtensionDefinitions();
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.extensionValues))
				basePart.updateExtensionValues();
			if (Bpmn2Package.eINSTANCE.getBaseElement_Documentation().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.documentation))
				basePart.updateDocumentation();
			if (Bpmn2Package.eINSTANCE.getFlowElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getFlowElement_CategoryValueRef().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.categoryValueRef))
				basePart.updateCategoryValueRef();
			if (Bpmn2Package.eINSTANCE.getFlowNode_Outgoing().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.outgoing))
				basePart.updateOutgoing();
			if (Bpmn2Package.eINSTANCE.getFlowNode_Incoming().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.incoming))
				basePart.updateIncoming();
			if (Bpmn2Package.eINSTANCE.getChoreographyActivity_ParticipantRefs().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.participantRefs))
				basePart.updateParticipantRefs();
			if (Bpmn2Package.eINSTANCE.getChoreographyActivity_InitiatingParticipantRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.initiatingParticipantRef))
				basePart.setInitiatingParticipantRef((EObject)msg.getNewValue());
			if (Bpmn2Package.eINSTANCE.getChoreographyActivity_CorrelationKeys().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.correlationKeys))
				basePart.updateCorrelationKeys();
			if (Bpmn2Package.eINSTANCE.getChoreographyActivity_LoopType().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.loopType))
				basePart.setLoopType((ChoreographyLoopType)msg.getNewValue());
			
			if (Bpmn2Package.eINSTANCE.getFlowElementsContainer_LaneSets().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.laneSets))
				basePart.updateLaneSets();
			if (Bpmn2Package.eINSTANCE.getSubChoreography_Artifacts().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.SubChoreography.Properties.artifacts))
				basePart.updateArtifacts();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Bpmn2ViewsRepository.SubChoreography.Properties.id || key == Bpmn2ViewsRepository.SubChoreography.Properties.loopType;
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
				if (Bpmn2ViewsRepository.SubChoreography.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.SubChoreography.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getFlowElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getFlowElement_Name().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.SubChoreography.Properties.loopType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getChoreographyActivity_LoopType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getChoreographyActivity_LoopType().getEAttributeType(), newValue);
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
