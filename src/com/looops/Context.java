package com.looops;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Context {

	private List<Stimulus>            stimuli;
	private Map<Stimulus, BigDecimal> externalSituations;

	public List<Stimulus> getStimuli() {
		return stimuli;
	}

	public void setStimuli(List<Stimulus> stimuli) {
		this.stimuli = stimuli;
	}

	// Die Map Bewetrung ist auch gelernt, später im Äther

	public Map<Stimulus, BigDecimal> getExternalSituations() {
		return externalSituations;
	}

	public void setExternalSituations(Map<Stimulus, BigDecimal> externalSituations) {
		this.externalSituations = externalSituations;
	}
}
