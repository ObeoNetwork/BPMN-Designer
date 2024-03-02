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

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.obeonetwork.bpmn2.design.ui.wizards.newmodel.Messages;
import org.obeonetwork.dsl.bpmn2.Bpmn2Factory;
import org.obeonetwork.dsl.bpmn2.Definitions;

/**
 * An operation to create and initialize a new session with empty semantic BPMN
 * model.
 * 
 * @author ymortier
 */
public class SessionCreationOperation extends WorkspaceModifyOperation {

	/**
	 * The type name of a bpmn2.Definitions element.
	 */
	public static final String DEFINITIONS_OBJECT = "Definitions"; //$NON-NLS-1$

	/**
	 * An {@link IFile} handle representing the semantic model to create.
	 */
	private IFile modelFile;

	/**
	 * The name of the semantic root element.
	 */
	private String rootObjectName;

	/**
	 * The session created after the execution of the operation.
	 */
	private Session createdSession;

	/**
	 * Constructor.
	 * 
	 * @param modelFile
	 *            An {@link IFile} handle representing the semantic model to
	 *            create.
	 * @param airdFile
	 *            An {@link IFile} handle representing the session file to
	 *            create.
	 * @param rootObjectName
	 *            The name of the semantic root element.
	 */
	public SessionCreationOperation(IFile modelFile, String rootObjectName) {
		super(null);
		this.modelFile = modelFile;
		this.rootObjectName = rootObjectName;
	}

	public Session getCreatedSession() {
		return createdSession;
	}

	@Override
	protected void execute(final IProgressMonitor monitor)
			throws CoreException, InterruptedException {

		createModelContent();

		// Ensure proper representation
		IProject prj = modelFile.getProject();
		if (prj != null) {
			
			if (!ModelingProject.hasModelingProjectNature(prj)) {
				// Convert project to Modeling project
				ModelingProjectManager.INSTANCE.convertToModelingProject(prj, monitor);
			}
			final Option<ModelingProject> created = ModelingProject
					.asModelingProject(prj);
			if (created.some()) {
				addProcessViewpoint(created.get(), monitor);
			}
		}
	}

	private void createModelContent() {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap()
				.putAll(EcorePlugin.computePlatformURIMap(false));

		// Get the URI of the model file.
		final URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

		final EObject rootObject = createInitialModel();

		Resource res = resourceSet.createResource(fileURI);
		res.getContents().add(rootObject);

		//
		try {
			res.save(Collections.EMPTY_MAP);
		} catch (final IOException e) {
			Activator
					.log(IStatus.ERROR,
							Messages.Bpmn2ModelWizard_UI_Error_CreatingBpmn2ModelSession,
							e);
		}
	}

	private void addProcessViewpoint(ModelingProject project, final IProgressMonitor monitor) {
		Session session = project.getSession();
		TransactionalEditingDomain edt = session.getTransactionalEditingDomain();
		
		edt.getCommandStack().execute(new RecordingCommand(edt) {

			@Override
			protected void doExecute() {
				for (Viewpoint vp : ViewpointRegistry.getInstance().getViewpoints()) {
					if (isProcessViewPoint(vp)) {
						new ViewpointSelectionCallback()
							.selectViewpoint(vp, session, monitor);
					}
				}
			}
		});
	}

	private static boolean isProcessViewPoint(Viewpoint vp) {
		return "Process".equals(vp.getName())
			&& vp.eResource().getURI().toString().endsWith(Activator.DESIGN_PATH);
	}
	
	/**
	 * Creates the semantic root element from the given operation arguments.
	 * 
	 * @return the semantic root {@link EObject}
	 */
	private EObject createInitialModel() {
		Definitions root = null;
		if (DEFINITIONS_OBJECT.equals(rootObjectName)) {
			root = Bpmn2Factory.eINSTANCE.createDefinitions();
			root.setName(Messages.Bpmn2ModelWizard_DefaultDefinitionslName);
		}
		return root;
	}
}
