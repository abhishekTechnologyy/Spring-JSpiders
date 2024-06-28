package org.jsp.springannotationpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Car car = context.getBean("car",Car.class);
		car.getEngine().start();
	}

}
