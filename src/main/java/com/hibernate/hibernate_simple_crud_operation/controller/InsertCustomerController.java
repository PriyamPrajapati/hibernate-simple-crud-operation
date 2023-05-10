package com.hibernate.hibernate_simple_crud_operation.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.hibernate.hibernate_simple_crud_operation.dto.Customer;

public class InsertCustomerController {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Customer customer = new Customer();
		
		customer.setCustomerId(11102);
		customer.setCustomerName("Priyam");
		customer.setCustomerEmail("priyam@gmail.com");
		customer.setCustomerPhone(1176356157);
		
		entityTransaction.begin();
		
		entityManager.persist(customer);
		
		entityTransaction.commit();
	}

}
