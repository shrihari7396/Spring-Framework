package com.springFramework.ref;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springFramework/ref/refConfig.xml");
		A a = (A) context.getBean("aref");
		System.out.println(a);
		context.registerShutdownHook();
	}
}
