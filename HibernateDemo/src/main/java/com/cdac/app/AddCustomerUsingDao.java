package com.cdac.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cdac.dao.CustomerDao;
import com.cdac.entity.Customer;

public class AddCustomerUsingDao {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("Jackson");
		customer.setEmail("jackson1234@gmail.com");
		customer.setCity("Jharsuguda");
		// customer.setDateOfBirth();
		 
		CustomerDao dao = new CustomerDao();
		dao.add(customer);
		
	}
}
