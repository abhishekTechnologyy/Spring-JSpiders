package org.jsp.springDI.autowiring;

import java.util.List;
import java.util.Properties;

public class MySessionFactory {

	private MyDataSource dataSource;
	private Properties hibernateProperties;
	private List<String> mappingResources;
	
	public MyDataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(MyDataSource dataSource) {
		this.dataSource = dataSource;
	}
	public Properties getHibernateProperties() {
		return hibernateProperties;
	}
	public void setHibernateProperties(Properties hibernateProperties) {
		this.hibernateProperties = hibernateProperties;
	}
	public List<String> getMappingResources() {
		return mappingResources;
	}
	public void setMappingResources(List<String> mappingResources) {
		this.mappingResources = mappingResources;
	}
	
	
}
