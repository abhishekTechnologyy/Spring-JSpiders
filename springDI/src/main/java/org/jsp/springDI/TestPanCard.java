package org.jsp.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPanCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("person-card.xml");
		Person p1 = context.getBean("person1",Person.class);
		Person p2 = context.getBean("person2",Person.class);
		
		System.out.println(p1.getPancard());
		System.out.println(p2.getPancard());


	}

}
