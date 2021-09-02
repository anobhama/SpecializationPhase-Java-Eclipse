package com.lti.entity;

import javax.persistence.*;


/*
* @NamedQueries(value= {
@NamedQuery(name= "findEmployees", query="from Employee e"),
@NamedQuery(name= "findEmployeeById", query="from Employee e where e.id = :id")
})
*/

@Entity
@Table(name = "empjpql")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private double salary;
	private String deg;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int eid, String ename, double salary, String deg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}

	public Employee() {
		super();
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	@Override
	public String toString() {
		return "\n Employee \n [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + "]";
	}
	
}
