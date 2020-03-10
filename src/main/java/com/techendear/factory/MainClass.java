package com.techendear.factory;

public class MainClass {

	public static void main(String[] args) {
		Vehical car = VehicleFactory.getInstance("car", 4);
		System.out.println(car);
		Vehical bike = VehicleFactory.getInstance("bike", 2);
		System.out.println(bike);
	}
}
