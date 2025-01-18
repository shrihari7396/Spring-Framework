package com.springFramework.springCore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springFramework/springCore/config.xml");
		Student s1 = (Student) context.getBean("student1");
		System.out.println(s1);
		context.registerShutdownHook();
	}
}
