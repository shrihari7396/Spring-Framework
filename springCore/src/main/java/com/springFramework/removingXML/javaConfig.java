package com.springFramework.removingXML;

//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springFramework.removingXML") This is only used when we uses component annotations to the class for the autowireing
public class javaConfig {
	
	@Bean
	public Samosa getSamosa() {
		Samosa samo = new Samosa();
		return samo;
	}
	
	@Bean
//	@Qualifier("")
	public Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	}
}
