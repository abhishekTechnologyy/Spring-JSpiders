package org.jsp.springannotationpractice;

import org.springframework.stereotype.Component;

@Component
public class SBI implements BankAccount {

	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to SBI");
		System.out.println("your account balance is: "+25000);
	}

}
