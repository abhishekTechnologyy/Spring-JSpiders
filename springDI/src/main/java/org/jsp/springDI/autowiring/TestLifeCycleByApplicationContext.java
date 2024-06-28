package org.jsp.springDI.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycleByApplicationContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		
		System.out.println(context.getBean("demo",Demo.class));
//		System.out.println(context.getBean("demo",Demo.class));
//		System.out.println(context.getBean("demo",Demo.class));
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
