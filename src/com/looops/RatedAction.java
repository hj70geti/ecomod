package com.looops;

import java.math.BigDecimal;

public class RatedAction {

	private Action     action;
	private BigDecimal rating;

	public RatedAction(Action action, BigDecimal rating) {
		this.action = action;
		this.rating = rating;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}
}
