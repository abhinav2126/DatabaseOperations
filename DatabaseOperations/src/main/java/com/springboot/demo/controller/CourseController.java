package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.Course;
import com.springboot.demo.services.ICoursesService;



@RestController
public class CourseController {
	
	@Autowired
	ICoursesService courseService;

	@GetMapping("/courses")
	public List<Course> getAllCourses()
	{
		System.out.println("is it working");
		List<Course> l=this.courseService.getAllCourses();
		for(Course c:l)
		{
			System.out.println(c.toString());
		}
		return l;
	}
	
	@GetMapping("courses/{courseId}")
	public Course getCourse(@PathVariable long courseId)
	{
		return this.courseService.getCourse(courseId);
	}
	
	
	@PostMapping("/courses")
	public void addCourses(@RequestBody Course course)
	{
		this.courseService.addCourse(course);
	}
	
	@DeleteMapping("courses/{courseId}")
	public void deleteCourse(@PathVariable long courseId)
	{
		this.courseService.deleteCourse(courseId);
	}
	
	@PutMapping("courses")
	public void updateCourse(@RequestBody Course course)
	{
		this.courseService.updateCourse(course);
	}
	
}
