package com.lti.demo;

import java.util.ArrayList;
import java.util.List;

public class ProdService {

	List<Product> prodList = new ArrayList<Product>();
	
	public String addProduct(Product p)
	{
		prodList.add(p);
		return "prod added";
	}
}
