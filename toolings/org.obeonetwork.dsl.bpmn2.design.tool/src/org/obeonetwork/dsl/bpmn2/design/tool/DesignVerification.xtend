package org.obeonetwork.dsl.bpmn2.design.tool

import org.obeonetwork.bpmn2.design.Activator
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.sirius.viewpoint.description.Group
import org.junit.Test
import org.mypsycho.modit.emf.sirius.tool.ODesignVerifications

/**
 * Tool to generate Sirius design model in 'sirius' plugin.
 * <p>
 * Tool also reverse the created model to allows round-trip when design file is modified
 * directly.
 * </p>
 *
 * @author nperansin
 */
class DesignVerification extends DesignToolBase {

	// val resBundle = Platform.getResourceBundle(Activator.^default.bundle)
	

	@Test
    def void verifyDesign() throws Exception {

        val res = new ResourceSetImpl()
        	.createResource(URI.createPlatformPluginURI(Activator.DESIGN_PATH, true))
        res.load(Collections.emptyMap)
        val content = res.contents.head as Group
        
        ODesignVerifications.printValidation(content.name, content)
    }

}
