package com.hibernate.hibernate_simple_crud_operation.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import com.hibernate.hibernate_simple_crud_operation.dto.Customer;

public class GetCustomerController {
	public static void main(String[] args) {
		
	EntityManager entityManager=  Persistence.createEntityManagerFactory("hibernate").createEntityManager();
		
	Customer customer =   entityManager.find(Customer.class, 11102);
	
	if(customer!=null)
	{
		System.out.println("-------------------------------------");
		System.out.println("Id :"+customer.getCustomerId());
		System.out.println("Name :"+customer.getCustomerName());
		System.out.println("Email :"+customer.getCustomerEmail());
		System.out.println("Phone :"+customer.getCustomerPhone());
	}
	else {
		System.out.println("Given Id Not found");
	}
	}

}
