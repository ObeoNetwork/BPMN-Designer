/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.bpmn2.validation;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.bpmn2.Rendering;

/**
 * A sample validator interface for {@link org.obeonetwork.dsl.bpmn2.UserTask}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UserTaskValidator {
	boolean validate();

	boolean validateRenderings(EList<Rendering> value);

	boolean validateImplementation(String value);
}
