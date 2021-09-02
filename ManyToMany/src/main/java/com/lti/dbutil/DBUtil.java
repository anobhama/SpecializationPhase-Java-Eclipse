package com.lti.dbutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DBUtil {
	
	private static EntityManagerFactory factory;
	private EntityManager manager;
	
	public DBUtil(){
		factory = Persistence.createEntityManagerFactory("JPA-PU");
		manager = factory.createEntityManager();
	}

	public EntityManagerFactory getFactory(){
		return factory;
	}
	
	public EntityManager getManager(){
		return manager;
	}
	
	public EntityTransaction getTransaction(){
		return manager.getTransaction();
	}
}
