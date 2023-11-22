package com.capgemini.courseApi.top;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
    @RequestMapping("/top")
	public List<Topic> getAllTopics() {
		return  topicService.getAllTopics();
	}

    @RequestMapping("/top/{id}")
    public Topic getTopic(@PathVariable String id) {
    	return topicService.getTopic(id);
    }
}
