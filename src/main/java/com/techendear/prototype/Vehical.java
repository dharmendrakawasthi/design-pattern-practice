package com.techendear.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehical implements Cloneable {

	private List<String> vehicles;

	public Vehical() {
		this.vehicles = new ArrayList<String>();
	}

	public Vehical(List<String> tempList) {
		
		this.vehicles = tempList;
	}

	public void insertData() {
		vehicles.add("Honda City");
		vehicles.add("Audi A4");
		vehicles.add("Hyundai Creta");
	}

	public List<String> getVehicleList() {
		return vehicles;
	}

	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<String>();

		for (String s : this.getVehicleList()) {
			tempList.add(s);
		}

		return new Vehical(tempList);
	}
}
