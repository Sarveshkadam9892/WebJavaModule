package com.hibernatedemo.main;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.pojo.Product;

public class UpdateMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id of product to be update : ");
		int pid = scanner.nextInt();
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf =  config.buildSessionFactory();
       
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Product product = (Product) s.get(Product.class, pid);
		
		if(product != null) {
			
			System.out.println("Enter new name of product : ");
			String nm = scanner.next();
			
			System.out.println("Enter new price of product : ");
			int prc = scanner.nextInt();
			
			product.setProductName(nm);
			product.setProductPrice(prc);
			
			s.update(product);
			tr.commit();
			System.out.println("product updated");
		}
		else
			System.out.println("no such product found");
		
		sf.close();
			
		
	}

}
