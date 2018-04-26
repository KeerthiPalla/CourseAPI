package com.SpringBoot.Topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{
//Here <Topic is the entity class and String is the PK>
}
