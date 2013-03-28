package org.obeonetwork.dsl.bpmn2.samples.pack.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.obeonetwork.dsl.bpmn2.samples.pack.core.l10n.Messages;
import org.obeonetwork.dsl.bpmn2.samples.wizards.Bpmn2Sample;

public class NobelPrizeSample extends Bpmn2Sample {

	
	
	public NobelPrizeSample() throws MalformedURLException {
		super(
				new URL(CoreSamplePlugin.getDefault().getZipURL()
						+ "examples/nobelprize.zip"), //$NON-NLS-1$
				Messages.Bpmn2NobelPrizeSample_title,
				Messages.Bpmn2NobelPrizeSample_desc,
				0,
				CoreSamplePlugin
						.getDefault()
						.findImageDescriptor(
								"/org.obeonetwork.dsl.bpmn2.samples.pack.core/images/nobelprize-logo.png")); //$NON-NLS-1$
	}
	
}
