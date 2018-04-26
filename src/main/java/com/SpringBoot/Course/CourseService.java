package com.SpringBoot.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courserepository;
	
public List<Course> getAllCourses(){
	//return topics;
	List<Course> courses= new ArrayList<>();
	courserepository.findAll()
	.forEach(courses::add); //Method reference in lambda expressions
	return courses;
	
}
	
public Optional<Course> getCourse(String id) {
	
	return courserepository.findById(id);
}

public void addCourse(Course course) {
	courserepository.save(course);
	
}


public void deleteCourse(String id, Course course) {
	courserepository.deleteById(id);
}



/*public void updateTopic(String id, Topic topic) {

for(int i=0; i<topics.size(); i++) {
	Topic t= topics.get(i);
	if(t.getId().equals(id)) {
		topics.set(i, topic);
		return;		
	}
	
	  return topics.stream().filter(t->t.getId().equals(id))
  .map(t->topics.set(topics.indexOf(t), topic))
  .collect(Collectors.toList());﻿ */
		
}


