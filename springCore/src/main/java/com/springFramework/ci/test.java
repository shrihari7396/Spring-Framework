package com.springFramework.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springFramework/ci/ciConfig.xml");
		Addtion p= context.getBean("addition1",Addtion.class);
		System.out.println(p);
	}
}
