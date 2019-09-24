/**
 * Copyright (c) 2019 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.bpmn2.design;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.properties.core.api.SiriusInputDescriptor;
import org.eclipse.sirius.properties.core.internal.EditSupportSpec;

/**
 * This class provides utility methods for Sirius properties so that every expression like aql:input.emfEditServices(self).xxx can be changed to aql:self.xxx
 * @author lfasani
 */
@SuppressWarnings("restriction")
public class PropertiesHelper {
	
    /**
     * Default constructor.
     */
	public PropertiesHelper() {
	}

	public List<EStructuralFeature> getEStructuralFeatures(EObject eObject){
		EditSupportSpec editSupportSpec = new EditSupportSpec(null, eObject);
	       
		return editSupportSpec.getEStructuralFeatures();
	}
	
	/**
	 * Equivalent method for aql:input.emfEditServices(self).needsTextWidget(eStructuralFeature) and not input.emfEditServices(self).isMultiline(eStructuralFeature)
	 */
	public boolean getDefaultRulesMonoString(EObject eObject, EStructuralFeature eStructuralFeature) {
		EditSupportSpec editSupportSpec = new EditSupportSpec(null, eObject);
		return editSupportSpec.needsTextWidget(eStructuralFeature) && !editSupportSpec.isMultiline(eStructuralFeature);
	}
	
	/**
	 * Equivalent method for aql:input.emfEditServices(self).needsTextWidget(eStructuralFeature) and input.emfEditServices(self).isMultiline(eStructuralFeature)
	 */
	public boolean getDefaultRulesMultiString(EObject eObject, EStructuralFeature eStructuralFeature) {
		EditSupportSpec editSupportSpec = new EditSupportSpec(null, eObject);
		return editSupportSpec.needsTextWidget(eStructuralFeature) && editSupportSpec.isMultiline(eStructuralFeature);
	}
	
	/**
	 * Equivalent method for aql:input.emfEditServices(self).needsCheckboxWidget(eStructuralFeature)
	 */
	public boolean getDefaultRulesMonoBoolean(EObject eObject, EStructuralFeature eStructuralFeature) {
		EditSupportSpec editSupportSpec = new EditSupportSpec(null, eObject);
		return editSupportSpec.needsCheckboxWidget(eStructuralFeature);
	}

	/**
	 * Equivalent method for aql:input.emfEditServices(self).getText(eStructuralFeature)
	 */
	public Object getText(EObject eObject, EStructuralFeature eStructuralFeature) {
		EditSupportSpec editSupportSpec = new EditSupportSpec(null, eObject);
		return editSupportSpec.getText(eStructuralFeature);
	}
	
	/**
	 * Equivalent method for aql:input.emfEditServices(self).getDescription(eStructuralFeature)
	 */
	public String getDescription(EObject eObject, EStructuralFeature eStructuralFeature) {
		EditSupportSpec editSupportSpec = new EditSupportSpec(null, eObject);
		return editSupportSpec.getDescription(eStructuralFeature);
	}
	
	/**
	 * Equivalent method for aql:input.emfEditServices(self).setValue(eStructuralFeature, newValue)
	 */
	public Object setValue(EObject eObject, EStructuralFeature eStructuralFeature, EObject newValue) {
		EditSupportSpec editSupportSpec = new EditSupportSpec(null, eObject);
		return editSupportSpec.setValue(eStructuralFeature, newValue);
	}
	
	/**
	 * Equivalent method for aql:input.getAllSemanticElements()
	 */
	public Object getAllSemanticElements(EObject eObject) {
		SiriusInputDescriptor siriusInputDescriptor = new SiriusInputDescriptor(eObject);
		return siriusInputDescriptor.getAllSemanticElements();
	}
	
	/**
	* Equivalent method for aql:input.emfEditServices(self).getTabName()
	*/
	public Object getTabName(EObject eObject) {
		EditSupportSpec editSupportSpec = new EditSupportSpec(null, eObject);
		return editSupportSpec.getTabName();
	}
}
