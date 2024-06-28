package org.jsp.hibernatetemplatedemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.jsp.hibernatetemplatedemo.dto.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public Admin saveAdmin(Admin admin) {
		hibernateTemplate.save(admin);
		return admin;
	}

	public Admin findById(int id) {
		return hibernateTemplate.get(Admin.class, id);
	}

	@Transactional
	public Admin updateAdmin(Admin admin) {
		Admin dbAdmin = findById(admin.getId());
		if (dbAdmin != null) {
			dbAdmin.setEmail(admin.getEmail());
			dbAdmin.setName(admin.getName());
			dbAdmin.setPassword(admin.getPassword());
			dbAdmin.setPhone(admin.getPhone());
//			hibernateTemplate.update(dbAdmin);
			return dbAdmin;
		}
		return null;
	}

	@Transactional
	public boolean delete(int id) {
		Admin dbAdmin = findById(id);
		if (dbAdmin != null) {
			hibernateTemplate.delete(dbAdmin);
			return true;
		}
		return false;
	}

	
}
