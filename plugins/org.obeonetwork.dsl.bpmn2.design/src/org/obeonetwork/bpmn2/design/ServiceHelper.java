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

import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.obeonetwork.dsl.bpmn2.Definitions;
import org.obeonetwork.dsl.bpmn2.Process;

public class ServiceHelper {

	/**
	 * Return the cross referencer attached to a particular EObject.
	 * 
	 * @param eo
	 *            EObject
	 * @return the cross referencer if it exists.
	 */
	public static ECrossReferenceAdapter getCrossReferenceAdapter(EObject eo) {
		ECrossReferenceAdapter eCrossReferenceAdapter = null;
		Iterator<Adapter> it = eo.eAdapters().iterator();
		while (eCrossReferenceAdapter == null && it.hasNext()) {
			Adapter adapter = it.next();
			if (adapter instanceof ECrossReferenceAdapter) {
				eCrossReferenceAdapter = (ECrossReferenceAdapter) adapter;
			}
		}
		return eCrossReferenceAdapter;
	}

	public static EObject trace(EObject eObject) {
		System.out.println("Trace(" + eObject + ")");
		return eObject;
	}

	public static Definitions getDefinitionsObject(EObject eObject) {
		if(eObject==null) {
			return null;
		}
		if(eObject instanceof Definitions) {
			return (Definitions) eObject;
		}
		return getDefinitionsObject(eObject.eContainer());
	}
	
	public static Process getProcess(EObject eObject) {
		if(eObject==null) {
			return null;
		}
		if(eObject instanceof Process) {
			return (Process) eObject;
		}
		return getProcess(eObject.eContainer());
	}
	
}
