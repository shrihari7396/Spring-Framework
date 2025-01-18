package com.spring.jdbc.withoutUsingXML;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.Dao.StudentDaoImplement;

@Configuration
public class javaConfigClass {

	@Bean("ds")
	public DataSource getDataSource() {
		DataSource ds = new DriverManagerDataSource();
		((DriverManagerDataSource) ds).setDriverClassName("com.mysql.cj.jdbc.Driver");
		((AbstractDriverBasedDataSource) ds).setUrl("jdbc:mysql://localhost:3306/springjdbc");
		((AbstractDriverBasedDataSource) ds).setUsername("root");
		((AbstractDriverBasedDataSource) ds).setPassword("8999617581@Sh");
		return  ds;
	}

	@Bean("jdbc")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbc = new JdbcTemplate();
		jdbc.setDataSource(getDataSource());
		return jdbc;
	}

	@Bean("student")
	public StudentDao getStudentDao() {
		StudentDaoImplement student = new StudentDaoImplement();
		student.setJdbcTemplate(getTemplate());
		return student;
	}	
}
