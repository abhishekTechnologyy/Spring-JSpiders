package org.jsp.springannotationpractice;

import java.util.List;
import java.util.Properties;

import org.springframework.stereotype.Component;

@Component
public class MySessionFactory {

	private MyDataSource myDataSource;
	private MyDataSource yourDataSource;
	private List<String> mappingResources;
	private Properties hibernateProperties;
	
}
