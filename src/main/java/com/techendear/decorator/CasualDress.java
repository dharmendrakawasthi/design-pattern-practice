package com.techendear.decorator;

public class CasualDress extends DressDecorator {

	public CasualDress(Dress dress) {
		super(dress);
	}

	@Override
	public void assemble() {
		System.out.println("Casual Dress");
	}

}
