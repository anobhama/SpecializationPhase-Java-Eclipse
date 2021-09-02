package com.lti.service;

import com.lti.beans.Employee;
import com.lti.dao.IEmployeeDao;

public class ImplEmployeeService implements IEmployeeService {

	private IEmployeeDao empDao;
	
	//to make use of spring
	public IEmployeeDao getEmpDao() {
		return empDao;
	}


	public void setEmpDao(IEmployeeDao empDao) {
		this.empDao = empDao;
	}


	@Override
	public int saveEmployee(Employee e) {
		
		System.out.println(" Service layer --->"+e);
		empDao.saveEmployee(e);
		return 0;
		
	}

}
