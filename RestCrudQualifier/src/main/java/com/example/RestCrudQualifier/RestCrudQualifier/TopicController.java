package com.example.RestCrudQualifier.RestCrudQualifier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	@Qualifier("Secound")
	Topicservice topic;
    
	
	@GetMapping("/topics")
	List<Topic> getAlltopics(){
		
	return topic.getAllTopics();
	}	
}
