package com.tcs.restclient;


public class Product {
	
	
	
    private int pid;
    private String description;
    private double price;
    
    public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return this.pid +this.description+this.price;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
    
    
    
}
