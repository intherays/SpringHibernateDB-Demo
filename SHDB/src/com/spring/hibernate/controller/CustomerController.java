package com.spring.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.hibernate.entity.Customer;
import com.spring.hibernate.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController{

	@Autowired
	private ICustomerService customerService;


	
	@RequestMapping("/custlist")
	String showListOfCustomer(Model model) {
		// get customer from DAO
		List<Customer> custList = customerService.getCustomerService();
		
		for (Customer customer : custList) {
			System.out.println("---" +customer.getEmailId()+ "----");
		}
		
		model.addAttribute("webCustomers", custList);
		return "list";
	}
	
	@GetMapping("/addcustomer")
	String addCustomerLink(Model model) {
		model.addAttribute("customer", new Customer());
		return "addcustomer";
	}
	
	@PostMapping("/savecustomer")
	String saveCustomer(@ModelAttribute("customer") Customer cust) {
		System.out.println(">>>>>>>"+cust.getFirstName()+"\n"
						 + ">>>>>>>"+cust.getLastName());
		customerService.saveCustomerService(cust);
		
		return "redirect:/customer/custlist";
	}
	
	@RequestMapping("/update-customer")
	String updateCustomer(@RequestParam("id") int id, Model model) {
		Customer customerUpdate = customerService.getSingleCustomer(id);
		model.addAttribute("customer", customerUpdate);
		return "updatecustomer";
	}
	
	@GetMapping("/delete")
	String deleteCutomer(@RequestParam("id") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/customer/custlist";
	}
}
