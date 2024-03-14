/**
 * Copyright (c) 2011-2020 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.bpmn2.design;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * 
 * @author sdrapeau
 *
 */
public class SetUnsetExternalLabels implements IExternalJavaAction {


	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		if (parameters == null) {
			return;
		}

		Object o = parameters.get("views");
		if (o instanceof List) {
			for (Object oo : (List<?>) o) {
				if (oo instanceof DNode) {
					DNode dNode= (DNode)oo;
					if (ServiceHelper.isExternalLabel(dNode)) {
						ServiceHelper.setInternalLabel(dNode);
					} else {
						ServiceHelper.setExternalLabel(dNode);
					}
				}
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
