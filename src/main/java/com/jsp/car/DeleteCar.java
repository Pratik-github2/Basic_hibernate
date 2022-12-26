package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCar {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	Car car=entityManager.find(Car.class, 4);
	entityTransaction.begin();
	entityManager.remove(car);
	entityTransaction.commit();
	
	if(car!=null) {
		System.out.println("Removed");
	}
	else {
		System.out.println("Not Removed");
	}
}
}
