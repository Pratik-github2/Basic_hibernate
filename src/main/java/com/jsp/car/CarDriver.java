package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	Car car=new Car();
	car.setName("xuv100");
	car.setBrand("Mahindra");
	
	entityTransaction.begin();
	entityManager.persist(car);
	entityTransaction.commit();
	System.out.println("All Good");
	
}
}
