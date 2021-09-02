package com.lti.appl.user;


import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.appl.beans.Employee;
import com.lti.appl.excption.HrException;
import com.lti.appl.services.IEmpService;

public class UserApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-Config.xml");
	
		//calling the interface
		IEmpService service = ctx.getBean("empService", IEmpService.class);
		//System.out.println(service);
		
		/*
		  Employee e=new Employee(4,"Aji",35000); 
		 * service.saveEmployee(e);
		 */
		
		/*//display all recrd
		List<Employee> empList =service.getEmployee();
		System.out.println(empList); */
		
		System.out.println("Enter the employee number");
		Scanner sc = new Scanner(System.in);
		int empNo=sc.nextInt();

		/*//search the employee by the id 
		Employee emp=service.getEmployeeById(empNo);
		 System.out.println(emp); */
		 
		 //updation of employee salary
		 try
		 {
			 double emp1=service.updateEmployeeBySal(empNo, 40000);
			 System.out.println(emp1);
		 }
		 catch (HrException e) {
				e.getMessage();
				e.printStackTrace();
		 }

		 //deleting the employee using ID
		//int emp2=service.deleteEmployeeById(empNo);
		
	}

}
