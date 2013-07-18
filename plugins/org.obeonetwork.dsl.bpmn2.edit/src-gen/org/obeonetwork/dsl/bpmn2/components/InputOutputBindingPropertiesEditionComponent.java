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
import org.obeonetwork.dsl.bpmn2.InputOutputBinding;
import org.obeonetwork.dsl.bpmn2.InputSet;
import org.obeonetwork.dsl.bpmn2.Operation;
import org.obeonetwork.dsl.bpmn2.OutputSet;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.InputOutputBindingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class InputOutputBindingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for inputDataRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings inputDataRefSettings;
	
	/**
	 * Settings for outputDataRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings outputDataRefSettings;
	
	/**
	 * Settings for operationRef EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings operationRefSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public InputOutputBindingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject inputOutputBinding, String editing_mode) {
		super(editingContext, inputOutputBinding, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = Bpmn2ViewsRepository.class;
		partKey = Bpmn2ViewsRepository.InputOutputBinding.class;
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
			final InputOutputBinding inputOutputBinding = (InputOutputBinding)elt;
			final InputOutputBindingPropertiesEditionPart basePart = (InputOutputBindingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef)) {
				// init part
				inputDataRefSettings = new EObjectFlatComboSettings(inputOutputBinding, Bpmn2Package.eINSTANCE.getInputOutputBinding_InputDataRef());
				basePart.initInputDataRef(inputDataRefSettings);
				// set the button mode
				basePart.setInputDataRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef)) {
				// init part
				outputDataRefSettings = new EObjectFlatComboSettings(inputOutputBinding, Bpmn2Package.eINSTANCE.getInputOutputBinding_OutputDataRef());
				basePart.initOutputDataRef(outputDataRefSettings);
				// set the button mode
				basePart.setOutputDataRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef)) {
				// init part
				operationRefSettings = new EObjectFlatComboSettings(inputOutputBinding, Bpmn2Package.eINSTANCE.getInputOutputBinding_OperationRef());
				basePart.initOperationRef(operationRefSettings);
				// set the button mode
				basePart.setOperationRefButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			if (isAccessible(Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef)) {
				basePart.addFilterToInputDataRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof InputSet);
					}
					
				});
				// Start of user code for additional businessfilters for inputDataRef
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef)) {
				basePart.addFilterToOutputDataRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof OutputSet);
					}
					
				});
				// Start of user code for additional businessfilters for outputDataRef
				// End of user code
			}
			if (isAccessible(Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef)) {
				basePart.addFilterToOperationRef(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Operation);
					}
					
				});
				// Start of user code for additional businessfilters for operationRef
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
		if (editorKey == Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef) {
			return Bpmn2Package.eINSTANCE.getInputOutputBinding_InputDataRef();
		}
		if (editorKey == Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef) {
			return Bpmn2Package.eINSTANCE.getInputOutputBinding_OutputDataRef();
		}
		if (editorKey == Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef) {
			return Bpmn2Package.eINSTANCE.getInputOutputBinding_OperationRef();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		InputOutputBinding inputOutputBinding = (InputOutputBinding)semanticObject;
		if (Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				inputDataRefSettings.setToReference((InputSet)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				InputSet eObject = Bpmn2Factory.eINSTANCE.createInputSet();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				inputDataRefSettings.setToReference(eObject);
			}
		}
		if (Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				outputDataRefSettings.setToReference((OutputSet)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				OutputSet eObject = Bpmn2Factory.eINSTANCE.createOutputSet();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				outputDataRefSettings.setToReference(eObject);
			}
		}
		if (Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				operationRefSettings.setToReference((Operation)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Operation eObject = Bpmn2Factory.eINSTANCE.createOperation();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				operationRefSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			InputOutputBindingPropertiesEditionPart basePart = (InputOutputBindingPropertiesEditionPart)editingPart;
			if (Bpmn2Package.eINSTANCE.getInputOutputBinding_InputDataRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef))
				basePart.setInputDataRef((EObject)msg.getNewValue());
			if (Bpmn2Package.eINSTANCE.getInputOutputBinding_OutputDataRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef))
				basePart.setOutputDataRef((EObject)msg.getNewValue());
			if (Bpmn2Package.eINSTANCE.getInputOutputBinding_OperationRef().equals(msg.getFeature()) && basePart != null && isAccessible(Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef))
				basePart.setOperationRef((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == Bpmn2ViewsRepository.InputOutputBinding.Properties.inputDataRef || key == Bpmn2ViewsRepository.InputOutputBinding.Properties.outputDataRef || key == Bpmn2ViewsRepository.InputOutputBinding.Properties.operationRef;
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
