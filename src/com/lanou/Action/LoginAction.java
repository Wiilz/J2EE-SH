package com.lanou.Action;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.lanou.entity.Goods;
import com.lanou.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private String username;
	private String password;
	private List<User> userlist;
	private List<Goods> goodslist;
	
	@Override
	public String execute() throws Exception {
	//	System.out.println(username);
	//	System.out.println(password);
		return "success";
	}
	
	
	
	
	public String index(){
		
		Configuration configuration = new Configuration().configure();

		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
		applySettings(configuration.getProperties()).buildServiceRegistry();

		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();	
		
		String gql = " from Goods" ;
		
		Query query = session.createQuery(gql);
			
		
		goodslist = query.list();
		
	//	System.out.println(goodslist);

		
		return "success";
		
	}
	
	

	public String login(){
		
		
		Configuration configuration = new Configuration().configure();
		//然后要创建服务注册对象 (Hibernate4增加的接口必须通过注册后才能生效)
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
		applySettings(configuration.getProperties()).buildServiceRegistry();
		//创建会话工厂对象
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();	
		
		String hql = " from User where username = '"+username+"'" ;
		
		Query query = session.createQuery(hql);
			
		
		List<User>  userlist = query.list();

	
		
		if (userlist.size()!=0) {
			
			if (userlist.get(0).getPassword().equals(password)) {
				
			  return "success";			  
				
			}
			this.addFieldError("loginError", "该用户密码不正确");
			return "error";
			
		}
		this.addFieldError("loginError","您输入的用户名不存在");
		return "error";
		
		}
		
	
		
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	public List<Goods> getGoodslist() {
		return goodslist;
	}

	public void setGoodslist(List<Goods> goodslist) {
		this.goodslist = goodslist;
	}

	@Override
	public String toString() {
		return "LoginAction [username=" + username + ", password=" + password + ", userlist=" + userlist
				+ ", goodslist=" + goodslist + "]";
	}
	
	
	
	
	

}
