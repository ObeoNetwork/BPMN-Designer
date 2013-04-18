/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.bpmn2.validation;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.bpmn2.Lane;
import org.obeonetwork.dsl.bpmn2.SequenceFlow;

/**
 * A sample validator interface for {@link org.obeonetwork.dsl.bpmn2.FlowNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FlowNodeValidator {
	boolean validate();

	boolean validateOutgoing(EList<SequenceFlow> value);

	boolean validateIncoming(EList<SequenceFlow> value);

	boolean validateLanes(EList<Lane> value);
}
