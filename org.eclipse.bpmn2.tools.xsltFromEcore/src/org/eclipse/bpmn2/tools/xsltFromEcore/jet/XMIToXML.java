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

 
 
 public class XMIToXML
 {
  protected static String nl;
  public static synchronized XMIToXML create(String lineSeparator)
  {
    nl = lineSeparator;
    XMIToXML result = new XMIToXML();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<xsl:stylesheet version=\"2.0\"" + NL + "\txmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"" + NL + "\txmlns:xmi=\"http://schema.omg.org/spec/XMI\"" + NL + "\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + NL + "\txmlns:bpmn2=\"http://www.omg.org/spec/BPMN/20100524/MODEL\"" + NL + "\txmlns:bpmndi=\"http://www.omg.org/spec/BPMN/20100524/DI\"" + NL + "\txmlns:di=\"http://www.omg.org/spec/DD/20100524/DI\"" + NL + "\txmlns:dc=\"http://www.omg.org/spec/DD/20100524/DC\" " + NL + "\txmlns:bpmn2xmi=\"http://www.omg.org/spec/BPMN/20100524/MODEL-XMI\"" + NL + "\txmlns:bpmndixmi=\"http://www.omg.org/spec/BPMN/20100524/DI-XMI\"" + NL + "\txmlns:dixmi=\"http://www.omg.org/spec/DD/20100524/DI-XMI\"" + NL + "\txmlns:dcxmi=\"http://www.omg.org/spec/DD/20100524/DC-XMI\"> " + NL + "\t<xsl:output method=\"xml\" indent=\"yes\"/>" + NL + "" + NL + "\t<xsl:template match=\"/\">" + NL + "\t  <xsl:apply-templates/>" + NL + "\t</xsl:template>" + NL + "" + NL + "\t<xsl:template name=\"SplitStringCore\">" + NL + "\t\t<xsl:param name=\"list\" />" + NL + "\t\t<xsl:param name=\"elementName\" />" + NL + "\t\t<xsl:param name=\"elementNamespace\" />" + NL + "\t\t<xsl:if test=\"string-length($list) > 1\">" + NL + "\t\t\t<xsl:element name=\"{$elementName}\" namespace=\"{$elementNamespace}\">" + NL + "\t\t\t\t<xsl:value-of select=\"substring-before($list, ' ')\" />" + NL + "\t\t\t</xsl:element>" + NL + "\t\t\t<xsl:call-template name=\"SplitStringCore\">" + NL + "\t\t\t\t<xsl:with-param name=\"list\" select=\"substring-after($list, ' ')\" />" + NL + "\t\t\t\t<xsl:with-param name=\"elementName\" select=\"$elementName\" />" + NL + "\t\t\t\t<xsl:with-param name=\"elementNamespace\" select=\"$elementNamespace\" />" + NL + "\t\t\t</xsl:call-template>" + NL + "\t\t</xsl:if>" + NL + "\t</xsl:template>" + NL + "" + NL + "\t<xsl:template name=\"SplitString\">" + NL + "\t\t<xsl:param name=\"list\" />" + NL + "\t\t<xsl:param name=\"elementName\" />" + NL + "\t\t<xsl:param name=\"elementNamespace\" />" + NL + "\t\t<xsl:call-template name=\"SplitStringCore\">" + NL + "\t\t\t<!-- Remove all unnecessary whitespace, but add a marker space at the " + NL + "\t\t\t\tend to simplify recursion. -->" + NL + "\t\t\t<xsl:with-param name=\"list\"" + NL + "\t\t\t\tselect=\"concat(normalize-space($list), ' ')\" />" + NL + "\t\t\t<xsl:with-param name=\"elementName\" select=\"$elementName\" />" + NL + "\t\t    <xsl:with-param name=\"elementNamespace\" select=\"$elementNamespace\" />" + NL + "\t\t</xsl:call-template>" + NL + "\t</xsl:template>" + NL + "" + NL + "\t\t" + NL + "\t<xsl:template name=\"EObjectAttributesTemplate\">" + NL + "\t  <!-- TODO: Add your copy logic for extension attributes-->" + NL + "\t</xsl:template>" + NL + "" + NL + "\t<xsl:template name=\"EObjectTemplate\">" + NL + "\t  <!-- TODO: Add your copy logic for extension elements-->" + NL + "\t</xsl:template>" + NL;
  protected final String TEXT_2 = NL + "    <xsl:template name=\"";
  protected final String TEXT_3 = "AttributesTemplate\">";
  protected final String TEXT_4 = NL + "     <xsl:call-template name=\"";
  protected final String TEXT_5 = "AttributesTemplate\"/> ";
  protected final String TEXT_6 = NL + "     <xsl:if test=\"";
  protected final String TEXT_7 = "\"><xsl:attribute name=\"";
  protected final String TEXT_8 = "\"> <xsl:value-of select=\"";
  protected final String TEXT_9 = "\" /> </xsl:attribute></xsl:if>\t\t\t";
  protected final String TEXT_10 = NL + "\t</xsl:template>" + NL + "" + NL + "    <xsl:template name=\"";
  protected final String TEXT_11 = "Template\" ";
  protected final String TEXT_12 = " match=\"//bpmn2xmi:Definitions\">" + NL + "      <bpmn2:definitions>" + NL + "        <xsl:call-template name=\"DefinitionsAttributesTemplate\"/>";
  protected final String TEXT_13 = " > ";
  protected final String TEXT_14 = NL + "     <xsl:call-template name=\"";
  protected final String TEXT_15 = "Template\"/> ";
  protected final String TEXT_16 = NL + "     <xsl:call-template name=\"SplitString\">" + NL + "       <xsl:with-param name=\"list\" select=\"";
  protected final String TEXT_17 = "\" />" + NL + "       <xsl:with-param name=\"elementName\" select=\"'";
  protected final String TEXT_18 = ":";
  protected final String TEXT_19 = "'\" />" + NL + "       <xsl:with-param name=\"elementNamespace\" select=\"'";
  protected final String TEXT_20 = "'\" />" + NL + "     </xsl:call-template>";
  protected final String TEXT_21 = NL + "     <";
  protected final String TEXT_22 = ":";
  protected final String TEXT_23 = "><xsl:value-of select=\"";
  protected final String TEXT_24 = "\"/></";
  protected final String TEXT_25 = ":";
  protected final String TEXT_26 = ">";
  protected final String TEXT_27 = NL + "     <xsl:for-each select=\"";
  protected final String TEXT_28 = "\">\t\t\t";
  protected final String TEXT_29 = NL + "      <xsl:choose>";
  protected final String TEXT_30 = NL + "       <xsl:when test=\"substring-after(@xmi:type, ':') = '";
  protected final String TEXT_31 = "' or substring-after(@xsi:type, ':') = '";
  protected final String TEXT_32 = "'\">" + NL + "         <";
  protected final String TEXT_33 = ":";
  protected final String TEXT_34 = ">" + NL + "           <xsl:call-template name=\"";
  protected final String TEXT_35 = "AttributesTemplate\"/> " + NL + "           <xsl:call-template name=\"";
  protected final String TEXT_36 = "Template\" />\t       \t\t   " + NL + "\t     </";
  protected final String TEXT_37 = ":";
  protected final String TEXT_38 = ">" + NL + "\t   </xsl:when>";
  protected final String TEXT_39 = NL + "      </xsl:choose>";
  protected final String TEXT_40 = NL + "      <";
  protected final String TEXT_41 = ":";
  protected final String TEXT_42 = ">" + NL + "        <xsl:call-template name=\"";
  protected final String TEXT_43 = "AttributesTemplate\"/> " + NL + "        <xsl:call-template name=\"";
  protected final String TEXT_44 = "Template\" />\t\t\t   " + NL + "      </";
  protected final String TEXT_45 = ":";
  protected final String TEXT_46 = ">";
  protected final String TEXT_47 = NL + "\t </xsl:for-each>\t\t\t\t\t\t";
  protected final String TEXT_48 = "   </bpmn2:definitions>";
  protected final String TEXT_49 = NL + "\t</xsl:template>" + NL + "\t";
  protected final String TEXT_50 = NL + NL + "</xsl:stylesheet>";
  protected final String TEXT_51 = NL;

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
 for(EStructuralFeature feature: input.getAllFeatureThatAreAttributesInXml(c)) { 
    stringBuffer.append(TEXT_6);
    stringBuffer.append(input.getXPathForXMI(feature));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(input.getExtendedMetadata().getName(feature));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(input.getXPathForXMI(feature));
    stringBuffer.append(TEXT_9);
     } 
    stringBuffer.append(TEXT_10);
    stringBuffer.append(c.getName());
    stringBuffer.append(TEXT_11);
    if("Definitions".equals(c.getName())){
    stringBuffer.append(TEXT_12);
    } else { 
    stringBuffer.append(TEXT_13);
     } 
    for(EClass superClass: c.getESuperTypes()) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(superClass.getName());
    stringBuffer.append(TEXT_15);
    }

  for(EStructuralFeature feature: input.getAllElementsInXml(c)) { 
  if(input.isReference(feature)) { 
    stringBuffer.append(TEXT_16);
    stringBuffer.append(input.getXPathForXMI(feature));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(input.getPrefix(feature));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(input.getExtendedMetadata().getName(feature));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(input.getNamespace(feature));
    stringBuffer.append(TEXT_20);
     } else if(input.isSimpleElement(feature)) { 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(input.getPrefix(feature));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(input.getExtendedMetadata().getName(feature));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(input.getXPathForXMI(feature));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(input.getPrefix(feature));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(feature.getName());
    stringBuffer.append(TEXT_26);
     } else { 
    stringBuffer.append(TEXT_27);
    stringBuffer.append(feature.getName());
    stringBuffer.append(TEXT_28);
     if (input.hasSubFeatures(feature)) { 
    stringBuffer.append(TEXT_29);
      for(EStructuralFeature subFeature: input.getAllSubFeatures(feature)) {  
    stringBuffer.append(TEXT_30);
    stringBuffer.append(subFeature.getEType().getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(subFeature.getEType().getName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(input.getPrefix(subFeature));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(input.getExtendedMetadata().getName(subFeature));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(subFeature.getEType().getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(subFeature.getEType().getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(input.getPrefix(subFeature));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(input.getExtendedMetadata().getName(subFeature));
    stringBuffer.append(TEXT_38);
      } 
    stringBuffer.append(TEXT_39);
     } else {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(input.getPrefix(feature));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(input.getExtendedMetadata().getName(feature));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(feature.getEType().getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(feature.getEType().getName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(input.getPrefix(feature));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(input.getExtendedMetadata().getName(feature));
    stringBuffer.append(TEXT_46);
     }
    stringBuffer.append(TEXT_47);
     } } 
    if("Definitions".equals(c.getName())){
    stringBuffer.append(TEXT_48);
    }
    stringBuffer.append(TEXT_49);
     }
    stringBuffer.append(TEXT_50);
    stringBuffer.append(TEXT_51);
    return stringBuffer.toString();
  }
}
