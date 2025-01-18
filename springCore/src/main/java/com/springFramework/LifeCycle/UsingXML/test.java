package com.springFramework.LifeCycle.UsingXML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springFramework/LifeCycle/UsingXML/LifeCycleUsingXMLConfig.xml");
		Samosa s1 = (Samosa)context.getBean("s1");
		System.out.println(s1);
		// Registring Shutdown hook
		context.registerShutdownHook();
	}
}
