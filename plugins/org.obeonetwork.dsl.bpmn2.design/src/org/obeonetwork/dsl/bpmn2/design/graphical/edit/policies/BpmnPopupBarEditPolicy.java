package org.obeonetwork.dsl.bpmn2.design.graphical.edit.policies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.Tool;
import org.eclipse.gmf.runtime.diagram.ui.handles.ConnectionHandle;

import org.eclipse.gef.tools.SelectionTool;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramAssistantEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.handles.ConnectionHandle.HandleDirection;
import org.eclipse.gmf.runtime.diagram.ui.handles.ConnectionHandleLocator;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantService;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;

import fr.obeo.dsl.viewpoint.ViewpointPackage;
import fr.obeo.dsl.viewpoint.description.tool.AbstractToolDescription;
import fr.obeo.dsl.viewpoint.description.tool.ContainerCreationDescription;
import fr.obeo.dsl.viewpoint.description.tool.EdgeCreationDescription;
import fr.obeo.dsl.viewpoint.description.tool.NodeCreationDescription;
import fr.obeo.dsl.viewpoint.description.tool.PaneBasedSelectionWizardDescription;
import fr.obeo.dsl.viewpoint.description.tool.SelectionWizardDescription;
import fr.obeo.dsl.viewpoint.description.tool.ToolDescription;
import fr.obeo.dsl.viewpoint.diagram.graphical.edit.policies.ViewPointPopupBarEditPolicy;
import fr.obeo.dsl.viewpoint.diagram.internal.edit.parts.SquareEditPart;
import fr.obeo.dsl.viewpoint.provider.ViewpointEditPlugin;

public class BpmnPopupBarEditPolicy extends DiagramAssistantEditPolicy {
	/**
     * static field to show one handle at the time.
     */
    private static boolean isHandleCurrentlyShowing = false;
	/**
	 * Predefined feature names used to retrieve names from {@link EBoject}s.
	 */
	private static final Collection<String> ALLOWED_TOOL_LABELS = Arrays
			.asList("Connected objects");

	/** list of connection handles currently being displayed */
	private List<ConnectionHandle> handles = null;

	

	/**
	 * TODO me
	 * */
	protected void showDiagramAssistant(Point referencePoint) {
		  isHandleCurrentlyShowing = true;
		if (referencePoint == null) {
			referencePoint = getHostFigure().getBounds().getRight();
		}
		ConnectionHandleLocator locator = getConnectionHandleLocator(referencePoint);
		handles = getHandleFigures(locator.getBorderSide());
		if (handles == null) {
			return;
		}
		IFigure layer = getLayer(LayerConstants.HANDLE_LAYER);
		for (Iterator iter = handles.iterator(); iter.hasNext();) {
			ConnectionHandle handle = (ConnectionHandle) iter.next();
			handle.setLocator(locator);
			locator.addHandle(handle);
			handle.addMouseMotionListener(this);
			layer.add(handle);
			// Register this figure with it's host editpart so mouse events
			// will be propagated to it's host.
			getHost().getViewer().getVisualPartMap().put(handle, getHost());
		}
		if (!shouldAvoidHidingDiagramAssistant()) {
			// dismiss the handles after a delay
			// hideDiagramAssistantAfterDelay(getDisappearanceDelay());
			hideDiagramAssistantAfterDelay(2000);
		}

	}

	/**
	 * Gets the two connection handle figures to be added to this shape if they
	 * support user gestures.
	 * 
	 * @param borderSide
	 *            the border from which the cursor is the nearest.
	 * @return a list of <code>ConnectionHandle</code> objects
	 * 
	 *         This method creates the connection handles
	 */
	@SuppressWarnings("unchecked")//$NON-NLS-1$
	protected List<ConnectionHandle> getHandleFigures(int borderSide) {
		List<ConnectionHandle> list = new ArrayList<ConnectionHandle>();

		List<IElementType> srcEltTypes = getSourceElementTypes();
		List<IElementType> tgtEltTypes = getTargetElementTypes();

		// only add handles according to the position
		// of the handle, depending on which type is in the selection.
		switch (borderSide) {
		case PositionConstants.WEST:
			// if (tgtEltTypes.contains(Bpmn2Package.SEQUENCE_FLOW)) {
			list.add(new ConnectionHandleEx((IGraphicalEditPart) getHost(),
					HandleDirection.INCOMING,
					buildTooltip(HandleDirection.INCOMING)));
			// / }
			break;
		case PositionConstants.EAST:
			// if (srcEltTypes.contains(Bpmn2Package.SEQUENCE_FLOW)) {
			list.add(new ConnectionHandleEx((IGraphicalEditPart) getHost(),
					HandleDirection.OUTGOING,
					buildTooltip(HandleDirection.OUTGOING)));
			// }
			break;
		}
		setMessagingEdgeHandleFigures(borderSide, list, srcEltTypes,
				tgtEltTypes);
		setAssociationHandleFigures(borderSide, list, srcEltTypes, tgtEltTypes);
		return list;
	}

	/**
	 * Adds to the list of handles the handles for the different types of
	 * associations This method is made to be overridden by a different
	 * implement should the need arise to have more or less and different types
	 * of association handles.
	 * 
	 * @param borderSide
	 * @param list
	 * @param srcEltTypes
	 * @param tgtEltTypes
	 */
	protected void setMessagingEdgeHandleFigures(int borderSide, List<ConnectionHandle> list,
            List<IElementType> srcEltTypes, List<IElementType> tgtEltTypes) {
        switch (borderSide) {
        case PositionConstants.SOUTH:
        case PositionConstants.NORTH:
            //if (tgtEltTypes.contains(Bpmn2Package.MESSAGE_FLOW)) {
                list.add(new ConnectionHandleEx((IGraphicalEditPart) getHost(),
                        HandleDirection.INCOMING, 
                        buildTooltip(HandleDirection.INCOMING)));
          ///  }
            //if (srcEltTypes.contains(Bpmn2Package.MESSAGE_FLOW)) {
                list.add(new ConnectionHandleEx((IGraphicalEditPart) getHost(),
                        HandleDirection.OUTGOING, 
                        buildTooltip(HandleDirection.OUTGOING)));
            //}
        }
    }

	/**
	 * Adds to the list of handles the handles for the different types of
	 * associations This method is made tobe overridden by a different implement
	 * should the need arise to have more or less and different types of
	 * association handles.
	 * 
	 * @param borderSide
	 * @param list
	 * @param srcEltTypes
	 * @param tgtEltTypes
	 */
	protected void setAssociationHandleFigures(int borderSide, List<ConnectionHandle> list,
	        List<IElementType> srcEltTypes, List<IElementType> tgtEltTypes) {
        
        // only add one of the two to avoid having
        // two similar handles on the associations.
       // if (srcEltTypes.contains(Bpmn2Package.ASSOCIATION)) {
            //add the outgoing association
            list.add(new ConnectionHandleForAssociation(
                    (IGraphicalEditPart) getHost(),
                    HandleDirection.OUTGOING, "Association")); //$NON-NLS-1$
    //    }
	//else if (tgtEltTypes.contains(Bpmn2Package.ASSOCIATION)) {
            //add the incoming association
            list.add(new ConnectionHandleForAssociation(
                    (IGraphicalEditPart) getHost(),
                    HandleDirection.INCOMING, "Association")); //$NON-NLS-1$
      //  }
	}
	/**
	 * Builds the applicable tooltip string based on whether the Modeling
	 * Assistant Service supports handle gestures on this element. If no
	 * gestures are supported, the tooltip returned will be null.
	 * 
	 * For now we assume that creation is supported when calling this method.
	 * 
	 * @param direction
	 *            the handle direction.
	 * @return tooltip the tooltip string; if null, the handle should be not be
	 *         displayed
	 */
	protected String buildTooltip(HandleDirection direction) {
		// ModelingAssistantService service = ModelingAssistantService
		// .getInstance();

		// boolean supportsCreation = (direction == HandleDirection.OUTGOING) ?
		// !service
		// .getRelTypesOnSource(getHost()).isEmpty()
		// : !service.getRelTypesOnTarget(getHost()).isEmpty();

		// boolean supportsSRE = (direction == HandleDirection.OUTGOING) ?
		// !service
		// .getRelTypesForSREOnSource(getHost()).isEmpty()
		// : !service.getRelTypesForSREOnTarget(getHost()).isEmpty();

		// if (supportsSRE) {
		// if (supportsCreation) {
		return ""; //$NON-NLS-1$
		// } else {
		// return
		// DiagramUIMessages.ConnectionHandle_ToolTip_ShowRelatedElementsOnly;
		// }
		// } else if (supportsCreation) {
		// return
		// DiagramUIMessages.ConnectionHandle_ToolTip_CreateRelationshipOnly;
		// }
		// return null;
	}

	/**
	 * By default relies on the GMF ModelingAssistantService to return the
	 * appropriate types This can be overriden by extension of the modeler.
	 * 
	 * @return The list of element types that could be source of a new
	 *         relationship
	 */
	@SuppressWarnings("unchecked")//$NON-NLS-1$
	protected List<IElementType> getSourceElementTypes() {
		return ModelingAssistantService.getInstance().getRelTypesOnSource(
				getHost());
	}

	/**
	 * By default relies on the GMF ModelingAssistantService to return the
	 * appropriate types This can be overriden by extension of the modeler.
	 * 
	 * @return The list of element types that could be target of a new
	 *         relationship
	 */
	@SuppressWarnings("unchecked")//$NON-NLS-1$
	protected List<IElementType> getTargetElementTypes() {
		return ModelingAssistantService.getInstance().getRelTypesOnTarget(
				getHost());
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramAssistantEditPolicy#shouldShowDiagramAssistant()
	 */
	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramAssistantEditPolicy#shouldShowDiagramAssistant()
	 */
	protected boolean shouldShowDiagramAssistant(){
	    if (isHandleCurrentlyShowing) {
	        return false;
	    }
        if (getAppearanceDelay() < 0) {
            return false;
        }
		if (!super.shouldShowDiagramAssistant()) {
			return false;
		}
		if (handles != null || !isSelectionToolActive()) {
			return false;
		}
		if (getMouseLocation() == null) {
		    return false;
		}
		// only show if in the top, bottom, left or right quarter
		Point mouse = getMouseLocation().getCopy();
		Rectangle bounds = getOwnerBounds(getHostFigure());
	//		if (getHost() instanceof GroupEditPart ||
	//		        getHost() instanceof Group2EditPart) {
	//            boolean onX = Math.abs(mouse.x - bounds.x) < 5 ||
	//                Math.abs(mouse.x - (bounds.x + bounds.width)) < 5;
	//            boolean onY = Math.abs(mouse.y - bounds.y) < 5 ||
	//                Math.abs(mouse.y - (bounds.y + bounds.height)) < 5;
	//            return ((onX || onY));
	//		}
		return bounds.contains(mouse);
	}
	private boolean isSelectionToolActive()
	{
		// getViewer calls getParent so check for null
		if(getHost().getParent() != null) {
			Tool theTool = getHost().getViewer().getEditDomain().getActiveTool();
			if((theTool != null) && theTool instanceof SelectionTool) {
				return true;
			}
		}
		return false;		
	}
	/**
     * Helper method to return the bounds of the owner,
     * or only the ones from its interesting feature.
     * We add a scale factor for the user
     * to place the cursor around the figure.
     * @param hostFigure the host figure
     * @return the bounds to create the anchor on.
     */
    protected Rectangle getOwnerBounds(IFigure hostFigure) {
        Rectangle bounds = null;
        for (Object child : hostFigure.getChildren()) {
            if (child instanceof SquareEditPart) { 
                for (Object childOfChild : ((SquareEditPart) child).getChildren()) {
                    
                        bounds = ((IFigure) childOfChild).getBounds().getCopy();
                        break;
                    
                }
            }
            if (bounds != null) {
                break;
            }
        }
        if (bounds == null) {
            bounds = hostFigure.getBounds().getCopy();
        }
        bounds.x -= bounds.width/4;
        bounds.y -= bounds.height/4;
        bounds.width += bounds.width/4;
        bounds.height += bounds.height/4;
        return bounds;
    }
    
	/**
	 * TODO me
	 * */
	private ConnectionHandleLocator getConnectionHandleLocator(
			Point referencePoint) {
		IFigure handleBoundFig = null;
		IGraphicalEditPart gap = (IGraphicalEditPart) getHost();
		// for now only event from task shape
		if (getHost() instanceof SquareEditPart) {
			SquareEditPart aep = (SquareEditPart) getHost();
			handleBoundFig = aep.getFigure();
		}
		if (handleBoundFig != null) {
			Rectangle bounds = handleBoundFig.getBounds().getCopy();
			if (bounds.x == 0) {
				handleBoundFig.translateToAbsolute(bounds);
				gap.getFigure().translateToRelative(bounds);
			}
			if (bounds.width != 0 && bounds.height != 0) {
				// we create the two equations representing the diagonals of the
				// rectangle
				// first the one starting from the top left and going to
				// the bottom right
				int borderSide = PositionConstants.NONE;
				boolean overFirstDiag = isOverALine(bounds.getBottomRight(),
						bounds.getTopLeft(), referencePoint);
				boolean overSecondDiag = isOverALine(bounds.getTopRight(),
						bounds.getBottomLeft(), referencePoint);
				if (overFirstDiag) {
					if (overSecondDiag) {
						referencePoint = bounds.getTop().getCopy();
						borderSide = PositionConstants.NORTH;
					} else {
						referencePoint = bounds.getRight().getCopy();
						borderSide = PositionConstants.EAST;
					}
				} else {
					if (overSecondDiag) {
						referencePoint = bounds.getLeft().getCopy();
						borderSide = PositionConstants.WEST;
					} else {
						referencePoint = bounds.getBottom().getCopy();
						borderSide = PositionConstants.SOUTH;
					}
				}
				getHostFigure().translateToAbsolute(referencePoint);
				return new ConnectionHandleLocatorEx(getHostFigure(),
						referencePoint, borderSide);
			}

		}

		return new ConnectionHandleLocator(getHostFigure(), referencePoint);
	}

	/**
	 * Evaluates wether a point is above a line formed by two other points
	 * 
	 * @param firstPoint
	 *            the first point to form the line
	 * @param secondPoint
	 *            the second point to form the line
	 * @param toEvaluate
	 *            the point to evaluate
	 * @return true if the point is above the line, false otherwise
	 */
	private boolean isOverALine(Point firstPoint, Point secondPoint,
			Point toEvaluate) {
		int xa = firstPoint.x;
		int ya = firstPoint.y;
		int xb = secondPoint.x;
		int yb = secondPoint.y;
		double coeff = (double) (yb - ya) / (xb - xa);
		double constant = (xb * ya - yb * xa) / (xb - xa);
		return toEvaluate.y < coeff * toEvaluate.x + constant;
	}

	

	/**
	 * Returns the type of element created by the specified
	 * {@link AbstractToolDescription} in the format expected by GMF, or
	 * <code>null</code> if the AbstractToolDescription's type is not supported.
	 */
	private IElementType getElementType(final AbstractToolDescription desc) {
		EClass klass = null;

		if (desc instanceof NodeCreationDescription) {
			klass = ViewpointPackage.eINSTANCE.getDNode();
		} else if (desc instanceof ContainerCreationDescription) {
			klass = ViewpointPackage.eINSTANCE.getDContainer();
		} else if (desc instanceof EdgeCreationDescription) {
			klass = ViewpointPackage.eINSTANCE.getDEdge();
		} else if (desc instanceof SelectionWizardDescription
				|| desc instanceof PaneBasedSelectionWizardDescription) {
			/*
			 * return a fake class as element type is not used by popup bar
			 * descriptor
			 */
			klass = ViewpointPackage.eINSTANCE.getDNode();
		} else if (desc instanceof ToolDescription) {
			/*
			 * return a fake class as element type is not used by popup bar
			 * descriptor
			 */
			klass = ViewpointPackage.eINSTANCE.getDNode();
		}

		if (klass != null) {
			return ElementTypeRegistry.getInstance().getElementType(klass);
		} else {
			return null;
		}
	}

	/** number of pixels between connection handles */
	private static int HANDLE_SPACING = 15;

	private class ConnectionHandleLocatorEx extends ConnectionHandleLocator {

		private int borderSide;

		public ConnectionHandleLocatorEx(IFigure shape, Point reference,
				int borderSide) {
			super(shape, reference);
			this.borderSide = borderSide;
		}

		public void relocate(IFigure target) {
			// set location based on side
			Dimension offset = Dimension.SINGLETON.getCopy();

			switch (borderSide) {
			case PositionConstants.NORTH:
				offset.height = -target.getBounds().height;
				break;
			case PositionConstants.EAST:
				break;
			case PositionConstants.SOUTH:
				break;
			case PositionConstants.WEST:
				offset.width = -target.getBounds().width;
				break;
			default:
				// nothing
			}
			Point targetLocation = getCursorPosition().getCopy().translate(
					offset);
			target.translateToRelative(targetLocation);
			target.setLocation(targetLocation);

			// space out handles
			int index = handles.indexOf(target);
			double centerOffset = index - (handles.size() / 2.0);

			if (borderSide == PositionConstants.WEST
					|| borderSide == PositionConstants.EAST) {
				target.translate(0, (int) (centerOffset * HANDLE_SPACING));
			} else {
				target.translate((int) (centerOffset * HANDLE_SPACING), 0);
			}

		}

		@Override
		public int getBorderSide() {
			return borderSide;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramAssistantEditPolicy
	 * #isDiagramAssistant(java.lang.Object)
	 */
	protected boolean isDiagramAssistant(Object object) {
		return object instanceof ConnectionHandle;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramAssistantEditPolicy#isDiagramAssistantShowing()
	 */
	protected boolean isDiagramAssistantShowing() {
		return handles != null;
	}

	/**
	 * Removes the connection handles.
	 */
	protected void hideDiagramAssistant() {
	    isHandleCurrentlyShowing = false;
		if (handles == null) {
			return;
		}
		IFigure layer = getLayer(LayerConstants.HANDLE_LAYER);
		for (ConnectionHandle handle : handles) {
			handle.removeMouseMotionListener(this);
			layer.remove(handle);
			getHost().getViewer().getVisualPartMap().remove(handle);
		}
		handles = null;
	}

}
