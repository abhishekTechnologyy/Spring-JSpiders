package org.jsp.springDI;

public class PanCard {

	private String number;
	private int age;
	
	@Override
	public String toString() {
		return "PanCard [number=" + number + ", age=" + age + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
