package org.jsp.springDI.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPhonePe {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("phonepe.xml");
		PhonePe pe = context.getBean("phonepe",PhonePe.class);
		System.out.println(pe.getAccount().getBalance());
	}

}
