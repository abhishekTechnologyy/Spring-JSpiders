package org.jsp.springPractice;

public class PanCard {

	private String number;
	private int pincode;
	
	public PanCard() {
		System.out.println("PanCard() Called");
	}

	public PanCard(String number, int pincode) {
		System.out.println("PanCard(String,int) called");
		this.number = number;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "PanCard [number=" + number + ", pincode=" + pincode + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
}
