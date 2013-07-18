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

import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ComplexBehaviorDefinition;
import org.obeonetwork.dsl.bpmn2.Documentation;
import org.obeonetwork.dsl.bpmn2.EventDefinition;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;
import org.obeonetwork.dsl.bpmn2.ItemAwareElement;
import org.obeonetwork.dsl.bpmn2.MultiInstanceBehavior;
import org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.MultiInstanceLoopCharacteristicsPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class MultiInstanceLoopCharacteristicsPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for loopDataInputRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings loopDataInputRefSettings;
	
	/**
	 * Settings for loopDataOutputRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings loopDataOutputRefSettings;
	
	/**
	 * Settings for complexBehaviorDefinition ReferencesTable
	 */
	protected ReferencesTableSettings complexBehaviorDefinitionSettings;
	
	/**
	 * Settings for oneBehaviorEventRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings oneBehaviorEventRefSettings;
	
	/**
	 * Settings for noneBehaviorEventRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings noneBehaviorEventRefSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MultiInstanceLoopCharacteristicsPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject multiInstanceLoopCharacteristics, String editing_mode) {
		super(editingContext, multiInstanceLoopCharacteristics, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.class;
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
			final MultiInstanceLoopCharacteristics multiInstanceLoopCharacteristics = (MultiInstanceLoopCharacteristics)elt;
			final MultiInstanceLoopCharacteristicsPropertiesEditionPart basePart = (MultiInstanceLoopCharacteristicsPropertiesEditionPart)editingPart;
			// init values
			if (multiInstanceLoopCharacteristics.getId() != null && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, multiInstanceLoopCharacteristics.getId()));
			
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions)) {
				extensionDefinitionsSettings = new ReferencesTableSettings(multiInstanceLoopCharacteristics, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions());
				basePart.initExtensionDefinitions(extensionDefinitionsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues)) {
				extensionValuesSettings = new ReferencesTableSettings(multiInstanceLoopCharacteristics, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues());
				basePart.initExtensionValues(extensionValuesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation)) {
				documentationSettings = new ReferencesTableSettings(multiInstanceLoopCharacteristics, Bpmn2Package.eINSTANCE.getBaseElement_Documentation());
				basePart.initDocumentation(documentationSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential)) {
				basePart.setIsSequential(multiInstanceLoopCharacteristics.isIsSequential());
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior)) {
				basePart.initBehavior(EEFUtils.choiceOfValues(multiInstanceLoopCharacteristics, Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_Behavior()), multiInstanceLoopCharacteristics.getBehavior());
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef)) {
				// init part
				loopDataInputRefSettings = new EObjectFlatComboSettings(multiInstanceLoopCharacteristics, Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopDataInputRef());
				basePart.initLoopDataInputRef(loopDataInputRefSettings);
				// set the button mode
				basePart.setLoopDataInputRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef)) {
				// init part
				loopDataOutputRefSettings = new EObjectFlatComboSettings(multiInstanceLoopCharacteristics, Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopDataOutputRef());
				basePart.initLoopDataOutputRef(loopDataOutputRefSettings);
				// set the button mode
				basePart.setLoopDataOutputRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition)) {
				complexBehaviorDefinitionSettings = new ReferencesTableSettings(multiInstanceLoopCharacteristics, Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition());
				basePart.initComplexBehaviorDefinition(complexBehaviorDefinitionSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef)) {
				// init part
				oneBehaviorEventRefSettings = new EObjectFlatComboSettings(multiInstanceLoopCharacteristics, Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_OneBehaviorEventRef());
				basePart.initOneBehaviorEventRef(oneBehaviorEventRefSettings);
				// set the button mode
				basePart.setOneBehaviorEventRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef)) {
				// init part
				noneBehaviorEventRefSettings = new EObjectFlatComboSettings(multiInstanceLoopCharacteristics, Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef());
				basePart.initNoneBehaviorEventRef(noneBehaviorEventRefSettings);
				// set the button mode
				basePart.setNoneBehaviorEventRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions)) {
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
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues)) {
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
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation)) {
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
			
			
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef)) {
				basePart.addFilterToLoopDataInputRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ItemAwareElement); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for loopDataInputRef
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef)) {
				basePart.addFilterToLoopDataOutputRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ItemAwareElement); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for loopDataOutputRef
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition)) {
				basePart.addFilterToComplexBehaviorDefinition(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ComplexBehaviorDefinition); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for complexBehaviorDefinition
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef)) {
				basePart.addFilterToOneBehaviorEventRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EventDefinition); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for oneBehaviorEventRef
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef)) {
				basePart.addFilterToNoneBehaviorEventRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EventDefinition); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for noneBehaviorEventRef
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
		if (editorKey == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Id();
		}
		if (editorKey == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions();
		}
		if (editorKey == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues();
		}
		if (editorKey == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Documentation();
		}
		if (editorKey == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential) {
			return Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_IsSequential();
		}
		if (editorKey == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior) {
			return Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_Behavior();
		}
		if (editorKey == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef) {
			return Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopDataInputRef();
		}
		if (editorKey == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef) {
			return Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopDataOutputRef();
		}
		if (editorKey == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition) {
			return Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition();
		}
		if (editorKey == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef) {
			return Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_OneBehaviorEventRef();
		}
		if (editorKey == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef) {
			return Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MultiInstanceLoopCharacteristics multiInstanceLoopCharacteristics = (MultiInstanceLoopCharacteristics)semanticObject;
		if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id == event.getAffectedEditor()) {
			multiInstanceLoopCharacteristics.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential == event.getAffectedEditor()) {
			multiInstanceLoopCharacteristics.setIsSequential((Boolean)event.getNewValue());
		}
		if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior == event.getAffectedEditor()) {
			multiInstanceLoopCharacteristics.setBehavior((MultiInstanceBehavior)event.getNewValue());
		}
		if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				loopDataInputRefSettings.setToReference((ItemAwareElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ItemAwareElement eObject = Bpmn2Factory.eINSTANCE.createItemAwareElement();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				loopDataInputRefSettings.setToReference(eObject);
			}
		}
		if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				loopDataOutputRefSettings.setToReference((ItemAwareElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ItemAwareElement eObject = Bpmn2Factory.eINSTANCE.createItemAwareElement();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				loopDataOutputRefSettings.setToReference(eObject);
			}
		}
		if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, complexBehaviorDefinitionSettings, editingContext.getAdapterFactory());
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
				complexBehaviorDefinitionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				complexBehaviorDefinitionSettings.move(event.getNewIndex(), (ComplexBehaviorDefinition) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				oneBehaviorEventRefSettings.setToReference((EventDefinition)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, oneBehaviorEventRefSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				noneBehaviorEventRefSettings.setToReference((EventDefinition)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, noneBehaviorEventRefSettings, editingContext.getAdapterFactory());
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
			MultiInstanceLoopCharacteristicsPropertiesEditionPart basePart = (MultiInstanceLoopCharacteristicsPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getBaseElement_Id().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionDefinitions))
				basePart.updateExtensionDefinitions();
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.extensionValues))
				basePart.updateExtensionValues();
			if (Bpmn2Package.eINSTANCE.getBaseElement_Documentation().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.documentation))
				basePart.updateDocumentation();
			if (Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_IsSequential().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential))
				basePart.setIsSequential((Boolean)msg.getNewValue());
			
			if (Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_Behavior().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior))
				basePart.setBehavior((MultiInstanceBehavior)msg.getNewValue());
			
			if (Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopDataInputRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataInputRef))
				basePart.setLoopDataInputRef((EObject)msg.getNewValue());
			if (Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_LoopDataOutputRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.loopDataOutputRef))
				basePart.setLoopDataOutputRef((EObject)msg.getNewValue());
			if (Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.complexBehaviorDefinition))
				basePart.updateComplexBehaviorDefinition();
			if (Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_OneBehaviorEventRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.oneBehaviorEventRef))
				basePart.setOneBehaviorEventRef((EObject)msg.getNewValue());
			if (Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.noneBehaviorEventRef))
				basePart.setNoneBehaviorEventRef((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id || key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential || key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior;
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
				if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.isSequential == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_IsSequential().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_IsSequential().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.Properties.behavior == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_Behavior().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics_Behavior().getEAttributeType(), newValue);
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
