package com.springFramework.LifeCycle.UsingAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springFramework/LifeCycle/UsingAnnotations/LifeCycleUsingAnnotationsConfig.xml");
		WadaPav pav= (WadaPav) context.getBean("w1");
		System.out.println(pav);
		context.registerShutdownHook();
	}
}
