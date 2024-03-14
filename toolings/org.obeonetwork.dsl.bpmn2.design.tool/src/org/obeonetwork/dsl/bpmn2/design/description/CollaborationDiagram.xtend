package org.obeonetwork.dsl.bpmn2.design.description

import org.eclipse.sirius.diagram.BackgroundStyle
import org.eclipse.sirius.diagram.ContainerLayout
import org.eclipse.sirius.diagram.EdgeArrows
import org.eclipse.sirius.diagram.EdgeRouting
import org.eclipse.sirius.diagram.LabelPosition
import org.eclipse.sirius.diagram.LineStyle
import org.eclipse.sirius.diagram.ResizeKind
import org.eclipse.sirius.diagram.description.AdditionalLayer
import org.eclipse.sirius.diagram.description.CompositeLayout
import org.eclipse.sirius.diagram.description.ContainerMapping
import org.eclipse.sirius.diagram.description.DiagramDescription
import org.eclipse.sirius.diagram.description.EdgeMapping
import org.eclipse.sirius.diagram.description.Layer
import org.eclipse.sirius.diagram.description.LayoutDirection
import org.eclipse.sirius.diagram.description.MappingBasedDecoration
import org.eclipse.sirius.diagram.description.NodeMapping
import org.eclipse.sirius.diagram.description.style.BeginLabelStyleDescription
import org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription
import org.eclipse.sirius.diagram.description.style.SquareDescription
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription
import org.eclipse.sirius.diagram.description.tool.ContainerDropDescription
import org.eclipse.sirius.diagram.description.tool.DeleteElementDescription
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel
import org.eclipse.sirius.diagram.description.tool.DoubleClickDescription
import org.eclipse.sirius.diagram.description.tool.EdgeCreationDescription
import org.eclipse.sirius.diagram.description.tool.ElementDoubleClickVariable
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription
import org.eclipse.sirius.diagram.description.tool.NodeCreationVariable
import org.eclipse.sirius.diagram.description.tool.ReconnectEdgeDescription
import org.eclipse.sirius.diagram.description.tool.ReconnectionKind
import org.eclipse.sirius.diagram.description.tool.SourceEdgeCreationVariable
import org.eclipse.sirius.diagram.description.tool.SourceEdgeViewCreationVariable
import org.eclipse.sirius.diagram.description.tool.TargetEdgeCreationVariable
import org.eclipse.sirius.diagram.description.tool.TargetEdgeViewCreationVariable
import org.eclipse.sirius.diagram.description.tool.ToolGroup
import org.eclipse.sirius.diagram.description.tool.ToolSection
import org.eclipse.sirius.viewpoint.FontFormat
import org.eclipse.sirius.viewpoint.LabelAlignment
import org.eclipse.sirius.viewpoint.description.DecorationDescriptionsSet
import org.eclipse.sirius.viewpoint.description.Position
import org.eclipse.sirius.viewpoint.description.SystemColor
import org.eclipse.sirius.viewpoint.description.UserFixedColor
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription
import org.eclipse.sirius.viewpoint.description.tool.ContainerViewVariable
import org.eclipse.sirius.viewpoint.description.tool.DropContainerVariable
import org.eclipse.sirius.viewpoint.description.tool.ElementDeleteVariable
import org.eclipse.sirius.viewpoint.description.tool.ElementDropVariable
import org.eclipse.sirius.viewpoint.description.tool.ElementSelectVariable
import org.eclipse.sirius.viewpoint.description.tool.ElementVariable
import org.eclipse.sirius.viewpoint.description.tool.ElementViewVariable
import org.eclipse.sirius.viewpoint.description.tool.OperationAction
import org.eclipse.sirius.viewpoint.description.tool.PasteDescription
import org.eclipse.sirius.viewpoint.description.tool.PopupMenu
import org.eclipse.sirius.viewpoint.description.tool.SelectContainerVariable
import org.eclipse.sirius.viewpoint.description.tool.SelectionWizardDescription
import org.eclipse.sirius.viewpoint.description.tool.ToolDescription
import org.eclipse.sirius.viewpoint.description.tool.Unset
import org.obeonetwork.dsl.bpmn2.Collaboration
import org.obeonetwork.dsl.bpmn2.ComplexGateway
import org.obeonetwork.dsl.bpmn2.DataInput
import org.obeonetwork.dsl.bpmn2.DataObject
import org.obeonetwork.dsl.bpmn2.DataOutput
import org.obeonetwork.dsl.bpmn2.DataStore
import org.obeonetwork.dsl.bpmn2.EndEvent
import org.obeonetwork.dsl.bpmn2.EventBasedGateway
import org.obeonetwork.dsl.bpmn2.ExclusiveGateway
import org.obeonetwork.dsl.bpmn2.InclusiveGateway
import org.obeonetwork.dsl.bpmn2.IntermediateCatchEvent
import org.obeonetwork.dsl.bpmn2.IntermediateThrowEvent
import org.obeonetwork.dsl.bpmn2.ParallelGateway
import org.obeonetwork.dsl.bpmn2.StartEvent

import static extension org.mypsycho.modit.emf.sirius.api.SiriusDesigns.*

class CollaborationDiagram extends BpmnDiagram {

	new(BpmnDesign parent) {
		super(parent, "CollaborationDiagram", "Collaboration Diagram", Collaboration)
	}

	override initContent(DiagramDescription it) {
		super.initContent(it)
		titleExpression = '''self.name'''.trimAql
		enablePopupBars = true
		pasteDescriptions += PasteDescription.localRef(Ns.operation, "Paste")
		layout = CompositeLayout.create [
			direction = LayoutDirection.LEFT_TO_RIGHT
		]
		additionalLayers += createProcessLayer
	}

	override initDefaultStyle(BasicLabelStyleDescription it) {/* No reverse for Default */}
	override initDefaultEdgeStyle(EdgeStyleDescription it) {/* No reverse for Default */}

	override initContent(Layer it) {
		containerMappings += ContainerMapping.createAs(Ns.node, "Participant") [
			semanticCandidatesExpression = '''self.participants'''.trimAql
			semanticElements = '''self.processRef'''.trimAql
			domainClass = "bpmn2.Participant"
			childrenPresentation = ContainerLayout.VERTICAL_STACK
			pasteDescriptions += PasteDescription.localRef(Ns.operation, "Paste")
			deletionDescription = DeleteElementDescription.localRef(Ns.del, "DeleteParticipant")
			labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
			style = FlatContainerStyleDescription.create [
				arcWidth = 0
				arcHeight = 0
				borderSizeComputationExpression = "1"
				labelSize = 12
				labelFormat += FontFormat.BOLD_LITERAL
				showIcon = false
				labelExpression = '''self.name'''.trimAql
				borderColor = UserFixedColor.ref("color:TextBackground")
				labelColor = UserFixedColor.ref("color:TextBackground")
				backgroundColor = UserFixedColor.ref("color:Yellow")
				foregroundColor = UserFixedColor.ref("color:Yellow")
			]
			subContainerMappings += ContainerMapping.createAs(Ns.node, "Lane") [
				label = "Lane"
				semanticCandidatesExpression = '''self.processRef.laneSets->first().lanes'''.trimAql
				domainClass = "bpmn2.Lane"
				pasteDescriptions += PasteDescription.ref(ProcessDiagram, Ns.operation, "Paste")
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				dropDescriptions += ContainerDropDescription.localRef(Ns.drop, "MoveExtensionValueToLane")
				dropDescriptions += ContainerDropDescription.localRef(Ns.drop, "MoveFlowElementToLane")
				reusedContainerMappings += ContainerMapping.localRef(Ns.node, "Lane")
				style = FlatContainerStyleDescription.create [
					arcWidth = 0
					arcHeight = 0
					borderSizeComputationExpression = "3"
					labelSize = 12
					labelFormat += FontFormat.BOLD_LITERAL
					showIcon = false
					labelExpression = '''self.name'''.trimAql
					labelAlignment = LabelAlignment.LEFT
					borderColor = UserFixedColor.ref("color:TextBackground")
					labelColor = UserFixedColor.ref("color:TextBackground")
					backgroundColor = UserFixedColor.ref("color:LightYellow")
					foregroundColor = UserFixedColor.ref("color:LightYellow")
				]
				subNodeMappings += NodeMapping.createAs(Ns.node, "ExternalLabel") [
					semanticCandidatesExpression = '''containerView.getElementsWithExternalLabel()'''.trimAql
					semanticElements = '''self.eventDefinitions->union(Sequence{self})'''.trimAql
					domainClass = "bpmn2.BaseElement"
					labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
					style = SquareDescription.create [
						borderSizeComputationExpression = "2"
						showIcon = false
						labelExpression = '''self.getExternalLabel()'''.trimAql
						sizeComputationExpression = '''self.getExternalLabelSize()'''.trimAql
						labelPosition = LabelPosition.NODE_LITERAL
						resizeKind = ResizeKind.NSEW_LITERAL
						borderColor = UserFixedColor.ref("color:LightYellow")
						labelColor = UserFixedColor.ref("color:TextBackground")
						color = UserFixedColor.ref("color:LightYellow")
					]
				]
				subNodeMappings += createEventNode(StartEvent, "start-event/start")
				subNodeMappings += createEventNode(EndEvent, "end-event/end")
				subNodeMappings += createEventNode(IntermediateCatchEvent, "catch-event/none")
				subNodeMappings += createEventNode(IntermediateThrowEvent, "throw-event/none")
				subNodeMappings += createGatewayNode(ParallelGateway, "Parallel Gateway", "parallel-gateway")
				subNodeMappings += createGatewayNode(InclusiveGateway, "Inclusive Gateway", "inclusive-gateway")
				subNodeMappings += createGatewayNode(ExclusiveGateway, "Exclusive Gateway", "exclusive-gateway")
				subNodeMappings += createGatewayNode(ComplexGateway, "Complex Gateway", "complex-gateway")
				subNodeMappings += createGatewayNode(EventBasedGateway, "EventBased Gateway", "event-based-gateway")
				subNodeMappings += NodeMapping.createAs(Ns.node, "TextAnnotation") [
					semanticCandidatesExpression = '''self.extensionValues.value->filter(bpmn2::TextAnnotation)'''.trimAql
					domainClass = "bpmn2.TextAnnotation"
					labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "TextAnnotationDirectEdit")
					style = SquareDescription.create [
						labelExpression = "feature:text"
						labelAlignment = LabelAlignment.LEFT
						labelPosition = LabelPosition.NODE_LITERAL
						resizeKind = ResizeKind.NSEW_LITERAL
						borderColor = UserFixedColor.ref("color:TextBackground")
						labelColor = UserFixedColor.ref("color:TextBackground")
						color = UserFixedColor.ref("color:LightYellow")
					]
				]
				subNodeMappings += DataObject.createObjectNode('''self.extensionValues.value->filter(bpmn2::DataObject)'''.trimAql, "data/data-object")
					.andThen[ name = "DataObject " ] // Typo on name
				subNodeMappings += DataStore.createObjectNode('''self.extensionValues.value->filter(bpmn2::DataStore)'''.trimAql, "data/data-store")
				subNodeMappings += DataInput.createObjectNode('''self.getDataInputs()'''.trimAql, "data/data-input")
				subNodeMappings += DataOutput.createObjectNode('''self.getDataOutputs()'''.trimAql, "data/data-output")

				subContainerMappings += ContainerMapping.createAs(Ns.node, "Task") [
					semanticCandidatesExpression = '''self.getFlowNodeElements('Task')'''.trimAql
					domainClass = "bpmn2.Task"
					pasteDescriptions += PasteDescription.ref(ProcessDiagram, Ns.operation, "Paste")
					labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
					style = FlatContainerStyleDescription.create [
						arcWidth = 20
						arcHeight = 20
						borderSizeComputationExpression = "1"
						labelSize = 9
						labelFormat += FontFormat.BOLD_LITERAL
						showIcon = false
						labelExpression = '''self.getLabel(not view.ownedBorderedNodes->isEmpty())'''.trimAql
						roundedCorner = true
						borderColor = UserFixedColor.ref("color:TextBackground")
						labelColor = UserFixedColor.ref("color:TextBackground")
						backgroundColor = UserFixedColor.ref("color:Yellow")
						foregroundColor = UserFixedColor.ref("color:Yellow")
					]
					borderedNodeMappings += NodeMapping.createAs(Ns.node, "TaskBorder") [
						semanticCandidatesExpression = '''self.boundaryEventRefs'''.trimAql
						semanticElements = '''self.eventDefinitions'''.trimAql
						domainClass = "bpmn2.BoundaryEvent"
						labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
						style = WorkspaceImageDescription.create [
							showIcon = false
							labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
							arcWidth = 1
							arcHeight = 1
							workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/none.svg"
							borderColor = SystemColor.extraRef("color:black")
							labelColor = UserFixedColor.ref("color:TextBackground")
						]
					]
				]
				subContainerMappings += ContainerMapping.createAs(Ns.node, "CallActivity_Process") [
					preconditionExpression = '''self.calledElementRef.oclIsTypeOf(bpmn2::Process)'''.trimAql
					semanticCandidatesExpression = '''self.getFlowNodeElements('CallActivity')'''.trimAql
					semanticElements = '''Sequence{self,self.calledElementRef})'''.trimAql
					domainClass = "bpmn2.CallActivity"
					deletionDescription = DeleteElementDescription.ref(ProcessDiagram, Ns.del, "DeleteCallActivity")
					labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
					style = FlatContainerStyleDescription.create [
						arcWidth = 20
						arcHeight = 20
						borderSizeComputationExpression = "3"
						labelSize = 9
						labelFormat += FontFormat.BOLD_LITERAL
						showIcon = false
						labelExpression = '''self.getCallActivityLabel()'''.trimAql
						roundedCorner = true
						borderColor = UserFixedColor.ref("color:TextBackground")
						labelColor = UserFixedColor.ref("color:TextBackground")
						backgroundColor = UserFixedColor.ref("color:Yellow")
						foregroundColor = UserFixedColor.ref("color:Yellow")
					]
					borderedNodeMappings += NodeMapping.createAs(Ns.node, "TaskBorderOnCallActivity_Process") [
						semanticCandidatesExpression = '''self.boundaryEventRefs'''.trimAql
						semanticElements = '''self.eventDefinitions->union(Sequence{self})'''.trimAql
						domainClass = "bpmn2.BoundaryEvent"
						labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
						style = WorkspaceImageDescription.create [
							showIcon = false
							labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
							arcWidth = 1
							arcHeight = 1
							workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/none.svg"
							borderColor = SystemColor.extraRef("color:black")
							labelColor = UserFixedColor.ref("color:TextBackground")
						]
					]
				]
				subContainerMappings += ContainerMapping.createAs(Ns.node, "CallActivity_Task") [
					preconditionExpression = '''self.calledElementRef.oclIsKindOf(bpmn2::GlobalTask)'''.trimAql
					semanticCandidatesExpression = '''self.getFlowNodeElements('CallActivity')'''.trimAql
					semanticElements = '''Sequence{self,self.calledElementRef})'''.trimAql
					domainClass = "bpmn2.CallActivity"
					deletionDescription = DeleteElementDescription.ref(ProcessDiagram, Ns.del, "DeleteCallActivity")
					labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
					style = FlatContainerStyleDescription.create [
						arcWidth = 20
						arcHeight = 20
						borderSizeComputationExpression = "3"
						labelSize = 9
						labelFormat += FontFormat.BOLD_LITERAL
						showIcon = false
						labelExpression = '''self.getCallActivityLabel()'''.trimAql
						roundedCorner = true
						borderColor = UserFixedColor.ref("color:TextBackground")
						labelColor = UserFixedColor.ref("color:TextBackground")
						backgroundColor = UserFixedColor.ref("color:Yellow")
						foregroundColor = UserFixedColor.ref("color:Yellow")
					]
					borderedNodeMappings += NodeMapping.createAs(Ns.node, "TaskBorderOnCallActivity_Task") [
						semanticCandidatesExpression = '''self.boundaryEventRefs'''.trimAql
						semanticElements = '''self.eventDefinitions->union(Sequence{self})'''.trimAql
						domainClass = "bpmn2.BoundaryEvent"
						labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
						style = WorkspaceImageDescription.create [
							showIcon = false
							labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
							arcWidth = 1
							arcHeight = 1
							workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/none.svg"
							borderColor = SystemColor.extraRef("color:black")
							labelColor = UserFixedColor.ref("color:TextBackground")
						]
					]
				]
				subContainerMappings += ContainerMapping.createAs(Ns.node, "SubProcess") [
					semanticCandidatesExpression = '''self.getFlowNodeElements('SubProcess')'''.trimAql
					domainClass = "bpmn2.SubProcess"
					pasteDescriptions += PasteDescription.ref(ProcessDiagram, Ns.operation, "Paste")
					deletionDescription = DeleteElementDescription.localRef(Ns.del, "DeleteSubProcess")
					labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
					dropDescriptions += ContainerDropDescription.localRef(Ns.drop, "MoveFlowElementFromLaneToSubProcess")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "StartEvent")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "ComplexGateway")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "EndEvent")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "EventBasedGateway")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "ExclusiveGateway")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "InclusiveGateway")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "IntermediateCatchEvent")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "IntermediateThrowEvent")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "ParallelGateway")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "ExternalLabel")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "DataInput")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "DataObject")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "DataOutput")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "DataStore")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "TextAnnotation")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
					reusedNodeMappings += NodeMapping.localRef(Ns.node, "TaskBorder")
					reusedContainerMappings += ContainerMapping.localRef(Ns.node, "Task")
					reusedContainerMappings += ContainerMapping.localRef(Ns.node, "SubProcess")
					reusedContainerMappings += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
					reusedContainerMappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
					style = FlatContainerStyleDescription.create [
						arcWidth = 20
						arcHeight = 20
						borderSizeComputationExpression = "3"
						labelSize = 9
						labelFormat += FontFormat.BOLD_LITERAL
						showIcon = false
						roundedCorner = true
						borderColor = UserFixedColor.ref("color:DarkYellow")
						labelColor = UserFixedColor.ref("color:TextBackground")
						backgroundColor = UserFixedColor.ref("color:LightYellow")
						foregroundColor = UserFixedColor.ref("color:LightYellow")
					]
					styleIf(FlatContainerStyleDescription, '''self.triggeredByEvent'''.trimAql) [
						arcWidth = 20
						arcHeight = 20
						borderSizeComputationExpression = "3"
						borderLineStyle = LineStyle.DASH_LITERAL
						labelSize = 9
						labelFormat += FontFormat.BOLD_LITERAL
						showIcon = false
						roundedCorner = true
						borderColor = UserFixedColor.ref("color:DarkYellow")
						labelColor = UserFixedColor.ref("color:TextBackground")
						backgroundColor = UserFixedColor.ref("color:LightYellow")
						foregroundColor = UserFixedColor.ref("color:LightYellow")
					]
					borderedNodeMappings += NodeMapping.createAs(Ns.node, "TaskBorderOnSubProcess") [
						semanticCandidatesExpression = '''self.boundaryEventRefs'''.trimAql
						semanticElements = '''self.eventDefinitions->union(Sequence{self})'''.trimAql
						domainClass = "bpmn2.BoundaryEvent"
						labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
						style = WorkspaceImageDescription.create [
							showIcon = false
							labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
							arcWidth = 1
							arcHeight = 1
							workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/none.svg"
							borderColor = SystemColor.extraRef("color:black")
							labelColor = UserFixedColor.ref("color:TextBackground")
						]
					]
				]
				subContainerMappings += ContainerMapping.createAs(Ns.node, "Group") [
					semanticCandidatesExpression = '''self.extensionValues.value->filter(bpmn2::Group)'''.trimAql
					domainClass = "bpmn2.Group"
					pasteDescriptions += PasteDescription.ref(ProcessDiagram, Ns.operation, "Paste")
					labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "GroupDirectEdit")
					style = FlatContainerStyleDescription.create [
						borderSizeComputationExpression = "1"
						showIcon = false
						labelExpression = "feature:description"
						widthComputationExpression = "15"
						heightComputationExpression = "3"
						backgroundStyle = BackgroundStyle.GRADIENT_TOP_TO_BOTTOM_LITERAL
						borderColor = SystemColor.extraRef("color:gray")
						labelColor = SystemColor.extraRef("color:black")
						backgroundColor = UserFixedColor.ref("color:LightYellow")
						foregroundColor = UserFixedColor.ref("color:LightYellow")
					]
				]
			]
			subContainerMappings += ContainerMapping.createAs(Ns.node, "FakeLane") [
				preconditionExpression = '''self.processRef.laneSets->first().lanes->isEmpty()'''.trimAql
				semanticCandidatesExpression = '''self'''.trimAql
				domainClass = "bpmn2.Participant"
				style = FlatContainerStyleDescription.create [
					arcWidth = 0
					arcHeight = 0
					borderSizeComputationExpression = "1"
					labelSize = 12
					showIcon = false
					labelExpression = ""
					borderColor = UserFixedColor.ref("color:TextBackground")
					labelColor = UserFixedColor.ref("color:TextBackground")
					backgroundColor = UserFixedColor.ref("color:Yellow")
					foregroundColor = UserFixedColor.ref("color:Yellow")
				]
			]
		]
		edgeMappings += EdgeMapping.createAs(Ns.edge, "SequenceFlow") [
			semanticCandidatesExpression = '''self.participants.processRef.eAllContents()'''.trimAql
			semanticElements = '''Sequence{self}->union(Sequence{self.conditionExpression})'''.trimAql
			targetFinderExpression = '''self.targetRef'''.trimAql
			sourceFinderExpression = '''self.sourceRef'''.trimAql
			domainClass = "SequenceFlow"
			useDomainElement = true
			labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
			sourceMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
			sourceMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
			sourceMapping += NodeMapping.localRef(Ns.node, "ComplexGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "EndEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "EventBasedGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "ExclusiveGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "InclusiveGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "IntermediateCatchEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "IntermediateThrowEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "ParallelGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "StartEvent")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			sourceMapping += ContainerMapping.localRef(Ns.node, "Task")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorder")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			targetMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
			targetMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
			targetMapping += NodeMapping.localRef(Ns.node, "ComplexGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "EndEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "EventBasedGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "ExclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "InclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "IntermediateCatchEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "IntermediateThrowEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "ParallelGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "StartEvent")
			targetMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			targetMapping += ContainerMapping.localRef(Ns.node, "Task")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorder")
			reconnections += ReconnectEdgeDescription.localRef(Ns.reconnect, "ReconnectTargetSequenceFlow")
			reconnections += ReconnectEdgeDescription.localRef(Ns.reconnect, "ReconnectSourceSequenceFlow")
			style = EdgeStyleDescription.create [
				targetArrow = EdgeArrows.INPUT_FILL_CLOSED_ARROW_LITERAL
				sizeComputationExpression = "2"
				routingStyle = EdgeRouting.MANHATTAN_LITERAL
				strokeColor = UserFixedColor.ref("color:SequenceFlowColor")
				centerLabelStyleDescription = CenterLabelStyleDescription.create [
					labelFormat += FontFormat.ITALIC_LITERAL
					showIcon = false
					labelExpression = '''self.name'''.trimAql
					labelColor = SystemColor.extraRef("color:black")
				]
			]
			styleIf('''self.conditionExpression!=null and not view.isDefaultPath()'''.trimAql) [
				sourceArrow = EdgeArrows.DIAMOND_LITERAL
				targetArrow = EdgeArrows.INPUT_FILL_CLOSED_ARROW_LITERAL
				sizeComputationExpression = "2"
				routingStyle = EdgeRouting.MANHATTAN_LITERAL
				strokeColor = UserFixedColor.ref("color:SequenceFlowColor")
				beginLabelStyleDescription = BeginLabelStyleDescription.create [
					labelExpression = '''self.conditionExpression.description'''.trimAql
					iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Expression.gif"
					labelColor = SystemColor.extraRef("color:black")
				]
				centerLabelStyleDescription = CenterLabelStyleDescription.create [
					labelFormat += FontFormat.ITALIC_LITERAL
					showIcon = false
					labelExpression = '''self.name'''.trimAql
					labelColor = SystemColor.extraRef("color:black")
				]
			]
			styleIf('''self.conditionExpression==null and view.isDefaultPath()'''.trimAql) [
				targetArrow = EdgeArrows.INPUT_CLOSED_ARROW_LITERAL
				sizeComputationExpression = "2"
				routingStyle = EdgeRouting.MANHATTAN_LITERAL
				strokeColor = UserFixedColor.ref("color:SequenceFlowColor")
				centerLabelStyleDescription = CenterLabelStyleDescription.create [
					labelFormat += FontFormat.ITALIC_LITERAL
					showIcon = false
					labelExpression = '''self.name'''.trimAql
					labelColor = SystemColor.extraRef("color:black")
				]
			]
			styleIf('''self.conditionExpression!=null and view.isDefaultPath()'''.trimAql) [
				sourceArrow = EdgeArrows.DIAMOND_LITERAL
				targetArrow = EdgeArrows.INPUT_CLOSED_ARROW_LITERAL
				sizeComputationExpression = "2"
				routingStyle = EdgeRouting.MANHATTAN_LITERAL
				strokeColor = UserFixedColor.ref("color:SequenceFlowColor")
				beginLabelStyleDescription = BeginLabelStyleDescription.create [
					labelExpression = '''self.conditionExpression.description'''.trimAql
					iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Expression.gif"
					labelColor = SystemColor.extraRef("color:black")
				]
				centerLabelStyleDescription = CenterLabelStyleDescription.create [
					labelFormat += FontFormat.ITALIC_LITERAL
					showIcon = false
					labelExpression = '''self.name'''.trimAql
					labelColor = SystemColor.extraRef("color:black")
				]
			]
		]
		edgeMappings += EdgeMapping.createAs(Ns.edge, "AssociationLink") [
			semanticCandidatesExpression = '''self.participants.processRef.eAllContents()'''.trimAql
			targetFinderExpression = '''self.targetRef'''.trimAql
			sourceFinderExpression = '''self.sourceRef'''.trimAql
			domainClass = "bpmn2.Association"
			useDomainElement = true
			sourceMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
			sourceMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
			sourceMapping += NodeMapping.localRef(Ns.node, "ComplexGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "DataInput")
			sourceMapping += NodeMapping.localRef(Ns.node, "DataObject")
			sourceMapping += NodeMapping.localRef(Ns.node, "DataOutput")
			sourceMapping += NodeMapping.localRef(Ns.node, "DataStore")
			sourceMapping += NodeMapping.localRef(Ns.node, "EndEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "EventBasedGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "ExclusiveGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "InclusiveGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "IntermediateCatchEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "IntermediateThrowEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "ParallelGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "StartEvent")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			sourceMapping += ContainerMapping.localRef(Ns.node, "Task")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorder")
			sourceMapping += NodeMapping.localRef(Ns.node, "TextAnnotation")
			targetMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
			targetMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
			targetMapping += NodeMapping.localRef(Ns.node, "ComplexGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "DataInput")
			targetMapping += NodeMapping.localRef(Ns.node, "DataObject")
			targetMapping += NodeMapping.localRef(Ns.node, "DataOutput")
			targetMapping += NodeMapping.localRef(Ns.node, "DataStore")
			targetMapping += NodeMapping.localRef(Ns.node, "EndEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "EventBasedGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "ExclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "InclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "IntermediateCatchEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "IntermediateThrowEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "ParallelGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "StartEvent")
			targetMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			targetMapping += ContainerMapping.localRef(Ns.node, "Task")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorder")
			targetMapping += NodeMapping.localRef(Ns.node, "TextAnnotation")
			reconnections += ReconnectEdgeDescription.localRef(Ns.reconnect, "ReconnectTargetAssociationLink")
			reconnections += ReconnectEdgeDescription.localRef(Ns.reconnect, "ReconnectSourceAssociationLink")
			style = EdgeStyleDescription.create [
				lineStyle = LineStyle.DOT_LITERAL
				sizeComputationExpression = "2"
				routingStyle = EdgeRouting.MANHATTAN_LITERAL
				strokeColor = UserFixedColor.ref("color:AssociationLinkColor")
				centerLabelStyleDescription = CenterLabelStyleDescription.create [
					showIcon = false
					labelColor = SystemColor.extraRef("color:black")
				]
			]
			styleIf('''self.sourceRef.oclIsKindOf(bpmn2::TextAnnotation) or self.targetRef.oclIsKindOf(bpmn2::TextAnnotation)'''.trimAql) [
				lineStyle = LineStyle.DOT_LITERAL
				targetArrow = EdgeArrows.NO_DECORATION_LITERAL
				sizeComputationExpression = "2"
				routingStyle = EdgeRouting.MANHATTAN_LITERAL
				strokeColor = UserFixedColor.ref("color:AssociationLinkColor")
				centerLabelStyleDescription = CenterLabelStyleDescription.create [
					showIcon = false
					labelColor = SystemColor.extraRef("color:black")
				]
			]
		]
		edgeMappings += EdgeMapping.createAs(Ns.edge, "MessageFlowOnParticipant") [
			semanticCandidatesExpression = '''self.messageFlows'''.trimAql
			targetFinderExpression = '''diagram.getTargetRef(self)'''.trimAql
			sourceFinderExpression = '''diagram.getSourceRef(self)'''.trimAql
			domainClass = "MessageFlow"
			useDomainElement = true
			labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
			sourceMapping += ContainerMapping.localRef(Ns.node, "Participant")
			sourceMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
			sourceMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
			sourceMapping += NodeMapping.localRef(Ns.node, "EndEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "IntermediateCatchEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "IntermediateThrowEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "StartEvent")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			sourceMapping += ContainerMapping.localRef(Ns.node, "Task")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorder")
			targetMapping += ContainerMapping.localRef(Ns.node, "Participant")
			targetMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
			targetMapping += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
			targetMapping += NodeMapping.localRef(Ns.node, "EndEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "IntermediateCatchEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "IntermediateThrowEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "StartEvent")
			targetMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			targetMapping += ContainerMapping.localRef(Ns.node, "Task")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorder")
			reconnections += ReconnectEdgeDescription.localRef(Ns.reconnect, "ReconnectTargetMessageFlow")
			reconnections += ReconnectEdgeDescription.localRef(Ns.reconnect, "ReconnectSourceMessageFlow")
			style = EdgeStyleDescription.create [
				lineStyle = LineStyle.DASH_LITERAL
				targetArrow = EdgeArrows.INPUT_CLOSED_ARROW_LITERAL
				sizeComputationExpression = "2"
				routingStyle = EdgeRouting.MANHATTAN_LITERAL
				strokeColor = SystemColor.extraRef("color:dark_orange")
				centerLabelStyleDescription = CenterLabelStyleDescription.create [
					labelFormat += FontFormat.ITALIC_LITERAL
					labelExpression = '''self.name'''.trimAql
					iconPath = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/receive-task.png"
					labelColor = SystemColor.extraRef("color:black")
				]
			]
		]
		edgeMappings += EdgeMapping.createAs(Ns.edge, "LabelEdge") [
			targetFinderExpression = '''self'''.trimAql
			sourceMapping += NodeMapping.localRef(Ns.node, "ExternalLabel")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
			targetMapping += NodeMapping.localRef(Ns.node, "ComplexGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "DataInput")
			targetMapping += NodeMapping.localRef(Ns.node, "DataObject")
			targetMapping += NodeMapping.localRef(Ns.node, "DataOutput")
			targetMapping += NodeMapping.localRef(Ns.node, "DataStore")
			targetMapping += NodeMapping.localRef(Ns.node, "EndEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "EventBasedGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "ExclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "InclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "IntermediateCatchEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "IntermediateThrowEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "ParallelGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "StartEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorder")
			style = EdgeStyleDescription.create [
				lineStyle = LineStyle.DASH_LITERAL
				targetArrow = EdgeArrows.NO_DECORATION_LITERAL
				strokeColor = SystemColor.extraRef("color:light_gray")
				centerLabelStyleDescription = CenterLabelStyleDescription.create [
					labelColor = SystemColor.extraRef("color:black")
				]
			]
		]
		edgeMappings += EdgeMapping.createAs(Ns.edge, "Group") [
			targetFinderExpression = '''self'''.trimAql
			sourceMapping += ContainerMapping.localRef(Ns.node, "Group")
			targetMapping += ContainerMapping.localRef(Ns.node, "Group")
			style = EdgeStyleDescription.create [
				lineStyle = LineStyle.DASH_DOT_LITERAL
				targetArrow = EdgeArrows.NO_DECORATION_LITERAL
				sizeComputationExpression = "3"
				routingStyle = EdgeRouting.MANHATTAN_LITERAL
				strokeColor = SystemColor.extraRef("color:gray")
			]
		]
		customizeBpmnNodeStyles
		toolSections += createTools
		toolSections += createCollaborationTools
		decorationDescriptionsSet = DecorationDescriptionsSet.create [
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ScriptTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeScriptTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/script-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "BusinessRuleTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeBusinessRuleTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/business-rule-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ChoreographyTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeChoreographyTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/task.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ManualTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeManualTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/manual-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ReceiveTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeReceiveTask() and not self.instantiate'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/receive-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ReceiveTaskInstanciate"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeReceiveTask() and self.instantiate'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/receive-task-process-instantiation.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "SendTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeSendTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/send-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ServiceTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeServiceTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/service-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "UserTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeUserTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/user-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ActivityLoopMarker"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''self.loopCharacteristics.oclIsKindOf(bpmn2::StandardLoopCharacteristics)'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/loop.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
				mappings += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
				mappings += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ActivityConpensationMarker"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''self.isForCompensation'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/compensation.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
				mappings += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
				mappings += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ActivityParallelMultiInstanceMarker"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''self.loopCharacteristics.oclIsKindOf(bpmn2::MultiInstanceLoopCharacteristics) and not self.loopCharacteristics.isSequential'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/mi.parallel.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
				mappings += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
				mappings += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ActivitySequentialMultiInstanceMarker"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''self.loopCharacteristics.oclIsKindOf(bpmn2::MultiInstanceLoopCharacteristics) and self.loopCharacteristics.isSequential'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/mi.sequential.png"
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
				mappings += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Process")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
				mappings += NodeMapping.localRef(Ns.node, "TaskBorderOnCallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "SubProcess"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''containerView.ownedDiagramElements->first().filter(diagram::DNodeContainer).isCollapsed()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/subprocess.collapsed.png"
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "AdHocSubProcessMarker"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''self.oclIsTypeOf(bpmn2::AdHocSubProcess)'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/adhoc-sub-process.png"
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "CollapsedSubProcessMarker"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''view.isCollapsed()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/subprocess.collapsed.png"
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "CollectionMarker"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''self.isCollection'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/collection.png"
				mappings += NodeMapping.localRef(Ns.node, "DataInput")
				mappings += NodeMapping.localRef(Ns.node, "DataObject")
				mappings += NodeMapping.localRef(Ns.node, "DataOutput")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "CallActivityCollaboration"
				position = Position.SOUTH_LITERAL
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/callactivity.collapsed.png"
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
			]
		]
	}

	def createTools() {
		ToolSection.create("Tools") [
			label = "%Tools"
			ownedTools += DirectEditLabel.createAs(Ns.operation, "FlowElementNameEdit") [
				label = "FlowElementNameEdit"
				forceRefresh = true
				mask = "{0}"
				operation = '''self'''.trimAql.toContext(
					'''not self.oclIsKindOf(bpmn2::TextAnnotation)'''.trimAql.ifThenDo(
						"name".setter('''self.trimLabel(arg0)'''.trimAql)
					),
					'''self.oclIsKindOf(bpmn2::TextAnnotation)'''.trimAql.ifThenDo(
						"text".setter('''self.trimLabel(arg0)'''.trimAql)
					)
				)
			]
			ownedTools += ContainerDropDescription.createAs(Ns.drop, "MoveFlowElementFromLaneToSubProcess") [
				forceRefresh = true
				moveEdges = true
				mappings += NodeMapping.localRef(Ns.node, "EventBasedGateway")
				mappings += NodeMapping.localRef(Ns.node, "ExclusiveGateway")
				mappings += NodeMapping.localRef(Ns.node, "InclusiveGateway")
				mappings += NodeMapping.localRef(Ns.node, "IntermediateCatchEvent")
				mappings += NodeMapping.localRef(Ns.node, "IntermediateThrowEvent")
				mappings += NodeMapping.localRef(Ns.node, "ParallelGateway")
				mappings += NodeMapping.localRef(Ns.node, "StartEvent")
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += NodeMapping.localRef(Ns.node, "EndEvent")
				mappings += NodeMapping.localRef(Ns.node, "ComplexGateway")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
				oldContainer = DropContainerVariable.create("oldSemanticContainer")
				newContainer = DropContainerVariable.create("newSemanticContainer")
				element = ElementDropVariable.create("element")
				newViewContainer = ContainerViewVariable.create("newContainerView")
				operation = '''element.dropFlowElement(oldSemanticContainer, newSemanticContainer'''.trimAql.toOperation
			]
			ownedTools += ContainerDropDescription.createAs(Ns.drop, "MoveFlowElementToLane") [
				forceRefresh = true
				moveEdges = true
				mappings += NodeMapping.localRef(Ns.node, "EventBasedGateway")
				mappings += NodeMapping.localRef(Ns.node, "ExclusiveGateway")
				mappings += NodeMapping.localRef(Ns.node, "InclusiveGateway")
				mappings += NodeMapping.localRef(Ns.node, "IntermediateCatchEvent")
				mappings += NodeMapping.localRef(Ns.node, "IntermediateThrowEvent")
				mappings += NodeMapping.localRef(Ns.node, "ParallelGateway")
				mappings += NodeMapping.localRef(Ns.node, "StartEvent")
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "Task")
				mappings += NodeMapping.localRef(Ns.node, "EndEvent")
				mappings += NodeMapping.localRef(Ns.node, "ComplexGateway")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Process")
				mappings += ContainerMapping.localRef(Ns.node, "CallActivity_Task")
				oldContainer = DropContainerVariable.create("oldSemanticContainer")
				newContainer = DropContainerVariable.create("newSemanticContainer")
				element = ElementDropVariable.create("element")
				newViewContainer = ContainerViewVariable.create("newContainerView")
				operation = '''element'''.trimAql.toContext(
					Unset.create [
						featureName = "lanes"
						elementExpression = '''oldSemanticContainer'''.trimAql
					],
					"lanes".setter('''newSemanticContainer'''.trimAql),
					'''newSemanticContainer.eContainer(bpmn2::Process)'''.trimAql.toContext(
						"flowElements".setter('''element'''.trimAql),
						'''element.boundaryEventRefs'''.trimAql.forDo("event", 
							'''newSemanticContainer.eContainer(bpmn2::Process)'''.trimAql.toContext(
								"flowElements".setter('''event'''.trimAql)
							)
						)
					)
				)
			]
			ownedTools += DoubleClickDescription.createAs(Ns.operation, "SubProcessToggleCollapse_DoubleClick") [
				forceRefresh = true
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				element = ElementDoubleClickVariable.create("element")
				elementView = ElementDoubleClickVariable.create("elementView")
				operation = '''elementView.toggleCollapse()'''.trimAql.toOperation
			]
			ownedTools += OperationAction.createAs(Ns.operation, "ToggleCollapseSubProcess_ContextAction") [
				label = "%ToggleCollapse"
				precondition = '''self.oclIsKindOf(bpmn2::SubProcess)'''.trimAql
				forceRefresh = true
				icon = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/SubProcess.png"
				view = ContainerViewVariable.create("views")
				operation = '''views.toggleCollapse()'''.trimAql.toOperation
			]
			ownedTools += ContainerDropDescription.createAs(Ns.drop, "MoveExtensionValueToLane") [
				forceRefresh = true
				moveEdges = true
				mappings += NodeMapping.localRef(Ns.node, "DataObject")
				mappings += NodeMapping.localRef(Ns.node, "DataStore")
				oldContainer = DropContainerVariable.create("oldSemanticContainer")
				newContainer = DropContainerVariable.create("newSemanticContainer")
				element = ElementDropVariable.create("element")
				newViewContainer = ContainerViewVariable.create("newContainerView")
				operation = '''newSemanticContainer'''.trimAql.toContext(
					"extensionValues".setter('''element.eContainerOrSelf(bpmn2::ExtensionAttributeValue)'''.trimAql),
					'''element'''.trimAql.toContext(
						"lanes".setter('''newSemanticContainer'''.trimAql),
						Unset.create [
							featureName = "lanes"
							elementExpression = '''oldSemanticContainer'''.trimAql
						]
					)
				)
			]
			ownedTools += DeleteElementDescription.createAs(Ns.del, "DeleteCallActivity") [
				forceRefresh = true
				element = ElementDeleteVariable.create("element")
				elementView = ElementDeleteVariable.create("elementView")
				containerView = ContainerViewVariable.create("containerView")
				operation = '''element.eContainerOrSelf(bpmn2::FlowElementsContainer)'''.trimAql.toContext(
					Unset.create [
						featureName = "flowElements"
						elementExpression = '''element'''.trimAql
					]
				)
			]
			ownedTools += createConvertMenus
			ownedTools += PasteDescription.createAs(Ns.operation, "Paste") [
				label = "%Paste"
				forceRefresh = true
				container = DropContainerVariable.create("container")
				containerView = ContainerViewVariable.create("containerView")
				copiedView = ElementViewVariable.create("copiedView")
				copiedElement = ElementVariable.create("copiedElement")
				operation = "service:container.paste(containerView, copiedView, copiedElement)".toOperation
			]
			ownedTools += DeleteElementDescription.createAs(Ns.del, "DeleteSubProcess") [
				forceRefresh = true
				element = ElementDeleteVariable.create("element")
				elementView = ElementDeleteVariable.create("elementView")
				containerView = ContainerViewVariable.create("containerView")
				operation = '''element.deleteSubProcess(elementView)'''.trimAql.toOperation
			]
			ownedTools += PopupMenu.createAs(Ns.menu, "ReorderLane_Popup") [
				label = "%ReorderLane"
				precondition = '''self.oclIsKindOf(bpmn2::Lane) and self.eContainer().lanes->size()>1'''.trimAql
				forceRefresh = true
				menuItemDescription += OperationAction.createAs(Ns.operation, "LaneUp_ContextAction") [
					label = "%Up"
					precondition = '''self.eContainer().lanes->indexOf(self)>1'''.trimAql
					forceRefresh = true
					view = ContainerViewVariable.create("views")
					operation = '''views'''.trimAql.forDo("view", 
						'''view.target.up()'''.trimAql.toOperation
					)
				]
				menuItemDescription += OperationAction.createAs(Ns.operation, "LaneDown_ContextAction") [
					label = "%Down"
					precondition = '''self.eContainer().lanes->indexOf(self) <> self.eContainer().lanes->size()'''.trimAql
					forceRefresh = true
					view = ContainerViewVariable.create("views")
					operation = '''views'''.trimAql.forDo("view", 
						'''view.target.down()'''.trimAql.toOperation
					)
				]
			]
			ownedTools += OperationAction.createAs(Ns.operation, "ExternalLabel") [
				label = "%ExternalLabel"
				precondition = '''self.oclIsKindOf(bpmn2::Event) or self.oclIsKindOf(bpmn2::Gateway)  or self.oclIsKindOf(bpmn2::ItemAwareElement)'''.trimAql
				forceRefresh = true
				view = ContainerViewVariable.create("views")
				operation = "org.obeonetwork.bpmn2.design.setUnsetExternalLabels".javaDo("SetUnsetExternalLabels", 
					"views" -> '''views'''.trimAql
				)
			]
		]
	}


	def createCollaborationTools() {
		ToolSection.create("Collaboration") [
			label = "%Collaboration"
			icon = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/MessageFlow.png"
			ownedTools += ContainerCreationDescription.createAs(Ns.operation, "ParticpantWithoutProcess") [
				label = "%ParticipantWithoutProcess"
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Participant.png"
				containerMappings += ContainerMapping.localRef(Ns.node, "Participant")
				variable = NodeCreationVariable.create("container")
				viewVariable = ContainerViewVariable.create("containerView")
				operation = '''container'''.trimAql.toContext(
					"participants".creator("bpmn2.Participant").andThen[ variableName = "participant" ].chain(
						createInitDialog("Participant")
					)
				)
			]
			ownedTools += ContainerCreationDescription.createAs(Ns.operation, "Particpant") [
				label = "%ParticipantAndNewProcess"
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/ParticipantWithProcess.png"
				containerMappings += ContainerMapping.localRef(Ns.node, "Participant")
				variable = NodeCreationVariable.create("container")
				viewVariable = ContainerViewVariable.create("containerView")
				operation = '''container'''.trimAql.toContext(
					"participants".creator("bpmn2.Participant").andThen[ variableName = "participant" ].chain(
						createInitDialog("Participant")
					),
					''' if participant.eContainer(bpmn2::Definitions) <> null then participant.eContainer(bpmn2::Definitions) else participant.eContainerOrSelf(basemm::Folder) endif'''.trimAql.toContext(
						'''self.oclIsKindOf(basemm::Folder)'''.trimAql.ifThenDo(
							"elements".creator("bpmn2::Process").andThen[ variableName = "newProcess" ].chain(
								createInitDialog("Process"),
								'''participant'''.trimAql.toContext(
									"processRef".setter('''newProcess'''.trimAql).chain(
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
								'''participant'''.trimAql.toContext(
									"processRef".setter('''newProcess'''.trimAql).chain(
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
			ownedTools += SelectionWizardDescription.createAs(Ns.operation, "LinkProcess") [
				label = "%ParticipantAndExistingProcess"
				precondition = '''self.oclIsTypeOf(bpmn2::Collaboration)'''.trimAql
				candidatesExpression = ''' if self.eContainer(bpmn2::Definitions) <> null then self.eContainer(bpmn2::Definitions).eAllContents(bpmn2::Process) else self.eResource().eAllContents(bpmn2::Process) endif'''.trimAql
				message = "%SelectProcess"
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Process.png"
				element = ElementSelectVariable.create("element")
				containerView = ContainerViewVariable.create("containerView")
				container = SelectContainerVariable.create("container")
				operation = '''self'''.trimAql.toContext(
					"participants".creator("bpmn2.Participant").andThen[ variableName = "participant" ].chain(
						createInitDialog("Participant")
					),
					'''participant'''.trimAql.toContext(
						"processRef".setter('''element'''.trimAql).chain(
							'''self.processRef'''.trimAql.toContext(
								'''self.laneSets->isEmpty()'''.trimAql.ifThenDo(
									"laneSets".creator("bpmn2::LaneSet").chain(
										"lanes".creator("Lane")
									)
								)
							)
						)
					)
				)
			]
			ownedTools += EdgeCreationDescription.createAs(Ns.connect, "Message Flow Creation Tool") [
				label = "%Message"
				precondition = '''(preSource.oclIsTypeOf(bpmn2::Participant) and preTarget.oclIsTypeOf(bpmn2::Participant)) or not(preSource.eInverse('flowNodeRefs') = preTarget.eInverse('flowNodeRefs'))'''.trimAql
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/MessageFlow.png"
				edgeMappings += EdgeMapping.localRef(Ns.edge, "MessageFlowOnParticipant")
				sourceVariable = SourceEdgeCreationVariable.create("source")
				targetVariable = TargetEdgeCreationVariable.create("target")
				sourceViewVariable = SourceEdgeViewCreationVariable.create("sourceView")
				targetViewVariable = TargetEdgeViewCreationVariable.create("targetView")
				operation = '''sourceView.eContainer(diagram::DDiagram).target'''.trimAql.toContext(
					"messageFlows".creator("bpmn2.MessageFlow").chain(
						"sourceRef".setter('''source'''.trimAql),
						"targetRef".setter('''target'''.trimAql)
					)
				)
			]
			ownedTools += DeleteElementDescription.createAs(Ns.del, "DeleteParticipant") [
				forceRefresh = true
				element = ElementDeleteVariable.create("element")
				elementView = ElementDeleteVariable.create("elementView")
				containerView = ContainerViewVariable.create("containerView")
				operation = '''element.eContainer(bpmn2::Collaboration)'''.trimAql.toContext(
					Unset.create [
						featureName = "participants"
						elementExpression = '''element'''.trimAql
					]
				)
			]
		]
	}

	def createProcessLayer() {
		AdditionalLayer.create("Process") [
			activeByDefault = true
			toolSections += createProcessConnectorsTools
			toolSections += createEventsTools
			toolSections += createProcessEventDefinitionsTools
			toolSections += createActivitiesTools
			toolSections += createGatewaysTools
			toolSections += createDataTools
			toolSections += createProcessOtherTools
		]
	}

	def createProcessConnectorsTools() {
		ToolSection.create("Connectors") [
			label = "%Connectors"
			icon = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/SequenceFlow.png"
			ownedTools += ToolGroup.create("Sequence") [
				label = "%Sequence"
				tools += EdgeCreationDescription.createAs(Ns.connect, "SequenceFlowCreationTool") [
					label = "%Sequence"
					precondition = '''preSource.eInverse('flowNodeRefs').eContainer() = preTarget.eInverse('flowNodeRefs').eContainer()'''.trimAql
					iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/SequenceFlow.png"
					edgeMappings += EdgeMapping.localRef(Ns.edge, "SequenceFlow")
					sourceVariable = SourceEdgeCreationVariable.create("source")
					targetVariable = TargetEdgeCreationVariable.create("target")
					sourceViewVariable = SourceEdgeViewCreationVariable.create("sourceView")
					targetViewVariable = TargetEdgeViewCreationVariable.create("targetView")
					operation = '''source.eContainer()'''.trimAql.toContext(
						'''source.eContainer(bpmn2::LaneSet)=target.eContainer(bpmn2::LaneSet)'''.trimAql.ifThenDo(
							"flowElements".creator("bpmn2.SequenceFlow").chain(
								'''instance'''.trimAql.toContext(
									"sourceRef".setter('''source'''.trimAql),
									"targetRef".setter('''target'''.trimAql)
								)
							)
						),
						'''source.eContainerOrSelf(bpmn2::BoundaryEvent)=null'''.trimAql.ifThenDo(
						)
					)
				]
				tools += ToolDescription.createAs(Ns.operation, "Condition") [
					label = "%Condition"
					precondition = '''element.oclIsKindOf(bpmn2::SequenceFlow) and element.oclAsType(bpmn2::SequenceFlow)==null'''.trimAql
					forceRefresh = true
					iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Expression.gif"
					element = ElementVariable.create("element")
					elementView = ElementViewVariable.create("elementView")
					operation = '''self'''.trimAql.toContext(
						"conditionExpression".creator("Expression")
					)
				]
				tools += ToolDescription.createAs(Ns.operation, "SuppressCondition") [
					label = "%SupressCondition"
					precondition = '''element.oclIsKindOf(bpmn2::SequenceFlow) and element.oclAsType(bpmn2::SequenceFlow).conditionExpression!=null'''.trimAql
					forceRefresh = true
					iconPath = "/org.obeonetwork.dsl.bpmn2.design/icons/remove.png"
					element = ElementVariable.create("element")
					elementView = ElementViewVariable.create("elementView")
					operation = Unset.create [
						featureName = "conditionExpression"
						elementExpression = '''self.conditionExpression'''.trimAql
					]
				]
			]
			ownedTools += EdgeCreationDescription.createAs(Ns.connect, "Association Creation Tool") [
				label = "%Association"
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Association.png"
				edgeMappings += EdgeMapping.localRef(Ns.edge, "AssociationLink")
				sourceVariable = SourceEdgeCreationVariable.create("source")
				targetVariable = TargetEdgeCreationVariable.create("target")
				sourceViewVariable = SourceEdgeViewCreationVariable.create("sourceView")
				targetViewVariable = TargetEdgeViewCreationVariable.create("targetView")
				operation = '''source.eContainerOrSelf(bpmn2::Process)'''.trimAql.toContext(
					'''source.oclIsKindOf(bpmn2::DataObject) or source.oclIsKindOf(bpmn2::DataInput) or source.oclIsKindOf(bpmn2::DataOutput) or source.oclIsKindOf(bpmn2::DataStore) or source.oclIsKindOf(bpmn2::TextAnnotation)'''.trimAql.ifThenDo(
						'''target.oclIsKindOf(bpmn2::Task) or target.oclIsKindOf(bpmn2::ReceiveTask) or target.oclIsKindOf(bpmn2::SendTask) or target.oclIsKindOf(bpmn2::ChoreographyTask) or target.oclIsKindOf(bpmn2::Gateway) or target.oclIsKindOf(bpmn2::Event) or target.oclIsKindOf(bpmn2::SubProcess) or target.oclIsKindOf(bpmn2::CallActivity)'''.trimAql.ifThenDo(
							"artifacts".creator("bpmn2.Association").chain(
								'''instance'''.trimAql.toContext(
									"sourceRef".setter('''source'''.trimAql),
									"targetRef".setter('''target'''.trimAql)
								)
							)
						)
					),
					'''source.oclIsKindOf(bpmn2::Task) or source.oclIsKindOf(bpmn2::ReceiveTask) or source.oclIsKindOf(bpmn2::SendTask) or source.oclIsKindOf(bpmn2::Gateway) or source.oclIsKindOf(bpmn2::Event) or source.oclIsKindOf(bpmn2::SubProcess) or source.oclIsKindOf(bpmn2::CallActivity)'''.trimAql.ifThenDo(
						'''target.oclIsKindOf(bpmn2::DataObject) or target.oclIsKindOf(bpmn2::DataInput) or target.oclIsKindOf(bpmn2::DataOutput) or target.oclIsKindOf(bpmn2::DataStore) or target.oclIsKindOf(bpmn2::TextAnnotation)'''.trimAql.ifThenDo(
							"artifacts".creator("bpmn2.Association").chain(
								'''instance'''.trimAql.toContext(
									"sourceRef".setter('''source'''.trimAql),
									"targetRef".setter('''target'''.trimAql)
								)
							)
						)
					),
					'''source.oclIsKindOf(bpmn2::BoundaryEvent) and source.eventDefinitions->select(e|e.oclIsTypeOf(bpmn2::CompensateEventDefinition))->notEmpty()'''.trimAql.ifThenDo(
						'''target.isForCompensation'''.trimAql.ifThenDo(
							"artifacts".creator("bpmn2.Association").chain(
								'''instance'''.trimAql.toContext(
									"sourceRef".setter('''source'''.trimAql),
									"targetRef".setter('''target'''.trimAql)
								)
							)
						)
					)
				)
			]
			ownedTools += ReconnectEdgeDescription.createAs(Ns.reconnect, "ReconnectTargetSequenceFlow") [
				precondition = '''self.sourceRef.lanes->first().eContainer()=target.lanes->first().eContainer() or self.sourceRef.attachedToRef.lanes->first().eContainer()=target.lanes->first().eContainer()'''.trimAql
				forceRefresh = true
				source = SourceEdgeCreationVariable.create("source")
				target = TargetEdgeCreationVariable.create("target")
				sourceView = SourceEdgeViewCreationVariable.create("sourceView")
				targetView = TargetEdgeViewCreationVariable.create("targetView")
				element = ElementSelectVariable.create("element")
				operation = '''element'''.trimAql.toContext(
					"targetRef".setter('''target'''.trimAql)
				)
				edgeView = ElementSelectVariable.create("edgeView")
			]
			ownedTools += ReconnectEdgeDescription.createAs(Ns.reconnect, "ReconnectSourceSequenceFlow") [
				precondition = '''self.sourceRef.lanes->first().eContainer()=target.lanes->first().eContainer() or self.sourceRef.attachedToRef.lanes->first().eContainer()=target.lanes->first().eContainer()'''.trimAql
				forceRefresh = true
				reconnectionKind = ReconnectionKind.RECONNECT_SOURCE_LITERAL
				source = SourceEdgeCreationVariable.create("source")
				target = TargetEdgeCreationVariable.create("target")
				sourceView = SourceEdgeViewCreationVariable.create("sourceView")
				targetView = TargetEdgeViewCreationVariable.create("targetView")
				element = ElementSelectVariable.create("element")
				operation = '''element'''.trimAql.toContext(
					"sourceRef".setter('''target'''.trimAql)
				)
				edgeView = ElementSelectVariable.create("edgeView")
			]
			ownedTools += ReconnectEdgeDescription.createAs(Ns.reconnect, "ReconnectTargetMessageFlow") [
				precondition = '''self.sourceRef.lanes->first().eContainer()<>target.lanes->first().eContainer()'''.trimAql
				forceRefresh = true
				source = SourceEdgeCreationVariable.create("source")
				target = TargetEdgeCreationVariable.create("target")
				sourceView = SourceEdgeViewCreationVariable.create("sourceView")
				targetView = TargetEdgeViewCreationVariable.create("targetView")
				element = ElementSelectVariable.create("element")
				operation = '''element'''.trimAql.toContext(
					"targetRef".setter('''target'''.trimAql)
				)
				edgeView = ElementSelectVariable.create("edgeView")
			]
			ownedTools += ReconnectEdgeDescription.createAs(Ns.reconnect, "ReconnectSourceMessageFlow") [
				precondition = '''self.targetRef.lanes->first().eContainer()<>target.lanes->first().eContainer()'''.trimAql
				forceRefresh = true
				reconnectionKind = ReconnectionKind.RECONNECT_SOURCE_LITERAL
				source = SourceEdgeCreationVariable.create("source")
				target = TargetEdgeCreationVariable.create("target")
				sourceView = SourceEdgeViewCreationVariable.create("sourceView")
				targetView = TargetEdgeViewCreationVariable.create("targetView")
				element = ElementSelectVariable.create("element")
				operation = '''element'''.trimAql.toContext(
					"sourceRef".setter('''target'''.trimAql)
				)
				edgeView = ElementSelectVariable.create("edgeView")
			]
			ownedTools += ReconnectEdgeDescription.createAs(Ns.reconnect, "ReconnectTargetAssociationLink") [
				forceRefresh = true
				source = SourceEdgeCreationVariable.create("source")
				target = TargetEdgeCreationVariable.create("target")
				sourceView = SourceEdgeViewCreationVariable.create("sourceView")
				targetView = TargetEdgeViewCreationVariable.create("targetView")
				element = ElementSelectVariable.create("element")
				operation = '''element'''.trimAql.toContext(
					"targetRef".setter('''target'''.trimAql)
				)
				edgeView = ElementSelectVariable.create("edgeView")
			]
			ownedTools += ReconnectEdgeDescription.createAs(Ns.reconnect, "ReconnectSourceAssociationLink") [
				forceRefresh = true
				reconnectionKind = ReconnectionKind.RECONNECT_SOURCE_LITERAL
				source = SourceEdgeCreationVariable.create("source")
				target = TargetEdgeCreationVariable.create("target")
				sourceView = SourceEdgeViewCreationVariable.create("sourceView")
				targetView = TargetEdgeViewCreationVariable.create("targetView")
				element = ElementSelectVariable.create("element")
				operation = '''element'''.trimAql.toContext(
					"sourceRef".setter('''target'''.trimAql)
				)
				edgeView = ElementSelectVariable.create("edgeView")
			]
		]
	}


	

	def createProcessEventDefinitionsTools() {
		ToolSection.create("Event Definitions") [
			label = "%EventDefinitions"
			icon = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/MessageEventDefinition.png"
			ownedTools += OperationAction.createAs(Ns.operation, "OperationDeleteEventDefinition") [
				label = "%RemoveEventDefinition"
				precondition = '''views->first().target.oclIsKindOf(bpmn2::Event)'''.trimAql
				forceRefresh = true
				view = ContainerViewVariable.create("views")
				operation = '''views'''.trimAql.forDo("i", 
					'''i.target'''.trimAql.toContext(
						Unset.create [
							featureName = "eventDefinitions"
							elementExpression = '''self.eventDefinitions->last()'''.trimAql
						]
					)
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Message Event Definition") [
				label = "%Message"
				precondition = '''element.oclIsKindOf(bpmn2::Event) and element.eventDefinitions->filter(bpmn2::MessageEventDefinition)->isEmpty()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/MessageEventDefinition.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element'''.trimAql.toContext(
					"eventDefinitions".creator("MessageEventDefinition")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Timer Event Definition") [
				label = "%Timer"
				precondition = '''element.oclIsKindOf(bpmn2::Event) and not (element.oclIsKindOf(bpmn2::EndEvent)) and not (element.oclIsKindOf(bpmn2::IntermediateThrowEvent)) and element.eventDefinitions->filter(bpmn2::TimerEventDefinition)->isEmpty()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/TimerEventDefinition.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element'''.trimAql.toContext(
					"eventDefinitions".creator("TimerEventDefinition")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Escalation Event Definition") [
				label = "%Escalation"
				precondition = '''element.oclIsKindOf(bpmn2::Event) and not(element.oclIsKindOf(bpmn2::StartEvent)) and not(element.oclIsKindOf(bpmn2::IntermediateCatchEvent)) and element.eventDefinitions->filter(bpmn2::EscalationEventDefinition)->isEmpty()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/EscalationEventDefinition.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element'''.trimAql.toContext(
					"eventDefinitions".creator("EscalationEventDefinition")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Conditional Event Definition") [
				label = "%Conditional"
				precondition = '''element.oclIsKindOf(bpmn2::Event) and not (element.oclIsKindOf(bpmn2::EndEvent)) and not (element.oclIsKindOf(bpmn2::IntermediateThrowEvent)) and element.eventDefinitions->filter(bpmn2::ConditionalEventDefinition)->isEmpty()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/ConditionalEventDefinition.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element'''.trimAql.toContext(
					"eventDefinitions".creator("ConditionalEventDefinition")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Link Event Definition") [
				label = "%Link"
				precondition = '''element.oclIsKindOf(bpmn2::Event) and not (element.oclIsKindOf(bpmn2::StartEvent)) and not (element.oclIsKindOf(bpmn2::EndEvent)) and not (element.oclIsKindOf(bpmn2::BoundaryEvent)) and element.eventDefinitions->filter(bpmn2::LinkEventDefinition)->isEmpty()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/LinkEventDefinition.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element'''.trimAql.toContext(
					"eventDefinitions".creator("LinkEventDefinition")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Error Event Definition") [
				label = "%Error"
				precondition = '''element.oclIsKindOf(bpmn2::Event) and not (element.oclIsKindOf(bpmn2::IntermediateThrowEvent)) and not (element.oclIsKindOf(bpmn2::IntermediateCatchEvent)) and not (element.oclIsKindOf(bpmn2::StartEvent)) and element.eventDefinitions->filter(bpmn2::ErrorEventDefinition)->isEmpty()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/ErrorEventDefinition.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element'''.trimAql.toContext(
					"eventDefinitions".creator("ErrorEventDefinition")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Cancel Event Definition") [
				label = "%Cancel"
				precondition = '''element.oclIsKindOf(bpmn2::Event) and not (element.oclIsKindOf(bpmn2::IntermediateThrowEvent)) and not (element.oclIsKindOf(bpmn2::IntermediateCatchEvent)) and not (element.oclIsKindOf(bpmn2::StartEvent)) and element.eventDefinitions->filter(bpmn2::CancelEventDefinition)->isEmpty()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/CancelEventDefinition.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element'''.trimAql.toContext(
					"eventDefinitions".creator("CancelEventDefinition")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Compensate Event Definition") [
				label = "%Compensate"
				precondition = '''element.oclIsKindOf(bpmn2::Event) and not (element.oclIsKindOf(bpmn2::StartEvent)) and not (element.oclIsKindOf(bpmn2::IntermediateCatchEvent)) and element.eventDefinitions->filter(bpmn2::CompensateEventDefinition)->isEmpty()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/CompensateEventDefinition.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element'''.trimAql.toContext(
					"eventDefinitions".creator("CompensateEventDefinition")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Signal Event Definition") [
				label = "%Signal"
				precondition = '''element.oclIsKindOf(bpmn2::Event) and element.eventDefinitions->filter(bpmn2::SignalEventDefinition)->isEmpty()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/SignalEventDefinition.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element'''.trimAql.toContext(
					"eventDefinitions".creator("SignalEventDefinition")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Terminate Event Definition") [
				label = "%Terminate"
				precondition = '''element.oclIsKindOf(bpmn2::EndEvent) and element.eventDefinitions->filter(bpmn2::TerminateEventDefinition)->isEmpty()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/TerminateEventDefinition.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element'''.trimAql.toContext(
					"eventDefinitions".creator("TerminateEventDefinition")
				)
			]
			ownedTools += ToolDescription.createAs(Ns.operation, "Delete Event Definition") [
				label = "%Delete"
				precondition = '''element.oclIsKindOf(bpmn2::Event) and not element.eventDefinitions->isEmpty()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.design/icons/remove.png"
				element = ElementVariable.create("element")
				elementView = ElementViewVariable.create("elementView")
				operation = '''element'''.trimAql.toContext(
					Unset.create [
						featureName = "eventDefinitions"
						elementExpression = '''element.eventDefinitions->last()'''.trimAql
					]
				)
			]
		]
	}


	def createProcessOtherTools() {
		ToolSection.create("Other") [
			label = "%Other"
			icon = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Process.png"
			ownedTools += ContainerCreationDescription.createAs(Ns.operation, "Lane") [
				label = "%Lane"
				precondition = '''self.processRef!=null or self.oclIsKindOf(bpmn2::Lane)'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Lane.png"
				containerMappings += ContainerMapping.localRef(Ns.node, "Lane")
				variable = NodeCreationVariable.create("container")
				viewVariable = ContainerViewVariable.create("containerView")
				operation = '''self'''.trimAql.toContext(
					'''not container.oclIsKindOf(bpmn2::Lane)'''.trimAql.ifThenDo(
						'''container.processRef.laneSets->first()'''.trimAql.toContext(
							"lanes".creator("bpmn2.Lane").andThen[ variableName = "newLane" ].chain(
								createInitDialog("Lane")
							),
							'''self.moveElementFirstPosition('lanes',newLane)'''.trimAql.toOperation
						)
					),
					'''container.oclIsKindOf(bpmn2::Lane)'''.trimAql.ifThenDo(
						'''container.eContainerOrSelf(bpmn2::LaneSet)'''.trimAql.toContext(
							"lanes".creator("bpmn2.Lane").andThen[ variableName = "newLane" ].chain(
								createInitDialog("Lane")
							),
							'''self.moveElement('lanes',newLane,container)'''.trimAql.toOperation
						)
					)
				)
			]
			ownedTools += NodeCreationDescription.createAs(Ns.creation, "TextAnnotation") [
				label = "%TextAnnotation"
				precondition = '''containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/TextAnnotation.png"
				nodeMappings += NodeMapping.localRef(Ns.node, "TextAnnotation")
				variable = NodeCreationVariable.create("container")
				viewVariable = ContainerViewVariable.create("containerView")
				operation = '''container.eContainerOrSelf(bpmn2::Lane)'''.trimAql.toContext(
					"extensionValues".creator("bpmn2.ExtensionAttributeValue"),
					'''instance'''.trimAql.toContext(
						"value".creator("bpmn2.TextAnnotation").chain(
							"lanes".setter('''container'''.trimAql)
						)
					)
				)
			]
			ownedTools += DirectEditLabel.createAs(Ns.operation, "TextAnnotationDirectEdit") [
				forceRefresh = true
				mask = "{0}"
				operation = '''self'''.trimAql.toContext(
					"text".setter('''arg0'''.trimAql)
				)
			]
			ownedTools += ContainerCreationDescription.createAs(Ns.operation, "Group") [
				label = "%Group"
				precondition = '''containerView.isNotCollapsed()'''.trimAql
				containerMappings += ContainerMapping.localRef(Ns.node, "Group")
				variable = NodeCreationVariable.create("container")
				viewVariable = ContainerViewVariable.create("containerView")
				operation = '''container.eContainerOrSelf(bpmn2::Lane)'''.trimAql.toContext(
					"extensionValues".creator("bpmn2.ExtensionAttributeValue"),
					'''instance'''.trimAql.toContext(
						"value".creator("bpmn2.Group").chain(
							"lanes".setter('''container'''.trimAql)
						)
					)
				)
			]
			ownedTools += DirectEditLabel.createAs(Ns.operation, "GroupDirectEdit") [
				forceRefresh = true
				mask = "{0}"
				operation = '''self'''.trimAql.toContext(
					"description".setter('''arg0'''.trimAql)
				)
			]
		]
	}

}