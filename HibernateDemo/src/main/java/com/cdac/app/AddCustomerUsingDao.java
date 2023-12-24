package com.cdac.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cdac.dao.CustomerDao;
import com.cdac.entity.Customer;

public class AddCustomerUsingDao {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("Batman");
		customer.setEmail("batman1234@gmail.com");
		customer.setCity("Gotham");
//		customer.setDateOfBirth(1995-02-09);
		
		 
		CustomerDao dao = new CustomerDao();
		dao.add(customer);
		
	}
}
 