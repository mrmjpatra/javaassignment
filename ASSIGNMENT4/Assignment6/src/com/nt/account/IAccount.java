package com.nt.account;

import com.nt.exception.InsufficientBalance;

public interface IAccount {
	public void deposite(double amount);
	public void withDraw(double amount)throws InsufficientBalance;
	public void checkBalance();
}
