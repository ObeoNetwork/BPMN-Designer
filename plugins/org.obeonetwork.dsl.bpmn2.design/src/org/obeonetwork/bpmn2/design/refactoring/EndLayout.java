/**
 * Copyright (c) 2024 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.bpmn2.design.refactoring;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.EdgeTarget;

/**
 * 
 * @author nperansin
 */
class EndLayout extends EdgeLayout {
	final boolean targetChange;
	final EdgeTarget end;
	final boolean outEnd;
	final boolean endChange;

	protected EndLayout(DEdge src, AbstractDNode targeting, boolean out, Session session) {
		super(src, session);
		targetChange = src.getTarget() == targeting.getTarget();
		outEnd = out;
		end = SiriusElementRefactorHelper.getEnd(src, out);
		endChange = end == targeting;
	}

	protected boolean match(DEdge it, AbstractDNode previous, AbstractDNode current) {
		EObject expectedTarget = targetChange ? current.getTarget() : target.getTarget();
		EdgeTarget actualEnd = SiriusElementRefactorHelper.getEnd(it, outEnd);
		EdgeTarget expectedEnd = endChange ? (EdgeTarget) current : end;

		return it.getTarget() == expectedTarget // proper target
				&& actualEnd == expectedEnd // proper end
				&& it.getMapping() == mapping; // proper mapping
	}

}