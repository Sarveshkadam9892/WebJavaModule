package com.hibernatedemo.main;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.pojo.Product;

public class DeleteMainHQL {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id of product to be deleted : ");
		int pid = scanner.nextInt();
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf =  config.buildSessionFactory();
       
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Query q = s.createQuery("DELETE FROM Product p WHERE p.productId = :id");
		
		q.setParameter("id", pid);
		
		int count = q.executeUpdate();
		tr.commit();
		
		if(count > 0) {
			System.out.println("Product deleted");
		}
		else {
			System.out.println("no such product found");
		}
		
		sf.close();
			
		
	}

}
