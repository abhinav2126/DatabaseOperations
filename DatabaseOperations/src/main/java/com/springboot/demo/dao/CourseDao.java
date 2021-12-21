package com.springboot.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long> {
	
	

}
