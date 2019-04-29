/**
 * Copyright (c) 2011-2019 Obeo.
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

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author sdrapeau
 *
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.obeonetwork.bpmn2.design.messages"; //$NON-NLS-1$

	public static String PropertiesTitle;

	public static String CancelLabel;

	public static String AttributesLabel;

	public static String NameLabel;

	public static String HelpNameLabel;

	public static String TaskAttributeNaming;

	public static String DescriptionLabel;

	public static String HelpDescriptionLabel;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
