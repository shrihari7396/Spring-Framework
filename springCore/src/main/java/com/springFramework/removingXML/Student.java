package com.springFramework.removingXML;

//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;

//@Componen
public class Student {
	private int id;
	private String name;
	private Samosa samosa;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Student(int id, String name, Samosa samosa) {
		super();
		this.id = id;
		this.name = name;
		this.samosa = samosa;
	}
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", samosa=" + samosa + "]";
	}
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {
		System.out.println("Study Completed...");
		samosa.display();
	}
}
