package com.springFramework.Autowire.usingXML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springFramework/Autowire/usingXML/AutowireUsingXML.xml");
		Emp m = (Emp)context.getBean("Emp1");
		System.out.print(m);
		context.registerShutdownHook();
	}

}
