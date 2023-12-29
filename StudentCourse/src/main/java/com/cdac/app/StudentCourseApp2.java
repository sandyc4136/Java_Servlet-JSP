
package com.cdac.app;

import java.time.LocalDate;

import com.cdac.dao.GenericDao;
import com.cdac.entity.TwoOneToMany.Course2;
import com.cdac.entity.TwoOneToMany.Enrolment;
import com.cdac.entity.TwoOneToMany.Student;



public class StudentCourseApp2 {

	public static void main(String[] args) {
		GenericDao dao = new GenericDao();
		
		//adding a course
		Course2 course = new Course2();
		course.setName("Python");
		course.setDuration(60);
		course.setFees(7000);
		dao.save(course);
		
		//adding a student
		/*Student student = new Student();
		student.setName("Neha");
		student.setEmail("neha@gmail.com");
		student.setMobileNumber(98765);
		dao.save(student);*/
		
		//linking student with course
	/*	Student student = (Student) dao.fetchById(Student.class, 1);
		Course2 course = (Course2) dao.fetchById(Course2.class, 2);
		Enrolment enrolment = new Enrolment();
		enrolment.setCourse(course);
		enrolment.setStudent(student);
		enrolment.setEnrolmentDate(LocalDate.now());
		dao.save(enrolment); */
	}
}