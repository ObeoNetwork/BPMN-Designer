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
public interface DefinitionsPropertiesEditionPart {

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
	 * @return the targetNamespace
	 * 
	 */
	public String getTargetNamespace();

	/**
	 * Defines a new targetNamespace
	 * @param newValue the new targetNamespace to set
	 * 
	 */
	public void setTargetNamespace(String newValue);


	/**
	 * @return the expressionLanguage
	 * 
	 */
	public String getExpressionLanguage();

	/**
	 * Defines a new expressionLanguage
	 * @param newValue the new expressionLanguage to set
	 * 
	 */
	public void setExpressionLanguage(String newValue);


	/**
	 * @return the typeLanguage
	 * 
	 */
	public String getTypeLanguage();

	/**
	 * Defines a new typeLanguage
	 * @param newValue the new typeLanguage to set
	 * 
	 */
	public void setTypeLanguage(String newValue);




	/**
	 * Init the imports
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initImports(ReferencesTableSettings settings);

	/**
	 * Update the imports
	 * @param newValue the imports to update
	 * 
	 */
	public void updateImports();

	/**
	 * Adds the given filter to the imports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToImports(ViewerFilter filter);

	/**
	 * Adds the given filter to the imports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToImports(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the imports table
	 * 
	 */
	public boolean isContainedInImportsTable(EObject element);




	/**
	 * Init the extensions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initExtensions(ReferencesTableSettings settings);

	/**
	 * Update the extensions
	 * @param newValue the extensions to update
	 * 
	 */
	public void updateExtensions();

	/**
	 * Adds the given filter to the extensions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExtensions(ViewerFilter filter);

	/**
	 * Adds the given filter to the extensions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExtensions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the extensions table
	 * 
	 */
	public boolean isContainedInExtensionsTable(EObject element);




	/**
	 * Init the relationships
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initRelationships(ReferencesTableSettings settings);

	/**
	 * Update the relationships
	 * @param newValue the relationships to update
	 * 
	 */
	public void updateRelationships();

	/**
	 * Adds the given filter to the relationships edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRelationships(ViewerFilter filter);

	/**
	 * Adds the given filter to the relationships edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRelationships(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the relationships table
	 * 
	 */
	public boolean isContainedInRelationshipsTable(EObject element);




	/**
	 * Init the rootElements
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initRootElements(ReferencesTableSettings settings);

	/**
	 * Update the rootElements
	 * @param newValue the rootElements to update
	 * 
	 */
	public void updateRootElements();

	/**
	 * Adds the given filter to the rootElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRootElements(ViewerFilter filter);

	/**
	 * Adds the given filter to the rootElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRootElements(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the rootElements table
	 * 
	 */
	public boolean isContainedInRootElementsTable(EObject element);


	/**
	 * @return the exporter
	 * 
	 */
	public String getExporter();

	/**
	 * Defines a new exporter
	 * @param newValue the new exporter to set
	 * 
	 */
	public void setExporter(String newValue);


	/**
	 * @return the exporterVersion
	 * 
	 */
	public String getExporterVersion();

	/**
	 * Defines a new exporterVersion
	 * @param newValue the new exporterVersion to set
	 * 
	 */
	public void setExporterVersion(String newValue);





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
