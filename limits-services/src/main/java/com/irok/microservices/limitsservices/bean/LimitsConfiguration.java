package com.irok.microservices.limitsservices.bean;

public class LimitsConfiguration {
	
	private int minimum;
	private int maximum;
	protected LimitsConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LimitsConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public int getMaximum() {
		return maximum;
	}

}
