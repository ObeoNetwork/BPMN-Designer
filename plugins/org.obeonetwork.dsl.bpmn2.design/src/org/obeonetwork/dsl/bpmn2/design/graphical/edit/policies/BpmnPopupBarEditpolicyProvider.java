package org.obeonetwork.dsl.bpmn2.design.graphical.edit.policies;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

import fr.obeo.dsl.viewpoint.diagram.edit.api.part.IDDiagramEditPart;
import fr.obeo.dsl.viewpoint.diagram.edit.api.part.IDiagramElementEditPart;

/**
*
*/
public class BpmnPopupBarEditpolicyProvider extends AbstractProvider implements
IEditPolicyProvider {

	public boolean provides(IOperation operation) {
		
		return true;
	}

	public void createEditPolicies(EditPart editPart) {
		editPart.installEditPolicy(EditPolicyRoles.POPUPBAR_ROLE,
				new BpmnPopupBarEditPolicy());
		
	}



}