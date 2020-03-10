package com.techendear.factory;

public class VehicleFactory {

	public static Vehical getInstance(String type, int wheels) {
		
		if(type == "car") {
			return new Car(wheels);
		}else if (type == "bike") {
			return new Bike(wheels);
		}
		return null;
	}
}
