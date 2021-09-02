package com.lti.demo;

public class UserApp {

		public static void main(String[] args) {
			
			
			//for calculater
			Calci c=new Calci();
			int res=c.sum(10,20);
			System.out.println(res);
			
			//prod class
			Product p= new Product(1, "Mobile",20000);
			System.out.println(p);
			
			//service layer
			ProdService ps= new ProdService();
			String str=ps.addProduct(p);
			System.out.println(str);
			
		}


}
