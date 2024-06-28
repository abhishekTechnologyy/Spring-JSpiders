package org.jsp.springDI.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("dept.xml");
		Department d = context.getBean("dept",Department.class);
		
		System.out.println(d.getDept_details());
		System.out.println(d.getEmp_details());
		System.out.println(d.getEmp_ids());
		System.out.println(d.getEmp_names());
	}

}
