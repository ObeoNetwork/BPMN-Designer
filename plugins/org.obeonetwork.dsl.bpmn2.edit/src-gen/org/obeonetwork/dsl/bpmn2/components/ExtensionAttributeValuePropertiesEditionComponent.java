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
import org.eclipse.emf.ecore.EcoreFactory;

import org.eclipse.emf.ecore.resource.ResourceSet;

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
import org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.ExtensionAttributeValuePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ExtensionAttributeValuePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for valueRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings valueRefSettings;
	
	/**
	 * Settings for extensionAttributeDefinition EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings extensionAttributeDefinitionSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ExtensionAttributeValuePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject extensionAttributeValue, String editing_mode) {
		super(editingContext, extensionAttributeValue, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.ExtensionAttributeValue.class;
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
			final ExtensionAttributeValue extensionAttributeValue = (ExtensionAttributeValue)elt;
			final ExtensionAttributeValuePropertiesEditionPart basePart = (ExtensionAttributeValuePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef)) {
				// init part
				valueRefSettings = new EObjectFlatComboSettings(extensionAttributeValue, Bpmn2Package.eINSTANCE.getExtensionAttributeValue_ValueRef());
				basePart.initValueRef(valueRefSettings);
				// set the button mode
				basePart.setValueRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition)) {
				// init part
				extensionAttributeDefinitionSettings = new EObjectFlatComboSettings(extensionAttributeValue, Bpmn2Package.eINSTANCE.getExtensionAttributeValue_ExtensionAttributeDefinition());
				basePart.initExtensionAttributeDefinition(extensionAttributeDefinitionSettings);
				// set the button mode
				basePart.setExtensionAttributeDefinitionButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef)) {
				basePart.addFilterToValueRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EObject); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for valueRef
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition)) {
				basePart.addFilterToExtensionAttributeDefinition(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ExtensionAttributeDefinition); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for extensionAttributeDefinition
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
		if (editorKey == Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef) {
			return Bpmn2Package.eINSTANCE.getExtensionAttributeValue_ValueRef();
		}
		if (editorKey == Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition) {
			return Bpmn2Package.eINSTANCE.getExtensionAttributeValue_ExtensionAttributeDefinition();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ExtensionAttributeValue extensionAttributeValue = (ExtensionAttributeValue)semanticObject;
		if (Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				valueRefSettings.setToReference((EObject)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EObject eObject = EcoreFactory.eINSTANCE.createEObject();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				valueRefSettings.setToReference(eObject);
			}
		}
		if (Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				extensionAttributeDefinitionSettings.setToReference((ExtensionAttributeDefinition)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ExtensionAttributeDefinition eObject = Bpmn2Factory.eINSTANCE.createExtensionAttributeDefinition();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				extensionAttributeDefinitionSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ExtensionAttributeValuePropertiesEditionPart basePart = (ExtensionAttributeValuePropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getExtensionAttributeValue_ValueRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.valueRef))
				basePart.setValueRef((EObject)msg.getNewValue());
			if (Bpmn2Package.eINSTANCE.getExtensionAttributeValue_ExtensionAttributeDefinition().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.ExtensionAttributeValue.Properties.extensionAttributeDefinition))
				basePart.setExtensionAttributeDefinition((EObject)msg.getNewValue());
			
		}
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
