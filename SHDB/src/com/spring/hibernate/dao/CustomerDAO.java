package com.spring.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.hibernate.entity.Customer;

@Repository
public class CustomerDAO implements ICustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomerList() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> qury = session.createQuery("from Customer", Customer.class);
		List<Customer> customers = qury.getResultList();
		return customers;
	}
	
	@Override
	public void saveCustomerList(Customer customer) {
		System.out.println(">>>>>>>Inside DAO saveCustomerList<<<<<");
		Session session = sessionFactory.getCurrentSession();
		System.out.println(">>>>>>>Before Saving<<<<<");
		session.saveOrUpdate(customer);
		System.out.println(">>>>>>>After Saving<<<<<");
		
	}
	
	@Override
	public Customer getSingleCustomerList(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, id) ;
	}
	
	@Override
	public void deleteCustomerList(int id) {
		Session session = sessionFactory.getCurrentSession();
		javax.persistence.Query query = 
				session.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId", id);
		System.out.println(query.executeUpdate());
	}

}
