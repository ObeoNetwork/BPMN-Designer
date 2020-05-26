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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.NotificationFilter.Custom;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.obeonetwork.dsl.bpmn2.SubProcess;

/**
 * This triggers hide views that are contained in a collapsed subprocess.
 */
public class CollapsedSubProcessTrigger implements ModelChangeTrigger {

	protected static final NotificationFilter COLLAPSED_SUBPROCESS_FILTER = new Custom() {
		@Override
		public boolean matches(Notification notification) {
			return notification.getNotifier() instanceof DNodeContainer
					&& ((((DNodeContainer) notification.getNotifier()).getTarget() instanceof SubProcess)
							&& ExpandCollapseService.isCollapsed((DNodeContainer) notification.getNotifier()));
		}
	};

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.sirius.business.api.session.ModelChangeTrigger#priority()
	 */
	@Override
	public int priority() {
		return 0;
	}

	@Override
	public Option<Command> localChangesAboutToCommit(Collection<Notification> notifications) {
		Option<Command> result = null;

		final List<DNodeContainer> dNodes = new ArrayList<DNodeContainer>();
		for (Notification notification : notifications) {
			if (notification.getNotifier() instanceof DNodeContainer) {
				dNodes.add((DNodeContainer) notification.getNotifier());
			}
		}

		if (dNodes.isEmpty()) {
			return Options.<Command>newNone();
		}

		TransactionalEditingDomain ted = (TransactionalEditingDomain) AdapterFactoryEditingDomain
				.getEditingDomainFor(dNodes.get(0));
		Command rc = new RecordingCommand(ted) {
			@Override
			protected void doExecute() {
				for (DNodeContainer dNode : dNodes) {
					ExpandCollapseService.collapse(dNode);
				}
			}
		};

		result = Options.fromNullable(rc);

		return result != null ? result : Options.<Command>newNone();
	}

}
