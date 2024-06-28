package org.jsp.customeraddress.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.customeraddress.dto.Customer;
import org.jsp.customeraddress.dto.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDao {
	@Autowired
	private EntityManager entityManager;

	public Address saveAddress(Address add, int customer_id) {
		EntityTransaction transaction = entityManager.getTransaction();
		Customer customer = entityManager.find(Customer.class, customer_id);
		if (customer != null) {
			customer.getAddresss().add(add);
			add.setCustomer(customer);
			entityManager.persist(add);
			transaction.begin();
			transaction.commit();
			return add;
		}
		return null;
	}

	public Address updateAddress(Address add) {
		EntityTransaction transaction = entityManager.getTransaction();
		Address dbAddress = entityManager.find(Address.class, add.getId());
		if (dbAddress != null) {
			dbAddress.setBuilding_name(add.getBuilding_name());
			dbAddress.setCity(add.getCity());
			dbAddress.setCountry(add.getCountry());
			dbAddress.setHousenumber(add.getHousenumber());
			dbAddress.setLandmark(add.getLandmark());
			dbAddress.setPincode(add.getPincode());
			dbAddress.setState(add.getState());
			transaction.begin();
			transaction.commit();
			return dbAddress;
		}
		return null;
	}

	public Address findById(int id) {
		return entityManager.find(Address.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Address> findByCustomerId(int id) {
		return entityManager.createQuery("select c.address from Customer c where c.id=?1").setParameter(1, id)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Address> findByCustomer(long phone, String password) {
		return entityManager.createQuery("select c.address from Customer c where c.phone=?1 and c.password=?2")
				.setParameter(1, phone).setParameter(2, password).getResultList();
	}

}