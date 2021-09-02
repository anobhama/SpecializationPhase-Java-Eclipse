package com.lti.services;

import com.lti.entity.Employee;

//service class where we will implement both the interfaces for post-init and pre-destroy methods.

public class EmployeeService implements InitializingBean, DisposableBean{

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public EmployeeService(){
		System.out.println("EmployeeService no-args constructor called");
	}

	public void destroy() throws Exception {
		System.out.println("EmployeeService Closing resources");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("EmployeeService initializing to dummy value");
		if(employee.getName() == null){
			employee.setName("Meenal");
		}
	}
}