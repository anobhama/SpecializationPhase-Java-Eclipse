package com.lti.appl.services;

import java.util.List;

import com.lti.appl.beans.Employee;
import com.lti.appl.excption.HrException;

public interface IEmpService {
	
	public int saveEmployee(Employee e);
	
	
	public List<Employee> getEmployee();
	
	public Employee getEmployeeById(int empno);
	
	public double updateEmployeeBySal(int empNo,double sal) throws HrException;

	public int deleteEmployeeById(int empno);
}
