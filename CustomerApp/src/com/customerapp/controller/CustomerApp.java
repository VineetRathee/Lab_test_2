package com.customerapp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

public class CustomerApp {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		 
	    Date date1 = new Date();

		Customer customer1 = new Customer("Ravi", "Hisar", "3984379854",date1);
		Customer customer2 = new Customer("Umesh", "Delhi", "2832344376",date1);

		System.out.println("Add customer by id");
		customerService.addCustomer(customer1);
		customerService.addCustomer(customer2);

		System.out.println("Get customer by id ");
         System.out.println(customerService.getCustomerById(1));
		System.out.println(customerService.getCustomerById(2));
		System.out.println(customerService.getCustomerById(10));

	}
}
