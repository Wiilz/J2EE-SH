package com.lanou.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lanou.entity.User;

public class test1 {

private Session session;
private Transaction transaction;
	
	@Before
	public void first(){
		System.out.println("我是before");
		
		Configuration configuration = new Configuration().configure();
		
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
				applySettings(configuration.getProperties()).buildServiceRegistry();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		session = sessionFactory.openSession();
		
		transaction = session.beginTransaction();
	}
	
	@Test
	public void test1(){
		User lck = (User) session.get(User.class, 3);
		
		System.out.println(lck);
		
	}
	
	@Test
	public void savetest(){
	
		User lck =new User();
		lck.setName("lck");
		lck.setPwd("321");
		
		session.save(lck);
		
		transaction.commit();
		session.close();
		
	}
	
	
	
	
	@After
	public void destory(){
		System.out.println("我是after");
	}
	
	
	
}
