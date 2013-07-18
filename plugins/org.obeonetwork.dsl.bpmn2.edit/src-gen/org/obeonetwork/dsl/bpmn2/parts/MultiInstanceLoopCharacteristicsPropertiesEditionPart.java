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
public interface MultiInstanceLoopCharacteristicsPropertiesEditionPart {

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
	 * @return the isSequential
	 * 
	 */
	public Boolean getIsSequential();

	/**
	 * Defines a new isSequential
	 * @param newValue the new isSequential to set
	 * 
	 */
	public void setIsSequential(Boolean newValue);


	/**
	 * @return the behavior
	 * 
	 */
	public Enumerator getBehavior();

	/**
	 * Init the behavior
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initBehavior(Object input, Enumerator current);

	/**
	 * Defines a new behavior
	 * @param newValue the new behavior to set
	 * 
	 */
	public void setBehavior(Enumerator newValue);


	/**
	 * @return the loopDataInputRef
	 * 
	 */
	public EObject getLoopDataInputRef();

	/**
	 * Init the loopDataInputRef
	 * @param settings the combo setting
	 */
	public void initLoopDataInputRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new loopDataInputRef
	 * @param newValue the new loopDataInputRef to set
	 * 
	 */
	public void setLoopDataInputRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setLoopDataInputRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the loopDataInputRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLoopDataInputRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the loopDataInputRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLoopDataInputRef(ViewerFilter filter);


	/**
	 * @return the loopDataOutputRef
	 * 
	 */
	public EObject getLoopDataOutputRef();

	/**
	 * Init the loopDataOutputRef
	 * @param settings the combo setting
	 */
	public void initLoopDataOutputRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new loopDataOutputRef
	 * @param newValue the new loopDataOutputRef to set
	 * 
	 */
	public void setLoopDataOutputRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setLoopDataOutputRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the loopDataOutputRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLoopDataOutputRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the loopDataOutputRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLoopDataOutputRef(ViewerFilter filter);




	/**
	 * Init the complexBehaviorDefinition
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initComplexBehaviorDefinition(ReferencesTableSettings settings);

	/**
	 * Update the complexBehaviorDefinition
	 * @param newValue the complexBehaviorDefinition to update
	 * 
	 */
	public void updateComplexBehaviorDefinition();

	/**
	 * Adds the given filter to the complexBehaviorDefinition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToComplexBehaviorDefinition(ViewerFilter filter);

	/**
	 * Adds the given filter to the complexBehaviorDefinition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToComplexBehaviorDefinition(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the complexBehaviorDefinition table
	 * 
	 */
	public boolean isContainedInComplexBehaviorDefinitionTable(EObject element);


	/**
	 * @return the oneBehaviorEventRef
	 * 
	 */
	public EObject getOneBehaviorEventRef();

	/**
	 * Init the oneBehaviorEventRef
	 * @param settings the combo setting
	 */
	public void initOneBehaviorEventRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new oneBehaviorEventRef
	 * @param newValue the new oneBehaviorEventRef to set
	 * 
	 */
	public void setOneBehaviorEventRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOneBehaviorEventRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the oneBehaviorEventRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOneBehaviorEventRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the oneBehaviorEventRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOneBehaviorEventRef(ViewerFilter filter);


	/**
	 * @return the noneBehaviorEventRef
	 * 
	 */
	public EObject getNoneBehaviorEventRef();

	/**
	 * Init the noneBehaviorEventRef
	 * @param settings the combo setting
	 */
	public void initNoneBehaviorEventRef(EObjectFlatComboSettings settings);

	/**
	 * Defines a new noneBehaviorEventRef
	 * @param newValue the new noneBehaviorEventRef to set
	 * 
	 */
	public void setNoneBehaviorEventRef(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setNoneBehaviorEventRefButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the noneBehaviorEventRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNoneBehaviorEventRef(ViewerFilter filter);

	/**
	 * Adds the given filter to the noneBehaviorEventRef edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNoneBehaviorEventRef(ViewerFilter filter);





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
