package com.hibernatedemo.main;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernatedemo.pojo.Product;

public class SearchMainCriteria {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id of product to search : ");
		int pid = scanner.nextInt();
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
	 	SessionFactory sf =  config.buildSessionFactory();
       
		Session s = sf.openSession();
		
		Criteria cr = s.createCriteria(Product.class);
		cr.add(Restrictions.eq("productId",pid));

		
		List<Product> lst = cr.list();
		
		if(lst.size() > 0)
			System.out.println(lst.get(0));
		else
			System.out.println("no such product found");
		
		sf.close();
			
		
	}

}
