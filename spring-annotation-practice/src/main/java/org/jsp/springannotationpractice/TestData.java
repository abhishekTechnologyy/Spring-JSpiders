package org.jsp.springannotationpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		MySessionFactory factory = context.getBean("mySessionFactory",MySessionFactory.class);
		factory.getDataSource();
	}

}
