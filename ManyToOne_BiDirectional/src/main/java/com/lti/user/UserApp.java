package com.lti.user;

import javax.persistence.*;

import com.lti.dbutil.DBUtil;
import com.lti.entity.Department;
import com.lti.entity.Employee;

public class UserApp {

	public static void main(String[] args) {
		
		EntityManager em = DBUtil.getEntityManager();

	
		/*Department dept = em.find(Department.class, 112);
		System.out.println(dept);
		System.out.println("DEPARTMENT : "+dept.getDid());*/
	
		//dprt added to table
		Department d1=new Department();
		Department d2=new Department();
		d1.setDname("Manager");
		d2.setDname("Techian");
		
		em.getTransaction().begin();
		
		em.persist(d1);
		em.persist(d2);
		
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		
		Employee e1=new Employee();
		e1.setEname("Krithi");
		e1.setSalary(30000);
		e1.setJob_id(1);
		e1.setDepartment(d1);
		
		em.persist(e1);
		
		//int employeeId= e1.getEid();
		//System.out.println("Record Added "+ employeeId);
		System.out.println("Emplyree details "+e1);
		em.getTransaction().commit(); 
		/*
		em.getTransaction().begin();
		
		Employee dbEmp=em.find(Employee.class,16);
		//System.out.println("Emp: "+dbEmp);
		System.out.println("Emp: "+dbEmp.getEname());
		em.getTransaction().commit(); */
		
		/*
		em.getTransaction().begin();

		Department d1 = em.find(Department.class, 112);
		System.out.println("\n Department" +d1);
		
		em.getTransaction().commit();
		
		Department dept1 = em.find(Department.class, 111);
		System.out.println(dept1);
		System.out.println("DEPARTMENT : "+dept1.getDname());

		*/
		em.close();
		
	}
}
 