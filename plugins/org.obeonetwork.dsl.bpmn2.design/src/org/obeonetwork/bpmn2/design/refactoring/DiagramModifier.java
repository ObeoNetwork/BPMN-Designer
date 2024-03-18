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
import java.util.HashMap;
import java.util.Map;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.util.RefreshIdsHolder;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.diagram.business.api.componentization.DiagramMappingsManager;
import org.eclipse.sirius.diagram.business.api.componentization.DiagramMappingsManagerRegistry;
import org.eclipse.sirius.diagram.business.internal.helper.decoration.DecorationHelperInternal;
import org.eclipse.sirius.diagram.business.internal.sync.DDiagramElementSynchronizer;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.MappingBasedDecoration;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.eclipse.sirius.tools.api.SiriusPlugin;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.eclipse.sirius.viewpoint.description.SemanticBasedDecoration;

/**
 * 
 * @author nperansin
 */
@SuppressWarnings("restriction")
class DiagramModifier {

	final Session session;
	final DSemanticDiagram parent;
	final ModelAccessor accessor;
	final IInterpreter interpreter;
	final DDiagramElementSynchronizer dsync;
	final DiagramMappingsManager mmapping;
	final RefreshIdsHolder idFactory;

	Map<DiagramElementMapping, Collection<EdgeTarget>> mappingsToEdgeTargets = null;
	final Map<EdgeMapping, Collection<MappingBasedDecoration>> edgeToMappings = new HashMap<>();
	final Map<String, Collection<SemanticBasedDecoration>> edgeToSemantics = new HashMap<>();

	protected DiagramModifier(DSemanticDiagram diagram, Session session) {
		this.session = session;
		parent = diagram;
		accessor = SiriusPlugin.getDefault().getModelAccessorRegistry().getModelAccessor(diagram);
		mmapping = DiagramMappingsManagerRegistry.INSTANCE.getDiagramMappingsManager(session, diagram);
		interpreter = InterpreterUtil.getInterpreter(diagram);
		dsync = new DDiagramElementSynchronizer(diagram, interpreter, accessor);
		idFactory = RefreshIdsHolder.getOrCreateHolder(diagram);
	}

	protected void prepareEdges() {
		if (mappingsToEdgeTargets != null) {
			return;
		}
		mappingsToEdgeTargets = dsync.computeMappingsToEdgeTargets(session.getSelectedViewpoints(false));
		// Initialize cache
		new DecorationHelperInternal(parent, interpreter, accessor).computeDecorations(mappingsToEdgeTargets,
				edgeToSemantics, edgeToMappings);
		// TODO update with new nodes ?
	}

}
