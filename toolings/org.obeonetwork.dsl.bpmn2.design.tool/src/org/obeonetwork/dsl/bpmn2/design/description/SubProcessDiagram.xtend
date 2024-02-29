package org.obeonetwork.dsl.bpmn2.design.description

import org.eclipse.sirius.diagram.BackgroundStyle
import org.eclipse.sirius.diagram.EdgeArrows
import org.eclipse.sirius.diagram.EdgeRouting
import org.eclipse.sirius.diagram.LabelPosition
import org.eclipse.sirius.diagram.LineStyle
import org.eclipse.sirius.diagram.ResizeKind
import org.eclipse.sirius.diagram.description.CompositeLayout
import org.eclipse.sirius.diagram.description.ContainerMapping
import org.eclipse.sirius.diagram.description.ContainerMappingImport
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
import org.eclipse.sirius.viewpoint.description.tool.ToolDescription
import org.eclipse.sirius.viewpoint.description.tool.Unset
import org.obeonetwork.dsl.bpmn2.SubProcess

import static extension org.mypsycho.modit.emf.sirius.api.SiriusDesigns.*

class SubProcessDiagram extends BpmnDiagram {

	new(BpmnDesign parent) {
		super(parent, "SubProcessDiagram", "Sub-Process Diagram", SubProcess)
	}

	override initContent(DiagramDescription it) {
		super.initContent(it)
		titleExpression = '''self.name'''.trimAql
		enablePopupBars = true
		layout = CompositeLayout.create [
			direction = LayoutDirection.LEFT_TO_RIGHT
		]
	}

	override initDefaultStyle(BasicLabelStyleDescription it) {/* No reverse for Default */}
	override initDefaultEdgeStyle(EdgeStyleDescription it) {/* No reverse for Default */}


	override initContent(Layer it) {
		containerMappings += ContainerMapping.createAs(Ns.node, "SubProcess") [
			semanticCandidatesExpression = '''self'''.trimAql
			domainClass = "bpmn2.SubProcess"
			deletionDescription = DeleteElementDescription.localRef(Ns.del, "DeleteSubProcess")
			labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
			dropDescriptions += ContainerDropDescription.localRef(Ns.drop, "MoveFlowElementFromLaneToSubProcess")
			style = FlatContainerStyleDescription.create [
				arcWidth = 20
				arcHeight = 20
				borderSizeComputationExpression = "3"
				labelSize = 9
				labelFormat += FontFormat.BOLD_LITERAL
				showIcon = false
				roundedCorner = true
				borderColor = UserFixedColor.ref("color:DarkYellow")
				labelColor = SystemColor.extraRef("color:black")
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
				labelColor = SystemColor.extraRef("color:black")
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
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPExternalLabel") [
				semanticCandidatesExpression = '''containerView.getElementsWithExternalLabel()'''.trimAql
				semanticElements = '''self.eventDefinitions->union(Sequence{self})'''.trimAql
				domainClass = "bpmn2.BaseElement"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = SquareDescription.create [
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
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPStartEvent") [
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::StartEvent)'''.trimAql
				semanticElements = '''self.eventDefinitions->union(Sequence{self})'''.trimAql
				domainClass = "bpmn2.StartEvent"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/start.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPEndEvent") [
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::EndEvent)'''.trimAql
				semanticElements = '''self.eventDefinitions->union(Sequence{self})'''.trimAql
				domainClass = "bpmn2.EndEvent"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/end.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPIntermediateCatchEvent") [
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::IntermediateCatchEvent)'''.trimAql
				semanticElements = '''self.eventDefinitions->union(Sequence{self})'''.trimAql
				domainClass = "bpmn2.IntermediateCatchEvent"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/none.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPIntermediateThrowEvent") [
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::IntermediateThrowEvent)'''.trimAql
				semanticElements = '''self.eventDefinitions->union(Sequence{self})'''.trimAql
				domainClass = "bpmn2.IntermediateThrowEvent"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/none.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPParallelGateway") [
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::ParallelGateway)'''.trimAql
				domainClass = "bpmn2.ParallelGateway"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					sizeComputationExpression = "4"
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/gateway/parallel-gateway.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPInclusiveGateway") [
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::InclusiveGateway)'''.trimAql
				domainClass = "bpmn2.InclusiveGateway"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					sizeComputationExpression = "4"
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/gateway/inclusive-gateway.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPExclusiveGateway") [
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::ExclusiveGateway)'''.trimAql
				domainClass = "bpmn2.ExclusiveGateway"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					sizeComputationExpression = "4"
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/gateway/exclusive-gateway.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPComplexGateway") [
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::ComplexGateway)'''.trimAql
				domainClass = "bpmn2.ComplexGateway"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					sizeComputationExpression = "4"
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/gateway/complex-gateway.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPEventBasedGateway") [
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::EventBasedGateway)'''.trimAql
				domainClass = "bpmn2.EventBasedGateway"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					sizeComputationExpression = "4"
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/gateway/event-based-gateway.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPDataObject") [
				name = "SPDataObject " //typo
				semanticCandidatesExpression = '''self.extensionValues.value->filter(bpmn2::DataObject)'''.trimAql
				domainClass = "bpmn2.DataObject"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					resizeKind = ResizeKind.NSEW_LITERAL
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/data/data-object.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPDataStore") [
				semanticCandidatesExpression = '''self.extensionValues.value->filter(bpmn2::DataStore)'''.trimAql
				domainClass = "bpmn2.DataStore"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					resizeKind = ResizeKind.NSEW_LITERAL
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/data/data-store.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPDataInput") [
				semanticCandidatesExpression = '''self.ioSpecification.dataInputs'''.trimAql
				domainClass = "bpmn2.DataInput"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					resizeKind = ResizeKind.NSEW_LITERAL
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/data/data-input.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
			subNodeMappings += NodeMapping.createAs(Ns.node, "SPDataOutput") [
				semanticCandidatesExpression = '''self.ioSpecification.dataOutputs'''.trimAql
				domainClass = "bpmn2.DataOutput"
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				style = WorkspaceImageDescription.create [
					showIcon = false
					labelExpression = '''self.getNonExternalLabel(view)'''.trimAql
					resizeKind = ResizeKind.NSEW_LITERAL
					arcWidth = 1
					arcHeight = 1
					workspacePath = "/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/data/data-output.svg"
					borderColor = SystemColor.extraRef("color:black")
					labelColor = UserFixedColor.ref("color:TextBackground")
				]
			]
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
			subContainerMappings += ContainerMapping.createAs(Ns.node, "SPTask") [
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::Task)'''.trimAql
				domainClass = "bpmn2.Task"
				pasteDescriptions += PasteDescription.localRef(Ns.operation, "Paste")
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
			]
			subContainerMappings += ContainerMappingImport.createAs(Ns.node, "SPSubProcess") [
				semanticCandidatesExpression = "service:getSubElements()"
				domainClass = "bpmn2.SubProcess"
				pasteDescriptions += PasteDescription.localRef(Ns.operation, "Paste")
				deletionDescription = DeleteElementDescription.localRef(Ns.del, "DeleteSubProcess")
				labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
				reusedBorderedNodeMappings += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPComplexGateway")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPDataInput")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPDataObject")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPDataOutput")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPDataStore")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPEndEvent")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPEventBasedGateway")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPExclusiveGateway")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPInclusiveGateway")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPIntermediateCatchEvent")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPParallelGateway")
				reusedNodeMappings += NodeMapping.localRef(Ns.node, "SPStartEvent")
				reusedContainerMappings += ContainerMapping.localRef(Ns.node, "SPCallActivity_Process")
				reusedContainerMappings += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
				reusedContainerMappings += ContainerMappingImport.localRef(Ns.node, "SPSubProcess")
				reusedContainerMappings += ContainerMapping.localRef(Ns.node, "SPTask")
				importedMapping = ContainerMapping.localRef(Ns.node, "SubProcess")
			]
			subContainerMappings += ContainerMapping.createAs(Ns.node, "SPCallActivity_Process") [
				preconditionExpression = '''self.calledElementRef.oclIsTypeOf(bpmn2::Process)'''.trimAql
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::CallActivity)'''.trimAql
				semanticElements = '''Sequence{self,self.calledElementRef})'''.trimAql
				domainClass = "bpmn2.CallActivity"
				deletionDescription = DeleteElementDescription.localRef(Ns.del, "DeleteCallActivity")
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
			]
			subContainerMappings += ContainerMapping.createAs(Ns.node, "SPCallActivity_Task") [
				preconditionExpression = '''self.calledElementRef.oclIsKindOf(bpmn2::GlobalTask)'''.trimAql
				semanticCandidatesExpression = '''self.flowElements->filter(bpmn2::CallActivity)'''.trimAql
				semanticElements = '''Sequence{self,self.calledElementRef})'''.trimAql
				domainClass = "bpmn2.CallActivity"
				deletionDescription = DeleteElementDescription.localRef(Ns.del, "DeleteCallActivity")
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
			]
			subContainerMappings += ContainerMapping.createAs(Ns.node, "Group") [
				semanticCandidatesExpression = '''self.extensionValues.value->filter(bpmn2::Group)'''.trimAql
				domainClass = "bpmn2.Group"
				pasteDescriptions += PasteDescription.ref(ProcessDiagram, Ns.operation, "Paste")
				pasteDescriptions += PasteDescription.localRef(Ns.operation, "Paste")
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
		edgeMappings += EdgeMapping.createAs(Ns.edge, "SequenceFlow") [
			semanticCandidatesExpression = '''containerView.target.eAllContents(bpmn2::SequenceFlow)'''.trimAql
			semanticElements = '''Sequence{self}->union(Sequence{self.conditionExpression})'''.trimAql
			targetFinderExpression = '''self.targetRef'''.trimAql
			sourceFinderExpression = '''self.sourceRef'''.trimAql
			domainClass = "SequenceFlow"
			useDomainElement = true
			labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPComplexGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPEndEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPEventBasedGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPExclusiveGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPInclusiveGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPIntermediateCatchEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPParallelGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPStartEvent")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SPTask")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Process")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPIntermediateThrowEvent")
			targetMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			targetMapping += NodeMapping.localRef(Ns.node, "SPComplexGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPEndEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "SPEventBasedGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPExclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPInclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPIntermediateCatchEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "SPParallelGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPStartEvent")
			targetMapping += ContainerMapping.localRef(Ns.node, "SPTask")
			targetMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Process")
			targetMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			targetMapping += NodeMapping.localRef(Ns.node, "SPIntermediateThrowEvent")
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
		edgeMappings += EdgeMapping.createAs(Ns.edge, "MessageFlow") [
			semanticCandidatesExpression = '''if self.getDefinitionsObject() <> null then self.getDefinitionsObject().rootElements->filter(bpmn2::Collaboration)->collect(e|e.messageFlows) else Sequence{} endif'''.trimAql
			targetFinderExpression = '''self.targetRef'''.trimAql
			sourceFinderExpression = '''self.sourceRef'''.trimAql
			domainClass = "MessageFlow"
			useDomainElement = true
			labelDirectEdit = DirectEditLabel.localRef(Ns.operation, "FlowElementNameEdit")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPEndEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPIntermediateCatchEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPStartEvent")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SPTask")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			sourceMapping += ContainerMappingImport.localRef(Ns.node, "SPSubProcess")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Process")
			targetMapping += NodeMapping.localRef(Ns.node, "SPEndEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "SPIntermediateCatchEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "SPStartEvent")
			targetMapping += ContainerMapping.localRef(Ns.node, "SPTask")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			targetMapping += ContainerMappingImport.localRef(Ns.node, "SPSubProcess")
			targetMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
			targetMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Process")
			targetMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			style = EdgeStyleDescription.create [
				lineStyle = LineStyle.DASH_LITERAL
				targetArrow = EdgeArrows.INPUT_CLOSED_ARROW_LITERAL
				sizeComputationExpression = "2"
				routingStyle = EdgeRouting.MANHATTAN_LITERAL
				strokeColor = UserFixedColor.ref("color:MessageFlowColor")
				centerLabelStyleDescription = CenterLabelStyleDescription.create [
					labelFormat += FontFormat.ITALIC_LITERAL
					labelExpression = '''self.name'''.trimAql
					iconPath = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/receive-task.png"
					labelColor = SystemColor.extraRef("color:black")
				]
			]
		]
		edgeMappings += EdgeMapping.createAs(Ns.edge, "AssociationLink") [
			semanticCandidatesExpression = '''containerView.target.eContainer(bpmn2::Process).eAllContents(bpmn2::Association)'''.trimAql
			targetFinderExpression = '''self.targetRef'''.trimAql
			sourceFinderExpression = '''self.sourceRef'''.trimAql
			domainClass = "bpmn2.Association"
			useDomainElement = true
			sourceMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPComplexGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPDataInput")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPDataObject")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPDataOutput")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPDataStore")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPEndEvent")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPEventBasedGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPInclusiveGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPParallelGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPStartEvent")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SPTask")
			sourceMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			sourceMapping += EdgeMapping.localRef(Ns.edge, "MessageFlow")
			sourceMapping += EdgeMapping.localRef(Ns.edge, "SequenceFlow")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Process")
			sourceMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPExclusiveGateway")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPIntermediateCatchEvent")
			sourceMapping += ContainerMapping.localRef(Ns.node, "Group")
			sourceMapping += NodeMapping.localRef(Ns.node, "SPIntermediateThrowEvent")
			sourceMapping += ContainerMappingImport.localRef(Ns.node, "SPSubProcess")
			sourceMapping += NodeMapping.localRef(Ns.node, "TextAnnotation")
			targetMapping += EdgeMapping.localRef(Ns.edge, "MessageFlow")
			targetMapping += EdgeMapping.localRef(Ns.edge, "SequenceFlow")
			targetMapping += ContainerMapping.localRef(Ns.node, "SubProcess")
			targetMapping += NodeMapping.localRef(Ns.node, "SPComplexGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPDataInput")
			targetMapping += NodeMapping.localRef(Ns.node, "SPDataObject")
			targetMapping += NodeMapping.localRef(Ns.node, "SPDataOutput")
			targetMapping += NodeMapping.localRef(Ns.node, "SPDataStore")
			targetMapping += NodeMapping.localRef(Ns.node, "SPEndEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "SPEventBasedGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPExclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPInclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPIntermediateCatchEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "SPParallelGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPStartEvent")
			targetMapping += ContainerMapping.localRef(Ns.node, "SPTask")
			targetMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
			targetMapping += ContainerMapping.localRef(Ns.node, "SPCallActivity_Process")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			targetMapping += ContainerMapping.localRef(Ns.node, "Group")
			targetMapping += NodeMapping.localRef(Ns.node, "SPIntermediateThrowEvent")
			targetMapping += ContainerMappingImport.localRef(Ns.node, "SPSubProcess")
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
		edgeMappings += EdgeMapping.createAs(Ns.edge, "LabelEdge") [
			targetFinderExpression = '''self'''.trimAql
			sourceMapping += NodeMapping.localRef(Ns.node, "SPExternalLabel")
			targetMapping += NodeMapping.localRef(Ns.node, "SPDataInput")
			targetMapping += NodeMapping.localRef(Ns.node, "SPDataObject")
			targetMapping += NodeMapping.localRef(Ns.node, "SPDataOutput")
			targetMapping += NodeMapping.localRef(Ns.node, "SPDataStore")
			targetMapping += NodeMapping.localRef(Ns.node, "SPEndEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "SPEventBasedGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPExclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPInclusiveGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPIntermediateCatchEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "SPIntermediateThrowEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "SPParallelGateway")
			targetMapping += NodeMapping.localRef(Ns.node, "SPStartEvent")
			targetMapping += NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
			targetMapping += NodeMapping.localRef(Ns.node, "SPComplexGateway")
			style = EdgeStyleDescription.create [
				lineStyle = LineStyle.DASH_LITERAL
				targetArrow = EdgeArrows.NO_DECORATION_LITERAL
				routingStyle = EdgeRouting.MANHATTAN_LITERAL
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
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CancelEventDefinition)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/cancel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/cancel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/cancel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/cancel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/cancel.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/cancel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CompensateEventDefinition)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/compensation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/compensation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/compensation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/compensation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/compensation.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/compensation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ConditionalEventDefinition)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/conditional.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/conditional.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/conditional.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/conditional.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/conditional.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/conditional.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ErrorEventDefinition)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/error.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/error.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/error.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/error.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/error.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/error.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::EscalationEventDefinition)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/escalation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/escalation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/escalation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/escalation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/escalation.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/escalation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::LinkEventDefinition)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/link.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/link.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/link.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/link.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/link.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/link.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::MessageEventDefinition)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/message.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/message.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/message.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/message.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/message.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/message.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::SignalEventDefinition)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/signal.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/signal.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/signal.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/signal.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/signal.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/signal.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TerminateEventDefinition)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/terminate.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/terminate.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/terminate.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/terminate.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/terminate.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/terminate.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TimerEventDefinition)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/timer.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/timer.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/timer.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/timer.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/timer.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/timer.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CancelEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/cancel.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/cancel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CompensateEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/compensation.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/compensation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ConditionalEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/conditional.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/conditional.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ErrorEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/error.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/error.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::EscalationEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/escalation.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/escalation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::LinkEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/link.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/link.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::MessageEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/message.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/message.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::SignalEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/signal.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/signal.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TerminateEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/terminate.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/terminate.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TimerEventDefinition) and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/timer.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/timer.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and not self.parallelMultiple'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/multiple.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/multiple.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/multiple.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/multiple.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/multiple.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/multiple.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and self.parallelMultiple'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event/mi.parallel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/multiple.parallel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/catch-event/multiple.parallel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateCatchEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/multiple.parallel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/boundary-events/multiple.parallel.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-boundary-events/multiple.parallel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and not self.parallelMultiple and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/multiple.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/multiple.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and self.parallelMultiple and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/multiple.parallel.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/multiple.parallel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==0  and not self.cancelActivity'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/non-interrupting-boundary-events/none.svg"),
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/sub-process-non-interrupting-boundary-events/none.svg",
				WorkspaceImageDescription.localRef(Ns.node, "TaskBorderOnSubProcess") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and self.oclIsTypeOf(bpmn2::EndEvent)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/end-event/multiple.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEndEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and self.oclIsTypeOf(bpmn2::IntermediateThrowEvent)'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/throw-event/multiple.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPIntermediateThrowEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.instantiate and self.eventGatewayType=bpmn2::EventBasedGatewayType::Parallel'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/gateway/parallel-start-event-based-gateway.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEventBasedGateway") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.instantiate and self.eventGatewayType=bpmn2::EventBasedGatewayType::Exclusive'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/gateway/start-event-based-gateway.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPEventBasedGateway") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CancelEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/cancel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::CompensateEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/compensation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ConditionalEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/conditional.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::ErrorEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/error.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::EscalationEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/escalation.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::LinkEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/link.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::MessageEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/message.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::SignalEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/signal.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TerminateEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/terminate.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==1 and self.eventDefinitions->first().oclIsTypeOf(bpmn2::TimerEventDefinition) and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/timer.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and not self.parallelMultiple and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/multiple.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()>1 and self.parallelMultiple and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/mi.parallel.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		styleCustomisations += '''self.eventDefinitions->size()==0 and not self.isInterrupting'''.trimAql.thenStyle(
			"workspacePath".attCustomization("/org.obeonetwork.dsl.bpmn2.design/icons2/nodes/start-event-non-interrupting/start.svg",
				WorkspaceImageDescription.localRef(Ns.node, "SPStartEvent") [ (it as NodeMapping).style as WorkspaceImageDescription ]
			)
		)
		toolSections += createTools
		toolSections += createConnectorsTools
		toolSections += createEventsTools
		toolSections += createEventDefinitionsTools
		toolSections += createActivitiesTools
		toolSections += createGatewaysTools
		toolSections += createDataTools
		toolSections += createOtherTools
		decorationDescriptionsSet = DecorationDescriptionsSet.create [
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ScriptTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeScriptTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/script-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
				mappings += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "BusinessRuleTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeBusinessRuleTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/business-rule-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
				mappings += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ChoreographyTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeChoreographyTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/task.png"
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ManualTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeManualTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/manual-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ReceiveTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeReceiveTask() and not self.instantiate'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/receive-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ReceiveTaskInstanciate"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeReceiveTask() and self.instantiate'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/receive-task-process-instantiation.png"
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "SendTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeSendTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/send-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ServiceTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeServiceTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/service-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "UserTask"
				position = Position.NORTH_WEST_LITERAL
				preconditionExpression = '''self.isLikeUserTask()'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/north-west/user-task.png"
				mappings += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ActivityLoopMarker"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''self.loopCharacteristics.oclIsKindOf(bpmn2::StandardLoopCharacteristics)'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/loop.png"
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ActivityConpensationMarker"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''self.isForCompensation'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/compensation.png"
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ActivityParallelMultiInstanceMarker"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''self.loopCharacteristics.oclIsKindOf(bpmn2::MultiInstanceLoopCharacteristics) and not self.loopCharacteristics.isSequential'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/mi.parallel.png"
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "ActivitySequentialMultiInstanceMarker"
				position = Position.SOUTH_LITERAL
				preconditionExpression = '''self.loopCharacteristics.oclIsKindOf(bpmn2::MultiInstanceLoopCharacteristics) and self.loopCharacteristics.isSequential'''.trimAql
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/mi.sequential.png"
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
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
				mappings += NodeMapping.localRef(Ns.node, "SPDataInput")
				mappings += NodeMapping.localRef(Ns.node, "SPDataObject")
				mappings += NodeMapping.localRef(Ns.node, "SPDataOutput")
			]
			decorationDescriptions += MappingBasedDecoration.create [
				name = "CallActivitySubProcess"
				position = Position.SOUTH_LITERAL
				imageExpression = "/org.obeonetwork.dsl.bpmn2.design/icons2/decorations/process/south/callactivity.collapsed.png"
				mappings += ContainerMapping.localRef(Ns.node, "SPCallActivity_Process")
			]
		]
	}

	def createTools() {
		ToolSection.create("Tools") [
			label = "%Tools"
			ownedTools += DirectEditLabel.createAs(Ns.operation, "FlowElementNameEdit") [
				label = "FlowElementNameEdit"
				forceRefresh = true
				inputLabelExpression = '''self.name.trim()'''.trimAql
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
				mappings += ContainerMapping.localRef(Ns.node, "SubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "SPCallActivity_Process")
				mappings += ContainerMapping.localRef(Ns.node, "SPCallActivity_Task")
				mappings += NodeMapping.localRef(Ns.node, "SPComplexGateway")
				mappings += NodeMapping.localRef(Ns.node, "SPEndEvent")
				mappings += NodeMapping.localRef(Ns.node, "SPEventBasedGateway")
				mappings += NodeMapping.localRef(Ns.node, "SPExclusiveGateway")
				mappings += NodeMapping.localRef(Ns.node, "SPInclusiveGateway")
				mappings += NodeMapping.localRef(Ns.node, "SPIntermediateCatchEvent")
				mappings += NodeMapping.localRef(Ns.node, "SPIntermediateThrowEvent")
				mappings += NodeMapping.localRef(Ns.node, "SPParallelGateway")
				mappings += NodeMapping.localRef(Ns.node, "SPStartEvent")
				mappings += ContainerMappingImport.localRef(Ns.node, "SPSubProcess")
				mappings += ContainerMapping.localRef(Ns.node, "SPTask")
				oldContainer = DropContainerVariable.create("oldSemanticContainer")
				newContainer = DropContainerVariable.create("newSemanticContainer")
				element = ElementDropVariable.create("element")
				newViewContainer = ContainerViewVariable.create("newContainerView")
				operation = '''element'''.trimAql.toContext(
					Unset.create [
						featureName = "lanes"
						elementExpression = '''oldSemanticContainer'''.trimAql
					],
					'''newSemanticContainer'''.trimAql.toContext(
						"flowElements".setter('''element'''.trimAql),
						'''element.boundaryEventRefs'''.trimAql.forDo("event", 
							'''newSemanticContainer'''.trimAql.toContext(
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


	def createConnectorsTools() {
		ToolSection.create("Connectors") [
			label = "%Connectors"
			icon = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/SequenceFlow.png"
			ownedTools += ToolGroup.create("Sequence") [
				label = "%Sequence"
				tools += EdgeCreationDescription.createAs(Ns.connect, "SequenceFlowCreationTool") [
					label = "%Sequence"
					precondition = '''preSource.eInverse('flowNodeRefs').eContainer() = preTarget.eInverse('flowNodeRefs').eContainer()'''.trimAql
					forceRefresh = true
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

	override getEventCreationMappings() {
		#[
			NodeMapping.localRef(Ns.node, "TaskBorderOnSubProcess")
		]
	}

	def createEventDefinitionsTools() {
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
				precondition = '''element.oclIsKindOf(bpmn2::Event) and element.eventDefinitions->filter(bpmn2::EscalationEventDefinition)->isEmpty() and not (element.oclIsKindOf(bpmn2::StartEvent)) and not (element.oclIsKindOf(bpmn2::IntermediateCatchEvent))'''.trimAql
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
				precondition = '''element.oclIsKindOf(bpmn2::Event) and not (element.oclIsKindOf(bpmn2::EndEvent)) and not (element.oclIsKindOf(bpmn2::BoundaryEvent))  and not (element.oclIsKindOf(bpmn2::StartEvent)) and element.eventDefinitions->filter(bpmn2::LinkEventDefinition)->isEmpty()'''.trimAql
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
				precondition = '''element.oclIsKindOf(bpmn2::Event) and not (element.oclIsKindOf(bpmn2::IntermediateThrowEvent)) and not (element.oclIsKindOf(bpmn2::StartEvent)) and not (element.oclIsKindOf(bpmn2::IntermediateCatchEvent)) and element.eventDefinitions->filter(bpmn2::ErrorEventDefinition)->isEmpty()'''.trimAql
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
				precondition = '''element.oclIsKindOf(bpmn2::EndEvent)  and element.eventDefinitions->filter(bpmn2::TerminateEventDefinition)->isEmpty()'''.trimAql
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


	override getLocalNodeMapping(String id) {
		super.getLocalNodeMapping("SP" + id)
	}



	def createOtherTools() {
		ToolSection.create("Other") [
			label = "%Other"
			icon = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/Lane.png"
			ownedTools += NodeCreationDescription.createAs(Ns.creation, "TextAnnotation") [
				label = "%TextAnnotation"
				precondition = '''containerView.isNotCollapsed()'''.trimAql
				forceRefresh = true
				iconPath = "/org.obeonetwork.dsl.bpmn2.edit/icons/full/obj16/TextAnnotation.png"
				nodeMappings += NodeMapping.localRef(Ns.node, "TextAnnotation")
				variable = NodeCreationVariable.create("container")
				viewVariable = ContainerViewVariable.create("containerView")
				operation = '''container.eContainerOrSelf(bpmn2::SubProcess)'''.trimAql.toContext(
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
				precondition = '''containerView.isNotCollapsed()'''.trimAql
				containerMappings += ContainerMapping.localRef(Ns.node, "Group")
				variable = NodeCreationVariable.create("container")
				viewVariable = ContainerViewVariable.create("containerView")
				operation = '''container.eContainerOrSelf(bpmn2::SubProcess)'''.trimAql.toContext(
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