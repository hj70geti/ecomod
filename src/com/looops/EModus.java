package com.looops;

import java.util.EnumSet;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public enum EModus {

	//@formatter:off
		VIS_SIMPLE(      0,    "Visueller Wahrnehmungsmodus"),
		AUD_SIMPLE(    0,    "Auditiver Wahrnehmungsmodus"),

		EMO_COMPLEX(  1,    "Emotionaler Wahrnehmungsmodus"),
		PHY_COMPLEX(   1,    "Körperlicher Wahrnehmungsmodus"),
	//@formatter:on
	;
	public final static Map<String, EModus> map = EnumSet.allOf(EModus.class).stream().collect(toMap(EModus::name, e -> e));

	private final int    comlexity;
	private final String description;

	EModus(int comlexity, String description) {
		this.comlexity = comlexity;
		this.description = description;
	}

	public int getComlexity() {
		return comlexity;
	}

	public String getDescription() {
		return description;
	}
}
