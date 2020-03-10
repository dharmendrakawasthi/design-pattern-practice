package com.techendear.builder;

public class MainClass {

	public static void main(String[] args) {
		
		Vehical car = new Vehical.VehicleBuilder("1500cc", 4).setAirbags(4).build();
		Vehical bike = new Vehical.VehicleBuilder("250cc", 2).build();
		
		System.out.println(car.getEngine());
		System.out.println(car.getWheel());
		System.out.println(car.getAirbags());
		
		System.out.println(bike.getEngine());
		System.out.println(bike.getWheel());
	}
}
