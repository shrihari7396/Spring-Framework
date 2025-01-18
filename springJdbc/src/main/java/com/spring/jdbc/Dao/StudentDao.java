package com.spring.jdbc.Dao;

import java.util.List;

import com.spring.jdbc.Entites.Student;

public interface StudentDao {
	
	public int insert(Student s);
	
	public int showAll();
	
	public int Update(Student s);
	
	public int Delete(int id);

	public Student getStudent(int id);
	
	public List<Student> getAllStudent();

}
