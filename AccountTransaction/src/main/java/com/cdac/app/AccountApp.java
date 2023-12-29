package com.cdac.app;

import com.cdac.entity.Account;
import com.cdac.service.AccountService;

public class AccountApp {
	
	public static void main(String[] args) {
		AccountService accServ = new AccountService();
		
		
		// Open account
	/*	Account acc = new Account();
		acc.setName("Sandip");
		acc.setType("Current");
		acc.setBalance(15000);
		accServ.openAccount(acc); */
		
		// close account
		accServ.closeAccount(4);
		
//		accServ.withdraw(1, 1000);
		
//		accServ.deposit(2, 1000);
		
//		accServ.transfer(1, 3, 1000);
	}
}
