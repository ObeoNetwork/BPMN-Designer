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

package org.eclipse.bpmn2.tools.xsltFromEcore.jet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.bpmn2.tools.xsltFromEcore.Processor;
import org.eclipse.bpmn2.util.NamespaceHelper;
import org.eclipse.bpmn2.util.XmlExtendedMetadata;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

public class JetInput {

    public JetInput(Processor processor) {
        this.processor = processor;

        // Register XMI and XML packages
        EPackage pack = processor.mofBpmnModel.getPackage();
        this.extendedMetadata.putPackage(pack.getNsURI(), pack);
        this.extendedMetadata.putPackage(NamespaceHelper.xmiToXsdNamespaceUri(pack.getNsURI()),
                pack);

        pack = processor.mofBpmndiModel.getPackage();
        this.extendedMetadata.putPackage(pack.getNsURI(), pack);
        this.extendedMetadata.putPackage(NamespaceHelper.xmiToXsdNamespaceUri(pack.getNsURI()),
                pack);

        pack = processor.mofDiModel.getPackage();
        this.extendedMetadata.putPackage(pack.getNsURI(), pack);
        this.extendedMetadata.putPackage(NamespaceHelper.xmiToXsdNamespaceUri(pack.getNsURI()),
                pack);

        pack = processor.mofDcModel.getPackage();
        this.extendedMetadata.putPackage(pack.getNsURI(), pack);
        this.extendedMetadata.putPackage(NamespaceHelper.xmiToXsdNamespaceUri(pack.getNsURI()),
                pack);
    }

    private Processor processor;

    public List<EClass> getClasses() {
        return processor.getMofContent();
    }

    private ExtendedMetaData extendedMetadata = new XmlExtendedMetadata();

    public String getElementName(EClass c) {
        return getExtendedMetadata().getName(c);

    }

    public ExtendedMetaData getExtendedMetadata() {
        return extendedMetadata;
    }

    private boolean isXmiAttribute(EStructuralFeature feature) {
        return feature.getUpperBound() == 1 && feature.getEType() instanceof EDataType;
    }

    private boolean isXmlAttribute(EStructuralFeature feature) {
        return ExtendedMetaData.ATTRIBUTE_FEATURE == extendedMetadata.getFeatureKind(feature);
    }

    public List<EStructuralFeature> getAllFeatureThatAreAttributesInXMI(EClass c) {
        ArrayList<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
        for (EStructuralFeature feature : c.getEStructuralFeatures()) {
            if (isXmiAttribute(feature))
                result.add(feature);
        }
        return result;
    }

    public List<EStructuralFeature> getAllFeatureThatAreReferences(EClass c) {
        ArrayList<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
        for (EStructuralFeature feature : c.getEReferences()) {
            if (isReference(feature))
                result.add(feature);
        }
        return result;
    }

    boolean isReference(EStructuralFeature feature) {
        if (feature instanceof EReference) {
            EReference ref = (EReference) feature;
            return !ref.isContainment();
        }
        return false;
    }

    public List<EStructuralFeature> getAllOtherFeaturesInXMI(EClass c) {
        ArrayList<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
        for (EStructuralFeature feature : c.getEStructuralFeatures()) {
            if (!isXmiAttribute(feature) && !isReference(feature)) {
                result.add(feature);
            }
        }
        return result;
    }

    public String getXPathForXml(EStructuralFeature feature) {

        if (isXmlAttribute(feature)) {
            return "@" + extendedMetadata.getName(feature);
        } else {
            String prefix = getPrefix(feature);

            return prefix + ":" + extendedMetadata.getName(feature);
        }
    }

    public String getPrefix(EStructuralFeature feature) {
        String prefix = "bpmn2";
        String ns = extendedMetadata.getNamespace(feature);
        if (ns != null) {
            if (!ns.endsWith("-XMI")) {
                ns = ns + "-XMI";
            }
            EPackage pack = extendedMetadata.getPackage(ns);
            if (pack != null) {
                prefix = pack.getNsPrefix();
            }
        }
        return prefix;
    }

    public String getNamespace(EStructuralFeature feature) {
        String result = extendedMetadata.getNamespace(feature);
        if (result == null) {
            result = extendedMetadata.getNamespace(feature.getEContainingClass());
        }
        return result;

    }

    private Map<EStructuralFeature, List<EStructuralFeature>> affiliations;

    private void addAffiliation(EStructuralFeature group, EStructuralFeature substitute) {
        List<EStructuralFeature> entry = affiliations.get(group);
        if (entry == null) {
            entry = new ArrayList<EStructuralFeature>();
            affiliations.put(group, entry);
        }
        entry.add(substitute);
    }

    private void buildAffilations() {
        affiliations = new HashMap<EStructuralFeature, List<EStructuralFeature>>();
        EPackage[] packagesWithDocumentRoot = new EPackage[] { processor.mofBpmnModel.getPackage(),
                processor.mofBpmndiModel.getPackage(), processor.mofDiModel.getPackage(),
                processor.mofDcModel.getPackage() };
        for (EPackage pack : packagesWithDocumentRoot) {
            for (EStructuralFeature globalElement : extendedMetadata.getDocumentRoot(pack)
                    .getEAllStructuralFeatures()) {
                EStructuralFeature affiliation = extendedMetadata.getAffiliation(globalElement);
                if (affiliation != null) {
                    addAffiliation(affiliation, globalElement);
                }
            }
        }
    }

    private List<EStructuralFeature> getAllAffiliationsFor(EStructuralFeature group) {
        if (this.affiliations == null) {
            buildAffilations();
        }
        ArrayList<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
        addRecursive(result, affiliations.get(group));
        return result;
    }

    private void addRecursive(List<EStructuralFeature> result, List<EStructuralFeature> current) {
        if (current != null) {
            result.addAll(current);
            for (EStructuralFeature c : current) {
                addRecursive(result, affiliations.get(c));
            }
        }
    }

    public boolean hasSubFeatures(EStructuralFeature feature) {
        return extendedMetadata.getGroup(feature) != null;
    }

    public List<EStructuralFeature> getAllSubFeatures(EStructuralFeature feature) {
        EStructuralFeature group = extendedMetadata.getGroup(feature);
        if (group != null) {
            return getAllAffiliationsFor(extendedMetadata.getElement(
                    extendedMetadata.getNamespace(group), extendedMetadata.getName(group)));
        }
        return null;
    }

    public String getSubFeaturesXPath(EStructuralFeature feature) {
        StringBuilder result = new StringBuilder();
        List<EStructuralFeature> allSubFeatures = getAllSubFeatures(feature);
        if (allSubFeatures != null) {
            for (int i = 0; i < allSubFeatures.size(); i++) {
                result.append(getXPathForXml(allSubFeatures.get(i)));
                if (i < allSubFeatures.size() - 1) {
                    result.append("|");
                }

            }
        } else {
            result.append(getXPathForXml(feature));
        }
        return result.toString();
    }

    public List<EStructuralFeature> getAllFeatureThatAreAttributesInXml(EClass c) {
        ArrayList<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
        for (EStructuralFeature feature : c.getEStructuralFeatures()) {
            if (isXmlAttribute(feature))
                result.add(feature);
        }
        return result;
    }

    public Object getXPathForXMI(EStructuralFeature feature) {
        if (isXmiAttribute(feature) || isReference(feature)) {
            return "@" + feature.getName();
        } else {
            return feature.getName();
        }
    }

    public List<EStructuralFeature> getAllElementsInXml(EClass c) {
        ArrayList<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
        for (EStructuralFeature feature : c.getEStructuralFeatures()) {
            if (!isXmlAttribute(feature))
                result.add(feature);
        }
        /*
         * Collections.sort(result, new Comparator<EStructuralFeature>() {
         * 
         * @Override public int compare(EStructuralFeature o1,
         * EStructuralFeature o2) { int index1 = getIndexOfFeature(o1); int
         * index2 = getIndexOfFeature(o2); return index1 - index2; } });
         */
        return result;

    }

    public boolean isSimpleElement(EStructuralFeature feature) {
        return !isXmlAttribute(feature) && isXmiAttribute(feature);
    }
}
