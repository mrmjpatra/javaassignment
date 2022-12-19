package com.nt.account;

import com.nt.exception.InsufficientBalance;

public class Account implements IAccount {
	private double balance = 3000;

	public void deposite(double amount) {
		balance += amount;
		System.out.println(amount + " has been deposited to your account. Total balance : " + balance);
	}

	public void withDraw(double amount) throws InsufficientBalance {
		if (amount > balance) {
			System.out.println("InSufficient Fund in your account");
			throw new InsufficientBalance("You have insufficient fund");
		}
		balance -= amount;
		System.out.println(amount + " has been debited from your account. Total balance : " + balance);
	}

	public void checkBalance() {
		System.out.println("Total Balance : " + balance);
	}
}
