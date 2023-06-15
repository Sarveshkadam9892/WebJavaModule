package com.onetoonedemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoonedemo.pojo.Account;
import com.onetoonedemo.pojo.Employee;


public class AppMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpId(1233);
		emp.setEmpName("Sarvesh");
		
		Account acct = new Account();
		acct.setAccId(4566);
		acct.setAccNum("ACCTO12345");
		
		emp.setAccount(acct);
		acct.setEmployee(emp);
		
		s.save(acct);
		s.save(emp);

		tr.commit();
		
		System.out.println("objects saved");
		
		sf.close();
		
	}

}
