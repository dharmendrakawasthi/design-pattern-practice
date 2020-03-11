package com.techendear.composit;

public class MainClass {

	public static void main(String[] args) {
		
		CompositAccount account = new CompositAccount();
		
		account.addAccount(new DepositAccount("DA0012", 10000));
		account.addAccount(new SavingAccount("SA00456", 12000));
		account.addAccount(new DepositAccount("DA0928", 11000));
		
		SavingAccount acc = new SavingAccount("SA5641", 11000);
		
		account.addAccount(acc);		
		System.out.println("Total Balance: "+ account.getBalance());
		
		account.removeAccounr(acc);
		System.out.println("Total Balance: "+ account.getBalance());
	}
}
