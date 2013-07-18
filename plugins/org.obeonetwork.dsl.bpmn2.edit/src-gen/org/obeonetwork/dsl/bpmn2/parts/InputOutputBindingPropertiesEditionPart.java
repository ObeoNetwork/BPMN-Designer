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
public interface InputOutputBindingPropertiesEditionPart {

	/**
	 * @return the inputDataRef
	 * 
	 */
	public EObject getInputDataRef();

	/**
	 * Init the inputDataRef
	 * @param settings the combo setting
	 */
	public void initInputDataRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new inputDataRef
	 * @param newValue the new inputDataRef to set
	 * 
	 */
	public void setInputDataRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInputDataRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the inputDataRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInputDataRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the inputDataRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInputDataRef(ViewerFilter filter);


	/**
	 * @return the outputDataRef
	 * 
	 */
	public EObject getOutputDataRef();

	/**
	 * Init the outputDataRef
	 * @param settings the combo setting
	 */
	public void initOutputDataRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new outputDataRef
	 * @param newValue the new outputDataRef to set
	 * 
	 */
	public void setOutputDataRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOutputDataRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the outputDataRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutputDataRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the outputDataRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutputDataRef(ViewerFilter filter);


	/**
	 * @return the operationRef
	 * 
	 */
	public EObject getOperationRef();

	/**
	 * Init the operationRef
	 * @param settings the combo setting
	 */
	public void initOperationRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new operationRef
	 * @param newValue the new operationRef to set
	 * 
	 */
	public void setOperationRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOperationRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the operationRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOperationRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the operationRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOperationRef(ViewerFilter filter);





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
