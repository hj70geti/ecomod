package com.looops;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.looops.EModus.AUD_SIMPLE;
import static com.looops.EModus.EMO_COMPLEX;
import static com.looops.EModus.PHY_COMPLEX;
import static com.looops.EModus.VIS_SIMPLE;
import static java.math.RoundingMode.HALF_UP;
import static java.util.stream.Collectors.toList;

public class StimulusPerception {

	private static final BigDecimal B_200 = new BigDecimal("200");
	private static final BigDecimal B_50  = new BigDecimal("50");
	private static final BigDecimal B_0_5 = new BigDecimal(".5");
	private static final BigDecimal PI    = new BigDecimal(Math.PI);

	/**
	 *
	 */
	public static List<Stimulus> saliencing(Person person, List<Stimulus> stimuli, List<InternalSituation> internals) {

		List<Stimulus> vis = stimuli.stream().filter(s -> s.getModus() == VIS_SIMPLE).peek(s -> adjustSalience(s, internals)).collect(toList());
		List<Stimulus> aud = stimuli.stream().filter(s -> s.getModus() == AUD_SIMPLE).peek(s -> adjustSalience(s, internals)).collect(toList());
		List<Stimulus> emo = stimuli.stream().filter(s -> s.getModus() == EMO_COMPLEX).peek(s -> adjustSalience(s, internals)).collect(toList());
		List<Stimulus> phy = stimuli.stream().filter(s -> s.getModus() == PHY_COMPLEX).peek(s -> adjustSalience(s, internals)).collect(toList());

		List<Stimulus> result = new ArrayList<>();
		result.addAll(vis);
		result.addAll(aud);
		result.addAll(emo);
		result.addAll(phy);
		return result;
	}

	private static void adjustSalience(Stimulus stimulus, List<InternalSituation> internals) {
		InternalSituation internal = internals.stream().filter(i -> i.getName().equals(stimulus.getName())).findFirst().orElse(null);
		if (internal != null) {
			BigDecimal s = stimulus.getSalience();
			BigDecimal i = internal.getSalience();
			BigDecimal adjusted = new BigDecimal(Math.sin(s.add(i).divide(B_200, 6, HALF_UP).add(B_0_5).multiply(PI).negate().doubleValue())).multiply(B_50)
			                                                                                                                                 .add(B_50);
			stimulus.setSalience(adjusted);
		}
	}
}
