package com.techendear.factory;

public class Bike extends Vehical {

	int wheels;

	public Bike(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public int getWheel() {
		return this.wheels;
	}
}
