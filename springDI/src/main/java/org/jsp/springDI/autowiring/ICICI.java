package org.jsp.springDI.autowiring;

public class ICICI implements BankAccount {

	@Override
	public double getBalance() {
		return 65000;
	}

}
