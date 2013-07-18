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
public interface SubChoreographyPropertiesEditionPart {

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
	 * Init the participantRefs
	 * @param settings settings for the participantRefs ReferencesTable 
	 */
	public void initParticipantRefs(ReferencesTableSettings settings);

	/**
	 * Update the participantRefs
	 * @param newValue the participantRefs to update
	 * 
	 */
	public void updateParticipantRefs();

	/**
	 * Adds the given filter to the participantRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParticipantRefs(ViewerFilter filter);

	/**
	 * Adds the given filter to the participantRefs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParticipantRefs(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the participantRefs table
	 * 
	 */
	public boolean isContainedInParticipantRefsTable(EObject element);


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
	 * @return the loopType
	 * 
	 */
	public Enumerator getLoopType();

	/**
	 * Init the loopType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initLoopType(Object input, Enumerator current);

	/**
	 * Defines a new loopType
	 * @param newValue the new loopType to set
	 * 
	 */
	public void setLoopType(Enumerator newValue);




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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
