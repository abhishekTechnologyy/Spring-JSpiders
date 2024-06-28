package org.jsp.springDI.autowiring;

public class Car {

	private Engine engine;
	
	public Car()
	{
		System.out.println("Car() called");
	}

	public Car(Engine engine) {
		System.out.println("Car(Engine) called");
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("setter called");
		this.engine = engine;
	}
	
	
}
