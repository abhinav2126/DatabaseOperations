package com.springboot.demo.services;

import java.util.ArrayList;

import com.springboot.demo.dao.CourseDao;
import com.springboot.demo.entity.Course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements ICoursesService {

	@Autowired
	CourseDao courseDao; 
	
	public CourseService() {
	}

	@Override
	public List<Course> getAllCourses() {
		return this.courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		return this.courseDao.getOne(courseId);
	}

	@Override
	public void addCourse(Course course) {
 		this.courseDao.save(course);
	}

	@Override
	public void updateCourse(Course course) {
		
		this.courseDao.save(course);
	}

	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		Course course=this.courseDao.getOne(courseId);
		this.courseDao.delete(course);
	}
}
