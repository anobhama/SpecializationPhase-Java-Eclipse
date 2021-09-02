package com.lti.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.beans.Employee;
import com.lti.service.IEmployeeService;
import com.lti.service.ImplEmployeeService;


public class ClientApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-Config.xml");

		Employee e= ctx.getBean("e1",Employee.class);
		//System.out.println(e);
		
		IEmployeeService service= ctx.getBean("Service",ImplEmployeeService.class);
		//System.out.println(service);
		service.saveEmployee(e);
	}

}
