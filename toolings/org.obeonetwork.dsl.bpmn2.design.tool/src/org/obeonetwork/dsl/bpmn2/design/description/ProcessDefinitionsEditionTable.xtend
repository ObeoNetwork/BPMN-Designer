package org.obeonetwork.dsl.bpmn2.design.description

import org.eclipse.sirius.table.metamodel.table.description.CreateLineTool
import org.eclipse.sirius.table.metamodel.table.description.EditionTableDescription
import org.eclipse.sirius.table.metamodel.table.description.LineMapping
import org.mypsycho.modit.emf.sirius.api.SiriusFeatureTable
import org.obeonetwork.dsl.bpmn2.Bpmn2Package
import org.obeonetwork.dsl.bpmn2.Definitions

import static extension org.mypsycho.modit.emf.sirius.api.SiriusDesigns.*

class ProcessDefinitionsEditionTable extends SiriusFeatureTable {

	new(BpmnDesign parent) {
		super(parent, "Process Definitions", Definitions)
	}

	override initDefaultLineStyle(LineMapping it) {}

	override initContent(EditionTableDescription it) {
		metamodel += Bpmn2Package.eINSTANCE
		name = "ProcessDefinitions"
		ownedLine("Process") [
			domainClass = "bpmn2.Process"
			semanticCandidatesExpression = "[if (self.oclIsTypeOf(bpmn2::Definitions)) then self.oclAsType(bpmn2::Definitions).rootElements else self.oclAsType(bpmn2::Process).decomposedBy endif /]"
			reusedInMappings += "Process".lineRef
			create += CreateLineTool.create("Duplicate Process") [
				initVariables
				forceRefresh = true
				elementsToSelect = "service:stdEmptyCollection"
				mapping = "Process".lineRef
				operation = '''element.duplicate()'''.trimAql.toOperation
			]
			create += CreateLineTool.create("Create Nested Process") [
				initVariables
				forceRefresh = true
				elementsToSelect = "service:stdEmptyCollection"
				mapping = "Process".lineRef
				operation = '''element'''.trimAql.toContext(
					"decomposedBy".creator("bpmn2.Process").chain(
						"name".setter("<New>")
					)
				)
			]
		]
		ownedCreateLine += CreateLineTool.create("Create Root Process") [
			initVariables
			forceRefresh = true
			elementsToSelect = "service:stdEmptyCollection"
			mapping = "Process".lineRef
			operation = '''container'''.trimAql.toContext(
				"rootElements".creator("bpmn2.Process").chain(
					"name".setter("<New>")
				)
			)
		]
		ownedColumn("Name", "name") [
			headerLabelExpression = "Name"
			labelExpression = '''name'''.trimAql
		]
		ownedColumn("Description", "description") [
			headerLabelExpression = "Description"
			labelExpression = '''description'''.trimAql
		]
	}

}