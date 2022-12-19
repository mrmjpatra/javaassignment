package com.nt.test;

import java.util.Scanner;

import com.nt.account.Account;
import com.nt.account.IAccount;
import com.nt.exception.InsufficientBalance;

public class BankingApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IAccount account = new Account();
		System.out.println("Welcome to IGIT Bank");
		boolean action = true;
		int choice;
		double amount;
		while (action) {
			System.out.println("1.Check Balance\n2.Deposite\n3.Withdraw\n0 :: To Exit");
			choice=sc.nextInt();
			switch (choice) {
			case 0: 
				action = false;
				break;	
			case 1:
				account.checkBalance();
				break;
			case 2:
				System.out.println("Enter the amount");
				amount=sc.nextDouble();
				account.deposite(amount);
				break;
			case 3:
				System.out.println("Enter the amount");
				amount=sc.nextDouble();
				try {
					account.withDraw(amount);
				} catch (InsufficientBalance e) {
					e.printStackTrace();
				}
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		}

	}

}
