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
package org.obeonetwork.bpmn2.design.ui;

import org.eclipse.emf.ecore.EClass;

/**
 * Constants and basic utilities for UI.
 * 
 * @author nperansin
 */
public class UiConstants {

	/** Icon extension. */
	public static final String ICON_EXT = ".png";
	
	/** BPMN Edit plugin. */
	public static final String EDIT_PLUGIN = "org.obeonetwork.dsl.bpmn2.edit";

	/** BPMN icons path. */
	public static final String EDIT_ICONS_PATH = EDIT_PLUGIN + "/icons/full/obj16/";

	/**
	 * Returns the path of icon associated to provide EClass of BPMN.
	 * 
	 * @param it eClass
	 * @return path
	 */
	public static String getEditIconPath(EClass it) {
		return EDIT_ICONS_PATH + it.getName() + ICON_EXT;
	}

}
