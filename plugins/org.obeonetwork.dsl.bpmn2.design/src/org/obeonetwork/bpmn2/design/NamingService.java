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

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author sdrapeau
 *
 */
public class NamingService {

	public String getPropertiesTitle(EObject eObj) {
		return Messages.PropertiesTitle;
	}

	public String getCancelLabel(EObject eObj) {
		return Messages.CancelLabel;
	}

	public String getAttributesLabel(EObject eObj) {
		return Messages.AttributesLabel;
	}

	public String getNameLabel(EObject eObj) {
		return Messages.NameLabel;
	}

	public String getHelpNameLabel(EObject eObj) {
		return Messages.HelpNameLabel;
	}

	public String getDescriptionLabel(EObject eObj) {
		return Messages.DescriptionLabel;
	}

	public String getHelpDescriptionLabel(EObject eObj) {
		return Messages.HelpDescriptionLabel;
	}

}
