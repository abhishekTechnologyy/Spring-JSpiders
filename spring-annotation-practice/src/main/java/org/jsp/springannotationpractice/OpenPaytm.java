package org.jsp.springannotationpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OpenPaytm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Paytm paytm = context.getBean("paytm",Paytm.class);
		paytm.open();
	}

}
