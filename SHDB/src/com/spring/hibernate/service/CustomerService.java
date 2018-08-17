package com.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.dao.ICustomerDAO;
import com.spring.hibernate.entity.Customer;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerDAO custmoerDAO;
	@Override
	@Transactional
	public List<Customer> getCustomerService() {
		return custmoerDAO.getCustomerList();
	}
	
	@Override
	@Transactional
	public void saveCustomerService(Customer customer ) {
		custmoerDAO.saveCustomerList(customer);
		
	}
	
	@Override
	@Transactional
	public Customer getSingleCustomer(int id) {
		return custmoerDAO.getSingleCustomerList(id);
		
	}
	
	@Override
	@Transactional
	public void deleteCustomer(int id) {
		custmoerDAO.deleteCustomerList(id);
		
	}

}
