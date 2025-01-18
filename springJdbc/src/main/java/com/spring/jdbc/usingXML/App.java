package com.spring.jdbc.usingXML;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.Entites.Student;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = 
    			new ClassPathXmlApplicationContext("com/spring/jdbc/usingXML/config.xml");
    	
    	JdbcTemplate jdbc = context.getBean("jdbc",JdbcTemplate.class);
        StudentDao studentDaoImplement = context.getBean("student", StudentDao.class);

        // insert Query
//    	String query = "insert into student(id, name, city) values (?, ? , ?)";
        // Fire Query
//    	int result = jdbc.update(query, 3,"Avadhut", "Omerga");
//    	System.out.println(result);
    	
    	// Update Operations
//    	Student s=new Student();
//    	s.setId(6);
//    	s.setName("Ravan");
//    	s.setCity("Lanka");
//    	int change = studentDaoImplement.Update(s);
//    	System.out.println(change);
        
        // Delete Operations
//        int update=studentDaoImplement.Delete(6);
//        System.out.println(update);
        
        // Getting a object from the database
        List<Student> student = studentDaoImplement.getAllStudent();
        System.out.println(student);
    }
}
