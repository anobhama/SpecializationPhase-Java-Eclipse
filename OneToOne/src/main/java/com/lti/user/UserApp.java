package com.lti.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.lti.dbutil.DBUtil;
import com.lti.entity.Address;
import com.lti.entity.Employee;

public class UserApp {
	
	public static void main(String[] args) {
		
		EntityManager em=DBUtil.getEntityManager();
		
		Address add1=new Address(2, "Nagercoil", "TamileNadu", "India");
		Employee emp1=new Employee(2, "Asu", 20000, add1);
		
		/*
		em.getTransaction().begin();
		em.persist(emp1);
		em.getTransaction().commit();
		System.out.println("Employee added"); */
		
		String sql="SELECT e FROM Employee e";
	
		Query qry = em.createQuery(sql);
		
		List<Employee> empList= qry.getResultList();
		
		for(Employee e : empList) {
			System.out.println(e);
		}
		
		em.clear(); 
	}
}
