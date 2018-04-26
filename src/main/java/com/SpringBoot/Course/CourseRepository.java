package com.SpringBoot.Course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
//Here <Topic is the entity class and String is the PK>
}
