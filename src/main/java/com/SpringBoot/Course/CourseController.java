package com.SpringBoot.Course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService CourseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(){
	return CourseService.getAllCourses();
	}

	@RequestMapping("/topics/{topicid}/courses/{id}")  //PathVariable is used to match string id with url id
	public Optional<Course> getCourse(@PathVariable String id) {
		return CourseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicid}/courses/{id}")
	public void addCourse(@RequestBody Course course, @PathVariable String id ) {
		CourseService.addCourse(course); 
	}
	
	/*@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id ) {
		topicService.updateTopic(id, topic); 
	}*/
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicid}/courses/{id}")
	public void deleteCourse(@RequestBody Course course, @PathVariable String id ) {
		CourseService.deleteCourse(id, course); 
	}
}
