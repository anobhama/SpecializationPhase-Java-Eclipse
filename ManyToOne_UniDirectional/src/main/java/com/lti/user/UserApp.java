package com.lti.user;

import javax.persistence.*;

import com.lti.dbutil.DBUtil;
import com.lti.entity.Department;
import com.lti.entity.Employee;

public class UserApp {

	public static void main(String[] args) {
		
		EntityManager em = DBUtil.getEntityManager();

	
		Department dept = em.find(Department.class, 112);
		System.out.println(dept);
		System.out.println("DEPARTMENT : "+dept.getDid());
	
		em.getTransaction().begin();
		
		Employee e1=new Employee();
		e1.setEname("Asu");
		e1.setSalary(80000);
		e1.setJob_id(1);
		e1.setDepartment(dept);
		
		em.persist(e1);
		
		int employeeId= e1.getEid();
		System.out.println("Record Added "+ employeeId);
		em.getTransaction().commit(); 
		
		em.getTransaction().begin();
		//many to one
		//unidirectional
		Employee dbEmp=em.find(Employee.class,employeeId);
		//System.out.println("Emp: "+dbEmp);
		System.out.println("Emp: "+dbEmp.getEname());
		em.getTransaction().commit();
		
		em.getTransaction().begin();

		Department d1 = em.find(Department.class, 112);
		System.out.println("\n Department" +d1);
		
		em.getTransaction().commit();
		
		Department dept1 = em.find(Department.class, 111);
		System.out.println(dept1);
		System.out.println("DEPARTMENT : "+dept1.getDname());

		
		em.close();
		
	}
}
 