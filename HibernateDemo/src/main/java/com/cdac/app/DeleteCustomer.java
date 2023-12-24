package com.cdac.app;

import java.time.LocalDate;

import com.cdac.dao.CustomerDao;
import com.cdac.entity.Customer;

public class DeleteCustomer {
	public static void main(String[] args) {
		CustomerDao dao= new CustomerDao();
		 dao.delete(10);
		
	}
}
