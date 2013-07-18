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

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Import;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.Import_PropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ImportPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ImportPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject import_, String editing_mode) {
		super(editingContext, import_, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.Import_.class;
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
			final Import import_ = (Import)elt;
			final Import_PropertiesEditionPart basePart = (Import_PropertiesEditionPart)editingPart;
			// init values
			if (import_.getImportType() != null && isAccessible(Bpmn2ViewsRepository.Import_.Properties.importType))
				basePart.setImportType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, import_.getImportType()));
			
			if (import_.getLocation() != null && isAccessible(Bpmn2ViewsRepository.Import_.Properties.location))
				basePart.setLocation(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, import_.getLocation()));
			
			if (import_.getNamespace() != null && isAccessible(Bpmn2ViewsRepository.Import_.Properties.namespace))
				basePart.setNamespace(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, import_.getNamespace()));
			
			// init filters
			
			
			
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
		if (editorKey == Bpmn2ViewsRepository.Import_.Properties.importType) {
			return Bpmn2Package.eINSTANCE.getImport_ImportType();
		}
		if (editorKey == Bpmn2ViewsRepository.Import_.Properties.location) {
			return Bpmn2Package.eINSTANCE.getImport_Location();
		}
		if (editorKey == Bpmn2ViewsRepository.Import_.Properties.namespace) {
			return Bpmn2Package.eINSTANCE.getImport_Namespace();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Import import_ = (Import)semanticObject;
		if (Bpmn2ViewsRepository.Import_.Properties.importType == event.getAffectedEditor()) {
			import_.setImportType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Import_.Properties.location == event.getAffectedEditor()) {
			import_.setLocation((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Import_.Properties.namespace == event.getAffectedEditor()) {
			import_.setNamespace((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			Import_PropertiesEditionPart basePart = (Import_PropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getImport_ImportType().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Import_.Properties.importType)) {
				if (msg.getNewValue() != null) {
					basePart.setImportType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setImportType("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getImport_Location().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Import_.Properties.location)) {
				if (msg.getNewValue() != null) {
					basePart.setLocation(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setLocation("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getImport_Namespace().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Import_.Properties.namespace)) {
				if (msg.getNewValue() != null) {
					basePart.setNamespace(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setNamespace("");
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
		return key == Bpmn2ViewsRepository.Import_.Properties.importType || key == Bpmn2ViewsRepository.Import_.Properties.location || key == Bpmn2ViewsRepository.Import_.Properties.namespace;
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
				if (Bpmn2ViewsRepository.Import_.Properties.importType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getImport_ImportType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getImport_ImportType().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Import_.Properties.location == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getImport_Location().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getImport_Location().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Import_.Properties.namespace == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getImport_Namespace().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getImport_Namespace().getEAttributeType(), newValue);
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
