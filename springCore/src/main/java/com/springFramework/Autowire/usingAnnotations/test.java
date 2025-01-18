package com.springFramework.Autowire.usingAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springFramework/Autowire/usingAnnotations/AutowireUsingAnnotations.xml");
		Emp m=context.getBean("Emp1", Emp.class);
		System.out.println(m);
		context.registerShutdownHook();
	}

}
