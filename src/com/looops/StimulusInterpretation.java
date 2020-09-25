package com.looops;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StimulusInterpretation {


	// instrumental learning

	public List<RatedAction> interprete(Person person, Context context, List<Action> tools) {


		List<RatedAction> result = new ArrayList<>();
		
		for (Action tool : tools) {
			result.add(new RatedAction(tool, BigDecimal.ONE));
		}

		return result;
	}
}
