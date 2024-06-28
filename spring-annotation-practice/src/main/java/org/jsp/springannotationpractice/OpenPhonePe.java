package org.jsp.springannotationpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OpenPhonePe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
//		context.register(PhonePe.class);
		context.scan("org.jsp.springannotationpractice");
		context.refresh();
		PhonePe phonepe = context.getBean("phonePe",PhonePe.class);
		phonepe.open();
	}

}
