/*
 * Copyright (c) 2011-2013 Obeo.
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

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;

/**
 * 
 * @author Stephane Drapeau - Obeo
 * 
 */
public class Bpmn2Sample {

	/**
	 * 
	 */
	private URL zipURL;

	/**
	 * 
	 */
	private String title;

	/**
	 * 
	 */
	private String description;

	/**
	 * 
	 */
	private ImageDescriptor imageDesc;
	
	/**
	 * 
	 */
	private int difficulty;

	/**
	 * @param zipURLC
	 * @param titleC
	 * @param descC
	 * @param difficulty the lowest value means the easiest level
	 * @param imageDescC
	 */
	public Bpmn2Sample(URL zipURLC, String titleC, String descC, int difficulty,
			ImageDescriptor imageDescC) {
		this.zipURL = zipURLC;
		this.title = titleC;
		this.description = descC;
		this.difficulty = difficulty;
		this.imageDesc = imageDescC;
	}

	/**
	 * @return
	 */
	public URL getZipURL() {
		return zipURL;
	}

	/**
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @return the difficulty
	 */
	public int getDifficulty() {	
		return difficulty;
	}

	/**
	 * @return
	 */
	public ImageDescriptor getImageDesc() {
		return imageDesc;
	}

}
