package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/customer")
	public List<Customer> getCustomerLists() {

		return customerService.getCustomers();
	}

	@GetMapping("/customer/{customerId}")
	public Customer getCustomerList(@PathVariable int customerId) {

		Customer customer = customerService.getCustomer(customerId);

		if (customer == null) {
			throw new CustomerNotFindException("Customer not found exception" + customerId);
		}

		return customer;
	}

	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {

		customer.setId(0);
		customerService.saveCustomer(customer);

		return customer;

	}

	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);

		return customer;
	}

	@DeleteMapping("/customer/{customerId}")

	public String delete(@PathVariable int customerId) {

		Customer tempCustomer = customerService.getCustomer(customerId);

		if (tempCustomer == null) {
			throw new CustomerNotFindException("Customer Id not found" + customerId);
		}

		customerService.deleteCustomer(customerId);

		return "Customer Deleted " + customerId;
	}

}
