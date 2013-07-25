package org.obeonetwork.dsl.bpmn2.design.graphical.edit.policies;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.swt.graphics.Image;

/**
 * Connection handle for the association
 * 
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
public class ConnectionHandleForAssociation extends ConnectionHandleEx {

    public ConnectionHandleForAssociation(IGraphicalEditPart ownerEditPart,
            HandleDirection relationshipDirection, String tooltip) {
        super(ownerEditPart, relationshipDirection, tooltip);
    }

    @Override
    protected Image getImage(int side) {
    	DiagramUIPluginImagesEx diagramUIPluginImagesEx= new DiagramUIPluginImagesEx();
        if (side == PositionConstants.WEST) {
            return isIncoming() ? diagramUIPluginImagesEx
                    .get(diagramUIPluginImagesEx.IMG_HANDLE_INCOMING_ASSOCIATION_WEST)
                    : diagramUIPluginImagesEx
                        .get(diagramUIPluginImagesEx.IMG_HANDLE_OUTGOING_ASSOCIATION_WEST);
        } else if (side == PositionConstants.EAST) {
            return isIncoming() ? diagramUIPluginImagesEx
                    .get(diagramUIPluginImagesEx.IMG_HANDLE_INCOMING_ASSOCIATION_EAST)
                    : diagramUIPluginImagesEx
                        .get(diagramUIPluginImagesEx.IMG_HANDLE_OUTGOING_ASSOCIATION_EAST);
        } else if (side == PositionConstants.SOUTH) {
            return isIncoming() ? diagramUIPluginImagesEx
                .get(diagramUIPluginImagesEx.IMG_HANDLE_INCOMING_ASSOCIATION_SOUTH)
                : diagramUIPluginImagesEx
                    .get(diagramUIPluginImagesEx.IMG_HANDLE_OUTGOING_ASSOCIATION_SOUTH);
        } else {
            return isIncoming() ? diagramUIPluginImagesEx
                .get(diagramUIPluginImagesEx.IMG_HANDLE_INCOMING_ASSOCIATION_NORTH)
                : diagramUIPluginImagesEx
                    .get(diagramUIPluginImagesEx.IMG_HANDLE_OUTGOING_ASSOCIATION_NORTH);
        }
    }
    
    
}
