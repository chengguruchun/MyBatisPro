package com.cheng.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.cheng.mappers.StudentMapper;
import com.cheng.model.Student;
import com.cheng.util.SqlSessionFactoryUtil;

public class StudentTest {

	private static Logger logger = Logger.getLogger(StudentTest.class);
	
	@Test
	public void testAdd() {
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		StudentMapper studentMapper1 = sqlSession.getMapper(StudentMapper.class);
		Student student = new Student("李四",319);
		studentMapper1.add(student);
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void testUpdate() {
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		Student student = new Student("李四", 400);
		mapper.update1(student);
		sqlSession.commit();
		sqlSession.close();
	}
	
}
