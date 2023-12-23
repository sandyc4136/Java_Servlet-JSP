package com.cdac.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.cdac.entity.Customer;

public class AddCustomer {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("Sandip");
		customer.setEmail("sandyc4136@gmail.com");
		customer.setCity("Bhubaneswar");
		// customer.setDateOfBirth();
		 
		//Now the Hibernate code for inserting customer data in db
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo"); //META-INF/persistence.xml
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(customer); //persist will generate insert query
		em.getTransaction().commit();
				
		em.close();
		emf.close();
		
	}
}
