package org.obeonetwork.dsl.bpmn2.design.tool

import java.nio.file.Path
import java.nio.file.Paths
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.sirius.viewpoint.description.Group
import org.junit.Test
import org.mypsycho.modit.emf.sirius.tool.SiriusReverseIt
import org.obeonetwork.bpmn2.design.Activator
import org.obeonetwork.dsl.bpmn2.Bpmn2Package

/**
 * Tool to reverse Sirius design model from '*.design' plugin.
 * <p>
 * Reverse is required when model is modified directly to compare difference with
 * generated model.
 * </p>
 *
 * @author nperansin
 *
 */
class DesignReverse extends DesignToolBase {

	static val EDITED_PKGS = #[
		Bpmn2Package.eINSTANCE
	]

	@Test
	def void reverseModel() {
		SiriusReverseIt.loadSiriusGroup(Activator.DESIGN_PATH)
			.createSiriusReverseIt(
				Paths.get(REVERSE_PATH), 
				"org.obeonetwork.dsl.bpmn2.design.description.BpmnDesign"
			).perform
	}
	
	static def createSiriusReverseIt(Group content, Path dir, String classname) {
		new SiriusReverseIt(
			content, 
			dir, 
			classname,
			EDITED_PKGS
		) {
			
			override addExplicitExtras(ResourceSet rs, Map<EObject, String> extras) {
				// Add convenient name here from other depeding VSM
				// extras += SiriusDependencies.getDependencyExtras(<id>, rs, vsmGroup>)
			}
		}
	}
	
	
}
