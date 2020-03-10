package com.techendear.factory;

public class Car extends Vehical{

	int wheel;
	public Car(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {
		return this.wheel;
	}
}
