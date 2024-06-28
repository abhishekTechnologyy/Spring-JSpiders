package org.jsp.springDI.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		Car c = context.getBean("myCar",Car.class);
		c.getEngine().start();
	}

}
