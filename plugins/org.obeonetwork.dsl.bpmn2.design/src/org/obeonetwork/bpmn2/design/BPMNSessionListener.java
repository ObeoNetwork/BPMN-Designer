/**
 * Copyright (c) 2011-2020 Obeo.
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

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * @author sdrapeau
 */
public class BPMNSessionListener implements SessionManagerListener {

	private ExternalLabelTrigger externalLabelTrigger = new ExternalLabelTrigger();
	
	private CollapsedSubProcessTrigger collapsedSubProcessTrigger = new CollapsedSubProcessTrigger();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.sirius.business.api.session.SessionManagerListener#notify(org
	 * .eclipse.sirius.business.api.session.Session, int)
	 */
	@Override
	public void notify(Session session, int notificationKind) {
		// do nothing
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.SessionManagerListener#
	 * notifyAddSession(org.eclipse.sirius.business.api.session.Session)
	 */
	@Override
	public void notifyAddSession(Session session) {
		session.getEventBroker().addLocalTrigger(ExternalLabelTrigger.EXTERNAL_LABEL_FILTER, this.externalLabelTrigger);
		session.getEventBroker().addLocalTrigger(CollapsedSubProcessTrigger.COLLAPSED_SUBPROCESS_FILTER, this.collapsedSubProcessTrigger);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.SessionManagerListener#
	 * notifyRemoveSession(org.eclipse.sirius.business.api.session.Session)
	 */
	@Override
	public void notifyRemoveSession(Session session) {
		session.getEventBroker().removeLocalTrigger(this.externalLabelTrigger);
		session.getEventBroker().removeLocalTrigger(this.collapsedSubProcessTrigger);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.SessionManagerListener#
	 * viewpointDeselected(org.eclipse.sirius.viewpoint.description.Viewpoint)
	 */
	@Override
	public void viewpointDeselected(Viewpoint viewpoint) {
		// do nothing
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.SessionManagerListener#
	 * viewpointSelected(org.eclipse.sirius.viewpoint.description.Viewpoint)
	 */
	@Override
	public void viewpointSelected(Viewpoint arg0) {
		// do nothing
	}

}
