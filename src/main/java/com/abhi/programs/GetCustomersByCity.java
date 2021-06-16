package com.abhi.programs;

import java.io.IOException;
import java.util.List;

import com.abhi.dao.CustomerDao;
import com.abhi.dao.DaoFactory;
import com.abhi.entity.Customer;

public class GetCustomersByCity {

	public static void main(String[] args) throws IOException {
		
CustomerDao dao = DaoFactory.getCustomerDao();
		
		String city = "Mysore";
		List<Customer> list = dao.getCustomersByCity(city);
		
		System.out.println("There are " + list.size() + " customers from " + city);
		for(Customer c: list) {
			System.out.println(c);
		}
	}

}
