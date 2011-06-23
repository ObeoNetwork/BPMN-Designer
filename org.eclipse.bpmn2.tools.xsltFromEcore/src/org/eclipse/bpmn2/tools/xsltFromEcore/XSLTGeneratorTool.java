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

package org.eclipse.bpmn2.tools.xsltFromEcore;

import java.io.IOException;


/**
 * This little tool takes the merged BPMN ECore as input. From it the tool generated the 2 XSLT 
 * scripts that convert from XMI to XML and vice versa. 
 * The tool was used to generate the official XSLTs that come with the OMG standard package.
 */
public class XSLTGeneratorTool {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		if (args.length < 5)
		{
			System.out.println("Usage:\nXSLTGeneratorTool <ECore_Directory> <bpmnEcore> <bpmndiEcore> <diEcore> <dcEcore>\n"+
					"E.g. XSLTGeneratorTool C:/ws/helios_mdt/BPMN/src/merged BPMN20.ecore bpmndi.ecore di.ecore dc.ecore");
			return;
		}
				
		Processor processor = new Processor();
		processor.loadEcores(args[0], args[1], args[2], args[3], args[4]);
		processor.process();

	}

}
