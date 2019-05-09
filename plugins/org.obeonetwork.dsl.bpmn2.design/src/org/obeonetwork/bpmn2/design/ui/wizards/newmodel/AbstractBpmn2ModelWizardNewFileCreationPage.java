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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * An extension to provide BPMN2 designer custom provider in model content view.
 *
 * @author ymortier
 */
public abstract class AbstractBpmn2ModelWizardNewFileCreationPage extends WizardNewFileCreationPage {

	/**
	 * Constructor.
	 *
	 * @param pageName the page name
	 * @param selection the selection
	 */
	public AbstractBpmn2ModelWizardNewFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
	}

	public IFile getModelFile() {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected boolean validatePage() {
		if (super.validatePage()) {
			final String requiredExt = getRequiredExtension();
			final String enteredExt = new Path(getFileName()).getFileExtension();
			if (enteredExt == null || !enteredExt.equals(requiredExt)) {
				setErrorMessage(Messages.bind(Messages.Bpmn2ModelWizard_UI_ErrorMsg_BadFileExtension,
						requiredExt));
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	/**
	 * This method should return the extension of the file to create.
	 * 
	 * @return the file extension to create.
	 */
	protected abstract String getRequiredExtension();
}
