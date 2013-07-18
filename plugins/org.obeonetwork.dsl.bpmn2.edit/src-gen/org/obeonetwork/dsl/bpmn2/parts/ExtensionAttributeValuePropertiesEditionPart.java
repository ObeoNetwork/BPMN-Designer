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
public interface ExtensionAttributeValuePropertiesEditionPart {

	/**
	 * @return the valueRef
	 * 
	 */
	public EObject getValueRef();

	/**
	 * Init the valueRef
	 * @param settings the combo setting
	 */
	public void initValueRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new valueRef
	 * @param newValue the new valueRef to set
	 * 
	 */
	public void setValueRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setValueRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the valueRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToValueRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the valueRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToValueRef(ViewerFilter filter);


	/**
	 * @return the extensionAttributeDefinition
	 * 
	 */
	public EObject getExtensionAttributeDefinition();

	/**
	 * Init the extensionAttributeDefinition
	 * @param settings the combo setting
	 */
	public void initExtensionAttributeDefinition(EObjectFlatComboSettings settings);

	/**
	 * Defines a new extensionAttributeDefinition
	 * @param newValue the new extensionAttributeDefinition to set
	 * 
	 */
	public void setExtensionAttributeDefinition(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setExtensionAttributeDefinitionButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the extensionAttributeDefinition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExtensionAttributeDefinition(ViewerFilter filter);

	/**
	 * Adds the given filter to the extensionAttributeDefinition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExtensionAttributeDefinition(ViewerFilter filter);





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
