/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface InputSetPropertiesEditionPart {

	/**
	 * @return the id
	 * 
	 */
	public String getId();

	/**
	 * Defines a new id
	 * @param newValue the new id to set
	 * 
	 */
	public void setId(String newValue);




	/**
	 * Init the extensionDefinitions
	 * @param settings settings for the extensionDefinitions ReferencesTable 
	 */
	public void initExtensionDefinitions(ReferencesTableSettings settings);

	/**
	 * Update the extensionDefinitions
	 * @param newValue the extensionDefinitions to update
	 * 
	 */
	public void updateExtensionDefinitions();

	/**
	 * Adds the given filter to the extensionDefinitions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter);

	/**
	 * Adds the given filter to the extensionDefinitions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the extensionDefinitions table
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element);




	/**
	 * Init the extensionValues
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initExtensionValues(ReferencesTableSettings settings);

	/**
	 * Update the extensionValues
	 * @param newValue the extensionValues to update
	 * 
	 */
	public void updateExtensionValues();

	/**
	 * Adds the given filter to the extensionValues edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExtensionValues(ViewerFilter filter);

	/**
	 * Adds the given filter to the extensionValues edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the extensionValues table
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element);




	/**
	 * Init the documentation
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initDocumentation(ReferencesTableSettings settings);

	/**
	 * Update the documentation
	 * @param newValue the documentation to update
	 * 
	 */
	public void updateDocumentation();

	/**
	 * Adds the given filter to the documentation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDocumentation(ViewerFilter filter);

	/**
	 * Adds the given filter to the documentation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the documentation table
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element);


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
	 * Init the dataInputRefs
	 * @param settings settings for the dataInputRefs ReferencesTable 
	 */
	public void initDataInputRefs(ReferencesTableSettings settings);

	/**
	 * Update the dataInputRefs
	 * @param newValue the dataInputRefs to update
	 * 
	 */
	public void updateDataInputRefs();

	/**
	 * Adds the given filter to the dataInputRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDataInputRefs(ViewerFilter filter);

	/**
	 * Adds the given filter to the dataInputRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDataInputRefs(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the dataInputRefs table
	 * 
	 */
	public boolean isContainedInDataInputRefsTable(EObject element);




	/**
	 * Init the optionalInputRefs
	 * @param settings settings for the optionalInputRefs ReferencesTable 
	 */
	public void initOptionalInputRefs(ReferencesTableSettings settings);

	/**
	 * Update the optionalInputRefs
	 * @param newValue the optionalInputRefs to update
	 * 
	 */
	public void updateOptionalInputRefs();

	/**
	 * Adds the given filter to the optionalInputRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOptionalInputRefs(ViewerFilter filter);

	/**
	 * Adds the given filter to the optionalInputRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOptionalInputRefs(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the optionalInputRefs table
	 * 
	 */
	public boolean isContainedInOptionalInputRefsTable(EObject element);




	/**
	 * Init the whileExecutingInputRefs
	 * @param settings settings for the whileExecutingInputRefs ReferencesTable 
	 */
	public void initWhileExecutingInputRefs(ReferencesTableSettings settings);

	/**
	 * Update the whileExecutingInputRefs
	 * @param newValue the whileExecutingInputRefs to update
	 * 
	 */
	public void updateWhileExecutingInputRefs();

	/**
	 * Adds the given filter to the whileExecutingInputRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToWhileExecutingInputRefs(ViewerFilter filter);

	/**
	 * Adds the given filter to the whileExecutingInputRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToWhileExecutingInputRefs(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the whileExecutingInputRefs table
	 * 
	 */
	public boolean isContainedInWhileExecutingInputRefsTable(EObject element);




	/**
	 * Init the outputSetRefs
	 * @param settings settings for the outputSetRefs ReferencesTable 
	 */
	public void initOutputSetRefs(ReferencesTableSettings settings);

	/**
	 * Update the outputSetRefs
	 * @param newValue the outputSetRefs to update
	 * 
	 */
	public void updateOutputSetRefs();

	/**
	 * Adds the given filter to the outputSetRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutputSetRefs(ViewerFilter filter);

	/**
	 * Adds the given filter to the outputSetRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutputSetRefs(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outputSetRefs table
	 * 
	 */
	public boolean isContainedInOutputSetRefsTable(EObject element);





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
