package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCar {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	Car car=entityManager.find(Car.class, 3);
	car.setBrand("Mercedis");
	car.setName("x-class");
	if(car!=null) {
		entityTransaction.begin();
		entityManager.merge(car);
		entityTransaction.commit();
		System.out.println("updated");
		
	}else {
		System.out.println("no udated");
	}
}
}
