package org.obeonetwork.dsl.bpmn2.design.graphical.edit.policies;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.gmf.runtime.common.core.service.IProvider;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.IModelingAssistantOperation;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.IModelingAssistantProvider;

/**
 * The operation used with the modeling assistant service that gets the type of
 * relationships that can be created from a given source element.
 * 
 * @author cmahoney
 */
public class GetRelTypesOnSourceOperation
	implements IModelingAssistantOperation {

	/** the source: adapts to editpart, view, element, etc. */
	private final IAdaptable source;

	/**
	 * Creates a new <code>GetRelTypesOnSourceOperation</code>.
	 * 
	 * @param source
	 *            the source: adapts to editpart, view, element, etc.
	 */
	protected GetRelTypesOnSourceOperation(IAdaptable source) {
		this.source = source;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.IModelingAssistantOperation#getId()
	 */
	public String getId() {
		return GET_REL_TYPES_ON_SOURCE_ID;
	}

	/**
	 * Returns the source. This is what will be used to assist in delayed
	 * loading of a modeling assistant provider.
	 */
	public IAdaptable getContext() {
		return getSource();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.common.core.service.IOperation#execute(org.eclipse.gmf.runtime.common.core.service.IProvider)
	 */
	public Object execute(IProvider provider) {
		return ((IModelingAssistantProvider) provider)
			.getRelTypesOnSource(getSource());
	}

	/**
	 * Gets the source.
	 * 
	 * @return Returns the source.
	 */
	public IAdaptable getSource() {
		return source;
	}
}