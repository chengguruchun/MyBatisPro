package com.cheng.mappers;

import com.cheng.model.Student;

public interface StudentMapper {

	public int add(Student student);
	public int update1(Student student);
	public int delete(Integer id);
	public Student findById(Integer id);
	
}
