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
package org.obeonetwork.dsl.bpmn2.samples.wizards;

/**
 * 
 * @author Stephane Drapeau - Obeo
 * 
 */
public interface PostInit {

	/**
	 * @param projectName
	 */
	void postInit(String projectName) throws Exception;

}
