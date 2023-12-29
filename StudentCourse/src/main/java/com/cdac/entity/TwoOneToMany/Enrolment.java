package com.cdac.entity.TwoOneToMany;

import java.time.LocalDate;

import javax.persistence.*;

@Entity(name = "Enrolment2")
@Table(name = "tbl_enrolment_2")
public class Enrolment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course2 course;
	
	private LocalDate enrolmentDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course2 getCourse() {
		return course;
	}

	public void setCourse(Course2 course) {
		this.course = course;
	}

	public LocalDate getEnrolmentDate() {
		return enrolmentDate;
	}

	public void setEnrolmentDate(LocalDate enrolmentDate) {
		this.enrolmentDate = enrolmentDate;
	}
}
