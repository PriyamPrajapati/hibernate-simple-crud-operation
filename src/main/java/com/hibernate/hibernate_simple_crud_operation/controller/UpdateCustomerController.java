package com.hibernate.hibernate_simple_crud_operation.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.hibernate.hibernate_simple_crud_operation.dto.Customer;

public class UpdateCustomerController {
	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Customer customer = entityManager.find(Customer.class,11102);
		
		if(customer!=null)
		{
			customer.setCustomerName("Vikas");
			entityTransaction.begin();
			entityManager.merge(customer);
			entityTransaction.commit();
		}else
		{
			System.out.println("Please check your id...");
		}
	}

}
