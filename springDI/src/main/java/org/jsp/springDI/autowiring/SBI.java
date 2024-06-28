package org.jsp.springDI.autowiring;

public class SBI implements BankAccount {

	@Override
	public double getBalance() {
		return 25000;
	}

}
