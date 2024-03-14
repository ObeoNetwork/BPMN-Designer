/**
 * Copyright (c) 2024 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.bpmn2.design.description

import org.eclipse.sirius.common.tools.api.interpreter.StandardServices
import org.eclipse.sirius.properties.DialogButton
import org.eclipse.sirius.viewpoint.description.Group
import org.eclipse.sirius.viewpoint.description.UserColorsPalette
import org.eclipse.sirius.viewpoint.description.Viewpoint
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation
import org.mypsycho.modit.emf.sirius.api.SiriusVpGroup
import org.obeonetwork.bpmn2.design.ElementsPositionService
import org.obeonetwork.bpmn2.design.ExpandCollapseService
import org.obeonetwork.bpmn2.design.FlowNodeService
import org.obeonetwork.bpmn2.design.NamingService
import org.obeonetwork.bpmn2.design.ProcessService
import org.obeonetwork.bpmn2.design.ServiceHelper
import org.obeonetwork.bpmn2.design.TaskService
import org.obeonetwork.dsl.bpmn2.Bpmn2Package

class BpmnDesign extends SiriusVpGroup {
	
	new () {
        businessPackages += #[
			Bpmn2Package.eINSTANCE
        ]
	}

	override initContent(Group it) {
		name = "BPMN20"
		version = "12.0.0.2017041100"
		ownedViewpoints += Viewpoint.create [
			name = "Process"
			label = "BPMN 2.0 - Process"
			modelFileExtension = "bpmn"
			owned(ProcessDiagram)
			owned(CollaborationDiagram)
			owned(ProcessDefinitionsEditionTable)
			owned(GlobalTaskDefinitionsEditionTable)
			owned(SubProcessDiagram)
			use(ElementsPositionService)
			use(ExpandCollapseService)
			use(TaskService)
			use(FlowNodeService)
			use(StandardServices)
			use(ProcessService)
			use(NamingService)
			use(ServiceHelper)
		]
		.onAssembled[
			// Hack for comparison
			eAllContents
				.filter(DialogButton)
				.filter[ initialOperation === null]
				.forEach[
					initialOperation = InitialOperation.create
				]
		]
		userColorsPalettes += UserColorsPalette.create [
			name = "Colors"
			entries += "LaneBackgroundRight".color(255, 255, 255)
			entries += "LightYellow".color(255, 249, 225)
			entries += "Yellow".color(255, 243, 171)
			entries += "DarkYellow".color(245, 233, 73)
			entries += "SequenceFlowColor".color(125, 125, 125)
			entries += "MessageFlowColor".color(125, 125, 125)
			entries += "AssociationLinkColor".color(176, 176, 176)
			entries += "TaskBorder".color(255, 243, 171)
			entries += "TaskBackgroundLeft".color(255, 243, 171)
			entries += "TaskBackgroundRight".color(255, 243, 171)
			entries += "TextBackground".color(64, 41, 0)
			entries += "GlobalTaskBackground".color(238, 250, 255)
			entries += "ParticipantBackgroundRight".color(255, 255, 255)
			entries += "ParticipantBackgroundLeft".color(172, 226, 253)
			entries += "ParticipantBorder".color(133, 200, 250)
		]
	}

	def context() { this }

}
