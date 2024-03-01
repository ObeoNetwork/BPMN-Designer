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

import java.util.Optional;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.obeonetwork.bpmn2.design.Activator;

/**
 * Class to display choices in a menu to User.
 * 
 * @author nperansin
 */
public class PopupChoiceSelector<R> {

	private R result = null;
	private boolean provided = false;
	private Display ui;
	private Menu menu;
	
	/**
	 * Default contructor.
	 */
	public PopupChoiceSelector() {
		ui = Display.getCurrent();
		menu = new Menu(ui.getFocusControl());
	}
	
	
	/**
	 * Add an item to the list of choices.
	 * 
	 * @param text
	 * @param iconPath
	 * @param value
	 * @return
	 */
	public MenuItem addItem(String text, String iconPath, R value) {
		MenuItem choice = new MenuItem(menu, SWT.NONE);
		choice.setText(text);
		if (iconPath != null) {
			choice.setImage(Activator.getDefault().getImageFromPath(iconPath));
		}
		
		choice.addSelectionListener(SelectionListener.widgetSelectedAdapter(evt -> {
			result = value;
			provided = true;
		}));
		return choice;
	}
	
	public Optional<R> perform() {
		menu.setLocation(ui.getCursorLocation());
		menu.setVisible(true);

		while (!menu.isDisposed() && menu.isVisible()) {
			if (!ui.readAndDispatch()) {
				ui.sleep();
			}
		}
		menu.dispose();
		return provided 
			? Optional.of(result) 
			: Optional.empty();
	}
	
}
