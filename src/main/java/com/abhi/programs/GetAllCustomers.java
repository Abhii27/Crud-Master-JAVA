package com.abhi.programs;

import java.io.IOException;
import java.util.List;

import com.abhi.dao.CustomerDao;
import com.abhi.dao.DaoFactory;
import com.abhi.entity.Customer;

public class GetAllCustomers {

	public static void main(String[] args) throws IOException {
		
		CustomerDao dao = DaoFactory.getCustomerDao();

		List<Customer> list = dao.getAllCustomers();

		System.out.println("There are " + list.size() + " customers.");
		for (Customer c : list) {
			System.out.println(c.getName() + " is from " + c.getCity());
		}
	}

}
