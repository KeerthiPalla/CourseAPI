package com.SpringBoot.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicrepository;
	
public List<Topic> getAllTopics(){
	//return topics;
	List<Topic> topics= new ArrayList<>();
	topicrepository.findAll()
	.forEach(topics::add); //Method reference in lambda expressions
	return topics;
	
}
	
public Optional<Topic> getTopic(String id) {
	
	return topicrepository.findById(id);
}

public void addTopic(Topic topic) {
	topicrepository.save(topic);
	
}


public void deleteTopic(String id, Topic topic) {
	topicrepository.deleteById(id);
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


