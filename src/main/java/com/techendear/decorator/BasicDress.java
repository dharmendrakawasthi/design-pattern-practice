package com.techendear.decorator;

public class BasicDress implements Dress {

	@Override
	public void assemble() {
		System.out.println("Basic dress feature");
	}
}
