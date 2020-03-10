package com.techendear.prototype;

import java.util.List;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Vehical a = new Vehical();
		
		a.insertData();
		
		Vehical b = (Vehical) a.clone();
		List<String> list = b.getVehicleList();
		list.add("Honda new Amaze");
		
		
		System.out.println(a.getVehicleList());
		System.out.println(list);
		
		b.getVehicleList().remove("Audi A4");
		
		System.out.println(list);
		
	}
}
