package com.springFramework.removingXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
		System.out.println("Shrihari");
		Student stud = context.getBean("getStudent", Student.class);
		System.out.println(stud);
		context.close();
		return;
	}

}
