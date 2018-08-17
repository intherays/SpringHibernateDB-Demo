package com.spring.hibernate.dao;

import java.util.List;

import com.spring.hibernate.entity.Customer;

public interface ICustomerDAO {
	List<Customer> getCustomerList();
	void saveCustomerList(Customer customer);
	public Customer getSingleCustomerList(int id);
	void deleteCustomerList(int id);
}
