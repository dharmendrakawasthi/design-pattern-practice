package com.techendear.composit;

public class DepositAccount extends Account{

	private String accNo;
	private float accBalance;
	
	public DepositAccount(String accNo, float accBalance) {
		this.accNo = accNo;
		this.accBalance = accBalance;
	}
	
	@Override
	public float getBalance() {
		return accBalance;
	}

}
