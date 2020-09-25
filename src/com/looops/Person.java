package com.looops;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Person {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BiFunction<Context, List<RatedAction>, List<Action>> getActionChooser() {
		if (id == 3) {
			return (context, available) ->{

				// 1. sort
				List<Action> rated = available.stream().sorted(comparing(RatedAction::getRating).reversed()).map(RatedAction::getAction).collect(toList());

				Stimulus squash = new Stimulus("Squash", BigDecimal.ONE);
				if (context.getExternalSituations().containsKey(squash) && context.getExternalSituations().get(squash).compareTo(new BigDecimal("0.34")) > 0) {
					// valide Squash Situation für Person 3
					List<Action> result = new ArrayList<>();
					if (rated.size() > 0) {
						result.add(rated.get(0));
					}
					if (rated.size() > 1) {
						result = new ArrayList<>();
						if (Math.random() < 0.5) {
							result.add(rated.get(0));
						} else {
							result.add(rated.get(1));
						}
					}
					return result;
				}else{
					List<Action> result = new ArrayList<>();
					if (rated.size() > 0) {
						result.add(rated.get(0));
					}
					if (rated.size() > 1) {
						result.add(rated.get(1));
					}

					return result;
				}
			};
		}
		return (context, available) ->{

			// 1. sort
			List<Action> rated = available.stream().sorted(comparing(RatedAction::getRating).reversed()).map(RatedAction::getAction).collect(toList());

			List<Action> result = new ArrayList<>();
			if (rated.size() > 0) {
				result.add(rated.get(0));
			}
			if (rated.size() > 1) {
				result.add(rated.get(1));
			}

			return result;
		};
	}
}
