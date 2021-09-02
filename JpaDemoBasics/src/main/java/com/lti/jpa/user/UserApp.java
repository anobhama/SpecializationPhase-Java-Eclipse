package com.lti.jpa.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.jpa.entity.Student;

public class UserApp {
	public static void main(String[] args) {
		
		//Student student1=new Student(3,"Asu",90);
		//System.out.println(student1);
		
		Student student2=new Student("Krithi",96);
		
		//creating  a factory obj 
		//giving the persistance unit name in it
		//from the persistance.xml
		//factory has config given by .xml
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");

		//creates a manager to do its wrk from the factory
		//does the connectivity with db
		EntityManager em=factory.createEntityManager();
		
		//adds the data to db as row/recrd
		em.getTransaction().begin();
		em.persist(student2);
		em.getTransaction().commit();
		
		System.out.println("Record added"); 
		
		/*//Finding a entry in the db
		//we didnt put begin() and commit() bec no changes done
		Student stud=em.find(Student.class,3);
		System.out.println(stud);
		
		//updating the recrd 
		stud.setStudentScore(40);
		
		em.getTransaction().begin();
		em.merge(stud);
		em.getTransaction().commit();
		
		//removing the recrd from the db
		em.getTransaction().begin();
		em.remove(stud);
		em.getTransaction().commit();
		
		*/
		em.close();
	}

}
