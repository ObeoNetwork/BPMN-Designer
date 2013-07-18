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
public interface ExtensionAttributeDefinitionPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the type
	 * 
	 */
	public String getType();

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(String newValue);


	/**
	 * @return the isReference
	 * 
	 */
	public Boolean getIsReference();

	/**
	 * Defines a new isReference
	 * @param newValue the new isReference to set
	 * 
	 */
	public void setIsReference(Boolean newValue);


	/**
	 * @return the extensionDefinition
	 * 
	 */
	public EObject getExtensionDefinition();

	/**
	 * Init the extensionDefinition
	 * @param settings the combo setting
	 */
	public void initExtensionDefinition(EObjectFlatComboSettings settings);

	/**
	 * Defines a new extensionDefinition
	 * @param newValue the new extensionDefinition to set
	 * 
	 */
	public void setExtensionDefinition(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setExtensionDefinitionButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the extensionDefinition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExtensionDefinition(ViewerFilter filter);

	/**
	 * Adds the given filter to the extensionDefinition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinition(ViewerFilter filter);





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
