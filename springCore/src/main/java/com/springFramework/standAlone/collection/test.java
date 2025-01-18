package com.springFramework.standAlone.collection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springFramework/standAlone/collection/standAloneCollectionConfig.xml");
		person p = context.getBean("class1", person.class);
		System.out.println(p);
		System.out.println("=============================================================");
		System.out.println(p.getFriends());
		System.out.println(p.getFriends().getClass().getName());
		System.out.println("=============================================================");
		System.out.println(p.getFeeStructure());
		System.out.println(p.getFeeStructure().getClass().getName());
		System.out.println("=============================================================");
		System.out.println(p.getProperties());
		System.out.println(p.getProperties().getClass().getName());
		context.registerShutdownHook();
	}
}
