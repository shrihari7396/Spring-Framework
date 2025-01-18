package com.spring.jdbc.Autowireing;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.Dao.StudentDaoImplement;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.Dao"})
public class javaConfigClass {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("8999617581@Sh");
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
