package com.lti.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Employee;

public class ClientApp {
	
	public static void main(String[] args) {
		
		/*
		//for testing whether its wrking or not
		Employee e1= new Employee(1,"Anu");
		System.out.println(e1); */
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring-Config.xml");
		
		Employee e=(Employee) context.getBean("e1");
		System.out.println(e);
		
	}

}
