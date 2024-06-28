package org.jsp.springannotationpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Batch batch = context.getBean("batch",Batch.class);
		System.out.println(batch.getStudentNames());
	}

}
