package org.obeonetwork.dsl.bpmn2.design.description

import org.eclipse.sirius.table.metamodel.table.description.CreateLineTool
import org.eclipse.sirius.table.metamodel.table.description.EditionTableDescription
import org.eclipse.sirius.table.metamodel.table.description.LineMapping
import org.mypsycho.modit.emf.sirius.api.SiriusFeatureTable
import org.obeonetwork.dsl.bpmn2.Bpmn2Package
import org.obeonetwork.dsl.bpmn2.Definitions

import static extension org.mypsycho.modit.emf.sirius.api.SiriusDesigns.*

class GlobalTaskDefinitionsEditionTable extends SiriusFeatureTable {

	new(BpmnDesign parent) {
		super(parent, "Global Task Definitions", Definitions)
	}

	override initDefaultLineStyle(LineMapping it) {}

	override initContent(EditionTableDescription it) {
		metamodel += Bpmn2Package.eINSTANCE
		name = "GlobalTaskDefinitions"
		ownedLine("GlobalTask") [
			domainClass = "bpmn2.GlobalTask"
			semanticCandidatesExpression = '''self.rootElements->filter(bpmn2::GlobalTask)'''.trimAql
		]
		ownedCreateLine += CreateLineTool.create("Create Global User Task") [
			initVariables
			elementsToSelect = "service:stdEmptyCollection"
			operation = '''container'''.trimAql.toContext(
				"rootElements".creator("bpmn2.GlobalUserTask").chain(
					"name".setter("New Global User Task")
				)
			)
		]
		ownedCreateLine += CreateLineTool.create("Create Global Manual Task") [
			initVariables
			elementsToSelect = "service:stdEmptyCollection"
			operation = '''container'''.trimAql.toContext(
				"rootElements".creator("bpmn2.GlobalManualTask").chain(
					"name".setter("New Global Manual Task")
				)
			)
		]
		ownedCreateLine += CreateLineTool.create("Create Global Script Task") [
			initVariables
			elementsToSelect = "service:stdEmptyCollection"
			operation = '''container'''.trimAql.toContext(
				"rootElements".creator("bpmn2.GlobalScriptTask").chain(
					"name".setter("New Global Script Task")
				)
			)
		]
		ownedCreateLine += CreateLineTool.create("Create Global Business Rule Task") [
			initVariables
			elementsToSelect = "service:stdEmptyCollection"
			operation = '''container'''.trimAql.toContext(
				"rootElements".creator("bpmn2.GlobalBusinessRuleTask").chain(
					"name".setter("New Global Business Rule Task")
				)
			)
		]
		ownedColumn("Name", "name") [
			headerLabelExpression = "Name"
			labelExpression = "feature:name"
		]
	}

}