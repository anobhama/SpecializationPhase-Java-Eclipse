package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.lti.dbutil.DBUtil;
import com.lti.entity.Customer;
import com.lti.entity.Scheme;
public class CustomerDaoImpl implements CustomerDao {
	
	private EntityManager manager;
	private DBUtil factory;
	
	public CustomerDaoImpl()
	{
		factory = new DBUtil();  
		manager = factory.getManager(); 
	}
	
	
	
	@Override
	public Customer getCustomerDetails(int custId) {
		manager.getTransaction().begin();
		Customer cust = manager.find(Customer.class, custId);
		manager.getTransaction().commit();
		return cust;
	}
	
	@Override
	public Scheme getSchemeDetails(int schemeId) {
		Scheme scheme = manager.find(Scheme.class, schemeId);
		return scheme;
	}
	
	@Override
	public List<Customer> getCustList() {
		Query qry = manager.createQuery("from Customer");
		//qry.setFirstResult(0);
		//qry.setMaxResults(1);
		return qry.getResultList();
	}	
}
