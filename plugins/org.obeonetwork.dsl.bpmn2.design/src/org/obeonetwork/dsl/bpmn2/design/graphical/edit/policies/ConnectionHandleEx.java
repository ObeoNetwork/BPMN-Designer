/******************************************************************************
 * Copyright (c) 2006, Intalio Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Intalio Inc. - initial API and implementation
 *******************************************************************************/

package org.obeonetwork.dsl.bpmn2.design.graphical.edit.policies;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.DragTracker;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.handles.ConnectionHandle;
import org.eclipse.gmf.runtime.diagram.ui.handles.ConnectionHandleLocator;
import org.eclipse.gmf.runtime.diagram.ui.l10n.SharedImages;

import org.eclipse.swt.graphics.Image;

/**
 * @author BIlchyshyn override the getImage.
 * @author hmalphettes avoid direct edit.
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
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

    /**
     * The extended tool returned here will not go into direct-edit
     * at the end of the creation.
     * @see org.eclipse.gef.handles.AbstractHandle#createDragTracker()
     */
    @Override
    protected DragTracker createDragTracker() {
        return new ConnectionHandleToolEx(this);
    }
    
    /** the error icon that can be superimposed on the connection handle image */
	private static final ImageFigure ERROR_IMAGE = new ImageFigure(SharedImages
		.get(SharedImages.IMG_ERROR));
    /*
    * Updates the images used for the handles, based on the side they will
	 * appear on.  Sets the location of the handles using the locator.
	 * @see org.eclipse.draw2d.IFigure#validate()
	 */
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
