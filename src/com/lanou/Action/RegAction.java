package com.lanou.Action;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.lanou.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegAction extends ActionSupport{
	
	
	private String username;
	private String password;
	private List<User> userlist;
	
	@Override
	public String execute() throws Exception {
	
		return "success";
	}

	
	public String reg() {
		
		
		//��������Ҫ�������ö���
		Configuration configuration = new Configuration().configure();
		//Ȼ��Ҫ��������ע����� (Hibernate4���ӵĽӿڱ���ͨ��ע��������Ч)
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
		applySettings(configuration.getProperties()).buildServiceRegistry();
		//�����Ự��������
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		Transaction	transaction=session.beginTransaction();	
		
		//��֤�û����Ƿ����
		String hql = " from User where username = '"+username+"'" ;		
		Query query = session.createQuery(hql);
					
		List<User>  userlist = query.list();
		
		
		if (userlist.size()==0){
				
			User reg = new User();			
			reg.setName(username);
			reg.setPassword(password);			
			session.save(reg);
			
			transaction.commit();
			session.close();
			
			
			return "success";
							
		}	else
			
			return  "error";
		
	
	
		
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


	@Override
	public String toString() {
		return "RegAction [username=" + username + ", password=" + password + ", userlist=" + userlist + "]";
	}
	
	
	
	
	
	
	
	
	
}
