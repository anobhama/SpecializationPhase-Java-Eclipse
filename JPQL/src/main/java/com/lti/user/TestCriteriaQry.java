//manages exception
package com.lti.user;

import java.util.List;

import javax.persistence.*;
import javax.persistence.criteria.*;

import com.lti.dbutil.DBUtil;
import com.lti.entity.Employee;

public class TestCriteriaQry {
	
	public static void main(String[] args) {
		
		//EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		//EntityManager em= factory.createEntityManager();
		EntityManager em=DBUtil.getEntityManager();
		
		em.getTransaction().begin();
	
		/*//way 1  display recrds without exception
		System.out.println("Test Criteria");
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
		
		Root<Employee> e = cq.from(Employee.class); //from employee e
		CriteriaQuery<Employee> myQry  = cq.select(e); //select e from employee e
		
		TypedQuery<Employee> q=em.createQuery(myQry);
		List<Employee> list = q.getResultList();
		System.out.println(list);
		*/
		
		/* //ex 2 display recrds with exception
		CriteriaBuilder cb = em.getCriteriaBuilder();		 
        // Making The Query Object From The 'CriteriaBuilder' Instance
        CriteriaQuery<Object> cq = cb.createQuery();
        Root<Employee> from = cq.from(Employee.class);
         // Step #1 - Displaying All Records
        System.out.println("\n! Display All Records For The 'Employee' Table !\n");
        CriteriaQuery<Object> selectQuery = cq.select(from);
        TypedQuery<Object> typedQuery = em.createQuery(selectQuery);
        List<Object> employeeList = typedQuery.getResultList();
 
        if(employeeList != null && employeeList.size() > 0) {
            for(Object obj : employeeList) {
                Employee emp = (Employee)obj;
                System.out.println(emp.toString());
            }
        } else {
            System.out.println("! ALERT - No Employees Are Present In The 'Employee' Table !");
        } */
		
		//ex 3: ordering the display
		CriteriaBuilder cb = em.getCriteriaBuilder();       
        CriteriaQuery<Object> queryObj = cb.createQuery();
        Root<Employee> e = queryObj.from(Employee.class); // "FROM EMPLOYEE e"
        System.out.println("\n! Displaying All Records For The 'Employee' Table In An Asc. Order !\n");

        CriteriaQuery<Object> ascSelectQuery = queryObj.select(e);  //"SELECT e FROM EMPLOYEE e"  

        ascSelectQuery.orderBy(cb.asc(e.get("ename")));//"SELECT e FROM EMPLOYEE e ORDER BY e.ename ASC"


        TypedQuery<Object> ascTypedQuery = em.createQuery(ascSelectQuery);
        List<Object> ascEmployeeList = ascTypedQuery.getResultList();

        if(ascEmployeeList != null && ascEmployeeList.size() > 0) {
            for(Object obj : ascEmployeeList) {
                Employee emp = (Employee)obj;
                System.out.println(emp.toString());
            }
        } else {
            System.out.println("! ALERT - No Employees Are Present In The 'Employee' Table !");
        }
		
		em.getTransaction().commit();
		em.close();
	}

}
