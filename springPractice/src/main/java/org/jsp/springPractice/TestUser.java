package org.jsp.springPractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource r = new ClassPathResource("Car.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		User user = factory.getBean("user", User.class);
		user.display();
	}

}
