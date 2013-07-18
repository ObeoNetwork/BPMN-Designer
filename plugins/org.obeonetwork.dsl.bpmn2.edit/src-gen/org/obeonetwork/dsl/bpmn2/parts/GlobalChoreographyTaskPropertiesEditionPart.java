/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts;

// Start of user code for imports
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
public interface GlobalChoreographyTaskPropertiesEditionPart {

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
	 * Init the choreographyRef
	 * @param settings settings for the choreographyRef ReferencesTable 
	 */
	public void initChoreographyRef(ReferencesTableSettings settings);

	/**
	 * Update the choreographyRef
	 * @param newValue the choreographyRef to update
	 * 
	 */
	public void updateChoreographyRef();

	/**
	 * Adds the given filter to the choreographyRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToChoreographyRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the choreographyRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToChoreographyRef(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the choreographyRef table
	 * 
	 */
	public boolean isContainedInChoreographyRefTable(EObject element);




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
	 * Init the participantAssociations
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initParticipantAssociations(ReferencesTableSettings settings);

	/**
	 * Update the participantAssociations
	 * @param newValue the participantAssociations to update
	 * 
	 */
	public void updateParticipantAssociations();

	/**
	 * Adds the given filter to the participantAssociations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParticipantAssociations(ViewerFilter filter);

	/**
	 * Adds the given filter to the participantAssociations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParticipantAssociations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the participantAssociations table
	 * 
	 */
	public boolean isContainedInParticipantAssociationsTable(EObject element);




	/**
	 * Init the messageFlowAssociations
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMessageFlowAssociations(ReferencesTableSettings settings);

	/**
	 * Update the messageFlowAssociations
	 * @param newValue the messageFlowAssociations to update
	 * 
	 */
	public void updateMessageFlowAssociations();

	/**
	 * Adds the given filter to the messageFlowAssociations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMessageFlowAssociations(ViewerFilter filter);

	/**
	 * Adds the given filter to the messageFlowAssociations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMessageFlowAssociations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the messageFlowAssociations table
	 * 
	 */
	public boolean isContainedInMessageFlowAssociationsTable(EObject element);




	/**
	 * Init the messageFlows
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMessageFlows(ReferencesTableSettings settings);

	/**
	 * Update the messageFlows
	 * @param newValue the messageFlows to update
	 * 
	 */
	public void updateMessageFlows();

	/**
	 * Adds the given filter to the messageFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMessageFlows(ViewerFilter filter);

	/**
	 * Adds the given filter to the messageFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMessageFlows(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the messageFlows table
	 * 
	 */
	public boolean isContainedInMessageFlowsTable(EObject element);




	/**
	 * Init the correlationKeys
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCorrelationKeys(ReferencesTableSettings settings);

	/**
	 * Update the correlationKeys
	 * @param newValue the correlationKeys to update
	 * 
	 */
	public void updateCorrelationKeys();

	/**
	 * Adds the given filter to the correlationKeys edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCorrelationKeys(ViewerFilter filter);

	/**
	 * Adds the given filter to the correlationKeys edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCorrelationKeys(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the correlationKeys table
	 * 
	 */
	public boolean isContainedInCorrelationKeysTable(EObject element);




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
	 * @return the initiatingParticipantRef
	 * 
	 */
	public EObject getInitiatingParticipantRef();

	/**
	 * Init the initiatingParticipantRef
	 * @param settings the combo setting
	 */
	public void initInitiatingParticipantRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new initiatingParticipantRef
	 * @param newValue the new initiatingParticipantRef to set
	 * 
	 */
	public void setInitiatingParticipantRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInitiatingParticipantRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the initiatingParticipantRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInitiatingParticipantRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the initiatingParticipantRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInitiatingParticipantRef(ViewerFilter filter);





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
