/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ParallelGatewayPropertiesEditionPart {

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
	 * Init the categoryValueRef
	 * @param settings settings for the categoryValueRef ReferencesTable 
	 */
	public void initCategoryValueRef(ReferencesTableSettings settings);

	/**
	 * Update the categoryValueRef
	 * @param newValue the categoryValueRef to update
	 * 
	 */
	public void updateCategoryValueRef();

	/**
	 * Adds the given filter to the categoryValueRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCategoryValueRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the categoryValueRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCategoryValueRef(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the categoryValueRef table
	 * 
	 */
	public boolean isContainedInCategoryValueRefTable(EObject element);




	/**
	 * Init the outgoing
	 * @param settings settings for the outgoing ReferencesTable 
	 */
	public void initOutgoing(ReferencesTableSettings settings);

	/**
	 * Update the outgoing
	 * @param newValue the outgoing to update
	 * 
	 */
	public void updateOutgoing();

	/**
	 * Adds the given filter to the outgoing edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutgoing(ViewerFilter filter);

	/**
	 * Adds the given filter to the outgoing edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutgoing(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outgoing table
	 * 
	 */
	public boolean isContainedInOutgoingTable(EObject element);




	/**
	 * Init the incoming
	 * @param settings settings for the incoming ReferencesTable 
	 */
	public void initIncoming(ReferencesTableSettings settings);

	/**
	 * Update the incoming
	 * @param newValue the incoming to update
	 * 
	 */
	public void updateIncoming();

	/**
	 * Adds the given filter to the incoming edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIncoming(ViewerFilter filter);

	/**
	 * Adds the given filter to the incoming edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIncoming(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the incoming table
	 * 
	 */
	public boolean isContainedInIncomingTable(EObject element);


	/**
	 * @return the gatewayDirection
	 * 
	 */
	public Enumerator getGatewayDirection();

	/**
	 * Init the gatewayDirection
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initGatewayDirection(Object input, Enumerator current);

	/**
	 * Defines a new gatewayDirection
	 * @param newValue the new gatewayDirection to set
	 * 
	 */
	public void setGatewayDirection(Enumerator newValue);





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
