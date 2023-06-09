package com.hibernatedemo.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.pojo.Product;

public class InsertMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf =  config.buildSessionFactory();
       
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Product prd = new Product();
		prd.setProductName("sneakers");
		prd.setProductPrice(2500);
		
		s.save(prd);
		
		//s.persist(prd);
		
		tr.commit();
		System.out.println("Product saved in the table");
		
		sf.close();
			
		
	}

}
