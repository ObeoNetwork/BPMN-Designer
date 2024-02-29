package org.obeonetwork.dsl.bpmn2.design.tool

import org.obeonetwork.bpmn2.design.Activator
import java.nio.file.Paths

/**
 * Common elements for tool of dynamic Design model of '*.sirius' plugin.
 * 
 * @author Obeo
 */
class DesignToolBase {

	// Specific
	protected static val PLUGINS_PATH = "../../plugins"
	
	protected static val REVERSE_PATH = "target/rvs"
	
	// Derived
	protected static val ODESIGN_FILE = Paths.get(PLUGINS_PATH)
		// /!\ File path matches java bundle path.
		.resolve(Activator.DESIGN_PATH)
		.toAbsolutePath


}
