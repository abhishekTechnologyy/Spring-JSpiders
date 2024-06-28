package org.jsp.springannotationpractice;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestACAC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new 
				AnnotationConfigApplicationContext("org.jsp.springannotationpractice");
		
		PhonePe phonepe = context.getBean("phonePe",PhonePe.class);
		Paytm paytm = context.getBean("paytm",Paytm.class);
		
		phonepe.open();
		paytm.open();
		

	}

}
