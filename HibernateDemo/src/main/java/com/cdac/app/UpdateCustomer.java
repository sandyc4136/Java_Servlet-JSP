package com.cdac.app;

import java.time.LocalDate;

import com.cdac.dao.CustomerDao;
import com.cdac.entity.Customer;

public class UpdateCustomer {
		
	public static void main(String[] args) {
			CustomerDao dao= new CustomerDao();
			Customer customer = dao.fetch(6);
			customer.setDateOfBirth(LocalDate.of(1995, 7, 9));
			dao.update(customer);
	}
}
