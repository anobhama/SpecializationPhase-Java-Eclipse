package com.lti.dao;

import com.lti.beans.Employee;

public class ImplEmployeeDao implements IEmployeeDao {

	@Override
	public int saveEmployee(Employee e) {

		System.out.println("Doa layer ---> "+e);
		return 0;
		
	}

}
