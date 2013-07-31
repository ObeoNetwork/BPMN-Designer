package org.obeonetwork.dsl.bpmn2.design.graphical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.IModelingAssistantProvider;
import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Task;

import fr.obeo.dsl.viewpoint.DSemanticDecorator;
import fr.obeo.dsl.viewpoint.diagram.edit.api.part.IDiagramElementEditPart;
import fr.obeo.dsl.viewpoint.diagram.internal.edit.parts.SquareEditPart;

/**
 * @generated
 */
/**
 * TODO implement this class ...
 * 
 * */
public class BpmnModelingAssistantProvider extends AbstractProvider implements IModelingAssistantProvider {

	public boolean provides(IOperation operation) {
		// TODO Auto-generated method stub
		return true;
	}

	public List getTypes(String hint, IAdaptable data) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getRelTypesOnSource(IAdaptable source) {
		// TODO to implement
		 
		 IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
	                .getAdapter(IGraphicalEditPart.class);
		 if(sourceEditPart instanceof SquareEditPart){
			 List types = new ArrayList();
			 IDiagramElementEditPart iep = (IDiagramElementEditPart)sourceEditPart.getParent();
		 Task task = (Task)iep.resolveTargetSemanticElement();
		 
		 IElementType et=ElementTypeRegistry.getInstance().getElementType(Bpmn2Factory.eINSTANCE.createSequenceFlow());
		 
		 types.add(et);
		
		 return types;
		 }
		 
		 
		 return Collections.EMPTY_LIST;
		
	}

	public List getRelTypesOnTarget(IAdaptable target) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getRelTypesForSREOnSource(IAdaptable source) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getRelTypesForSREOnTarget(IAdaptable target) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		// TODO Auto-generated method stub
		return null;
	}

	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		// TODO Auto-generated method stub
		return null;
	}

	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getTypesForPopupBar(IAdaptable host) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
   
}
