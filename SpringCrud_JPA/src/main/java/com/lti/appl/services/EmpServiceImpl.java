package com.lti.appl.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.beans.Employee;
import com.lti.appl.dao.IEmpDao;
import com.lti.appl.excption.HrException;

@Service("empService")
public class EmpServiceImpl implements IEmpService {

	@Autowired
	private IEmpDao empDao;
	
	
	public IEmpDao getEmpDao() {
		return empDao;
	}


	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public int saveEmployee(Employee e) {
		
		System.out.println("Service layer ->" + e);
		empDao.saveEmployee(e);
		return 0;
	}


	@Override
	public List<Employee> getEmployee() {
	
		//System.out.println("Service layer");
		List<Employee> empList=empDao.getEmployee();
		return empList;
	}


	@Override
	public Employee getEmployeeById(int empno)
	{
		Employee emp = (Employee) empDao.getEmployeeById(empno);
		return emp;
	}


	@Transactional
	@Override
	public double updateEmployeeBySal(int empNo, double sal) throws HrException{
		
		double emp =  empDao.updateEmployeeBySal(empNo, sal);
		return emp;
	}

@Transactional
	@Override
	public int deleteEmployeeById(int empno) {

		return empDao.deleteEmployeeById(empno);
	}

}
