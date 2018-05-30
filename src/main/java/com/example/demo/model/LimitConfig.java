package com.example.demo.model;

public class LimitConfig {

	private int max;
	private int min;
	
	public LimitConfig() {
		super();
	}

	public LimitConfig(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public int getMin() {
		return min;
	}
}
