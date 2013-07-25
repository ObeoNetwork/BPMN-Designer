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



import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.obeonetwork.bpmn2.design.Activator;
import org.osgi.framework.Bundle;

/**
 * 
 * @author BIlchyshyn
 * @author Intalio Inc
 */
public class DiagramUIPluginImagesEx extends AbstractUIPlugin{

	/**
	 * The icons root directory.
	 */
	static final String PREFIX_ROOT = "icons/handles/"; //$NON-NLS-1$

    public  final String IMG_HANDLE_INCOMING_SOUTH = PREFIX_ROOT + "handle_incoming_south.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_OUTGOING_SOUTH = PREFIX_ROOT + "handle_outgoing_south.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_INCOMING_NORTH = PREFIX_ROOT + "handle_incoming_north.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_OUTGOING_NORTH = PREFIX_ROOT + "handle_outgoing_north.gif"; //$NON-NLS-1$
    
    public  final String IMG_HANDLE_INCOMING_ASSOCIATION_SOUTH = PREFIX_ROOT + "handle_incoming_association_south.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_INCOMING_ASSOCIATION_EAST = PREFIX_ROOT + "handle_incoming_association_east.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_INCOMING_ASSOCIATION_WEST = PREFIX_ROOT + "handle_incoming_association_west.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_INCOMING_ASSOCIATION_NORTH = PREFIX_ROOT + "handle_incoming_association_north.gif"; //$NON-NLS-1$
    
    public  final String IMG_HANDLE_OUTGOING_ASSOCIATION_SOUTH = PREFIX_ROOT + "handle_outgoing_association_south.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_OUTGOING_ASSOCIATION_EAST = PREFIX_ROOT + "handle_outgoing_association_east.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_OUTGOING_ASSOCIATION_WEST = PREFIX_ROOT + "handle_outgoing_association_west.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_OUTGOING_ASSOCIATION_NORTH = PREFIX_ROOT + "handle_outgoing_association_north.gif"; //$NON-NLS-1$

    public  final String IMG_HANDLE_INCOMING_FLOW_EAST = PREFIX_ROOT + "handle_incoming_flow_east.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_INCOMING_FLOW_WEST = PREFIX_ROOT + "handle_incoming_flow_west.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_OUTGOING_FLOW_EAST = PREFIX_ROOT + "handle_outgoing_flow_east.gif"; //$NON-NLS-1$
    public  final String IMG_HANDLE_OUTGOING_FLOW_WEST = PREFIX_ROOT + "handle_outgoing_flow_west.gif"; //$NON-NLS-1$
    
	/** 
	 * @param imageName
	 *            the full filename of the image
	 * @return the image or null if it has not been cached in the registry
	 */
    public  Image get(String imageName) {
		return getBundledImage(imageName);
	}
//TODO me
    public  Image getBundledImage(String path) {
        ImageDescriptor descriptor = getImageRegistry().getDescriptor(path);
        if (descriptor == null) {
            getImageRegistry().put(path, getBundledImageDescriptor(path));
        }
        return getImageRegistry().get(path);
    }
	
    public static  ImageDescriptor getBundledImageDescriptor(String path) {
        return AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, path);
    }
 
	

}

