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

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;

/**
 * 
 * @author nperansin
 */
abstract class RepresentationLayout<M extends DiagramElementMapping, D extends DDiagramElement> {
	
	static <T extends RepresentationLayout<?, ?>> T findLayout(Collection<T> layouts, DDiagramElement element) {
		return layouts.stream().filter(
				it -> it.target.getTarget() == element.getTarget() && it.mapping == element.getDiagramElementMapping())
				.findFirst().orElse(null);
	}

	final Session session;

	final D target;
	final EObject container; // DDiagram, AbstractDNode{border}, DNodeContainer, DNodeList
	final M mapping;
	D newView;

	@SuppressWarnings("unchecked")
	protected RepresentationLayout(D src, EObject parent, Session session) {

		this.session = session;
		target = src;
		this.container = parent;
		mapping = (M) src.getDiagramElementMapping();
	}

	protected void bind(D view) {
		newView = view;
	}

	protected void update() {
		if (newView != null) {
			update(newView);
		}
	}

	protected abstract void update(D newView);
	
	
}
