package com.spring.jdbc.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.Entites.Student;

@Component("student")
public class StudentDaoImplement implements StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public StudentDaoImplement(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	public StudentDaoImplement() {
		super();
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int insert(Student s) {
		String query = "insert into student(id, name, city) values (?, ? , ?)";
		int update = this.jdbcTemplate.update(query, s.getId(), s.getName(), s.getCity());
		return update;
	}

	@Override
	public int showAll() {
		
		return 0;
	}

	@Override
	public int Update(Student s) {
		String Query = "update student set name=? , city=? where id=?";
		int update = this.jdbcTemplate.update(Query, s.getName(), s.getCity(), s.getId());
		return update;
	}

	@Override
	public int Delete(int id) {
		String Query = "delete from student where id=?";
		int deleted = this.jdbcTemplate.update(Query, id);
		return deleted;
	}

	@Override
	public Student getStudent(int id) {
		String Query = "Select * from Student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImplementation();
		Student student = this.jdbcTemplate.queryForObject(Query, rowMapper, id);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		// Give all Students in the list
		String Query = "Select*from student";
		List<Student> all = this.jdbcTemplate.query(Query, new RowMapperImplementation());
		return all;
	}
}
