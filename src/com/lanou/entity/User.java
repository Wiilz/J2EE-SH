package com.lanou.entity;

 
//�־û���  
public class User {
	
	private int uid;	
	private String name;	
	private String password;

	
	
		

	public User() {
		
		
	}




	public int getUid() {
		return uid;
	}




	public void setUid(int uid) {
		this.uid = uid;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", password=" + password + "]";
	}




	

}
