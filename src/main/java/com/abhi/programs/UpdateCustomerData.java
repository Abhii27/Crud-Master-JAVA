package com.abhi.programs;

import java.io.IOException;

import com.abhi.dao.CustomerDao;
import com.abhi.dao.DaoFactory;
import com.abhi.entity.Customer;

public class UpdateCustomerData {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();

		int id = 3;
		Customer c1 = dao.getCustomerById(id);
		if (c1 == null) {
			System.out.println("No customer data for id: " + id);
		} else {
			System.out.println("Before updating...: " + c1);
			c1.setCity("Dallas");
			c1.setPhone("5552341122");
			dao.updateCustomer(c1);

			c1 = dao.getCustomerById(id);
			System.out.println("After updating...: " + c1);

		}
	}

}
