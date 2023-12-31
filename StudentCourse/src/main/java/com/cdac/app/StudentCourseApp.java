package com.cdac.app;

import java.util.ArrayList;
import java.util.List;

import com.cdac.dao.GenericDao;
import com.cdac.entity.Course;
import com.cdac.entity.Student;

public class StudentCourseApp {

	
	public static void main(String[] args) {
		GenericDao dao = new GenericDao();
		
		//adding a course
//		Course course = new Course();
//		course.setName("React");
//		course.setDuration(30);
//		course.setFees(5000);
//		dao.save(course);
		
		//adding a student
//		Student student = new Student();
//		student.setName("Smriti");
//		student.setEmail("smriti@gmail.com");
//		student.setMobileNumber(7452483);
//		dao.save(student);
		
		//linking student with course
		Student student = (Student) dao.fetchById(Student.class, 3);
		Course course = (Course) dao.fetchById(Course.class, 1);
//		List<Course> courses = new ArrayList<>();
//		courses.add(course);
//		student.setCourses(courses);
		student.getCourses().add(course);
		dao.save(student);
	}
}
