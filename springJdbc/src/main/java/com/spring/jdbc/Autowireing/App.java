package com.spring.jdbc.Autowireing;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.Entites.Student;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(javaConfigClass.class);
		JdbcTemplate jdbc = context.getBean("jdbc",JdbcTemplate.class);
	    StudentDao studentDaoImplement = context.getBean("student", StudentDao.class);
	    List<Student> student = studentDaoImplement.getAllStudent();
	    System.out.println(student);
	    System.out.println("hi");
	}

}