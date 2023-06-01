package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
	
import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements CoursesService {

	List<Course> list;
	
	public CourseServiceImpl() {
	list = new ArrayList< >();
	list.add(new Course(1,"java","Spring book"));
	list.add(new Course(2,"boot","Rest book"));
	}
	
	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course course : list) {
			if (course.getId()== courseId)
				c=course;
			break;
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return null;
	}

	@Override
	public Course deleteCourse(long courseId) {
		list.remove(courseId);
		return null;
	}
	

}
