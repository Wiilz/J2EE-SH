package com.lanou.entity;

public class Goods {

	private int g_id;
	private String g_name;
	private int g_price;
	private String g_img;

	
	
	
	
	public void Goods(){
		
				
	}




	public int getG_id() {
		return g_id;
	}




	public void setG_id(int g_id) {
		this.g_id = g_id;
	}




	public String getG_name() {
		return g_name;
	}




	public void setG_name(String g_name) {
		this.g_name = g_name;
	}




	public int getG_price() {
		return g_price;
	}




	public void setG_price(int g_price) {
		this.g_price = g_price;
	}




	public String getG_img() {
		return g_img;
	}




	public void setG_img(String g_img) {
		this.g_img = g_img;
	}




	@Override
	public String toString() {
		return "Goods [g_id=" + g_id + ", g_name=" + g_name + ", g_price=" + g_price + ", g_img=" + g_img + "]";
	}
	
	
	
	
	
	
	
}
