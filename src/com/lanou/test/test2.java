package com.lanou.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import com.lanou.entity.Goods;

public class test2 {
	
	private List<Goods> goodslist;
	
	
	
	
	
	
	
	@Test
	
	public void test2() throws HibernateException {
		
		Configuration configuration = new Configuration().configure();

		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
		applySettings(configuration.getProperties()).buildServiceRegistry();

		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();	
		
		String gql = " from Goods" ;
		
		Query query = session.createQuery(gql);
			
					
		
		//   Session	session = HibernateUtils.getSession();

		    Query query = session.createQuery("from Goods");
		    query.setFirstResult(0);//从第一条记录开始
		    query.setMaxResults(3);//取出四条记录
		List<Goods>    goodslist = query.list();
		
		
      	System.out.println(goodslist);
		
		
	}







	public List<Goods> getGoodslist() {
		return goodslist;
	}







	public void setGoodslist(List<Goods> goodslist) {
		this.goodslist = goodslist;
	}
	

	
	
	
	
}
