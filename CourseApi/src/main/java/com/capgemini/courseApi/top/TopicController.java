package com.capgemini.courseApi.top;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(method=RequestMethod.POST,value="/top")
    public void addTopic(@RequestBody Topic topic) {
    	topicService.addTopic(topic);
    
    }
    @RequestMapping(method=RequestMethod.PUT,value="/top/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
    	topicService.updateTopic(id,topic);
    
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/top/{id}")
    public void deleteTopic(@PathVariable String id){
    	topicService.deleteTopic(id);
    
    }
}
