package com.customer.service;

import java.util.List;

import com.customer.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomer();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public List<Customer> getSearchNames(String searchName);
	

}
