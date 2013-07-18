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
import org.obeonetwork.dsl.bpmn2.Escalation;
import org.obeonetwork.dsl.bpmn2.ItemDefinition;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.EscalationPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class EscalationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for structureRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings structureRefSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public EscalationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject escalation, String editing_mode) {
		super(editingContext, escalation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.Escalation.class;
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
			final Escalation escalation = (Escalation)elt;
			final EscalationPropertiesEditionPart basePart = (EscalationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Bpmn2ViewsRepository.Escalation.Properties.structureRef)) {
				// init part
				structureRefSettings = new EObjectFlatComboSettings(escalation, Bpmn2Package.eINSTANCE.getEscalation_StructureRef());
				basePart.initStructureRef(structureRefSettings);
				// set the button mode
				basePart.setStructureRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (escalation.getName() != null && isAccessible(Bpmn2ViewsRepository.Escalation.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, escalation.getName()));
			
			if (escalation.getEscalationCode() != null && isAccessible(Bpmn2ViewsRepository.Escalation.Properties.escalationCode))
				basePart.setEscalationCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, escalation.getEscalationCode()));
			
			// init filters
			if (isAccessible(Bpmn2ViewsRepository.Escalation.Properties.structureRef)) {
				basePart.addFilterToStructureRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ItemDefinition); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for structureRef
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
		if (editorKey == Bpmn2ViewsRepository.Escalation.Properties.structureRef) {
			return Bpmn2Package.eINSTANCE.getEscalation_StructureRef();
		}
		if (editorKey == Bpmn2ViewsRepository.Escalation.Properties.name) {
			return Bpmn2Package.eINSTANCE.getEscalation_Name();
		}
		if (editorKey == Bpmn2ViewsRepository.Escalation.Properties.escalationCode) {
			return Bpmn2Package.eINSTANCE.getEscalation_EscalationCode();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Escalation escalation = (Escalation)semanticObject;
		if (Bpmn2ViewsRepository.Escalation.Properties.structureRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				structureRefSettings.setToReference((ItemDefinition)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ItemDefinition eObject = Bpmn2Factory.eINSTANCE.createItemDefinition();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				structureRefSettings.setToReference(eObject);
			}
		}
		if (Bpmn2ViewsRepository.Escalation.Properties.name == event.getAffectedEditor()) {
			escalation.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (Bpmn2ViewsRepository.Escalation.Properties.escalationCode == event.getAffectedEditor()) {
			escalation.setEscalationCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EscalationPropertiesEditionPart basePart = (EscalationPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getEscalation_StructureRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Escalation.Properties.structureRef))
				basePart.setStructureRef((EObject)msg.getNewValue());
			if (Bpmn2Package.eINSTANCE.getEscalation_Name().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Escalation.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (Bpmn2Package.eINSTANCE.getEscalation_EscalationCode().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.Escalation.Properties.escalationCode)) {
				if (msg.getNewValue() != null) {
					basePart.setEscalationCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setEscalationCode("");
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
		return key == Bpmn2ViewsRepository.Escalation.Properties.name || key == Bpmn2ViewsRepository.Escalation.Properties.escalationCode;
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
				if (Bpmn2ViewsRepository.Escalation.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getEscalation_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getEscalation_Name().getEAttributeType(), newValue);
				}
				if (Bpmn2ViewsRepository.Escalation.Properties.escalationCode == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(Bpmn2Package.eINSTANCE.getEscalation_EscalationCode().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(Bpmn2Package.eINSTANCE.getEscalation_EscalationCode().getEAttributeType(), newValue);
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
