/*
 * Copyright (c) 2007-2008-2009-2010 Obeo
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.bpmn2.samples.pack.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.obeonetwork.dsl.bpmn2.samples.wizards.Bpmn2Sample;
import org.obeonetwork.dsl.bpmn2.samples.pack.core.l10n.Messages;

/**
 * 
 * @author Stephane Drapeau - Obeo
 * 
 */
public class TravelAgencySample extends Bpmn2Sample {

	/**
	 * @throws MalformedURLException
	 */
	public TravelAgencySample() throws MalformedURLException {
		super(
				new URL(CoreSamplePlugin.getDefault().getZipURL()
						+ "examples/travelagency.zip"), //$NON-NLS-1$
				Messages.Bpmn2TravelAgencySample_title,
				Messages.Bpmn2TravelAgencySample_desc,
				0,
				CoreSamplePlugin
						.getDefault()
						.findImageDescriptor(
								"/org.obeonetwork.dsl.bpmn2.samples.pack.core/images/travelagency-logo.png")); //$NON-NLS-1$
	}

}
