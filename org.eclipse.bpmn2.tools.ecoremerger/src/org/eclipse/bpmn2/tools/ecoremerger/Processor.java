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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.eclipse.bpmn2.tools.ecoremerger.exceptions.AttributeMappingExcpetion;
import org.eclipse.bpmn2.tools.ecoremerger.exceptions.ClassMappingException;
import org.eclipse.bpmn2.tools.ecoremerger.exceptions.ExceptionsPackage;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

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
            XMIResourceFactoryImpl factory = new XMIResourceFactoryImpl();
            resource = factory.createResource(fileUri);
            resource.load(null);
            resourceSet.getResources().add(resource);
        }

    }

    private final static Logger LOGGER = Logger.getLogger(Processor.class.getName());
    private ResourceSet resourceSet;
    private Resource exceptionsResource;
    private String logfilePath;
    public Model mofBpmnModel = new Model();
    public Model mofBpmndiModel = new Model();
    public Model mofDiModel = new Model();
    public Model mofDcModel = new Model();
    public Model xsdBpmnModel = new Model();
    public Model xsdBpmndiModel = new Model();
    public Model xsdDiModel = new Model();

    public Model xsdDcModel = new Model();

    public Processor() {
        this.resourceSet = new ResourceSetImpl();

    }

    private void applyExtendedMetadata(EModelElement target, EModelElement source) {
        if (source == null || target == null) {
            // LOGGER.severe("Extended Metadata for nothing.");
            return;
        }

        EAnnotation targetExtendedMetadata = target.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);
        if (targetExtendedMetadata != null) {
            // LOGGER.warning(getName(target) + " already has ExtendedMetadata");
            return;
        }
        EAnnotation extendedMetadata = source.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);
        if (extendedMetadata != null) {
            LOGGER.info("Patching ExtendedMetadata from " + getName(source) + " to "
                    + getName(target));

            extendedMetadata = (EAnnotation) EcoreUtil.copy(extendedMetadata);

            patchExtendedMetadata(target, extendedMetadata);

            target.getEAnnotations().add(extendedMetadata);

        }
    }

    private void patchExtendedMetadata(EModelElement target, EAnnotation extendedMetadata) {
        // Patch ExtendedMetadata entries with key "group". By default they have a value
        // called "<grouname>:group" which refers to the FeatureMap-type attribute called "<groupname>Group".
        // As we don't copy those feature maps (we don't need, as we have only one feature the refers),
        // we patch the group to the "global" group

        for (Map.Entry<String, String> entry : extendedMetadata.getDetails()) {
            EClassifier clazz = null;
            if (target instanceof EClassifier)
                clazz = (EClassifier) target;
            else if (target instanceof EStructuralFeature) {
                clazz = ((EStructuralFeature) target).getEContainingClass();
            }
            String packageUri = clazz.getEPackage().getNsURI();
            if (packageUri.endsWith("-XMI")) {
                packageUri = packageUri.substring(0, packageUri.length() - 4);
            }
            if ("group".equalsIgnoreCase(entry.getKey())) {
                String value = entry.getValue();
                int colonIndex = value.indexOf(':');
                if (colonIndex >= 0) {
                    value = value.substring(0, colonIndex);
                    value = packageUri + "#" + value;
                    entry.setValue(value);
                }

            } else if ("namespace".equalsIgnoreCase(entry.getKey())) {
                String value = entry.getValue();
                if ("##targetNamespace".equals(value)) {

                    value = packageUri;
                    entry.setValue(value);

                }
            } else if ("affiliation".equalsIgnoreCase(entry.getKey())) {
                String value = entry.getValue();
                if (!value.contains("#")) {
                    value = packageUri + "#" + value;
                    entry.setValue(value);
                }
            }
        }
    }

    private EStructuralFeature getCorrespondingFeature(EClass mofClass,
            EStructuralFeature xsdFeature, ClassMappingException exception) {
        EStructuralFeature result = null;
        if (mofClass != null) {
            String mofFeatureName = xsdFeature.getName();
            if (exception != null) {
                for (AttributeMappingExcpetion ex : exception.getAttributeExceptions()) {
                    if (ex.getXsdAttributeName() != null
                            && ex.getXsdAttributeName().equals(xsdFeature.getName())) {
                        mofFeatureName = ex.getMofAttributeName();
                        break;
                    }
                }
            }
            result = mofClass.getEStructuralFeature(mofFeatureName);
            if (FeatureMap.Entry.class.equals(xsdFeature.getEType().getInstanceClass())) {
                // TODO Check if FeatureMaps are needed in our case
                return null;
            }
            if (result == null) {
                // Hack: DI/DC metamodels don't have ID
                if ("id".equals(xsdFeature.getName())) {
                    result = (EStructuralFeature) EcoreUtil.copy(xsdFeature);
                    mofClass.getEStructuralFeatures().add(result);
                } else {
                    LOGGER.severe("No corresponding field found for "
                            + xsdFeature.getEContainingClass().getName() + "."
                            + xsdFeature.getName() + " on " + mofClass.getName());
                }
            }
        }
        return result;
    }

    private ClassMappingException getExceptionForXsdClass(EClassifier xsdClass) {
        for (EObject object : this.exceptionsResource.getContents()) {
            ClassMappingException exception = (ClassMappingException) object;
            if (xsdClass.getName().equals(exception.getXsdClassName())) {
                return exception;
            }
        }
        return null;
    }

    private EClassifier getMofClass(EClassifier xsdClass, ClassMappingException exception) {
        String xsdClassName = xsdClass.getName();
        String mofClassName = null;
        if (exception != null) {
            mofClassName = exception.getMofClassName();
        } else if (xsdClassName.startsWith("T")) {

            mofClassName = xsdClassName.substring(1);
        } else {
            mofClassName = xsdClassName;
        }
        return getMofClass(mofClassName);
    }

    private EClassifier getClass(EPackage ePackage, String name) {
        for (EClassifier cl : ePackage.getEClassifiers()) {
            if (name.equals(cl.getName()))
                return cl;
        }
        return null;
    }

    private EClassifier getMofClass(String name) {
        for (EClassifier eClassifier : getMofContent()) {
            if (name.equals(eClassifier.getName())) {
                return eClassifier;
            }
        }
        LOGGER.severe("Did not find MOF Class " + name);
        return null;
    }

    public List<EClassifier> getMofContent() {
        ArrayList<EClassifier> result = new ArrayList<EClassifier>();
        addPackage(mofBpmnModel.getPackage(), result);
        addPackage(mofBpmndiModel.getPackage(), result);
        addPackage(mofDiModel.getPackage(), result);
        addPackage(mofDcModel.getPackage(), result);
        return result;
    }

    private void addPackage(EPackage pack, ArrayList<EClassifier> result) {
        for (EClassifier classifier : pack.getEClassifiers()) {
            if (!"DocumentRoot".equals(classifier.getName())) {
                result.add(classifier);
            }
        }
    }

    private String getName(EModelElement element) {
        if (element instanceof EStructuralFeature) {
            EStructuralFeature attribute = (EStructuralFeature) element;
            return attribute.getEContainingClass().getName() + "." + attribute.getName();
        }
        if (element instanceof EClassifier) {
            return ((EClassifier) element).getName();
        }
        return element.toString();
    }

    public List<EClassifier> getXsdContent(boolean includeDocRoot) {
        ArrayList<EClassifier> result = new ArrayList<EClassifier>();
        addPackage(xsdBpmnModel.getPackage(), result);
        addPackage(xsdBpmndiModel.getPackage(), result);
        addPackage(xsdDiModel.getPackage(), result);
        addPackage(xsdDcModel.getPackage(), result);
        return result;
    }

    private void importDocumentRoot(EPackage mofPackage, EPackage xsdPackage) {
        // Import DocumentRoot

        LOGGER.info("<H1>Processing Global Elements - Importing DocumentRoot for "
                + mofPackage.getName() + "</H1>");
        EClass oldDocumentRoot = (EClass) getClass(mofPackage, "DocumentRoot");
        if (oldDocumentRoot != null) {
            LOGGER.warning("Deleting old DocumentRoot");
            EcoreUtil.delete(oldDocumentRoot);
        }
        EClass documentRoot = (EClass) getClass(xsdPackage, "DocumentRoot");
        documentRoot = (EClass) EcoreUtil.copy(documentRoot);
        mofPackage.getEClassifiers().add(documentRoot);
        for (EStructuralFeature feature : documentRoot.getEStructuralFeatures()) {

            EClassifier newEClass = getMofClass(feature.getEType(), null);
            if (newEClass != null) {
                feature.setEType(newEClass);
                LOGGER.info("Changing DocumentRoot." + feature.getName() + " to "
                        + newEClass.getName());
            } else if (xsdPackage.equals(feature.getEType().eContainer())) {
                LOGGER.severe("This would cause cross link. Removing type and replace by EObject.");
                feature.setEType(EcorePackage.Literals.EOBJECT);
            }
            EAnnotation extendedMetadata = feature
                    .getEAnnotation("http:///org/eclipse/emf/ecore/util/ExtendedMetaData");
            if (extendedMetadata != null) {
                patchExtendedMetadata(feature, extendedMetadata);
            }

        }
    }

    public void loadAll(String[] args) throws IOException {
        String cmofpath = args[0];
        mofBpmnModel.load(cmofpath + '/' + args[2]);
        mofBpmndiModel.load(cmofpath + '/' + args[3]);
        mofDiModel.load(cmofpath + '/' + args[4]);
        mofDcModel.load(cmofpath + '/' + args[5]);

        String xsdpath = args[1];
        xsdBpmnModel.load(xsdpath + '/' + args[2]);
        xsdBpmndiModel.load(xsdpath + '/' + args[3]);
        xsdDiModel.load(xsdpath + '/' + args[4]);
        xsdDcModel.load(xsdpath + '/' + args[5]);

        logfilePath = cmofpath + '/' + "log.html";

        @SuppressWarnings("unused")
        ExceptionsPackage dummy = ExceptionsPackage.eINSTANCE; // This is needed to ensure that package registry is filled

        InputStream exceptionsStream = this.getClass().getResourceAsStream("BPMN20.exceptions");
        URI exceptionsURI = URI.createFileURI("BPMN20.exceptions");
        XMIResourceFactoryImpl xmiFactory = new XMIResourceFactoryImpl();
        exceptionsResource = xmiFactory.createResource(exceptionsURI);
        exceptionsResource.load(exceptionsStream, null);
        resourceSet.getResources().add(exceptionsResource);
    }

    public void process() {
        FileHandler fh = null;
        try {
            fh = new FileHandler(logfilePath);
        } catch (SecurityException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        fh.setFormatter(new SimpleHTMLFormatter());
        LOGGER.addHandler(fh);

        importXsdComplexTypesMetadata();

        fixModelFlags();

        importDocumentRoot(this.mofBpmnModel.getPackage(), this.xsdBpmnModel.getPackage());
        importDocumentRoot(this.mofBpmndiModel.getPackage(), this.xsdBpmndiModel.getPackage());
        importDocumentRoot(this.mofDiModel.getPackage(), this.xsdDiModel.getPackage());
        importDocumentRoot(this.mofDcModel.getPackage(), this.xsdDcModel.getPackage());

        // Sort classes alphabetically
        sortClassifiersOfPackage(this.mofBpmnModel.getPackage());
        sortClassifiersOfPackage(this.mofBpmndiModel.getPackage());
        sortClassifiersOfPackage(this.mofDiModel.getPackage());
        sortClassifiersOfPackage(this.mofDcModel.getPackage());

        try {
            this.mofBpmnModel.getResource().save(null);
            this.mofBpmndiModel.getResource().save(null);
            this.mofDiModel.getResource().save(null);
            this.mofDcModel.getResource().save(null);
            fh.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    private void importXsdComplexTypesMetadata() {
        // Import all ExtendedMetatdata
        LOGGER.info("<H1>Processing Complex Types - Import ExtendedMetadata</H1>");
        for (EClassifier xsdClassifier : getXsdContent(false)) {
            LOGGER.info("<H3>Processing " + xsdClassifier.getName() + "</H3>");

            ClassMappingException exception = getExceptionForXsdClass(xsdClassifier);
            EClassifier mofClassifier = getMofClass(xsdClassifier, exception);
            if (mofClassifier != null) {

                applyExtendedMetadata(mofClassifier, xsdClassifier);

                if (xsdClassifier instanceof EClass && mofClassifier instanceof EClass) {

                    EClass mofClass = (EClass) mofClassifier;
                    EClass xsdClass = (EClass) xsdClassifier;

                    for (EStructuralFeature xsdFeature : xsdClass.getEStructuralFeatures()) {
                        EStructuralFeature mofFeature = getCorrespondingFeature(mofClass,
                                xsdFeature, exception);
                        if (mofFeature != null) {
                            applyExtendedMetadata(mofFeature, xsdFeature);

                            // Set the references in MOF side based on the type on XSD side.
                            // IDREF will be local only - this non proxy resolving
                            if (mofFeature instanceof EReference) {
                                EReference mofReference = (EReference) mofFeature;
                                if (!mofReference.isContainer() && !mofReference.isContainment()) {
                                    if ("IDREF".equals(xsdFeature.getEType().getName())) {
                                        mofReference.setResolveProxies(false);
                                    } else if ("QName".equals(xsdFeature.getEType().getName())) {

                                    } else {
                                        LOGGER.warning(mofClass.getName()
                                                + "."
                                                + mofFeature.getName()
                                                + " reference corresponds to neither IDREF nor QName, but "
                                                + xsdFeature.getEType().getName());
                                    }
                                }
                            }

                            int index = xsdClass.getEStructuralFeatures().indexOf(xsdFeature);
                            applyIndex(mofFeature, index);
                        }
                    }
                }
            }
        }
    }

    private int getIndexOfFeature(EStructuralFeature o1) {
        Integer value = featureSortIndex.get(o1);
        if (value != null)
            return value.intValue();
        return 0;
    }

    /**
     * 
     */
    private void fixModelFlags() {
        LOGGER.info("<H1>Checking merged metamodel - fixing ECore flags</H1>");
        for (EClassifier classifier : getMofContent()) {
            if (classifier instanceof EClass) {
                EClass mofClass = (EClass) classifier;

                // Sort features as in original
                ECollections.sort(mofClass.getEStructuralFeatures(),
                        new Comparator<EStructuralFeature>() {

                            public int compare(EStructuralFeature o1, EStructuralFeature o2) {
                                int index1 = getIndexOfFeature(o1);
                                int index2 = getIndexOfFeature(o2);
                                return index1 - index2;
                            }

                        });

                for (EStructuralFeature feature : mofClass.getEStructuralFeatures()) {
                    String featureName = feature.getEContainingClass().getName() + "."
                            + feature.getName();
                    Boolean hasNoExtendedMetadata = feature
                            .getEAnnotation(ExtendedMetaData.ANNOTATION_URI) == null;
                    if (hasNoExtendedMetadata) {
                        LOGGER.warning(featureName + " does not have XSD metadata");
                    }
                    if (feature instanceof EReference) {
                        EReference reference = (EReference) feature;
                        EReference opposite = reference.getEOpposite();
                        if (feature.isVolatile()) {
                            LOGGER.severe(featureName + " is volatile. Turning off.");
                            reference.setVolatile(false);
                        }
                        if (feature.isDerived() != hasNoExtendedMetadata) {
                            LOGGER.severe(featureName
                                    + " has inconsistent derived flag. Correcting.");
                            feature.setDerived(hasNoExtendedMetadata);
                        }
                        if (feature.isTransient() != hasNoExtendedMetadata) {
                            LOGGER.severe(featureName
                                    + " has inconsistent transient flag. Correcting.");
                            feature.setTransient(hasNoExtendedMetadata);
                            if (hasNoExtendedMetadata && opposite != null) {
                                opposite.setResolveProxies(false);
                            }
                        }
                    } else if (feature instanceof EAttribute && "id".equals(feature.getName())) {
                        ((EAttribute) feature).setID(true);
                    }
                }
            }
        }
    }

    private Map<EStructuralFeature, Integer> featureSortIndex = new HashMap<EStructuralFeature, Integer>();

    private void applyIndex(EStructuralFeature mofFeature, int index) {
        featureSortIndex.put(mofFeature, index);
    }

    private void sortClassifiersOfPackage(EPackage pack) {
        EList<EClassifier> classifierList = pack.getEClassifiers();
        ECollections.sort(classifierList, new Comparator<EClassifier>() {
            public int compare(EClassifier o1, EClassifier o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        classifierList.move(0, pack.getEClassifier("DocumentRoot"));
    }

}
