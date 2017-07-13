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
		
		System.out.println("������ִ�е�");
		
		//��������Ҫ�������ö���
		Configuration configuration = new Configuration().configure();
		//Ȼ��Ҫ��������ע����� (Hibernate4���ӵĽӿڱ���ͨ��ע��������Ч)
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
		applySettings(configuration.getProperties()).buildServiceRegistry();
		//�����Ự��������
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		session = sessionFactory.openSession();
		transaction=session.beginTransaction();	
	}
	
	

	@Test
	public void savetest(){
		//ʵ��������
		User aaa = new User();
		
		aaa.setName("abb");
		aaa.setPassword("222");
		//ʹ����ɾ�ķ�����ʱ�����Ҫ������ǵ�������������������ݿ��в�������
		session.save(aaa);
		
		transaction.commit();
		session.close();
	}


	
	@Test
	public void test01(){
		System.out.println("����test��Ҫִ�е�");
				
	
		//ʹ�ò�ѯ��������ѯ�������ݴ����������õĳ־û�����
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
			
				
			System.out.println("���ǵ�"+(i+1)+"���� ����"+userlist.get(i).getName());
			System.out.println("���ǵ�"+(i+1)+"���� ������"+userlist.get(i).getPassword());
		
			System.out.println("---------------------");
		}
		
		
		
	}
	*/
}
