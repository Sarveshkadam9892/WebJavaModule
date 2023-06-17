package com.onetomanydemo.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.onetomanydemo.pojo.Customer;
import com.onetomanydemo.pojo.Order;


public class InnerJoinDemo {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		ServiceRegistry sr = new StandardServiceRegistryBuilder().
				applySettings(config.getProperties()).build();
		
		SessionFactory sf = config.buildSessionFactory(sr);
		
		Session s = sf.openSession(); 
		
		
		Query q = s.createQuery("SELECT DISTINCT c FROM Customer c INNER JOIN"
				+ " c.orders");
		
		List<Customer> lst = q.list();
		
		for(Customer c : lst) {
			System.out.println(c.getCustomerId() + " : " 
					+ c.getCustomerName());
			
			Set<Order> oset = c.getOrders();
			
			if(oset.size()>0) {
				oset.forEach(System.out::println);
			}
		}
		
		
		sf.close();
		
	}

}
