package com.abhi.programs;

import java.io.IOException;

import com.abhi.dao.CustomerDao;
import com.abhi.dao.DaoFactory;
import com.abhi.entity.Customer;

public class RetrieveCustomerById {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();
		
		int id = 3;
		Customer c1 = dao.getCustomerById(id);
		if(c1==null) {
			System.out.println("No customer data for id: " + id);
		}
		else {
			System.out.println(c1);
		}
	}

}
