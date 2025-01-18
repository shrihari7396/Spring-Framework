package com.springFramework.ref;

public class A {
	private int n;
	private B b;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(int n, B b) {
		super();
		this.n = n;
		this.b = b;
	}
	@Override
	public String toString() {
		return "A [n=" + n + ", b=" + b + "]";
	}
}
