<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:xmi="http://schema.omg.org/spec/XMI"
	xmlns:bpmn2="http://www.omg.org/spec/BPMN/20100524/MODEL"
	xmlns:bpmndi="http://www.omg.org/spec/BPMN/20100524/DI"
	xmlns:di="http://www.omg.org/spec/DD/20100524/DI"
	xmlns:dc="http://www.omg.org/spec/DD/20100524/DC" 
	xmlns:bpmn2xmi="http://www.omg.org/spec/BPMN/20100524/MODEL-XMI"
	xmlns:bpmndixmi="http://www.omg.org/spec/BPMN/20100524/DI-XMI"
	xmlns:dixmi="http://www.omg.org/spec/DD/20100524/DI-XMI"
	xmlns:dcxmi="http://www.omg.org/spec/DD/20100524/DC-XMI"> 
    <xsl:output method="xml" indent="yes"/>

	<xsl:template name="concat">
		<xsl:param name="nodeset" />
		<xsl:variable name="buffer">
		  <xsl:for-each select="$nodeset">
		   <xsl:value-of select="concat(., ' ')"/>
		  </xsl:for-each>
		</xsl:variable>
		<xsl:value-of select="normalize-space($buffer)"/>
	</xsl:template>
			
	<xsl:template match="/">
		<xmi:XMI xmi:version="2.0">
			<xsl:for-each select="bpmn2:definitions">
			  <bpmn2xmi:Definitions>			
				<xsl:call-template name="DefinitionsAttributesTemplate" />
				<xsl:call-template name="DefinitionsTemplate" />
			  </bpmn2xmi:Definitions>				
			</xsl:for-each>
		</xmi:XMI>
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
	  <xsl:if test="@isForCompensation"><xsl:attribute name="isForCompensation"> <xsl:value-of select="@isForCompensation" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@startQuantity"><xsl:attribute name="startQuantity"> <xsl:value-of select="@startQuantity" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:boundaryEventRefs"><xsl:attribute name="boundaryEventRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:boundaryEventRefs"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@default"><xsl:attribute name="default"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@default"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ActivityTemplate">
	  <xsl:call-template name="FlowNodeTemplate"/> 
      <xsl:for-each select="bpmn2:ioSpecification">
        <ioSpecification xmi:type="bpmn2xmi:InputOutputSpecification">			    
	       <xsl:call-template name="InputOutputSpecificationAttributesTemplate"/> 
           <xsl:call-template name="InputOutputSpecificationTemplate" />			   
        </ioSpecification>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:property">
        <properties xmi:type="bpmn2xmi:Property">			    
	       <xsl:call-template name="PropertyAttributesTemplate"/> 
           <xsl:call-template name="PropertyTemplate" />			   
        </properties>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:dataInputAssociation">
        <dataInputAssociations xmi:type="bpmn2xmi:DataInputAssociation">			    
	       <xsl:call-template name="DataInputAssociationAttributesTemplate"/> 
           <xsl:call-template name="DataInputAssociationTemplate" />			   
        </dataInputAssociations>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:dataOutputAssociation">
        <dataOutputAssociations xmi:type="bpmn2xmi:DataOutputAssociation">			    
	       <xsl:call-template name="DataOutputAssociationAttributesTemplate"/> 
           <xsl:call-template name="DataOutputAssociationTemplate" />			   
        </dataOutputAssociations>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:performer|bpmn2:humanPerformer|bpmn2:potentialOwner">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:performer">
            <resources xmi:type="bpmn2xmi:Performer">			    
	          <xsl:call-template name="PerformerAttributesTemplate"/> 
			  <xsl:call-template name="PerformerTemplate" />			   
			</resources>
          </xsl:when > 
          <xsl:when test="self::bpmn2:humanPerformer">
            <resources xmi:type="bpmn2xmi:HumanPerformer">			    
	          <xsl:call-template name="HumanPerformerAttributesTemplate"/> 
			  <xsl:call-template name="HumanPerformerTemplate" />			   
			</resources>
          </xsl:when > 
          <xsl:when test="self::bpmn2:potentialOwner">
            <resources xmi:type="bpmn2xmi:PotentialOwner">			    
	          <xsl:call-template name="PotentialOwnerAttributesTemplate"/> 
			  <xsl:call-template name="PotentialOwnerTemplate" />			   
			</resources>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:multiInstanceLoopCharacteristics|bpmn2:standardLoopCharacteristics">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:multiInstanceLoopCharacteristics">
            <loopCharacteristics xmi:type="bpmn2xmi:MultiInstanceLoopCharacteristics">			    
	          <xsl:call-template name="MultiInstanceLoopCharacteristicsAttributesTemplate"/> 
			  <xsl:call-template name="MultiInstanceLoopCharacteristicsTemplate" />			   
			</loopCharacteristics>
          </xsl:when > 
          <xsl:when test="self::bpmn2:standardLoopCharacteristics">
            <loopCharacteristics xmi:type="bpmn2xmi:StandardLoopCharacteristics">			    
	          <xsl:call-template name="StandardLoopCharacteristicsAttributesTemplate"/> 
			  <xsl:call-template name="StandardLoopCharacteristicsTemplate" />			   
			</loopCharacteristics>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="AdHocSubProcessAttributesTemplate">
	  <xsl:call-template name="SubProcessAttributesTemplate"/> 	
	  <xsl:if test="@cancelRemainingInstances"><xsl:attribute name="cancelRemainingInstances"> <xsl:value-of select="@cancelRemainingInstances" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@ordering"><xsl:attribute name="ordering"> <xsl:value-of select="@ordering" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="AdHocSubProcessTemplate">
	  <xsl:call-template name="SubProcessTemplate"/> 
      <xsl:for-each select="bpmn2:completionCondition">
        <completionCondition xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </completionCondition>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ArtifactAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="ArtifactTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="AssignmentAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="AssignmentTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:from">
        <from xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </from>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:to">
        <to xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </to>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="AssociationAttributesTemplate">
	  <xsl:call-template name="ArtifactAttributesTemplate"/> 	
	  <xsl:if test="@associationDirection"><xsl:attribute name="associationDirection"> <xsl:value-of select="@associationDirection" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@sourceRef"><xsl:attribute name="sourceRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@sourceRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@targetRef"><xsl:attribute name="targetRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@targetRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="AssociationTemplate">
	  <xsl:call-template name="ArtifactTemplate"/> 
	</xsl:template>
  
	<xsl:template name="AuditingAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="AuditingTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="BaseElementAttributesTemplate">
	  <xsl:if test="@id"><xsl:attribute name="id"> <xsl:value-of select="@id" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:extensionElements"><xsl:attribute name="extensionDefinitions"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:extensionElements"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="BaseElementTemplate">
      <xsl:for-each select="bpmn2:extensionValues">
        <extensionValues xmi:type="bpmn2xmi:ExtensionAttributeValue">			    
	       <xsl:call-template name="ExtensionAttributeValueAttributesTemplate"/> 
           <xsl:call-template name="ExtensionAttributeValueTemplate" />			   
        </extensionValues>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:documentation">
        <documentation xmi:type="bpmn2xmi:Documentation">			    
	       <xsl:call-template name="DocumentationAttributesTemplate"/> 
           <xsl:call-template name="DocumentationTemplate" />			   
        </documentation>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="BoundaryEventAttributesTemplate">
	  <xsl:call-template name="CatchEventAttributesTemplate"/> 	
	  <xsl:if test="@cancelActivity"><xsl:attribute name="cancelActivity"> <xsl:value-of select="@cancelActivity" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@attachedToRef"><xsl:attribute name="attachedToRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@attachedToRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="BoundaryEventTemplate">
	  <xsl:call-template name="CatchEventTemplate"/> 
	</xsl:template>
  
	<xsl:template name="BusinessRuleTaskAttributesTemplate">
	  <xsl:call-template name="TaskAttributesTemplate"/> 	
	  <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="BusinessRuleTaskTemplate">
	  <xsl:call-template name="TaskTemplate"/> 
	</xsl:template>
  
	<xsl:template name="CallActivityAttributesTemplate">
	  <xsl:call-template name="ActivityAttributesTemplate"/> 	
      <xsl:if test="@calledElement"><xsl:attribute name="calledElementRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@calledElement"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CallActivityTemplate">
	  <xsl:call-template name="ActivityTemplate"/> 
	</xsl:template>
  
	<xsl:template name="CallChoreographyAttributesTemplate">
	  <xsl:call-template name="ChoreographyActivityAttributesTemplate"/> 	
      <xsl:if test="@calledChoreographyRef"><xsl:attribute name="calledChoreographyRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@calledChoreographyRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CallChoreographyTemplate">
	  <xsl:call-template name="ChoreographyActivityTemplate"/> 
      <xsl:for-each select="bpmn2:participantAssociation">
        <participantAssociations xmi:type="bpmn2xmi:ParticipantAssociation">			    
	       <xsl:call-template name="ParticipantAssociationAttributesTemplate"/> 
           <xsl:call-template name="ParticipantAssociationTemplate" />			   
        </participantAssociations>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="CallConversationAttributesTemplate">
	  <xsl:call-template name="ConversationNodeAttributesTemplate"/> 	
      <xsl:if test="@calledCollaborationRef"><xsl:attribute name="calledCollaborationRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@calledCollaborationRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CallConversationTemplate">
	  <xsl:call-template name="ConversationNodeTemplate"/> 
      <xsl:for-each select="bpmn2:participantAssociation">
        <participantAssociations xmi:type="bpmn2xmi:ParticipantAssociation">			    
	       <xsl:call-template name="ParticipantAssociationAttributesTemplate"/> 
           <xsl:call-template name="ParticipantAssociationTemplate" />			   
        </participantAssociations>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="CallableElementAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:supportedInterfaceRef"><xsl:attribute name="supportedInterfaceRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:supportedInterfaceRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CallableElementTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
      <xsl:for-each select="bpmn2:ioSpecification">
        <ioSpecification xmi:type="bpmn2xmi:InputOutputSpecification">			    
	       <xsl:call-template name="InputOutputSpecificationAttributesTemplate"/> 
           <xsl:call-template name="InputOutputSpecificationTemplate" />			   
        </ioSpecification>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:ioBinding">
        <ioBinding xmi:type="bpmn2xmi:InputOutputBinding">			    
	       <xsl:call-template name="InputOutputBindingAttributesTemplate"/> 
           <xsl:call-template name="InputOutputBindingTemplate" />			   
        </ioBinding>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="CancelEventDefinitionAttributesTemplate">
	  <xsl:call-template name="EventDefinitionAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="CancelEventDefinitionTemplate">
	  <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
  
	<xsl:template name="CatchEventAttributesTemplate">
	  <xsl:call-template name="EventAttributesTemplate"/> 	
	  <xsl:if test="@parallelMultiple"><xsl:attribute name="parallelMultiple"> <xsl:value-of select="@parallelMultiple" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:eventDefinitionRef"><xsl:attribute name="eventDefinitionRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:eventDefinitionRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CatchEventTemplate">
	  <xsl:call-template name="EventTemplate"/> 
      <xsl:for-each select="bpmn2:dataOutput">
        <dataOutputs xmi:type="bpmn2xmi:DataOutput">			    
	       <xsl:call-template name="DataOutputAttributesTemplate"/> 
           <xsl:call-template name="DataOutputTemplate" />			   
        </dataOutputs>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:dataOutputAssociation">
        <dataOutputAssociation xmi:type="bpmn2xmi:DataOutputAssociation">			    
	       <xsl:call-template name="DataOutputAssociationAttributesTemplate"/> 
           <xsl:call-template name="DataOutputAssociationTemplate" />			   
        </dataOutputAssociation>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:outputSet">
        <outputSet xmi:type="bpmn2xmi:OutputSet">			    
	       <xsl:call-template name="OutputSetAttributesTemplate"/> 
           <xsl:call-template name="OutputSetTemplate" />			   
        </outputSet>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:cancelEventDefinition|bpmn2:compensateEventDefinition|bpmn2:conditionalEventDefinition|bpmn2:errorEventDefinition|bpmn2:escalationEventDefinition|bpmn2:linkEventDefinition|bpmn2:messageEventDefinition|bpmn2:signalEventDefinition|bpmn2:terminateEventDefinition|bpmn2:timerEventDefinition">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:cancelEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:CancelEventDefinition">			    
	          <xsl:call-template name="CancelEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="CancelEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:compensateEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:CompensateEventDefinition">			    
	          <xsl:call-template name="CompensateEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="CompensateEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:conditionalEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:ConditionalEventDefinition">			    
	          <xsl:call-template name="ConditionalEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="ConditionalEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:errorEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:ErrorEventDefinition">			    
	          <xsl:call-template name="ErrorEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="ErrorEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:escalationEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:EscalationEventDefinition">			    
	          <xsl:call-template name="EscalationEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="EscalationEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:linkEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:LinkEventDefinition">			    
	          <xsl:call-template name="LinkEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="LinkEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:messageEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:MessageEventDefinition">			    
	          <xsl:call-template name="MessageEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="MessageEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:signalEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:SignalEventDefinition">			    
	          <xsl:call-template name="SignalEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="SignalEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:terminateEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:TerminateEventDefinition">			    
	          <xsl:call-template name="TerminateEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="TerminateEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:timerEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:TimerEventDefinition">			    
	          <xsl:call-template name="TimerEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="TimerEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="CategoryAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CategoryTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
      <xsl:for-each select="bpmn2:categoryValue">
        <categoryValue xmi:type="bpmn2xmi:CategoryValue">			    
	       <xsl:call-template name="CategoryValueAttributesTemplate"/> 
           <xsl:call-template name="CategoryValueTemplate" />			   
        </categoryValue>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="CategoryValueAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@value"><xsl:attribute name="value"> <xsl:value-of select="@value" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:categorizedFlowElements"><xsl:attribute name="categorizedFlowElements"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:categorizedFlowElements"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CategoryValueTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ChoreographyAttributesTemplate">
	  <xsl:call-template name="CollaborationAttributesTemplate"/> 	
	  <xsl:call-template name="FlowElementsContainerAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="ChoreographyTemplate">
	  <xsl:call-template name="CollaborationTemplate"/> 
	  <xsl:call-template name="FlowElementsContainerTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ChoreographyActivityAttributesTemplate">
	  <xsl:call-template name="FlowNodeAttributesTemplate"/> 	
	  <xsl:if test="@loopType"><xsl:attribute name="loopType"> <xsl:value-of select="@loopType" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:participantRef"><xsl:attribute name="participantRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:participantRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@initiatingParticipantRef"><xsl:attribute name="initiatingParticipantRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@initiatingParticipantRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ChoreographyActivityTemplate">
	  <xsl:call-template name="FlowNodeTemplate"/> 
      <xsl:for-each select="bpmn2:correlationKey">
        <correlationKeys xmi:type="bpmn2xmi:CorrelationKey">			    
	       <xsl:call-template name="CorrelationKeyAttributesTemplate"/> 
           <xsl:call-template name="CorrelationKeyTemplate" />			   
        </correlationKeys>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ChoreographyTaskAttributesTemplate">
	  <xsl:call-template name="ChoreographyActivityAttributesTemplate"/> 	
      <xsl:if test="bpmn2:messageFlowRef"><xsl:attribute name="messageFlowRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:messageFlowRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ChoreographyTaskTemplate">
	  <xsl:call-template name="ChoreographyActivityTemplate"/> 
	</xsl:template>
  
	<xsl:template name="CollaborationAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@isClosed"><xsl:attribute name="isClosed"> <xsl:value-of select="@isClosed" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:choreographyRef"><xsl:attribute name="choreographyRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:choreographyRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CollaborationTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
      <xsl:for-each select="bpmn2:participant">
        <participants xmi:type="bpmn2xmi:Participant">			    
	       <xsl:call-template name="ParticipantAttributesTemplate"/> 
           <xsl:call-template name="ParticipantTemplate" />			   
        </participants>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:messageFlow">
        <messageFlows xmi:type="bpmn2xmi:MessageFlow">			    
	       <xsl:call-template name="MessageFlowAttributesTemplate"/> 
           <xsl:call-template name="MessageFlowTemplate" />			   
        </messageFlows>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:association|bpmn2:group|bpmn2:textAnnotation">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:association">
            <artifacts xmi:type="bpmn2xmi:Association">			    
	          <xsl:call-template name="AssociationAttributesTemplate"/> 
			  <xsl:call-template name="AssociationTemplate" />			   
			</artifacts>
          </xsl:when > 
          <xsl:when test="self::bpmn2:group">
            <artifacts xmi:type="bpmn2xmi:Group">			    
	          <xsl:call-template name="GroupAttributesTemplate"/> 
			  <xsl:call-template name="GroupTemplate" />			   
			</artifacts>
          </xsl:when > 
          <xsl:when test="self::bpmn2:textAnnotation">
            <artifacts xmi:type="bpmn2xmi:TextAnnotation">			    
	          <xsl:call-template name="TextAnnotationAttributesTemplate"/> 
			  <xsl:call-template name="TextAnnotationTemplate" />			   
			</artifacts>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:callConversation|bpmn2:conversation|bpmn2:subConversation">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:callConversation">
            <conversations xmi:type="bpmn2xmi:CallConversation">			    
	          <xsl:call-template name="CallConversationAttributesTemplate"/> 
			  <xsl:call-template name="CallConversationTemplate" />			   
			</conversations>
          </xsl:when > 
          <xsl:when test="self::bpmn2:conversation">
            <conversations xmi:type="bpmn2xmi:Conversation">			    
	          <xsl:call-template name="ConversationAttributesTemplate"/> 
			  <xsl:call-template name="ConversationTemplate" />			   
			</conversations>
          </xsl:when > 
          <xsl:when test="self::bpmn2:subConversation">
            <conversations xmi:type="bpmn2xmi:SubConversation">			    
	          <xsl:call-template name="SubConversationAttributesTemplate"/> 
			  <xsl:call-template name="SubConversationTemplate" />			   
			</conversations>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:conversationAssociation">
        <conversationAssociations xmi:type="bpmn2xmi:ConversationAssociation">			    
	       <xsl:call-template name="ConversationAssociationAttributesTemplate"/> 
           <xsl:call-template name="ConversationAssociationTemplate" />			   
        </conversationAssociations>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:participantAssociation">
        <participantAssociations xmi:type="bpmn2xmi:ParticipantAssociation">			    
	       <xsl:call-template name="ParticipantAssociationAttributesTemplate"/> 
           <xsl:call-template name="ParticipantAssociationTemplate" />			   
        </participantAssociations>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:messageFlowAssociation">
        <messageFlowAssociations xmi:type="bpmn2xmi:MessageFlowAssociation">			    
	       <xsl:call-template name="MessageFlowAssociationAttributesTemplate"/> 
           <xsl:call-template name="MessageFlowAssociationTemplate" />			   
        </messageFlowAssociations>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:correlationKey">
        <correlationKeys xmi:type="bpmn2xmi:CorrelationKey">			    
	       <xsl:call-template name="CorrelationKeyAttributesTemplate"/> 
           <xsl:call-template name="CorrelationKeyTemplate" />			   
        </correlationKeys>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:conversationLink">
        <conversationLinks xmi:type="bpmn2xmi:ConversationLink">			    
	       <xsl:call-template name="ConversationLinkAttributesTemplate"/> 
           <xsl:call-template name="ConversationLinkTemplate" />			   
        </conversationLinks>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="CompensateEventDefinitionAttributesTemplate">
	  <xsl:call-template name="EventDefinitionAttributesTemplate"/> 	
	  <xsl:if test="@waitForCompletion"><xsl:attribute name="waitForCompletion"> <xsl:value-of select="@waitForCompletion" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@activityRef"><xsl:attribute name="activityRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@activityRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CompensateEventDefinitionTemplate">
	  <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ComplexBehaviorDefinitionAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="ComplexBehaviorDefinitionTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:condition">
        <condition xmi:type="bpmn2xmi:FormalExpression">			    
	       <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
           <xsl:call-template name="FormalExpressionTemplate" />			   
        </condition>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:event">
        <event xmi:type="bpmn2xmi:ImplicitThrowEvent">			    
	       <xsl:call-template name="ImplicitThrowEventAttributesTemplate"/> 
           <xsl:call-template name="ImplicitThrowEventTemplate" />			   
        </event>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ComplexGatewayAttributesTemplate">
	  <xsl:call-template name="GatewayAttributesTemplate"/> 	
      <xsl:if test="@default"><xsl:attribute name="default"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@default"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ComplexGatewayTemplate">
	  <xsl:call-template name="GatewayTemplate"/> 
      <xsl:for-each select="bpmn2:activationCondition">
        <activationCondition xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </activationCondition>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ConditionalEventDefinitionAttributesTemplate">
	  <xsl:call-template name="EventDefinitionAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="ConditionalEventDefinitionTemplate">
	  <xsl:call-template name="EventDefinitionTemplate"/> 
      <xsl:for-each select="bpmn2:condition">
        <condition xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </condition>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ConversationAttributesTemplate">
	  <xsl:call-template name="ConversationNodeAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="ConversationTemplate">
	  <xsl:call-template name="ConversationNodeTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ConversationAssociationAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
      <xsl:if test="@innerConversationNodeRef"><xsl:attribute name="innerConversationNodeRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@innerConversationNodeRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@outerConversationNodeRef"><xsl:attribute name="outerConversationNodeRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@outerConversationNodeRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ConversationAssociationTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ConversationLinkAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@sourceRef"><xsl:attribute name="sourceRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@sourceRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@targetRef"><xsl:attribute name="targetRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@targetRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ConversationLinkTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ConversationNodeAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:call-template name="InteractionNodeAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:participantRef"><xsl:attribute name="participantRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:participantRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:messageFlowRef"><xsl:attribute name="messageFlowRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:messageFlowRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ConversationNodeTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	  <xsl:call-template name="InteractionNodeTemplate"/> 
      <xsl:for-each select="bpmn2:correlationKey">
        <correlationKeys xmi:type="bpmn2xmi:CorrelationKey">			    
	       <xsl:call-template name="CorrelationKeyAttributesTemplate"/> 
           <xsl:call-template name="CorrelationKeyTemplate" />			   
        </correlationKeys>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="CorrelationKeyAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:correlationPropertyRef"><xsl:attribute name="correlationPropertyRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:correlationPropertyRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CorrelationKeyTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="CorrelationPropertyAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@type"><xsl:attribute name="type"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@type"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CorrelationPropertyTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
      <xsl:for-each select="bpmn2:correlationPropertyRetrievalExpression">
        <correlationPropertyRetrievalExpression xmi:type="bpmn2xmi:CorrelationPropertyRetrievalExpression">			    
	       <xsl:call-template name="CorrelationPropertyRetrievalExpressionAttributesTemplate"/> 
           <xsl:call-template name="CorrelationPropertyRetrievalExpressionTemplate" />			   
        </correlationPropertyRetrievalExpression>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="CorrelationPropertyBindingAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
      <xsl:if test="@correlationPropertyRef"><xsl:attribute name="correlationPropertyRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@correlationPropertyRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CorrelationPropertyBindingTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:dataPath">
        <dataPath xmi:type="bpmn2xmi:FormalExpression">			    
	       <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
           <xsl:call-template name="FormalExpressionTemplate" />			   
        </dataPath>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="CorrelationPropertyRetrievalExpressionAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
      <xsl:if test="@messageRef"><xsl:attribute name="messageRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@messageRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CorrelationPropertyRetrievalExpressionTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:messagePath">
        <messagePath xmi:type="bpmn2xmi:FormalExpression">			    
	       <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
           <xsl:call-template name="FormalExpressionTemplate" />			   
        </messagePath>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="CorrelationSubscriptionAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
      <xsl:if test="@correlationKeyRef"><xsl:attribute name="correlationKeyRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@correlationKeyRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="CorrelationSubscriptionTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:correlationPropertyBinding">
        <correlationPropertyBinding xmi:type="bpmn2xmi:CorrelationPropertyBinding">			    
	       <xsl:call-template name="CorrelationPropertyBindingAttributesTemplate"/> 
           <xsl:call-template name="CorrelationPropertyBindingTemplate" />			   
        </correlationPropertyBinding>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="DataAssociationAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
      <xsl:if test="bpmn2:sourceRef"><xsl:attribute name="sourceRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:sourceRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:targetRef"><xsl:attribute name="targetRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:targetRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="DataAssociationTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:transformation">
        <transformation xmi:type="bpmn2xmi:FormalExpression">			    
	       <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
           <xsl:call-template name="FormalExpressionTemplate" />			   
        </transformation>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:assignment">
        <assignment xmi:type="bpmn2xmi:Assignment">			    
	       <xsl:call-template name="AssignmentAttributesTemplate"/> 
           <xsl:call-template name="AssignmentTemplate" />			   
        </assignment>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="DataInputAttributesTemplate">
	  <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 	
	  <xsl:if test="@isCollection"><xsl:attribute name="isCollection"> <xsl:value-of select="@isCollection" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:inputSetWithOptional"><xsl:attribute name="inputSetWithOptional"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:inputSetWithOptional"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:inputSetWithWhileExecuting"><xsl:attribute name="inputSetWithWhileExecuting"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:inputSetWithWhileExecuting"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:inputSetRefs"><xsl:attribute name="inputSetRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:inputSetRefs"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="DataInputTemplate">
	  <xsl:call-template name="ItemAwareElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="DataInputAssociationAttributesTemplate">
	  <xsl:call-template name="DataAssociationAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="DataInputAssociationTemplate">
	  <xsl:call-template name="DataAssociationTemplate"/> 
	</xsl:template>
  
	<xsl:template name="DataObjectAttributesTemplate">
	  <xsl:call-template name="FlowElementAttributesTemplate"/> 	
	  <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 	
	  <xsl:if test="@isCollection"><xsl:attribute name="isCollection"> <xsl:value-of select="@isCollection" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="DataObjectTemplate">
	  <xsl:call-template name="FlowElementTemplate"/> 
	  <xsl:call-template name="ItemAwareElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="DataObjectReferenceAttributesTemplate">
	  <xsl:call-template name="FlowElementAttributesTemplate"/> 	
	  <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 	
      <xsl:if test="@dataObjectRef"><xsl:attribute name="dataObjectRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@dataObjectRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="DataObjectReferenceTemplate">
	  <xsl:call-template name="FlowElementTemplate"/> 
	  <xsl:call-template name="ItemAwareElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="DataOutputAttributesTemplate">
	  <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 	
	  <xsl:if test="@isCollection"><xsl:attribute name="isCollection"> <xsl:value-of select="@isCollection" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:outputSetWithOptional"><xsl:attribute name="outputSetWithOptional"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:outputSetWithOptional"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:outputSetWithWhileExecuting"><xsl:attribute name="outputSetWithWhileExecuting"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:outputSetWithWhileExecuting"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:outputSetRefs"><xsl:attribute name="outputSetRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:outputSetRefs"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="DataOutputTemplate">
	  <xsl:call-template name="ItemAwareElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="DataOutputAssociationAttributesTemplate">
	  <xsl:call-template name="DataAssociationAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="DataOutputAssociationTemplate">
	  <xsl:call-template name="DataAssociationTemplate"/> 
	</xsl:template>
  
	<xsl:template name="DataStateAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="DataStateTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="DataStoreAttributesTemplate">
	  <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 	
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@capacity"><xsl:attribute name="capacity"> <xsl:value-of select="@capacity" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@isUnlimited"><xsl:attribute name="isUnlimited"> <xsl:value-of select="@isUnlimited" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="DataStoreTemplate">
	  <xsl:call-template name="ItemAwareElementTemplate"/> 
	  <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="DataStoreReferenceAttributesTemplate">
	  <xsl:call-template name="FlowElementAttributesTemplate"/> 	
	  <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 	
      <xsl:if test="@dataStoreRef"><xsl:attribute name="dataStoreRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@dataStoreRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="DataStoreReferenceTemplate">
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

	<xsl:template name="DefinitionsTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:import">
        <imports xmi:type="bpmn2xmi:Import">			    
	       <xsl:call-template name="ImportAttributesTemplate"/> 
           <xsl:call-template name="ImportTemplate" />			   
        </imports>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:extension">
        <extensions xmi:type="bpmn2xmi:Extension">			    
	       <xsl:call-template name="ExtensionAttributesTemplate"/> 
           <xsl:call-template name="ExtensionTemplate" />			   
        </extensions>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:eventDefinition|bpmn2:category|bpmn2:collaboration|bpmn2:correlationProperty|bpmn2:dataStore|bpmn2:endPoint|bpmn2:error|bpmn2:escalation|bpmn2:globalBusinessRuleTask|bpmn2:globalManualTask|bpmn2:globalScriptTask|bpmn2:globalTask|bpmn2:globalUserTask|bpmn2:interface|bpmn2:itemDefinition|bpmn2:message|bpmn2:partnerEntity|bpmn2:partnerRole|bpmn2:process|bpmn2:resource|bpmn2:signal|bpmn2:cancelEventDefinition|bpmn2:compensateEventDefinition|bpmn2:conditionalEventDefinition|bpmn2:errorEventDefinition|bpmn2:escalationEventDefinition|bpmn2:linkEventDefinition|bpmn2:messageEventDefinition|bpmn2:signalEventDefinition|bpmn2:terminateEventDefinition|bpmn2:timerEventDefinition|bpmn2:choreography|bpmn2:globalConversation|bpmn2:globalChoreographyTask">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:eventDefinition">
            <rootElements xmi:type="bpmn2xmi:EventDefinition">			    
	          <xsl:call-template name="EventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="EventDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:category">
            <rootElements xmi:type="bpmn2xmi:Category">			    
	          <xsl:call-template name="CategoryAttributesTemplate"/> 
			  <xsl:call-template name="CategoryTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:collaboration">
            <rootElements xmi:type="bpmn2xmi:Collaboration">			    
	          <xsl:call-template name="CollaborationAttributesTemplate"/> 
			  <xsl:call-template name="CollaborationTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:correlationProperty">
            <rootElements xmi:type="bpmn2xmi:CorrelationProperty">			    
	          <xsl:call-template name="CorrelationPropertyAttributesTemplate"/> 
			  <xsl:call-template name="CorrelationPropertyTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:dataStore">
            <rootElements xmi:type="bpmn2xmi:DataStore">			    
	          <xsl:call-template name="DataStoreAttributesTemplate"/> 
			  <xsl:call-template name="DataStoreTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:endPoint">
            <rootElements xmi:type="bpmn2xmi:EndPoint">			    
	          <xsl:call-template name="EndPointAttributesTemplate"/> 
			  <xsl:call-template name="EndPointTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:error">
            <rootElements xmi:type="bpmn2xmi:Error">			    
	          <xsl:call-template name="ErrorAttributesTemplate"/> 
			  <xsl:call-template name="ErrorTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:escalation">
            <rootElements xmi:type="bpmn2xmi:Escalation">			    
	          <xsl:call-template name="EscalationAttributesTemplate"/> 
			  <xsl:call-template name="EscalationTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:globalBusinessRuleTask">
            <rootElements xmi:type="bpmn2xmi:GlobalBusinessRuleTask">			    
	          <xsl:call-template name="GlobalBusinessRuleTaskAttributesTemplate"/> 
			  <xsl:call-template name="GlobalBusinessRuleTaskTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:globalManualTask">
            <rootElements xmi:type="bpmn2xmi:GlobalManualTask">			    
	          <xsl:call-template name="GlobalManualTaskAttributesTemplate"/> 
			  <xsl:call-template name="GlobalManualTaskTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:globalScriptTask">
            <rootElements xmi:type="bpmn2xmi:GlobalScriptTask">			    
	          <xsl:call-template name="GlobalScriptTaskAttributesTemplate"/> 
			  <xsl:call-template name="GlobalScriptTaskTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:globalTask">
            <rootElements xmi:type="bpmn2xmi:GlobalTask">			    
	          <xsl:call-template name="GlobalTaskAttributesTemplate"/> 
			  <xsl:call-template name="GlobalTaskTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:globalUserTask">
            <rootElements xmi:type="bpmn2xmi:GlobalUserTask">			    
	          <xsl:call-template name="GlobalUserTaskAttributesTemplate"/> 
			  <xsl:call-template name="GlobalUserTaskTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:interface">
            <rootElements xmi:type="bpmn2xmi:Interface">			    
	          <xsl:call-template name="InterfaceAttributesTemplate"/> 
			  <xsl:call-template name="InterfaceTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:itemDefinition">
            <rootElements xmi:type="bpmn2xmi:ItemDefinition">			    
	          <xsl:call-template name="ItemDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="ItemDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:message">
            <rootElements xmi:type="bpmn2xmi:Message">			    
	          <xsl:call-template name="MessageAttributesTemplate"/> 
			  <xsl:call-template name="MessageTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:partnerEntity">
            <rootElements xmi:type="bpmn2xmi:PartnerEntity">			    
	          <xsl:call-template name="PartnerEntityAttributesTemplate"/> 
			  <xsl:call-template name="PartnerEntityTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:partnerRole">
            <rootElements xmi:type="bpmn2xmi:PartnerRole">			    
	          <xsl:call-template name="PartnerRoleAttributesTemplate"/> 
			  <xsl:call-template name="PartnerRoleTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:process">
            <rootElements xmi:type="bpmn2xmi:Process">			    
	          <xsl:call-template name="ProcessAttributesTemplate"/> 
			  <xsl:call-template name="ProcessTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:resource">
            <rootElements xmi:type="bpmn2xmi:Resource">			    
	          <xsl:call-template name="ResourceAttributesTemplate"/> 
			  <xsl:call-template name="ResourceTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:signal">
            <rootElements xmi:type="bpmn2xmi:Signal">			    
	          <xsl:call-template name="SignalAttributesTemplate"/> 
			  <xsl:call-template name="SignalTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:cancelEventDefinition">
            <rootElements xmi:type="bpmn2xmi:CancelEventDefinition">			    
	          <xsl:call-template name="CancelEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="CancelEventDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:compensateEventDefinition">
            <rootElements xmi:type="bpmn2xmi:CompensateEventDefinition">			    
	          <xsl:call-template name="CompensateEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="CompensateEventDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:conditionalEventDefinition">
            <rootElements xmi:type="bpmn2xmi:ConditionalEventDefinition">			    
	          <xsl:call-template name="ConditionalEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="ConditionalEventDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:errorEventDefinition">
            <rootElements xmi:type="bpmn2xmi:ErrorEventDefinition">			    
	          <xsl:call-template name="ErrorEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="ErrorEventDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:escalationEventDefinition">
            <rootElements xmi:type="bpmn2xmi:EscalationEventDefinition">			    
	          <xsl:call-template name="EscalationEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="EscalationEventDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:linkEventDefinition">
            <rootElements xmi:type="bpmn2xmi:LinkEventDefinition">			    
	          <xsl:call-template name="LinkEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="LinkEventDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:messageEventDefinition">
            <rootElements xmi:type="bpmn2xmi:MessageEventDefinition">			    
	          <xsl:call-template name="MessageEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="MessageEventDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:signalEventDefinition">
            <rootElements xmi:type="bpmn2xmi:SignalEventDefinition">			    
	          <xsl:call-template name="SignalEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="SignalEventDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:terminateEventDefinition">
            <rootElements xmi:type="bpmn2xmi:TerminateEventDefinition">			    
	          <xsl:call-template name="TerminateEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="TerminateEventDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:timerEventDefinition">
            <rootElements xmi:type="bpmn2xmi:TimerEventDefinition">			    
	          <xsl:call-template name="TimerEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="TimerEventDefinitionTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:choreography">
            <rootElements xmi:type="bpmn2xmi:Choreography">			    
	          <xsl:call-template name="ChoreographyAttributesTemplate"/> 
			  <xsl:call-template name="ChoreographyTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:globalConversation">
            <rootElements xmi:type="bpmn2xmi:GlobalConversation">			    
	          <xsl:call-template name="GlobalConversationAttributesTemplate"/> 
			  <xsl:call-template name="GlobalConversationTemplate" />			   
			</rootElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:globalChoreographyTask">
            <rootElements xmi:type="bpmn2xmi:GlobalChoreographyTask">			    
	          <xsl:call-template name="GlobalChoreographyTaskAttributesTemplate"/> 
			  <xsl:call-template name="GlobalChoreographyTaskTemplate" />			   
			</rootElements>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
      <xsl:for-each select="bpmndi:BPMNDiagram">
        <diagrams xmi:type="bpmndixmi:BPMNDiagram">			    
	       <xsl:call-template name="BPMNDiagramAttributesTemplate"/> 
           <xsl:call-template name="BPMNDiagramTemplate" />			   
        </diagrams>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:relationship">
        <relationships xmi:type="bpmn2xmi:Relationship">			    
	       <xsl:call-template name="RelationshipAttributesTemplate"/> 
           <xsl:call-template name="RelationshipTemplate" />			   
        </relationships>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="DocumentationAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="bpmn2:text"><xsl:attribute name="text"> <xsl:value-of select="bpmn2:text" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@textFormat"><xsl:attribute name="textFormat"> <xsl:value-of select="@textFormat" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="DocumentationTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="EndEventAttributesTemplate">
	  <xsl:call-template name="ThrowEventAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="EndEventTemplate">
	  <xsl:call-template name="ThrowEventTemplate"/> 
	</xsl:template>
  
	<xsl:template name="EndPointAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="EndPointTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ErrorAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@errorCode"><xsl:attribute name="errorCode"> <xsl:value-of select="@errorCode" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@structureRef"><xsl:attribute name="structureRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@structureRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ErrorTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ErrorEventDefinitionAttributesTemplate">
	  <xsl:call-template name="EventDefinitionAttributesTemplate"/> 	
      <xsl:if test="@errorRef"><xsl:attribute name="errorRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@errorRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ErrorEventDefinitionTemplate">
	  <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
  
	<xsl:template name="EscalationAttributesTemplate">
	  <xsl:if test="@escalationCode"><xsl:attribute name="escalationCode"> <xsl:value-of select="@escalationCode" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@structureRef"><xsl:attribute name="structureRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@structureRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="EscalationTemplate">
	</xsl:template>
  
	<xsl:template name="EscalationEventDefinitionAttributesTemplate">
	  <xsl:call-template name="EventDefinitionAttributesTemplate"/> 	
      <xsl:if test="@escalationRef"><xsl:attribute name="escalationRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@escalationRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="EscalationEventDefinitionTemplate">
	  <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
  
	<xsl:template name="EventAttributesTemplate">
	  <xsl:call-template name="FlowNodeAttributesTemplate"/> 	
	  <xsl:call-template name="InteractionNodeAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="EventTemplate">
	  <xsl:call-template name="FlowNodeTemplate"/> 
	  <xsl:call-template name="InteractionNodeTemplate"/> 
      <xsl:for-each select="bpmn2:property">
        <properties xmi:type="bpmn2xmi:Property">			    
	       <xsl:call-template name="PropertyAttributesTemplate"/> 
           <xsl:call-template name="PropertyTemplate" />			   
        </properties>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="EventBasedGatewayAttributesTemplate">
	  <xsl:call-template name="GatewayAttributesTemplate"/> 	
	  <xsl:if test="@eventGatewayType"><xsl:attribute name="eventGatewayType"> <xsl:value-of select="@eventGatewayType" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@instantiate"><xsl:attribute name="instantiate"> <xsl:value-of select="@instantiate" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="EventBasedGatewayTemplate">
	  <xsl:call-template name="GatewayTemplate"/> 
	</xsl:template>
  
	<xsl:template name="EventDefinitionAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="EventDefinitionTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ExclusiveGatewayAttributesTemplate">
	  <xsl:call-template name="GatewayAttributesTemplate"/> 	
      <xsl:if test="@default"><xsl:attribute name="default"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@default"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ExclusiveGatewayTemplate">
	  <xsl:call-template name="GatewayTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ExpressionAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="ExpressionTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ExtensionAttributesTemplate">
	  <xsl:if test="@mustUnderstand"><xsl:attribute name="mustUnderstand"> <xsl:value-of select="@mustUnderstand" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ExtensionTemplate">
      <xsl:for-each select="@definition">
        <definition xmi:type="bpmn2xmi:ExtensionDefinition">			    
	       <xsl:call-template name="ExtensionDefinitionAttributesTemplate"/> 
           <xsl:call-template name="ExtensionDefinitionTemplate" />			   
        </definition>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ExtensionAttributeDefinitionAttributesTemplate">
	  <xsl:if test="bpmn2:name"><xsl:attribute name="name"> <xsl:value-of select="bpmn2:name" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="bpmn2:type"><xsl:attribute name="type"> <xsl:value-of select="bpmn2:type" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="bpmn2:isReference"><xsl:attribute name="isReference"> <xsl:value-of select="bpmn2:isReference" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:extensionDefinition"><xsl:attribute name="extensionDefinition"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:extensionDefinition"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ExtensionAttributeDefinitionTemplate">
	</xsl:template>
  
	<xsl:template name="ExtensionAttributeValueAttributesTemplate">
      <xsl:if test="bpmn2:valueRef"><xsl:attribute name="valueRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:valueRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:extensionAttributeDefinition"><xsl:attribute name="extensionAttributeDefinition"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:extensionAttributeDefinition"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ExtensionAttributeValueTemplate">
      <xsl:for-each select="bpmn2:value">
        <value xmi:type="bpmn2xmi:EObject">			    
	       <xsl:call-template name="EObjectAttributesTemplate"/> 
           <xsl:call-template name="EObjectTemplate" />			   
        </value>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ExtensionDefinitionAttributesTemplate">
	  <xsl:if test="bpmn2:name"><xsl:attribute name="name"> <xsl:value-of select="bpmn2:name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ExtensionDefinitionTemplate">
      <xsl:for-each select="bpmn2:extensionAttributeDefinitions">
        <extensionAttributeDefinitions xmi:type="bpmn2xmi:ExtensionAttributeDefinition">			    
	       <xsl:call-template name="ExtensionAttributeDefinitionAttributesTemplate"/> 
           <xsl:call-template name="ExtensionAttributeDefinitionTemplate" />			   
        </extensionAttributeDefinitions>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="FlowElementAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:categoryValueRef"><xsl:attribute name="categoryValueRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:categoryValueRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="FlowElementTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:auditing">
        <auditing xmi:type="bpmn2xmi:Auditing">			    
	       <xsl:call-template name="AuditingAttributesTemplate"/> 
           <xsl:call-template name="AuditingTemplate" />			   
        </auditing>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:monitoring">
        <monitoring xmi:type="bpmn2xmi:Monitoring">			    
	       <xsl:call-template name="MonitoringAttributesTemplate"/> 
           <xsl:call-template name="MonitoringTemplate" />			   
        </monitoring>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="FlowElementsContainerAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="FlowElementsContainerTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:laneSet">
        <laneSets xmi:type="bpmn2xmi:LaneSet">			    
	       <xsl:call-template name="LaneSetAttributesTemplate"/> 
           <xsl:call-template name="LaneSetTemplate" />			   
        </laneSets>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:adHocSubProcess|bpmn2:boundaryEvent|bpmn2:businessRuleTask|bpmn2:callActivity|bpmn2:callChoreography|bpmn2:choreographyTask|bpmn2:complexGateway|bpmn2:dataObject|bpmn2:dataObjectReference|bpmn2:dataStoreReference|bpmn2:endEvent|bpmn2:event|bpmn2:eventBasedGateway|bpmn2:exclusiveGateway|bpmn2:implicitThrowEvent|bpmn2:inclusiveGateway|bpmn2:intermediateCatchEvent|bpmn2:intermediateThrowEvent|bpmn2:manualTask|bpmn2:parallelGateway|bpmn2:receiveTask|bpmn2:scriptTask|bpmn2:sendTask|bpmn2:sequenceFlow|bpmn2:serviceTask|bpmn2:startEvent|bpmn2:subChoreography|bpmn2:subProcess|bpmn2:task|bpmn2:transaction|bpmn2:userTask">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:adHocSubProcess">
            <flowElements xmi:type="bpmn2xmi:AdHocSubProcess">			    
	          <xsl:call-template name="AdHocSubProcessAttributesTemplate"/> 
			  <xsl:call-template name="AdHocSubProcessTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:boundaryEvent">
            <flowElements xmi:type="bpmn2xmi:BoundaryEvent">			    
	          <xsl:call-template name="BoundaryEventAttributesTemplate"/> 
			  <xsl:call-template name="BoundaryEventTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:businessRuleTask">
            <flowElements xmi:type="bpmn2xmi:BusinessRuleTask">			    
	          <xsl:call-template name="BusinessRuleTaskAttributesTemplate"/> 
			  <xsl:call-template name="BusinessRuleTaskTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:callActivity">
            <flowElements xmi:type="bpmn2xmi:CallActivity">			    
	          <xsl:call-template name="CallActivityAttributesTemplate"/> 
			  <xsl:call-template name="CallActivityTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:callChoreography">
            <flowElements xmi:type="bpmn2xmi:CallChoreography">			    
	          <xsl:call-template name="CallChoreographyAttributesTemplate"/> 
			  <xsl:call-template name="CallChoreographyTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:choreographyTask">
            <flowElements xmi:type="bpmn2xmi:ChoreographyTask">			    
	          <xsl:call-template name="ChoreographyTaskAttributesTemplate"/> 
			  <xsl:call-template name="ChoreographyTaskTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:complexGateway">
            <flowElements xmi:type="bpmn2xmi:ComplexGateway">			    
	          <xsl:call-template name="ComplexGatewayAttributesTemplate"/> 
			  <xsl:call-template name="ComplexGatewayTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:dataObject">
            <flowElements xmi:type="bpmn2xmi:DataObject">			    
	          <xsl:call-template name="DataObjectAttributesTemplate"/> 
			  <xsl:call-template name="DataObjectTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:dataObjectReference">
            <flowElements xmi:type="bpmn2xmi:DataObjectReference">			    
	          <xsl:call-template name="DataObjectReferenceAttributesTemplate"/> 
			  <xsl:call-template name="DataObjectReferenceTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:dataStoreReference">
            <flowElements xmi:type="bpmn2xmi:DataStoreReference">			    
	          <xsl:call-template name="DataStoreReferenceAttributesTemplate"/> 
			  <xsl:call-template name="DataStoreReferenceTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:endEvent">
            <flowElements xmi:type="bpmn2xmi:EndEvent">			    
	          <xsl:call-template name="EndEventAttributesTemplate"/> 
			  <xsl:call-template name="EndEventTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:event">
            <flowElements xmi:type="bpmn2xmi:Event">			    
	          <xsl:call-template name="EventAttributesTemplate"/> 
			  <xsl:call-template name="EventTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:eventBasedGateway">
            <flowElements xmi:type="bpmn2xmi:EventBasedGateway">			    
	          <xsl:call-template name="EventBasedGatewayAttributesTemplate"/> 
			  <xsl:call-template name="EventBasedGatewayTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:exclusiveGateway">
            <flowElements xmi:type="bpmn2xmi:ExclusiveGateway">			    
	          <xsl:call-template name="ExclusiveGatewayAttributesTemplate"/> 
			  <xsl:call-template name="ExclusiveGatewayTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:implicitThrowEvent">
            <flowElements xmi:type="bpmn2xmi:ImplicitThrowEvent">			    
	          <xsl:call-template name="ImplicitThrowEventAttributesTemplate"/> 
			  <xsl:call-template name="ImplicitThrowEventTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:inclusiveGateway">
            <flowElements xmi:type="bpmn2xmi:InclusiveGateway">			    
	          <xsl:call-template name="InclusiveGatewayAttributesTemplate"/> 
			  <xsl:call-template name="InclusiveGatewayTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:intermediateCatchEvent">
            <flowElements xmi:type="bpmn2xmi:IntermediateCatchEvent">			    
	          <xsl:call-template name="IntermediateCatchEventAttributesTemplate"/> 
			  <xsl:call-template name="IntermediateCatchEventTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:intermediateThrowEvent">
            <flowElements xmi:type="bpmn2xmi:IntermediateThrowEvent">			    
	          <xsl:call-template name="IntermediateThrowEventAttributesTemplate"/> 
			  <xsl:call-template name="IntermediateThrowEventTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:manualTask">
            <flowElements xmi:type="bpmn2xmi:ManualTask">			    
	          <xsl:call-template name="ManualTaskAttributesTemplate"/> 
			  <xsl:call-template name="ManualTaskTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:parallelGateway">
            <flowElements xmi:type="bpmn2xmi:ParallelGateway">			    
	          <xsl:call-template name="ParallelGatewayAttributesTemplate"/> 
			  <xsl:call-template name="ParallelGatewayTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:receiveTask">
            <flowElements xmi:type="bpmn2xmi:ReceiveTask">			    
	          <xsl:call-template name="ReceiveTaskAttributesTemplate"/> 
			  <xsl:call-template name="ReceiveTaskTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:scriptTask">
            <flowElements xmi:type="bpmn2xmi:ScriptTask">			    
	          <xsl:call-template name="ScriptTaskAttributesTemplate"/> 
			  <xsl:call-template name="ScriptTaskTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:sendTask">
            <flowElements xmi:type="bpmn2xmi:SendTask">			    
	          <xsl:call-template name="SendTaskAttributesTemplate"/> 
			  <xsl:call-template name="SendTaskTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:sequenceFlow">
            <flowElements xmi:type="bpmn2xmi:SequenceFlow">			    
	          <xsl:call-template name="SequenceFlowAttributesTemplate"/> 
			  <xsl:call-template name="SequenceFlowTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:serviceTask">
            <flowElements xmi:type="bpmn2xmi:ServiceTask">			    
	          <xsl:call-template name="ServiceTaskAttributesTemplate"/> 
			  <xsl:call-template name="ServiceTaskTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:startEvent">
            <flowElements xmi:type="bpmn2xmi:StartEvent">			    
	          <xsl:call-template name="StartEventAttributesTemplate"/> 
			  <xsl:call-template name="StartEventTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:subChoreography">
            <flowElements xmi:type="bpmn2xmi:SubChoreography">			    
	          <xsl:call-template name="SubChoreographyAttributesTemplate"/> 
			  <xsl:call-template name="SubChoreographyTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:subProcess">
            <flowElements xmi:type="bpmn2xmi:SubProcess">			    
	          <xsl:call-template name="SubProcessAttributesTemplate"/> 
			  <xsl:call-template name="SubProcessTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:task">
            <flowElements xmi:type="bpmn2xmi:Task">			    
	          <xsl:call-template name="TaskAttributesTemplate"/> 
			  <xsl:call-template name="TaskTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:transaction">
            <flowElements xmi:type="bpmn2xmi:Transaction">			    
	          <xsl:call-template name="TransactionAttributesTemplate"/> 
			  <xsl:call-template name="TransactionTemplate" />			   
			</flowElements>
          </xsl:when > 
          <xsl:when test="self::bpmn2:userTask">
            <flowElements xmi:type="bpmn2xmi:UserTask">			    
	          <xsl:call-template name="UserTaskAttributesTemplate"/> 
			  <xsl:call-template name="UserTaskTemplate" />			   
			</flowElements>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="FlowNodeAttributesTemplate">
	  <xsl:call-template name="FlowElementAttributesTemplate"/> 	
      <xsl:if test="bpmn2:incoming"><xsl:attribute name="incoming"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:incoming"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:lanes"><xsl:attribute name="lanes"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:lanes"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:outgoing"><xsl:attribute name="outgoing"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:outgoing"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="FlowNodeTemplate">
	  <xsl:call-template name="FlowElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="FormalExpressionAttributesTemplate">
	  <xsl:call-template name="ExpressionAttributesTemplate"/> 	
	  <xsl:if test="@language"><xsl:attribute name="language"> <xsl:value-of select="@language" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:body"><xsl:attribute name="body"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:body"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@evaluatesToTypeRef"><xsl:attribute name="evaluatesToTypeRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@evaluatesToTypeRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="FormalExpressionTemplate">
	  <xsl:call-template name="ExpressionTemplate"/> 
	</xsl:template>
  
	<xsl:template name="GatewayAttributesTemplate">
	  <xsl:call-template name="FlowNodeAttributesTemplate"/> 	
	  <xsl:if test="@gatewayDirection"><xsl:attribute name="gatewayDirection"> <xsl:value-of select="@gatewayDirection" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="GatewayTemplate">
	  <xsl:call-template name="FlowNodeTemplate"/> 
	</xsl:template>
  
	<xsl:template name="GlobalBusinessRuleTaskAttributesTemplate">
	  <xsl:call-template name="GlobalTaskAttributesTemplate"/> 	
	  <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="GlobalBusinessRuleTaskTemplate">
	  <xsl:call-template name="GlobalTaskTemplate"/> 
	</xsl:template>
  
	<xsl:template name="GlobalChoreographyTaskAttributesTemplate">
	  <xsl:call-template name="ChoreographyAttributesTemplate"/> 	
      <xsl:if test="@initiatingParticipantRef"><xsl:attribute name="initiatingParticipantRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@initiatingParticipantRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="GlobalChoreographyTaskTemplate">
	  <xsl:call-template name="ChoreographyTemplate"/> 
	</xsl:template>
  
	<xsl:template name="GlobalConversationAttributesTemplate">
	  <xsl:call-template name="CollaborationAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="GlobalConversationTemplate">
	  <xsl:call-template name="CollaborationTemplate"/> 
	</xsl:template>
  
	<xsl:template name="GlobalManualTaskAttributesTemplate">
	  <xsl:call-template name="GlobalTaskAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="GlobalManualTaskTemplate">
	  <xsl:call-template name="GlobalTaskTemplate"/> 
	</xsl:template>
  
	<xsl:template name="GlobalScriptTaskAttributesTemplate">
	  <xsl:call-template name="GlobalTaskAttributesTemplate"/> 	
	  <xsl:if test="bpmn2:script"><xsl:attribute name="script"> <xsl:value-of select="bpmn2:script" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@scriptLanguage"><xsl:attribute name="scriptLanguage"> <xsl:value-of select="@scriptLanguage" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="GlobalScriptTaskTemplate">
	  <xsl:call-template name="GlobalTaskTemplate"/> 
	</xsl:template>
  
	<xsl:template name="GlobalTaskAttributesTemplate">
	  <xsl:call-template name="CallableElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="GlobalTaskTemplate">
	  <xsl:call-template name="CallableElementTemplate"/> 
      <xsl:for-each select="bpmn2:performer|bpmn2:humanPerformer|bpmn2:potentialOwner">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:performer">
            <resources xmi:type="bpmn2xmi:Performer">			    
	          <xsl:call-template name="PerformerAttributesTemplate"/> 
			  <xsl:call-template name="PerformerTemplate" />			   
			</resources>
          </xsl:when > 
          <xsl:when test="self::bpmn2:humanPerformer">
            <resources xmi:type="bpmn2xmi:HumanPerformer">			    
	          <xsl:call-template name="HumanPerformerAttributesTemplate"/> 
			  <xsl:call-template name="HumanPerformerTemplate" />			   
			</resources>
          </xsl:when > 
          <xsl:when test="self::bpmn2:potentialOwner">
            <resources xmi:type="bpmn2xmi:PotentialOwner">			    
	          <xsl:call-template name="PotentialOwnerAttributesTemplate"/> 
			  <xsl:call-template name="PotentialOwnerTemplate" />			   
			</resources>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="GlobalUserTaskAttributesTemplate">
	  <xsl:call-template name="GlobalTaskAttributesTemplate"/> 	
	  <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="GlobalUserTaskTemplate">
	  <xsl:call-template name="GlobalTaskTemplate"/> 
      <xsl:for-each select="bpmn2:rendering">
        <renderings xmi:type="bpmn2xmi:Rendering">			    
	       <xsl:call-template name="RenderingAttributesTemplate"/> 
           <xsl:call-template name="RenderingTemplate" />			   
        </renderings>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="GroupAttributesTemplate">
	  <xsl:call-template name="ArtifactAttributesTemplate"/> 	
      <xsl:if test="@categoryValueRef"><xsl:attribute name="categoryValueRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@categoryValueRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="GroupTemplate">
	  <xsl:call-template name="ArtifactTemplate"/> 
	</xsl:template>
  
	<xsl:template name="HumanPerformerAttributesTemplate">
	  <xsl:call-template name="PerformerAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="HumanPerformerTemplate">
	  <xsl:call-template name="PerformerTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ImplicitThrowEventAttributesTemplate">
	  <xsl:call-template name="ThrowEventAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="ImplicitThrowEventTemplate">
	  <xsl:call-template name="ThrowEventTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ImportAttributesTemplate">
	  <xsl:if test="@importType"><xsl:attribute name="importType"> <xsl:value-of select="@importType" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@location"><xsl:attribute name="location"> <xsl:value-of select="@location" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@namespace"><xsl:attribute name="namespace"> <xsl:value-of select="@namespace" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ImportTemplate">
	</xsl:template>
  
	<xsl:template name="InclusiveGatewayAttributesTemplate">
	  <xsl:call-template name="GatewayAttributesTemplate"/> 	
      <xsl:if test="@default"><xsl:attribute name="default"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@default"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="InclusiveGatewayTemplate">
	  <xsl:call-template name="GatewayTemplate"/> 
	</xsl:template>
  
	<xsl:template name="InputOutputBindingAttributesTemplate">
      <xsl:if test="@inputDataRef"><xsl:attribute name="inputDataRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@inputDataRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@operationRef"><xsl:attribute name="operationRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@operationRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@outputDataRef"><xsl:attribute name="outputDataRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@outputDataRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="InputOutputBindingTemplate">
	</xsl:template>
  
	<xsl:template name="InputOutputSpecificationAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="InputOutputSpecificationTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:dataInput">
        <dataInputs xmi:type="bpmn2xmi:DataInput">			    
	       <xsl:call-template name="DataInputAttributesTemplate"/> 
           <xsl:call-template name="DataInputTemplate" />			   
        </dataInputs>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:dataOutput">
        <dataOutputs xmi:type="bpmn2xmi:DataOutput">			    
	       <xsl:call-template name="DataOutputAttributesTemplate"/> 
           <xsl:call-template name="DataOutputTemplate" />			   
        </dataOutputs>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:inputSet">
        <inputSets xmi:type="bpmn2xmi:InputSet">			    
	       <xsl:call-template name="InputSetAttributesTemplate"/> 
           <xsl:call-template name="InputSetTemplate" />			   
        </inputSets>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:outputSet">
        <outputSets xmi:type="bpmn2xmi:OutputSet">			    
	       <xsl:call-template name="OutputSetAttributesTemplate"/> 
           <xsl:call-template name="OutputSetTemplate" />			   
        </outputSets>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="InputSetAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:dataInputRefs"><xsl:attribute name="dataInputRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:dataInputRefs"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:optionalInputRefs"><xsl:attribute name="optionalInputRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:optionalInputRefs"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:whileExecutingInputRefs"><xsl:attribute name="whileExecutingInputRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:whileExecutingInputRefs"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:outputSetRefs"><xsl:attribute name="outputSetRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:outputSetRefs"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="InputSetTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="InteractionNodeAttributesTemplate">
      <xsl:if test="bpmn2:incomingConversationLinks"><xsl:attribute name="incomingConversationLinks"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:incomingConversationLinks"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:outgoingConversationLinks"><xsl:attribute name="outgoingConversationLinks"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:outgoingConversationLinks"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="InteractionNodeTemplate">
	</xsl:template>
  
	<xsl:template name="InterfaceAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@implementationRef"><xsl:attribute name="implementationRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@implementationRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="InterfaceTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
      <xsl:for-each select="bpmn2:operation">
        <operations xmi:type="bpmn2xmi:Operation">			    
	       <xsl:call-template name="OperationAttributesTemplate"/> 
           <xsl:call-template name="OperationTemplate" />			   
        </operations>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="IntermediateCatchEventAttributesTemplate">
	  <xsl:call-template name="CatchEventAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="IntermediateCatchEventTemplate">
	  <xsl:call-template name="CatchEventTemplate"/> 
	</xsl:template>
  
	<xsl:template name="IntermediateThrowEventAttributesTemplate">
	  <xsl:call-template name="ThrowEventAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="IntermediateThrowEventTemplate">
	  <xsl:call-template name="ThrowEventTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ItemAwareElementAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
      <xsl:if test="@itemSubjectRef"><xsl:attribute name="itemSubjectRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@itemSubjectRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ItemAwareElementTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:dataState">
        <dataState xmi:type="bpmn2xmi:DataState">			    
	       <xsl:call-template name="DataStateAttributesTemplate"/> 
           <xsl:call-template name="DataStateTemplate" />			   
        </dataState>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ItemDefinitionAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@isCollection"><xsl:attribute name="isCollection"> <xsl:value-of select="@isCollection" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@itemKind"><xsl:attribute name="itemKind"> <xsl:value-of select="@itemKind" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:import"><xsl:attribute name="import"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:import"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@structureRef"><xsl:attribute name="structureRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@structureRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ItemDefinitionTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="LaneAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:flowNodeRef"><xsl:attribute name="flowNodeRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:flowNodeRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@partitionElementRef"><xsl:attribute name="partitionElementRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@partitionElementRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="LaneTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:partitionElement">
        <partitionElement xmi:type="bpmn2xmi:BaseElement">			    
	       <xsl:call-template name="BaseElementAttributesTemplate"/> 
           <xsl:call-template name="BaseElementTemplate" />			   
        </partitionElement>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:childLaneSet">
        <childLaneSet xmi:type="bpmn2xmi:LaneSet">			    
	       <xsl:call-template name="LaneSetAttributesTemplate"/> 
           <xsl:call-template name="LaneSetTemplate" />			   
        </childLaneSet>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="LaneSetAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="LaneSetTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:lane">
        <lanes xmi:type="bpmn2xmi:Lane">			    
	       <xsl:call-template name="LaneAttributesTemplate"/> 
           <xsl:call-template name="LaneTemplate" />			   
        </lanes>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="LinkEventDefinitionAttributesTemplate">
	  <xsl:call-template name="EventDefinitionAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:source"><xsl:attribute name="source"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:source"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:target"><xsl:attribute name="target"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:target"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="LinkEventDefinitionTemplate">
	  <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
  
	<xsl:template name="LoopCharacteristicsAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="LoopCharacteristicsTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ManualTaskAttributesTemplate">
	  <xsl:call-template name="TaskAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="ManualTaskTemplate">
	  <xsl:call-template name="TaskTemplate"/> 
	</xsl:template>
  
	<xsl:template name="MessageAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@itemRef"><xsl:attribute name="itemRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@itemRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="MessageTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="MessageEventDefinitionAttributesTemplate">
	  <xsl:call-template name="EventDefinitionAttributesTemplate"/> 	
      <xsl:if test="bpmn2:operationRef"><xsl:attribute name="operationRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:operationRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@messageRef"><xsl:attribute name="messageRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@messageRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="MessageEventDefinitionTemplate">
	  <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
  
	<xsl:template name="MessageFlowAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@messageRef"><xsl:attribute name="messageRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@messageRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@sourceRef"><xsl:attribute name="sourceRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@sourceRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@targetRef"><xsl:attribute name="targetRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@targetRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="MessageFlowTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="MessageFlowAssociationAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
      <xsl:if test="@innerMessageFlowRef"><xsl:attribute name="innerMessageFlowRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@innerMessageFlowRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@outerMessageFlowRef"><xsl:attribute name="outerMessageFlowRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@outerMessageFlowRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="MessageFlowAssociationTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="MonitoringAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="MonitoringTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="MultiInstanceLoopCharacteristicsAttributesTemplate">
	  <xsl:call-template name="LoopCharacteristicsAttributesTemplate"/> 	
	  <xsl:if test="@behavior"><xsl:attribute name="behavior"> <xsl:value-of select="@behavior" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@isSequential"><xsl:attribute name="isSequential"> <xsl:value-of select="@isSequential" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:loopDataInputRef"><xsl:attribute name="loopDataInputRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:loopDataInputRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:loopDataOutputRef"><xsl:attribute name="loopDataOutputRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:loopDataOutputRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@noneBehaviorEventRef"><xsl:attribute name="noneBehaviorEventRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@noneBehaviorEventRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@oneBehaviorEventRef"><xsl:attribute name="oneBehaviorEventRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@oneBehaviorEventRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="MultiInstanceLoopCharacteristicsTemplate">
	  <xsl:call-template name="LoopCharacteristicsTemplate"/> 
      <xsl:for-each select="bpmn2:loopCardinality">
        <loopCardinality xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </loopCardinality>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:inputDataItem">
        <inputDataItem xmi:type="bpmn2xmi:DataInput">			    
	       <xsl:call-template name="DataInputAttributesTemplate"/> 
           <xsl:call-template name="DataInputTemplate" />			   
        </inputDataItem>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:outputDataItem">
        <outputDataItem xmi:type="bpmn2xmi:DataOutput">			    
	       <xsl:call-template name="DataOutputAttributesTemplate"/> 
           <xsl:call-template name="DataOutputTemplate" />			   
        </outputDataItem>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:complexBehaviorDefinition">
        <complexBehaviorDefinition xmi:type="bpmn2xmi:ComplexBehaviorDefinition">			    
	       <xsl:call-template name="ComplexBehaviorDefinitionAttributesTemplate"/> 
           <xsl:call-template name="ComplexBehaviorDefinitionTemplate" />			   
        </complexBehaviorDefinition>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:completionCondition">
        <completionCondition xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </completionCondition>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="OperationAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:inMessageRef"><xsl:attribute name="inMessageRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:inMessageRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:outMessageRef"><xsl:attribute name="outMessageRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:outMessageRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:errorRef"><xsl:attribute name="errorRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:errorRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@implementationRef"><xsl:attribute name="implementationRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@implementationRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="OperationTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="OutputSetAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:dataOutputRefs"><xsl:attribute name="dataOutputRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:dataOutputRefs"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:optionalOutputRefs"><xsl:attribute name="optionalOutputRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:optionalOutputRefs"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:whileExecutingOutputRefs"><xsl:attribute name="whileExecutingOutputRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:whileExecutingOutputRefs"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:inputSetRefs"><xsl:attribute name="inputSetRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:inputSetRefs"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="OutputSetTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ParallelGatewayAttributesTemplate">
	  <xsl:call-template name="GatewayAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="ParallelGatewayTemplate">
	  <xsl:call-template name="GatewayTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ParticipantAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:call-template name="InteractionNodeAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:interfaceRef"><xsl:attribute name="interfaceRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:interfaceRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:endPointRef"><xsl:attribute name="endPointRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:endPointRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@processRef"><xsl:attribute name="processRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@processRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ParticipantTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	  <xsl:call-template name="InteractionNodeTemplate"/> 
      <xsl:for-each select="bpmn2:participantMultiplicity">
        <participantMultiplicity xmi:type="bpmn2xmi:ParticipantMultiplicity">			    
	       <xsl:call-template name="ParticipantMultiplicityAttributesTemplate"/> 
           <xsl:call-template name="ParticipantMultiplicityTemplate" />			   
        </participantMultiplicity>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ParticipantAssociationAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
      <xsl:if test="bpmn2:innerParticipantRef"><xsl:attribute name="innerParticipantRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:innerParticipantRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:outerParticipantRef"><xsl:attribute name="outerParticipantRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:outerParticipantRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ParticipantAssociationTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ParticipantMultiplicityAttributesTemplate">
	  <xsl:if test="@maximum"><xsl:attribute name="maximum"> <xsl:value-of select="@maximum" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@minimum"><xsl:attribute name="minimum"> <xsl:value-of select="@minimum" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ParticipantMultiplicityTemplate">
	</xsl:template>
  
	<xsl:template name="PartnerEntityAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:participantRef"><xsl:attribute name="participantRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:participantRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="PartnerEntityTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="PartnerRoleAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:participantRef"><xsl:attribute name="participantRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:participantRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="PartnerRoleTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="PerformerAttributesTemplate">
	  <xsl:call-template name="ResourceRoleAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="PerformerTemplate">
	  <xsl:call-template name="ResourceRoleTemplate"/> 
	</xsl:template>
  
	<xsl:template name="PotentialOwnerAttributesTemplate">
	  <xsl:call-template name="HumanPerformerAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="PotentialOwnerTemplate">
	  <xsl:call-template name="HumanPerformerTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ProcessAttributesTemplate">
	  <xsl:call-template name="CallableElementAttributesTemplate"/> 	
	  <xsl:call-template name="FlowElementsContainerAttributesTemplate"/> 	
	  <xsl:if test="@isClosed"><xsl:attribute name="isClosed"> <xsl:value-of select="@isClosed" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@isExecutable"><xsl:attribute name="isExecutable"> <xsl:value-of select="@isExecutable" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@processType"><xsl:attribute name="processType"> <xsl:value-of select="@processType" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:supports"><xsl:attribute name="supports"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:supports"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@definitionalCollaborationRef"><xsl:attribute name="definitionalCollaborationRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@definitionalCollaborationRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ProcessTemplate">
	  <xsl:call-template name="CallableElementTemplate"/> 
	  <xsl:call-template name="FlowElementsContainerTemplate"/> 
      <xsl:for-each select="bpmn2:auditing">
        <auditing xmi:type="bpmn2xmi:Auditing">			    
	       <xsl:call-template name="AuditingAttributesTemplate"/> 
           <xsl:call-template name="AuditingTemplate" />			   
        </auditing>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:monitoring">
        <monitoring xmi:type="bpmn2xmi:Monitoring">			    
	       <xsl:call-template name="MonitoringAttributesTemplate"/> 
           <xsl:call-template name="MonitoringTemplate" />			   
        </monitoring>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:property">
        <properties xmi:type="bpmn2xmi:Property">			    
	       <xsl:call-template name="PropertyAttributesTemplate"/> 
           <xsl:call-template name="PropertyTemplate" />			   
        </properties>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:association|bpmn2:group|bpmn2:textAnnotation">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:association">
            <artifacts xmi:type="bpmn2xmi:Association">			    
	          <xsl:call-template name="AssociationAttributesTemplate"/> 
			  <xsl:call-template name="AssociationTemplate" />			   
			</artifacts>
          </xsl:when > 
          <xsl:when test="self::bpmn2:group">
            <artifacts xmi:type="bpmn2xmi:Group">			    
	          <xsl:call-template name="GroupAttributesTemplate"/> 
			  <xsl:call-template name="GroupTemplate" />			   
			</artifacts>
          </xsl:when > 
          <xsl:when test="self::bpmn2:textAnnotation">
            <artifacts xmi:type="bpmn2xmi:TextAnnotation">			    
	          <xsl:call-template name="TextAnnotationAttributesTemplate"/> 
			  <xsl:call-template name="TextAnnotationTemplate" />			   
			</artifacts>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:performer|bpmn2:humanPerformer|bpmn2:potentialOwner">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:performer">
            <resources xmi:type="bpmn2xmi:Performer">			    
	          <xsl:call-template name="PerformerAttributesTemplate"/> 
			  <xsl:call-template name="PerformerTemplate" />			   
			</resources>
          </xsl:when > 
          <xsl:when test="self::bpmn2:humanPerformer">
            <resources xmi:type="bpmn2xmi:HumanPerformer">			    
	          <xsl:call-template name="HumanPerformerAttributesTemplate"/> 
			  <xsl:call-template name="HumanPerformerTemplate" />			   
			</resources>
          </xsl:when > 
          <xsl:when test="self::bpmn2:potentialOwner">
            <resources xmi:type="bpmn2xmi:PotentialOwner">			    
	          <xsl:call-template name="PotentialOwnerAttributesTemplate"/> 
			  <xsl:call-template name="PotentialOwnerTemplate" />			   
			</resources>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:correlationSubscription">
        <correlationSubscriptions xmi:type="bpmn2xmi:CorrelationSubscription">			    
	       <xsl:call-template name="CorrelationSubscriptionAttributesTemplate"/> 
           <xsl:call-template name="CorrelationSubscriptionTemplate" />			   
        </correlationSubscriptions>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="PropertyAttributesTemplate">
	  <xsl:call-template name="ItemAwareElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="PropertyTemplate">
	  <xsl:call-template name="ItemAwareElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ReceiveTaskAttributesTemplate">
	  <xsl:call-template name="TaskAttributesTemplate"/> 	
	  <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@instantiate"><xsl:attribute name="instantiate"> <xsl:value-of select="@instantiate" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@messageRef"><xsl:attribute name="messageRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@messageRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@operationRef"><xsl:attribute name="operationRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@operationRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ReceiveTaskTemplate">
	  <xsl:call-template name="TaskTemplate"/> 
	</xsl:template>
  
	<xsl:template name="RelationshipAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@direction"><xsl:attribute name="direction"> <xsl:value-of select="@direction" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@type"><xsl:attribute name="type"> <xsl:value-of select="@type" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:source"><xsl:attribute name="sources"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:source"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:target"><xsl:attribute name="targets"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:target"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="RelationshipTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="RenderingAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="RenderingTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ResourceAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ResourceTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
      <xsl:for-each select="bpmn2:resourceParameter">
        <resourceParameters xmi:type="bpmn2xmi:ResourceParameter">			    
	       <xsl:call-template name="ResourceParameterAttributesTemplate"/> 
           <xsl:call-template name="ResourceParameterTemplate" />			   
        </resourceParameters>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ResourceAssignmentExpressionAttributesTemplate">
	</xsl:template>

	<xsl:template name="ResourceAssignmentExpressionTemplate">
      <xsl:for-each select="bpmn2:formalExpression">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:formalExpression">
            <expression xmi:type="bpmn2xmi:FormalExpression">			    
	          <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
			  <xsl:call-template name="FormalExpressionTemplate" />			   
			</expression>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ResourceParameterAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@isRequired"><xsl:attribute name="isRequired"> <xsl:value-of select="@isRequired" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@type"><xsl:attribute name="type"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@type"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ResourceParameterTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ResourceParameterBindingAttributesTemplate">
      <xsl:if test="@parameterRef"><xsl:attribute name="parameterRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@parameterRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ResourceParameterBindingTemplate">
      <xsl:for-each select="bpmn2:formalExpression">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:formalExpression">
            <expression xmi:type="bpmn2xmi:FormalExpression">			    
	          <xsl:call-template name="FormalExpressionAttributesTemplate"/> 
			  <xsl:call-template name="FormalExpressionTemplate" />			   
			</expression>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ResourceRoleAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:resourceRef"><xsl:attribute name="resourceRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:resourceRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ResourceRoleTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
      <xsl:for-each select="bpmn2:resourceParameterBinding">
        <resourceParameterBindings xmi:type="bpmn2xmi:ResourceParameterBinding">			    
	       <xsl:call-template name="ResourceParameterBindingAttributesTemplate"/> 
           <xsl:call-template name="ResourceParameterBindingTemplate" />			   
        </resourceParameterBindings>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:resourceAssignmentExpression">
        <resourceAssignmentExpression xmi:type="bpmn2xmi:ResourceAssignmentExpression">			    
	       <xsl:call-template name="ResourceAssignmentExpressionAttributesTemplate"/> 
           <xsl:call-template name="ResourceAssignmentExpressionTemplate" />			   
        </resourceAssignmentExpression>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="RootElementAttributesTemplate">
	  <xsl:call-template name="BaseElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="RootElementTemplate">
	  <xsl:call-template name="BaseElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ScriptTaskAttributesTemplate">
	  <xsl:call-template name="TaskAttributesTemplate"/> 	
	  <xsl:if test="bpmn2:script"><xsl:attribute name="script"> <xsl:value-of select="bpmn2:script" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@scriptFormat"><xsl:attribute name="scriptFormat"> <xsl:value-of select="@scriptFormat" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ScriptTaskTemplate">
	  <xsl:call-template name="TaskTemplate"/> 
	</xsl:template>
  
	<xsl:template name="SendTaskAttributesTemplate">
	  <xsl:call-template name="TaskAttributesTemplate"/> 	
	  <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@messageRef"><xsl:attribute name="messageRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@messageRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@operationRef"><xsl:attribute name="operationRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@operationRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="SendTaskTemplate">
	  <xsl:call-template name="TaskTemplate"/> 
	</xsl:template>
  
	<xsl:template name="SequenceFlowAttributesTemplate">
	  <xsl:call-template name="FlowElementAttributesTemplate"/> 	
	  <xsl:if test="@isImmediate"><xsl:attribute name="isImmediate"> <xsl:value-of select="@isImmediate" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@sourceRef"><xsl:attribute name="sourceRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@sourceRef"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@targetRef"><xsl:attribute name="targetRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@targetRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="SequenceFlowTemplate">
	  <xsl:call-template name="FlowElementTemplate"/> 
      <xsl:for-each select="bpmn2:conditionExpression">
        <conditionExpression xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </conditionExpression>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ServiceTaskAttributesTemplate">
	  <xsl:call-template name="TaskAttributesTemplate"/> 	
	  <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@operationRef"><xsl:attribute name="operationRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@operationRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ServiceTaskTemplate">
	  <xsl:call-template name="TaskTemplate"/> 
	</xsl:template>
  
	<xsl:template name="SignalAttributesTemplate">
	  <xsl:call-template name="RootElementAttributesTemplate"/> 	
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@structureRef"><xsl:attribute name="structureRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@structureRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="SignalTemplate">
	  <xsl:call-template name="RootElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="SignalEventDefinitionAttributesTemplate">
	  <xsl:call-template name="EventDefinitionAttributesTemplate"/> 	
      <xsl:if test="@signalRef"><xsl:attribute name="signalRef"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@signalRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="SignalEventDefinitionTemplate">
	  <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
  
	<xsl:template name="StandardLoopCharacteristicsAttributesTemplate">
	  <xsl:call-template name="LoopCharacteristicsAttributesTemplate"/> 	
	  <xsl:if test="@testBefore"><xsl:attribute name="testBefore"> <xsl:value-of select="@testBefore" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="StandardLoopCharacteristicsTemplate">
	  <xsl:call-template name="LoopCharacteristicsTemplate"/> 
      <xsl:for-each select="bpmn2:loopCondition">
        <loopCondition xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </loopCondition>
      </xsl:for-each>
      <xsl:for-each select="@loopMaximum">
        <loopMaximum xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </loopMaximum>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="StartEventAttributesTemplate">
	  <xsl:call-template name="CatchEventAttributesTemplate"/> 	
	  <xsl:if test="@isInterrupting"><xsl:attribute name="isInterrupting"> <xsl:value-of select="@isInterrupting" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="StartEventTemplate">
	  <xsl:call-template name="CatchEventTemplate"/> 
	</xsl:template>
  
	<xsl:template name="SubChoreographyAttributesTemplate">
	  <xsl:call-template name="ChoreographyActivityAttributesTemplate"/> 	
	  <xsl:call-template name="FlowElementsContainerAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="SubChoreographyTemplate">
	  <xsl:call-template name="ChoreographyActivityTemplate"/> 
	  <xsl:call-template name="FlowElementsContainerTemplate"/> 
      <xsl:for-each select="bpmn2:association|bpmn2:group|bpmn2:textAnnotation">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:association">
            <artifacts xmi:type="bpmn2xmi:Association">			    
	          <xsl:call-template name="AssociationAttributesTemplate"/> 
			  <xsl:call-template name="AssociationTemplate" />			   
			</artifacts>
          </xsl:when > 
          <xsl:when test="self::bpmn2:group">
            <artifacts xmi:type="bpmn2xmi:Group">			    
	          <xsl:call-template name="GroupAttributesTemplate"/> 
			  <xsl:call-template name="GroupTemplate" />			   
			</artifacts>
          </xsl:when > 
          <xsl:when test="self::bpmn2:textAnnotation">
            <artifacts xmi:type="bpmn2xmi:TextAnnotation">			    
	          <xsl:call-template name="TextAnnotationAttributesTemplate"/> 
			  <xsl:call-template name="TextAnnotationTemplate" />			   
			</artifacts>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="SubConversationAttributesTemplate">
	  <xsl:call-template name="ConversationNodeAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="SubConversationTemplate">
	  <xsl:call-template name="ConversationNodeTemplate"/> 
      <xsl:for-each select="bpmn2:callConversation|bpmn2:conversation|bpmn2:subConversation">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:callConversation">
            <conversationNodes xmi:type="bpmn2xmi:CallConversation">			    
	          <xsl:call-template name="CallConversationAttributesTemplate"/> 
			  <xsl:call-template name="CallConversationTemplate" />			   
			</conversationNodes>
          </xsl:when > 
          <xsl:when test="self::bpmn2:conversation">
            <conversationNodes xmi:type="bpmn2xmi:Conversation">			    
	          <xsl:call-template name="ConversationAttributesTemplate"/> 
			  <xsl:call-template name="ConversationTemplate" />			   
			</conversationNodes>
          </xsl:when > 
          <xsl:when test="self::bpmn2:subConversation">
            <conversationNodes xmi:type="bpmn2xmi:SubConversation">			    
	          <xsl:call-template name="SubConversationAttributesTemplate"/> 
			  <xsl:call-template name="SubConversationTemplate" />			   
			</conversationNodes>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="SubProcessAttributesTemplate">
	  <xsl:call-template name="ActivityAttributesTemplate"/> 	
	  <xsl:call-template name="FlowElementsContainerAttributesTemplate"/> 	
	  <xsl:if test="@triggeredByEvent"><xsl:attribute name="triggeredByEvent"> <xsl:value-of select="@triggeredByEvent" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="SubProcessTemplate">
	  <xsl:call-template name="ActivityTemplate"/> 
	  <xsl:call-template name="FlowElementsContainerTemplate"/> 
      <xsl:for-each select="bpmn2:association|bpmn2:group|bpmn2:textAnnotation">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:association">
            <artifacts xmi:type="bpmn2xmi:Association">			    
	          <xsl:call-template name="AssociationAttributesTemplate"/> 
			  <xsl:call-template name="AssociationTemplate" />			   
			</artifacts>
          </xsl:when > 
          <xsl:when test="self::bpmn2:group">
            <artifacts xmi:type="bpmn2xmi:Group">			    
	          <xsl:call-template name="GroupAttributesTemplate"/> 
			  <xsl:call-template name="GroupTemplate" />			   
			</artifacts>
          </xsl:when > 
          <xsl:when test="self::bpmn2:textAnnotation">
            <artifacts xmi:type="bpmn2xmi:TextAnnotation">			    
	          <xsl:call-template name="TextAnnotationAttributesTemplate"/> 
			  <xsl:call-template name="TextAnnotationTemplate" />			   
			</artifacts>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="TaskAttributesTemplate">
	  <xsl:call-template name="ActivityAttributesTemplate"/> 	
	  <xsl:call-template name="InteractionNodeAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="TaskTemplate">
	  <xsl:call-template name="ActivityTemplate"/> 
	  <xsl:call-template name="InteractionNodeTemplate"/> 
	</xsl:template>
  
	<xsl:template name="TerminateEventDefinitionAttributesTemplate">
	  <xsl:call-template name="EventDefinitionAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="TerminateEventDefinitionTemplate">
	  <xsl:call-template name="EventDefinitionTemplate"/> 
	</xsl:template>
  
	<xsl:template name="TextAnnotationAttributesTemplate">
	  <xsl:call-template name="ArtifactAttributesTemplate"/> 	
	  <xsl:if test="bpmn2:text"><xsl:attribute name="text"> <xsl:value-of select="bpmn2:text" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@textFormat"><xsl:attribute name="textFormat"> <xsl:value-of select="@textFormat" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="TextAnnotationTemplate">
	  <xsl:call-template name="ArtifactTemplate"/> 
	</xsl:template>
  
	<xsl:template name="ThrowEventAttributesTemplate">
	  <xsl:call-template name="EventAttributesTemplate"/> 	
      <xsl:if test="bpmn2:eventDefinitionRef"><xsl:attribute name="eventDefinitionRefs"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:eventDefinitionRef"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="ThrowEventTemplate">
	  <xsl:call-template name="EventTemplate"/> 
      <xsl:for-each select="bpmn2:dataInput">
        <dataInputs xmi:type="bpmn2xmi:DataInput">			    
	       <xsl:call-template name="DataInputAttributesTemplate"/> 
           <xsl:call-template name="DataInputTemplate" />			   
        </dataInputs>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:dataInputAssociation">
        <dataInputAssociation xmi:type="bpmn2xmi:DataInputAssociation">			    
	       <xsl:call-template name="DataInputAssociationAttributesTemplate"/> 
           <xsl:call-template name="DataInputAssociationTemplate" />			   
        </dataInputAssociation>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:inputSet">
        <inputSet xmi:type="bpmn2xmi:InputSet">			    
	       <xsl:call-template name="InputSetAttributesTemplate"/> 
           <xsl:call-template name="InputSetTemplate" />			   
        </inputSet>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:cancelEventDefinition|bpmn2:compensateEventDefinition|bpmn2:conditionalEventDefinition|bpmn2:errorEventDefinition|bpmn2:escalationEventDefinition|bpmn2:linkEventDefinition|bpmn2:messageEventDefinition|bpmn2:signalEventDefinition|bpmn2:terminateEventDefinition|bpmn2:timerEventDefinition">
        <xsl:choose>		 
          <xsl:when test="self::bpmn2:cancelEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:CancelEventDefinition">			    
	          <xsl:call-template name="CancelEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="CancelEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:compensateEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:CompensateEventDefinition">			    
	          <xsl:call-template name="CompensateEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="CompensateEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:conditionalEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:ConditionalEventDefinition">			    
	          <xsl:call-template name="ConditionalEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="ConditionalEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:errorEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:ErrorEventDefinition">			    
	          <xsl:call-template name="ErrorEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="ErrorEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:escalationEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:EscalationEventDefinition">			    
	          <xsl:call-template name="EscalationEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="EscalationEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:linkEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:LinkEventDefinition">			    
	          <xsl:call-template name="LinkEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="LinkEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:messageEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:MessageEventDefinition">			    
	          <xsl:call-template name="MessageEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="MessageEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:signalEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:SignalEventDefinition">			    
	          <xsl:call-template name="SignalEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="SignalEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:terminateEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:TerminateEventDefinition">			    
	          <xsl:call-template name="TerminateEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="TerminateEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when > 
          <xsl:when test="self::bpmn2:timerEventDefinition">
            <eventDefinitions xmi:type="bpmn2xmi:TimerEventDefinition">			    
	          <xsl:call-template name="TimerEventDefinitionAttributesTemplate"/> 
			  <xsl:call-template name="TimerEventDefinitionTemplate" />			   
			</eventDefinitions>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="TimerEventDefinitionAttributesTemplate">
	  <xsl:call-template name="EventDefinitionAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="TimerEventDefinitionTemplate">
	  <xsl:call-template name="EventDefinitionTemplate"/> 
      <xsl:for-each select="bpmn2:timeDate">
        <timeDate xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </timeDate>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:timeDuration">
        <timeDuration xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </timeDuration>
      </xsl:for-each>
      <xsl:for-each select="bpmn2:timeCycle">
        <timeCycle xmi:type="bpmn2xmi:Expression">			    
	       <xsl:call-template name="ExpressionAttributesTemplate"/> 
           <xsl:call-template name="ExpressionTemplate" />			   
        </timeCycle>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="TransactionAttributesTemplate">
	  <xsl:call-template name="SubProcessAttributesTemplate"/> 	
	  <xsl:if test="bpmn2:protocol"><xsl:attribute name="protocol"> <xsl:value-of select="bpmn2:protocol" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@method"><xsl:attribute name="method"> <xsl:value-of select="@method" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="TransactionTemplate">
	  <xsl:call-template name="SubProcessTemplate"/> 
	</xsl:template>
  
	<xsl:template name="UserTaskAttributesTemplate">
	  <xsl:call-template name="TaskAttributesTemplate"/> 	
	  <xsl:if test="@implementation"><xsl:attribute name="implementation"> <xsl:value-of select="@implementation" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="UserTaskTemplate">
	  <xsl:call-template name="TaskTemplate"/> 
      <xsl:for-each select="bpmn2:rendering">
        <renderings xmi:type="bpmn2xmi:Rendering">			    
	       <xsl:call-template name="RenderingAttributesTemplate"/> 
           <xsl:call-template name="RenderingTemplate" />			   
        </renderings>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="BPMNDiagramAttributesTemplate">
	  <xsl:call-template name="DiagramAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="BPMNDiagramTemplate">
	  <xsl:call-template name="DiagramTemplate"/> 
      <xsl:for-each select="bpmndi:BPMNPlane">
        <plane xmi:type="bpmndixmi:BPMNPlane">			    
	       <xsl:call-template name="BPMNPlaneAttributesTemplate"/> 
           <xsl:call-template name="BPMNPlaneTemplate" />			   
        </plane>
      </xsl:for-each>
      <xsl:for-each select="bpmndi:BPMNLabelStyle">
        <labelStyle xmi:type="bpmndixmi:BPMNLabelStyle">			    
	       <xsl:call-template name="BPMNLabelStyleAttributesTemplate"/> 
           <xsl:call-template name="BPMNLabelStyleTemplate" />			   
        </labelStyle>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="BPMNEdgeAttributesTemplate">
	  <xsl:call-template name="LabeledEdgeAttributesTemplate"/> 	
	  <xsl:if test="@messageVisibleKind"><xsl:attribute name="messageVisibleKind"> <xsl:value-of select="@messageVisibleKind" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@bpmnElement"><xsl:attribute name="bpmnElement"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@bpmnElement"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@sourceElement"><xsl:attribute name="sourceElement"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@sourceElement"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@targetElement"><xsl:attribute name="targetElement"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@targetElement"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="BPMNEdgeTemplate">
	  <xsl:call-template name="LabeledEdgeTemplate"/> 
      <xsl:for-each select="bpmndi:BPMNLabel">
        <label xmi:type="bpmndixmi:BPMNLabel">			    
	       <xsl:call-template name="BPMNLabelAttributesTemplate"/> 
           <xsl:call-template name="BPMNLabelTemplate" />			   
        </label>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="BPMNLabelAttributesTemplate">
	  <xsl:call-template name="LabelAttributesTemplate"/> 	
      <xsl:if test="@labelStyle"><xsl:attribute name="labelStyle"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@labelStyle"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="BPMNLabelTemplate">
	  <xsl:call-template name="LabelTemplate"/> 
	</xsl:template>
  
	<xsl:template name="BPMNLabelStyleAttributesTemplate">
	  <xsl:call-template name="StyleAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="BPMNLabelStyleTemplate">
	  <xsl:call-template name="StyleTemplate"/> 
      <xsl:for-each select="dc:Font">
        <font xmi:type="dcxmi:Font">			    
	       <xsl:call-template name="FontAttributesTemplate"/> 
           <xsl:call-template name="FontTemplate" />			   
        </font>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="BPMNPlaneAttributesTemplate">
	  <xsl:call-template name="PlaneAttributesTemplate"/> 	
      <xsl:if test="@bpmnElement"><xsl:attribute name="bpmnElement"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@bpmnElement"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="BPMNPlaneTemplate">
	  <xsl:call-template name="PlaneTemplate"/> 
	</xsl:template>
  
	<xsl:template name="BPMNShapeAttributesTemplate">
	  <xsl:call-template name="LabeledShapeAttributesTemplate"/> 	
	  <xsl:if test="@isExpanded"><xsl:attribute name="isExpanded"> <xsl:value-of select="@isExpanded" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@isHorizontal"><xsl:attribute name="isHorizontal"> <xsl:value-of select="@isHorizontal" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@isMarkerVisible"><xsl:attribute name="isMarkerVisible"> <xsl:value-of select="@isMarkerVisible" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@isMessageVisible"><xsl:attribute name="isMessageVisible"> <xsl:value-of select="@isMessageVisible" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@participantBandKind"><xsl:attribute name="participantBandKind"> <xsl:value-of select="@participantBandKind" /> </xsl:attribute></xsl:if>			
      <xsl:if test="@bpmnElement"><xsl:attribute name="bpmnElement"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@bpmnElement"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="@choreographyActivityShape"><xsl:attribute name="choreographyActivityShape"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="@choreographyActivityShape"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="BPMNShapeTemplate">
	  <xsl:call-template name="LabeledShapeTemplate"/> 
      <xsl:for-each select="bpmndi:BPMNLabel">
        <label xmi:type="bpmndixmi:BPMNLabel">			    
	       <xsl:call-template name="BPMNLabelAttributesTemplate"/> 
           <xsl:call-template name="BPMNLabelTemplate" />			   
        </label>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="DiagramAttributesTemplate">
	  <xsl:if test="@documentation"><xsl:attribute name="documentation"> <xsl:value-of select="@documentation" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@id"><xsl:attribute name="id"> <xsl:value-of select="@id" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@resolution"><xsl:attribute name="resolution"> <xsl:value-of select="@resolution" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:ownedStyle"><xsl:attribute name="ownedStyle"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:ownedStyle"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:rootElement"><xsl:attribute name="rootElement"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:rootElement"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="DiagramTemplate">
	</xsl:template>
  
	<xsl:template name="DiagramElementAttributesTemplate">
	  <xsl:if test="@id"><xsl:attribute name="id"> <xsl:value-of select="@id" /> </xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:owningDiagram"><xsl:attribute name="owningDiagram"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:owningDiagram"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:owningElement"><xsl:attribute name="owningElement"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:owningElement"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:ownedElement"><xsl:attribute name="ownedElement"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:ownedElement"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:modelElement"><xsl:attribute name="modelElement"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:modelElement"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:style"><xsl:attribute name="style"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:style"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="DiagramElementTemplate">
	</xsl:template>
  
	<xsl:template name="EdgeAttributesTemplate">
	  <xsl:call-template name="DiagramElementAttributesTemplate"/> 	
      <xsl:if test="bpmn2:source"><xsl:attribute name="source"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:source"/></xsl:call-template></xsl:attribute></xsl:if>			
      <xsl:if test="bpmn2:target"><xsl:attribute name="target"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:target"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="EdgeTemplate">
	  <xsl:call-template name="DiagramElementTemplate"/> 
      <xsl:for-each select="di:waypoint">
        <waypoint xmi:type="dixmi:Point">			    
	       <xsl:call-template name="PointAttributesTemplate"/> 
           <xsl:call-template name="PointTemplate" />			   
        </waypoint>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="LabelAttributesTemplate">
	  <xsl:call-template name="NodeAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="LabelTemplate">
	  <xsl:call-template name="NodeTemplate"/> 
      <xsl:for-each select="dc:Bounds">
        <bounds xmi:type="dcxmi:Bounds">			    
	       <xsl:call-template name="BoundsAttributesTemplate"/> 
           <xsl:call-template name="BoundsTemplate" />			   
        </bounds>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="LabeledEdgeAttributesTemplate">
	  <xsl:call-template name="EdgeAttributesTemplate"/> 	
      <xsl:if test="bpmn2:ownedLabel"><xsl:attribute name="ownedLabel"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:ownedLabel"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="LabeledEdgeTemplate">
	  <xsl:call-template name="EdgeTemplate"/> 
	</xsl:template>
  
	<xsl:template name="LabeledShapeAttributesTemplate">
	  <xsl:call-template name="ShapeAttributesTemplate"/> 	
      <xsl:if test="bpmn2:ownedLabel"><xsl:attribute name="ownedLabel"><xsl:call-template name="concat"><xsl:with-param name="nodeset" select="bpmn2:ownedLabel"/></xsl:call-template></xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="LabeledShapeTemplate">
	  <xsl:call-template name="ShapeTemplate"/> 
	</xsl:template>
  
	<xsl:template name="NodeAttributesTemplate">
	  <xsl:call-template name="DiagramElementAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="NodeTemplate">
	  <xsl:call-template name="DiagramElementTemplate"/> 
	</xsl:template>
  
	<xsl:template name="PlaneAttributesTemplate">
	  <xsl:call-template name="NodeAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="PlaneTemplate">
	  <xsl:call-template name="NodeTemplate"/> 
      <xsl:for-each select="bpmndi:BPMNEdge|bpmndi:BPMNShape">
        <xsl:choose>		 
          <xsl:when test="self::bpmndi:BPMNEdge">
            <planeElement xmi:type="bpmndixmi:BPMNEdge">			    
	          <xsl:call-template name="BPMNEdgeAttributesTemplate"/> 
			  <xsl:call-template name="BPMNEdgeTemplate" />			   
			</planeElement>
          </xsl:when > 
          <xsl:when test="self::bpmndi:BPMNShape">
            <planeElement xmi:type="bpmndixmi:BPMNShape">			    
	          <xsl:call-template name="BPMNShapeAttributesTemplate"/> 
			  <xsl:call-template name="BPMNShapeTemplate" />			   
			</planeElement>
          </xsl:when >
        </xsl:choose>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="ShapeAttributesTemplate">
	  <xsl:call-template name="NodeAttributesTemplate"/> 	
	</xsl:template>

	<xsl:template name="ShapeTemplate">
	  <xsl:call-template name="NodeTemplate"/> 
      <xsl:for-each select="dc:Bounds">
        <bounds xmi:type="dcxmi:Bounds">			    
	       <xsl:call-template name="BoundsAttributesTemplate"/> 
           <xsl:call-template name="BoundsTemplate" />			   
        </bounds>
      </xsl:for-each>
	</xsl:template>
  
	<xsl:template name="StyleAttributesTemplate">
	  <xsl:if test="@id"><xsl:attribute name="id"> <xsl:value-of select="@id" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="StyleTemplate">
	</xsl:template>
  
	<xsl:template name="BoundsAttributesTemplate">
	  <xsl:if test="@height"><xsl:attribute name="height"> <xsl:value-of select="@height" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@width"><xsl:attribute name="width"> <xsl:value-of select="@width" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@x"><xsl:attribute name="x"> <xsl:value-of select="@x" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@y"><xsl:attribute name="y"> <xsl:value-of select="@y" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="BoundsTemplate">
	</xsl:template>
  
	<xsl:template name="FontAttributesTemplate">
	  <xsl:if test="@isBold"><xsl:attribute name="isBold"> <xsl:value-of select="@isBold" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@isItalic"><xsl:attribute name="isItalic"> <xsl:value-of select="@isItalic" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@isStrikeThrough"><xsl:attribute name="isStrikeThrough"> <xsl:value-of select="@isStrikeThrough" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@isUnderline"><xsl:attribute name="isUnderline"> <xsl:value-of select="@isUnderline" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@name"><xsl:attribute name="name"> <xsl:value-of select="@name" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@size"><xsl:attribute name="size"> <xsl:value-of select="@size" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="FontTemplate">
	</xsl:template>
  
	<xsl:template name="PointAttributesTemplate">
	  <xsl:if test="@x"><xsl:attribute name="x"> <xsl:value-of select="@x" /> </xsl:attribute></xsl:if>			
	  <xsl:if test="@y"><xsl:attribute name="y"> <xsl:value-of select="@y" /> </xsl:attribute></xsl:if>			
	</xsl:template>

	<xsl:template name="PointTemplate">
	</xsl:template>
  
</xsl:stylesheet>
