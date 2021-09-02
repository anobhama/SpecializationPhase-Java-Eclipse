package com.lti.user;

import com.lti.entity.Employee;
import com.lti.services.EmployeeService;
import com.lti.services.MyService;

public class UserApp {
	
	public static void main(String[] args) {
		
		//Employee e=new Employee("Anu");
		//System.out.println(e);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		// way 1 : see bean.xml

		System.out.println("\nSpring Context initialized");
		EmployeeService service = ctx.getBean("employeeService", EmployeeService.class);
		System.out.println("Bean retrieved from Spring Context");
		System.out.println("Employee Name=" + service.getEmployee().getEname());
		
		//way 2: using annotations
		
		MyService myEmpService = ctx.getBean("myEmployeeService", MyService.class);
		System.out.println("Bean retrieved from Spring Context");		
		System.out.println("Employee Name="+myEmpService.getEmployee().getName());
	}

}
