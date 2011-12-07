package org.eclipse.bpmn2.tools.xsltFromEcore.jet;

import org.eclipse.emf.ecore.*;

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

 
 
 public class XMLToXMI
 {
  protected static String nl;
  public static synchronized XMLToXMI create(String lineSeparator)
  {
    nl = lineSeparator;
    XMLToXMI result = new XMLToXMI();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<xsl:stylesheet version=\"2.0\"" + NL + "\txmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\" " + NL + "\txmlns:xmi=\"http://schema.omg.org/spec/XMI\"" + NL + "\txmlns:bpmn2=\"http://www.omg.org/spec/BPMN/20100524/MODEL\"" + NL + "\txmlns:bpmndi=\"http://www.omg.org/spec/BPMN/20100524/DI\"" + NL + "\txmlns:di=\"http://www.omg.org/spec/DD/20100524/DI\"" + NL + "\txmlns:dc=\"http://www.omg.org/spec/DD/20100524/DC\" " + NL + "\txmlns:bpmn2xmi=\"http://www.omg.org/spec/BPMN/20100524/MODEL-XMI\"" + NL + "\txmlns:bpmndixmi=\"http://www.omg.org/spec/BPMN/20100524/DI-XMI\"" + NL + "\txmlns:dixmi=\"http://www.omg.org/spec/DD/20100524/DI-XMI\"" + NL + "\txmlns:dcxmi=\"http://www.omg.org/spec/DD/20100524/DC-XMI\"> " + NL + "    <xsl:output method=\"xml\" indent=\"yes\"/>" + NL + "" + NL + "\t<xsl:template name=\"concat\">" + NL + "\t\t<xsl:param name=\"nodeset\" />" + NL + "\t\t<xsl:variable name=\"buffer\">" + NL + "\t\t  <xsl:for-each select=\"$nodeset\">" + NL + "\t\t   <xsl:value-of select=\"concat(., ' ')\"/>" + NL + "\t\t  </xsl:for-each>" + NL + "\t\t</xsl:variable>" + NL + "\t\t<xsl:value-of select=\"normalize-space($buffer)\"/>" + NL + "\t</xsl:template>" + NL + "\t\t\t" + NL + "\t<xsl:template match=\"/\">" + NL + "\t\t<xmi:XMI xmi:version=\"2.0\">" + NL + "\t\t\t<xsl:for-each select=\"bpmn2:definitions\">" + NL + "\t\t\t  <bpmn2xmi:Definitions>\t\t\t" + NL + "\t\t\t\t<xsl:call-template name=\"DefinitionsAttributesTemplate\" />" + NL + "\t\t\t\t<xsl:call-template name=\"DefinitionsTemplate\" />" + NL + "\t\t\t  </bpmn2xmi:Definitions>\t\t\t\t" + NL + "\t\t\t</xsl:for-each>" + NL + "\t\t</xmi:XMI>" + NL + "\t</xsl:template>" + NL + "" + NL + "\t<xsl:template name=\"EObjectAttributesTemplate\">" + NL + "\t  <!-- TODO: Add your copy logic for extension attributes-->" + NL + "\t</xsl:template>" + NL + "" + NL + "\t<xsl:template name=\"EObjectTemplate\">" + NL + "\t  <!-- TODO: Add your copy logic for extension elements-->" + NL + "\t</xsl:template>" + NL;
  protected final String TEXT_2 = NL + "\t<xsl:template name=\"";
  protected final String TEXT_3 = "AttributesTemplate\">";
  protected final String TEXT_4 = NL + "\t  <xsl:call-template name=\"";
  protected final String TEXT_5 = "AttributesTemplate\"/> \t";
  protected final String TEXT_6 = NL + "\t  <xsl:if test=\"";
  protected final String TEXT_7 = "\"><xsl:attribute name=\"";
  protected final String TEXT_8 = "\"> <xsl:value-of select=\"";
  protected final String TEXT_9 = "\" /> </xsl:attribute></xsl:if>\t\t\t";
  protected final String TEXT_10 = NL + "      <xsl:if test=\"";
  protected final String TEXT_11 = "\"><xsl:attribute name=\"";
  protected final String TEXT_12 = "\"><xsl:call-template name=\"concat\"><xsl:with-param name=\"nodeset\" select=\"";
  protected final String TEXT_13 = "\"/></xsl:call-template></xsl:attribute></xsl:if>\t\t\t";
  protected final String TEXT_14 = NL + "\t</xsl:template>" + NL + "" + NL + "\t<xsl:template name=\"";
  protected final String TEXT_15 = "Template\">";
  protected final String TEXT_16 = NL + "\t  <xsl:call-template name=\"";
  protected final String TEXT_17 = "Template\"/> ";
  protected final String TEXT_18 = NL + "      <xsl:for-each select=\"";
  protected final String TEXT_19 = "\">";
  protected final String TEXT_20 = NL + "        <xsl:choose>\t\t";
  protected final String TEXT_21 = " " + NL + "          <xsl:when test=\"self::";
  protected final String TEXT_22 = "\">" + NL + "            <";
  protected final String TEXT_23 = " xmi:type=\"";
  protected final String TEXT_24 = "xmi:";
  protected final String TEXT_25 = "\">\t\t\t    " + NL + "\t          <xsl:call-template name=\"";
  protected final String TEXT_26 = "AttributesTemplate\"/> " + NL + "\t\t\t  <xsl:call-template name=\"";
  protected final String TEXT_27 = "Template\" />\t\t\t   " + NL + "\t\t\t</";
  protected final String TEXT_28 = ">" + NL + "          </xsl:when >";
  protected final String TEXT_29 = NL + "        </xsl:choose>";
  protected final String TEXT_30 = NL + "        <";
  protected final String TEXT_31 = " xmi:type=\"";
  protected final String TEXT_32 = "xmi:";
  protected final String TEXT_33 = "\">\t\t\t    " + NL + "\t       <xsl:call-template name=\"";
  protected final String TEXT_34 = "AttributesTemplate\"/> " + NL + "           <xsl:call-template name=\"";
  protected final String TEXT_35 = "Template\" />\t\t\t   " + NL + "        </";
  protected final String TEXT_36 = ">";
  protected final String TEXT_37 = NL + "      </xsl:for-each>";
  protected final String TEXT_38 = NL + "\t</xsl:template>" + NL + "  ";
  protected final String TEXT_39 = NL + "</xsl:stylesheet>";
  protected final String TEXT_40 = NL;

   public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     JetInput input = (JetInput) argument; 
    stringBuffer.append(TEXT_1);
     for(EClass c: input.getClasses()) { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(c.getName());
    stringBuffer.append(TEXT_3);
    for(EClass superClass: c.getESuperTypes()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(superClass.getName());
    stringBuffer.append(TEXT_5);
    }
     for(EStructuralFeature feature: input.getAllFeatureThatAreAttributesInXMI(c)) { 
    stringBuffer.append(TEXT_6);
    stringBuffer.append(input.getXPathForXml(feature));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(feature.getName() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(input.getXPathForXml(feature) );
    stringBuffer.append(TEXT_9);
     } 
     for(EStructuralFeature feature: input.getAllFeatureThatAreReferences(c)) { 
    stringBuffer.append(TEXT_10);
    stringBuffer.append(input.getXPathForXml(feature));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(feature.getName() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(input.getXPathForXml(feature));
    stringBuffer.append(TEXT_13);
     } 
    stringBuffer.append(TEXT_14);
    stringBuffer.append(c.getName());
    stringBuffer.append(TEXT_15);
    for(EClass superClass: c.getESuperTypes()) {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(superClass.getName());
    stringBuffer.append(TEXT_17);
    }
     for(EStructuralFeature feature: input.getAllOtherFeaturesInXMI(c)) { 
    stringBuffer.append(TEXT_18);
    stringBuffer.append(input.getSubFeaturesXPath(feature));
    stringBuffer.append(TEXT_19);
    if(input.hasSubFeatures(feature)){ 
    stringBuffer.append(TEXT_20);
    for(EStructuralFeature subFeature: input.getAllSubFeatures(feature)) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(input.getXPathForXml(subFeature));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(feature.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(input.getPrefix(subFeature));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(subFeature.getEType().getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(subFeature.getEType().getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(subFeature.getEType().getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(feature.getName());
    stringBuffer.append(TEXT_28);
     }
    stringBuffer.append(TEXT_29);
    } else {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(feature.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(input.getPrefix(feature));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(feature.getEType().getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(feature.getEType().getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(feature.getEType().getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(feature.getName());
    stringBuffer.append(TEXT_36);
    }
    stringBuffer.append(TEXT_37);
     }
    stringBuffer.append(TEXT_38);
     }
    stringBuffer.append(TEXT_39);
    stringBuffer.append(TEXT_40);
    return stringBuffer.toString();
  }
}
