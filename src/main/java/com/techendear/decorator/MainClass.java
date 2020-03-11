package com.techendear.decorator;

public class MainClass {

	public static void main(String[] args) {
		
		Dress sporty = new SportsDress(new BasicDress());
		sporty.assemble();
		System.out.println();
		
	}
}
