package org.jsp.merchantMvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import org.jsp.merchantMvc.dto.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao {

	@Autowired
	private EntityManager entityManager;
	
	public Merchant saveMerchant(Merchant merchant) {
		EntityTransaction transaction = entityManager.getTransaction();
		entityManager.persist(merchant);
		transaction.begin();
		transaction.commit();
		return merchant;
	}
	
	public Merchant updateMerchant(Merchant merchant) {
		Merchant dbMerchant = entityManager.find(Merchant.class, merchant.getId());
		if (dbMerchant != null) {
			dbMerchant.setEmail(merchant.getEmail());
			dbMerchant.setName(merchant.getName());
			dbMerchant.setPassword(merchant.getPassword());
			dbMerchant.setPhone(merchant.getPhone());
			dbMerchant.setGstNumber(merchant.getGstNumber());
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			transaction.commit();
			return dbMerchant;
		}
		return null;
	}
	
	public Merchant verify(long phone, String password) {
		try {
			return (Merchant) entityManager.createQuery("select m from Merchant m where m.phone=?1 and m.password=?2")
					.setParameter(1, phone).setParameter(2, password).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public Merchant verify(String email, String password) {
		try {
			return (Merchant) entityManager.createQuery("select m from Merchant m where m.email=?1 and m.password=?2")
					.setParameter(1, email).setParameter(2, password).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
