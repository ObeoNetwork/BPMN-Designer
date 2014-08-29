package org.obeonetwork.bpmn2.design;

import org.eclipse.core.runtime.NullProgressMonitor;

import fr.obeo.dsl.viewpoint.DDiagramElement;
import fr.obeo.dsl.viewpoint.DDiagramElementContainer;
import fr.obeo.dsl.viewpoint.business.api.dialect.DialectManager;
import fr.obeo.dsl.viewpoint.business.api.helper.display.DisplayService;
import fr.obeo.dsl.viewpoint.business.api.helper.display.DisplayServiceManager;
import fr.obeo.dsl.viewpoint.business.api.helper.graphicalfilters.HideFilterHelper;

/**
 * @author vrichard
 * 
 *         <p>
 *         Services to be applied to a DDiagramElementContainer and relative to
 *         the expand/collapse state of the DDiagramElementContainer.
 *         </p>
 * 
 *         <p>
 *         Expand/collapse operations are done revealing/hiding elements
 *         contained in the DDiagramElementContainer.
 *         </p>
 * 
 *         <p>
 *         A DDiagramElementContainer is considered collapsed if if at least one
 *         of its child is hidden.
 *         </p>
 */
public class ExpandCollapseService {

	/**
	 * Toggle the expand/collapse state of the given  DDiagramElementContainer.
	 * 
	 * @param elementContainer
	 * @return elementContainer
	 */
	public DDiagramElementContainer toggleCollapse(final DDiagramElementContainer elementContainer) {

		if (isCollapsed(elementContainer)) {
			expand(elementContainer);
		} else {
			collapse(elementContainer);
		}

		return elementContainer;
	}

	/**
	 * Hide all the direct child of the given DDiagramElementContainer and force
	 * a refresh of the parent diagram.
	 * 
	 * @param elementContainer
	 * @return elementContainer
	 */
	public DDiagramElementContainer collapse(
			final DDiagramElementContainer elementContainer) {
		for (DDiagramElement child : elementContainer.getElements()) {
			if (child.eContainer() == elementContainer) {
				HideFilterHelper.INSTANCE.hide(child);
			}
		}

		// Do a refresh programmatically to update the representation. The
		// "force" option of the tool in the odesign doesn't work in this case
		// as the modification is not semantic.
		DialectManager.INSTANCE.refresh(elementContainer.getParentDiagram(),
				new NullProgressMonitor());

		return elementContainer;
	}

	/**
	 * Reveal all the direct child of the given DDiagramElementContainer and
	 * force a refresh of the parent diagram.
	 * 
	 * @param elementContainer
	 * @return elementContainer
	 */
	public DDiagramElementContainer expand(
			final DDiagramElementContainer elementContainer) {
		for (DDiagramElement child : elementContainer.getElements()) {
			if (child.eContainer() == elementContainer) {
				HideFilterHelper.INSTANCE.reveal(child);
			}
		}

		// Do a refresh programmatically to update the representation. The
		// "force" option of the tool in the odesign doesn't work in this case
		// as the modification is not semantic.
		DialectManager.INSTANCE.refresh(elementContainer.getParentDiagram(),
				new NullProgressMonitor());

		return elementContainer;
	}

	/**
	 * Test if a DDiagramElementContainer is collapsed.
	 * 
	 * @param elementContainer
	 * @return true if at least one child of elementContainer is hidden.
	 */
	public boolean isCollapsed(final DDiagramElementContainer elementContainer) {
		final DisplayService displayService = DisplayServiceManager.INSTANCE
				.getDisplayService();
		for (DDiagramElement child : elementContainer.getElements()) {
			if (child.eContainer() == elementContainer) {
//				if (!child.isVisible()) {
//					return true;
//				}
				if (!displayService.isDisplayed(child.getParentDiagram(), child)) {
					return true;
				}
			}
		}
		return false;
	}

}
