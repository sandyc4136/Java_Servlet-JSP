package com.cdac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cdac.entity.Address;
import com.cdac.entity.Customer;
import com.cdac.entity.User;

//this is wrong, we should create separate dao for each entity
public class AddressDao {

	public void add(Address address) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo"); //META-INF/persistence.xml
			EntityManager em = emf.createEntityManager();
	
			em.getTransaction().begin();
			em.persist(address); //persist will generate insert query
			em.getTransaction().commit();
		}
		finally {
			emf.close();	
		}
	}
		
	public Address fetchAddressById(int id) {
		
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo"); 
			EntityManager em = emf.createEntityManager();
			Address address = em.find(Address.class, id);
			return address;
		}
		finally {
			emf.close();	
		}
	}
	
	
}