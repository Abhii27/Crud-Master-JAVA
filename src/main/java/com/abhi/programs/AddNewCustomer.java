package com.abhi.programs;

import java.io.IOException;

import com.abhi.dao.CustomerDao;
import com.abhi.dao.DaoFactory;
import com.abhi.entity.Customer;

public class AddNewCustomer {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();
		
		Customer c1 = new Customer();
		c1.setName("Ram");
		c1.setCity("Delhi");
		c1.setEmail("ram@example.com");
		c1.setPhone("3878767699");
		
		dao.addCustomer(c1);
		
		System.out.println(c1);
	}

}
