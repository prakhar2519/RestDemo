package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.serviceImpl.CoursesService;

@RestController
public class Mycontroller {
	
	@Autowired
	private CoursesService coursesService;
	
	@GetMapping("/home")
	public String home() {
	    return "new rest api";	
	} 
       // get all courses
	@GetMapping("/course")
	List<Course> getCourses(){
		return this.coursesService.getCourses() ;
	}
	// get all cousres by id 
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.coursesService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return this.coursesService.addCourse(course);
	}
	@DeleteMapping("/course/{courseId}")
	public Course deleteCourse(@PathVariable long courseId) {
		return this.coursesService.deleteCourse(courseId);
	}
}
