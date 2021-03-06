/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.bpmn2.validation;

import org.eclipse.emf.common.util.EList;
import org.obeonetwork.dsl.bpmn2.Assignment;
import org.obeonetwork.dsl.bpmn2.FormalExpression;
import org.obeonetwork.dsl.bpmn2.ItemAwareElement;

/**
 * A sample validator interface for {@link org.obeonetwork.dsl.bpmn2.DataAssociation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataAssociationValidator {
	boolean validate();

	boolean validateTransformation(FormalExpression value);

	boolean validateAssignment(EList<Assignment> value);

	boolean validateTargetRef(ItemAwareElement value);

	boolean validateSourceRef(EList<ItemAwareElement> value);
}
