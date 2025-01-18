package com.springFramework.ci;

public class Addtion {
	int a,b;
	
	public Addtion(String a, String b) {
		super();
		System.out.println("In String");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	
	public Addtion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Addtion(double a, double b) {
		super();
		System.out.println("In double");
		this.a = (int)a;
		this.b = (int)b;
	}
	
	public Addtion(int a, int b) {
		super();
		System.out.println("In int");
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Addtion [a=" + a + ", b=" + b + "]";
	}

}
