package com.spring.orm.springorm;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.springorm.Dao.studentDao;
import com.spring.orm.springorm.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/spring/orm/springorm/config.xml");
    	studentDao studentDao = context.getBean("studentDao", studentDao.class);
    	Student student = new Student();
    	student.setCity("Omerga");
    	student.setId(1);
    	student.setName("Shrihari");
    	int r = studentDao.insert(student);
    	System.out.println( "Done"+r );
    }
}
