package com.springFramework.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springFramework/collection/collectionConfig.xml");
		Emp emp1 = (Emp) context.getBean("Emp1");
		System.out.println(emp1);
	}
}
