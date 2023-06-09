package com.hibernatedemo.main;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.pojo.Product;

public class UpdateMainHQL {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id of product to be update : ");
		int pid = scanner.nextInt();
		
		System.out.println("Enter new name of product : ");
		String nm = scanner.next();
		
		System.out.println("Enter new price of product : ");
		int prc = scanner.nextInt();
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf =  config.buildSessionFactory();
       
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Query q = s.createQuery("Update Product p SET p.productName = :name ,"
				+ " p.productPrice = :price WHERE productId = :id");
		
		q.setParameter("name", nm);
		q.setParameter("price", prc);
		q.setParameter("id", pid);
		
		int count = q.executeUpdate();
		tr.commit();
		
		if(count > 0) {
			System.out.println("Prouct updated");
		}
		else {
			System.out.println("no such product found or updation failed");
		}
		
		sf.close();
			
		
	}

}
