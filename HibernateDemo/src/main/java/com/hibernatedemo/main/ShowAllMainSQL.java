package com.hibernatedemo.main;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.pojo.Product;

public class ShowAllMainSQL {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
	 	SessionFactory sf =  config.buildSessionFactory();
       
		Session s = sf.openSession();
		
		Query q = s.createSQLQuery("SELECT * FROM product");
	
		List<Object[]> lst = q.list();
		
		if(lst.size() > 0) {
			for(Object[] arr : lst) {
				for(Object obj : arr) {
					System.out.print(obj + " ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("no such product found");
		
		sf.close();
			
		
	}

}
