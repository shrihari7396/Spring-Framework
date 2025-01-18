package com.springFramework.LifeCycle.UsingXML;

public class Samosa {
	private double price;
	
	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the property");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside Init function");
	}
	
	public void destroy() {
		System.out.println("Inside destroy Function");
	}
	
}
