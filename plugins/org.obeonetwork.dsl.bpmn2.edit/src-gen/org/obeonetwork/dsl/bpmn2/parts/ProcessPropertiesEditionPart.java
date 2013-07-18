/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ProcessPropertiesEditionPart {

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
	 * Init the supportedInterfaceRefs
	 * @param settings settings for the supportedInterfaceRefs ReferencesTable 
	 */
	public void initSupportedInterfaceRefs(ReferencesTableSettings settings);

	/**
	 * Update the supportedInterfaceRefs
	 * @param newValue the supportedInterfaceRefs to update
	 * 
	 */
	public void updateSupportedInterfaceRefs();

	/**
	 * Adds the given filter to the supportedInterfaceRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSupportedInterfaceRefs(ViewerFilter filter);

	/**
	 * Adds the given filter to the supportedInterfaceRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSupportedInterfaceRefs(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the supportedInterfaceRefs table
	 * 
	 */
	public boolean isContainedInSupportedInterfaceRefsTable(EObject element);




	/**
	 * Init the ioBinding
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initIoBinding(ReferencesTableSettings settings);

	/**
	 * Update the ioBinding
	 * @param newValue the ioBinding to update
	 * 
	 */
	public void updateIoBinding();

	/**
	 * Adds the given filter to the ioBinding edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIoBinding(ViewerFilter filter);

	/**
	 * Adds the given filter to the ioBinding edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIoBinding(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ioBinding table
	 * 
	 */
	public boolean isContainedInIoBindingTable(EObject element);




	/**
	 * Init the laneSets
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initLaneSets(ReferencesTableSettings settings);

	/**
	 * Update the laneSets
	 * @param newValue the laneSets to update
	 * 
	 */
	public void updateLaneSets();

	/**
	 * Adds the given filter to the laneSets edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLaneSets(ViewerFilter filter);

	/**
	 * Adds the given filter to the laneSets edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLaneSets(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the laneSets table
	 * 
	 */
	public boolean isContainedInLaneSetsTable(EObject element);


	/**
	 * @return the processType
	 * 
	 */
	public Enumerator getProcessType();

	/**
	 * Init the processType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initProcessType(Object input, Enumerator current);

	/**
	 * Defines a new processType
	 * @param newValue the new processType to set
	 * 
	 */
	public void setProcessType(Enumerator newValue);


	/**
	 * @return the isClosed
	 * 
	 */
	public Boolean getIsClosed();

	/**
	 * Defines a new isClosed
	 * @param newValue the new isClosed to set
	 * 
	 */
	public void setIsClosed(Boolean newValue);




	/**
	 * Init the properties
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initProperties(ReferencesTableSettings settings);

	/**
	 * Update the properties
	 * @param newValue the properties to update
	 * 
	 */
	public void updateProperties();

	/**
	 * Adds the given filter to the properties edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProperties(ViewerFilter filter);

	/**
	 * Adds the given filter to the properties edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the properties table
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element);




	/**
	 * Init the supports
	 * @param settings settings for the supports ReferencesTable 
	 */
	public void initSupports(ReferencesTableSettings settings);

	/**
	 * Update the supports
	 * @param newValue the supports to update
	 * 
	 */
	public void updateSupports();

	/**
	 * Adds the given filter to the supports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSupports(ViewerFilter filter);

	/**
	 * Adds the given filter to the supports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSupports(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the supports table
	 * 
	 */
	public boolean isContainedInSupportsTable(EObject element);


	/**
	 * @return the definitionalCollaborationRef
	 * 
	 */
	public EObject getDefinitionalCollaborationRef();

	/**
	 * Init the definitionalCollaborationRef
	 * @param settings the combo setting
	 */
	public void initDefinitionalCollaborationRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new definitionalCollaborationRef
	 * @param newValue the new definitionalCollaborationRef to set
	 * 
	 */
	public void setDefinitionalCollaborationRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDefinitionalCollaborationRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the definitionalCollaborationRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDefinitionalCollaborationRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the definitionalCollaborationRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDefinitionalCollaborationRef(ViewerFilter filter);


	/**
	 * @return the isExecutable
	 * 
	 */
	public Boolean getIsExecutable();

	/**
	 * Defines a new isExecutable
	 * @param newValue the new isExecutable to set
	 * 
	 */
	public void setIsExecutable(Boolean newValue);




	/**
	 * Init the resources
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initResources(ReferencesTableSettings settings);

	/**
	 * Update the resources
	 * @param newValue the resources to update
	 * 
	 */
	public void updateResources();

	/**
	 * Adds the given filter to the resources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the resources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resources table
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element);




	/**
	 * Init the artifacts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initArtifacts(ReferencesTableSettings settings);

	/**
	 * Update the artifacts
	 * @param newValue the artifacts to update
	 * 
	 */
	public void updateArtifacts();

	/**
	 * Adds the given filter to the artifacts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToArtifacts(ViewerFilter filter);

	/**
	 * Adds the given filter to the artifacts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToArtifacts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the artifacts table
	 * 
	 */
	public boolean isContainedInArtifactsTable(EObject element);




	/**
	 * Init the correlationSubscriptions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCorrelationSubscriptions(ReferencesTableSettings settings);

	/**
	 * Update the correlationSubscriptions
	 * @param newValue the correlationSubscriptions to update
	 * 
	 */
	public void updateCorrelationSubscriptions();

	/**
	 * Adds the given filter to the correlationSubscriptions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCorrelationSubscriptions(ViewerFilter filter);

	/**
	 * Adds the given filter to the correlationSubscriptions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCorrelationSubscriptions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the correlationSubscriptions table
	 * 
	 */
	public boolean isContainedInCorrelationSubscriptionsTable(EObject element);





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
