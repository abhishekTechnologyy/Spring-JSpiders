package org.jsp.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("car-engine.xml");
		Car c = context.getBean("myCar",Car.class);
		c.getE().start();

	}

}
