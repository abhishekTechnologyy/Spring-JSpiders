package org.jsp.springannotationpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Paytm paytm = context.getBean("paytm",Paytm.class);
		PhonePe phonePe = context.getBean("phonePe",PhonePe.class);
		
		paytm.open();
		phonePe.open();

	}

}
