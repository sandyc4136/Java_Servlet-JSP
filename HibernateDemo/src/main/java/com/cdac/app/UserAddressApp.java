package com.cdac.app;

import java.util.List;

import com.cdac.dao.AddressDao;
//import com.cdac.dao.UserAddressDao;
import com.cdac.dao.UserDao;
import com.cdac.entity.Address;
import com.cdac.entity.User;

public class UserAddressApp {

	public static void main(String[] args) {
		UserDao Udao = new UserDao();
		AddressDao Adao = new AddressDao();
//--------------- scenario 1 ---------------------------------//
		
		//first store user, then store address, finally link the user with the address

		//adding a user
	/*	
	 	User user = new User();
		user.setName("Kriti");
		user.setEmail("kriti@gmail.com");
		user.setMobileNumber(9984828555L);
		Udao.add(user); 
	*/
		
		//adding an address
	/*
		Address addr = new Address();
		addr.setPincode(110009);
		addr.setCity("NewDelhi");
		addr.setState("Delhi");
		Adao.add(addr);
	*/	
		
		//link user and address
	/*	
	 	User user = Udao.fetchUserById(4);
		Address addr = Adao.fetchAddressById(17);
		user.setAddress(addr);
		Udao.update(user); 
	*/
		
		
//-------------------- scenario 2 ------------------------------//
				
		//store user and address in one go in the db
				
		/*		User user = new User();
				user.setName("shravan");
				user.setEmail("shravan@hotmail.com");
				user.setMobileNumber(9977379747L);
				
				Address addr = new Address();
				addr.setPincode(500032);
				addr.setCity("Hyderabad");
				addr.setState("Telangana");
				
				user.setAddress(addr);
				
				Udao.add(user);
		
		*/
		
		
//-------------------- scenario 3 ------------------------------//
		
	/*	User user = Udao.fetchUserByEmail("kriti@gmail.com");
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getMobileNumber());  */
		
//-------------------- scenario 3 ------------------------------//
		
		List<User> users = Udao.fetchUsersByDomain("%gmail%");
		for(User user : users) {
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getMobileNumber()); 
		}
	}
}
