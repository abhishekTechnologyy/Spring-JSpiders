package org.jsp.employeeWebApp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import org.jsp.employeeWebApp.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	private EntityManager entityManager;
	
	public Employee saveEmployee(Employee employee) {
		EntityTransaction transaction = entityManager.getTransaction();
		entityManager.persist(employee);
		transaction.begin();
		transaction.commit();
		return employee;
	}
	
	public Employee updateEmployee(Employee employee) {
		Employee dbEmployee = entityManager.find(Employee.class, employee.getId());
		if(dbEmployee != null) {
			dbEmployee.setDesg(employee.getDesg());
			dbEmployee.setEmail(employee.getEmail());
			dbEmployee.setGender(employee.getGender());
			dbEmployee.setName(employee.getName());
			dbEmployee.setPassword(employee.getPassword());
			dbEmployee.setPhone(employee.getPhone());
			dbEmployee.setSalary(employee.getSalary());
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			transaction.commit();
			return dbEmployee;
		}
		return null;
	}
	
	public Employee findById(int id) {
		return entityManager.find(Employee.class, id);
	}
	
	public Employee verify(long phone , String password) {
		try {
			return (Employee) entityManager.createQuery("select e from Employee e where e.phone=?1 and e.password=?2").setParameter(1, phone).setParameter(2, password).getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
	
	public Employee verify(String email , String password) {
		try {
			return (Employee) entityManager.createQuery("select e from Employee e where e.email=?1 and e.password=?2").setParameter(1, email).setParameter(2, password).getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
	
	public Employee verify(int id , String password) {
		try {
			return (Employee) entityManager.createQuery("select e from Employee e where e.id=?1 and e.password=?2").setParameter(1, id).setParameter(2, password).getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
	
	public boolean deleteById(int id) {
		EntityTransaction transaction = entityManager.getTransaction();
		Employee employee = findById(id);
		if(employee != null) {
			entityManager.remove(employee);
			transaction.begin();
			transaction.commit();
			return true;
		}
		return false;
	}
}
