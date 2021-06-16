package com.abhi.programs;

import java.io.IOException;

import com.abhi.dao.CustomerDao;
import com.abhi.dao.DaoFactory;
import com.abhi.entity.Customer;

public class DeleteCustomer {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();

		int id = 6;

		Customer c1 = dao.getCustomerById(id);

		if (c1 == null) {
			System.out.println("No data found for id " + id);
		} else {
			dao.deleteCustomer(id);
			System.out.println("Customer with id " + id + " is deleted.");
		}

	}

}
