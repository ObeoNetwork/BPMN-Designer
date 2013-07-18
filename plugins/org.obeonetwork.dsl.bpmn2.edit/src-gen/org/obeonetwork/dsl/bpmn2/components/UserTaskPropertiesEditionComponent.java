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

import org.obeonetwork.dsl.bpmn2.BoundaryEvent;
import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.CategoryValue;
import org.obeonetwork.dsl.bpmn2.DataInputAssociation;
import org.obeonetwork.dsl.bpmn2.DataOutputAssociation;
import org.obeonetwork.dsl.bpmn2.Documentation;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;
import org.obeonetwork.dsl.bpmn2.Property;
import org.obeonetwork.dsl.bpmn2.Rendering;
import org.obeonetwork.dsl.bpmn2.ResourceRole;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;
import org.obeonetwork.dsl.bpmn2.UserTask;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.UserTaskPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class UserTaskPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for resources ReferencesTable
	 */
	protected ReferencesTableSettings resourcesSettings;
	
	/**
	 * Settings for default EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings default_Settings;
	
	/**
	 * Settings for properties ReferencesTable
	 */
	protected ReferencesTableSettings propertiesSettings;
	
	/**
	 * Settings for boundaryEventRefs ReferencesTable
	 */
	private ReferencesTableSettings boundaryEventRefsSettings;
	
	/**
	 * Settings for dataInputAssociations ReferencesTable
	 */
	protected ReferencesTableSettings dataInputAssociationsSettings;
	
	/**
	 * Settings for dataOutputAssociations ReferencesTable
	 */
	protected ReferencesTableSettings dataOutputAssociationsSettings;
	
	/**
	 * Settings for renderings ReferencesTable
	 */
	protected ReferencesTableSettings renderingsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public UserTaskPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject userTask, String editing_mode) {
		super(editingContext, userTask, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.UserTask.class;
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
			final UserTask userTask = (UserTask)elt;
			final UserTaskPropertiesEditionPart basePart = (UserTaskPropertiesEditionPart)editingPart;
			// init values
			if (userTask.getId() != null && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, userTask.getId()));
			
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.extensionDefinitions)) {
				extensionDefinitionsSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions());
				basePart.initExtensionDefinitions(extensionDefinitionsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.extensionValues)) {
				extensionValuesSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues());
				basePart.initExtensionValues(extensionValuesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.documentation)) {
				documentationSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getBaseElement_Documentation());
				basePart.initDocumentation(documentationSettings);
			}
			if (userTask.getName() != null && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, userTask.getName()));
			
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.categoryValueRef)) {
				categoryValueRefSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getFlowElement_CategoryValueRef());
				basePart.initCategoryValueRef(categoryValueRefSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.outgoing)) {
				outgoingSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getFlowNode_Outgoing());
				basePart.initOutgoing(outgoingSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.incoming)) {
				incomingSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getFlowNode_Incoming());
				basePart.initIncoming(incomingSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.isForCompensation)) {
				basePart.setIsForCompensation(userTask.isIsForCompensation());
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.resources)) {
				resourcesSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getActivity_Resources());
				basePart.initResources(resourcesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.default_)) {
				// init part
				default_Settings = new EObjectFlatComboSettings(userTask, Bpmn2Package.eINSTANCE.getActivity_Default());
				basePart.initDefault_(default_Settings);
				// set the button mode
				basePart.setDefault_ButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.properties_)) {
				propertiesSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getActivity_Properties());
				basePart.initProperties(propertiesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.boundaryEventRefs)) {
				boundaryEventRefsSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getActivity_BoundaryEventRefs());
				basePart.initBoundaryEventRefs(boundaryEventRefsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.dataInputAssociations)) {
				dataInputAssociationsSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getActivity_DataInputAssociations());
				basePart.initDataInputAssociations(dataInputAssociationsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.dataOutputAssociations)) {
				dataOutputAssociationsSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getActivity_DataOutputAssociations());
				basePart.initDataOutputAssociations(dataOutputAssociationsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.startQuantity)) {
				basePart.setStartQuantity(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, userTask.getStartQuantity()));
			}
			
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.completionQuantity)) {
				basePart.setCompletionQuantity(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, userTask.getCompletionQuantity()));
			}
			
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.renderings)) {
				renderingsSettings = new ReferencesTableSettings(userTask, Bpmn2Package.eINSTANCE.getUserTask_Renderings());
				basePart.initRenderings(renderingsSettings);
			}
			if (userTask.getImplementation() != null && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.implementation))
				basePart.setImplementation(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, userTask.getImplementation()));
			
			// init filters
			
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.extensionDefinitions)) {
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
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.extensionValues)) {
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
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.documentation)) {
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
			
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.categoryValueRef)) {
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
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.outgoing)) {
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
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.incoming)) {
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
			
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.resources)) {
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
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.default_)) {
				basePart.addFilterToDefault_(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SequenceFlow); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for default
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.properties_)) {
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
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.boundaryEventRefs)) {
				basePart.addFilterToBoundaryEventRefs(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInBoundaryEventRefsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToBoundaryEventRefs(new EObjectFilter(Bpmn2Package.Literals.BOUNDARY_EVENT));
				// Start of user code for additional businessfilters for boundaryEventRefs
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.dataInputAssociations)) {
				basePart.addFilterToDataInputAssociations(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof DataInputAssociation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for dataInputAssociations
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.dataOutputAssociations)) {
				basePart.addFilterToDataOutputAssociations(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof DataOutputAssociation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for dataOutputAssociations
				// End of user code
			}
			
			
			if (isAccessible(Bpmn2ViewsRepository.UserTask.Properties.renderings)) {
				basePart.addFilterToRenderings(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Rendering); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for renderings
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
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.id) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Id();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.extensionDefinitions) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.extensionValues) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.documentation) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Documentation();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.name) {
			return Bpmn2Package.eINSTANCE.getFlowElement_Name();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.categoryValueRef) {
			return Bpmn2Package.eINSTANCE.getFlowElement_CategoryValueRef();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.outgoing) {
			return Bpmn2Package.eINSTANCE.getFlowNode_Outgoing();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.incoming) {
			return Bpmn2Package.eINSTANCE.getFlowNode_Incoming();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.isForCompensation) {
			return Bpmn2Package.eINSTANCE.getActivity_IsForCompensation();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.resources) {
			return Bpmn2Package.eINSTANCE.getActivity_Resources();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.default_) {
			return Bpmn2Package.eINSTANCE.getActivity_Default();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.properties_) {
			return Bpmn2Package.eINSTANCE.getActivity_Properties();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.boundaryEventRefs) {
			return Bpmn2Package.eINSTANCE.getActivity_BoundaryEventRefs();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.dataInputAssociations) {
			return Bpmn2Package.eINSTANCE.getActivity_DataInputAssociations();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.dataOutputAssociations) {
			return Bpmn2Package.eINSTANCE.getActivity_DataOutputAssociations();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.startQuantity) {
			return Bpmn2Package.eINSTANCE.getActivity_StartQuantity();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.completionQuantity) {
			return Bpmn2Package.eINSTANCE.getActivity_CompletionQuantity();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.renderings) {
			return Bpmn2Package.eINSTANCE.getUserTask_Renderings();
		}
		if (editorKey == Bpmn2ViewsRepository.UserTask.Properties.implementation) {
			return Bpmn2Package.eINSTANCE.getUserTask_Implementation();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		UserTask userTask = (UserTask)semanticObject;
		if (Bpmn2ViewsRepository.UserTask.Properties.id == event.getAffectedEditor()) {
			userTask.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.UserTask.Properties.extensionDefinitions == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.UserTask.Properties.extensionValues == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.UserTask.Properties.documentation == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.UserTask.Properties.name == event.getAffectedEditor()) {
			userTask.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.UserTask.Properties.categoryValueRef == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.UserTask.Properties.outgoing == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.UserTask.Properties.incoming == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.UserTask.Properties.isForCompensation == event.getAffectedEditor()) {
			userTask.setIsForCompensation((Boolean)event.getNewValue());
		}
		if (Bpmn2ViewsRepository.UserTask.Properties.resources == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.UserTask.Properties.default_ == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				default_Settings.setToReference((SequenceFlow)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				SequenceFlow eObject = Bpmn2Factory.eINSTANCE.createSequenceFlow();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				default_Settings.setToReference(eObject);
			}
		}
		if (Bpmn2ViewsRepository.UserTask.Properties.properties_ == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.UserTask.Properties.boundaryEventRefs == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BoundaryEvent) {
					boundaryEventRefsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				boundaryEventRefsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				boundaryEventRefsSettings.move(event.getNewIndex(), (BoundaryEvent) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.UserTask.Properties.dataInputAssociations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, dataInputAssociationsSettings, editingContext.getAdapterFactory());
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
				dataInputAssociationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				dataInputAssociationsSettings.move(event.getNewIndex(), (DataInputAssociation) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.UserTask.Properties.dataOutputAssociations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, dataOutputAssociationsSettings, editingContext.getAdapterFactory());
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
				dataOutputAssociationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				dataOutputAssociationsSettings.move(event.getNewIndex(), (DataOutputAssociation) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.UserTask.Properties.startQuantity == event.getAffectedEditor()) {
			userTask.setStartQuantity((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (Bpmn2ViewsRepository.UserTask.Properties.completionQuantity == event.getAffectedEditor()) {
			userTask.setCompletionQuantity((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (Bpmn2ViewsRepository.UserTask.Properties.renderings == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, renderingsSettings, editingContext.getAdapterFactory());
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
				renderingsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				renderingsSettings.move(event.getNewIndex(), (Rendering) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.UserTask.Properties.implementation == event.getAffectedEditor()) {
			userTask.setImplementation((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			UserTaskPropertiesEditionPart basePart = (UserTaskPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getBaseElement_Id().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.extensionDefinitions))
				basePart.updateExtensionDefinitions();
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.extensionValues))
				basePart.updateExtensionValues();
			if (Bpmn2Package.eINSTANCE.getBaseElement_Documentation().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.documentation))
				basePart.updateDocumentation();
			if (Bpmn2Package.eINSTANCE.getFlowElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getFlowElement_CategoryValueRef().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.categoryValueRef))
				basePart.updateCategoryValueRef();
			if (Bpmn2Package.eINSTANCE.getFlowNode_Outgoing().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.outgoing))
				basePart.updateOutgoing();
			if (Bpmn2Package.eINSTANCE.getFlowNode_Incoming().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.incoming))
				basePart.updateIncoming();
			if (Bpmn2Package.eINSTANCE.getActivity_IsForCompensation().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.isForCompensation))
				basePart.setIsForCompensation((Boolean)msg.getNewValue());
			
			if (Bpmn2Package.eINSTANCE.getActivity_Resources().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.resources))
				basePart.updateResources();
			if (Bpmn2Package.eINSTANCE.getActivity_Default().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.default_))
				basePart.setDefault_((EObject)msg.getNewValue());
			if (Bpmn2Package.eINSTANCE.getActivity_Properties().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.properties_))
				basePart.updateProperties();
			if (Bpmn2Package.eINSTANCE.getActivity_BoundaryEventRefs().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.boundaryEventRefs))
				basePart.updateBoundaryEventRefs();
			if (Bpmn2Package.eINSTANCE.getActivity_DataInputAssociations().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.dataInputAssociations))
				basePart.updateDataInputAssociations();
			if (Bpmn2Package.eINSTANCE.getActivity_DataOutputAssociations().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.dataOutputAssociations))
				basePart.updateDataOutputAssociations();
			if (Bpmn2Package.eINSTANCE.getActivity_StartQuantity().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.startQuantity)) {
				if (msg.getNewValue() != null) {
					basePart.setStartQuantity(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setStartQuantity("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getActivity_CompletionQuantity().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.completionQuantity)) {
				if (msg.getNewValue() != null) {
					basePart.setCompletionQuantity(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setCompletionQuantity("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getUserTask_Renderings().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.renderings))
				basePart.updateRenderings();
			if (Bpmn2Package.eINSTANCE.getUserTask_Implementation().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.UserTask.Properties.implementation)) {
				if (msg.getNewValue() != null) {
					basePart.setImplementation(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setImplementation("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Bpmn2ViewsRepository.UserTask.Properties.id || key == Bpmn2ViewsRepository.UserTask.Properties.isForCompensation || key == Bpmn2ViewsRepository.UserTask.Properties.startQuantity || key == Bpmn2ViewsRepository.UserTask.Properties.completionQuantity;
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
				if (Bpmn2ViewsRepository.UserTask.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.UserTask.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getFlowElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getFlowElement_Name().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.UserTask.Properties.isForCompensation == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getActivity_IsForCompensation().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getActivity_IsForCompensation().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.UserTask.Properties.startQuantity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getActivity_StartQuantity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getActivity_StartQuantity().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.UserTask.Properties.completionQuantity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getActivity_CompletionQuantity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getActivity_CompletionQuantity().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.UserTask.Properties.implementation == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getUserTask_Implementation().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getUserTask_Implementation().getEAttributeType(), newValue);
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
