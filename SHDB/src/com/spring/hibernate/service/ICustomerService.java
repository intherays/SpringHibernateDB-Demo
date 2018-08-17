package com.spring.hibernate.service;

import java.util.List;

import com.spring.hibernate.entity.Customer;

public interface ICustomerService {
	public List<Customer> getCustomerService();
	public void saveCustomerService(Customer customer);
	public Customer getSingleCustomer(int id);
	public void deleteCustomer(int id);
}
