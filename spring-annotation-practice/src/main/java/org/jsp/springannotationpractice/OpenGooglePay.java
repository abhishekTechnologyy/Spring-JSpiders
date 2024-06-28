package org.jsp.springannotationpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OpenGooglePay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
		GooglePay gpay = context.getBean("googpay",GooglePay.class);
		gpay.getAccount().displayBalance();
		
	}

}
