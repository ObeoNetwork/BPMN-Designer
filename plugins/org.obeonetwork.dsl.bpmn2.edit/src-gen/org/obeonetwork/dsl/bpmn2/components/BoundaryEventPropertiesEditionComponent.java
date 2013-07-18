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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.obeonetwork.dsl.bpmn2.Activity;
import org.obeonetwork.dsl.bpmn2.BoundaryEvent;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.CategoryValue;
import org.obeonetwork.dsl.bpmn2.DataOutputAssociation;
import org.obeonetwork.dsl.bpmn2.Documentation;
import org.obeonetwork.dsl.bpmn2.EventDefinition;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;
import org.obeonetwork.dsl.bpmn2.Property;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;

import org.obeonetwork.dsl.bpmn2.parts.BoundaryEventPropertiesEditionPart;
import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BoundaryEventPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for properties ReferencesTable
	 */
	protected ReferencesTableSettings propertiesSettings;
	
	/**
	 * Settings for eventDefinitionRefs ReferencesTable
	 */
	private ReferencesTableSettings eventDefinitionRefsSettings;
	
	/**
	 * Settings for dataOutputAssociation ReferencesTable
	 */
	protected ReferencesTableSettings dataOutputAssociationSettings;
	
	/**
	 * Settings for eventDefinitions ReferencesTable
	 */
	protected ReferencesTableSettings eventDefinitionsSettings;
	
	/**
	 * Settings for attachedToRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings attachedToRefSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BoundaryEventPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject boundaryEvent, String editing_mode) {
		super(editingContext, boundaryEvent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.BoundaryEvent.class;
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
			final BoundaryEvent boundaryEvent = (BoundaryEvent)elt;
			final BoundaryEventPropertiesEditionPart basePart = (BoundaryEventPropertiesEditionPart)editingPart;
			// init values
			if (boundaryEvent.getId() != null && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, boundaryEvent.getId()));
			
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.extensionDefinitions)) {
				extensionDefinitionsSettings = new ReferencesTableSettings(boundaryEvent, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions());
				basePart.initExtensionDefinitions(extensionDefinitionsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.extensionValues)) {
				extensionValuesSettings = new ReferencesTableSettings(boundaryEvent, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues());
				basePart.initExtensionValues(extensionValuesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.documentation)) {
				documentationSettings = new ReferencesTableSettings(boundaryEvent, Bpmn2Package.eINSTANCE.getBaseElement_Documentation());
				basePart.initDocumentation(documentationSettings);
			}
			if (boundaryEvent.getName() != null && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, boundaryEvent.getName()));
			
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.categoryValueRef)) {
				categoryValueRefSettings = new ReferencesTableSettings(boundaryEvent, Bpmn2Package.eINSTANCE.getFlowElement_CategoryValueRef());
				basePart.initCategoryValueRef(categoryValueRefSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.outgoing)) {
				outgoingSettings = new ReferencesTableSettings(boundaryEvent, Bpmn2Package.eINSTANCE.getFlowNode_Outgoing());
				basePart.initOutgoing(outgoingSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.incoming)) {
				incomingSettings = new ReferencesTableSettings(boundaryEvent, Bpmn2Package.eINSTANCE.getFlowNode_Incoming());
				basePart.initIncoming(incomingSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.properties_)) {
				propertiesSettings = new ReferencesTableSettings(boundaryEvent, Bpmn2Package.eINSTANCE.getEvent_Properties());
				basePart.initProperties(propertiesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.parallelMultiple)) {
				basePart.setParallelMultiple(boundaryEvent.isParallelMultiple());
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.eventDefinitionRefs)) {
				eventDefinitionRefsSettings = new ReferencesTableSettings(boundaryEvent, Bpmn2Package.eINSTANCE.getCatchEvent_EventDefinitionRefs());
				basePart.initEventDefinitionRefs(eventDefinitionRefsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.dataOutputAssociation)) {
				dataOutputAssociationSettings = new ReferencesTableSettings(boundaryEvent, Bpmn2Package.eINSTANCE.getCatchEvent_DataOutputAssociation());
				basePart.initDataOutputAssociation(dataOutputAssociationSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.eventDefinitions)) {
				eventDefinitionsSettings = new ReferencesTableSettings(boundaryEvent, Bpmn2Package.eINSTANCE.getCatchEvent_EventDefinitions());
				basePart.initEventDefinitions(eventDefinitionsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.cancelActivity)) {
				basePart.setCancelActivity(boundaryEvent.isCancelActivity());
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.attachedToRef)) {
				// init part
				attachedToRefSettings = new EObjectFlatComboSettings(boundaryEvent, Bpmn2Package.eINSTANCE.getBoundaryEvent_AttachedToRef());
				basePart.initAttachedToRef(attachedToRefSettings);
				// set the button mode
				basePart.setAttachedToRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.extensionDefinitions)) {
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
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.extensionValues)) {
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
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.documentation)) {
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
			
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.categoryValueRef)) {
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
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.outgoing)) {
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
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.incoming)) {
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
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.properties_)) {
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
			
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.eventDefinitionRefs)) {
				basePart.addFilterToEventDefinitionRefs(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInEventDefinitionRefsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToEventDefinitionRefs(new EObjectFilter(Bpmn2Package.Literals.EVENT_DEFINITION));
				// Start of user code for additional businessfilters for eventDefinitionRefs
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.dataOutputAssociation)) {
				basePart.addFilterToDataOutputAssociation(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof DataOutputAssociation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for dataOutputAssociation
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.eventDefinitions)) {
				basePart.addFilterToEventDefinitions(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EventDefinition); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for eventDefinitions
				// End of user code
			}
			
			if (isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.attachedToRef)) {
				basePart.addFilterToAttachedToRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Activity);
					}
					
				});
				// Start of user code for additional businessfilters for attachedToRef
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
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.id) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Id();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.extensionDefinitions) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.extensionValues) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.documentation) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Documentation();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.name) {
			return Bpmn2Package.eINSTANCE.getFlowElement_Name();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.categoryValueRef) {
			return Bpmn2Package.eINSTANCE.getFlowElement_CategoryValueRef();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.outgoing) {
			return Bpmn2Package.eINSTANCE.getFlowNode_Outgoing();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.incoming) {
			return Bpmn2Package.eINSTANCE.getFlowNode_Incoming();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.properties_) {
			return Bpmn2Package.eINSTANCE.getEvent_Properties();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.parallelMultiple) {
			return Bpmn2Package.eINSTANCE.getCatchEvent_ParallelMultiple();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.eventDefinitionRefs) {
			return Bpmn2Package.eINSTANCE.getCatchEvent_EventDefinitionRefs();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.dataOutputAssociation) {
			return Bpmn2Package.eINSTANCE.getCatchEvent_DataOutputAssociation();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.eventDefinitions) {
			return Bpmn2Package.eINSTANCE.getCatchEvent_EventDefinitions();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.cancelActivity) {
			return Bpmn2Package.eINSTANCE.getBoundaryEvent_CancelActivity();
		}
		if (editorKey == Bpmn2ViewsRepository.BoundaryEvent.Properties.attachedToRef) {
			return Bpmn2Package.eINSTANCE.getBoundaryEvent_AttachedToRef();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BoundaryEvent boundaryEvent = (BoundaryEvent)semanticObject;
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.id == event.getAffectedEditor()) {
			boundaryEvent.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.extensionDefinitions == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.extensionValues == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.documentation == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.name == event.getAffectedEditor()) {
			boundaryEvent.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.categoryValueRef == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.outgoing == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.incoming == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.properties_ == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.parallelMultiple == event.getAffectedEditor()) {
			boundaryEvent.setParallelMultiple((Boolean)event.getNewValue());
		}
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.eventDefinitionRefs == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EventDefinition) {
					eventDefinitionRefsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				eventDefinitionRefsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				eventDefinitionRefsSettings.move(event.getNewIndex(), (EventDefinition) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.dataOutputAssociation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, dataOutputAssociationSettings, editingContext.getAdapterFactory());
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
				dataOutputAssociationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				dataOutputAssociationSettings.move(event.getNewIndex(), (DataOutputAssociation) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.eventDefinitions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, eventDefinitionsSettings, editingContext.getAdapterFactory());
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
				eventDefinitionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				eventDefinitionsSettings.move(event.getNewIndex(), (EventDefinition) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.cancelActivity == event.getAffectedEditor()) {
			boundaryEvent.setCancelActivity((Boolean)event.getNewValue());
		}
		if (Bpmn2ViewsRepository.BoundaryEvent.Properties.attachedToRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				attachedToRefSettings.setToReference((Activity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, attachedToRefSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BoundaryEventPropertiesEditionPart basePart = (BoundaryEventPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getBaseElement_Id().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.extensionDefinitions))
				basePart.updateExtensionDefinitions();
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.extensionValues))
				basePart.updateExtensionValues();
			if (Bpmn2Package.eINSTANCE.getBaseElement_Documentation().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.documentation))
				basePart.updateDocumentation();
			if (Bpmn2Package.eINSTANCE.getFlowElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getFlowElement_CategoryValueRef().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.categoryValueRef))
				basePart.updateCategoryValueRef();
			if (Bpmn2Package.eINSTANCE.getFlowNode_Outgoing().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.outgoing))
				basePart.updateOutgoing();
			if (Bpmn2Package.eINSTANCE.getFlowNode_Incoming().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.incoming))
				basePart.updateIncoming();
			if (Bpmn2Package.eINSTANCE.getEvent_Properties().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.properties_))
				basePart.updateProperties();
			if (Bpmn2Package.eINSTANCE.getCatchEvent_ParallelMultiple().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.parallelMultiple))
				basePart.setParallelMultiple((Boolean)msg.getNewValue());
			
			if (Bpmn2Package.eINSTANCE.getCatchEvent_EventDefinitionRefs().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.eventDefinitionRefs))
				basePart.updateEventDefinitionRefs();
			if (Bpmn2Package.eINSTANCE.getCatchEvent_DataOutputAssociation().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.dataOutputAssociation))
				basePart.updateDataOutputAssociation();
			if (Bpmn2Package.eINSTANCE.getCatchEvent_EventDefinitions().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.eventDefinitions))
				basePart.updateEventDefinitions();
			if (Bpmn2Package.eINSTANCE.getBoundaryEvent_CancelActivity().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.cancelActivity))
				basePart.setCancelActivity((Boolean)msg.getNewValue());
			
			if (Bpmn2Package.eINSTANCE.getBoundaryEvent_AttachedToRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.BoundaryEvent.Properties.attachedToRef))
				basePart.setAttachedToRef((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Bpmn2ViewsRepository.BoundaryEvent.Properties.id || key == Bpmn2ViewsRepository.BoundaryEvent.Properties.parallelMultiple || key == Bpmn2ViewsRepository.BoundaryEvent.Properties.cancelActivity || key == Bpmn2ViewsRepository.BoundaryEvent.Properties.attachedToRef;
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
				if (Bpmn2ViewsRepository.BoundaryEvent.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.BoundaryEvent.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getFlowElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getFlowElement_Name().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.BoundaryEvent.Properties.parallelMultiple == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getCatchEvent_ParallelMultiple().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getCatchEvent_ParallelMultiple().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.BoundaryEvent.Properties.cancelActivity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getBoundaryEvent_CancelActivity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getBoundaryEvent_CancelActivity().getEAttributeType(), newValue);
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
