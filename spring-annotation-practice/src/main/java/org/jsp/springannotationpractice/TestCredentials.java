package org.jsp.springannotationpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Credentials credentials = context.getBean("credentials",Credentials.class);
		System.out.println(credentials);
	}

}
