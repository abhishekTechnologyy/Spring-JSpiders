package org.jsp.springannotationpractice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ICICI implements BankAccount {

	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to ICICI");
		System.out.println("your account balance is: "+28000);
	}

}
