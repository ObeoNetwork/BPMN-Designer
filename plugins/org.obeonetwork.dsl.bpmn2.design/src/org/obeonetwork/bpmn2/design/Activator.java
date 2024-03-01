/**
 * Copyright (c) 2011-2024 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.bpmn2.design;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	
    private static final String PATH_SEPARATOR = "/";
    
	// The plug-in ID
	public static final String PLUGIN_ID = "org.obeonetwork.dsl.bpmn2.design";
	public static final String DESIGN_PATH = PLUGIN_ID + "/description/BPMN2.odesign";
	// The shared instance
	private static Activator plugin;

	private Set<Viewpoint> viewpoints;
	private ResourceBundle i10n;
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		viewpoints = ViewpointRegistry.getInstance().registerFromPlugin(DESIGN_PATH);
		i10n = Platform.getResourceBundle(getBundle());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		if (viewpoints != null) {
			for (final Viewpoint viewpoint : viewpoints) {
				ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
			}
			viewpoints = null;
		}
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	/**
	 * A helper to log plugin errors.
	 * 
	 * @param severity
	 *            the error severity.
	 * @param message
	 *            the error message.
	 * @param exception
	 *            the error exception.
	 */
	public static void log(int severity, String message, Throwable exception) {
		getDefault().getLog().log(new Status(severity, PLUGIN_ID, message, exception));
	}
	
    /**
     * Returns a icon from this plugin.
     *
     * @param path
     *     (local) of image
     * @return image or null
     */
    public Image getImage(String path) {
        return getImage(PLUGIN_ID, path);
    }

    /**
     * Returns a icon from a plugin.
     *
     * @param bundleId
     *     plugin containing the image
     * @param path
     *     of image
     * @return image or null
     */
    public Image getImage(String bundleId, String path) {
        String key = bundleId + PATH_SEPARATOR + path;
        if (getImageRegistry().getDescriptor(key) == null) {
            // put must unique.
            Bundle bundle = Platform.getBundle(bundleId == null
                ? PLUGIN_ID
                : bundleId);
            URL url = bundle != null
                ? bundle.getResource(path)
                : null;
            getImageRegistry().put(key, ImageDescriptor.createFromURL(url));
        }
        return getImageRegistry().get(key);
    }

    /**
     * Returns a icon from a plugin where 1rst segment is a plugin.
     *
     * @param bundleId
     *     plugin containing the image
     * @param path
     *     of image
     * @return image or null
     */
    public Image getImageFromPath(String path) {
        if (path == null || path.isEmpty()) {
            return null;
        }
        if (path.startsWith(PATH_SEPARATOR)) {
            return getImageFromPath(path.substring(PATH_SEPARATOR.length()));
        }
        int token = path.indexOf(PATH_SEPARATOR);
        if (token == -1) { // Invalid path (not critical)
            return null;
        }
        return getImage(path.substring(0, token), path.substring(token + PATH_SEPARATOR.length()));
    }
    
    
    public static ResourceBundle getI10n() {
    	return getDefault().i10n;
    }
}
