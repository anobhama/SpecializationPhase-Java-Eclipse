package com.lti.appl.dao;

import java.util.List;

import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.lti.appl.beans.Employee;
import com.lti.appl.excption.HrException;

@EnableTransactionManagement
@Repository("empDao")
public class EmpDaoImpl implements IEmpDao {

	
	@PersistenceContext
	private EntityManager em;
	
	
	//enabling the transaction 
	//it does begin() and commit()
	@Override
	@Transactional
	public int saveEmployee(Employee e) {
		
		System.out.println("Dao layer ->"+e);
		em.persist(e);
		System.out.println("recrd added");
		return 0;
	}


	@Override
	public List<Employee> getEmployee() {
		
		//System.out.println("Dao layer");
		List< Employee> empList= em.createQuery("Select e from Employee e",Employee.class).getResultList();
		return empList;
		
	}


	@Override
	public Employee getEmployeeById(int empno) {
		
		Employee emp=em.find(Employee.class,empno);
		return emp;
		
	}

   @Transactional
	@Override
	public double updateEmployeeBySal (int empNo, double sal) throws HrException  {
		
		Employee emp=em.find(Employee.class, empNo);
		
		if(emp == null || emp.getEmpSal() <=10000)
		{
			throw new HrException("Salary  cant be updated");
		}
		else
		{
			emp.setEmpSal(sal);
			em.merge(emp);	
			System.out.println("updated");
			
		}
			return sal;
	}

@Transactional
@Override
public int deleteEmployeeById(int empno) {
	
	Employee emp=em.find(Employee.class,empno);
	em.remove(emp);
	System.out.println("deleted");
	return 0;
}


}
