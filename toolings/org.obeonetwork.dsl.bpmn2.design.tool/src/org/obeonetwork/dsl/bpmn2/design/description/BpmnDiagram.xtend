/*******************************************************************************
 * Copyright (c) 2024 IRT-SystemX. All rights reserved.
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.bpmn2.design.description

import org.eclipse.emf.ecore.EObject
import org.eclipse.sirius.diagram.ResizeKind
import org.eclipse.sirius.diagram.description.Layer
import org.eclipse.sirius.diagram.description.NodeMapping
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription
import org.eclipse.sirius.diagram.description.tool.NodeCreationVariable
import org.eclipse.sirius.diagram.description.tool.ToolGroup
import org.eclipse.sirius.diagram.description.tool.ToolSection
import org.eclipse.sirius.properties.AbstractTextDescription
import org.eclipse.sirius.properties.DialogButton
import org.eclipse.sirius.properties.DialogModelOperation
import org.eclipse.sirius.properties.GroupDescription
import org.eclipse.sirius.properties.PageDescription
import org.eclipse.sirius.properties.TextAreaDescription
import org.eclipse.sirius.properties.TextDescription
import org.eclipse.sirius.viewpoint.description.SystemColor
import org.eclipse.sirius.viewpoint.description.UserFixedColor
import org.eclipse.sirius.viewpoint.description.tool.ContainerViewVariable
import org.eclipse.sirius.viewpoint.description.tool.ElementSelectVariable
import org.eclipse.sirius.viewpoint.description.tool.ElementVariable
import org.eclipse.sirius.viewpoint.description.tool.ElementViewVariable
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation
import org.eclipse.sirius.viewpoint.description.tool.OperationAction
import org.eclipse.sirius.viewpoint.description.tool.PopupMenu
import org.eclipse.sirius.viewpoint.description.tool.SelectContainerVariable
import org.eclipse.sirius.viewpoint.description.tool.SelectionWizardDescription
import org.eclipse.sirius.viewpoint.description.tool.ToolDescription
import org.eclipse.sirius.viewpoint.description.tool.Unset
import org.mypsycho.modit.emf.sirius.api.SiriusDiagram
import org.obeonetwork.dsl.bpmn2.BaseElement
import org.obeonetwork.dsl.bpmn2.Event
import org.obeonetwork.dsl.bpmn2.FlowNode

import static extension org.mypsycho.modit.emf.sirius.api.SiriusDesigns.*
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance

/**
 * BpmnDiagram of org.obeonetwork.dsl.bpmn2.design.tool.
 * <p>
 * 
 * </p>
 *
 * @author nperansin
 */
abstract class BpmnDiagram extends SiriusDiagram {

	new(BpmnDesign parent, String dName, String dLabel, Class<? extends EObject> domain) {
		super(parent, dName, dLabel, domain)
	}
	
	protected def setOperation(AbstractTextDescription it, ModelOperation value) {
		initialOperation = value.toTool
	}
	
	def customImage(String iconPart, String... nodes) {
		"workspacePath".attCustomization(
			'''/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/«iconPart».svg''',
			nodes.map[
				WorkspaceImageDescription.localRef(Ns.node, it) [ 
					(it as NodeMapping).style as WorkspaceImageDescription
				]
			]
		)
	}
	
	
	def customizeBpmnNodeStyles(Layer it) {
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CancelEventDefinition)'''.trimAql.thenStyle(
			customImage("start-event/cancel",
				"StartEvent"
			),
			customImage("end-event/cancel",
				"EndEvent"
			),
			customImage("catch-event/cancel",
				"IntermediateCatchEvent"
			),
			customImage("throw-event/cancel",
				"IntermediateThrowEvent"
			),
			customImage("boundary-events/cancel",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/cancel",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CompensateEventDefinition)'''.trimAql.thenStyle(
			customImage("start-event/compensation",
				"StartEvent"
			),
			customImage("end-event/compensation",
				"EndEvent"
			),
			customImage("catch-event/compensation",
				"IntermediateCatchEvent"
			),
			customImage("throw-event/compensation",
				"IntermediateThrowEvent"
			),
			customImage("boundary-events/compensation",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/compensation",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ConditionalEventDefinition)'''.trimAql.thenStyle(
			customImage("start-event/conditional",
				"StartEvent"
			),
			customImage("end-event/conditional",
				"EndEvent"
			),
			customImage("catch-event/conditional",
				"IntermediateCatchEvent"
			),
			customImage("throw-event/conditional",
				"IntermediateThrowEvent"
			),
			customImage("boundary-events/conditional",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/conditional",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ErrorEventDefinition)'''.trimAql.thenStyle(
			customImage("start-event/error",
				"StartEvent"
			),
			customImage("end-event/error",
				"EndEvent"
			),
			customImage("catch-event/error",
				"IntermediateCatchEvent"
			),
			customImage("throw-event/error",
				"IntermediateThrowEvent"
			),
			customImage("boundary-events/error",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/error",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::EscalationEventDefinition)'''.trimAql.thenStyle(
			customImage("start-event/escalation",
				"StartEvent"
			),
			customImage("end-event/escalation",
				"EndEvent"
			),
			customImage("catch-event/escalation",
				"IntermediateCatchEvent"
			),
			customImage("throw-event/escalation",
				"IntermediateThrowEvent"
			),
			customImage("boundary-events/escalation",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/escalation",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::LinkEventDefinition)'''.trimAql.thenStyle(
			customImage("start-event/link",
				"StartEvent"
			),
			customImage("end-event/link",
				"EndEvent"
			),
			customImage("catch-event/link",
				"IntermediateCatchEvent"
			),
			customImage("throw-event/link",
				"IntermediateThrowEvent"
			),
			customImage("boundary-events/link",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/link",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::MessageEventDefinition)'''.trimAql.thenStyle(
			customImage("start-event/message",
				"StartEvent"
			),
			customImage("end-event/message",
				"EndEvent"
			),
			customImage("catch-event/message",
				"IntermediateCatchEvent"
			),
			customImage("throw-event/message",
				"IntermediateThrowEvent"
			),
			customImage("boundary-events/message",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/message",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::SignalEventDefinition)'''.trimAql.thenStyle(
			customImage("start-event/signal",
				"StartEvent"
			),
			customImage("end-event/signal",
				"EndEvent"
			),
			customImage("catch-event/signal",
				"IntermediateCatchEvent"
			),
			customImage("throw-event/signal",
				"IntermediateThrowEvent"
			),
			customImage("boundary-events/signal",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/signal",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TerminateEventDefinition)'''.trimAql.thenStyle(
			customImage("start-event/terminate",
				"StartEvent"
			),
			customImage("end-event/terminate",
				"EndEvent"
			),
			customImage("catch-event/terminate",
				"IntermediateCatchEvent"
			),
			customImage("throw-event/terminate",
				"IntermediateThrowEvent"
			),
			customImage("boundary-events/terminate",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/terminate",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TimerEventDefinition)'''.trimAql.thenStyle(
			customImage("start-event/timer",
				"StartEvent"
			),
			customImage("end-event/timer",
				"EndEvent"
			),
			customImage("catch-event/timer",
				"IntermediateCatchEvent"
			),
			customImage("throw-event/timer",
				"IntermediateThrowEvent"
			),
			customImage("boundary-events/timer",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/timer",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CancelEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/cancel",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/cancel",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CompensateEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/compensation",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/compensation",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ConditionalEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/conditional",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/conditional",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ErrorEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/error",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/error",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::EscalationEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/escalation",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/escalation",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::LinkEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/link",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/link",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::MessageEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/message",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/message",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::SignalEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/signal",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/signal",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TerminateEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/terminate",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/terminate",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TimerEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/timer",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/timer",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and not self.parallelMultiple'''.trimAql.thenStyle(
			customImage("start-event/multiple",
				"StartEvent"
			),
			customImage("end-event/multiple",
				"EndEvent"
			),
			customImage("catch-event/multiple",
				"IntermediateCatchEvent"
			),
			customImage("throw-event/multiple",
				"IntermediateThrowEvent"
			),
			customImage("boundary-events/multiple",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/multiple",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and self.parallelMultiple'''.trimAql.thenStyle(
			customImage("start-event/mi.parallel",
				"StartEvent"
			),
			customImage("catch-event/multiple.parallel",
				"IntermediateCatchEvent"
			),
			customImage("boundary-events/multiple.parallel",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-boundary-events/multiple.parallel",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and not self.parallelMultiple and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/multiple",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/multiple",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and self.parallelMultiple and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/multiple.parallel",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/multiple.parallel",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==0 and not self.cancelActivity'''.trimAql.thenStyle(
			customImage("non-interrupting-boundary-events/none",
				"TaskBorderOnCallActivity_Process",
				"TaskBorderOnCallActivity_Task",
				"TaskBorder"
			),
			customImage("sub-process-non-interrupting-boundary-events/none",
				"TaskBorderOnSubProcess"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and self.oclIsTypeOf(bpmn2::EndEvent)'''.trimAql.thenStyle(
			customImage("end-event/multiple",
				"EndEvent"
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and self.oclIsTypeOf(bpmn2::IntermediateThrowEvent)'''.trimAql.thenStyle(
			customImage("throw-event/multiple",
				"IntermediateThrowEvent"
			)
		)
		styleCustomisations += '''self.instantiate and self.eventGatewayType=bpmn2::EventBasedGatewayType::Parallel'''.trimAql.thenStyle(
			customImage("gateway/parallel-start-event-based-gateway",
				"EventBasedGateway"
			)
		)
		styleCustomisations += '''self.instantiate and self.eventGatewayType=bpmn2::EventBasedGatewayType::Exclusive'''.trimAql.thenStyle(
			customImage("gateway/start-event-based-gateway",
				"EventBasedGateway"
			)
		)
		// Empty customisation ??
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CancelEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/cancel.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CompensateEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/compensation.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ConditionalEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/conditional.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ErrorEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/error.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::EscalationEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/escalation.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::LinkEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/link.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::MessageEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/message.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::SignalEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/signal.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TerminateEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/terminate.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TimerEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/timer.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and not self.parallelMultiple and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/multiple.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and self.parallelMultiple and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/mi.parallel.svg")
		)
		styleCustomisations += '''self.eventDefinitions->size()==0 and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/start.svg")
		)
	}
	
	def createObjectNode(Class<? extends BaseElement> nodeType, String candidates, String svgIcon) {
		NodeMapping.createAs(Ns.node, nodeType.simpleName) [
			domainClass = "bpmn2." + nodeType.simpleName // OLD notation
			semanticCandidatesExpression = candidates
			labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
			style = WorkspaceImageDescription.create [
				showIcon = false
				labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
				resizeKind = ResizeKind.NSEW_LITERAL
				arcWidth = 1
				arcHeight = 1
				workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/" + svgIcon + ".svg"
				borderColor = SystemColor.extraRef("color:black")
				labelColor = UserFixedColor.ref("color:TextBackground")
			]
		]
	}
	
	def createFlowNode(Class<? extends FlowNode> nodeType, String svgIcon) {
		nodeType.createObjectNode(
			'''self.getFlowNodeElements('«nodeType.simpleName»')'''.trimAql, svgIcon
		).andThen[
			style.andThen[
				resizeKind = ResizeKind.NONE_LITERAL
			]
		]
	}
	
	def createEventNode(Class<? extends Event> nodeType, String svgIcon) {
		nodeType.createFlowNode(svgIcon).andThen[
			semanticElements = '''self.eventDefinitions->union(Sequence{self})'''.trimAql
		]
	}
	
		
	def createGatewayNode(Class<? extends FlowNode> nodeType, String nodeLabel, String svgIcon) {
		nodeType.createFlowNode("gateway/" + svgIcon).andThen[
			label = nodeLabel
			style.andThen[
				sizeComputationExpression = "4"
			]
		]
	}

	def createInitDialog(String type) {
		DialogModelOperation.create [
			titleExpression = "service:getPropertiesTitle()"
			buttons += DialogButton.create [
				labelExpression = "service:getCancelLabel()"
				closeDialogOnClick = true
				rollbackChangesOnClose = true
				// no operation 
			]
			buttons += DialogButton.create [
				labelExpression = "OK"
				^default = true
				closeDialogOnClick = true
				// no operation 
			]
			val editGroup = GroupDescription.create(type + "Group") [
				labelExpression = "service:getAttributesLabel()"
				domainClass = "bpmn2::" + type
				semanticCandidateExpression = "var:self"
				controls += TextDescription.create(type + "Name") [
					labelExpression = "service:getNameLabel()"
					helpExpression = "service:getHelpNameLabel()"
					operation = "var:self".toContext(
						"name".setter("var:newValue")
					)
				]
				controls += TextAreaDescription.create(type + "Description") [
					labelExpression = "service:getDescriptionLabel()"
					helpExpression = "service:getHelpDescriptionLabel()"
					initialOperation = InitialOperation.create [
						firstModelOperations = "var:self".toContext(
							"description".setter("var:newValue")
						)
					]
				]
			]
			
			page = PageDescription.create(type + "Page") [
				domainClass = "bpmn2::" + type
				semanticCandidateExpression = "var:self"
				groups += editGroup
			]
			groups += editGroup
		]
	}

	def createFlowElementCreation(String type, String toolName) {
		ToolDescription.createAs(Ns.operation, toolName) [
			label = "%" + type
			precondition = '''element.isApplicableType() and containerView.isNotCollapsed()'''.trimAql
			forceRefresh = true
			iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/" + type + ".png"
			element = ElementVariable.create("element")
			elementView = ElementViewVariable.create("elementView")
			operation = '''element.createFlowElement('«type»')'''.trimAql.toOperation
		]
	
	}


	def createActivitiesTools() {
		ToolSection.create("Activities") [
			label = "%Activities"
			icon = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Task.png"
			ownedTools += ToolDescription.createAs(Ns.operation, "Task") [
				label = "%Task"
				precondition = '''element.isApplicableType() and containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Task.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element.createFlowElement('Task')'''.trimAql.toContext(
					createInitDialog("Task")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Business Rule Task") [
				label = "%BusinessRuleTask"
				precondition = '''element.isApplicableType() and containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/BusinessRuleTask.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element.createFlowElement('BusinessRuleTask')'''.trimAql.toContext(
					createInitDialog("Task")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Manual Task") [
				label = "%ManualTask"
				precondition = '''element.isApplicableType() and containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/ManualTask.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element.createFlowElement('ManualTask')'''.trimAql.toContext(
					createInitDialog("Task")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Receive Task") [
				label = "%ReceiveTask"
				precondition = '''element.isApplicableType() and containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/ReceiveTask.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element.createFlowElement('ReceiveTask')'''.trimAql.toContext(
					createInitDialog("Task")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Script Task") [
				label = "%ScriptTask"
				precondition = '''element.isApplicableType() and containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/ScriptTask.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element.createFlowElement('ScriptTask')'''.trimAql.toContext(
					createInitDialog("Task")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Send Task") [
				label = "%SendTask"
				precondition = '''element.isApplicableType() and containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/SendTask.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element.createFlowElement('SendTask')'''.trimAql.toContext(
					createInitDialog("Task")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Service Task") [
				label = "%ServiceTask"
				precondition = '''element.isApplicableType() and containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/ServiceTask.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element.createFlowElement('ServiceTask')'''.trimAql.toContext(
					createInitDialog("Task")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "User Task") [
				label = "%UserTask"
				precondition = '''element.isApplicableType() and containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/UserTask.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element.createFlowElement('UserTask')'''.trimAql.toContext(
					createInitDialog("Task")
				)
			]
			ownedTools += ToolGroup.create("SubProcessGroup") [
				label = "%SubProcess"
				tools += ToolDescription.createAs(Ns.operation, "Sub Process") [
					label = "%SubProcess"
					precondition = '''element.isApplicableType() and containerView.isNotCollapsed()'''.trimAql
					forceRefresh = true
					iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/SubProcess.png"
					element = ElementVariable.create("element")
					elementView = ElementViewVariable.create("elementView")
					operation = '''element.eContainerOrSelf(bpmn2::FlowElementsContainer)'''.trimAql.toContext(
						"flowElements".creator("bpmn2.SubProcess").chain(
							"name".setter("New Sub Process"),
							'''element.oclIsKindOf(bpmn2::Lane)'''.trimAql.ifThenDo(
								"lanes".setter('''element'''.trimAql)
							),
							createInitDialog("Process")
						)
					)
				]
				tools += ToolDescription.createAs(Ns.operation, "Ad Hoc Sub Process") [
					label = "%AdHocSubProcess"
					precondition = '''element.isApplicableType() and containerView.isNotCollapsed()'''.trimAql
					forceRefresh = true
					iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/AdHocSubProcess.png"
					element = ElementVariable.create("element")
					elementView = ElementViewVariable.create("elementView")
					operation = '''element.eContainerOrSelf(bpmn2::FlowElementsContainer)'''.trimAql.toContext(
						"flowElements".creator("bpmn2.AdHocSubProcess").chain(
							"name".setter("New Ad-Hoc Sub Process"),
							'''element.oclIsKindOf(bpmn2::Lane)'''.trimAql.ifThenDo(
								"lanes".setter('''element'''.trimAql)
							),
							createInitDialog("Process")
						)
					)
				]
			]
			ownedTools += ToolGroup.create("CallActivity") [
				label = "%CallActivity"
				tools += SelectionWizardDescription.createAs(Ns.operation, "Call Activity") [
					label = "%CallActivity"
					precondition = '''(container.oclIsKindOf(bpmn2::Lane) or container.oclIsKindOf(bpmn2::SubProcess)) and containerView.isNotCollapsed()'''.trimAql
					forceRefresh = true
					candidatesExpression = ''' if self.eContainer(bpmn2::Definitions) <> null then self.eContainer(bpmn2::Definitions).eAllContents(bpmn2::CallableElement) else self.eResource().eAllContents(bpmn2::CallableElement) endif'''.trimAql
					rootExpression = ''' if self.eContainer(bpmn2::Definitions) <> null then self.eContainer(bpmn2::Definitions) else self.eResource() endif'''.trimAql
					childrenExpression = '''self.eAllContents(bpmn2::CallableElement)'''.trimAql
					message = "Select a Callable Element"
					iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/CallActivity.png"
					element = ElementSelectVariable.create("element")
					containerView = ContainerViewVariable.create("containerView")
					container = SelectContainerVariable.create("container")
					operation = '''container.eContainerOrSelf(bpmn2::FlowElementsContainer)'''.trimAql.toContext(
						"flowElements".creator("bpmn2.CallActivity").chain(
							"calledElementRef".setter('''element'''.trimAql),
							'''container.oclIsKindOf(bpmn2::Lane)'''.trimAql.ifThenDo(
								"lanes".setter('''container'''.trimAql)
							)
						)
					)
				]
				tools += ToolDescription.createAs(Ns.operation, "CallActivityNewProcess") [
					label = "%CallActivityNewProcess"
					precondition = '''containerView.isNotCollapsed()'''.trimAql
					iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Process.png"
					element = ElementVariable.create("element")
					elementView = ElementViewVariable.create("elementView")
					operation = '''element.eContainerOrSelf(bpmn2::FlowElementsContainer)'''.trimAql.toContext(
						"flowElements".creator("bpmn2.CallActivity").andThen[ variableName = "callActivity" ].chain(
							'''element.oclIsKindOf(bpmn2::Lane)'''.trimAql.ifThenDo(
								"lanes".setter('''element'''.trimAql)
							)
						),
						''' if callActivity.eContainer(bpmn2::Definitions) <> null then callActivity.eContainer(bpmn2::Definitions) else callActivity.eContainerOrSelf(basemm::Folder) endif'''.trimAql.toContext(
							'''self.oclIsKindOf(basemm::Folder)'''.trimAql.ifThenDo(
								"elements".creator("bpmn2::Process").andThen[ variableName = "newProcess" ].chain(
									createInitDialog("Process"),
									'''callActivity'''.trimAql.toContext(
										"calledElementRef".setter('''newProcess'''.trimAql).chain(
											'''newProcess'''.trimAql.toContext(
												"laneSets".creator("bpmn2::LaneSet").chain(
													"lanes".creator("Lane")
												)
											)
										)
									)
								)
							),
							'''self.oclIsKindOf(bpmn2::Definitions)'''.trimAql.ifThenDo(
								"rootElements".creator("bpmn2::Process").andThen[ variableName = "newProcess" ].chain(
									createInitDialog("Process"),
									'''callActivity'''.trimAql.toContext(
										"calledElementRef".setter('''newProcess'''.trimAql).chain(
											'''newProcess'''.trimAql.toContext(
												"laneSets".creator("bpmn2::LaneSet").chain(
													"lanes".creator("Lane")
												)
											)
										)
									)
								)
							)
						)
					)
				]
			]
			ownedTools += ToolGroup.create("") [
				tools += ToolDescription.createAs(Ns.operation, "LoopMarker") [
					label = "%LoopMarker"
					precondition = '''container.oclIsKindOf(bpmn2::Activity)'''.trimAql
					forceRefresh = true
					iconPath = "/org.obeonetwork.dsl.bpmn2.design/icons/activity/list/looptype.standard.png"
					element = ElementVariable.create("element")
					elementView = ElementViewVariable.create("elementView")
					operation = '''element'''.trimAql.toContext(
						Unset.create [
							featureName = "loopCharacteristics"
							elementExpression = '''self.loopCharacteristics'''.trimAql
						],
						"loopCharacteristics".creator("bpmn2.StandardLoopCharacteristics")
					)
				]
				tools += ToolDescription.createAs(Ns.operation, "ToggleCompensationMarker") [
					label = "%ToggleCompensationMarker"
					precondition = '''container.oclIsKindOf(bpmn2::Activity)'''.trimAql
					forceRefresh = true
					iconPath = "/org.obeonetwork.dsl.bpmn2.design/icons/activity/list/event.compensation.png"
					element = ElementVariable.create("element")
					elementView = ElementViewVariable.create("elementView")
					operation = '''element'''.trimAql.toContext(
						"isForCompensation".setter('''not self.isForCompensation'''.trimAql)
					)
				]
				tools += ToolDescription.createAs(Ns.operation, "ParallelMutliInstanceMarker") [
					label = "%ParallelMutliInstanceMarker"
					precondition = '''container.oclIsKindOf(bpmn2::Activity)'''.trimAql
					forceRefresh = true
					iconPath = "/org.obeonetwork.dsl.bpmn2.design/icons/activity/list/mi.parallel.png"
					element = ElementVariable.create("element")
					elementView = ElementViewVariable.create("elementView")
					operation = '''element'''.trimAql.toContext(
						Unset.create [
							featureName = "loopCharacteristics"
							elementExpression = '''self.loopCharacteristics'''.trimAql
						],
						"loopCharacteristics".creator("bpmn2.MultiInstanceLoopCharacteristics").chain(
							"isSequential".setter('''false'''.trimAql)
						)
					)
				]
				tools += ToolDescription.createAs(Ns.operation, "SequentialMutliInstanceMarker") [
					label = "%SequentialMutliInstanceMarker"
					precondition = '''container.oclIsKindOf(bpmn2::Activity)'''.trimAql
					forceRefresh = true
					iconPath = "/org.obeonetwork.dsl.bpmn2.design/icons/activity/list/mi.sequential.png"
					element = ElementVariable.create("element")
					elementView = ElementViewVariable.create("elementView")
					operation = '''element'''.trimAql.toContext(
						Unset.create [
							featureName = "loopCharacteristics"
							elementExpression = '''self.loopCharacteristics'''.trimAql
						],
						"loopCharacteristics".creator("bpmn2.MultiInstanceLoopCharacteristics").chain(
							"isSequential".setter('''true'''.trimAql)
						)
					)
				]
				tools += ToolDescription.createAs(Ns.operation, "RemoveMutliInstanceMarker") [
					label = "%RemoveMutliInstanceMarker"
					precondition = '''container.oclIsKindOf(bpmn2::Activity)'''.trimAql
					forceRefresh = true
					iconPath = "/org.obeonetwork.dsl.bpmn2.design/icons/remove.png"
					element = ElementVariable.create("element")
					elementView = ElementViewVariable.create("elementView")
					operation = '''element'''.trimAql.toContext(
						Unset.create [
							featureName = "loopCharacteristics"
							elementExpression = '''self.loopCharacteristics'''.trimAql
						]
					)
				]
			]
		
			ownedTools += createConvertTool("Task")
		]
	}


	def createGatewaysTools() {
		ToolSection.create("Gateways") [
			label = "%Gateways"
			icon = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/ParallelGateway.png"
			ownedTools += "ParallelGateway".createFlowElementCreation("Parallel Gateway")
			ownedTools += "ExclusiveGateway".createFlowElementCreation("Exclusive Gateway")
			ownedTools += "InclusiveGateway".createFlowElementCreation("Inclusive Gateway")
			ownedTools += "ComplexGateway".createFlowElementCreation("Complex Gateway")
			ownedTools += "EventBasedGateway".createFlowElementCreation("Event Based Gateway")
			ownedTools += createConvertTool("Gateway")
		]
	}


	def getLocalNodeMapping(String id) {
		NodeMapping.localRef(Ns.node, id)
	}

	def createDataTools() {
		ToolSection.create("Data") [
			label = "%Data"
			icon = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/DataObject.png"
			ownedTools += NodeCreationDescription.createAs(Ns.creation, "Data Object") [
				label = "%DataObject"
				precondition = '''containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				nodeMappings += getLocalNodeMapping("DataObject")
				variable = NodeCreationVariable.create("container")
				viewVariable = ContainerViewVariable.create("containerView")
				operation = '''container'''.trimAql.toContext(
					"extensionValues".creator("bpmn2.ExtensionAttributeValue"),
					'''instance'''.trimAql.toContext(
						"value".creator("bpmn2.DataObject")
					)
				)
			]
			
			val dataCreationFactory = [ String dir |
				NodeCreationDescription.createAs(Ns.creation, "Data " + dir) [
					label = "%Data" + dir
					precondition = '''containerView.isNotCollapsed()'''.trimAql
					forceRefresh = true
					nodeMappings += getLocalNodeMapping("Data" + dir)
					variable = NodeCreationVariable.create("container")
					viewVariable = ContainerViewVariable.create("containerView")
					
					val containerCase = [ String type, String field, (CreateInstance)=>void init |
						'''container.oclIsTypeOf(bpmn2::«type»)'''.trimAql.ifThenDo(
							'''container.«field»->isEmpty()'''.trimAql.ifThenDo(
								field.creator("bpmn2.InputOutputSpecification") => [
									init?.apply(it)
								]
							),
							'''container.«field»'''.trimAql.toContext(
								'''data«dir»s'''.toString.creator("bpmn2.Data" + dir)
							)
						)
					]
					
					operation = '''container'''.trimAql.toContext(
						containerCase.apply("Lane", "partitionElement") [
							it.chain( "lanes".setter('''container'''.trimAql) )
						],
						containerCase.apply("SubProcess", "ioSpecification") []
					)
				]
			]
			
			ownedTools += dataCreationFactory.apply("Input")
			ownedTools += dataCreationFactory.apply("Output")
			
			ownedTools += NodeCreationDescription.createAs(Ns.creation, "Data Store") [
				label = "%DataStore"
				precondition = '''containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				nodeMappings += getLocalNodeMapping("DataStore")
				variable = NodeCreationVariable.create("container")
				viewVariable = ContainerViewVariable.create("containerView")
				operation = '''container'''.trimAql.toContext(
					"extensionValues".creator("bpmn2.ExtensionAttributeValue"),
					'''instance'''.trimAql.toContext(
						"value".creator("bpmn2.DataStore")
					)
				)
			]
		]
	}
	
	def getEventCreationMappings() {
		#[
			NodeMapping.localRef(Ns.node, "TaskBorder"),
			NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess"),
			NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process"),
			NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
		]
	}
	def createEventsTools() {
		ToolSection.create("Events") [
			label = "%Events"
			icon = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/StartEvent.png"
			ownedTools += "StartEvent".createFlowElementCreation("Start")
			ownedTools += "EndEvent".createFlowElementCreation("End")
			ownedTools += "IntermediateCatchEvent".createFlowElementCreation("Intermediate Catch")
			ownedTools += "IntermediateThrowEvent".createFlowElementCreation("Intermediate Throw")
			ownedTools += NodeCreationDescription.createAs(Ns.creation, "BoundaryEventCreation") [
				label = "%Boundary"
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/BoundaryEvent.png"
				nodeMappings += eventCreationMappings
				variable = NodeCreationVariable.create("container")
				viewVariable = ContainerViewVariable.create("containerView")
				operation = '''container.eContainer()'''.trimAql.toContext(
					"flowElements".creator("bpmn2.BoundaryEvent").chain(
						'''instance'''.trimAql.toContext(
							"attachedToRef".setter('''container'''.trimAql),
							"lanes".setter('''container.lanes'''.trimAql)
						)
					)
				)
			]
		]
	}


	def createConvertOperation(String target, String conversion, String operationIcon) {
		OperationAction.createAs(Ns.operation, '''Convert«conversion»To«target»_ContextAction''') [
			label = "%" + target
			forceRefresh = true
			icon = operationIcon ?: "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/" + target + ".png"
			// Deal with same type ?? when not precondition, operation is hidden.
			// precondition = '''self.trace() <> null'''.trimAql 
			// if false, 
			//   self is 1 of selection, 
			//   views is available
			view = ContainerViewVariable.create("views")
			operation = '''views'''.trimAql.forDo("view", 
				'''view.convertToSpecific«conversion»(bpmn2::«target»)'''.trimAql.toOperation
			)
		]
	}

	def createConvertTaskMenu() {
		PopupMenu.createAs(Ns.menu, "ConvertTask_Popup") [
			label = "%ConvertTaskTo"
			precondition = '''self.oclIsKindOf(bpmn2::Task)'''.trimAql
			forceRefresh = true
			menuItemDescription += "Task".createConvertOperation("Task", null)
			menuItemDescription += "BusinessRuleTask".createConvertOperation("Task", null)
			menuItemDescription += "ManualTask".createConvertOperation("Task", null)
			menuItemDescription += "ReceiveTask".createConvertOperation("Task", "/org.obeonetwork.dsl.bpmn2.design/icons/obj16/receiveTask.png")
			menuItemDescription += "ScriptTask".createConvertOperation("Task", "/org.obeonetwork.dsl.bpmn2.design/icons/obj16/scriptTask.png")
			menuItemDescription += "SendTask".createConvertOperation("Task", null)
			menuItemDescription += "ServiceTask".createConvertOperation("Task", null)
			menuItemDescription += "UserTask".createConvertOperation("Task", null)
		]
	}

	def createConvertGatewayMenu() {
		PopupMenu.createAs(Ns.menu, "ConvertGateway_Popup") [
			label = "%ConvertGatewayTo"
			precondition = '''self.oclIsKindOf(bpmn2::Gateway)'''.trimAql
			forceRefresh = true
			
			menuItemDescription += "ParallelGateway".createConvertOperation("Gateway", null)
			menuItemDescription += "ExclusiveGateway".createConvertOperation("Gateway", null)
			menuItemDescription += "InclusiveGateway".createConvertOperation("Gateway", null)			
			menuItemDescription += "ComplexGateway".createConvertOperation("Gateway", null)
			menuItemDescription += "EventBasedGateway".createConvertOperation("Gateway", null)
		]
	}

	def createConvertMenus() {
		#[
			createConvertTaskMenu,
			createConvertGatewayMenu
		]
	}

	def createConvertTool(String type) {
		ToolDescription.createAs(Ns.operation, type + "ConvertTool") [
			label = '''%Convert«type»To'''
			// icon = TODO
			precondition = '''self.oclIsKindOf(bpmn2::«type»)'''.trimAql
			element = ElementVariable.create("element")
			elementView = ElementViewVariable.create("elementView")
			operation = '''self.convertToChoosable«type»(elementView)'''.trimAql.toOperation
		]
	}

}
