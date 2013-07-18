/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ResourceParameterBindingPropertiesEditionPart {

	/**
	 * @return the parameterRef
	 * 
	 */
	public EObject getParameterRef();

	/**
	 * Init the parameterRef
	 * @param settings the combo setting
	 */
	public void initParameterRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parameterRef
	 * @param newValue the new parameterRef to set
	 * 
	 */
	public void setParameterRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setParameterRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parameterRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParameterRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the parameterRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParameterRef(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
