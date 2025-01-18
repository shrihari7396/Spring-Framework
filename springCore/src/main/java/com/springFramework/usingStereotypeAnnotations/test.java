package com.springFramework.usingStereotypeAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springFramework/usingStereotypeAnnotations/sterotypeAnnotations.xml");
		Student s=context.getBean("student", Student.class);
		System.out.println(s.hashCode());
		Student s1=context.getBean("student", Student.class);
		System.out.println(s1.hashCode());
		context.registerShutdownHook();
	}

}
