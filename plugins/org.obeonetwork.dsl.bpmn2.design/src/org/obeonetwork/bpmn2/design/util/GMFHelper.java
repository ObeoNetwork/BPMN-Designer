/**
 * Copyright (c) 2011-2024 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.bpmn2.design.util;

import org.eclipse.gmf.runtime.notation.Node;

public class GMFHelper {

	public static boolean isGmfLabelNode(Object it) {
		if (!(it instanceof Node)) {
			return false;
		}
		Node node = (Node) it;
		return node.getPersistedChildren().isEmpty() && node.getType() != null;
	}
}
