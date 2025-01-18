package com.springFramework.LifeCycle.UsingAnnotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class WadaPav {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "WadaPav [price=" + price + "]";
	}

	public WadaPav(double price) {
		super();
		this.price = price;
	}

	public WadaPav() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void Start() {
		System.out.println("Inside Init Function");
	}

	@PreDestroy
	public void End() {
		System.out.println("Inside Destory Function");
	}
}
