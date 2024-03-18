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

import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;

/**
 * 
 * @author nperansin
 */
class EdgeLayout extends RepresentationLayout<EdgeMapping, DEdge> {

	final EdgeLayoutData data;

	protected EdgeLayout(DEdge src, Session session) {
		super(src, src.getParentDiagram(), session);
		View view = SiriusGMFHelper.getGmfView(src, session);
		data = view instanceof Edge ? new EdgeLayoutData(src, (Edge) view) : null;
	}

	@Override
	protected void update(DEdge target) {
		View gmfView = SiriusGMFHelper.getGmfView(target, session);
		if (gmfView instanceof Edge) {
			data.update(target, (Edge) gmfView);
		}
	}

}