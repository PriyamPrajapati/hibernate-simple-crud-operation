package com.hibernate.hibernate_simple_crud_operation.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.hibernate.hibernate_simple_crud_operation.dto.Customer;

public class DeleteCustomerController {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Customer customer = entityManager.find(Customer.class, 11101);
		
		if(customer!=null)
		{
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();
		}else
		{
			System.out.println("Id is not found...");
		}
	} 

}
