package com.hibernatedemo.main;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.pojo.Product;

public class SearchMainHQL {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id of product to search : ");
		int pid = scanner.nextInt();
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
	 	SessionFactory sf =  config.buildSessionFactory();
       
		Session s = sf.openSession();
		
		Query q = s.createQuery("FROM Product p Where p.productId = :id");
		q.setParameter("id",pid);
		
		List<Product> lst = q.list();
		
		if(lst.size() > 0)
			System.out.println(lst.get(0));
		else
			System.out.println("no such product found");
		
		sf.close();
			
		
	}

}
