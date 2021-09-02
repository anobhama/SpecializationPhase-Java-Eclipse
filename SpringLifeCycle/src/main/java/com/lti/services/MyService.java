package com.lti.services;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//need to invoke in config xml file ---> line no 21

public class MyService {

	@PostConstruct
	public void init(){
		System.out.println("MyService init method called");
	}
	
	public MyService(){
		System.out.println("\nMyService no-args constructor called");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("MyService destroy method called");
	}
	
}
