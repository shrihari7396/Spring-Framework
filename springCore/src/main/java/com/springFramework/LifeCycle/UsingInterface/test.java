package com.springFramework.LifeCycle.UsingInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springFramework/LifeCycle/UsingInterface/LifeCycleUsingInterfaceConfig.xml");
		Pepsi pepsi = (Pepsi) context.getBean("p1");
		System.out.println(pepsi);
		context.registerShutdownHook();
	}
}
