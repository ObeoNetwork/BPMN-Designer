package org.obeonetwork.dsl.bpmn2.design.graphical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.EditPartViewer.Conditional;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IPrimaryEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.handles.ConnectionHandle;
import org.eclipse.gmf.runtime.diagram.ui.handles.ConnectionHandleLocator;
import org.eclipse.gmf.runtime.diagram.ui.internal.tools.ConnectionHandleTool;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.util.INotationType;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantService;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;

public class BpmnConnectionHandleTool extends ConnectionHandleTool {

    /**
     * @param connectionHandle
     */
    public BpmnConnectionHandleTool(ConnectionHandle connectionHandle) {
        super(connectionHandle);
    }

    @SuppressWarnings("unchecked") //$NON-NLS-1$
    protected Request createTargetRequest() {
        List<IElementType> relTypes = null;
        ConnectionHandle connHandle = getConnectionHandle();
        if (connHandle.isIncoming()) {
            relTypes = ModelingAssistantService.getInstance().getRelTypesOnTarget(
                    connHandle.getOwner());
        } else {
            relTypes = ModelingAssistantService.getInstance().
                getRelTypesOnSource(connHandle.getOwner());
            ModelingAssistantService mas = ModelingAssistantService.getInstance();
            mas.getRelTypesOnSource(connHandle.getOwner());
        }
        int borderSide = ((ConnectionHandleLocator)connHandle.
                getLocator()).getBorderSide();
        if (connHandle instanceof ConnectionHandleForAssociation) {
            setRelationTypesForAssociation(
                    (ConnectionHandleForAssociation)connHandle,
                            relTypes, borderSide);
        } else {
            relTypes.remove(Bpmn2Package.ASSOCIATION);
            List<IElementType> toRemove = new ArrayList<IElementType>();
            for (IElementType eltType : relTypes) {
                if (Integer.toString(Bpmn2Package.ASSOCIATION__ID).equals(eltType.getId())) {
                    toRemove.add(eltType);
                }
            }
            relTypes.removeAll(toRemove);
            switch (borderSide) {
            case PositionConstants.SOUTH:
            case PositionConstants.NORTH:
                relTypes.remove(Bpmn2Package.SEQUENCE_FLOW);
                break;
            case PositionConstants.WEST:
            case PositionConstants.EAST:
                relTypes.remove(Bpmn2Package.MESSAGE_FLOW);
                break;
            }
        }
        for (ListIterator<IElementType> it = relTypes.listIterator();
                    it.hasNext(); ) {
            IElementType elem = it.next();
            if (elem instanceof INotationType) {
                it.remove();
            }
        }

        CreateUnspecifiedTypeConnectionRequest request = 
            new CreateUnspecifiedTypeConnectionRequest(
                    relTypes, useModelingAssistantService(), getPreferencesHint()) {
            public void setTargetEditPart(EditPart part) {
                super.setTargetEditPart(part);
            }};
            
            if (connHandle.isIncoming()) {
                request.setDirectionReversed(true);
            }
            return request;
    }
    
    protected boolean useModelingAssistantService() {
        return false;
    }

    protected void setRelationTypesForAssociation(ConnectionHandleForAssociation connHandle,
            List<IElementType> relationTypesCollector, int borderSide) {
        relationTypesCollector.remove(Bpmn2Package.MESSAGE_FLOW);
        relationTypesCollector.remove(Bpmn2Package.SEQUENCE_FLOW);        
    }
    
    
   
    protected void selectAddedObject(EditPartViewer viewer, Collection objects) {
        final EditPart[] primaryEP = new EditPart[1];
        List editparts = new ArrayList();
        for (Iterator i = objects.iterator(); i.hasNext();) {
            Object object = i.next();
            if (object instanceof IAdaptable) {
                Object editPart = viewer.getEditPartRegistry().get(
                    ((IAdaptable) object).getAdapter(View.class));
                if (editPart instanceof IPrimaryEditPart) {
                    editparts.add(editPart);
                }
                if (editPart instanceof ShapeEditPart) {
                    primaryEP[0] = (ShapeEditPart) editPart;
                }
            }
        }
        if (primaryEP[0] != null) {
            viewer.setSelection(new StructuredSelection(editparts));
            Display.getCurrent().asyncExec(new Runnable() {

                public void run() {
                    if (primaryEP[0].isActive()) {
                        primaryEP[0].performRequest(new Request(
                            RequestConstants.REQ_DIRECT_EDIT));
                    }
                }
            });
        }
    }
    
    @Override
    protected Conditional getTargetingConditional() {
        return new EditPartViewer.Conditional() {
            public boolean evaluate(EditPart editpart) {
                return editpart.isSelectable();
            }
        };
    }
}
