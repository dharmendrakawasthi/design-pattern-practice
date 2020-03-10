package com.techendear.factory;

public abstract class Vehical {

	public abstract int getWheel();

	@Override
	public String toString() {
		return "Wheels " + this.getWheel();
	}
}
