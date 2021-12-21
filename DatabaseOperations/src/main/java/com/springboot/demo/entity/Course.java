package com.springboot.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	long courseId;
	
	String courseName;
	
	String coursetimeSpan;
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCoursetimeSpan() {
		return coursetimeSpan;
	}
	public void setCoursetimeSpan(String coursetimeSpan) {
		this.coursetimeSpan = coursetimeSpan;
	}
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public Course(long courseId, String courseName, String coursetimeSpan) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursetimeSpan = coursetimeSpan;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
