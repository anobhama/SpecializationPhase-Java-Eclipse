package com.lti.user;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.lti.dbutil.DBUtil;
import com.lti.entity.Employee;

public class UserApp {
	
	public static void main(String[] args) {
		
		EntityManager em=DBUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		/* //ex 1
		//String sql = "SELECT e from Employee e";
		String sql="SELECT e.eid from Employee e";
		Query qry=em.createQuery(sql);
		
		List<Employee> empList=qry.getResultList();
		System.out.println(empList);
		
		em.getTransaction().commit(); */
		
		/*//ex 2: using Typed Query
		
		em.getTransaction().begin();
		
		String sql= "SELECT e FROM Employee e";
		TypedQuery<Employee> tq=em.createQuery(sql,Employee.class);
		List<Employee> myList= tq.getResultList();
		System.out.println(myList);
		
		em.getTransaction().commit();
		
		
		//ex 3 using where clause
		
		em.getTransaction().begin();
		
		String sql= "SELECT e FROM Employee e where e.ename='Jerry'";
	
		TypedQuery<Employee> tq=em.createQuery(sql,Employee.class);
		List<Employee> myList= tq.getResultList();
		System.out.println(myList);
		
		em.getTransaction().commit(); */
		
		// Example 4 => Dynamic JPQL query => String can be build dynamically at runtime
				// => Use query params of JPA
//				String sql = "SELECT e FROM Employee e WHERE e.ename= :p_name";
//				TypedQuery<Employee> typedQuery = em.createQuery(sql, Employee.class);
//				typedQuery.setParameter("p_name", "Jay"); // use scanner
//				List<Employee> empList = typedQuery.getResultList();
//				System.out.println(empList);

				// Example 5 => Ordinal Parameters (? -> index)
//				String sql = "SELECT e FROM Employee e WHERE e.ename=?1";
//				TypedQuery<Employee> typedQuery = em.createQuery(sql, Employee.class);
//				typedQuery.setParameter(1, "Jay"); // use scanner
//				List<Employee> empList = typedQuery.getResultList();
//				System.out.println(empList);

				// Example 6 => Aggregate Function
//				String sql = "SELECT SUM(e.salary) FROM Employee e";
//				TypedQuery<Double> typedQuery = em.createQuery(sql, Double.class);
//				Double res = typedQuery.getSingleResult();
//				System.out.println(res);

//				String sql = "SELECT e FROM Employee e WHERE " + "e.salary BETWEEN 20000 AND 30000";
//				TypedQuery<Employee> typedQuery = em.createQuery(sql, Employee.class);
//				List<Employee> empList = typedQuery.getResultList();
//				System.out.println(empList);
				
				
		// Example 7 => Named Query => statistically defined / predefined syntax -> not
				// going to change, you need it frequently
//				Query query = em.createNamedQuery("find employee by id");
//				TypedQuery<Employee> typedQuery = em.createNamedQuery("find employee by id", Employee.class);
//				typedQuery.setParameter("id", 101);
//				List<Employee> empList = typedQuery.getResultList();
//				System.out.println(empList);

				// Example 8 => Pagination
//				TypedQuery<Employee> typedQuery = em.createQuery("SELECT e FROM Employee e", Employee.class);
//				typedQuery.setFirstResult(2);
//				typedQuery.setMaxResults(3);
//				List<Employee> empList = typedQuery.getResultList();
//				System.out.println(empList);

				// Example 9 =>
				Query query = em.createQuery("SELECT e.ename, a.city FROM Employee e INNER JOIN e.address a");
				List<Object[]> list = query.getResultList();
				for (Object[] ary: list) {
					System.out.println(Arrays.toString(ary));
				}
				
				
		
		em.getTransaction().commit();
		em.close();
		
	}

}
