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
package org.obeonetwork.dsl.bpmn2.samples.wizards;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.PlatformUI;

/**
 * 
 * @author Stephane Drapeau - Obeo
 * 
 */
public class Bpmn2SampleWizardPage extends WizardPage {

	/**
	 * 
	 */
	private FormBrowser browser;

	/**
	 * 
	 */
	private Table table;

	/**
	 * 
	 */
	private ImageCanvas canvas;

	/**
	 * @param pageName
	 */
	protected Bpmn2SampleWizardPage(String pageName) {
		super(pageName);
	}

	/**
	 * @param pageName
	 * @param title
	 * @param titleImage
	 */
	protected Bpmn2SampleWizardPage(String pageName, String title,
			ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	public void createControl(Composite parent) {
		browser = new FormBrowser(SWT.BORDER | SWT.V_SCROLL);
		browser.setText(""); //$NON-NLS-1$
		final Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		table = new Table(container, SWT.SINGLE | SWT.BORDER);
		table.addListener(SWT.SELECTED, new Listener() {
			public void handleEvent(Event event) {
				Bpmn2SampleWizardPage.this.handleEvent();
			}
		});
		table.addListener(SWT.MouseDown, new Listener() {
			public void handleEvent(Event event) {
				Bpmn2SampleWizardPage.this.handleEvent();
			}
		});

		TableItem tableItem = null;
		for (Bpmn2Sample bpmn2Sample : ((ProjectUnzipperNewWizard) this
				.getWizard()).getBpmn2Samples()) {
			tableItem = new TableItem(table, SWT.NONE);
			tableItem.setText(bpmn2Sample.getTitle());
		}
		GridData gdTable = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.FILL_VERTICAL);
		gdTable.heightHint = 100;
		table.setLayoutData(gdTable);

		browser.createControl(container);
		Control c = browser.getControl();
		GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.FILL_VERTICAL);
		gd.heightHint = 100;
		gd.widthHint = 400;
		c.setLayoutData(gd);

		canvas = new ImageCanvas(container, SWT.NONE);
		canvas.setImage(null);
		final GridData gdImage = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.FILL_VERTICAL);
		gdImage.heightHint = 100;
		gdImage.widthHint = 800;
		canvas.setLayoutData(gdImage);

		setControl(container);
		Dialog.applyDialogFont(container);
	}

	/**
	 * @return
	 */
	int getSelection() {
		return this.table.getSelectionIndex();
	}

	/**
	 * 
	 */
	private void handleEvent() {
		if (this.getSelection() > -1) {
			browser.setText(((ProjectUnzipperNewWizard) this.getWizard())
					.getBpmn2Samples().get(table.getSelectionIndex())
					.getDescription());
			ImageDescriptor imageDescriptor = ((ProjectUnzipperNewWizard) this
					.getWizard()).getBpmn2Samples()
					.get(table.getSelectionIndex()).getImageDesc();
			Image image = imageDescriptor.createImage();
			this.canvas.setImage(image);
		}
	}

}
