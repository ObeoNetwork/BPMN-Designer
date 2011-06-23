package org.eclipse.bpmn2.tools.xsltFromEcore.test;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

public class TestTransformationForthAndBack {

    private Transformer xml2xmi;
    private Transformer xmi2xml;
    private Validator bpmnXmlValidator;

    @Before
    public void setUp() throws TransformerConfigurationException, SAXException {
        TransformerFactory transFact = TransformerFactory.newInstance();
        this.xmi2xml = transFact.newTransformer(new StreamSource("result/XMIToXML.xslt"));
        this.xml2xmi = transFact.newTransformer(new StreamSource("result/XMLToXMI.xslt"));
        SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");

        File schemaLocation = new File("res/BPMN20.xsd");
        Schema schema = factory.newSchema(schemaLocation);

        bpmnXmlValidator = schema.newValidator();

    }

    private void processDirectory(File directory) throws TransformerException, SAXException,
            IOException {
        File[] content = directory.listFiles();
        for (File subFile : content) {
            if (subFile.isDirectory()) {
                processDirectory(subFile);
            } else if (subFile.getName().endsWith(".bpmn")) {
                processBpmnFile(subFile);
            } else if (subFile.getName().endsWith(".bpmn2xmi")) {
                processBpmnXmiFile(subFile);
            }
        }

    }

    private void processBpmnFile(File subFile) throws TransformerException, SAXException,
            IOException {

        StreamSource streamSource = new StreamSource(subFile.getAbsolutePath());
        bpmnXmlValidator.validate(streamSource);
        xml2xmi.transform(streamSource, new StreamResult(subFile.getAbsolutePath() + ".bpmn2xmi"));
    }

    private void processBpmnXmiFile(File subFile) throws TransformerException, IOException {
        String resultFile = subFile.getAbsolutePath() + ".bpmn2";
        xmi2xml.transform(new StreamSource(subFile.getAbsolutePath()), new StreamResult(resultFile));
        StreamSource bpmn2File = new StreamSource(resultFile);
        try {
            bpmnXmlValidator.validate(bpmn2File);
        } catch (SAXException e) {
            System.out.println("Validation problems in " + resultFile);
            System.out.println(e.toString());
        }

    }

    @Test
    public void testTransform() throws TransformerException, SAXException, IOException {
        File resDirecty = new File("res");

        processDirectory(resDirecty);

    }

}
