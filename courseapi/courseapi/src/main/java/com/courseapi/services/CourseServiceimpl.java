package com.courseapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapi.controller.entities.Course;
import com.courseapi.daolayer.CourseDao;


@Service
public class CourseServiceimpl implements CourseService {
	
    @Autowired
    public CourseDao coursedao;
	public CourseServiceimpl() {
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return coursedao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		return coursedao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		coursedao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		coursedao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		Course entity = coursedao.getOne(parseLong);
		coursedao.delete(entity);
		
	 }

}
