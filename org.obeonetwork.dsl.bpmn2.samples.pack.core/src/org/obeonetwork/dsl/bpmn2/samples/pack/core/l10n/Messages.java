/*
 * Copyright (c) 2011-2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.dsl.bpmn2.samples.pack.core.l10n;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Stephane Drapeau - Obeo
 * 
 */
public final class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.obeonetwork.dsl.bpmn2.samples.pack.core.l10n.Messages";//$NON-NLS-1$

	private Messages() {
		// Do not instantiate
	}

	public static String Bpmn2TestSample_title;
	public static String Bpmn2TestSample_desc;
	
	public static String Bpmn2TravelAgencySample_title;
	public static String Bpmn2TravelAgencySample_desc;
	
	public static String Bpmn2NobelPrizeSample_title;
	public static String Bpmn2NobelPrizeSample_desc;
	

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}