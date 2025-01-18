package com.springFramework.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificate certi;
	private List<String> courses;
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Person(String name, int personId, Certificate certi, List<String> courses) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + ", courses=" + courses + "]";
	}
	

}
