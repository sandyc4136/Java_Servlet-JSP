package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cdac.entity.Address;
import com.cdac.entity.Customer;
import com.cdac.entity.User;
import javax.persistence.*;

//this is wrong, we should create separate dao for each entity
public class UserDao {

	public void add(User user) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo"); //META-INF/persistence.xml
			EntityManager em = emf.createEntityManager();
	
			em.getTransaction().begin();
			em.persist(user); //persist will generate insert query
			em.getTransaction().commit();
		}
		finally {
			emf.close();	
		}
	}
	
	public void update(User user) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo"); //META-INF/persistence.xml
			EntityManager em = emf.createEntityManager();
	
			em.getTransaction().begin();
			em.merge(user); //persist will generate insert query
			em.getTransaction().commit();
		}
		finally {
			emf.close();	
		}
	}
	
	public User fetchUserById(int id) {
		
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo"); 
			EntityManager em = emf.createEntityManager();
			User user = em.find(User.class, id);
			return user;
		}
		finally {
			emf.close();	
		}
	}
	
	public User fetchUserByEmail(String email) {
		EntityManagerFactory emf = null;
		try {

		emf=Persistence.createEntityManagerFactory("hibernate-demo"); // reference for META-INF/persistence.xml
		EntityManager em=emf.createEntityManager();
		
		Query q = em.createQuery("select u from User u where u.email=?1");
		q.setParameter(1, email);
		User user= (User) q.getSingleResult(); //  the getSingleResult() returns an object
		// but since it doesn't know which objetct , hence we type caste to let it know which class object
		return user;
		}
		finally {
			emf.close();	
		}
	}
	
	public List<User> fetchUsersByDomain(String domainName) {
		EntityManagerFactory emf = null;
		try {

		emf=Persistence.createEntityManagerFactory("hibernate-demo"); // reference for META-INF/persistence.xml
		EntityManager em=emf.createEntityManager();
		
		Query q = em.createQuery("select u from User u where u.email=?1");
		q.setParameter(1, "%" + domainName + "%");
		List<User> list= (List<User>) q.getResultList(); //  the getSingleResult() returns an object
		// but since it doesn't know which objetct , hence we type caste to let it know which class object
		return list;
		}
		finally {
			emf.close();	
		}
	}
	
	public List<User> fetchUsersByCity(String city) {
		EntityManagerFactory emf = null;
		try {

		emf=Persistence.createEntityManagerFactory("hibernate-demo"); // reference for META-INF/persistence.xml
		EntityManager em=emf.createEntityManager();
		
		Query q = em.createQuery("select u from User u join u.address a where a.city=?1");
		q.setParameter(1, city);
		List<User> list = (List<User>) q.getResultList();
 		return list;
		}
		finally {
			emf.close();	
		}
	}
	
	public List<Object[]> fetchUsersByCityV2(String city) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
	
			Query q = em.createQuery("select u.name,u.mobileNumber from User u join u.address a where a.city = ?1");
			q.setParameter(1, city);
			List<Object[]> users = q.getResultList();
			return users;
		}
		finally {
			emf.close();
		}
	}

}