<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xmi="http://schema.omg.org/spec/XMI"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:bpmn2="http://www.omg.org/spec/BPMN/20100524/MODEL"
	xmlns:bpmndi="http://www.omg.org/spec/BPMN/20100524/DI"
	xmlns:di="http://www.omg.org/spec/DD/20100524/DI"
	xmlns:dc="http://www.omg.org/spec/DD/20100524/DC" 
	xmlns:bpmn2xmi="http://www.omg.org/spec/BPMN/20100524/MODEL-XMI"
	xmlns:bpmndixmi="http://www.omg.org/spec/BPMN/20100524/DI-XMI"
	xmlns:dixmi="http://www.omg.org/spec/DD/20100524/DI-XMI"
	xmlns:dcxmi="http://www.omg.org/spec/DD/20100524/DC-XMI"> 
	<xsl:output method="xml" indent="yes"/>

	<xsl:template match="/">
	  <xsl:apply-templates/>
	</xsl:template>

	<xsl:template name="SplitStringCore">
		<xsl:param name="list" />
		<xsl:param name="elementName" />
		<xsl:param name="elementNamespace" />
		<xsl:if test="string-length($list) > 1">
			<xsl:element name="{$elementName}" namespace="{$elementNamespace}">
				<xsl:value-of select="substring-before($list, ' ')" />
			</xsl:element>
			<xsl:call-template name="SplitStringCore">
				<xsl:with-param name="list" select="substring-after($list, ' ')" />
				<xsl:with-param name="elementName" select="$elementName" />
				<xsl:with-param name="elementNamespace" select="$elementNamespace" />
			</xsl:call-template>
		</xsl:if>
	</xsl:template>

	<xsl:template name="SplitString">
		<xsl:param name="list" />
		<xsl:param name="elementName" />
		<xsl:param name="elementNamespace" />
		<xsl:call-template name="SplitStringCore">
			<!-- Remove all unnecessary whitespace, but add a marker space at the 
				end to simplify recursion. -->
			<xsl:with-param name="list"
				select="concat(normalize-space($list), ' ')" />
			<xsl:with-param name="elementName" select="$elementName" />
		    <xsl:with-param name="elementNamespace" select="$elementNamespace" />
		</xsl:call-template>
	</xsl:template>

		
	<xsl:template name="EObjectAttributesTemplate">
	  <!-- TODO: Add your copy logic for extension attributes-->
	</xsl:template>

	<xsl:template name="EObjectTemplate">
	  <!-- TODO: Add your copy logic for extension elements-->
	</xsl:template>

    <xsl:template name="ActivityAttributesTemplate">
     <xsl:call-template name="FlowNodeAttributesTemplate"/> 
     <xsl:if test="@completionQuantity"><xsl:attribute name="completionQuantity"> <xsl:value-of select="@completionQuantity" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@default"><xsl:attribute name="default"> <xsl:value-of select="@default" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isForCompensation"><xsl:attribute name="isForCompensation"> <xsl:value-of select="@isForCompensation" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@startQuantity"><xsl:attribute name="startQuantity"> <xsl:value-of select="@startQuantity" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ActivityTemplate"  > 
     <xsl:call-template name="FlowNodeTemplate"/> 
     <xsl:for-each select="ioSpecification">			
      <bpmn2:ioSpecification>
        <xsl:call-template name="InputOutputSpecificationAttributesTemplate"/> 
        <xsl:call-template name="InputOutputSpecificationTemplate" />			   
      </bpmn2:ioSpecification>
	 </xsl:for-each>						
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@boundaryEventRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:boundaryEventRefs'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:for-each select="properties">			
      <bpmn2:property>
        <xsl:call-template name="PropertyAttributesTemplate"/> 
        <xsl:call-template name="PropertyTemplate" />			   
      </bpmn2:property>
	 </xsl:for-each>						
     <xsl:for-each select="dataInputAssociations">			
      <bpmn2:dataInputAssociation>
        <xsl:call-template name="DataInputAssociationAttributesTemplate"/> 
        <xsl:call-template name="DataInputAssociationTemplate" />			   
      </bpmn2:dataInputAssociation>
	 </xsl:for-each>						
     <xsl:for-each select="dataOutputAssociations">			
      <bpmn2:dataOutputAssociation>
        <xsl:call-template name="DataOutputAssociationAttributesTemplate"/> 
        <xsl:call-template name="DataOutputAssociationTemplate" />			   
      </bpmn2:dataOutputAssociation>
	 </xsl:for-each>						
     <xsl:for-each select="resources">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Performer' or substring-after(@xsi:type, ':') = 'Performer'">
         <bpmn2:performer>
           <xsl:call-template name="PerformerAttributesTemplate"/> 
           <xsl:call-template name="PerformerTemplate" />	       		   
	     </bpmn2:performer>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'HumanPerformer' or substring-after(@xsi:type, ':') = 'HumanPerformer'">
         <bpmn2:humanPerformer>
           <xsl:call-template name="HumanPerformerAttributesTemplate"/> 
           <xsl:call-template name="HumanPerformerTemplate" />	       		   
	     </bpmn2:humanPerformer>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'PotentialOwner' or substring-after(@xsi:type, ':') = 'PotentialOwner'">
         <bpmn2:potentialOwner>
           <xsl:call-template name="PotentialOwnerAttributesTemplate"/> 
           <xsl:call-template name="PotentialOwnerTemplate" />	       		   
	     </bpmn2:potentialOwner>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
     <xsl:for-each select="loopCharacteristics">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'MultiInstanceLoopCharacteristics' or substring-after(@xsi:type, ':') = 'MultiInstanceLoopCharacteristics'">
         <bpmn2:multiInstanceLoopCharacteristics>
           <xsl:call-template name="MultiInstanceLoopCharacteristicsAttributesTemplate"/> 
           <xsl:call-template name="MultiInstanceLoopCharacteristicsTemplate" />	       		   
	     </bpmn2:multiInstanceLoopCharacteristics>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'StandardLoopCharacteristics' or substring-after(@xsi:type, ':') = 'StandardLoopCharacteristics'">
         <bpmn2:standardLoopCharacteristics>
           <xsl:call-template name="StandardLoopCharacteristicsAttributesTemplate"/> 
           <xsl:call-template name="StandardLoopCharacteristicsTemplate" />	       		   
	     </bpmn2:standardLoopCharacteristics>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="AdHocSubProcessAttributesTemplate">
     <xsl:call-template name="SubProcessAttributesTemplate"/> 
     <xsl:if test="@cancelRemainingInstances"><xsl:attribute name="cancelRemainingInstances"> <xsl:value-of select="@cancelRemainingInstances" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@ordering"><xsl:attribute name="ordering"> <xsl:value-of select="@ordering" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="AdHocSubProcessTemplate"  > 
     <xsl:call-template name="SubProcessTemplate"/> 
     <xsl:for-each select="completionCondition">			
      <bpmn2:completionCondition>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:completionCondition>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ArtifactAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ArtifactTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="AssignmentAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="AssignmentTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="from">			
      <bpmn2:from>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:from>
	 </xsl:for-each>						
     <xsl:for-each select="to">			
      <bpmn2:to>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:to>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="AssociationAttributesTemplate">
     <xsl:call-template name="ArtifactAttributesTemplate"/> 
     <xsl:if test="@associationDirection"><xsl:attribute name="associationDirection"> <xsl:value-of select="@associationDirection" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@sourceRef"><xsl:attribute name="sourceRef"> <xsl:value-of select="@sourceRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@targetRef"><xsl:attribute name="targetRef"> <xsl:value-of select="@targetRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="AssociationTemplate"  > 
     <xsl:call-template name="ArtifactTemplate"/> 
	</xsl:template>
	
    <xsl:template name="AuditingAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="AuditingTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="BaseElementAttributesTemplate">
     <xsl:if test="@id"><xsl:attribute name="id"> <xsl:value-of select="@id" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="BaseElementTemplate"  > 
     <xsl:for-each select="extensionValues">			
      <bpmn2:extensionValues>
        <xsl:call-template name="ExtensionAttributeValueAttributesTemplate"/> 
        <xsl:call-template name="ExtensionAttributeValueTemplate" />			   
      </bpmn2:extensionValues>
	 </xsl:for-each>						
     <xsl:for-each select="documentation">			
      <bpmn2:documentation>
        <xsl:call-template name="DocumentationAttributesTemplate"/> 
        <xsl:call-template name="DocumentationTemplate" />			   
      </bpmn2:documentation>
	 </xsl:for-each>						
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@extensionDefinitions" />
       <xsl:with-param name="elementName" select="'bpmn2:extensionElements'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="BoundaryEventAttributesTemplate">
     <xsl:call-template name="CatchEventAttributesTemplate"/> 
     <xsl:if test="@attachedToRef"><xsl:attribute name="attachedToRef"> <xsl:value-of select="@attachedToRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@cancelActivity"><xsl:attribute name="cancelActivity"> <xsl:value-of select="@cancelActivity" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="BoundaryEventTemplate"  > 
     <xsl:call-template name="CatchEventTemplate"/> 
	</xsl:template>
	
    <xsl:template name="BusinessRuleTaskAttributesTemplate">
     <xsl:call-template name="TaskAttributesTemplate"/> 
     <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="BusinessRuleTaskTemplate"  > 
     <xsl:call-template name="TaskTemplate"/> 
	</xsl:template>
	
    <xsl:template name="CallActivityAttributesTemplate">
     <xsl:call-template name="ActivityAttributesTemplate"/> 
     <xsl:if test="@calledElementRef"><xsl:attribute name="calledElement"> <xsl:value-of select="@calledElementRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CallActivityTemplate"  > 
     <xsl:call-template name="ActivityTemplate"/> 
	</xsl:template>
	
    <xsl:template name="CallChoreographyAttributesTemplate">
     <xsl:call-template name="ChoreographyActivityAttributesTemplate"/> 
     <xsl:if test="@calledChoreographyRef"><xsl:attribute name="calledChoreographyRef"> <xsl:value-of select="@calledChoreographyRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CallChoreographyTemplate"  > 
     <xsl:call-template name="ChoreographyActivityTemplate"/> 
     <xsl:for-each select="participantAssociations">			
      <bpmn2:participantAssociation>
        <xsl:call-template name="ParticipantAssociationAttributesTemplate"/> 
        <xsl:call-template name="ParticipantAssociationTemplate" />			   
      </bpmn2:participantAssociation>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="CallConversationAttributesTemplate">
     <xsl:call-template name="ConversationNodeAttributesTemplate"/> 
     <xsl:if test="@calledCollaborationRef"><xsl:attribute name="calledCollaborationRef"> <xsl:value-of select="@calledCollaborationRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CallConversationTemplate"  > 
     <xsl:call-template name="ConversationNodeTemplate"/> 
     <xsl:for-each select="participantAssociations">			
      <bpmn2:participantAssociation>
        <xsl:call-template name="ParticipantAssociationAttributesTemplate"/> 
        <xsl:call-template name="ParticipantAssociationTemplate" />			   
      </bpmn2:participantAssociation>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="CallableElementAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CallableElementTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@supportedInterfaceRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:supportedInterfaceRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:for-each select="ioSpecification">			
      <bpmn2:ioSpecification>
        <xsl:call-template name="InputOutputSpecificationAttributesTemplate"/> 
        <xsl:call-template name="InputOutputSpecificationTemplate" />			   
      </bpmn2:ioSpecification>
	 </xsl:for-each>						
     <xsl:for-each select="ioBinding">			
      <bpmn2:ioBinding>
        <xsl:call-template name="InputOutputBindingAttributesTemplate"/> 
        <xsl:call-template name="InputOutputBindingTemplate" />			   
      </bpmn2:ioBinding>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="CancelEventDefinitionAttributesTemplate">
     <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="CancelEventDefinitionTemplate"  > 
     <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
	
    <xsl:template name="CatchEventAttributesTemplate">
     <xsl:call-template name="EventAttributesTemplate"/> 
     <xsl:if test="@parallelMultiple"><xsl:attribute name="parallelMultiple"> <xsl:value-of select="@parallelMultiple" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CatchEventTemplate"  > 
     <xsl:call-template name="EventTemplate"/> 
     <xsl:for-each select="dataOutputs">			
      <bpmn2:dataOutput>
        <xsl:call-template name="DataOutputAttributesTemplate"/> 
        <xsl:call-template name="DataOutputTemplate" />			   
      </bpmn2:dataOutput>
	 </xsl:for-each>						
     <xsl:for-each select="dataOutputAssociation">			
      <bpmn2:dataOutputAssociation>
        <xsl:call-template name="DataOutputAssociationAttributesTemplate"/> 
        <xsl:call-template name="DataOutputAssociationTemplate" />			   
      </bpmn2:dataOutputAssociation>
	 </xsl:for-each>						
     <xsl:for-each select="outputSet">			
      <bpmn2:outputSet>
        <xsl:call-template name="OutputSetAttributesTemplate"/> 
        <xsl:call-template name="OutputSetTemplate" />			   
      </bpmn2:outputSet>
	 </xsl:for-each>						
     <xsl:for-each select="eventDefinitions">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'CancelEventDefinition' or substring-after(@xsi:type, ':') = 'CancelEventDefinition'">
         <bpmn2:cancelEventDefinition>
           <xsl:call-template name="CancelEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="CancelEventDefinitionTemplate" />	       		   
	     </bpmn2:cancelEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'CompensateEventDefinition' or substring-after(@xsi:type, ':') = 'CompensateEventDefinition'">
         <bpmn2:compensateEventDefinition>
           <xsl:call-template name="CompensateEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="CompensateEventDefinitionTemplate" />	       		   
	     </bpmn2:compensateEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ConditionalEventDefinition' or substring-after(@xsi:type, ':') = 'ConditionalEventDefinition'">
         <bpmn2:conditionalEventDefinition>
           <xsl:call-template name="ConditionalEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="ConditionalEventDefinitionTemplate" />	       		   
	     </bpmn2:conditionalEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ErrorEventDefinition' or substring-after(@xsi:type, ':') = 'ErrorEventDefinition'">
         <bpmn2:errorEventDefinition>
           <xsl:call-template name="ErrorEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="ErrorEventDefinitionTemplate" />	       		   
	     </bpmn2:errorEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'EscalationEventDefinition' or substring-after(@xsi:type, ':') = 'EscalationEventDefinition'">
         <bpmn2:escalationEventDefinition>
           <xsl:call-template name="EscalationEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="EscalationEventDefinitionTemplate" />	       		   
	     </bpmn2:escalationEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'LinkEventDefinition' or substring-after(@xsi:type, ':') = 'LinkEventDefinition'">
         <bpmn2:linkEventDefinition>
           <xsl:call-template name="LinkEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="LinkEventDefinitionTemplate" />	       		   
	     </bpmn2:linkEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'MessageEventDefinition' or substring-after(@xsi:type, ':') = 'MessageEventDefinition'">
         <bpmn2:messageEventDefinition>
           <xsl:call-template name="MessageEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="MessageEventDefinitionTemplate" />	       		   
	     </bpmn2:messageEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'SignalEventDefinition' or substring-after(@xsi:type, ':') = 'SignalEventDefinition'">
         <bpmn2:signalEventDefinition>
           <xsl:call-template name="SignalEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="SignalEventDefinitionTemplate" />	       		   
	     </bpmn2:signalEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'TerminateEventDefinition' or substring-after(@xsi:type, ':') = 'TerminateEventDefinition'">
         <bpmn2:terminateEventDefinition>
           <xsl:call-template name="TerminateEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="TerminateEventDefinitionTemplate" />	       		   
	     </bpmn2:terminateEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'TimerEventDefinition' or substring-after(@xsi:type, ':') = 'TimerEventDefinition'">
         <bpmn2:timerEventDefinition>
           <xsl:call-template name="TimerEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="TimerEventDefinitionTemplate" />	       		   
	     </bpmn2:timerEventDefinition>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@eventDefinitionRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:eventDefinitionRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="CategoryAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CategoryTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
     <xsl:for-each select="categoryValue">			
      <bpmn2:categoryValue>
        <xsl:call-template name="CategoryValueAttributesTemplate"/> 
        <xsl:call-template name="CategoryValueTemplate" />			   
      </bpmn2:categoryValue>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="CategoryValueAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@value"><xsl:attribute name="value"> <xsl:value-of select="@value" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CategoryValueTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@categorizedFlowElements" />
       <xsl:with-param name="elementName" select="'bpmn2:categorizedFlowElements'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="ChoreographyAttributesTemplate">
     <xsl:call-template name="CollaborationAttributesTemplate"/> 
     <xsl:call-template name="FlowElementsContainerAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ChoreographyTemplate"  > 
     <xsl:call-template name="CollaborationTemplate"/> 
     <xsl:call-template name="FlowElementsContainerTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ChoreographyActivityAttributesTemplate">
     <xsl:call-template name="FlowNodeAttributesTemplate"/> 
     <xsl:if test="@initiatingParticipantRef"><xsl:attribute name="initiatingParticipantRef"> <xsl:value-of select="@initiatingParticipantRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@loopType"><xsl:attribute name="loopType"> <xsl:value-of select="@loopType" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ChoreographyActivityTemplate"  > 
     <xsl:call-template name="FlowNodeTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@participantRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:participantRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:for-each select="correlationKeys">			
      <bpmn2:correlationKey>
        <xsl:call-template name="CorrelationKeyAttributesTemplate"/> 
        <xsl:call-template name="CorrelationKeyTemplate" />			   
      </bpmn2:correlationKey>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ChoreographyTaskAttributesTemplate">
     <xsl:call-template name="ChoreographyActivityAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ChoreographyTaskTemplate"  > 
     <xsl:call-template name="ChoreographyActivityTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@messageFlowRef" />
       <xsl:with-param name="elementName" select="'bpmn2:messageFlowRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="CollaborationAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@isClosed"><xsl:attribute name="isClosed"> <xsl:value-of select="@isClosed" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CollaborationTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
     <xsl:for-each select="participants">			
      <bpmn2:participant>
        <xsl:call-template name="ParticipantAttributesTemplate"/> 
        <xsl:call-template name="ParticipantTemplate" />			   
      </bpmn2:participant>
	 </xsl:for-each>						
     <xsl:for-each select="messageFlows">			
      <bpmn2:messageFlow>
        <xsl:call-template name="MessageFlowAttributesTemplate"/> 
        <xsl:call-template name="MessageFlowTemplate" />			   
      </bpmn2:messageFlow>
	 </xsl:for-each>						
     <xsl:for-each select="artifacts">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Association' or substring-after(@xsi:type, ':') = 'Association'">
         <bpmn2:association>
           <xsl:call-template name="AssociationAttributesTemplate"/> 
           <xsl:call-template name="AssociationTemplate" />	       		   
	     </bpmn2:association>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Group' or substring-after(@xsi:type, ':') = 'Group'">
         <bpmn2:group>
           <xsl:call-template name="GroupAttributesTemplate"/> 
           <xsl:call-template name="GroupTemplate" />	       		   
	     </bpmn2:group>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'TextAnnotation' or substring-after(@xsi:type, ':') = 'TextAnnotation'">
         <bpmn2:textAnnotation>
           <xsl:call-template name="TextAnnotationAttributesTemplate"/> 
           <xsl:call-template name="TextAnnotationTemplate" />	       		   
	     </bpmn2:textAnnotation>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
     <xsl:for-each select="conversations">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'CallConversation' or substring-after(@xsi:type, ':') = 'CallConversation'">
         <bpmn2:callConversation>
           <xsl:call-template name="CallConversationAttributesTemplate"/> 
           <xsl:call-template name="CallConversationTemplate" />	       		   
	     </bpmn2:callConversation>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Conversation' or substring-after(@xsi:type, ':') = 'Conversation'">
         <bpmn2:conversation>
           <xsl:call-template name="ConversationAttributesTemplate"/> 
           <xsl:call-template name="ConversationTemplate" />	       		   
	     </bpmn2:conversation>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'SubConversation' or substring-after(@xsi:type, ':') = 'SubConversation'">
         <bpmn2:subConversation>
           <xsl:call-template name="SubConversationAttributesTemplate"/> 
           <xsl:call-template name="SubConversationTemplate" />	       		   
	     </bpmn2:subConversation>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
     <xsl:for-each select="conversationAssociations">			
      <bpmn2:conversationAssociation>
        <xsl:call-template name="ConversationAssociationAttributesTemplate"/> 
        <xsl:call-template name="ConversationAssociationTemplate" />			   
      </bpmn2:conversationAssociation>
	 </xsl:for-each>						
     <xsl:for-each select="participantAssociations">			
      <bpmn2:participantAssociation>
        <xsl:call-template name="ParticipantAssociationAttributesTemplate"/> 
        <xsl:call-template name="ParticipantAssociationTemplate" />			   
      </bpmn2:participantAssociation>
	 </xsl:for-each>						
     <xsl:for-each select="messageFlowAssociations">			
      <bpmn2:messageFlowAssociation>
        <xsl:call-template name="MessageFlowAssociationAttributesTemplate"/> 
        <xsl:call-template name="MessageFlowAssociationTemplate" />			   
      </bpmn2:messageFlowAssociation>
	 </xsl:for-each>						
     <xsl:for-each select="correlationKeys">			
      <bpmn2:correlationKey>
        <xsl:call-template name="CorrelationKeyAttributesTemplate"/> 
        <xsl:call-template name="CorrelationKeyTemplate" />			   
      </bpmn2:correlationKey>
	 </xsl:for-each>						
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@choreographyRef" />
       <xsl:with-param name="elementName" select="'bpmn2:choreographyRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:for-each select="conversationLinks">			
      <bpmn2:conversationLink>
        <xsl:call-template name="ConversationLinkAttributesTemplate"/> 
        <xsl:call-template name="ConversationLinkTemplate" />			   
      </bpmn2:conversationLink>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="CompensateEventDefinitionAttributesTemplate">
     <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
     <xsl:if test="@activityRef"><xsl:attribute name="activityRef"> <xsl:value-of select="@activityRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@waitForCompletion"><xsl:attribute name="waitForCompletion"> <xsl:value-of select="@waitForCompletion" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CompensateEventDefinitionTemplate"  > 
     <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ComplexBehaviorDefinitionAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ComplexBehaviorDefinitionTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="condition">			
      <bpmn2:condition>
        <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
        <xsl:call-template name="FormalExpressionTemplate" />			   
      </bpmn2:condition>
	 </xsl:for-each>						
     <xsl:for-each select="event">			
      <bpmn2:event>
        <xsl:call-template name="ImplicitThrowEventAttributesTemplate"/> 
        <xsl:call-template name="ImplicitThrowEventTemplate" />			   
      </bpmn2:event>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ComplexGatewayAttributesTemplate">
     <xsl:call-template name="GatewayAttributesTemplate"/> 
     <xsl:if test="@default"><xsl:attribute name="default"> <xsl:value-of select="@default" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ComplexGatewayTemplate"  > 
     <xsl:call-template name="GatewayTemplate"/> 
     <xsl:for-each select="activationCondition">			
      <bpmn2:activationCondition>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:activationCondition>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ConditionalEventDefinitionAttributesTemplate">
     <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ConditionalEventDefinitionTemplate"  > 
     <xsl:call-template name="EventDefinitionTemplate"/> 
     <xsl:for-each select="condition">			
      <bpmn2:condition>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:condition>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ConversationAttributesTemplate">
     <xsl:call-template name="ConversationNodeAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ConversationTemplate"  > 
     <xsl:call-template name="ConversationNodeTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ConversationAssociationAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@innerConversationNodeRef"><xsl:attribute name="innerConversationNodeRef"> <xsl:value-of select="@innerConversationNodeRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@outerConversationNodeRef"><xsl:attribute name="outerConversationNodeRef"> <xsl:value-of select="@outerConversationNodeRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ConversationAssociationTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ConversationLinkAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@sourceRef"><xsl:attribute name="sourceRef"> <xsl:value-of select="@sourceRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@targetRef"><xsl:attribute name="targetRef"> <xsl:value-of select="@targetRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ConversationLinkTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ConversationNodeAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:call-template name="InteractionNodeAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ConversationNodeTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:call-template name="InteractionNodeTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@participantRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:participantRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@messageFlowRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:messageFlowRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:for-each select="correlationKeys">			
      <bpmn2:correlationKey>
        <xsl:call-template name="CorrelationKeyAttributesTemplate"/> 
        <xsl:call-template name="CorrelationKeyTemplate" />			   
      </bpmn2:correlationKey>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="CorrelationKeyAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CorrelationKeyTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@correlationPropertyRef" />
       <xsl:with-param name="elementName" select="'bpmn2:correlationPropertyRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="CorrelationPropertyAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@type"><xsl:attribute name="type"> <xsl:value-of select="@type" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CorrelationPropertyTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
     <xsl:for-each select="correlationPropertyRetrievalExpression">			
      <bpmn2:correlationPropertyRetrievalExpression>
        <xsl:call-template name="CorrelationPropertyRetrievalExpressionAttributesTemplate"/> 
        <xsl:call-template name="CorrelationPropertyRetrievalExpressionTemplate" />			   
      </bpmn2:correlationPropertyRetrievalExpression>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="CorrelationPropertyBindingAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@correlationPropertyRef"><xsl:attribute name="correlationPropertyRef"> <xsl:value-of select="@correlationPropertyRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CorrelationPropertyBindingTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="dataPath">			
      <bpmn2:dataPath>
        <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
        <xsl:call-template name="FormalExpressionTemplate" />			   
      </bpmn2:dataPath>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="CorrelationPropertyRetrievalExpressionAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@messageRef"><xsl:attribute name="messageRef"> <xsl:value-of select="@messageRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CorrelationPropertyRetrievalExpressionTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="messagePath">			
      <bpmn2:messagePath>
        <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
        <xsl:call-template name="FormalExpressionTemplate" />			   
      </bpmn2:messagePath>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="CorrelationSubscriptionAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@correlationKeyRef"><xsl:attribute name="correlationKeyRef"> <xsl:value-of select="@correlationKeyRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="CorrelationSubscriptionTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="correlationPropertyBinding">			
      <bpmn2:correlationPropertyBinding>
        <xsl:call-template name="CorrelationPropertyBindingAttributesTemplate"/> 
        <xsl:call-template name="CorrelationPropertyBindingTemplate" />			   
      </bpmn2:correlationPropertyBinding>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="DataAssociationAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="DataAssociationTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@sourceRef" />
       <xsl:with-param name="elementName" select="'bpmn2:sourceRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@targetRef" />
       <xsl:with-param name="elementName" select="'bpmn2:targetRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:for-each select="transformation">			
      <bpmn2:transformation>
        <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
        <xsl:call-template name="FormalExpressionTemplate" />			   
      </bpmn2:transformation>
	 </xsl:for-each>						
     <xsl:for-each select="assignment">			
      <bpmn2:assignment>
        <xsl:call-template name="AssignmentAttributesTemplate"/> 
        <xsl:call-template name="AssignmentTemplate" />			   
      </bpmn2:assignment>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="DataInputAttributesTemplate">
     <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 
     <xsl:if test="@isCollection"><xsl:attribute name="isCollection"> <xsl:value-of select="@isCollection" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="DataInputTemplate"  > 
     <xsl:call-template name="ItemAwareElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@inputSetWithOptional" />
       <xsl:with-param name="elementName" select="'bpmn2:inputSetWithOptional'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@inputSetWithWhileExecuting" />
       <xsl:with-param name="elementName" select="'bpmn2:inputSetWithWhileExecuting'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@inputSetRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:inputSetRefs'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="DataInputAssociationAttributesTemplate">
     <xsl:call-template name="DataAssociationAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="DataInputAssociationTemplate"  > 
     <xsl:call-template name="DataAssociationTemplate"/> 
	</xsl:template>
	
    <xsl:template name="DataObjectAttributesTemplate">
     <xsl:call-template name="FlowElementAttributesTemplate"/> 
     <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 
     <xsl:if test="@isCollection"><xsl:attribute name="isCollection"> <xsl:value-of select="@isCollection" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="DataObjectTemplate"  > 
     <xsl:call-template name="FlowElementTemplate"/> 
     <xsl:call-template name="ItemAwareElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="DataObjectReferenceAttributesTemplate">
     <xsl:call-template name="FlowElementAttributesTemplate"/> 
     <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 
     <xsl:if test="@dataObjectRef"><xsl:attribute name="dataObjectRef"> <xsl:value-of select="@dataObjectRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="DataObjectReferenceTemplate"  > 
     <xsl:call-template name="FlowElementTemplate"/> 
     <xsl:call-template name="ItemAwareElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="DataOutputAttributesTemplate">
     <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 
     <xsl:if test="@isCollection"><xsl:attribute name="isCollection"> <xsl:value-of select="@isCollection" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="DataOutputTemplate"  > 
     <xsl:call-template name="ItemAwareElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@outputSetWithOptional" />
       <xsl:with-param name="elementName" select="'bpmn2:outputSetWithOptional'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@outputSetWithWhileExecuting" />
       <xsl:with-param name="elementName" select="'bpmn2:outputSetWithWhileExecuting'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@outputSetRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:outputSetRefs'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="DataOutputAssociationAttributesTemplate">
     <xsl:call-template name="DataAssociationAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="DataOutputAssociationTemplate"  > 
     <xsl:call-template name="DataAssociationTemplate"/> 
	</xsl:template>
	
    <xsl:template name="DataStateAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="DataStateTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="DataStoreAttributesTemplate">
     <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@capacity"><xsl:attribute name="capacity"> <xsl:value-of select="@capacity" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isUnlimited"><xsl:attribute name="isUnlimited"> <xsl:value-of select="@isUnlimited" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="DataStoreTemplate"  > 
     <xsl:call-template name="ItemAwareElementTemplate"/> 
     <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="DataStoreReferenceAttributesTemplate">
     <xsl:call-template name="FlowElementAttributesTemplate"/> 
     <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 
     <xsl:if test="@dataStoreRef"><xsl:attribute name="dataStoreRef"> <xsl:value-of select="@dataStoreRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="DataStoreReferenceTemplate"  > 
     <xsl:call-template name="FlowElementTemplate"/> 
     <xsl:call-template name="ItemAwareElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="DefinitionsAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@exporter"><xsl:attribute name="exporter"> <xsl:value-of select="@exporter" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@exporterVersion"><xsl:attribute name="exporterVersion"> <xsl:value-of select="@exporterVersion" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@expressionLanguage"><xsl:attribute name="expressionLanguage"> <xsl:value-of select="@expressionLanguage" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@targetNamespace"><xsl:attribute name="targetNamespace"> <xsl:value-of select="@targetNamespace" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@typeLanguage"><xsl:attribute name="typeLanguage"> <xsl:value-of select="@typeLanguage" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="DefinitionsTemplate"  match="//bpmn2xmi:Definitions">
      <bpmn2:definitions>
        <xsl:call-template name="DefinitionsAttributesTemplate"/>
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="imports">			
      <bpmn2:import>
        <xsl:call-template name="ImportAttributesTemplate"/> 
        <xsl:call-template name="ImportTemplate" />			   
      </bpmn2:import>
	 </xsl:for-each>						
     <xsl:for-each select="extensions">			
      <bpmn2:extension>
        <xsl:call-template name="ExtensionAttributesTemplate"/> 
        <xsl:call-template name="ExtensionTemplate" />			   
      </bpmn2:extension>
	 </xsl:for-each>						
     <xsl:for-each select="rootElements">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'EventDefinition' or substring-after(@xsi:type, ':') = 'EventDefinition'">
         <bpmn2:eventDefinition>
           <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="EventDefinitionTemplate" />	       		   
	     </bpmn2:eventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Category' or substring-after(@xsi:type, ':') = 'Category'">
         <bpmn2:category>
           <xsl:call-template name="CategoryAttributesTemplate"/> 
           <xsl:call-template name="CategoryTemplate" />	       		   
	     </bpmn2:category>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Collaboration' or substring-after(@xsi:type, ':') = 'Collaboration'">
         <bpmn2:collaboration>
           <xsl:call-template name="CollaborationAttributesTemplate"/> 
           <xsl:call-template name="CollaborationTemplate" />	       		   
	     </bpmn2:collaboration>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'CorrelationProperty' or substring-after(@xsi:type, ':') = 'CorrelationProperty'">
         <bpmn2:correlationProperty>
           <xsl:call-template name="CorrelationPropertyAttributesTemplate"/> 
           <xsl:call-template name="CorrelationPropertyTemplate" />	       		   
	     </bpmn2:correlationProperty>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'DataStore' or substring-after(@xsi:type, ':') = 'DataStore'">
         <bpmn2:dataStore>
           <xsl:call-template name="DataStoreAttributesTemplate"/> 
           <xsl:call-template name="DataStoreTemplate" />	       		   
	     </bpmn2:dataStore>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'EndPoint' or substring-after(@xsi:type, ':') = 'EndPoint'">
         <bpmn2:endPoint>
           <xsl:call-template name="EndPointAttributesTemplate"/> 
           <xsl:call-template name="EndPointTemplate" />	       		   
	     </bpmn2:endPoint>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Error' or substring-after(@xsi:type, ':') = 'Error'">
         <bpmn2:error>
           <xsl:call-template name="ErrorAttributesTemplate"/> 
           <xsl:call-template name="ErrorTemplate" />	       		   
	     </bpmn2:error>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Escalation' or substring-after(@xsi:type, ':') = 'Escalation'">
         <bpmn2:escalation>
           <xsl:call-template name="EscalationAttributesTemplate"/> 
           <xsl:call-template name="EscalationTemplate" />	       		   
	     </bpmn2:escalation>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'GlobalBusinessRuleTask' or substring-after(@xsi:type, ':') = 'GlobalBusinessRuleTask'">
         <bpmn2:globalBusinessRuleTask>
           <xsl:call-template name="GlobalBusinessRuleTaskAttributesTemplate"/> 
           <xsl:call-template name="GlobalBusinessRuleTaskTemplate" />	       		   
	     </bpmn2:globalBusinessRuleTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'GlobalManualTask' or substring-after(@xsi:type, ':') = 'GlobalManualTask'">
         <bpmn2:globalManualTask>
           <xsl:call-template name="GlobalManualTaskAttributesTemplate"/> 
           <xsl:call-template name="GlobalManualTaskTemplate" />	       		   
	     </bpmn2:globalManualTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'GlobalScriptTask' or substring-after(@xsi:type, ':') = 'GlobalScriptTask'">
         <bpmn2:globalScriptTask>
           <xsl:call-template name="GlobalScriptTaskAttributesTemplate"/> 
           <xsl:call-template name="GlobalScriptTaskTemplate" />	       		   
	     </bpmn2:globalScriptTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'GlobalTask' or substring-after(@xsi:type, ':') = 'GlobalTask'">
         <bpmn2:globalTask>
           <xsl:call-template name="GlobalTaskAttributesTemplate"/> 
           <xsl:call-template name="GlobalTaskTemplate" />	       		   
	     </bpmn2:globalTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'GlobalUserTask' or substring-after(@xsi:type, ':') = 'GlobalUserTask'">
         <bpmn2:globalUserTask>
           <xsl:call-template name="GlobalUserTaskAttributesTemplate"/> 
           <xsl:call-template name="GlobalUserTaskTemplate" />	       		   
	     </bpmn2:globalUserTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Interface' or substring-after(@xsi:type, ':') = 'Interface'">
         <bpmn2:interface>
           <xsl:call-template name="InterfaceAttributesTemplate"/> 
           <xsl:call-template name="InterfaceTemplate" />	       		   
	     </bpmn2:interface>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ItemDefinition' or substring-after(@xsi:type, ':') = 'ItemDefinition'">
         <bpmn2:itemDefinition>
           <xsl:call-template name="ItemDefinitionAttributesTemplate"/> 
           <xsl:call-template name="ItemDefinitionTemplate" />	       		   
	     </bpmn2:itemDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Message' or substring-after(@xsi:type, ':') = 'Message'">
         <bpmn2:message>
           <xsl:call-template name="MessageAttributesTemplate"/> 
           <xsl:call-template name="MessageTemplate" />	       		   
	     </bpmn2:message>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'PartnerEntity' or substring-after(@xsi:type, ':') = 'PartnerEntity'">
         <bpmn2:partnerEntity>
           <xsl:call-template name="PartnerEntityAttributesTemplate"/> 
           <xsl:call-template name="PartnerEntityTemplate" />	       		   
	     </bpmn2:partnerEntity>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'PartnerRole' or substring-after(@xsi:type, ':') = 'PartnerRole'">
         <bpmn2:partnerRole>
           <xsl:call-template name="PartnerRoleAttributesTemplate"/> 
           <xsl:call-template name="PartnerRoleTemplate" />	       		   
	     </bpmn2:partnerRole>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Process' or substring-after(@xsi:type, ':') = 'Process'">
         <bpmn2:process>
           <xsl:call-template name="ProcessAttributesTemplate"/> 
           <xsl:call-template name="ProcessTemplate" />	       		   
	     </bpmn2:process>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Resource' or substring-after(@xsi:type, ':') = 'Resource'">
         <bpmn2:resource>
           <xsl:call-template name="ResourceAttributesTemplate"/> 
           <xsl:call-template name="ResourceTemplate" />	       		   
	     </bpmn2:resource>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Signal' or substring-after(@xsi:type, ':') = 'Signal'">
         <bpmn2:signal>
           <xsl:call-template name="SignalAttributesTemplate"/> 
           <xsl:call-template name="SignalTemplate" />	       		   
	     </bpmn2:signal>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'CancelEventDefinition' or substring-after(@xsi:type, ':') = 'CancelEventDefinition'">
         <bpmn2:cancelEventDefinition>
           <xsl:call-template name="CancelEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="CancelEventDefinitionTemplate" />	       		   
	     </bpmn2:cancelEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'CompensateEventDefinition' or substring-after(@xsi:type, ':') = 'CompensateEventDefinition'">
         <bpmn2:compensateEventDefinition>
           <xsl:call-template name="CompensateEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="CompensateEventDefinitionTemplate" />	       		   
	     </bpmn2:compensateEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ConditionalEventDefinition' or substring-after(@xsi:type, ':') = 'ConditionalEventDefinition'">
         <bpmn2:conditionalEventDefinition>
           <xsl:call-template name="ConditionalEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="ConditionalEventDefinitionTemplate" />	       		   
	     </bpmn2:conditionalEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ErrorEventDefinition' or substring-after(@xsi:type, ':') = 'ErrorEventDefinition'">
         <bpmn2:errorEventDefinition>
           <xsl:call-template name="ErrorEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="ErrorEventDefinitionTemplate" />	       		   
	     </bpmn2:errorEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'EscalationEventDefinition' or substring-after(@xsi:type, ':') = 'EscalationEventDefinition'">
         <bpmn2:escalationEventDefinition>
           <xsl:call-template name="EscalationEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="EscalationEventDefinitionTemplate" />	       		   
	     </bpmn2:escalationEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'LinkEventDefinition' or substring-after(@xsi:type, ':') = 'LinkEventDefinition'">
         <bpmn2:linkEventDefinition>
           <xsl:call-template name="LinkEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="LinkEventDefinitionTemplate" />	       		   
	     </bpmn2:linkEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'MessageEventDefinition' or substring-after(@xsi:type, ':') = 'MessageEventDefinition'">
         <bpmn2:messageEventDefinition>
           <xsl:call-template name="MessageEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="MessageEventDefinitionTemplate" />	       		   
	     </bpmn2:messageEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'SignalEventDefinition' or substring-after(@xsi:type, ':') = 'SignalEventDefinition'">
         <bpmn2:signalEventDefinition>
           <xsl:call-template name="SignalEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="SignalEventDefinitionTemplate" />	       		   
	     </bpmn2:signalEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'TerminateEventDefinition' or substring-after(@xsi:type, ':') = 'TerminateEventDefinition'">
         <bpmn2:terminateEventDefinition>
           <xsl:call-template name="TerminateEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="TerminateEventDefinitionTemplate" />	       		   
	     </bpmn2:terminateEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'TimerEventDefinition' or substring-after(@xsi:type, ':') = 'TimerEventDefinition'">
         <bpmn2:timerEventDefinition>
           <xsl:call-template name="TimerEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="TimerEventDefinitionTemplate" />	       		   
	     </bpmn2:timerEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Choreography' or substring-after(@xsi:type, ':') = 'Choreography'">
         <bpmn2:choreography>
           <xsl:call-template name="ChoreographyAttributesTemplate"/> 
           <xsl:call-template name="ChoreographyTemplate" />	       		   
	     </bpmn2:choreography>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'GlobalConversation' or substring-after(@xsi:type, ':') = 'GlobalConversation'">
         <bpmn2:globalConversation>
           <xsl:call-template name="GlobalConversationAttributesTemplate"/> 
           <xsl:call-template name="GlobalConversationTemplate" />	       		   
	     </bpmn2:globalConversation>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'GlobalChoreographyTask' or substring-after(@xsi:type, ':') = 'GlobalChoreographyTask'">
         <bpmn2:globalChoreographyTask>
           <xsl:call-template name="GlobalChoreographyTaskAttributesTemplate"/> 
           <xsl:call-template name="GlobalChoreographyTaskTemplate" />	       		   
	     </bpmn2:globalChoreographyTask>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
     <xsl:for-each select="diagrams">			
      <bpmndi:BPMNDiagram>
        <xsl:call-template name="BPMNDiagramAttributesTemplate"/> 
        <xsl:call-template name="BPMNDiagramTemplate" />			   
      </bpmndi:BPMNDiagram>
	 </xsl:for-each>						
     <xsl:for-each select="relationships">			
      <bpmn2:relationship>
        <xsl:call-template name="RelationshipAttributesTemplate"/> 
        <xsl:call-template name="RelationshipTemplate" />			   
      </bpmn2:relationship>
	 </xsl:for-each>						   </bpmn2:definitions>
	</xsl:template>
	
    <xsl:template name="DocumentationAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@textFormat"><xsl:attribute name="textFormat"> <xsl:value-of select="@textFormat" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="DocumentationTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <bpmn2:text><xsl:value-of select="@text"/></bpmn2:text>
	</xsl:template>
	
    <xsl:template name="EndEventAttributesTemplate">
     <xsl:call-template name="ThrowEventAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="EndEventTemplate"  > 
     <xsl:call-template name="ThrowEventTemplate"/> 
	</xsl:template>
	
    <xsl:template name="EndPointAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="EndPointTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ErrorAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@errorCode"><xsl:attribute name="errorCode"> <xsl:value-of select="@errorCode" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@structureRef"><xsl:attribute name="structureRef"> <xsl:value-of select="@structureRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ErrorTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ErrorEventDefinitionAttributesTemplate">
     <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
     <xsl:if test="@errorRef"><xsl:attribute name="errorRef"> <xsl:value-of select="@errorRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ErrorEventDefinitionTemplate"  > 
     <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
	
    <xsl:template name="EscalationAttributesTemplate">
     <xsl:if test="@escalationCode"><xsl:attribute name="escalationCode"> <xsl:value-of select="@escalationCode" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@structureRef"><xsl:attribute name="structureRef"> <xsl:value-of select="@structureRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="EscalationTemplate"  > 
	</xsl:template>
	
    <xsl:template name="EscalationEventDefinitionAttributesTemplate">
     <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
     <xsl:if test="@escalationRef"><xsl:attribute name="escalationRef"> <xsl:value-of select="@escalationRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="EscalationEventDefinitionTemplate"  > 
     <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
	
    <xsl:template name="EventAttributesTemplate">
     <xsl:call-template name="FlowNodeAttributesTemplate"/> 
     <xsl:call-template name="InteractionNodeAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="EventTemplate"  > 
     <xsl:call-template name="FlowNodeTemplate"/> 
     <xsl:call-template name="InteractionNodeTemplate"/> 
     <xsl:for-each select="properties">			
      <bpmn2:property>
        <xsl:call-template name="PropertyAttributesTemplate"/> 
        <xsl:call-template name="PropertyTemplate" />			   
      </bpmn2:property>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="EventBasedGatewayAttributesTemplate">
     <xsl:call-template name="GatewayAttributesTemplate"/> 
     <xsl:if test="@eventGatewayType"><xsl:attribute name="eventGatewayType"> <xsl:value-of select="@eventGatewayType" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@instantiate"><xsl:attribute name="instantiate"> <xsl:value-of select="@instantiate" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="EventBasedGatewayTemplate"  > 
     <xsl:call-template name="GatewayTemplate"/> 
	</xsl:template>
	
    <xsl:template name="EventDefinitionAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="EventDefinitionTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ExclusiveGatewayAttributesTemplate">
     <xsl:call-template name="GatewayAttributesTemplate"/> 
     <xsl:if test="@default"><xsl:attribute name="default"> <xsl:value-of select="@default" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ExclusiveGatewayTemplate"  > 
     <xsl:call-template name="GatewayTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ExpressionAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ExpressionTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ExtensionAttributesTemplate">
     <xsl:if test="definition"><xsl:attribute name="definition"> <xsl:value-of select="definition" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@mustUnderstand"><xsl:attribute name="mustUnderstand"> <xsl:value-of select="@mustUnderstand" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ExtensionTemplate"  > 
	</xsl:template>
	
    <xsl:template name="ExtensionAttributeDefinitionAttributesTemplate">
	</xsl:template>

    <xsl:template name="ExtensionAttributeDefinitionTemplate"  > 
     <bpmn2:name><xsl:value-of select="@name"/></bpmn2:name>
     <bpmn2:type><xsl:value-of select="@type"/></bpmn2:type>
     <bpmn2:isReference><xsl:value-of select="@isReference"/></bpmn2:isReference>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@extensionDefinition" />
       <xsl:with-param name="elementName" select="'bpmn2:extensionDefinition'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="ExtensionAttributeValueAttributesTemplate">
	</xsl:template>

    <xsl:template name="ExtensionAttributeValueTemplate"  > 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@valueRef" />
       <xsl:with-param name="elementName" select="'bpmn2:valueRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:for-each select="value">			
      <bpmn2:value>
        <xsl:call-template name="EObjectAttributesTemplate"/> 
        <xsl:call-template name="EObjectTemplate" />			   
      </bpmn2:value>
	 </xsl:for-each>						
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@extensionAttributeDefinition" />
       <xsl:with-param name="elementName" select="'bpmn2:extensionAttributeDefinition'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="ExtensionDefinitionAttributesTemplate">
	</xsl:template>

    <xsl:template name="ExtensionDefinitionTemplate"  > 
     <bpmn2:name><xsl:value-of select="@name"/></bpmn2:name>
     <xsl:for-each select="extensionAttributeDefinitions">			
      <bpmn2:extensionAttributeDefinitions>
        <xsl:call-template name="ExtensionAttributeDefinitionAttributesTemplate"/> 
        <xsl:call-template name="ExtensionAttributeDefinitionTemplate" />			   
      </bpmn2:extensionAttributeDefinitions>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="FlowElementAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="FlowElementTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="auditing">			
      <bpmn2:auditing>
        <xsl:call-template name="AuditingAttributesTemplate"/> 
        <xsl:call-template name="AuditingTemplate" />			   
      </bpmn2:auditing>
	 </xsl:for-each>						
     <xsl:for-each select="monitoring">			
      <bpmn2:monitoring>
        <xsl:call-template name="MonitoringAttributesTemplate"/> 
        <xsl:call-template name="MonitoringTemplate" />			   
      </bpmn2:monitoring>
	 </xsl:for-each>						
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@categoryValueRef" />
       <xsl:with-param name="elementName" select="'bpmn2:categoryValueRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="FlowElementsContainerAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="FlowElementsContainerTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="laneSets">			
      <bpmn2:laneSet>
        <xsl:call-template name="LaneSetAttributesTemplate"/> 
        <xsl:call-template name="LaneSetTemplate" />			   
      </bpmn2:laneSet>
	 </xsl:for-each>						
     <xsl:for-each select="flowElements">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'AdHocSubProcess' or substring-after(@xsi:type, ':') = 'AdHocSubProcess'">
         <bpmn2:adHocSubProcess>
           <xsl:call-template name="AdHocSubProcessAttributesTemplate"/> 
           <xsl:call-template name="AdHocSubProcessTemplate" />	       		   
	     </bpmn2:adHocSubProcess>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'BoundaryEvent' or substring-after(@xsi:type, ':') = 'BoundaryEvent'">
         <bpmn2:boundaryEvent>
           <xsl:call-template name="BoundaryEventAttributesTemplate"/> 
           <xsl:call-template name="BoundaryEventTemplate" />	       		   
	     </bpmn2:boundaryEvent>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'BusinessRuleTask' or substring-after(@xsi:type, ':') = 'BusinessRuleTask'">
         <bpmn2:businessRuleTask>
           <xsl:call-template name="BusinessRuleTaskAttributesTemplate"/> 
           <xsl:call-template name="BusinessRuleTaskTemplate" />	       		   
	     </bpmn2:businessRuleTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'CallActivity' or substring-after(@xsi:type, ':') = 'CallActivity'">
         <bpmn2:callActivity>
           <xsl:call-template name="CallActivityAttributesTemplate"/> 
           <xsl:call-template name="CallActivityTemplate" />	       		   
	     </bpmn2:callActivity>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'CallChoreography' or substring-after(@xsi:type, ':') = 'CallChoreography'">
         <bpmn2:callChoreography>
           <xsl:call-template name="CallChoreographyAttributesTemplate"/> 
           <xsl:call-template name="CallChoreographyTemplate" />	       		   
	     </bpmn2:callChoreography>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ChoreographyTask' or substring-after(@xsi:type, ':') = 'ChoreographyTask'">
         <bpmn2:choreographyTask>
           <xsl:call-template name="ChoreographyTaskAttributesTemplate"/> 
           <xsl:call-template name="ChoreographyTaskTemplate" />	       		   
	     </bpmn2:choreographyTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ComplexGateway' or substring-after(@xsi:type, ':') = 'ComplexGateway'">
         <bpmn2:complexGateway>
           <xsl:call-template name="ComplexGatewayAttributesTemplate"/> 
           <xsl:call-template name="ComplexGatewayTemplate" />	       		   
	     </bpmn2:complexGateway>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'DataObject' or substring-after(@xsi:type, ':') = 'DataObject'">
         <bpmn2:dataObject>
           <xsl:call-template name="DataObjectAttributesTemplate"/> 
           <xsl:call-template name="DataObjectTemplate" />	       		   
	     </bpmn2:dataObject>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'DataObjectReference' or substring-after(@xsi:type, ':') = 'DataObjectReference'">
         <bpmn2:dataObjectReference>
           <xsl:call-template name="DataObjectReferenceAttributesTemplate"/> 
           <xsl:call-template name="DataObjectReferenceTemplate" />	       		   
	     </bpmn2:dataObjectReference>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'DataStoreReference' or substring-after(@xsi:type, ':') = 'DataStoreReference'">
         <bpmn2:dataStoreReference>
           <xsl:call-template name="DataStoreReferenceAttributesTemplate"/> 
           <xsl:call-template name="DataStoreReferenceTemplate" />	       		   
	     </bpmn2:dataStoreReference>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'EndEvent' or substring-after(@xsi:type, ':') = 'EndEvent'">
         <bpmn2:endEvent>
           <xsl:call-template name="EndEventAttributesTemplate"/> 
           <xsl:call-template name="EndEventTemplate" />	       		   
	     </bpmn2:endEvent>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Event' or substring-after(@xsi:type, ':') = 'Event'">
         <bpmn2:event>
           <xsl:call-template name="EventAttributesTemplate"/> 
           <xsl:call-template name="EventTemplate" />	       		   
	     </bpmn2:event>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'EventBasedGateway' or substring-after(@xsi:type, ':') = 'EventBasedGateway'">
         <bpmn2:eventBasedGateway>
           <xsl:call-template name="EventBasedGatewayAttributesTemplate"/> 
           <xsl:call-template name="EventBasedGatewayTemplate" />	       		   
	     </bpmn2:eventBasedGateway>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ExclusiveGateway' or substring-after(@xsi:type, ':') = 'ExclusiveGateway'">
         <bpmn2:exclusiveGateway>
           <xsl:call-template name="ExclusiveGatewayAttributesTemplate"/> 
           <xsl:call-template name="ExclusiveGatewayTemplate" />	       		   
	     </bpmn2:exclusiveGateway>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ImplicitThrowEvent' or substring-after(@xsi:type, ':') = 'ImplicitThrowEvent'">
         <bpmn2:implicitThrowEvent>
           <xsl:call-template name="ImplicitThrowEventAttributesTemplate"/> 
           <xsl:call-template name="ImplicitThrowEventTemplate" />	       		   
	     </bpmn2:implicitThrowEvent>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'InclusiveGateway' or substring-after(@xsi:type, ':') = 'InclusiveGateway'">
         <bpmn2:inclusiveGateway>
           <xsl:call-template name="InclusiveGatewayAttributesTemplate"/> 
           <xsl:call-template name="InclusiveGatewayTemplate" />	       		   
	     </bpmn2:inclusiveGateway>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'IntermediateCatchEvent' or substring-after(@xsi:type, ':') = 'IntermediateCatchEvent'">
         <bpmn2:intermediateCatchEvent>
           <xsl:call-template name="IntermediateCatchEventAttributesTemplate"/> 
           <xsl:call-template name="IntermediateCatchEventTemplate" />	       		   
	     </bpmn2:intermediateCatchEvent>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'IntermediateThrowEvent' or substring-after(@xsi:type, ':') = 'IntermediateThrowEvent'">
         <bpmn2:intermediateThrowEvent>
           <xsl:call-template name="IntermediateThrowEventAttributesTemplate"/> 
           <xsl:call-template name="IntermediateThrowEventTemplate" />	       		   
	     </bpmn2:intermediateThrowEvent>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ManualTask' or substring-after(@xsi:type, ':') = 'ManualTask'">
         <bpmn2:manualTask>
           <xsl:call-template name="ManualTaskAttributesTemplate"/> 
           <xsl:call-template name="ManualTaskTemplate" />	       		   
	     </bpmn2:manualTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ParallelGateway' or substring-after(@xsi:type, ':') = 'ParallelGateway'">
         <bpmn2:parallelGateway>
           <xsl:call-template name="ParallelGatewayAttributesTemplate"/> 
           <xsl:call-template name="ParallelGatewayTemplate" />	       		   
	     </bpmn2:parallelGateway>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ReceiveTask' or substring-after(@xsi:type, ':') = 'ReceiveTask'">
         <bpmn2:receiveTask>
           <xsl:call-template name="ReceiveTaskAttributesTemplate"/> 
           <xsl:call-template name="ReceiveTaskTemplate" />	       		   
	     </bpmn2:receiveTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ScriptTask' or substring-after(@xsi:type, ':') = 'ScriptTask'">
         <bpmn2:scriptTask>
           <xsl:call-template name="ScriptTaskAttributesTemplate"/> 
           <xsl:call-template name="ScriptTaskTemplate" />	       		   
	     </bpmn2:scriptTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'SendTask' or substring-after(@xsi:type, ':') = 'SendTask'">
         <bpmn2:sendTask>
           <xsl:call-template name="SendTaskAttributesTemplate"/> 
           <xsl:call-template name="SendTaskTemplate" />	       		   
	     </bpmn2:sendTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'SequenceFlow' or substring-after(@xsi:type, ':') = 'SequenceFlow'">
         <bpmn2:sequenceFlow>
           <xsl:call-template name="SequenceFlowAttributesTemplate"/> 
           <xsl:call-template name="SequenceFlowTemplate" />	       		   
	     </bpmn2:sequenceFlow>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ServiceTask' or substring-after(@xsi:type, ':') = 'ServiceTask'">
         <bpmn2:serviceTask>
           <xsl:call-template name="ServiceTaskAttributesTemplate"/> 
           <xsl:call-template name="ServiceTaskTemplate" />	       		   
	     </bpmn2:serviceTask>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'StartEvent' or substring-after(@xsi:type, ':') = 'StartEvent'">
         <bpmn2:startEvent>
           <xsl:call-template name="StartEventAttributesTemplate"/> 
           <xsl:call-template name="StartEventTemplate" />	       		   
	     </bpmn2:startEvent>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'SubChoreography' or substring-after(@xsi:type, ':') = 'SubChoreography'">
         <bpmn2:subChoreography>
           <xsl:call-template name="SubChoreographyAttributesTemplate"/> 
           <xsl:call-template name="SubChoreographyTemplate" />	       		   
	     </bpmn2:subChoreography>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'SubProcess' or substring-after(@xsi:type, ':') = 'SubProcess'">
         <bpmn2:subProcess>
           <xsl:call-template name="SubProcessAttributesTemplate"/> 
           <xsl:call-template name="SubProcessTemplate" />	       		   
	     </bpmn2:subProcess>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Task' or substring-after(@xsi:type, ':') = 'Task'">
         <bpmn2:task>
           <xsl:call-template name="TaskAttributesTemplate"/> 
           <xsl:call-template name="TaskTemplate" />	       		   
	     </bpmn2:task>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Transaction' or substring-after(@xsi:type, ':') = 'Transaction'">
         <bpmn2:transaction>
           <xsl:call-template name="TransactionAttributesTemplate"/> 
           <xsl:call-template name="TransactionTemplate" />	       		   
	     </bpmn2:transaction>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'UserTask' or substring-after(@xsi:type, ':') = 'UserTask'">
         <bpmn2:userTask>
           <xsl:call-template name="UserTaskAttributesTemplate"/> 
           <xsl:call-template name="UserTaskTemplate" />	       		   
	     </bpmn2:userTask>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="FlowNodeAttributesTemplate">
     <xsl:call-template name="FlowElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="FlowNodeTemplate"  > 
     <xsl:call-template name="FlowElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@incoming" />
       <xsl:with-param name="elementName" select="'bpmn2:incoming'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@lanes" />
       <xsl:with-param name="elementName" select="'bpmn2:lanes'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@outgoing" />
       <xsl:with-param name="elementName" select="'bpmn2:outgoing'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="FormalExpressionAttributesTemplate">
     <xsl:call-template name="ExpressionAttributesTemplate"/> 
     <xsl:if test="@evaluatesToTypeRef"><xsl:attribute name="evaluatesToTypeRef"> <xsl:value-of select="@evaluatesToTypeRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@language"><xsl:attribute name="language"> <xsl:value-of select="@language" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="FormalExpressionTemplate"  > 
     <xsl:call-template name="ExpressionTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@body" />
       <xsl:with-param name="elementName" select="'bpmn2:body'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="GatewayAttributesTemplate">
     <xsl:call-template name="FlowNodeAttributesTemplate"/> 
     <xsl:if test="@gatewayDirection"><xsl:attribute name="gatewayDirection"> <xsl:value-of select="@gatewayDirection" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="GatewayTemplate"  > 
     <xsl:call-template name="FlowNodeTemplate"/> 
	</xsl:template>
	
    <xsl:template name="GlobalBusinessRuleTaskAttributesTemplate">
     <xsl:call-template name="GlobalTaskAttributesTemplate"/> 
     <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="GlobalBusinessRuleTaskTemplate"  > 
     <xsl:call-template name="GlobalTaskTemplate"/> 
	</xsl:template>
	
    <xsl:template name="GlobalChoreographyTaskAttributesTemplate">
     <xsl:call-template name="ChoreographyAttributesTemplate"/> 
     <xsl:if test="@initiatingParticipantRef"><xsl:attribute name="initiatingParticipantRef"> <xsl:value-of select="@initiatingParticipantRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="GlobalChoreographyTaskTemplate"  > 
     <xsl:call-template name="ChoreographyTemplate"/> 
	</xsl:template>
	
    <xsl:template name="GlobalConversationAttributesTemplate">
     <xsl:call-template name="CollaborationAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="GlobalConversationTemplate"  > 
     <xsl:call-template name="CollaborationTemplate"/> 
	</xsl:template>
	
    <xsl:template name="GlobalManualTaskAttributesTemplate">
     <xsl:call-template name="GlobalTaskAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="GlobalManualTaskTemplate"  > 
     <xsl:call-template name="GlobalTaskTemplate"/> 
	</xsl:template>
	
    <xsl:template name="GlobalScriptTaskAttributesTemplate">
     <xsl:call-template name="GlobalTaskAttributesTemplate"/> 
     <xsl:if test="@scriptLanguage"><xsl:attribute name="scriptLanguage"> <xsl:value-of select="@scriptLanguage" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="GlobalScriptTaskTemplate"  > 
     <xsl:call-template name="GlobalTaskTemplate"/> 
     <bpmn2:script><xsl:value-of select="@script"/></bpmn2:script>
	</xsl:template>
	
    <xsl:template name="GlobalTaskAttributesTemplate">
     <xsl:call-template name="CallableElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="GlobalTaskTemplate"  > 
     <xsl:call-template name="CallableElementTemplate"/> 
     <xsl:for-each select="resources">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Performer' or substring-after(@xsi:type, ':') = 'Performer'">
         <bpmn2:performer>
           <xsl:call-template name="PerformerAttributesTemplate"/> 
           <xsl:call-template name="PerformerTemplate" />	       		   
	     </bpmn2:performer>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'HumanPerformer' or substring-after(@xsi:type, ':') = 'HumanPerformer'">
         <bpmn2:humanPerformer>
           <xsl:call-template name="HumanPerformerAttributesTemplate"/> 
           <xsl:call-template name="HumanPerformerTemplate" />	       		   
	     </bpmn2:humanPerformer>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'PotentialOwner' or substring-after(@xsi:type, ':') = 'PotentialOwner'">
         <bpmn2:potentialOwner>
           <xsl:call-template name="PotentialOwnerAttributesTemplate"/> 
           <xsl:call-template name="PotentialOwnerTemplate" />	       		   
	     </bpmn2:potentialOwner>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="GlobalUserTaskAttributesTemplate">
     <xsl:call-template name="GlobalTaskAttributesTemplate"/> 
     <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="GlobalUserTaskTemplate"  > 
     <xsl:call-template name="GlobalTaskTemplate"/> 
     <xsl:for-each select="renderings">			
      <bpmn2:rendering>
        <xsl:call-template name="RenderingAttributesTemplate"/> 
        <xsl:call-template name="RenderingTemplate" />			   
      </bpmn2:rendering>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="GroupAttributesTemplate">
     <xsl:call-template name="ArtifactAttributesTemplate"/> 
     <xsl:if test="@categoryValueRef"><xsl:attribute name="categoryValueRef"> <xsl:value-of select="@categoryValueRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="GroupTemplate"  > 
     <xsl:call-template name="ArtifactTemplate"/> 
	</xsl:template>
	
    <xsl:template name="HumanPerformerAttributesTemplate">
     <xsl:call-template name="PerformerAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="HumanPerformerTemplate"  > 
     <xsl:call-template name="PerformerTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ImplicitThrowEventAttributesTemplate">
     <xsl:call-template name="ThrowEventAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ImplicitThrowEventTemplate"  > 
     <xsl:call-template name="ThrowEventTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ImportAttributesTemplate">
     <xsl:if test="@importType"><xsl:attribute name="importType"> <xsl:value-of select="@importType" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@location"><xsl:attribute name="location"> <xsl:value-of select="@location" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@namespace"><xsl:attribute name="namespace"> <xsl:value-of select="@namespace" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ImportTemplate"  > 
	</xsl:template>
	
    <xsl:template name="InclusiveGatewayAttributesTemplate">
     <xsl:call-template name="GatewayAttributesTemplate"/> 
     <xsl:if test="@default"><xsl:attribute name="default"> <xsl:value-of select="@default" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="InclusiveGatewayTemplate"  > 
     <xsl:call-template name="GatewayTemplate"/> 
	</xsl:template>
	
    <xsl:template name="InputOutputBindingAttributesTemplate">
     <xsl:if test="@inputDataRef"><xsl:attribute name="inputDataRef"> <xsl:value-of select="@inputDataRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@operationRef"><xsl:attribute name="operationRef"> <xsl:value-of select="@operationRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@outputDataRef"><xsl:attribute name="outputDataRef"> <xsl:value-of select="@outputDataRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="InputOutputBindingTemplate"  > 
	</xsl:template>
	
    <xsl:template name="InputOutputSpecificationAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="InputOutputSpecificationTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="dataInputs">			
      <bpmn2:dataInput>
        <xsl:call-template name="DataInputAttributesTemplate"/> 
        <xsl:call-template name="DataInputTemplate" />			   
      </bpmn2:dataInput>
	 </xsl:for-each>						
     <xsl:for-each select="dataOutputs">			
      <bpmn2:dataOutput>
        <xsl:call-template name="DataOutputAttributesTemplate"/> 
        <xsl:call-template name="DataOutputTemplate" />			   
      </bpmn2:dataOutput>
	 </xsl:for-each>						
     <xsl:for-each select="inputSets">			
      <bpmn2:inputSet>
        <xsl:call-template name="InputSetAttributesTemplate"/> 
        <xsl:call-template name="InputSetTemplate" />			   
      </bpmn2:inputSet>
	 </xsl:for-each>						
     <xsl:for-each select="outputSets">			
      <bpmn2:outputSet>
        <xsl:call-template name="OutputSetAttributesTemplate"/> 
        <xsl:call-template name="OutputSetTemplate" />			   
      </bpmn2:outputSet>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="InputSetAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="InputSetTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@dataInputRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:dataInputRefs'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@optionalInputRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:optionalInputRefs'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@whileExecutingInputRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:whileExecutingInputRefs'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@outputSetRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:outputSetRefs'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="InteractionNodeAttributesTemplate">
	</xsl:template>

    <xsl:template name="InteractionNodeTemplate"  > 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@incomingConversationLinks" />
       <xsl:with-param name="elementName" select="'bpmn2:incomingConversationLinks'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@outgoingConversationLinks" />
       <xsl:with-param name="elementName" select="'bpmn2:outgoingConversationLinks'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="InterfaceAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@implementationRef"><xsl:attribute name="implementationRef"> <xsl:value-of select="@implementationRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="InterfaceTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
     <xsl:for-each select="operations">			
      <bpmn2:operation>
        <xsl:call-template name="OperationAttributesTemplate"/> 
        <xsl:call-template name="OperationTemplate" />			   
      </bpmn2:operation>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="IntermediateCatchEventAttributesTemplate">
     <xsl:call-template name="CatchEventAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="IntermediateCatchEventTemplate"  > 
     <xsl:call-template name="CatchEventTemplate"/> 
	</xsl:template>
	
    <xsl:template name="IntermediateThrowEventAttributesTemplate">
     <xsl:call-template name="ThrowEventAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="IntermediateThrowEventTemplate"  > 
     <xsl:call-template name="ThrowEventTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ItemAwareElementAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@itemSubjectRef"><xsl:attribute name="itemSubjectRef"> <xsl:value-of select="@itemSubjectRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ItemAwareElementTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="dataState">			
      <bpmn2:dataState>
        <xsl:call-template name="DataStateAttributesTemplate"/> 
        <xsl:call-template name="DataStateTemplate" />			   
      </bpmn2:dataState>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ItemDefinitionAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@isCollection"><xsl:attribute name="isCollection"> <xsl:value-of select="@isCollection" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@itemKind"><xsl:attribute name="itemKind"> <xsl:value-of select="@itemKind" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@structureRef"><xsl:attribute name="structureRef"> <xsl:value-of select="@structureRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ItemDefinitionTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@import" />
       <xsl:with-param name="elementName" select="'bpmn2:import'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="LaneAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@partitionElementRef"><xsl:attribute name="partitionElementRef"> <xsl:value-of select="@partitionElementRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="LaneTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="partitionElement">			
      <bpmn2:partitionElement>
        <xsl:call-template name="BaseElementAttributesTemplate"/> 
        <xsl:call-template name="BaseElementTemplate" />			   
      </bpmn2:partitionElement>
	 </xsl:for-each>						
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@flowNodeRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:flowNodeRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:for-each select="childLaneSet">			
      <bpmn2:childLaneSet>
        <xsl:call-template name="LaneSetAttributesTemplate"/> 
        <xsl:call-template name="LaneSetTemplate" />			   
      </bpmn2:childLaneSet>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="LaneSetAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="LaneSetTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:for-each select="lanes">			
      <bpmn2:lane>
        <xsl:call-template name="LaneAttributesTemplate"/> 
        <xsl:call-template name="LaneTemplate" />			   
      </bpmn2:lane>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="LinkEventDefinitionAttributesTemplate">
     <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="LinkEventDefinitionTemplate"  > 
     <xsl:call-template name="EventDefinitionTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@source" />
       <xsl:with-param name="elementName" select="'bpmn2:source'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@target" />
       <xsl:with-param name="elementName" select="'bpmn2:target'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="LoopCharacteristicsAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="LoopCharacteristicsTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ManualTaskAttributesTemplate">
     <xsl:call-template name="TaskAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ManualTaskTemplate"  > 
     <xsl:call-template name="TaskTemplate"/> 
	</xsl:template>
	
    <xsl:template name="MessageAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@itemRef"><xsl:attribute name="itemRef"> <xsl:value-of select="@itemRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="MessageTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="MessageEventDefinitionAttributesTemplate">
     <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
     <xsl:if test="@messageRef"><xsl:attribute name="messageRef"> <xsl:value-of select="@messageRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="MessageEventDefinitionTemplate"  > 
     <xsl:call-template name="EventDefinitionTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@operationRef" />
       <xsl:with-param name="elementName" select="'bpmn2:operationRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="MessageFlowAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@messageRef"><xsl:attribute name="messageRef"> <xsl:value-of select="@messageRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@sourceRef"><xsl:attribute name="sourceRef"> <xsl:value-of select="@sourceRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@targetRef"><xsl:attribute name="targetRef"> <xsl:value-of select="@targetRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="MessageFlowTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="MessageFlowAssociationAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@innerMessageFlowRef"><xsl:attribute name="innerMessageFlowRef"> <xsl:value-of select="@innerMessageFlowRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@outerMessageFlowRef"><xsl:attribute name="outerMessageFlowRef"> <xsl:value-of select="@outerMessageFlowRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="MessageFlowAssociationTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="MonitoringAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="MonitoringTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="MultiInstanceLoopCharacteristicsAttributesTemplate">
     <xsl:call-template name="LoopCharacteristicsAttributesTemplate"/> 
     <xsl:if test="@behavior"><xsl:attribute name="behavior"> <xsl:value-of select="@behavior" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isSequential"><xsl:attribute name="isSequential"> <xsl:value-of select="@isSequential" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@noneBehaviorEventRef"><xsl:attribute name="noneBehaviorEventRef"> <xsl:value-of select="@noneBehaviorEventRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@oneBehaviorEventRef"><xsl:attribute name="oneBehaviorEventRef"> <xsl:value-of select="@oneBehaviorEventRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="MultiInstanceLoopCharacteristicsTemplate"  > 
     <xsl:call-template name="LoopCharacteristicsTemplate"/> 
     <xsl:for-each select="loopCardinality">			
      <bpmn2:loopCardinality>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:loopCardinality>
	 </xsl:for-each>						
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@loopDataInputRef" />
       <xsl:with-param name="elementName" select="'bpmn2:loopDataInputRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@loopDataOutputRef" />
       <xsl:with-param name="elementName" select="'bpmn2:loopDataOutputRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:for-each select="inputDataItem">			
      <bpmn2:inputDataItem>
        <xsl:call-template name="DataInputAttributesTemplate"/> 
        <xsl:call-template name="DataInputTemplate" />			   
      </bpmn2:inputDataItem>
	 </xsl:for-each>						
     <xsl:for-each select="outputDataItem">			
      <bpmn2:outputDataItem>
        <xsl:call-template name="DataOutputAttributesTemplate"/> 
        <xsl:call-template name="DataOutputTemplate" />			   
      </bpmn2:outputDataItem>
	 </xsl:for-each>						
     <xsl:for-each select="complexBehaviorDefinition">			
      <bpmn2:complexBehaviorDefinition>
        <xsl:call-template name="ComplexBehaviorDefinitionAttributesTemplate"/> 
        <xsl:call-template name="ComplexBehaviorDefinitionTemplate" />			   
      </bpmn2:complexBehaviorDefinition>
	 </xsl:for-each>						
     <xsl:for-each select="completionCondition">			
      <bpmn2:completionCondition>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:completionCondition>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="OperationAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@implementationRef"><xsl:attribute name="implementationRef"> <xsl:value-of select="@implementationRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="OperationTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@inMessageRef" />
       <xsl:with-param name="elementName" select="'bpmn2:inMessageRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@outMessageRef" />
       <xsl:with-param name="elementName" select="'bpmn2:outMessageRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@errorRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:errorRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="OutputSetAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="OutputSetTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@dataOutputRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:dataOutputRefs'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@optionalOutputRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:optionalOutputRefs'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@whileExecutingOutputRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:whileExecutingOutputRefs'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@inputSetRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:inputSetRefs'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="ParallelGatewayAttributesTemplate">
     <xsl:call-template name="GatewayAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ParallelGatewayTemplate"  > 
     <xsl:call-template name="GatewayTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ParticipantAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:call-template name="InteractionNodeAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@processRef"><xsl:attribute name="processRef"> <xsl:value-of select="@processRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ParticipantTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:call-template name="InteractionNodeTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@interfaceRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:interfaceRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@endPointRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:endPointRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:for-each select="participantMultiplicity">			
      <bpmn2:participantMultiplicity>
        <xsl:call-template name="ParticipantMultiplicityAttributesTemplate"/> 
        <xsl:call-template name="ParticipantMultiplicityTemplate" />			   
      </bpmn2:participantMultiplicity>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ParticipantAssociationAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ParticipantAssociationTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@innerParticipantRef" />
       <xsl:with-param name="elementName" select="'bpmn2:innerParticipantRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@outerParticipantRef" />
       <xsl:with-param name="elementName" select="'bpmn2:outerParticipantRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="ParticipantMultiplicityAttributesTemplate">
     <xsl:if test="@maximum"><xsl:attribute name="maximum"> <xsl:value-of select="@maximum" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@minimum"><xsl:attribute name="minimum"> <xsl:value-of select="@minimum" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ParticipantMultiplicityTemplate"  > 
	</xsl:template>
	
    <xsl:template name="PartnerEntityAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="PartnerEntityTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@participantRef" />
       <xsl:with-param name="elementName" select="'bpmn2:participantRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="PartnerRoleAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="PartnerRoleTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@participantRef" />
       <xsl:with-param name="elementName" select="'bpmn2:participantRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="PerformerAttributesTemplate">
     <xsl:call-template name="ResourceRoleAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="PerformerTemplate"  > 
     <xsl:call-template name="ResourceRoleTemplate"/> 
	</xsl:template>
	
    <xsl:template name="PotentialOwnerAttributesTemplate">
     <xsl:call-template name="HumanPerformerAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="PotentialOwnerTemplate"  > 
     <xsl:call-template name="HumanPerformerTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ProcessAttributesTemplate">
     <xsl:call-template name="CallableElementAttributesTemplate"/> 
     <xsl:call-template name="FlowElementsContainerAttributesTemplate"/> 
     <xsl:if test="@definitionalCollaborationRef"><xsl:attribute name="definitionalCollaborationRef"> <xsl:value-of select="@definitionalCollaborationRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isClosed"><xsl:attribute name="isClosed"> <xsl:value-of select="@isClosed" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isExecutable"><xsl:attribute name="isExecutable"> <xsl:value-of select="@isExecutable" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@processType"><xsl:attribute name="processType"> <xsl:value-of select="@processType" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ProcessTemplate"  > 
     <xsl:call-template name="CallableElementTemplate"/> 
     <xsl:call-template name="FlowElementsContainerTemplate"/> 
     <xsl:for-each select="auditing">			
      <bpmn2:auditing>
        <xsl:call-template name="AuditingAttributesTemplate"/> 
        <xsl:call-template name="AuditingTemplate" />			   
      </bpmn2:auditing>
	 </xsl:for-each>						
     <xsl:for-each select="monitoring">			
      <bpmn2:monitoring>
        <xsl:call-template name="MonitoringAttributesTemplate"/> 
        <xsl:call-template name="MonitoringTemplate" />			   
      </bpmn2:monitoring>
	 </xsl:for-each>						
     <xsl:for-each select="properties">			
      <bpmn2:property>
        <xsl:call-template name="PropertyAttributesTemplate"/> 
        <xsl:call-template name="PropertyTemplate" />			   
      </bpmn2:property>
	 </xsl:for-each>						
     <xsl:for-each select="artifacts">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Association' or substring-after(@xsi:type, ':') = 'Association'">
         <bpmn2:association>
           <xsl:call-template name="AssociationAttributesTemplate"/> 
           <xsl:call-template name="AssociationTemplate" />	       		   
	     </bpmn2:association>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Group' or substring-after(@xsi:type, ':') = 'Group'">
         <bpmn2:group>
           <xsl:call-template name="GroupAttributesTemplate"/> 
           <xsl:call-template name="GroupTemplate" />	       		   
	     </bpmn2:group>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'TextAnnotation' or substring-after(@xsi:type, ':') = 'TextAnnotation'">
         <bpmn2:textAnnotation>
           <xsl:call-template name="TextAnnotationAttributesTemplate"/> 
           <xsl:call-template name="TextAnnotationTemplate" />	       		   
	     </bpmn2:textAnnotation>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
     <xsl:for-each select="resources">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Performer' or substring-after(@xsi:type, ':') = 'Performer'">
         <bpmn2:performer>
           <xsl:call-template name="PerformerAttributesTemplate"/> 
           <xsl:call-template name="PerformerTemplate" />	       		   
	     </bpmn2:performer>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'HumanPerformer' or substring-after(@xsi:type, ':') = 'HumanPerformer'">
         <bpmn2:humanPerformer>
           <xsl:call-template name="HumanPerformerAttributesTemplate"/> 
           <xsl:call-template name="HumanPerformerTemplate" />	       		   
	     </bpmn2:humanPerformer>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'PotentialOwner' or substring-after(@xsi:type, ':') = 'PotentialOwner'">
         <bpmn2:potentialOwner>
           <xsl:call-template name="PotentialOwnerAttributesTemplate"/> 
           <xsl:call-template name="PotentialOwnerTemplate" />	       		   
	     </bpmn2:potentialOwner>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
     <xsl:for-each select="correlationSubscriptions">			
      <bpmn2:correlationSubscription>
        <xsl:call-template name="CorrelationSubscriptionAttributesTemplate"/> 
        <xsl:call-template name="CorrelationSubscriptionTemplate" />			   
      </bpmn2:correlationSubscription>
	 </xsl:for-each>						
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@supports" />
       <xsl:with-param name="elementName" select="'bpmn2:supports'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="PropertyAttributesTemplate">
     <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="PropertyTemplate"  > 
     <xsl:call-template name="ItemAwareElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ReceiveTaskAttributesTemplate">
     <xsl:call-template name="TaskAttributesTemplate"/> 
     <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@instantiate"><xsl:attribute name="instantiate"> <xsl:value-of select="@instantiate" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@messageRef"><xsl:attribute name="messageRef"> <xsl:value-of select="@messageRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@operationRef"><xsl:attribute name="operationRef"> <xsl:value-of select="@operationRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ReceiveTaskTemplate"  > 
     <xsl:call-template name="TaskTemplate"/> 
	</xsl:template>
	
    <xsl:template name="RelationshipAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@direction"><xsl:attribute name="direction"> <xsl:value-of select="@direction" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@type"><xsl:attribute name="type"> <xsl:value-of select="@type" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="RelationshipTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@sources" />
       <xsl:with-param name="elementName" select="'bpmn2:source'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@targets" />
       <xsl:with-param name="elementName" select="'bpmn2:target'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="RenderingAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="RenderingTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ResourceAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ResourceTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
     <xsl:for-each select="resourceParameters">			
      <bpmn2:resourceParameter>
        <xsl:call-template name="ResourceParameterAttributesTemplate"/> 
        <xsl:call-template name="ResourceParameterTemplate" />			   
      </bpmn2:resourceParameter>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ResourceAssignmentExpressionAttributesTemplate">
	</xsl:template>

    <xsl:template name="ResourceAssignmentExpressionTemplate"  > 
     <xsl:for-each select="expression">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'FormalExpression' or substring-after(@xsi:type, ':') = 'FormalExpression'">
         <bpmn2:formalExpression>
           <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
           <xsl:call-template name="FormalExpressionTemplate" />	       		   
	     </bpmn2:formalExpression>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ResourceParameterAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@isRequired"><xsl:attribute name="isRequired"> <xsl:value-of select="@isRequired" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@type"><xsl:attribute name="type"> <xsl:value-of select="@type" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ResourceParameterTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ResourceParameterBindingAttributesTemplate">
     <xsl:if test="@parameterRef"><xsl:attribute name="parameterRef"> <xsl:value-of select="@parameterRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ResourceParameterBindingTemplate"  > 
     <xsl:for-each select="expression">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'FormalExpression' or substring-after(@xsi:type, ':') = 'FormalExpression'">
         <bpmn2:formalExpression>
           <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
           <xsl:call-template name="FormalExpressionTemplate" />	       		   
	     </bpmn2:formalExpression>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ResourceRoleAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ResourceRoleTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@resourceRef" />
       <xsl:with-param name="elementName" select="'bpmn2:resourceRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
     <xsl:for-each select="resourceParameterBindings">			
      <bpmn2:resourceParameterBinding>
        <xsl:call-template name="ResourceParameterBindingAttributesTemplate"/> 
        <xsl:call-template name="ResourceParameterBindingTemplate" />			   
      </bpmn2:resourceParameterBinding>
	 </xsl:for-each>						
     <xsl:for-each select="resourceAssignmentExpression">			
      <bpmn2:resourceAssignmentExpression>
        <xsl:call-template name="ResourceAssignmentExpressionAttributesTemplate"/> 
        <xsl:call-template name="ResourceAssignmentExpressionTemplate" />			   
      </bpmn2:resourceAssignmentExpression>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="RootElementAttributesTemplate">
     <xsl:call-template name="BaseElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="RootElementTemplate"  > 
     <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="ScriptTaskAttributesTemplate">
     <xsl:call-template name="TaskAttributesTemplate"/> 
     <xsl:if test="@scriptFormat"><xsl:attribute name="scriptFormat"> <xsl:value-of select="@scriptFormat" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ScriptTaskTemplate"  > 
     <xsl:call-template name="TaskTemplate"/> 
     <bpmn2:script><xsl:value-of select="@script"/></bpmn2:script>
	</xsl:template>
	
    <xsl:template name="SendTaskAttributesTemplate">
     <xsl:call-template name="TaskAttributesTemplate"/> 
     <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@messageRef"><xsl:attribute name="messageRef"> <xsl:value-of select="@messageRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@operationRef"><xsl:attribute name="operationRef"> <xsl:value-of select="@operationRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="SendTaskTemplate"  > 
     <xsl:call-template name="TaskTemplate"/> 
	</xsl:template>
	
    <xsl:template name="SequenceFlowAttributesTemplate">
     <xsl:call-template name="FlowElementAttributesTemplate"/> 
     <xsl:if test="@isImmediate"><xsl:attribute name="isImmediate"> <xsl:value-of select="@isImmediate" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@sourceRef"><xsl:attribute name="sourceRef"> <xsl:value-of select="@sourceRef" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@targetRef"><xsl:attribute name="targetRef"> <xsl:value-of select="@targetRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="SequenceFlowTemplate"  > 
     <xsl:call-template name="FlowElementTemplate"/> 
     <xsl:for-each select="conditionExpression">			
      <bpmn2:conditionExpression>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:conditionExpression>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ServiceTaskAttributesTemplate">
     <xsl:call-template name="TaskAttributesTemplate"/> 
     <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@operationRef"><xsl:attribute name="operationRef"> <xsl:value-of select="@operationRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="ServiceTaskTemplate"  > 
     <xsl:call-template name="TaskTemplate"/> 
	</xsl:template>
	
    <xsl:template name="SignalAttributesTemplate">
     <xsl:call-template name="RootElementAttributesTemplate"/> 
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@structureRef"><xsl:attribute name="structureRef"> <xsl:value-of select="@structureRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="SignalTemplate"  > 
     <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="SignalEventDefinitionAttributesTemplate">
     <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
     <xsl:if test="@signalRef"><xsl:attribute name="signalRef"> <xsl:value-of select="@signalRef" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="SignalEventDefinitionTemplate"  > 
     <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
	
    <xsl:template name="StandardLoopCharacteristicsAttributesTemplate">
     <xsl:call-template name="LoopCharacteristicsAttributesTemplate"/> 
     <xsl:if test="loopMaximum"><xsl:attribute name="loopMaximum"> <xsl:value-of select="loopMaximum" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@testBefore"><xsl:attribute name="testBefore"> <xsl:value-of select="@testBefore" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="StandardLoopCharacteristicsTemplate"  > 
     <xsl:call-template name="LoopCharacteristicsTemplate"/> 
     <xsl:for-each select="loopCondition">			
      <bpmn2:loopCondition>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:loopCondition>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="StartEventAttributesTemplate">
     <xsl:call-template name="CatchEventAttributesTemplate"/> 
     <xsl:if test="@isInterrupting"><xsl:attribute name="isInterrupting"> <xsl:value-of select="@isInterrupting" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="StartEventTemplate"  > 
     <xsl:call-template name="CatchEventTemplate"/> 
	</xsl:template>
	
    <xsl:template name="SubChoreographyAttributesTemplate">
     <xsl:call-template name="ChoreographyActivityAttributesTemplate"/> 
     <xsl:call-template name="FlowElementsContainerAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="SubChoreographyTemplate"  > 
     <xsl:call-template name="ChoreographyActivityTemplate"/> 
     <xsl:call-template name="FlowElementsContainerTemplate"/> 
     <xsl:for-each select="artifacts">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Association' or substring-after(@xsi:type, ':') = 'Association'">
         <bpmn2:association>
           <xsl:call-template name="AssociationAttributesTemplate"/> 
           <xsl:call-template name="AssociationTemplate" />	       		   
	     </bpmn2:association>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Group' or substring-after(@xsi:type, ':') = 'Group'">
         <bpmn2:group>
           <xsl:call-template name="GroupAttributesTemplate"/> 
           <xsl:call-template name="GroupTemplate" />	       		   
	     </bpmn2:group>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'TextAnnotation' or substring-after(@xsi:type, ':') = 'TextAnnotation'">
         <bpmn2:textAnnotation>
           <xsl:call-template name="TextAnnotationAttributesTemplate"/> 
           <xsl:call-template name="TextAnnotationTemplate" />	       		   
	     </bpmn2:textAnnotation>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="SubConversationAttributesTemplate">
     <xsl:call-template name="ConversationNodeAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="SubConversationTemplate"  > 
     <xsl:call-template name="ConversationNodeTemplate"/> 
     <xsl:for-each select="conversationNodes">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'CallConversation' or substring-after(@xsi:type, ':') = 'CallConversation'">
         <bpmn2:callConversation>
           <xsl:call-template name="CallConversationAttributesTemplate"/> 
           <xsl:call-template name="CallConversationTemplate" />	       		   
	     </bpmn2:callConversation>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Conversation' or substring-after(@xsi:type, ':') = 'Conversation'">
         <bpmn2:conversation>
           <xsl:call-template name="ConversationAttributesTemplate"/> 
           <xsl:call-template name="ConversationTemplate" />	       		   
	     </bpmn2:conversation>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'SubConversation' or substring-after(@xsi:type, ':') = 'SubConversation'">
         <bpmn2:subConversation>
           <xsl:call-template name="SubConversationAttributesTemplate"/> 
           <xsl:call-template name="SubConversationTemplate" />	       		   
	     </bpmn2:subConversation>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="SubProcessAttributesTemplate">
     <xsl:call-template name="ActivityAttributesTemplate"/> 
     <xsl:call-template name="FlowElementsContainerAttributesTemplate"/> 
     <xsl:if test="@triggeredByEvent"><xsl:attribute name="triggeredByEvent"> <xsl:value-of select="@triggeredByEvent" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="SubProcessTemplate"  > 
     <xsl:call-template name="ActivityTemplate"/> 
     <xsl:call-template name="FlowElementsContainerTemplate"/> 
     <xsl:for-each select="artifacts">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Association' or substring-after(@xsi:type, ':') = 'Association'">
         <bpmn2:association>
           <xsl:call-template name="AssociationAttributesTemplate"/> 
           <xsl:call-template name="AssociationTemplate" />	       		   
	     </bpmn2:association>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'Group' or substring-after(@xsi:type, ':') = 'Group'">
         <bpmn2:group>
           <xsl:call-template name="GroupAttributesTemplate"/> 
           <xsl:call-template name="GroupTemplate" />	       		   
	     </bpmn2:group>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'TextAnnotation' or substring-after(@xsi:type, ':') = 'TextAnnotation'">
         <bpmn2:textAnnotation>
           <xsl:call-template name="TextAnnotationAttributesTemplate"/> 
           <xsl:call-template name="TextAnnotationTemplate" />	       		   
	     </bpmn2:textAnnotation>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="TaskAttributesTemplate">
     <xsl:call-template name="ActivityAttributesTemplate"/> 
     <xsl:call-template name="InteractionNodeAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="TaskTemplate"  > 
     <xsl:call-template name="ActivityTemplate"/> 
     <xsl:call-template name="InteractionNodeTemplate"/> 
	</xsl:template>
	
    <xsl:template name="TerminateEventDefinitionAttributesTemplate">
     <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="TerminateEventDefinitionTemplate"  > 
     <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
	
    <xsl:template name="TextAnnotationAttributesTemplate">
     <xsl:call-template name="ArtifactAttributesTemplate"/> 
     <xsl:if test="@textFormat"><xsl:attribute name="textFormat"> <xsl:value-of select="@textFormat" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="TextAnnotationTemplate"  > 
     <xsl:call-template name="ArtifactTemplate"/> 
     <bpmn2:text><xsl:value-of select="@text"/></bpmn2:text>
	</xsl:template>
	
    <xsl:template name="ThrowEventAttributesTemplate">
     <xsl:call-template name="EventAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ThrowEventTemplate"  > 
     <xsl:call-template name="EventTemplate"/> 
     <xsl:for-each select="dataInputs">			
      <bpmn2:dataInput>
        <xsl:call-template name="DataInputAttributesTemplate"/> 
        <xsl:call-template name="DataInputTemplate" />			   
      </bpmn2:dataInput>
	 </xsl:for-each>						
     <xsl:for-each select="dataInputAssociation">			
      <bpmn2:dataInputAssociation>
        <xsl:call-template name="DataInputAssociationAttributesTemplate"/> 
        <xsl:call-template name="DataInputAssociationTemplate" />			   
      </bpmn2:dataInputAssociation>
	 </xsl:for-each>						
     <xsl:for-each select="inputSet">			
      <bpmn2:inputSet>
        <xsl:call-template name="InputSetAttributesTemplate"/> 
        <xsl:call-template name="InputSetTemplate" />			   
      </bpmn2:inputSet>
	 </xsl:for-each>						
     <xsl:for-each select="eventDefinitions">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'CancelEventDefinition' or substring-after(@xsi:type, ':') = 'CancelEventDefinition'">
         <bpmn2:cancelEventDefinition>
           <xsl:call-template name="CancelEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="CancelEventDefinitionTemplate" />	       		   
	     </bpmn2:cancelEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'CompensateEventDefinition' or substring-after(@xsi:type, ':') = 'CompensateEventDefinition'">
         <bpmn2:compensateEventDefinition>
           <xsl:call-template name="CompensateEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="CompensateEventDefinitionTemplate" />	       		   
	     </bpmn2:compensateEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ConditionalEventDefinition' or substring-after(@xsi:type, ':') = 'ConditionalEventDefinition'">
         <bpmn2:conditionalEventDefinition>
           <xsl:call-template name="ConditionalEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="ConditionalEventDefinitionTemplate" />	       		   
	     </bpmn2:conditionalEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'ErrorEventDefinition' or substring-after(@xsi:type, ':') = 'ErrorEventDefinition'">
         <bpmn2:errorEventDefinition>
           <xsl:call-template name="ErrorEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="ErrorEventDefinitionTemplate" />	       		   
	     </bpmn2:errorEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'EscalationEventDefinition' or substring-after(@xsi:type, ':') = 'EscalationEventDefinition'">
         <bpmn2:escalationEventDefinition>
           <xsl:call-template name="EscalationEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="EscalationEventDefinitionTemplate" />	       		   
	     </bpmn2:escalationEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'LinkEventDefinition' or substring-after(@xsi:type, ':') = 'LinkEventDefinition'">
         <bpmn2:linkEventDefinition>
           <xsl:call-template name="LinkEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="LinkEventDefinitionTemplate" />	       		   
	     </bpmn2:linkEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'MessageEventDefinition' or substring-after(@xsi:type, ':') = 'MessageEventDefinition'">
         <bpmn2:messageEventDefinition>
           <xsl:call-template name="MessageEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="MessageEventDefinitionTemplate" />	       		   
	     </bpmn2:messageEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'SignalEventDefinition' or substring-after(@xsi:type, ':') = 'SignalEventDefinition'">
         <bpmn2:signalEventDefinition>
           <xsl:call-template name="SignalEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="SignalEventDefinitionTemplate" />	       		   
	     </bpmn2:signalEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'TerminateEventDefinition' or substring-after(@xsi:type, ':') = 'TerminateEventDefinition'">
         <bpmn2:terminateEventDefinition>
           <xsl:call-template name="TerminateEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="TerminateEventDefinitionTemplate" />	       		   
	     </bpmn2:terminateEventDefinition>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'TimerEventDefinition' or substring-after(@xsi:type, ':') = 'TimerEventDefinition'">
         <bpmn2:timerEventDefinition>
           <xsl:call-template name="TimerEventDefinitionAttributesTemplate"/> 
           <xsl:call-template name="TimerEventDefinitionTemplate" />	       		   
	     </bpmn2:timerEventDefinition>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@eventDefinitionRefs" />
       <xsl:with-param name="elementName" select="'bpmn2:eventDefinitionRef'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/BPMN/20100524/MODEL'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="TimerEventDefinitionAttributesTemplate">
     <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="TimerEventDefinitionTemplate"  > 
     <xsl:call-template name="EventDefinitionTemplate"/> 
     <xsl:for-each select="timeDate">			
      <bpmn2:timeDate>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:timeDate>
	 </xsl:for-each>						
     <xsl:for-each select="timeDuration">			
      <bpmn2:timeDuration>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:timeDuration>
	 </xsl:for-each>						
     <xsl:for-each select="timeCycle">			
      <bpmn2:timeCycle>
        <xsl:call-template name="ExpressionAttributesTemplate"/> 
        <xsl:call-template name="ExpressionTemplate" />			   
      </bpmn2:timeCycle>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="TransactionAttributesTemplate">
     <xsl:call-template name="SubProcessAttributesTemplate"/> 
     <xsl:if test="@method"><xsl:attribute name="method"> <xsl:value-of select="@method" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="TransactionTemplate"  > 
     <xsl:call-template name="SubProcessTemplate"/> 
     <bpmn2:protocol><xsl:value-of select="@protocol"/></bpmn2:protocol>
	</xsl:template>
	
    <xsl:template name="UserTaskAttributesTemplate">
     <xsl:call-template name="TaskAttributesTemplate"/> 
     <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="UserTaskTemplate"  > 
     <xsl:call-template name="TaskTemplate"/> 
     <xsl:for-each select="renderings">			
      <bpmn2:rendering>
        <xsl:call-template name="RenderingAttributesTemplate"/> 
        <xsl:call-template name="RenderingTemplate" />			   
      </bpmn2:rendering>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="BPMNDiagramAttributesTemplate">
     <xsl:call-template name="DiagramAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="BPMNDiagramTemplate"  > 
     <xsl:call-template name="DiagramTemplate"/> 
     <xsl:for-each select="plane">			
      <bpmndi:BPMNPlane>
        <xsl:call-template name="BPMNPlaneAttributesTemplate"/> 
        <xsl:call-template name="BPMNPlaneTemplate" />			   
      </bpmndi:BPMNPlane>
	 </xsl:for-each>						
     <xsl:for-each select="labelStyle">			
      <bpmndi:BPMNLabelStyle>
        <xsl:call-template name="BPMNLabelStyleAttributesTemplate"/> 
        <xsl:call-template name="BPMNLabelStyleTemplate" />			   
      </bpmndi:BPMNLabelStyle>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="BPMNEdgeAttributesTemplate">
     <xsl:call-template name="LabeledEdgeAttributesTemplate"/> 
     <xsl:if test="@bpmnElement"><xsl:attribute name="bpmnElement"> <xsl:value-of select="@bpmnElement" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@messageVisibleKind"><xsl:attribute name="messageVisibleKind"> <xsl:value-of select="@messageVisibleKind" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@sourceElement"><xsl:attribute name="sourceElement"> <xsl:value-of select="@sourceElement" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@targetElement"><xsl:attribute name="targetElement"> <xsl:value-of select="@targetElement" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="BPMNEdgeTemplate"  > 
     <xsl:call-template name="LabeledEdgeTemplate"/> 
     <xsl:for-each select="label">			
      <bpmndi:BPMNLabel>
        <xsl:call-template name="BPMNLabelAttributesTemplate"/> 
        <xsl:call-template name="BPMNLabelTemplate" />			   
      </bpmndi:BPMNLabel>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="BPMNLabelAttributesTemplate">
     <xsl:call-template name="LabelAttributesTemplate"/> 
     <xsl:if test="@labelStyle"><xsl:attribute name="labelStyle"> <xsl:value-of select="@labelStyle" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="BPMNLabelTemplate"  > 
     <xsl:call-template name="LabelTemplate"/> 
	</xsl:template>
	
    <xsl:template name="BPMNLabelStyleAttributesTemplate">
     <xsl:call-template name="StyleAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="BPMNLabelStyleTemplate"  > 
     <xsl:call-template name="StyleTemplate"/> 
     <xsl:for-each select="font">			
      <dc:Font>
        <xsl:call-template name="FontAttributesTemplate"/> 
        <xsl:call-template name="FontTemplate" />			   
      </dc:Font>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="BPMNPlaneAttributesTemplate">
     <xsl:call-template name="PlaneAttributesTemplate"/> 
     <xsl:if test="@bpmnElement"><xsl:attribute name="bpmnElement"> <xsl:value-of select="@bpmnElement" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="BPMNPlaneTemplate"  > 
     <xsl:call-template name="PlaneTemplate"/> 
	</xsl:template>
	
    <xsl:template name="BPMNShapeAttributesTemplate">
     <xsl:call-template name="LabeledShapeAttributesTemplate"/> 
     <xsl:if test="@bpmnElement"><xsl:attribute name="bpmnElement"> <xsl:value-of select="@bpmnElement" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@choreographyActivityShape"><xsl:attribute name="choreographyActivityShape"> <xsl:value-of select="@choreographyActivityShape" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isExpanded"><xsl:attribute name="isExpanded"> <xsl:value-of select="@isExpanded" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isHorizontal"><xsl:attribute name="isHorizontal"> <xsl:value-of select="@isHorizontal" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isMarkerVisible"><xsl:attribute name="isMarkerVisible"> <xsl:value-of select="@isMarkerVisible" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isMessageVisible"><xsl:attribute name="isMessageVisible"> <xsl:value-of select="@isMessageVisible" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@participantBandKind"><xsl:attribute name="participantBandKind"> <xsl:value-of select="@participantBandKind" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="BPMNShapeTemplate"  > 
     <xsl:call-template name="LabeledShapeTemplate"/> 
     <xsl:for-each select="label">			
      <bpmndi:BPMNLabel>
        <xsl:call-template name="BPMNLabelAttributesTemplate"/> 
        <xsl:call-template name="BPMNLabelTemplate" />			   
      </bpmndi:BPMNLabel>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="DiagramAttributesTemplate">
     <xsl:if test="@documentation"><xsl:attribute name="documentation"> <xsl:value-of select="@documentation" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@id"><xsl:attribute name="id"> <xsl:value-of select="@id" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@resolution"><xsl:attribute name="resolution"> <xsl:value-of select="@resolution" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="DiagramTemplate"  > 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@ownedStyle" />
       <xsl:with-param name="elementName" select="'bpmn2:ownedStyle'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/DD/20100524/DI'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@rootElement" />
       <xsl:with-param name="elementName" select="'bpmn2:rootElement'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/DD/20100524/DI'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="DiagramElementAttributesTemplate">
     <xsl:if test="@id"><xsl:attribute name="id"> <xsl:value-of select="@id" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="DiagramElementTemplate"  > 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@owningDiagram" />
       <xsl:with-param name="elementName" select="'bpmn2:owningDiagram'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/DD/20100524/DI'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@owningElement" />
       <xsl:with-param name="elementName" select="'bpmn2:owningElement'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/DD/20100524/DI'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@ownedElement" />
       <xsl:with-param name="elementName" select="'bpmn2:ownedElement'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/DD/20100524/DI'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@modelElement" />
       <xsl:with-param name="elementName" select="'bpmn2:modelElement'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/DD/20100524/DI'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@style" />
       <xsl:with-param name="elementName" select="'bpmn2:style'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/DD/20100524/DI'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="EdgeAttributesTemplate">
     <xsl:call-template name="DiagramElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="EdgeTemplate"  > 
     <xsl:call-template name="DiagramElementTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@source" />
       <xsl:with-param name="elementName" select="'bpmn2:source'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/DD/20100524/DI'" />
     </xsl:call-template>
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@target" />
       <xsl:with-param name="elementName" select="'bpmn2:target'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/DD/20100524/DI'" />
     </xsl:call-template>
     <xsl:for-each select="waypoint">			
      <di:waypoint>
        <xsl:call-template name="PointAttributesTemplate"/> 
        <xsl:call-template name="PointTemplate" />			   
      </di:waypoint>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="LabelAttributesTemplate">
     <xsl:call-template name="NodeAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="LabelTemplate"  > 
     <xsl:call-template name="NodeTemplate"/> 
     <xsl:for-each select="bounds">			
      <dc:Bounds>
        <xsl:call-template name="BoundsAttributesTemplate"/> 
        <xsl:call-template name="BoundsTemplate" />			   
      </dc:Bounds>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="LabeledEdgeAttributesTemplate">
     <xsl:call-template name="EdgeAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="LabeledEdgeTemplate"  > 
     <xsl:call-template name="EdgeTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@ownedLabel" />
       <xsl:with-param name="elementName" select="'bpmn2:ownedLabel'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/DD/20100524/DI'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="LabeledShapeAttributesTemplate">
     <xsl:call-template name="ShapeAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="LabeledShapeTemplate"  > 
     <xsl:call-template name="ShapeTemplate"/> 
     <xsl:call-template name="SplitString">
       <xsl:with-param name="list" select="@ownedLabel" />
       <xsl:with-param name="elementName" select="'bpmn2:ownedLabel'" />
       <xsl:with-param name="elementNamespace" select="'http://www.omg.org/spec/DD/20100524/DI'" />
     </xsl:call-template>
	</xsl:template>
	
    <xsl:template name="NodeAttributesTemplate">
     <xsl:call-template name="DiagramElementAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="NodeTemplate"  > 
     <xsl:call-template name="DiagramElementTemplate"/> 
	</xsl:template>
	
    <xsl:template name="PlaneAttributesTemplate">
     <xsl:call-template name="NodeAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="PlaneTemplate"  > 
     <xsl:call-template name="NodeTemplate"/> 
     <xsl:for-each select="planeElement">			
      <xsl:choose>
       <xsl:when test="substring-after(@xmi:type, ':') = 'BPMNEdge' or substring-after(@xsi:type, ':') = 'BPMNEdge'">
         <bpmndi:BPMNEdge>
           <xsl:call-template name="BPMNEdgeAttributesTemplate"/> 
           <xsl:call-template name="BPMNEdgeTemplate" />	       		   
	     </bpmndi:BPMNEdge>
	   </xsl:when>
       <xsl:when test="substring-after(@xmi:type, ':') = 'BPMNShape' or substring-after(@xsi:type, ':') = 'BPMNShape'">
         <bpmndi:BPMNShape>
           <xsl:call-template name="BPMNShapeAttributesTemplate"/> 
           <xsl:call-template name="BPMNShapeTemplate" />	       		   
	     </bpmndi:BPMNShape>
	   </xsl:when>
      </xsl:choose>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="ShapeAttributesTemplate">
     <xsl:call-template name="NodeAttributesTemplate"/> 
	</xsl:template>

    <xsl:template name="ShapeTemplate"  > 
     <xsl:call-template name="NodeTemplate"/> 
     <xsl:for-each select="bounds">			
      <dc:Bounds>
        <xsl:call-template name="BoundsAttributesTemplate"/> 
        <xsl:call-template name="BoundsTemplate" />			   
      </dc:Bounds>
	 </xsl:for-each>						
	</xsl:template>
	
    <xsl:template name="StyleAttributesTemplate">
     <xsl:if test="@id"><xsl:attribute name="id"> <xsl:value-of select="@id" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="StyleTemplate"  > 
	</xsl:template>
	
    <xsl:template name="BoundsAttributesTemplate">
     <xsl:if test="@height"><xsl:attribute name="height"> <xsl:value-of select="@height" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@width"><xsl:attribute name="width"> <xsl:value-of select="@width" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@x"><xsl:attribute name="x"> <xsl:value-of select="@x" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@y"><xsl:attribute name="y"> <xsl:value-of select="@y" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="BoundsTemplate"  > 
	</xsl:template>
	
    <xsl:template name="FontAttributesTemplate">
     <xsl:if test="@isBold"><xsl:attribute name="isBold"> <xsl:value-of select="@isBold" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isItalic"><xsl:attribute name="isItalic"> <xsl:value-of select="@isItalic" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isStrikeThrough"><xsl:attribute name="isStrikeThrough"> <xsl:value-of select="@isStrikeThrough" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@isUnderline"><xsl:attribute name="isUnderline"> <xsl:value-of select="@isUnderline" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@size"><xsl:attribute name="size"> <xsl:value-of select="@size" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="FontTemplate"  > 
	</xsl:template>
	
    <xsl:template name="PointAttributesTemplate">
     <xsl:if test="@x"><xsl:attribute name="x"> <xsl:value-of select="@x" /> </xsl:attribute></xsl:if>			
     <xsl:if test="@y"><xsl:attribute name="y"> <xsl:value-of select="@y" /> </xsl:attribute></xsl:if>			
	</xsl:template>

    <xsl:template name="PointTemplate"  > 
	</xsl:template>
	

</xsl:stylesheet>
