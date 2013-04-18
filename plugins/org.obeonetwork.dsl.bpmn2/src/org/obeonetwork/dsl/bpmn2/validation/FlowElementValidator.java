/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.bpmn2.validation;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.bpmn2.Auditing;
import org.obeonetwork.dsl.bpmn2.CategoryValue;
import org.obeonetwork.dsl.bpmn2.Monitoring;

/**
 * A sample validator interface for {@link org.obeonetwork.dsl.bpmn2.FlowElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FlowElementValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateAuditing(Auditing value);

	boolean validateMonitoring(Monitoring value);

	boolean validateCategoryValueRef(EList<CategoryValue> value);
}
