package org.obeonetwork.dsl.bpmn2.design.graphical;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.DragTracker;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.handles.ConnectionHandle;
import org.eclipse.gmf.runtime.diagram.ui.handles.ConnectionHandleLocator;
import org.eclipse.gmf.runtime.diagram.ui.l10n.SharedImages;

import org.eclipse.swt.graphics.Image;

public class ConnectionHandleEx extends ConnectionHandle {
	public ConnectionHandleEx(IGraphicalEditPart ownerEditPart, HandleDirection relationshipDirection, String tooltip) {
		super(ownerEditPart, relationshipDirection, tooltip);
	}

	@Override
	protected Image getImage(int side) {
		DiagramUIPluginImagesEx diagramUIPluginImagesEx= new DiagramUIPluginImagesEx();
        if (side == PositionConstants.WEST) {
            return isIncoming() ? diagramUIPluginImagesEx
                    .get(diagramUIPluginImagesEx.IMG_HANDLE_INCOMING_FLOW_WEST)
                    : diagramUIPluginImagesEx
                        .get(diagramUIPluginImagesEx.IMG_HANDLE_OUTGOING_FLOW_WEST);
        } else if (side == PositionConstants.EAST) {
            return isIncoming() ? diagramUIPluginImagesEx
                    .get(diagramUIPluginImagesEx.IMG_HANDLE_INCOMING_FLOW_EAST)
                    : diagramUIPluginImagesEx
                        .get(diagramUIPluginImagesEx.IMG_HANDLE_OUTGOING_FLOW_EAST);
        } else if (side == PositionConstants.SOUTH) {
            return isIncoming() ? diagramUIPluginImagesEx
                .get(diagramUIPluginImagesEx.IMG_HANDLE_INCOMING_SOUTH)
                : diagramUIPluginImagesEx
                    .get(diagramUIPluginImagesEx.IMG_HANDLE_OUTGOING_SOUTH);
        } else {
            return isIncoming() ? diagramUIPluginImagesEx
                .get(diagramUIPluginImagesEx.IMG_HANDLE_INCOMING_NORTH)
                : diagramUIPluginImagesEx
                    .get(diagramUIPluginImagesEx.IMG_HANDLE_OUTGOING_NORTH);
        }
	}

    @Override
    protected DragTracker createDragTracker() {
        return new BpmnConnectionHandleTool(this);
    }
    
	private static final ImageFigure ERROR_IMAGE = new ImageFigure(SharedImages
		.get(SharedImages.IMG_ERROR));
	   @Override
	public void validate() {
		if (isValid())
			return;
		removeAll();
		int side = ((ConnectionHandleLocator) getLocator())
			.getBorderSide();
		Image image = getImage(side);
		ImageFigure imageFigure = new ImageFigure(image);
		imageFigure.setSize(image.getBounds().width, image.getBounds().height);
		
		add(imageFigure);
		
		setSize(imageFigure.getSize().getUnioned(ERROR_IMAGE.getSize()));
		super.validate();
	}
}
