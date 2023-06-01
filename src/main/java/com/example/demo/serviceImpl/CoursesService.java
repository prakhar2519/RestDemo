package com.example.demo.serviceImpl;

import java.util.List;



import com.example.demo.entities.Course;


public interface CoursesService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course deleteCourse(long courseId);
    public Course updateCourse(Course course); 
}
