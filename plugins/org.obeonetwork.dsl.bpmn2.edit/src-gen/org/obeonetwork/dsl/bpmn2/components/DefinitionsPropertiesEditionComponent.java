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

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Definitions;
import org.obeonetwork.dsl.bpmn2.Documentation;
import org.obeonetwork.dsl.bpmn2.Extension;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;
import org.obeonetwork.dsl.bpmn2.Import;
import org.obeonetwork.dsl.bpmn2.Relationship;
import org.obeonetwork.dsl.bpmn2.RootElement;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.DefinitionsPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class DefinitionsPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for imports ReferencesTable
	 */
	protected ReferencesTableSettings importsSettings;
	
	/**
	 * Settings for extensions ReferencesTable
	 */
	protected ReferencesTableSettings extensionsSettings;
	
	/**
	 * Settings for relationships ReferencesTable
	 */
	protected ReferencesTableSettings relationshipsSettings;
	
	/**
	 * Settings for rootElements ReferencesTable
	 */
	protected ReferencesTableSettings rootElementsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DefinitionsPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject definitions, String editing_mode) {
		super(editingContext, definitions, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.Definitions.class;
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
			final Definitions definitions = (Definitions)elt;
			final DefinitionsPropertiesEditionPart basePart = (DefinitionsPropertiesEditionPart)editingPart;
			// init values
			if (definitions.getId() != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, definitions.getId()));
			
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions)) {
				extensionDefinitionsSettings = new ReferencesTableSettings(definitions, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions());
				basePart.initExtensionDefinitions(extensionDefinitionsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.extensionValues)) {
				extensionValuesSettings = new ReferencesTableSettings(definitions, Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues());
				basePart.initExtensionValues(extensionValuesSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.documentation)) {
				documentationSettings = new ReferencesTableSettings(definitions, Bpmn2Package.eINSTANCE.getBaseElement_Documentation());
				basePart.initDocumentation(documentationSettings);
			}
			if (definitions.getName() != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, definitions.getName()));
			
			if (definitions.getTargetNamespace() != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.targetNamespace))
				basePart.setTargetNamespace(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, definitions.getTargetNamespace()));
			
			if (definitions.getExpressionLanguage() != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage))
				basePart.setExpressionLanguage(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, definitions.getExpressionLanguage()));
			
			if (definitions.getTypeLanguage() != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.typeLanguage))
				basePart.setTypeLanguage(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, definitions.getTypeLanguage()));
			
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.imports)) {
				importsSettings = new ReferencesTableSettings(definitions, Bpmn2Package.eINSTANCE.getDefinitions_Imports());
				basePart.initImports(importsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.extensions)) {
				extensionsSettings = new ReferencesTableSettings(definitions, Bpmn2Package.eINSTANCE.getDefinitions_Extensions());
				basePart.initExtensions(extensionsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.relationships)) {
				relationshipsSettings = new ReferencesTableSettings(definitions, Bpmn2Package.eINSTANCE.getDefinitions_Relationships());
				basePart.initRelationships(relationshipsSettings);
			}
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.rootElements)) {
				rootElementsSettings = new ReferencesTableSettings(definitions, Bpmn2Package.eINSTANCE.getDefinitions_RootElements());
				basePart.initRootElements(rootElementsSettings);
			}
			if (definitions.getExporter() != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.exporter))
				basePart.setExporter(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, definitions.getExporter()));
			
			if (definitions.getExporterVersion() != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.exporterVersion))
				basePart.setExporterVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, definitions.getExporterVersion()));
			
			// init filters
			
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions)) {
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
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.extensionValues)) {
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
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.documentation)) {
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
			
			
			
			
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.imports)) {
				basePart.addFilterToImports(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Import); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for imports
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.extensions)) {
				basePart.addFilterToExtensions(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Extension); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for extensions
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.relationships)) {
				basePart.addFilterToRelationships(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Relationship); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for relationships
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.Definitions.Properties.rootElements)) {
				basePart.addFilterToRootElements(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof RootElement); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for rootElements
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
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.id) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Id();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.extensionValues) {
			return Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.documentation) {
			return Bpmn2Package.eINSTANCE.getBaseElement_Documentation();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.name) {
			return Bpmn2Package.eINSTANCE.getDefinitions_Name();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.targetNamespace) {
			return Bpmn2Package.eINSTANCE.getDefinitions_TargetNamespace();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage) {
			return Bpmn2Package.eINSTANCE.getDefinitions_ExpressionLanguage();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.typeLanguage) {
			return Bpmn2Package.eINSTANCE.getDefinitions_TypeLanguage();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.imports) {
			return Bpmn2Package.eINSTANCE.getDefinitions_Imports();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.extensions) {
			return Bpmn2Package.eINSTANCE.getDefinitions_Extensions();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.relationships) {
			return Bpmn2Package.eINSTANCE.getDefinitions_Relationships();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.rootElements) {
			return Bpmn2Package.eINSTANCE.getDefinitions_RootElements();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.exporter) {
			return Bpmn2Package.eINSTANCE.getDefinitions_Exporter();
		}
		if (editorKey == Bpmn2ViewsRepository.Definitions.Properties.exporterVersion) {
			return Bpmn2Package.eINSTANCE.getDefinitions_ExporterVersion();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Definitions definitions = (Definitions)semanticObject;
		if (Bpmn2ViewsRepository.Definitions.Properties.id == event.getAffectedEditor()) {
			definitions.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.Definitions.Properties.extensionValues == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.Definitions.Properties.documentation == event.getAffectedEditor()) {
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
		if (Bpmn2ViewsRepository.Definitions.Properties.name == event.getAffectedEditor()) {
			definitions.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Definitions.Properties.targetNamespace == event.getAffectedEditor()) {
			definitions.setTargetNamespace((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage == event.getAffectedEditor()) {
			definitions.setExpressionLanguage((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Definitions.Properties.typeLanguage == event.getAffectedEditor()) {
			definitions.setTypeLanguage((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Definitions.Properties.imports == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, importsSettings, editingContext.getAdapterFactory());
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
				importsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				importsSettings.move(event.getNewIndex(), (Import) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Definitions.Properties.extensions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, extensionsSettings, editingContext.getAdapterFactory());
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
				extensionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				extensionsSettings.move(event.getNewIndex(), (Extension) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Definitions.Properties.relationships == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, relationshipsSettings, editingContext.getAdapterFactory());
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
				relationshipsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				relationshipsSettings.move(event.getNewIndex(), (Relationship) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Definitions.Properties.rootElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rootElementsSettings, editingContext.getAdapterFactory());
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
				rootElementsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				rootElementsSettings.move(event.getNewIndex(), (RootElement) event.getNewValue());
			}
		}
		if (Bpmn2ViewsRepository.Definitions.Properties.exporter == event.getAffectedEditor()) {
			definitions.setExporter((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Definitions.Properties.exporterVersion == event.getAffectedEditor()) {
			definitions.setExporterVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			DefinitionsPropertiesEditionPart basePart = (DefinitionsPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getBaseElement_Id().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionDefinitions().equals(msg.getFeature())  && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.extensionDefinitions))
				basePart.updateExtensionDefinitions();
			if (Bpmn2Package.eINSTANCE.getBaseElement_ExtensionValues().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.extensionValues))
				basePart.updateExtensionValues();
			if (Bpmn2Package.eINSTANCE.getBaseElement_Documentation().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.documentation))
				basePart.updateDocumentation();
			if (Bpmn2Package.eINSTANCE.getDefinitions_Name().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getDefinitions_TargetNamespace().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.targetNamespace)) {
				if (msg.getNewValue() != null) {
					basePart.setTargetNamespace(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTargetNamespace("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getDefinitions_ExpressionLanguage().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage)) {
				if (msg.getNewValue() != null) {
					basePart.setExpressionLanguage(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setExpressionLanguage("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getDefinitions_TypeLanguage().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.typeLanguage)) {
				if (msg.getNewValue() != null) {
					basePart.setTypeLanguage(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTypeLanguage("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getDefinitions_Imports().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.imports))
				basePart.updateImports();
			if (Bpmn2Package.eINSTANCE.getDefinitions_Extensions().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.extensions))
				basePart.updateExtensions();
			if (Bpmn2Package.eINSTANCE.getDefinitions_Relationships().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.relationships))
				basePart.updateRelationships();
			if (Bpmn2Package.eINSTANCE.getDefinitions_RootElements().equals(msg.getFeature()) && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.rootElements))
				basePart.updateRootElements();
			if (Bpmn2Package.eINSTANCE.getDefinitions_Exporter().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.exporter)) {
				if (msg.getNewValue() != null) {
					basePart.setExporter(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setExporter("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getDefinitions_ExporterVersion().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Definitions.Properties.exporterVersion)) {
				if (msg.getNewValue() != null) {
					basePart.setExporterVersion(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setExporterVersion("");
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
		return key == Bpmn2ViewsRepository.Definitions.Properties.id || key == Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage || key == Bpmn2ViewsRepository.Definitions.Properties.typeLanguage;
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
				if (Bpmn2ViewsRepository.Definitions.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getBaseElement_Id().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Definitions.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getDefinitions_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getDefinitions_Name().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Definitions.Properties.targetNamespace == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getDefinitions_TargetNamespace().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getDefinitions_TargetNamespace().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Definitions.Properties.expressionLanguage == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getDefinitions_ExpressionLanguage().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getDefinitions_ExpressionLanguage().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Definitions.Properties.typeLanguage == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getDefinitions_TypeLanguage().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getDefinitions_TypeLanguage().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Definitions.Properties.exporter == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getDefinitions_Exporter().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getDefinitions_Exporter().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Definitions.Properties.exporterVersion == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getDefinitions_ExporterVersion().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getDefinitions_ExporterVersion().getEAttributeType(), newValue);
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
