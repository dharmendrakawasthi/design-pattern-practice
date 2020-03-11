package com.techendear.composit;

public class SavingAccount extends Account{

	private String accNo;
	private float accBalance;
	
	public SavingAccount(String accNo, float accBalance) {
		this.accNo = accNo;
		this.accBalance = accBalance;
	}


	@Override
	public float getBalance() {
		return accBalance;
	}

}
