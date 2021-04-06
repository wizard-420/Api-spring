package com.courseapi.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseapi.controller.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
