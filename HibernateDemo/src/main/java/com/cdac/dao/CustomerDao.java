package com.cdac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cdac.entity.Customer;

// classes which contain DB specific code are commonly referred as DAO (Data Access Object )
public class CustomerDao {

	public void add(Customer customer) {
		
		// Now the Hibernate code for inserting the customer data in DB
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-demo"); // reference for META-INF/persistence.xml
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(customer); // persist will generate insert query  
		em.getTransaction().commit();
		
		em.close(); 
		emf.close();
	}
	
}
