package org.obeonetwork.dsl.bpmn2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * Base BPMN2 object.
 */
public abstract class BPMN2ObjectImpl extends CDOObjectImpl {

	/**
	 * Default constructor.
	 */
	public BPMN2ObjectImpl() {
		super();
		EClass eClass = eClass();
		// BPMN2 meta model case : all object have an ID
		if (eClass.getEPackage().getName().equals("bpmn2")) {
			EAttribute idAttribute = eClass.getEIDAttribute();
			eSet(idAttribute, EcoreUtil.generateUUID());
		}
	}

}
