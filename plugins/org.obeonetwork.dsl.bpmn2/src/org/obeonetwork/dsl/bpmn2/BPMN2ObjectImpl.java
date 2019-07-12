package org.obeonetwork.dsl.bpmn2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Base BPMN2 object.
 */
public abstract class BPMN2ObjectImpl extends EObjectImpl {

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
