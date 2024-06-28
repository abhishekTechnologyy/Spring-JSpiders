package org.jsp.springDI.autowiring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Department {

	private Properties dept_details;
	private Set<Integer> emp_ids;
	private List<String> emp_names;
	private Map<Integer, String> emp_details;
	
	
	public Properties getDept_details() {
		return dept_details;
	}
	public void setDept_details(Properties dept_details) {
		this.dept_details = dept_details;
	}
	public Set<Integer> getEmp_ids() {
		return emp_ids;
	}
	public void setEmp_ids(Set<Integer> emp_ids) {
		this.emp_ids = emp_ids;
	}
	public List<String> getEmp_names() {
		return emp_names;
	}
	public void setEmp_names(List<String> emp_names) {
		this.emp_names = emp_names;
	}
	public Map<Integer, String> getEmp_details() {
		return emp_details;
	}
	public void setEmp_details(Map<Integer, String> emp_details) {
		this.emp_details = emp_details;
	}
	
	
}
