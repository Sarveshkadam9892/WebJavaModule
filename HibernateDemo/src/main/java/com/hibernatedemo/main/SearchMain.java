package com.hibernatedemo.main;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.pojo.Product;

public class SearchMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id of product to search : ");
		int pid = scanner.nextInt();
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf =  config.buildSessionFactory();
       
		Session s = sf.openSession();
		
		Product product = (Product) s.get(Product.class, pid);
		
		if(product != null)
			System.out.println(product);
		else
			System.out.println("no such product found");
		
		sf.close();
			
		
	}

}
