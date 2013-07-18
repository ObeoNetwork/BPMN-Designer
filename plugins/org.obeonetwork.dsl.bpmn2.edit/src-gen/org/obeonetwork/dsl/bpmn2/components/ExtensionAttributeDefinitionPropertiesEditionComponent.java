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

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition;
import org.obeonetwork.dsl.bpmn2.ExtensionDefinition;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeDefinitionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ExtensionAttributeDefinitionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for extensionDefinition EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings extensionDefinitionSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ExtensionAttributeDefinitionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject extensionAttributeDefinition, String editing_mode) {
		super(editingContext, extensionAttributeDefinition, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.ExtensionAttributeDefinition.class;
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
			final ExtensionAttributeDefinition extensionAttributeDefinition = (ExtensionAttributeDefinition)elt;
			final ExtensionAttributeDefinitionPropertiesEditionPart basePart = (ExtensionAttributeDefinitionPropertiesEditionPart)editingPart;
			// init values
			if (extensionAttributeDefinition.getName() != null && isAccessible(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, extensionAttributeDefinition.getName()));
			
			if (extensionAttributeDefinition.getType() != null && isAccessible(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, extensionAttributeDefinition.getType()));
			
			if (isAccessible(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference)) {
				basePart.setIsReference(extensionAttributeDefinition.isIsReference());
			}
			if (isAccessible(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition)) {
				// init part
				extensionDefinitionSettings = new EObjectFlatComboSettings(extensionAttributeDefinition, Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_ExtensionDefinition());
				basePart.initExtensionDefinition(extensionDefinitionSettings);
				// set the button mode
				basePart.setExtensionDefinitionButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			
			if (isAccessible(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition)) {
				basePart.addFilterToExtensionDefinition(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ExtensionDefinition);
					}
					
				});
				// Start of user code for additional businessfilters for extensionDefinition
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
		if (editorKey == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name) {
			return Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_Name();
		}
		if (editorKey == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type) {
			return Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_Type();
		}
		if (editorKey == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference) {
			return Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_IsReference();
		}
		if (editorKey == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition) {
			return Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_ExtensionDefinition();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ExtensionAttributeDefinition extensionAttributeDefinition = (ExtensionAttributeDefinition)semanticObject;
		if (Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name == event.getAffectedEditor()) {
			extensionAttributeDefinition.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type == event.getAffectedEditor()) {
			extensionAttributeDefinition.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference == event.getAffectedEditor()) {
			extensionAttributeDefinition.setIsReference((Boolean)event.getNewValue());
		}
		if (Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				extensionDefinitionSettings.setToReference((ExtensionDefinition)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ExtensionDefinition eObject = Bpmn2Factory.eINSTANCE.createExtensionDefinition();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				extensionDefinitionSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ExtensionAttributeDefinitionPropertiesEditionPart basePart = (ExtensionAttributeDefinitionPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_Name().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_Type().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_IsReference().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference))
				basePart.setIsReference((Boolean)msg.getNewValue());
			
			if (Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_ExtensionDefinition().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition))
				basePart.setExtensionDefinition((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name || key == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type || key == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference || key == Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.extensionDefinition;
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
				if (Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_Name().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_Type().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.ExtensionAttributeDefinition.Properties.isReference == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_IsReference().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getExtensionAttributeDefinition_IsReference().getEAttributeType(), newValue);
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
