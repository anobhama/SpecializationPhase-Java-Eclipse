package com.lti.entity;

import java.util.Iterator;
import java.util.List;

public class Employee {
	
	private int empId;
	private String empName;
	
	private List<String> phoneNos;
	
	//calling address class here
	private Address address;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	
	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	
	public Employee(int empId, String empName, List<String> phoneNos, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.phoneNos = phoneNos;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public List<String> getPhoneNos() {
		return phoneNos;
	}

	public void setPhoneNos(List<String> phoneNos) {
		this.phoneNos = phoneNos;
	}

	public void displayNos()
	{
		Iterator<String> itr=phoneNos.iterator();
		while (itr.hasNext()) {
			
			 System.out.println(itr.next());
			
		}
	}
	
	@Override
	public String toString() {
		return "Employee \n [empId=" + empId + ", empName=" + empName + ", phoneNos=" + phoneNos + ", address=" + address
				+ "]";
	
	
	}



	
	

}
