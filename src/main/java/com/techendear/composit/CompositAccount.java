package com.techendear.composit;

import java.util.ArrayList;
import java.util.List;

public class CompositAccount extends Account{

	private float totalBalance;
	private List<Account> accountList = new ArrayList<Account>();
	
	@Override
	public float getBalance() {
		
		totalBalance = 0;
		for(Account a: accountList) {
			
			totalBalance = totalBalance + a.getBalance();
		}
		return totalBalance;
	}
	
	public void addAccount(Account acc) {
		accountList.add(acc);
	}
	
	public void removeAccounr(Account acc) {
		accountList.remove(acc);
	}

}
