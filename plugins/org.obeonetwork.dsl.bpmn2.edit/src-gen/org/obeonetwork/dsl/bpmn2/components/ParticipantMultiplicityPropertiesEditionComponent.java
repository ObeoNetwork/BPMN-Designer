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
import org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.ParticipantMultiplicityPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ParticipantMultiplicityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ParticipantMultiplicityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject participantMultiplicity, String editing_mode) {
		super(editingContext, participantMultiplicity, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.ParticipantMultiplicity.class;
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
			final ParticipantMultiplicity participantMultiplicity = (ParticipantMultiplicity)elt;
			final ParticipantMultiplicityPropertiesEditionPart basePart = (ParticipantMultiplicityPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Bpmn2ViewsRepository.ParticipantMultiplicity.Properties.minimum)) {
				basePart.setMinimum(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, participantMultiplicity.getMinimum()));
			}
			
			if (isAccessible(Bpmn2ViewsRepository.ParticipantMultiplicity.Properties.maximum)) {
				basePart.setMaximum(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, participantMultiplicity.getMaximum()));
			}
			
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
		if (editorKey == Bpmn2ViewsRepository.ParticipantMultiplicity.Properties.minimum) {
			return Bpmn2Package.eINSTANCE.getParticipantMultiplicity_Minimum();
		}
		if (editorKey == Bpmn2ViewsRepository.ParticipantMultiplicity.Properties.maximum) {
			return Bpmn2Package.eINSTANCE.getParticipantMultiplicity_Maximum();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ParticipantMultiplicity participantMultiplicity = (ParticipantMultiplicity)semanticObject;
		if (Bpmn2ViewsRepository.ParticipantMultiplicity.Properties.minimum == event.getAffectedEditor()) {
			participantMultiplicity.setMinimum((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (Bpmn2ViewsRepository.ParticipantMultiplicity.Properties.maximum == event.getAffectedEditor()) {
			participantMultiplicity.setMaximum((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ParticipantMultiplicityPropertiesEditionPart basePart = (ParticipantMultiplicityPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getParticipantMultiplicity_Minimum().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.ParticipantMultiplicity.Properties.minimum)) {
				if (msg.getNewValue() != null) {
					basePart.setMinimum(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setMinimum("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getParticipantMultiplicity_Maximum().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.ParticipantMultiplicity.Properties.maximum)) {
				if (msg.getNewValue() != null) {
					basePart.setMaximum(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setMaximum("");
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
		return key == Bpmn2ViewsRepository.ParticipantMultiplicity.Properties.minimum;
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
				if (Bpmn2ViewsRepository.ParticipantMultiplicity.Properties.minimum == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getParticipantMultiplicity_Minimum().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getParticipantMultiplicity_Minimum().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.ParticipantMultiplicity.Properties.maximum == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getParticipantMultiplicity_Maximum().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getParticipantMultiplicity_Maximum().getEAttributeType(), newValue);
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
