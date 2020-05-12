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
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

/**
 * 
 * @author sdrapeau
 *
 */
public class NamingService {

	/** Label provider */
	private static final AdapterFactoryLabelProvider LABEL_PROVIDER = new AdapterFactoryLabelProvider(
			new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));

	public String getPropertiesTitle(EObject eObj) {
		String msg = Messages.NamingService_0;
		msg = msg + LABEL_PROVIDER.getText(eObj);
		return msg;
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
