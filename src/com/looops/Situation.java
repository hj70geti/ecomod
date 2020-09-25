package com.looops;

import java.math.BigDecimal;

public class Situation {

	private String name;
	private BigDecimal salience;
	private EModus modus;

	public Situation(String name, BigDecimal salience, EModus modus) {
		this.name = name;
		this.salience = salience;
		this.modus = modus;
	}

	public EModus getModus() {
		return modus;
	}

	public void setModus(EModus modus) {
		this.modus = modus;
	}

	public BigDecimal getSalience() {
		return salience;
	}

	public void setSalience(BigDecimal salience) {
		this.salience = salience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
