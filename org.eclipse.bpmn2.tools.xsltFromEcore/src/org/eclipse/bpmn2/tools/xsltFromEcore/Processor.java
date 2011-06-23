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

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.bpmn2.tools.xsltFromEcore.jet.JetInput;
import org.eclipse.bpmn2.tools.xsltFromEcore.jet.XMIToXML;
import org.eclipse.bpmn2.tools.xsltFromEcore.jet.XMLToXMI;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class Processor {


	public class Model {
		private Resource resource;

		public EPackage getPackage() {
			return (EPackage) resource.getContents().get(0);
		}

		public Resource getResource() {
			return resource;
		}

		public void load(String path) throws IOException {
			if (resource != null) {
				resource.unload();
			}
			
			URI fileUri = URI.createFileURI(path);
			resource = resourceSet.getResource(fileUri, true);
		}

	}


	private ResourceSet resourceSet;
	public Model mofBpmnModel = new Model();
	public Model mofBpmndiModel = new Model();
	public Model mofDiModel = new Model();
	public Model mofDcModel = new Model();
	

	public Processor() {
		this.resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().
	    put("ecore", new EcoreResourceFactoryImpl());
	}

	public List<EClass> getMofContent() {
		ArrayList<EClass> result = new ArrayList<EClass>();
		addPackage(mofBpmnModel.getPackage(), result);
		addPackage(mofBpmndiModel.getPackage(), result);
		addPackage(mofDiModel.getPackage(), result);
		addPackage(mofDcModel.getPackage(), result);
		return result;
	}

	private void addPackage(EPackage pack, ArrayList<EClass> result) {
		for (EClassifier classifier : pack.getEClassifiers()) {
			if (classifier instanceof EClass && !"DocumentRoot".equals(classifier.getName())) {
				result.add((EClass) classifier);
			}
		}
	}

	

	private String outputPath;
	

	public void loadEcores(String path, String bpmn, String bpmnDi, String di, String dc) throws IOException {
		this.outputPath = path;
		mofBpmnModel.load(path + "/" + bpmn);
		mofBpmndiModel.load(path + "/" + bpmnDi);
		mofDiModel.load(path + "/" + di);
		mofDcModel.load(path + "/" + dc);	
	}

	public void process() {
		

		try {
			
			JetInput jetInput = new JetInput(this);

			XMLToXMI xslt1 = new XMLToXMI();
			FileWriter writer = new FileWriter(outputPath + "/XMLToXMI.xslt");
			writer.append(xslt1.generate(jetInput));
			writer.close();
			XMIToXML xslt2 = new XMIToXML();
			writer = new FileWriter(outputPath + "/XMIToXML.xslt");
			writer.append(xslt2.generate(jetInput));
			writer.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	
}
