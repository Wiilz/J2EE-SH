package com.lanou.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.lanou.entity.User;

public class hibernatetest {

	private Session session;
	private Transaction transaction;
	
	@Before
	public void first(){
		
		System.out.println("我是先执行的");
		
		//首先我们要创建配置对象
		Configuration configuration = new Configuration().configure();
		//然后要创建服务注册对象 (Hibernate4增加的接口必须通过注册后才能生效)
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
		applySettings(configuration.getProperties()).buildServiceRegistry();
		//创建会话工厂对象
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		session = sessionFactory.openSession();
		transaction=session.beginTransaction();	
	}
	
	

	@Test
	public void savetest(){
		//实例化对象
		User aaa = new User();
		
		aaa.setName("abb");
		aaa.setPassword("222");
		//使用增删改方法的时候必须要配合我们的事物才能真正的向数据库中操作数据
		session.save(aaa);
		
		transaction.commit();
		session.close();
	}


	
	@Test
	public void test01(){
		System.out.println("我是test中要执行的");
				
	
		//使用查询方法将查询到的数据存入我们设置的持久化类中
		User abc =(User) session.get(User.class, 1);
		
		System.out.println(abc.getName());
		
	}
	
	
	/*
	@Test
	public void findMore(){
		
		String hql = "from user ";
		
		Query query = session.createQuery(hql);
	
		
		
		List<User> userlist = query.list();
		
		//System.out.println(userlist);
		
		for (int i = 0; i < userlist.size(); i++) {
			
				
			System.out.println("我是第"+(i+1)+"个人 叫做"+userlist.get(i).getName());
			System.out.println("我是第"+(i+1)+"个人 的密码"+userlist.get(i).getPassword());
		
			System.out.println("---------------------");
		}
		
		
		
	}
	*/
}
