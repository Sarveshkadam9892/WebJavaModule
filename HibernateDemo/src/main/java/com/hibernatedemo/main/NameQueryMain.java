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

public class NameQueryMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
	 	SessionFactory sf =  config.buildSessionFactory();
       
		Session s = sf.openSession();
		
		Query q = s.getNamedQuery("myquery");
	
		List<Product> lst = q.list();
		
		if(lst.size() > 0)
			lst.forEach(System.out::println);
		else
			System.out.println("no such product found");
		
		sf.close();
			
		
	}

}
