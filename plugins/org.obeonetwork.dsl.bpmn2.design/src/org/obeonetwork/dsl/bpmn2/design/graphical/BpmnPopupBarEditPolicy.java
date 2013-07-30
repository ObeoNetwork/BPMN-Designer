package org.obeonetwork.dsl.bpmn2.design.graphical;

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

import fr.obeo.dsl.viewpoint.ViewpointPackage;
import fr.obeo.dsl.viewpoint.description.tool.AbstractToolDescription;
import fr.obeo.dsl.viewpoint.description.tool.ContainerCreationDescription;
import fr.obeo.dsl.viewpoint.description.tool.EdgeCreationDescription;
import fr.obeo.dsl.viewpoint.description.tool.NodeCreationDescription;
import fr.obeo.dsl.viewpoint.description.tool.PaneBasedSelectionWizardDescription;
import fr.obeo.dsl.viewpoint.description.tool.SelectionWizardDescription;
import fr.obeo.dsl.viewpoint.description.tool.ToolDescription;
import fr.obeo.dsl.viewpoint.diagram.internal.edit.parts.SquareEditPart;

public class BpmnPopupBarEditPolicy extends DiagramAssistantEditPolicy {
    private static boolean isHandleCurrentlyShowing = false;
	private static final Collection<String> ALLOWED_TOOL_LABELS = Arrays
			.asList("Connected objects");

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
			getHost().getViewer().getVisualPartMap().put(handle, getHost());
		}
		if (!shouldAvoidHidingDiagramAssistant()) {
			hideDiagramAssistantAfterDelay(1000);
		}

	}

	protected List<ConnectionHandle> getHandleFigures(int borderSide) {
		List<ConnectionHandle> list = new ArrayList<ConnectionHandle>();

		List<IElementType> srcEltTypes = getSourceElementTypes();
		List<IElementType> tgtEltTypes = getTargetElementTypes();
		switch (borderSide) {
		case PositionConstants.WEST:
			list.add(new ConnectionHandleEx((IGraphicalEditPart) getHost(),
					HandleDirection.INCOMING,
					buildTooltip(HandleDirection.INCOMING)));
			break;
		case PositionConstants.EAST:
			list.add(new ConnectionHandleEx((IGraphicalEditPart) getHost(),
					HandleDirection.OUTGOING,
					buildTooltip(HandleDirection.OUTGOING)));
			break;
		}
		setMessagingEdgeHandleFigures(borderSide, list, srcEltTypes,
				tgtEltTypes);
		setAssociationHandleFigures(borderSide, list, srcEltTypes, tgtEltTypes);
		return list;
	}

	protected void setMessagingEdgeHandleFigures(int borderSide, List<ConnectionHandle> list,
            List<IElementType> srcEltTypes, List<IElementType> tgtEltTypes) {
        switch (borderSide) {
        case PositionConstants.SOUTH:
        case PositionConstants.NORTH:
                list.add(new ConnectionHandleEx((IGraphicalEditPart) getHost(),
                        HandleDirection.INCOMING, 
                        buildTooltip(HandleDirection.INCOMING)));
                list.add(new ConnectionHandleEx((IGraphicalEditPart) getHost(),
                        HandleDirection.OUTGOING, 
                        buildTooltip(HandleDirection.OUTGOING)));
        }
    }

	protected void setAssociationHandleFigures(int borderSide, List<ConnectionHandle> list,
	        List<IElementType> srcEltTypes, List<IElementType> tgtEltTypes) {
        
            list.add(new ConnectionHandleForAssociation(
                    (IGraphicalEditPart) getHost(),
                    HandleDirection.OUTGOING, "Association")); //$NON-NLS-1$
            list.add(new ConnectionHandleForAssociation(
                    (IGraphicalEditPart) getHost(),
                    HandleDirection.INCOMING, "Association")); //$NON-NLS-1$
	}


	protected String buildTooltip(HandleDirection direction) {
		//TODO
		return ""; 
		
	}

	@SuppressWarnings("unchecked")//$NON-NLS-1$
	protected List<IElementType> getSourceElementTypes() {
		return ModelingAssistantService.getInstance().getRelTypesOnSource(
				getHost());
	}

	@SuppressWarnings("unchecked")//$NON-NLS-1$
	protected List<IElementType> getTargetElementTypes() {
		return ModelingAssistantService.getInstance().getRelTypesOnTarget(
				getHost());
	}
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
		Point mouse = getMouseLocation().getCopy();
		Rectangle bounds = getOwnerBounds(getHostFigure());
	
		return bounds.contains(mouse);
	}
	private boolean isSelectionToolActive()
	{
		if(getHost().getParent() != null) {
			Tool theTool = getHost().getViewer().getEditDomain().getActiveTool();
			if((theTool != null) && theTool instanceof SelectionTool) {
				return true;
			}
		}
		return false;		
	}
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
				return new BpmnConnectionHandleLocator(getHostFigure(),
						referencePoint, borderSide);
			}

		}

		return new ConnectionHandleLocator(getHostFigure(), referencePoint);
	}

	
	
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

	

	private static int HANDLE_SPACING = 15;

	private class BpmnConnectionHandleLocator extends ConnectionHandleLocator {

		private int borderSide;

		public BpmnConnectionHandleLocator(IFigure shape, Point reference,
				int borderSide) {
			super(shape, reference);
			this.borderSide = borderSide;
		}

		public void relocate(IFigure target) {
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
			}
			Point targetLocation = getCursorPosition().getCopy().translate(
					offset);
			target.translateToRelative(targetLocation);
			target.setLocation(targetLocation);

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

	protected boolean isDiagramAssistant(Object object) {
		return object instanceof ConnectionHandle;
	}

	protected boolean isDiagramAssistantShowing() {
		return handles != null;
	}
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
