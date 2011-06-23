/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */

package org.eclipse.bpmn2.tools.ecoremerger;

import java.io.IOException;


/**
 * This little tool merges two ECore models: One created from OMG BPMN CMOF and one created from OMG BPMN XSD.
 * The tool would be needed if OMG releases a new version and the ECore must be regenerated.
 *
 */
public class EcoreMergerTool {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		if (args.length < 6)
		{
			System.out.println("Usage:\nECoreMergerTool <CMOF_Directory> <XSD_Directory> <bpmnEcore> <bpmndiEcore> <diEcore> <dcEcore>\n"+
					"E.g. ECoreMergerTool C:/ws/helios_mdt/BPMN/src/cmof C:/ws/helios_mdt/BPMN/src/xsd BPMN20.ecore bpmndi.ecore di.ecore dc.ecore");
			return;
		}
				
		Processor processor = new Processor();
		processor.loadAll(args);
		processor.process();

	}

}
