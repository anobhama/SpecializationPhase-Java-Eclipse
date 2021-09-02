package com.lti.user;

import java.util.List;

import com.lti.dao.CustomerDao;
import com.lti.dao.CustomerDaoImpl;
import com.lti.entity.Customer;

public class UserApp {

	public static void main(String[] args) {
		
		//CustomerDao dao= new CustomerDaoImpl();

/*		Customer cus1=dao.getCustomerDetails(101);
		System.out.println(cus1);
		System.out.println(cus1.getSchemes()); 
		
		// get customers from schemes
				Scheme scheme=dao.getSchemeDetails(1);
				System.out.println(scheme);
				System.out.println(scheme.getCustList()); */
				
				
				CustomerDao dao1 = new CustomerDaoImpl();
				List<Customer> custList = dao1.getCustList();
				System.out.println(custList);
				System.out.println("No of records : " +custList.size());
		
	}
}
