/**
 * Copyright (c) 2011-2019 Obeo.
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.sirius.diagram.DNode;
import org.obeonetwork.dsl.bpmn2.BaseElement;
import org.obeonetwork.dsl.bpmn2.CancelEventDefinition;
import org.obeonetwork.dsl.bpmn2.CatchEvent;
import org.obeonetwork.dsl.bpmn2.CompensateEventDefinition;
import org.obeonetwork.dsl.bpmn2.ConditionalEventDefinition;
import org.obeonetwork.dsl.bpmn2.DataInput;
import org.obeonetwork.dsl.bpmn2.DataOutput;
import org.obeonetwork.dsl.bpmn2.DataStore;
import org.obeonetwork.dsl.bpmn2.ErrorEventDefinition;
import org.obeonetwork.dsl.bpmn2.EscalationEventDefinition;
import org.obeonetwork.dsl.bpmn2.EventDefinition;
import org.obeonetwork.dsl.bpmn2.FlowElement;
import org.obeonetwork.dsl.bpmn2.LinkEventDefinition;
import org.obeonetwork.dsl.bpmn2.MessageEventDefinition;
import org.obeonetwork.dsl.bpmn2.SignalEventDefinition;
import org.obeonetwork.dsl.bpmn2.TerminateEventDefinition;
import org.obeonetwork.dsl.bpmn2.ThrowEvent;
import org.obeonetwork.dsl.bpmn2.TimerEventDefinition;

import com.google.common.base.Strings;

/**
 * 
 * @author sdrapeau
 *
 */
public class NamingService {

	/** Label provider */
	protected static final AdapterFactoryLabelProvider LABEL_PROVIDER = new AdapterFactoryLabelProvider(
			new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));

	public String getPropertiesTitle(EObject eObj) {
		String msg = Messages.NamingService_0;
		msg = msg + LABEL_PROVIDER.getText(eObj);
		return msg;
	}

	public String getCancelLabel(EObject eObj) {
		return Messages.CancelLabel;
	}

	public String getAttributesLabel(EObject eObj) {
		return Messages.AttributesLabel;
	}

	public String getNameLabel(EObject eObj) {
		return Messages.NameLabel;
	}

	public String getHelpNameLabel(EObject eObj) {
		return Messages.HelpNameLabel;
	}

	public String getDescriptionLabel(EObject eObj) {
		return Messages.DescriptionLabel;
	}

	public String getHelpDescriptionLabel(EObject eObj) {
		return Messages.HelpDescriptionLabel;
	}

	public static String getNonExternalLabel(BaseElement fn, DNode dNode) {
		if (ServiceHelper.isExternalLabel(dNode)) {
			return null;
		}

		String name = getLabel(fn);

		return name == null ? "" : name;
	}
	
	public static String getLabel(BaseElement fn) {
		String name = "";
		if (fn instanceof FlowElement) {
			name = ((FlowElement) fn).getName();
		} else if (fn instanceof DataInput) {
			name = ((DataInput) fn).getName();
		} else if (fn instanceof DataOutput) {
			name = ((DataOutput) fn).getName();
		} else if (fn instanceof DataStore) {
			name = ((DataStore) fn).getName();
		}

		return name == null ? "" : name;
	}

	public static String getExternalLabel(BaseElement fn) {
		String result = "";

		String name = getLabel(fn);
		if (!Strings.isNullOrEmpty(name)) {
			result = name;
		}

		if (fn instanceof CatchEvent) {
			result = result.concat(getEventDefinitionLabels(((CatchEvent) fn).getEventDefinitions()));
		} else if (fn instanceof ThrowEvent) {
			result = result.concat(getEventDefinitionLabels(((ThrowEvent) fn).getEventDefinitions()));
		}

		return "".equals(result) ? null : result;
	}

	private static String getEventDefinitionLabels(EList<EventDefinition> eventDefinitions) {
		String result = "";
		if (eventDefinitions != null) {
			if (eventDefinitions.size() > 1) {
				for (EventDefinition ed : eventDefinitions) {
					result = result.concat("\n - ").concat(getEventDefinitionLabel(ed));
					if (!Strings.isNullOrEmpty(ed.getDescription())) {
						result = result.concat(" : ").concat(ed.getDescription());
					}
				}
			} else if (eventDefinitions.size() == 1
					&& !Strings.isNullOrEmpty(eventDefinitions.get(0).getDescription())) {
				EventDefinition ed = eventDefinitions.get(0);
				result = result.concat("\n - ").concat(getEventDefinitionLabel(ed)).concat(" : ")
						.concat(ed.getDescription());
			}
		}
		return result;
	}

	private static String getEventDefinitionLabel(EventDefinition ed) {
		String result = null;
		if (ed instanceof MessageEventDefinition) {
			result = "Message";
		} else if (ed instanceof TimerEventDefinition) {
			result = "Minuterie";
		} else if (ed instanceof EscalationEventDefinition) {
			result = "Remontée";
		} else if (ed instanceof ConditionalEventDefinition) {
			result = "Conditionnel";
		} else if (ed instanceof LinkEventDefinition) {
			result = "Lien";
		} else if (ed instanceof ErrorEventDefinition) {
			result = "Erreur";
		} else if (ed instanceof CancelEventDefinition) {
			result = "Annulation";
		} else if (ed instanceof CompensateEventDefinition) {
			result = "Compensation";
		} else if (ed instanceof SignalEventDefinition) {
			result = "Signal";
		} else if (ed instanceof TerminateEventDefinition) {
			result = "Fin";
		}

		return result;
	}

}
