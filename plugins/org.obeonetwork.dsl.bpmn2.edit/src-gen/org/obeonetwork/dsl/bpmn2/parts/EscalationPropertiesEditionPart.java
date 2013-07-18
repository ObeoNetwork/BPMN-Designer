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
public interface EscalationPropertiesEditionPart {

	/**
	 * @return the structureRef
	 * 
	 */
	public EObject getStructureRef();

	/**
	 * Init the structureRef
	 * @param settings the combo setting
	 */
	public void initStructureRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new structureRef
	 * @param newValue the new structureRef to set
	 * 
	 */
	public void setStructureRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setStructureRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the structureRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStructureRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the structureRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStructureRef(ViewerFilter filter);


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
	 * @return the escalationCode
	 * 
	 */
	public String getEscalationCode();

	/**
	 * Defines a new escalationCode
	 * @param newValue the new escalationCode to set
	 * 
	 */
	public void setEscalationCode(String newValue);





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
