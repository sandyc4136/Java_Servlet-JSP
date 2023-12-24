package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cdac.entity.Customer;
import com.mysql.cj.Query;

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
	
	public void update(Customer customer) {
		
		// Now the Hibernate code for inserting the customer data in DB
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-demo"); // reference for META-INF/persistence.xml
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(customer); // merge will generate update query  
		em.getTransaction().commit();
		
		em.close(); 
		emf.close();
	}
	
	public Customer delete(int id) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-demo"); // reference for META-INF/persistence.xml
		EntityManager em=emf.createEntityManager();
		Customer customer = em.find(Customer.class, id);
		
		em.getTransaction().begin();
		em.remove(customer); // remove method will generate delete query 
		em.getTransaction().commit();
		
		em.close(); 
		emf.close();
		
		return customer;
	}
	
	public Customer fetch(int id) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-demo"); // reference for META-INF/persistence.xml
		EntityManager em=emf.createEntityManager();
		Customer customer = em.find(Customer.class, id);
		
		em.close(); 
		emf.close();
		
		return customer;
	}
	
	public List<Customer> fetchAll(){
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate-demo"); // reference for META-INF/persistence.xml
		EntityManager em=emf.createEntityManager();
		
		//Query q = em.createQuery("select c from Customer c"); //HQL/JPQL
		//List<Customer> list = q.getResultList();
		
		// OR
		
		List<Customer> list = em.createQuery("select c from Customer c").getResultList();
		
		
		em.close(); 
		emf.close();
		
		return list;
	}
	
	public List<Customer> fetchByCity(String city, String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo"); //META-INF/persistence.xml
		EntityManager em = emf.createEntityManager();

		List<Customer> list = em.createQuery("select c from Customer c where c.city = ?1 and c.name=?2").setParameter(1, city).setParameter(2, name).getResultList(); //HQL/JPQL
		
		// OR
		
//		Query q = em.createQuery("select c from Customer c where c.city = ?1"); //HQL/JPQL
//		q.setParameter(1, city);
//		List<Customer> list = q.getResultList();
		
		em.close();
		emf.close();
		
		return list;
		
	}
	
}
