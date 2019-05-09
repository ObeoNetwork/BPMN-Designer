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
package org.obeonetwork.bpmn2.design.ui.wizards.newmodel;

import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * The semantic model file creation page.
 *
 * @author ymortier
 */
public class Bpmn2ModelWizardNewModelFilePage extends AbstractBpmn2ModelWizardNewFileCreationPage {

	/**
	 * Constructor.
	 *
	 * @param pageName the page name
	 * @param selection the selection
	 */
	public Bpmn2ModelWizardNewModelFilePage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
	}

	protected String getRequiredExtension() {
		return Bpmn2ModelWizard.MODEL_FILE_EXTENSION;
	}
}
