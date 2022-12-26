package com.jsp.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String sql="select c from Car c";
		Query query=entityManager.createQuery(sql);
		List<Car>cars=query.getResultList();
		
		for(Car c:cars) {
			System.out.println("======================");
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getBrand());
		}
		
		
		
	}

}
