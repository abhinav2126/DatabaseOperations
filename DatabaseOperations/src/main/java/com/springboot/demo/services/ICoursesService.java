package com.springboot.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.demo.entity.Course;

@Service
public interface ICoursesService {
	
	List<Course> getAllCourses();
	Course getCourse(long courseId);
	void addCourse(Course course);
	void deleteCourse(long courseId);
	void updateCourse(Course courseReq);

}
